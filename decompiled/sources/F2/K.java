package F2;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: A, reason: collision with root package name */
    public int f2269A;

    /* renamed from: B, reason: collision with root package name */
    public int f2270B;

    /* renamed from: C, reason: collision with root package name */
    public int f2271C;

    /* renamed from: D, reason: collision with root package name */
    public int f2272D;

    /* renamed from: E, reason: collision with root package name */
    public StaticLayout f2273E;

    /* renamed from: F, reason: collision with root package name */
    public StaticLayout f2274F;

    /* renamed from: G, reason: collision with root package name */
    public int f2275G;

    /* renamed from: H, reason: collision with root package name */
    public int f2276H;
    public int I;
    public Rect J;
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2277b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2278c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2279d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2280e;

    /* renamed from: f, reason: collision with root package name */
    public final TextPaint f2281f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f2282g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f2283h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f2284i;

    /* renamed from: j, reason: collision with root package name */
    public Layout.Alignment f2285j;

    /* renamed from: k, reason: collision with root package name */
    public Bitmap f2286k;

    /* renamed from: l, reason: collision with root package name */
    public float f2287l;

    /* renamed from: m, reason: collision with root package name */
    public int f2288m;

    /* renamed from: n, reason: collision with root package name */
    public int f2289n;

    /* renamed from: o, reason: collision with root package name */
    public float f2290o;

    /* renamed from: p, reason: collision with root package name */
    public int f2291p;

    /* renamed from: q, reason: collision with root package name */
    public float f2292q;

    /* renamed from: r, reason: collision with root package name */
    public float f2293r;

    /* renamed from: s, reason: collision with root package name */
    public int f2294s;

    /* renamed from: t, reason: collision with root package name */
    public int f2295t;

    /* renamed from: u, reason: collision with root package name */
    public int f2296u;

    /* renamed from: v, reason: collision with root package name */
    public int f2297v;

    /* renamed from: w, reason: collision with root package name */
    public int f2298w;

    /* renamed from: x, reason: collision with root package name */
    public float f2299x;

    /* renamed from: y, reason: collision with root package name */
    public float f2300y;

    /* renamed from: z, reason: collision with root package name */
    public float f2301z;

    public K(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f2280e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2279d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.a = fRound;
        this.f2277b = fRound;
        this.f2278c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f2281f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f2282g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f2283h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z7) {
        Canvas canvas2;
        if (!z7) {
            this.J.getClass();
            this.f2286k.getClass();
            canvas.drawBitmap(this.f2286k, (Rect) null, this.J, this.f2283h);
            return;
        }
        StaticLayout staticLayout = this.f2273E;
        StaticLayout staticLayout2 = this.f2274F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f2275G, this.f2276H);
        if (Color.alpha(this.f2296u) > 0) {
            Paint paint = this.f2282g;
            paint.setColor(this.f2296u);
            canvas2 = canvas;
            canvas2.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        int i7 = this.f2298w;
        TextPaint textPaint = this.f2281f;
        if (i7 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.a);
            textPaint.setColor(this.f2297v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else {
            float f5 = this.f2277b;
            if (i7 == 2) {
                float f7 = this.f2278c;
                textPaint.setShadowLayer(f5, f7, f7, this.f2297v);
            } else if (i7 == 3 || i7 == 4) {
                boolean z8 = i7 == 3;
                int i8 = z8 ? -1 : this.f2297v;
                int i9 = z8 ? this.f2297v : -1;
                float f8 = f5 / 2.0f;
                textPaint.setColor(this.f2294s);
                textPaint.setStyle(Paint.Style.FILL);
                float f9 = -f8;
                textPaint.setShadowLayer(f5, f9, f9, i8);
                staticLayout2.draw(canvas2);
                textPaint.setShadowLayer(f5, f8, f8, i9);
            }
        }
        textPaint.setColor(this.f2294s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }
}
