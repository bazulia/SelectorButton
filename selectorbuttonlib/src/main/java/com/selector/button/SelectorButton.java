package com.selector.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.Button;

public class SelectorButton extends Button {

    private Drawable stateNormalDrawable;
    private Drawable statePressedDrawable;
    private Drawable stateDisabledDrawable;

    public SelectorButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        initViews(context, attrs);
    }

    private void initViews(Context context, AttributeSet attrs) {
        initAttr(context, attrs);

        updateDrawableStates();
    }

    private void initAttr(Context context, AttributeSet attrs){
        final TypedArray attributes = context.obtainStyledAttributes(attrs, R.styleable.SelectorButton);

        if(attributes == null){
            return;
        }

        try {
            stateNormalDrawable = attributes.getDrawable(R.styleable.SelectorButton_state_normal);
            statePressedDrawable = attributes.getDrawable(R.styleable.SelectorButton_state_pressed);
            stateDisabledDrawable = attributes.getDrawable(R.styleable.SelectorButton_state_disabled);
        } finally {
            attributes.recycle();
        }
    }

    private void updateDrawableStates(){
        StateListDrawable background = new StateListDrawable();
        background.addState(new int[]{android.R.attr.state_pressed}, statePressedDrawable);
        background.addState(new int[]{-android.R.attr.state_enabled}, stateDisabledDrawable);
        background.addState(new int[]{}, stateNormalDrawable);

        setBackgroundCompat(background);
    }

    @SuppressWarnings("deprecation")
    private void setBackgroundCompat(@Nullable Drawable drawable) {
        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.JELLY_BEAN) {
            setBackgroundDrawable(drawable);
        } else {
            setBackground(drawable);
        }
    }

    public Drawable getStateNormalDrawable() {
        return stateNormalDrawable;
    }

    public Drawable getStatePressedDrawable() {
        return statePressedDrawable;
    }

    public Drawable getStateDisabledDrawable() {
        return stateDisabledDrawable;
    }

    public void setStateNormalDrawable(Drawable stateNormalDrawable) {
        this.stateNormalDrawable = stateNormalDrawable;
        updateDrawableStates();
    }

    public void setStatePressedDrawable(Drawable statePressedDrawable) {
        this.statePressedDrawable = statePressedDrawable;
        updateDrawableStates();
    }

    public void setStateDisabledDrawable(Drawable stateDisabledDrawable) {
        this.stateDisabledDrawable = stateDisabledDrawable;
        updateDrawableStates();
    }
}
