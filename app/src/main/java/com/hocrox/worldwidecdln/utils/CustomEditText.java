package com.hocrox.worldwidecdln.utils;

/**
 * Created by hocrox_java on 28/04/16.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.EditText;

public class CustomEditText extends EditText implements TextWatcher {

    public CustomEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public CustomEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomEditText(Context context) {
        super(context);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(),
                "fonts/font.ttf");
        setTypeface(tf);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        Log.e("before Text Changed", "text changed" + s.length());

    }

    @Override
    public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);

        Log.e("Testingggggg", "calledd>>" + text + ">>" + start + ">>>" + lengthAfter);

        if (lengthAfter == 0 && lengthBefore == 0) {


        } else {


            if (text.toString().length() == 0) {

                setError("Enter Valid Value");
                Log.e("Testingggggg", "calledd>>" + text + ">>" + start + ">>>" + lengthAfter);

            } else {

                setError(null);
            }

        }

    }


    @Override
    public void afterTextChanged(Editable s) {
        Log.e("Afte Text Changed", "text changed" + s.length());
    }

}
