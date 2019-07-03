package com.lin.icontextview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class IconTextView extends android.support.v7.widget.AppCompatTextView {
    public IconTextView(Context context) {
        this(context,null);
    }

    public IconTextView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public IconTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init(){
        Typeface typeface = Typeface.createFromAsset(getResources().getAssets(),"iconfont.ttf");
        this.setTypeface(typeface);
    }
}
