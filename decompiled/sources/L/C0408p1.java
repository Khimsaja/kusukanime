package L;

import M.AbstractC0461t;
import O.C0510p;
import h0.C0998u;
import o.AbstractC1599K;
import p.AbstractC1745d;

/* renamed from: L.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0408p1 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0393l1 f5723l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f5724m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f5725n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e4.n f5726o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0408p1(C0393l1 c0393l1, boolean z7, boolean z8, e4.n nVar) {
        super(2);
        this.f5723l = c0393l1;
        this.f5724m = z7;
        this.f5725n = z8;
        this.f5726o = nVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        C0510p c0510p = (C0510p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            H0.I iA = N2.a(N.l.f6707g, c0510p);
            C0393l1 c0393l1 = this.f5723l;
            AbstractC0461t.a(((C0998u) AbstractC1599K.a(!this.f5725n ? c0393l1.f5648g : this.f5724m ? c0393l1.f5643b : c0393l1.f5646e, AbstractC1745d.q(100, 0, null, 6), c0510p, 48, 12).getValue()).a, iA, this.f5726o, c0510p, 0);
        }
        return O3.C.a;
    }
}
