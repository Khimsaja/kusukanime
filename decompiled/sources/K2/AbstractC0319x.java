package K2;

import android.graphics.Rect;
import android.view.View;
import p1.C1780c;

/* renamed from: K2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0319x {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4691b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4692c;

    public AbstractC0319x(H h7) {
        this.a = Integer.MIN_VALUE;
        this.f4692c = new Rect();
        this.f4691b = h7;
    }

    public static AbstractC0319x a(H h7, int i7) {
        if (i7 == 0) {
            return new C0318w(h7, 0);
        }
        if (i7 == 1) {
            return new C0318w(h7, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i7);

    public AbstractC0319x(p1.f fVar) {
        this.a = 0;
        this.f4692c = new C1780c();
        this.f4691b = fVar;
    }
}
