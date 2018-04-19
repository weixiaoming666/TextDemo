package com.example.administrator.textdemo.view.myview;

import android.content.ClipData;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import com.example.administrator.textdemo.R;

/**
 * Created by wxm on 2018/4/17.
 */
//https://love2.io/@meiritugua/doc/android-training-course-in-chinese/ui/custom-view/create-view.md
public class PieChart extends View {

    private  boolean mShowText;
    private int mTextPos;
    private OnCurrentItemChanged onCurrentItemChanged;
    private MyViewAty myViewAty = new MyViewAty();
    private Paint mTextPaint;
    private Paint mShadowPaint;
    private Paint mPiePaint;

    public PieChart(Context context) {
        super(context);
    }

    public PieChart(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
//      xml 和类的 结合
//        通过obtainStyledAttributes()来获取属性值。这个方法会传递一个TypedArray对象，
//      它是间接referenced并且styled的。
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.PieChart,
                0, 0);

        try {
            mShowText = a.getBoolean(R.styleable.PieChart_showText, false);
            mTextPos = a.getInteger(R.styleable.PieChart_labelPosition, 0);
        } finally {
            a.recycle();
//            TypedArray对象是一个共享资源，必须被在使用后进行回收。
        }
        myViewAty.nixihuanwoma("woaini");//随便写的一个方法  只是为了说明也可以这样引用
    }

    public PieChart(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public PieChart(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

//    如果你想更加精确的控制你的view的大小，需要重写onMeasure())方法。这个方法的参数是View.MeasureSpec，
//    它会告诉你的view的父控件的大小。那些值被包装成int类型，你可以使用静态方法来获取其中的信息。
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        // Try for a width based on our minimum
        int minw = getPaddingLeft() + getPaddingRight() + getSuggestedMinimumWidth();
        int w = resolveSizeAndState(minw, widthMeasureSpec, 1);

        // Whatever the width ends up being, ask for a height that would let the pie
        // get as big as it can
        int minh = MeasureSpec.getSize(w) - (int)mTextWidth + getPaddingBottom() + getPaddingTop();
        int h = resolveSizeAndState(MeasureSpec.getSize(w) - (int)mTextWidth, heightMeasureSpec, 0);

        setMeasuredDimension(w, h);
    }

    //    onSizeChanged()，当你的view第一次被赋予一个大小时，或者你的view大小被更改时会被执行。
//    在onSizeChanged方法里面计算位置，间距等其他与你的view大小值。
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        // Account for padding
        float xpad = (float)(getPaddingLeft() + getPaddingRight());
        float ypad = (float)(getPaddingTop() + getPaddingBottom());

        // Account for the label
        if (mShowText) xpad += mTextWidth;

        float ww = (float)w - xpad;
        float hh = (float)h - ypad;

        // Figure out how big we can make the pie.
        float diameter = Math.min(ww, hh);
    }

    //        Canvas类定义了绘制文本，线条，图像与许多其他图形的方法
//    绘制什么，由Canvas处理
//    如何绘制，由Paint处理
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        刚开始就创建对象是一个重要的优化技巧。Views会被频繁的重新绘制，初始化许多绘制对象需要花费昂贵的代价。
//        在onDraw方法里面创建绘制对象会严重影响到性能并使得你的UI显得卡顿。

        // Draw the shadow
        canvas.drawOval(
                mShadowBounds,
                mShadowPaint
        );

        // Draw the label text
        canvas.drawText(mData.get(mCurrentItem).mLabel, mTextX, mTextY, mTextPaint);

        // Draw the pie slices
        for (int i = 0; i < mData.size(); ++i) {
            ClipData.Item it = mData.get(i);
            mPiePaint.setShader(it.mShader);
            canvas.drawArc(mBounds,
                    360 - it.mEndAngle,
                    it.mEndAngle - it.mStartAngle,
                    true, mPiePaint);
        }

        // Draw the pointer
        canvas.drawLine(mTextX, mPointerY, mPointerX, mPointerY, mTextPaint);
        canvas.drawCircle(mPointerX, mPointerY, mPointerSize, mTextPaint);
    }

    private void init() {
        mTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mTextPaint.setColor(mTextColor);
        if (mTextHeight == 0) {
            mTextHeight = mTextPaint.getTextSize();
        } else {
            mTextPaint.setTextSize(mTextHeight);
        }

        mPiePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPiePaint.setStyle(Paint.Style.FILL);
        mPiePaint.setTextSize(mTextHeight);

        mShadowPaint = new Paint(0);
        mShadowPaint.setColor(0xff101010);
        mShadowPaint.setMaskFilter(new BlurMaskFilter(8, BlurMaskFilter.Blur.NORMAL));
    }
    //添加属性和事件
    public boolean isShowText() {
        return mShowText;
    }

    public void setShowText(boolean showText) {
        mShowText = showText;
//        请注意，在setShowText方法里面有调用invalidate()) and requestLayout()).
//        这两个调用是确保稳定运行的关键。当view的某些内容发生变化的时候，需要调用invalidate来
//        通知系统对这个view进行redraw，当某些元素变化会引起组件大小变化时，需要调用requestLayout
//        方法。调用时若忘了这两个方法，将会导致hard-to-find bugs。
        invalidate();
        requestLayout();
    }

}
