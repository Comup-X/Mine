package com.comup.mine;


import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.content.res.TypedArray;

/**
 * Created by Mr.Xie on 2015/5/29.
 */
public class Block extends Button {

    private int indexOfX;//X坐标
    private int indexOfY;//Y坐标
    private int value;//值
    private boolean enAble;//可不可以点击

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getIndexOfX() {
        return indexOfX;
    }

    public int getIndexOfY() {
        return indexOfY;
    }

    public boolean isEnAble() {
        return enAble;
    }

    public void setEnAble(boolean enAble) {
        this.enAble = enAble;
    }

    public Block(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public Block(Context context) {
        super(context);
    }

    public Block(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.Block);
        this.indexOfX = typedArray.getInt(R.styleable.Block_indexOfX, 12);
        this.indexOfY = typedArray.getInt(R.styleable.Block_indexOfY, 12);
        typedArray.recycle();
        this.value = 0;
        this.enAble = true;
    }
}
