package y;

import b1.AbstractC0703b;

/* renamed from: y.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2310J extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f17581l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2312L f17582m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2310J(C2312L c2312l, int i7) {
        super(1);
        this.f17581l = i7;
        this.f17582m = c2312l;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f17581l) {
            case 0:
                InterfaceC2339t interfaceC2339t = (InterfaceC2339t) this.f17582m.f17590x.invoke();
                int iB = interfaceC2339t.b();
                int i7 = 0;
                while (true) {
                    if (i7 >= iB) {
                        i7 = -1;
                    } else if (!interfaceC2339t.c(i7).equals(obj)) {
                        i7++;
                    }
                }
                return Integer.valueOf(i7);
            default:
                int iIntValue = ((Number) obj).intValue();
                C2312L c2312l = this.f17582m;
                InterfaceC2339t interfaceC2339t2 = (InterfaceC2339t) c2312l.f17590x.invoke();
                if (iIntValue >= 0 && iIntValue < interfaceC2339t2.b()) {
                    H5.D.x(c2312l.u0(), null, new C2311K(c2312l, iIntValue, null), 3);
                    return Boolean.TRUE;
                }
                StringBuilder sbP = AbstractC0703b.p(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                sbP.append(interfaceC2339t2.b());
                sbP.append(')');
                throw new IllegalArgumentException(sbP.toString().toString());
        }
    }
}
