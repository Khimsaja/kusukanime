package H;

import O.C0502l;
import O.C0510p;
import e4.InterfaceC0821a;

/* renamed from: H.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193j extends kotlin.jvm.internal.m implements e4.o {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f2985l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f2986m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0193j(boolean z7, InterfaceC0821a interfaceC0821a) {
        super(3);
        this.f2985l = interfaceC0821a;
        this.f2986m = z7;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a0.q qVar = (a0.q) obj;
        C0510p c0510p = (C0510p) obj2;
        ((Number) obj3).intValue();
        c0510p.R(-196777734);
        long j7 = ((a0) c0510p.k(b0.a)).a;
        boolean zE = c0510p.e(j7);
        InterfaceC0821a interfaceC0821a = this.f2985l;
        boolean zF = zE | c0510p.f(interfaceC0821a);
        boolean z7 = this.f2986m;
        boolean zG = zF | c0510p.g(z7);
        Object objH = c0510p.H();
        if (zG || objH == C0502l.a) {
            objH = new C0192i(j7, interfaceC0821a, z7);
            c0510p.b0(objH);
        }
        a0.q qVarB = androidx.compose.ui.draw.a.b(qVar, (e4.k) objH);
        c0510p.p(false);
        return qVarB;
    }
}
