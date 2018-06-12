# SelectorButton
Android library that allows you to set the background of a button relative to its state (normal, pressed or disabled) from xml markup without creating additional selectors.

## Usage sample
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
