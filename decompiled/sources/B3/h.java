package B3;

import H5.D;
import L.E0;
import L.H2;
import L.M2;
import L.N;
import L.N2;
import L.P;
import O.C0486d;
import O.C0502l;
import O.C0510p;
import O.InterfaceC0501k0;
import O.Z;
import android.content.Context;
import b1.AbstractC0703b;
import com.kusukanime.data.UserRepo;
import e4.InterfaceC0821a;
import f.AbstractC0847h;
import java.util.List;
import s3.C1993J;
import v.AbstractC2123b;
import v.AbstractC2130i;
import v.C2140t;
import v3.AbstractC2152b;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f484k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f485l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f486m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f487n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f488o;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f484k = i7;
        this.f487n = obj;
        this.f488o = obj2;
        this.f485l = obj3;
        this.f486m = obj4;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f484k) {
            case 0:
                C0510p c0510p = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    a0.n nVar = a0.n.a;
                    C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p, 0);
                    int i7 = c0510p.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
                    a0.q qVarC = a0.a.c(c0510p, nVar);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i = C2363j.f17871b;
                    c0510p.V();
                    if (c0510p.f7127O) {
                        c0510p.l(c2362i);
                    } else {
                        c0510p.e0();
                    }
                    C0486d.R(c0510p, C2363j.f17875f, c2140tA);
                    C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0M);
                    C2361h c2361h = C2363j.f17876g;
                    if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i7))) {
                        AbstractC0703b.u(i7, c0510p, i7, c2361h);
                    }
                    C0486d.R(c0510p, C2363j.f17873d, qVarC);
                    H2.b("Semua resolusi terbuka — tanpa donasi.", null, ((N) c0510p.k(P.a)).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p.k(N2.a)).f5220l, c0510p, 6, 0, 65530);
                    AbstractC2123b.a(c0510p, androidx.compose.foundation.layout.c.j(nVar, 8));
                    c0510p.R(520325332);
                    for (O3.l lVar : (List) this.f487n) {
                        String str = (String) lVar.f7528k;
                        String str2 = (String) lVar.f7529l;
                        Z z7 = (Z) this.f485l;
                        boolean zA = kotlin.jvm.internal.l.a((String) z7.getValue(), str);
                        boolean zF = c0510p.f(str);
                        Context context = (Context) this.f488o;
                        boolean zH = zF | c0510p.h(context);
                        Object objH = c0510p.H();
                        if (zH || objH == C0502l.a) {
                            j jVar = new j(str, context, z7, (Z) this.f486m, 0);
                            c0510p.b0(jVar);
                            objH = jVar;
                        }
                        AbstractC0025a.a(str2, zA, (InterfaceC0821a) objH, c0510p, 0);
                    }
                    c0510p.p(false);
                    c0510p.p(true);
                }
                break;
            case 1:
                C0510p c0510p2 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    Z z8 = (Z) this.f485l;
                    boolean zG0 = AbstractC2510o.g0((String) z8.getValue());
                    Z z9 = (Z) this.f486m;
                    boolean z10 = (zG0 || ((Boolean) z9.getValue()).booleanValue()) ? false : true;
                    r3.m mVar = (r3.m) this.f487n;
                    boolean zH2 = c0510p2.h(mVar);
                    Object objH2 = c0510p2.H();
                    if (zH2 || objH2 == C0502l.a) {
                        j jVar2 = new j(mVar, z8, z9, (Z) this.f488o, 2);
                        c0510p2.b0(jVar2);
                        objH2 = jVar2;
                    }
                    E0.f((InterfaceC0821a) objH2, null, z10, null, r3.n.f14926f, c0510p2, 196608, 26);
                }
                break;
            case 2:
                long jLongValue = ((Long) obj).longValue();
                long jLongValue2 = ((Long) obj2).longValue();
                if (jLongValue > 0) {
                    D.x((H5.A) this.f487n, null, new C1993J((UserRepo) this.f488o, (String) this.f485l, (String) this.f486m, jLongValue, jLongValue2, null), 3);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC2152b.g((e4.k) this.f487n, (e4.k) this.f488o, (InterfaceC0821a) this.f485l, (v3.z) this.f486m, (C0510p) obj, C0486d.V(1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC0847h.d((String) this.f487n, (String) this.f488o, (String) this.f485l, (InterfaceC0821a) this.f486m, (C0510p) obj, C0486d.V(1));
                break;
        }
        return O3.C.a;
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, int i7, int i8) {
        this.f484k = i8;
        this.f487n = obj;
        this.f488o = obj2;
        this.f485l = obj3;
        this.f486m = obj4;
    }

    public /* synthetic */ h(r3.m mVar, Z z7, Z z8, Z z9) {
        this.f484k = 1;
        this.f487n = mVar;
        this.f485l = z7;
        this.f486m = z8;
        this.f488o = z9;
    }
}
