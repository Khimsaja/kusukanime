package x4;

import b1.AbstractC0703b;
import io.ktor.sse.ServerSentEventKt;
import l4.InterfaceC1443v;
import m5.C1520i;
import m5.C1523l;
import u4.InterfaceC2092H;
import u4.InterfaceC2105k;
import v4.C2158f;
import v4.C2159g;

/* renamed from: x4.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2297x extends AbstractC2287n implements InterfaceC2092H {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f17509r;

    /* renamed from: m, reason: collision with root package name */
    public final C2255A f17510m;

    /* renamed from: n, reason: collision with root package name */
    public final W4.c f17511n;

    /* renamed from: o, reason: collision with root package name */
    public final C1520i f17512o;

    /* renamed from: p, reason: collision with root package name */
    public final C1520i f17513p;

    /* renamed from: q, reason: collision with root package name */
    public final g5.k f17514q;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r(C2297x.class, "fragments", "getFragments()Ljava/util/List;", 0);
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
        f17509r = new InterfaceC1443v[]{zVar.h(rVar), AbstractC0703b.r(C2297x.class, "empty", "getEmpty()Z", 0, zVar)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2297x(C2255A c2255a, W4.c cVar, C1523l c1523l) {
        kotlin.jvm.internal.l.f("module", c2255a);
        kotlin.jvm.internal.l.f("fqName", cVar);
        kotlin.jvm.internal.l.f("storageManager", c1523l);
        C2158f c2158f = C2159g.a;
        W4.d dVar = cVar.a;
        super(c2158f, dVar.c() ? W4.d.f9620e : dVar.g());
        this.f17510m = c2255a;
        this.f17511n = cVar;
        this.f17512o = new C1520i(c1523l, new C2296w(this, 0));
        this.f17513p = new C1520i(c1523l, new C2296w(this, 1));
        this.f17514q = new g5.k(c1523l, new C2296w(this, 2));
    }

    public final boolean equals(Object obj) {
        InterfaceC2092H interfaceC2092H = obj instanceof InterfaceC2092H ? (InterfaceC2092H) obj : null;
        if (interfaceC2092H == null) {
            return false;
        }
        C2297x c2297x = (C2297x) interfaceC2092H;
        return kotlin.jvm.internal.l.a(this.f17511n, c2297x.f17511n) && kotlin.jvm.internal.l.a(this.f17510m, c2297x.f17510m);
    }

    public final int hashCode() {
        return this.f17511n.hashCode() + (this.f17510m.hashCode() * 31);
    }

    @Override // u4.InterfaceC2105k
    public final InterfaceC2105k k() {
        W4.c cVar = this.f17511n;
        if (cVar.a.c()) {
            return null;
        }
        return this.f17510m.F(cVar.b());
    }

    @Override // u4.InterfaceC2105k
    public final Object u(X4.y yVar, Object obj) {
        switch (yVar.f9915k) {
            case 1:
                StringBuilder sb = (StringBuilder) obj;
                Y4.h hVar = (Y4.h) yVar.f9916l;
                hVar.getClass();
                sb.append(hVar.F("package"));
                W4.d dVar = this.f17511n.a;
                kotlin.jvm.internal.l.f("fqName", dVar);
                String strM = hVar.m(z1.c.I(W4.d.f(dVar)));
                if (strM.length() > 0) {
                    sb.append(ServerSentEventKt.SPACE);
                    sb.append(strM);
                }
                if (hVar.a.l()) {
                    sb.append(" in context of ");
                    hVar.M(this.f17510m, sb, false);
                }
                return O3.C.a;
            default:
                return null;
        }
    }
}
