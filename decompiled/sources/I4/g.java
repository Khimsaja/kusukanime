package I4;

import A4.C0012e;
import e5.AbstractC0832b;
import java.util.Map;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.y;
import l4.InterfaceC1443v;
import m5.C1520i;
import m5.C1523l;
import r4.AbstractC1886o;

/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f4059g = {y.a.h(new r(g.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* renamed from: f, reason: collision with root package name */
    public final C1520i f4060f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C0012e c0012e, A2.b bVar) {
        super(bVar, c0012e, AbstractC1886o.f15005m);
        l.f("c", bVar);
        C1523l c1523l = ((K4.a) bVar.f110l).a;
        f fVar = f.f4058k;
        c1523l.getClass();
        this.f4060f = new C1520i(c1523l, fVar);
    }

    @Override // I4.b, v4.InterfaceC2154b
    public final Map b() {
        return (Map) AbstractC0832b.u(this.f4060f, f4059g[0]);
    }
}
