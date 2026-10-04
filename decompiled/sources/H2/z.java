package H2;

import G2.C0174k;
import O.C0493g0;
import O.R0;
import O3.C;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p.u0;

/* loaded from: classes.dex */
public final class z extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u0 f3673k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Map f3674l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ R0 f3675m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f3676n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(u0 u0Var, Map map, R0 r02, i iVar, S3.c cVar) {
        super(2, cVar);
        this.f3673k = u0Var;
        this.f3674l = map;
        this.f3675m = r02;
        this.f3676n = iVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new z(this.f3673k, this.f3674l, this.f3675m, this.f3676n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        z zVar = (z) create((H5.A) obj, (S3.c) obj2);
        C c2 = C.a;
        zVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        u0 u0Var = this.f3673k;
        Object objV0 = u0Var.a.v0();
        C0493g0 c0493g0 = u0Var.f14136d;
        if (kotlin.jvm.internal.l.a(objV0, c0493g0.getValue())) {
            Iterator it = ((List) this.f3675m.getValue()).iterator();
            while (it.hasNext()) {
                this.f3676n.b().b((C0174k) it.next());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map = this.f3674l;
            for (Map.Entry entry : map.entrySet()) {
                if (!kotlin.jvm.internal.l.a(entry.getKey(), ((C0174k) c0493g0.getValue()).f2707p)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                map.remove(((Map.Entry) it2.next()).getKey());
            }
        }
        return C.a;
    }
}
