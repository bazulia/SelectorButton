# SelectorButton
Android library that allows you to set the background of a button relative to its state (normal, pressed or disabled) from xml markup without creating additional selectors.

## How to use

**Add dependencies:**
```
repositories {
    maven { url "https://jitpack.io" }
}

dependencies {
    implementation 'com.github.bazulia:SelectorButton:v1.0.2'
}
```

**Setting button states from layout**
```
<com.selector.button.SelectorButton
        android:id="@+id/button"
        android:text="Test"
        android:textColor="@android:color/white"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:state_pressed="@drawable/btn_pressed"
        app:state_normal="@drawable/btn_normal"
        app:state_disabled="@drawable/btn_disabled"/>
```

**Setting button states from class**
```
SelectorButton selectorButton = (SelectorButton) findViewById(R.id.button);
selectorButton.setStateNormalDrawable(getResources().getDrawable(R.drawable.btn_normal));
selectorButton.setStatePressedDrawable(getResources().getDrawable(R.drawable.btn_pressed));
selectorButton.setStateDisabledDrawable(getResources().getDrawable(R.drawable.btn_disabled));
```
