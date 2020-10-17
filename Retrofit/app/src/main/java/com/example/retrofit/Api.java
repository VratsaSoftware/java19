package com.example.retrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {
    private static Api instance;
    private final QuoteService service;

    private Api() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://programming-quotes-api.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(QuoteService.class);
    }

    public static Api getInstance() {
        if (instance == null) instance = new Api();
        return instance;
    }

    public void getRandomQuote(final ApiListener listener) {
        service.getRandomQuote().enqueue(new Callback<Quote>() {
            @Override
            public void onResponse(Call<Quote> call, Response<Quote> response) {
                if(response.isSuccessful()) {
                    listener.onQuoteReceived(response.body().getText());
                } else {
                    listener.onFailure();
                }
            }

            @Override
            public void onFailure(Call<Quote> call, Throwable t) {
                listener.onFailure();
            }
        });
    }

    public interface ApiListener {
        void onQuoteReceived(String quote);

        void onFailure();
    }

}
