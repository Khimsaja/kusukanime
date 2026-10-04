package D;

import L.L2;
import b1.AbstractC0703b;
import h0.C0985h;
import h0.C0990m;
import h0.InterfaceC0995r;
import j0.C1296b;
import p.C1743c;
import p.C1762n;
import s.e1;
import w0.AbstractC2182Q;
import y0.C2351F;

/* renamed from: D.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046d extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1132l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f1133m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1134n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1135o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0046d(float f5, C0985h c0985h, C0990m c0990m) {
        super(1);
        this.f1133m = f5;
        this.f1134n = c0985h;
        this.f1135o = c0990m;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f1132l) {
            case 0:
                C2351F c2351f = (C2351F) obj;
                c2351f.b();
                float f5 = this.f1133m;
                C0985h c0985h = (C0985h) this.f1134n;
                C0990m c0990m = (C0990m) this.f1135o;
                C1296b c1296b = c2351f.f17696k;
                B2.l lVar = c1296b.f12205l;
                long jA = lVar.A();
                lVar.t().l();
                try {
                    X4.y yVar = (X4.y) lVar.f416l;
                    yVar.G(f5, 0.0f);
                    InterfaceC0995r interfaceC0995rT = ((B2.l) yVar.f9916l).t();
                    interfaceC0995rT.f(g0.c.d(0L), g0.c.e(0L));
                    interfaceC0995rT.g();
                    interfaceC0995rT.f(-g0.c.d(0L), -g0.c.e(0L));
                    c1296b.e(c0985h, c0990m);
                    AbstractC0703b.y(lVar, jA);
                    return O3.C.a;
                } catch (Throwable th) {
                    AbstractC0703b.y(lVar, jA);
                    throw th;
                }
            case 1:
                AbstractC2182Q abstractC2182Q = (AbstractC2182Q) obj;
                C1743c c1743c = ((L2) this.f1135o).f5193A;
                AbstractC2182Q.f(abstractC2182Q, (w0.S) this.f1134n, (int) (c1743c != null ? ((Number) c1743c.d()).floatValue() : this.f1133m), 0);
                return O3.C.a;
            default:
                long jLongValue = ((Number) obj).longValue();
                e1 e1Var = (e1) this.f1134n;
                if (e1Var.f15294b == Long.MIN_VALUE) {
                    e1Var.f15294b = jLongValue;
                }
                float f7 = e1Var.f15297e;
                C1762n c1762n = new C1762n(f7);
                float f8 = this.f1133m;
                C1762n c1762n2 = e1.f15293f;
                long jB = f8 == 0.0f ? e1Var.a.b(new C1762n(f7), c1762n2, e1Var.f15295c) : P3.F.X((jLongValue - e1Var.f15294b) / f8);
                float f9 = ((C1762n) e1Var.a.i(jB, c1762n, c1762n2, e1Var.f15295c)).a;
                e1Var.f15295c = (C1762n) e1Var.a.e(jB, c1762n, c1762n2, e1Var.f15295c);
                e1Var.f15294b = jLongValue;
                float f10 = e1Var.f15297e - f9;
                e1Var.f15297e = f9;
                ((e4.k) this.f1135o).invoke(Float.valueOf(f10));
                return O3.C.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0046d(e1 e1Var, float f5, e4.k kVar) {
        super(1);
        this.f1134n = e1Var;
        this.f1133m = f5;
        this.f1135o = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0046d(w0.S s7, L2 l22, float f5) {
        super(1);
        this.f1134n = s7;
        this.f1135o = l22;
        this.f1133m = f5;
    }
}
