package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class C implements InterfaceC0694v {

    /* renamed from: s, reason: collision with root package name */
    public static final C f10696s = new C();

    /* renamed from: k, reason: collision with root package name */
    public int f10697k;

    /* renamed from: l, reason: collision with root package name */
    public int f10698l;

    /* renamed from: o, reason: collision with root package name */
    public Handler f10701o;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10699m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10700n = true;

    /* renamed from: p, reason: collision with root package name */
    public final x f10702p = new x(this);

    /* renamed from: q, reason: collision with root package name */
    public final B1.w f10703q = new B1.w(15, this);

    /* renamed from: r, reason: collision with root package name */
    public final U f10704r = new U(this);

    public final void c() {
        int i7 = this.f10698l + 1;
        this.f10698l = i7;
        if (i7 == 1) {
            if (this.f10699m) {
                this.f10702p.f(EnumC0688o.ON_RESUME);
                this.f10699m = false;
            } else {
                Handler handler = this.f10701o;
                kotlin.jvm.internal.l.c(handler);
                handler.removeCallbacks(this.f10703q);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0694v
    public final AbstractC0690q f() {
        return this.f10702p;
    }
}
