package h0;

/* renamed from: h0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0970O implements T0.b {

    /* renamed from: k, reason: collision with root package name */
    public int f11785k;

    /* renamed from: l, reason: collision with root package name */
    public float f11786l;

    /* renamed from: m, reason: collision with root package name */
    public float f11787m;

    /* renamed from: n, reason: collision with root package name */
    public float f11788n;

    /* renamed from: o, reason: collision with root package name */
    public float f11789o;

    /* renamed from: p, reason: collision with root package name */
    public long f11790p;

    /* renamed from: q, reason: collision with root package name */
    public long f11791q;

    /* renamed from: r, reason: collision with root package name */
    public float f11792r;

    /* renamed from: s, reason: collision with root package name */
    public long f11793s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0973S f11794t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f11795u;

    /* renamed from: v, reason: collision with root package name */
    public long f11796v;

    /* renamed from: w, reason: collision with root package name */
    public T0.b f11797w;

    /* renamed from: x, reason: collision with root package name */
    public T0.k f11798x;

    /* renamed from: y, reason: collision with root package name */
    public AbstractC0966K f11799y;

    @Override // T0.b
    public final float a() {
        return this.f11797w.a();
    }

    public final void b(float f5) {
        if (this.f11788n == f5) {
            return;
        }
        this.f11785k |= 4;
        this.f11788n = f5;
    }

    public final void c(long j7) {
        if (C0998u.c(this.f11790p, j7)) {
            return;
        }
        this.f11785k |= 64;
        this.f11790p = j7;
    }

    public final void e(boolean z7) {
        if (this.f11795u != z7) {
            this.f11785k |= 16384;
            this.f11795u = z7;
        }
    }

    public final void f(float f5) {
        if (this.f11786l == f5) {
            return;
        }
        this.f11785k |= 1;
        this.f11786l = f5;
    }

    public final void g(float f5) {
        if (this.f11787m == f5) {
            return;
        }
        this.f11785k |= 2;
        this.f11787m = f5;
    }

    public final void h(float f5) {
        if (this.f11789o == f5) {
            return;
        }
        this.f11785k |= 32;
        this.f11789o = f5;
    }

    public final void i(InterfaceC0973S interfaceC0973S) {
        if (kotlin.jvm.internal.l.a(this.f11794t, interfaceC0973S)) {
            return;
        }
        this.f11785k |= 8192;
        this.f11794t = interfaceC0973S;
    }

    public final void j(long j7) {
        if (C0998u.c(this.f11791q, j7)) {
            return;
        }
        this.f11785k |= 128;
        this.f11791q = j7;
    }

    public final void k(long j7) {
        if (C0976V.a(this.f11793s, j7)) {
            return;
        }
        this.f11785k |= 4096;
        this.f11793s = j7;
    }

    @Override // T0.b
    public final float n() {
        return this.f11797w.n();
    }
}
