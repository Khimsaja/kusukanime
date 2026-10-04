package D;

import O.C0502l;
import O.C0510p;
import O.R0;
import z0.AbstractC2455l0;

/* loaded from: classes.dex */
public final class X extends kotlin.jvm.internal.m implements e4.o {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1111l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1112m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ H0.I f1113n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(int i7, int i8, H0.I i9) {
        super(3);
        this.f1111l = i7;
        this.f1112m = i8;
        this.f1113n = i9;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C0510p c0510p = (C0510p) obj2;
        ((Number) obj3).intValue();
        c0510p.R(408240218);
        int i7 = this.f1111l;
        int i8 = this.f1112m;
        AbstractC0047d0.s(i7, i8);
        a0.n nVar = a0.n.a;
        if (i7 == 1 && i8 == Integer.MAX_VALUE) {
            c0510p.p(false);
            return nVar;
        }
        T0.b bVar = (T0.b) c0510p.k(AbstractC2455l0.f18787f);
        M0.i iVar = (M0.i) c0510p.k(AbstractC2455l0.f18790i);
        T0.k kVar = (T0.k) c0510p.k(AbstractC2455l0.f18793l);
        H0.I i9 = this.f1113n;
        boolean zF = c0510p.f(i9) | c0510p.f(kVar);
        Object objH = c0510p.H();
        O.T t7 = C0502l.a;
        if (zF || objH == t7) {
            objH = n6.d.X(i9, kVar);
            c0510p.b0(objH);
        }
        H0.I i10 = (H0.I) objH;
        boolean zF2 = c0510p.f(iVar) | c0510p.f(i10);
        Object objH2 = c0510p.H();
        if (zF2 || objH2 == t7) {
            H0.B b4 = i10.a;
            M0.j jVar = b4.f3059f;
            M0.u uVar = b4.f3056c;
            if (uVar == null) {
                uVar = M0.u.f6415o;
            }
            M0.q qVar = b4.f3057d;
            int i11 = qVar != null ? qVar.a : 0;
            M0.r rVar = b4.f3058e;
            objH2 = ((M0.k) iVar).b(jVar, uVar, i11, rVar != null ? rVar.a : 1);
            c0510p.b0(objH2);
        }
        R0 r02 = (R0) objH2;
        boolean zF3 = c0510p.f(r02.getValue()) | c0510p.f(bVar) | c0510p.f(iVar) | c0510p.f(i9) | c0510p.f(kVar);
        Object objH3 = c0510p.H();
        if (zF3 || objH3 == t7) {
            objH3 = Integer.valueOf((int) (u0.a(i10, bVar, iVar, u0.a, 1) & 4294967295L));
            c0510p.b0(objH3);
        }
        int iIntValue = ((Number) objH3).intValue();
        boolean zF4 = c0510p.f(r02.getValue()) | c0510p.f(bVar) | c0510p.f(iVar) | c0510p.f(i9) | c0510p.f(kVar);
        Object objH4 = c0510p.H();
        if (zF4 || objH4 == t7) {
            StringBuilder sb = new StringBuilder();
            String str = u0.a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            objH4 = Integer.valueOf((int) (u0.a(i10, bVar, iVar, sb.toString(), 2) & 4294967295L));
            c0510p.b0(objH4);
        }
        int iIntValue2 = ((Number) objH4).intValue() - iIntValue;
        Integer numValueOf = i7 == 1 ? null : Integer.valueOf(((i7 - 1) * iIntValue2) + iIntValue);
        Integer numValueOf2 = i8 != Integer.MAX_VALUE ? Integer.valueOf(((i8 - 1) * iIntValue2) + iIntValue) : null;
        a0.q qVarF = androidx.compose.foundation.layout.c.f(nVar, numValueOf != null ? bVar.q0(numValueOf.intValue()) : Float.NaN, numValueOf2 != null ? bVar.q0(numValueOf2.intValue()) : Float.NaN);
        c0510p.p(false);
        return qVarF;
    }
}
