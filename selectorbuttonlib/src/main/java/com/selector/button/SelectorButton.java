package com.selector.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;

public class SelectorButton extends Button {

    public SelectorButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs){
        TypedArray attributes = context.obtainStyledAttributes(attrs, R.styleable.SelectorButton);

        if(!this.isEnabled()){
            this.setBackgroundDrawable(attributes.getDrawable(R.styleable.SelectorButton_state_disabled));
        }else{
            if(this.isPressed()){
                this.setBackgroundDrawable(attributes.getDrawable(R.styleable.SelectorButton_state_pressed));
            } else{
                this.setBackgroundDrawable(attributes.getDrawable(R.styleable.SelectorButton_state_normal));
            }
        }

        attributes.recycle();
//        invalidate();
    }
}
