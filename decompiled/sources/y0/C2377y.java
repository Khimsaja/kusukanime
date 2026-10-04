package y0;

import h0.AbstractC0968M;
import h0.C0998u;
import h0.InterfaceC0995r;
import k0.C1375b;
import w0.C2196n;
import z0.C2471u;

/* renamed from: y0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2377y extends Y {

    /* renamed from: V, reason: collision with root package name */
    public static final H1.e0 f17900V;

    /* renamed from: T, reason: collision with root package name */
    public InterfaceC2375w f17901T;

    /* renamed from: U, reason: collision with root package name */
    public C2376x f17902U;

    static {
        H1.e0 e0VarG = AbstractC0968M.g();
        int i7 = C0998u.f11835h;
        e0VarG.f(C0998u.f11832e);
        e0VarG.l(1.0f);
        e0VarG.m(1);
        f17900V = e0VarG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2377y(C2349D c2349d, InterfaceC2375w interfaceC2375w) {
        super(c2349d);
        this.f17901T = interfaceC2375w;
        this.f17902U = c2349d.f17673m != null ? new C2376x(this) : null;
        if ((((a0.p) interfaceC2375w).f10402k.f10404m & 512) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // y0.Y
    public final void K0() {
        if (this.f17902U == null) {
            this.f17902U = new C2376x(this);
        }
    }

    @Override // y0.Y
    public final O N0() {
        return this.f17902U;
    }

    @Override // y0.Y
    public final a0.p P0() {
        return ((a0.p) this.f17901T).f10402k;
    }

    @Override // w0.InterfaceC2172G
    public final int W(int i7) {
        InterfaceC2375w interfaceC2375w = this.f17901T;
        Y y7 = this.f17826w;
        kotlin.jvm.internal.l.c(y7);
        return interfaceC2375w.b(this, y7, i7);
    }

    @Override // w0.InterfaceC2172G
    public final int Y(int i7) {
        InterfaceC2375w interfaceC2375w = this.f17901T;
        Y y7 = this.f17826w;
        kotlin.jvm.internal.l.c(y7);
        return interfaceC2375w.i(this, y7, i7);
    }

    @Override // w0.InterfaceC2172G
    public final w0.S b(long j7) {
        m0(j7);
        InterfaceC2375w interfaceC2375w = this.f17901T;
        Y y7 = this.f17826w;
        kotlin.jvm.internal.l.c(y7);
        e1(interfaceC2375w.e(this, y7, j7));
        Z0();
        return this;
    }

    @Override // w0.InterfaceC2172G
    public final int b0(int i7) {
        InterfaceC2375w interfaceC2375w = this.f17901T;
        Y y7 = this.f17826w;
        kotlin.jvm.internal.l.c(y7);
        return interfaceC2375w.g(this, y7, i7);
    }

    @Override // y0.Y
    public final void b1(InterfaceC0995r interfaceC0995r, C1375b c1375b) {
        Y y7 = this.f17826w;
        kotlin.jvm.internal.l.c(y7);
        y7.H0(interfaceC0995r, c1375b);
        if (((C2471u) AbstractC2352G.a(this.f17825v)).getShowLayoutBounds()) {
            I0(interfaceC0995r, f17900V);
        }
    }

    @Override // w0.InterfaceC2172G
    public final int c(int i7) {
        InterfaceC2375w interfaceC2375w = this.f17901T;
        Y y7 = this.f17826w;
        kotlin.jvm.internal.l.c(y7);
        return interfaceC2375w.c(this, y7, i7);
    }

    @Override // w0.S
    public final void j0(long j7, float f5, e4.k kVar) {
        c1(j7, f5, kVar);
        if (this.f17771q) {
            return;
        }
        a1();
        y0().n();
        kotlin.jvm.internal.l.c(this.f17826w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m1(InterfaceC2375w interfaceC2375w) {
        if (!interfaceC2375w.equals(this.f17901T) && (((a0.p) interfaceC2375w).f10402k.f10404m & 512) != 0) {
            throw new ClassCastException();
        }
        this.f17901T = interfaceC2375w;
    }

    @Override // y0.N
    public final int n0(C2196n c2196n) {
        C2376x c2376x = this.f17902U;
        if (c2376x == null) {
            return AbstractC2359f.c(this, c2196n);
        }
        Integer num = (Integer) c2376x.f17776A.get(c2196n);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
