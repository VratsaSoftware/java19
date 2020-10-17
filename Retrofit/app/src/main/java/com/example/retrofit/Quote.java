package com.example.retrofit;

import com.google.gson.annotations.SerializedName;

public class Quote {
    private String id;

    @SerializedName("en")
    private String text;
    private String author;

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }
}
