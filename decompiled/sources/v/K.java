package v;

import O.C0502l;
import O.C0510p;
import java.util.WeakHashMap;
import w0.InterfaceC2172G;

/* loaded from: classes.dex */
public final class K extends kotlin.jvm.internal.m implements e4.o {

    /* renamed from: m, reason: collision with root package name */
    public static final K f16386m = new K(3, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final K f16387n = new K(3, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final K f16388o = new K(3, 2);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f16389l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i7, int i8) {
        super(i7);
        this.f16389l = i8;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f16389l) {
            case 0:
                ((Number) obj2).intValue();
                return Integer.valueOf(((InterfaceC2172G) obj).Y(((Number) obj3).intValue()));
            case 1:
                ((Number) obj2).intValue();
                return Integer.valueOf(((InterfaceC2172G) obj).b0(((Number) obj3).intValue()));
            case 2:
                ((Number) obj2).intValue();
                return Integer.valueOf(((InterfaceC2172G) obj).W(((Number) obj3).intValue()));
            default:
                C0510p c0510p = (C0510p) obj2;
                ((Number) obj3).intValue();
                c0510p.R(359872873);
                WeakHashMap weakHashMap = n0.f16470v;
                n0 n0VarE = M.e(c0510p);
                boolean zF = c0510p.f(n0VarE);
                Object objH = c0510p.H();
                if (zF || objH == C0502l.a) {
                    objH = new Q(n0VarE.f16472c);
                    c0510p.b0(objH);
                }
                Q q6 = (Q) objH;
                c0510p.p(false);
                return q6;
        }
    }
}
