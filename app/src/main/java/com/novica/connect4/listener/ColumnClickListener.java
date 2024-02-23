package com.novica.connect4.listener;

import android.view.View;

import com.novica.connect4.GameActivity;

public class ColumnClickListener implements View.OnClickListener {

    private final int index;
    private final GameActivity activity;

    public ColumnClickListener(int index, GameActivity activity) {
        this.index = index;
        this.activity = activity;
    }

    @Override
    public void onClick(View view) {
        activity.pressedColumn(index);
    }
}
