package com.novica.connect4.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TableLayout;

@SuppressWarnings({"SuspiciousNameCombination"})
public class SquareTableLayout extends TableLayout {

    public SquareTableLayout(Context context) {
        super(context);
    }

    public SquareTableLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec); // This makes the height equal to the width
    }
}
