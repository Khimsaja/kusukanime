package g5;

import H4.u;
import e5.AbstractC0832b;
import io.ktor.http.ContentDisposition;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.y;
import l4.InterfaceC1443v;
import m5.C1520i;
import m5.C1523l;
import u4.K;
import x4.AbstractC2275b;
import x4.C2266L;

/* loaded from: classes.dex */
public abstract class h extends p {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f11746d = {y.a.h(new kotlin.jvm.internal.r(h.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC2275b f11747b;

    /* renamed from: c, reason: collision with root package name */
    public final C1520i f11748c;

    public h(C1523l c1523l, AbstractC2275b abstractC2275b) {
        kotlin.jvm.internal.l.f("storageManager", c1523l);
        this.f11747b = abstractC2275b;
        this.f11748c = new C1520i(c1523l, new u(7, this));
    }

    @Override // g5.p, g5.o
    public final Collection a(W4.e eVar, C4.c cVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        List list = (List) AbstractC0832b.u(this.f11748c, f11746d[0]);
        if (list.isEmpty()) {
            return P3.y.f7779k;
        }
        w5.f fVar = new w5.f();
        for (Object obj : list) {
            if ((obj instanceof K) && kotlin.jvm.internal.l.a(((K) obj).getName(), eVar)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    @Override // g5.p, g5.q
    public final Collection e(f fVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        return !fVar.a(f.f11737n.f11743b) ? P3.y.f7779k : (List) AbstractC0832b.u(this.f11748c, f11746d[0]);
    }

    @Override // g5.p, g5.o
    public final Collection f(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        List list = (List) AbstractC0832b.u(this.f11748c, f11746d[0]);
        if (list.isEmpty()) {
            return P3.y.f7779k;
        }
        w5.f fVar = new w5.f();
        for (Object obj : list) {
            if ((obj instanceof C2266L) && kotlin.jvm.internal.l.a(((C2266L) obj).getName(), eVar)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    public abstract List h();
}
