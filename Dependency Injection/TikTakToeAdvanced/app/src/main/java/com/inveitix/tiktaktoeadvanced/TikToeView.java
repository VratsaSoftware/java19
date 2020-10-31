package com.inveitix.tiktaktoeadvanced;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class TikToeView extends FrameLayout {

    private StateListener listener;
    private Button[] buttons;

	//Context constructor
    public TikToeView(Context context) {
        super(context);
        inflate(context, R.layout.include_tiktak, this);
        initViews();
    }

	//THis is a listener
    public void setStateListener(StateListener listener) {
        this.listener = listener;
    }

    public void setStates(List<String> states) {
        for (int i = 0; i < states.size(); i++) {
            buttons[i].setText(states.get(i));
        }
    }

    private void initViews() {
        buttons = new Button[]{
                findViewById(R.id.btn_1),
                findViewById(R.id.btn_2),
                findViewById(R.id.btn_3),
                findViewById(R.id.btn_4),
                findViewById(R.id.btn_5),
                findViewById(R.id.btn_6),
                findViewById(R.id.btn_7),
                findViewById(R.id.btn_8),
                findViewById(R.id.btn_9)
        };
        for (Button btn :
                buttons) {
            btn.setOnClickListener(getClickListener());
        }
    }

    private OnClickListener getClickListener() {
        return new OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn = ((Button) view);
                String btnText = btn.getText().toString();
                if(btnText.equals(" ") || btnText.isEmpty()) {
                    btn.setText("X");
                } else if(btnText.equals("X")) {
                    btn.setText("O");
                } else {
                    btn.setText(" ");
                }
                notifyStateChanged();
            }
        };
    }

    private void notifyStateChanged() {
        if(listener != null) {
            listener.onStateChanged(getStates());
        }
    }

    private List<String> getStates() {
        List<String> states = new ArrayList<String>();
        for (int i = 0; i < buttons.length; i++) {
            states.add(buttons[i].getText().toString());
        }
        return states;
    }

    public interface StateListener {
        void onStateChanged(List<String> states);
    }
}
