package U1;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class l extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, c {

    /* renamed from: c, reason: collision with root package name */
    public final j f9191c;

    /* renamed from: e, reason: collision with root package name */
    public final GestureDetector f9193e;
    public final PointF a = new PointF();

    /* renamed from: b, reason: collision with root package name */
    public final PointF f9190b = new PointF();

    /* renamed from: d, reason: collision with root package name */
    public final float f9192d = 25.0f;

    /* renamed from: f, reason: collision with root package name */
    public volatile float f9194f = 3.1415927f;

    public l(Context context, j jVar) {
        this.f9191c = jVar;
        this.f9193e = new GestureDetector(context, this);
    }

    @Override // U1.c
    public final void a(float[] fArr, float f5) {
        this.f9194f = -f5;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f7) {
        float x7 = (motionEvent2.getX() - this.a.x) / this.f9192d;
        float y7 = motionEvent2.getY();
        PointF pointF = this.a;
        float f8 = (y7 - pointF.y) / this.f9192d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d4 = this.f9194f;
        float fCos = (float) Math.cos(d4);
        float fSin = (float) Math.sin(d4);
        PointF pointF2 = this.f9190b;
        pointF2.x -= (fCos * x7) - (fSin * f8);
        float f9 = (fCos * f8) + (fSin * x7) + pointF2.y;
        pointF2.y = f9;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f9));
        j jVar = this.f9191c;
        PointF pointF3 = this.f9190b;
        synchronized (jVar) {
            float f10 = pointF3.y;
            jVar.f9174g = f10;
            Matrix.setRotateM(jVar.f9172e, 0, -f10, (float) Math.cos(jVar.f9175h), (float) Math.sin(jVar.f9175h), 0.0f);
            Matrix.setRotateM(jVar.f9173f, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f9191c.f9178k.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f9193e.onTouchEvent(motionEvent);
    }
}
