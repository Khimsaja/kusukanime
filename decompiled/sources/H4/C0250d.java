package H4;

import io.ktor.util.GzipHeaderFlags;
import l4.AbstractC1420H;
import r4.AbstractC1880i;
import u4.InterfaceC2097c;
import u4.InterfaceC2112s;
import x4.C2266L;
import x4.C2272S;

/* renamed from: H4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0250d implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public static final C0250d f3721l = new C0250d(0);

    /* renamed from: m, reason: collision with root package name */
    public static final C0250d f3722m = new C0250d(1);

    /* renamed from: n, reason: collision with root package name */
    public static final C0250d f3723n = new C0250d(2);

    /* renamed from: o, reason: collision with root package name */
    public static final C0250d f3724o = new C0250d(3);

    /* renamed from: p, reason: collision with root package name */
    public static final C0250d f3725p = new C0250d(4);

    /* renamed from: q, reason: collision with root package name */
    public static final C0250d f3726q = new C0250d(5);

    /* renamed from: r, reason: collision with root package name */
    public static final C0250d f3727r = new C0250d(6);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3728k;

    public /* synthetic */ C0250d(int i7) {
        this.f3728k = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        InterfaceC2097c interfaceC2097cB;
        String strK;
        boolean z7 = false;
        int i7 = 1;
        switch (this.f3728k) {
            case 0:
                InterfaceC2097c interfaceC2097c = (InterfaceC2097c) obj;
                int i8 = AbstractC0251e.f3729l;
                kotlin.jvm.internal.l.f("it", interfaceC2097c);
                return Boolean.valueOf(P3.q.m0(G.f3705f, P3.F.k(interfaceC2097c)));
            case 1:
                InterfaceC2097c interfaceC2097c2 = (InterfaceC2097c) obj;
                int i9 = AbstractC0251e.f3729l;
                kotlin.jvm.internal.l.f("it", interfaceC2097c2);
                if ((interfaceC2097c2 instanceof InterfaceC2112s) && P3.q.m0(G.f3705f, P3.F.k(interfaceC2097c2))) {
                    z7 = true;
                }
                return Boolean.valueOf(z7);
            case 2:
                InterfaceC2097c interfaceC2097c3 = (InterfaceC2097c) obj;
                kotlin.jvm.internal.l.f("it", interfaceC2097c3);
                return Boolean.valueOf(AbstractC1420H.F(interfaceC2097c3));
            case 3:
                return ((C2272S) obj).getType();
            case GzipHeaderFlags.EXTRA /* 4 */:
                InterfaceC2097c interfaceC2097c4 = (InterfaceC2097c) obj;
                kotlin.jvm.internal.l.f("it", interfaceC2097c4);
                return Boolean.valueOf(AbstractC1420H.F(d5.e.k(interfaceC2097c4)));
            case 5:
                InterfaceC2097c interfaceC2097c5 = (InterfaceC2097c) obj;
                kotlin.jvm.internal.l.f("it", interfaceC2097c5);
                int i10 = AbstractC0249c.f3720l;
                C2266L c2266l = (C2266L) interfaceC2097c5;
                if (AbstractC1880i.z(c2266l) && d5.e.b(c2266l, new A4.j(i7, c2266l)) != null) {
                    z7 = true;
                }
                return Boolean.valueOf(z7);
            default:
                InterfaceC2097c interfaceC2097c6 = (InterfaceC2097c) obj;
                kotlin.jvm.internal.l.f("it", interfaceC2097c6);
                if (AbstractC1880i.z(interfaceC2097c6)) {
                    int i11 = AbstractC0251e.f3729l;
                    D d4 = null;
                    if (G.f3704e.contains(interfaceC2097c6.getName()) && (interfaceC2097cB = d5.e.b(interfaceC2097c6, f3722m)) != null && (strK = P3.F.k(interfaceC2097cB)) != null) {
                        d4 = G.f3701b.contains(strK) ? D.f3691k : ((F) P3.E.m0(strK, G.f3703d)) == F.f3695l ? D.f3693m : D.f3692l;
                    }
                    if (d4 != null) {
                        z7 = true;
                    }
                }
                return Boolean.valueOf(z7);
        }
    }
}
