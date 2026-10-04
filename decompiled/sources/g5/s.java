package g5;

import b1.AbstractC0703b;
import e5.AbstractC0832b;
import io.ktor.http.ContentDisposition;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import l4.InterfaceC1443v;
import l5.C1456i;
import m5.C1520i;
import m5.C1523l;
import u4.EnumC2100f;
import u4.InterfaceC2102h;
import u4.K;
import x4.C2266L;

/* loaded from: classes.dex */
public final class s extends p {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f11762f;

    /* renamed from: b, reason: collision with root package name */
    public final C1456i f11763b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11764c;

    /* renamed from: d, reason: collision with root package name */
    public final C1520i f11765d;

    /* renamed from: e, reason: collision with root package name */
    public final C1520i f11766e;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r(s.class, "functions", "getFunctions()Ljava/util/List;", 0);
        z zVar = y.a;
        f11762f = new InterfaceC1443v[]{zVar.h(rVar), AbstractC0703b.r(s.class, "properties", "getProperties()Ljava/util/List;", 0, zVar)};
    }

    public s(C1523l c1523l, C1456i c1456i, boolean z7) {
        kotlin.jvm.internal.l.f("storageManager", c1523l);
        this.f11763b = c1456i;
        this.f11764c = z7;
        EnumC2100f enumC2100f = EnumC2100f.f16311k;
        this.f11765d = new C1520i(c1523l, new r(this, 0));
        this.f11766e = new C1520i(c1523l, new r(this, 1));
    }

    @Override // g5.p, g5.o
    public final Collection a(W4.e eVar, C4.c cVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        List list = (List) AbstractC0832b.u(this.f11766e, f11762f[1]);
        w5.f fVar = new w5.f();
        for (Object obj : list) {
            if (kotlin.jvm.internal.l.a(((K) obj).getName(), eVar)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    @Override // g5.p, g5.q
    public final InterfaceC2102h b(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        kotlin.jvm.internal.l.f("location", aVar);
        return null;
    }

    @Override // g5.p, g5.q
    public final Collection e(f fVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        C1520i c1520i = this.f11765d;
        InterfaceC1443v[] interfaceC1443vArr = f11762f;
        return P3.q.G0((List) AbstractC0832b.u(c1520i, interfaceC1443vArr[0]), (List) AbstractC0832b.u(this.f11766e, interfaceC1443vArr[1]));
    }

    @Override // g5.p, g5.o
    public final Collection f(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        List list = (List) AbstractC0832b.u(this.f11765d, f11762f[0]);
        w5.f fVar = new w5.f();
        for (Object obj : list) {
            if (kotlin.jvm.internal.l.a(((C2266L) obj).getName(), eVar)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }
}
