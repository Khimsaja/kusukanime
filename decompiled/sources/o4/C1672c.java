package o4;

import A4.AbstractC0011d;
import Z5.C0649s;
import io.ktor.util.GzipHeaderFlags;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import l4.InterfaceC1436o;
import u4.InterfaceC2112s;
import z5.C2508m;

/* renamed from: o4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1672c implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public static final C1672c f13681l = new C1672c(0);

    /* renamed from: m, reason: collision with root package name */
    public static final C1672c f13682m = new C1672c(1);

    /* renamed from: n, reason: collision with root package name */
    public static final C1672c f13683n = new C1672c(2);

    /* renamed from: o, reason: collision with root package name */
    public static final C1672c f13684o = new C1672c(3);

    /* renamed from: p, reason: collision with root package name */
    public static final C1672c f13685p = new C1672c(4);

    /* renamed from: q, reason: collision with root package name */
    public static final C1672c f13686q = new C1672c(5);

    /* renamed from: r, reason: collision with root package name */
    public static final C1672c f13687r = new C1672c(6);

    /* renamed from: s, reason: collision with root package name */
    public static final C1672c f13688s = new C1672c(7);

    /* renamed from: t, reason: collision with root package name */
    public static final C1672c f13689t = new C1672c(8);

    /* renamed from: u, reason: collision with root package name */
    public static final C1672c f13690u = new C1672c(9);

    /* renamed from: v, reason: collision with root package name */
    public static final C1672c f13691v = new C1672c(10);

    /* renamed from: w, reason: collision with root package name */
    public static final C1672c f13692w = new C1672c(11);

    /* renamed from: x, reason: collision with root package name */
    public static final C1672c f13693x = new C1672c(12);

    /* renamed from: y, reason: collision with root package name */
    public static final C1672c f13694y = new C1672c(13);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13695k;

    public /* synthetic */ C1672c(int i7) {
        this.f13695k = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        P3.y yVar = P3.y.f7779k;
        switch (this.f13695k) {
            case 0:
                Class cls = (Class) obj;
                C0649s c0649s = AbstractC1674d.a;
                kotlin.jvm.internal.l.f("it", cls);
                return new C1649C(cls);
            case 1:
                Class cls2 = (Class) obj;
                C0649s c0649s2 = AbstractC1674d.a;
                kotlin.jvm.internal.l.f("it", cls2);
                return new X(cls2);
            case 2:
                Class cls3 = (Class) obj;
                C0649s c0649s3 = AbstractC1674d.a;
                kotlin.jvm.internal.l.f("it", cls3);
                return e3.c.s(AbstractC1674d.a(cls3), yVar, false, yVar);
            case 3:
                Class cls4 = (Class) obj;
                C0649s c0649s4 = AbstractC1674d.a;
                kotlin.jvm.internal.l.f("it", cls4);
                return e3.c.s(AbstractC1674d.a(cls4), yVar, true, yVar);
            case GzipHeaderFlags.EXTRA /* 4 */:
                C0649s c0649s5 = AbstractC1674d.a;
                kotlin.jvm.internal.l.f("it", (Class) obj);
                return new ConcurrentHashMap();
            case 5:
                Class<?> returnType = ((Method) obj).getReturnType();
                kotlin.jvm.internal.l.e("getReturnType(...)", returnType);
                return AbstractC0011d.b(returnType);
            case 6:
                Class cls5 = (Class) obj;
                kotlin.jvm.internal.l.c(cls5);
                return AbstractC0011d.b(cls5);
            case 7:
                u4.K k7 = (u4.K) obj;
                C2508m c2508m = AbstractC1654H.f13637k;
                kotlin.jvm.internal.l.f("descriptor", k7);
                return Y4.h.f10164e.t(k7) + " | " + D0.b(k7).G();
            case 8:
                InterfaceC2112s interfaceC2112s = (InterfaceC2112s) obj;
                C2508m c2508m2 = AbstractC1654H.f13637k;
                kotlin.jvm.internal.l.f("descriptor", interfaceC2112s);
                return Y4.h.f10164e.t(interfaceC2112s) + " | " + D0.c(interfaceC2112s).h();
            case 9:
                InterfaceC1436o interfaceC1436o = (InterfaceC1436o) obj;
                kotlin.jvm.internal.l.f("parameter", interfaceC1436o);
                StringBuilder sb = new StringBuilder();
                C1669a0 c1669a0 = (C1669a0) interfaceC1436o;
                String name = c1669a0.getName();
                if (name == null) {
                    name = "_";
                }
                sb.append(name);
                sb.append(": ");
                sb.append(c1669a0.e());
                return sb.toString();
            case 10:
                InterfaceC1436o interfaceC1436o2 = (InterfaceC1436o) obj;
                kotlin.jvm.internal.l.f("it", interfaceC1436o2);
                return e3.c.E(((C1669a0) interfaceC1436o2).e());
            case 11:
                InterfaceC1436o interfaceC1436o3 = (InterfaceC1436o) obj;
                kotlin.jvm.internal.l.f("it", interfaceC1436o3);
                return e3.c.E(((C1669a0) interfaceC1436o3).e());
            case 12:
                W4.e eVar = (W4.e) obj;
                kotlin.jvm.internal.l.f("it", eVar);
                return z1.c.G(eVar);
            default:
                Class cls6 = (Class) obj;
                kotlin.jvm.internal.l.c(cls6);
                return AbstractC0011d.b(cls6);
        }
    }
}
