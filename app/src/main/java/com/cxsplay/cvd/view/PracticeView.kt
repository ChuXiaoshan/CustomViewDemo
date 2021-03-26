package com.cxsplay.cvd.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

/**
 * Created by CxS on 2021/3/26 16:27
 */
class PracticeView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    val paint = Paint()

    init {
        paint.isAntiAlias = true
        paint.color = Color.RED
        paint.style = Paint.Style.FILL_AND_STROKE
        paint.strokeWidth = 4f

    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        //绘制圆
        canvas?.drawColor(Color.parseColor("#ccb9bc"))
        canvas?.drawCircle(0f, 0f, 100f, paint)
        canvas?.drawColor(Color.parseColor("#1100766c"))

        //绘制矩形
        paint.color = Color.parseColor("#c94f7c")
        paint.style = Paint.Style.FILL
        canvas?.drawRect(100f, 0f, 200f, 100f, paint)

        paint.color = Color.parseColor("#280680")
        paint.style = Paint.Style.STROKE
        canvas?.drawRect(300f, 0f, 400f, 100f, paint)

        //绘制点
        paint.strokeWidth = 20f
        paint.strokeCap = Paint.Cap.ROUND
        canvas?.drawPoint(500f, 30f, paint)

        paint.strokeWidth = 20f
        paint.strokeCap = Paint.Cap.SQUARE
        canvas?.drawPoint(500f, 60f, paint)

        //绘制椭圆
        paint.style = Paint.Style.FILL
        canvas?.drawOval(0f, 100f, 200f, 200f, paint)
    }
}