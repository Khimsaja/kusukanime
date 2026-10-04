package F2;

import B1.AbstractC0015b;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: F2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149e extends View implements M {

    /* renamed from: A, reason: collision with root package name */
    public final int f2322A;

    /* renamed from: B, reason: collision with root package name */
    public final int f2323B;

    /* renamed from: C, reason: collision with root package name */
    public final int f2324C;

    /* renamed from: D, reason: collision with root package name */
    public final int f2325D;

    /* renamed from: E, reason: collision with root package name */
    public final StringBuilder f2326E;

    /* renamed from: F, reason: collision with root package name */
    public final Formatter f2327F;

    /* renamed from: G, reason: collision with root package name */
    public final B1.w f2328G;

    /* renamed from: H, reason: collision with root package name */
    public final CopyOnWriteArraySet f2329H;
    public final Point I;
    public final float J;

    /* renamed from: K, reason: collision with root package name */
    public int f2330K;

    /* renamed from: L, reason: collision with root package name */
    public long f2331L;

    /* renamed from: M, reason: collision with root package name */
    public int f2332M;

    /* renamed from: N, reason: collision with root package name */
    public Rect f2333N;

    /* renamed from: O, reason: collision with root package name */
    public final ValueAnimator f2334O;

    /* renamed from: P, reason: collision with root package name */
    public float f2335P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2336Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f2337R;

    /* renamed from: S, reason: collision with root package name */
    public long f2338S;

    /* renamed from: T, reason: collision with root package name */
    public long f2339T;

    /* renamed from: U, reason: collision with root package name */
    public long f2340U;

    /* renamed from: V, reason: collision with root package name */
    public long f2341V;

    /* renamed from: W, reason: collision with root package name */
    public int f2342W;

    /* renamed from: a0, reason: collision with root package name */
    public long[] f2343a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean[] f2344b0;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f2345k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f2346l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f2347m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f2348n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f2349o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f2350p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint f2351q;

    /* renamed from: r, reason: collision with root package name */
    public final Paint f2352r;

    /* renamed from: s, reason: collision with root package name */
    public final Paint f2353s;

    /* renamed from: t, reason: collision with root package name */
    public final Paint f2354t;

    /* renamed from: u, reason: collision with root package name */
    public final Drawable f2355u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2356v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2357w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2358x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2359y;

    /* renamed from: z, reason: collision with root package name */
    public final int f2360z;

    public C0149e(Context context) {
        super(context, null, 0);
        this.f2345k = new Rect();
        this.f2346l = new Rect();
        this.f2347m = new Rect();
        this.f2348n = new Rect();
        Paint paint = new Paint();
        this.f2349o = paint;
        Paint paint2 = new Paint();
        this.f2350p = paint2;
        Paint paint3 = new Paint();
        this.f2351q = paint3;
        Paint paint4 = new Paint();
        this.f2352r = paint4;
        Paint paint5 = new Paint();
        this.f2353s = paint5;
        Paint paint6 = new Paint();
        this.f2354t = paint6;
        paint6.setAntiAlias(true);
        this.f2329H = new CopyOnWriteArraySet();
        this.I = new Point();
        float f5 = context.getResources().getDisplayMetrics().density;
        this.J = f5;
        this.f2325D = a(f5, -50);
        int iA = a(f5, 4);
        int iA2 = a(f5, 26);
        int iA3 = a(f5, 4);
        int iA4 = a(f5, 12);
        int iA5 = a(f5, 0);
        int iA6 = a(f5, 16);
        this.f2356v = iA;
        this.f2357w = iA2;
        this.f2358x = 0;
        this.f2359y = iA3;
        this.f2360z = iA4;
        this.f2322A = iA5;
        this.f2323B = iA6;
        paint.setColor(-1);
        paint6.setColor(-1);
        paint2.setColor(-855638017);
        paint3.setColor(872415231);
        paint4.setColor(-1291845888);
        paint5.setColor(872414976);
        this.f2355u = null;
        StringBuilder sb = new StringBuilder();
        this.f2326E = sb;
        this.f2327F = new Formatter(sb, Locale.getDefault());
        this.f2328G = new B1.w(1, this);
        this.f2324C = (Math.max(iA5, Math.max(iA4, iA6)) + 1) / 2;
        this.f2335P = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f2334O = valueAnimator;
        valueAnimator.addUpdateListener(new v(4, this));
        this.f2339T = -9223372036854775807L;
        this.f2331L = -9223372036854775807L;
        this.f2330K = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int a(float f5, int i7) {
        return (int) ((i7 * f5) + 0.5f);
    }

    private long getPositionIncrement() {
        long j7 = this.f2331L;
        if (j7 != -9223372036854775807L) {
            return j7;
        }
        long j8 = this.f2339T;
        if (j8 == -9223372036854775807L) {
            return 0L;
        }
        return j8 / this.f2330K;
    }

    private String getProgressText() {
        return B1.K.v(this.f2326E, this.f2327F, this.f2340U);
    }

    private long getScrubberPosition() {
        if (this.f2346l.width() <= 0 || this.f2339T == -9223372036854775807L) {
            return 0L;
        }
        return (this.f2348n.width() * this.f2339T) / r0.width();
    }

    public final boolean b(long j7) {
        long j8 = this.f2339T;
        if (j8 <= 0) {
            return false;
        }
        long j9 = this.f2337R ? this.f2338S : this.f2340U;
        long jI = B1.K.i(j9 + j7, 0L, j8);
        if (jI == j9) {
            return false;
        }
        if (this.f2337R) {
            f(jI);
        } else {
            c(jI);
        }
        e();
        return true;
    }

    public final void c(long j7) {
        this.f2338S = j7;
        this.f2337R = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f2329H.iterator();
        while (it.hasNext()) {
            C0163t c0163t = ((ViewOnClickListenerC0153i) it.next()).a;
            c0163t.A0 = true;
            TextView textView = c0163t.f2408N;
            if (textView != null) {
                textView.setText(B1.K.v(c0163t.f2410P, c0163t.f2411Q, j7));
            }
            c0163t.f2428k.f();
        }
    }

    public final void d(boolean z7) {
        y1.L l7;
        removeCallbacks(this.f2328G);
        this.f2337R = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f2329H.iterator();
        while (it.hasNext()) {
            ViewOnClickListenerC0153i viewOnClickListenerC0153i = (ViewOnClickListenerC0153i) it.next();
            long j7 = this.f2338S;
            C0163t c0163t = viewOnClickListenerC0153i.a;
            c0163t.A0 = false;
            if (!z7 && (l7 = c0163t.f2447t0) != null) {
                if (c0163t.f2458z0) {
                    Q4.c cVar = (Q4.c) l7;
                    if (cVar.y0(17) && cVar.y0(10)) {
                        y1.P pU0 = ((H1.G) cVar).U0();
                        int iO = pU0.o();
                        int i7 = 0;
                        while (true) {
                            long jP = B1.K.P(pU0.m(i7, c0163t.f2413S, 0L).f17965l);
                            if (j7 < jP) {
                                break;
                            }
                            if (i7 == iO - 1) {
                                j7 = jP;
                                break;
                            } else {
                                j7 -= jP;
                                i7++;
                            }
                        }
                        cVar.C0(i7, j7, false);
                    }
                } else {
                    Q4.c cVar2 = (Q4.c) l7;
                    if (cVar2.y0(5)) {
                        cVar2.D0(5, j7);
                    }
                }
                c0163t.o();
            }
            c0163t.f2428k.g();
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2355u;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        Rect rect = this.f2347m;
        Rect rect2 = this.f2346l;
        rect.set(rect2);
        Rect rect3 = this.f2348n;
        rect3.set(rect2);
        long j7 = this.f2337R ? this.f2338S : this.f2340U;
        if (this.f2339T > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.f2341V) / this.f2339T)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j7) / this.f2339T)), rect2.right);
        } else {
            int i7 = rect2.left;
            rect.right = i7;
            rect3.right = i7;
        }
        invalidate(this.f2345k);
    }

    public final void f(long j7) {
        if (this.f2338S == j7) {
            return;
        }
        this.f2338S = j7;
        Iterator it = this.f2329H.iterator();
        while (it.hasNext()) {
            C0163t c0163t = ((ViewOnClickListenerC0153i) it.next()).a;
            TextView textView = c0163t.f2408N;
            if (textView != null) {
                textView.setText(B1.K.v(c0163t.f2410P, c0163t.f2411Q, j7));
            }
        }
    }

    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f2346l.width() / this.J);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j7 = this.f2339T;
        if (j7 == 0 || j7 == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j7 / iWidth;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2355u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        Rect rect = this.f2346l;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i7 = iCenterY + iHeight;
        long j7 = this.f2339T;
        Paint paint = this.f2351q;
        Rect rect2 = this.f2348n;
        if (j7 <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i7, paint);
        } else {
            Rect rect3 = this.f2347m;
            int i8 = rect3.left;
            int i9 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i9), rect2.right);
            int i10 = rect.right;
            if (iMax < i10) {
                canvas.drawRect(iMax, iCenterY, i10, i7, paint);
            }
            int iMax2 = Math.max(i8, rect2.right);
            if (i9 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i9, i7, this.f2350p);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i7, this.f2349o);
            }
            if (this.f2342W != 0) {
                long[] jArr = this.f2343a0;
                jArr.getClass();
                boolean[] zArr = this.f2344b0;
                zArr.getClass();
                int i11 = this.f2359y;
                int i12 = i11 / 2;
                int i13 = 0;
                int i14 = 0;
                while (i14 < this.f2342W) {
                    int i15 = i14;
                    canvas.drawRect(Math.min(rect.width() - i11, Math.max(i13, ((int) ((rect.width() * B1.K.i(jArr[i14], 0L, this.f2339T)) / this.f2339T)) - i12)) + rect.left, iCenterY, r3 + i11, i7, zArr[i14] ? this.f2353s : this.f2352r);
                    i14 = i15 + 1;
                    i13 = i13;
                }
            }
            canvas2 = canvas;
        }
        if (this.f2339T > 0) {
            int iH = B1.K.h(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.f2355u;
            if (drawable == null) {
                canvas2.drawCircle(iH, iCenterY2, (int) ((((this.f2337R || isFocused()) ? this.f2323B : isEnabled() ? this.f2360z : this.f2322A) * this.f2335P) / 2.0f), this.f2354t);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f2335P)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f2335P)) / 2;
                drawable.setBounds(iH - intrinsicWidth, iCenterY2 - intrinsicHeight, iH + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z7, int i7, Rect rect) {
        super.onFocusChanged(z7, i7, rect);
        if (!this.f2337R || z7) {
            return;
        }
        d(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f2339T <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L2e
            B1.w r5 = r4.f2328G
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.f2337R
            if (r0 == 0) goto L2e
            r5 = 0
            r4.d(r5)
            return r3
        L2e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.C0149e.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i11 = i9 - i7;
        int i12 = i10 - i8;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i11 - getPaddingRight();
        int i13 = this.f2336Q ? 0 : this.f2324C;
        int i14 = this.f2358x;
        int i15 = this.f2356v;
        int i16 = this.f2357w;
        if (i14 == 1) {
            paddingBottom = (i12 - getPaddingBottom()) - i16;
            paddingBottom2 = ((i12 - getPaddingBottom()) - i15) - Math.max(i13 - (i15 / 2), 0);
        } else {
            paddingBottom = (i12 - i16) / 2;
            paddingBottom2 = (i12 - i15) / 2;
        }
        Rect rect2 = this.f2345k;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i16 + paddingBottom);
        this.f2346l.set(rect2.left + i13, paddingBottom2, rect2.right - i13, i15 + paddingBottom2);
        if (B1.K.a >= 29 && ((rect = this.f2333N) == null || rect.width() != i11 || this.f2333N.height() != i12)) {
            Rect rect3 = new Rect(0, 0, i11, i12);
            this.f2333N = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int i9 = this.f2357w;
        if (mode == 0) {
            size = i9;
        } else if (mode != 1073741824) {
            size = Math.min(i9, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i7), size);
        Drawable drawable = this.f2355u;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        Drawable drawable = this.f2355u;
        if (drawable == null || B1.K.a < 23 || !drawable.setLayoutDirection(i7)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto La1
            long r2 = r9.f2339T
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto La1
        L11:
            android.graphics.Point r0 = r9.I
            float r2 = r10.getX()
            int r2 = (int) r2
            float r3 = r10.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.f2348n
            android.graphics.Rect r5 = r9.f2346l
            r6 = 1
            if (r3 == 0) goto L7d
            r7 = 3
            if (r3 == r6) goto L6e
            r8 = 2
            if (r3 == r8) goto L38
            if (r3 == r7) goto L6e
            goto La1
        L38:
            boolean r10 = r9.f2337R
            if (r10 == 0) goto La1
            int r10 = r9.f2325D
            if (r0 >= r10) goto L52
            int r10 = r9.f2332M
            int r2 = r2 - r10
            int r2 = r2 / r7
            int r2 = r2 + r10
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = B1.K.h(r10, r0, r1)
            r4.right = r10
            goto L60
        L52:
            r9.f2332M = r2
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = B1.K.h(r10, r0, r1)
            r4.right = r10
        L60:
            long r0 = r9.getScrubberPosition()
            r9.f(r0)
            r9.e()
            r9.invalidate()
            return r6
        L6e:
            boolean r0 = r9.f2337R
            if (r0 == 0) goto La1
            int r10 = r10.getAction()
            if (r10 != r7) goto L79
            r1 = r6
        L79:
            r9.d(r1)
            return r6
        L7d:
            float r10 = (float) r2
            float r0 = (float) r0
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.f2345k
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto La1
            int r0 = r5.left
            int r1 = r5.right
            int r10 = B1.K.h(r10, r0, r1)
            r4.right = r10
            long r0 = r9.getScrubberPosition()
            r9.c(r0)
            r9.e()
            r9.invalidate()
            return r6
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.C0149e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        if (super.performAccessibilityAction(i7, bundle)) {
            return true;
        }
        if (this.f2339T <= 0) {
            return false;
        }
        if (i7 == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i7 != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i7) {
        this.f2352r.setColor(i7);
        invalidate(this.f2345k);
    }

    public void setBufferedColor(int i7) {
        this.f2350p.setColor(i7);
        invalidate(this.f2345k);
    }

    public void setBufferedPosition(long j7) {
        if (this.f2341V == j7) {
            return;
        }
        this.f2341V = j7;
        e();
    }

    public void setDuration(long j7) {
        if (this.f2339T == j7) {
            return;
        }
        this.f2339T = j7;
        if (this.f2337R && j7 == -9223372036854775807L) {
            d(true);
        }
        e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z7) {
        super.setEnabled(z7);
        if (!this.f2337R || z7) {
            return;
        }
        d(true);
    }

    public void setKeyCountIncrement(int i7) {
        AbstractC0015b.c(i7 > 0);
        this.f2330K = i7;
        this.f2331L = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j7) {
        AbstractC0015b.c(j7 > 0);
        this.f2330K = -1;
        this.f2331L = j7;
    }

    public void setPlayedAdMarkerColor(int i7) {
        this.f2353s.setColor(i7);
        invalidate(this.f2345k);
    }

    public void setPlayedColor(int i7) {
        this.f2349o.setColor(i7);
        invalidate(this.f2345k);
    }

    public void setPosition(long j7) {
        if (this.f2340U == j7) {
            return;
        }
        this.f2340U = j7;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(int i7) {
        this.f2354t.setColor(i7);
        invalidate(this.f2345k);
    }

    public void setUnplayedColor(int i7) {
        this.f2351q.setColor(i7);
        invalidate(this.f2345k);
    }
}
