package com.novica.connect4.button;

import android.content.Context;
import android.util.AttributeSet;

@SuppressWarnings("SuspiciousNameCombination")
public class SquareImageButton extends androidx.appcompat.widget.AppCompatImageButton {

    public SquareImageButton(Context context) {
        super(context);
    }

    public SquareImageButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareImageButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec); // This makes the height equal to the width
    }
}
