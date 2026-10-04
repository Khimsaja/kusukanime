package I4;

import A4.C0012e;
import H4.u;
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
public final class j extends b {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f4065g = {y.a.h(new r(j.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* renamed from: f, reason: collision with root package name */
    public final C1520i f4066f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C0012e c0012e, A2.b bVar) {
        super(bVar, c0012e, AbstractC1886o.f15012t);
        l.f("annotation", c0012e);
        l.f("c", bVar);
        C1523l c1523l = ((K4.a) bVar.f110l).a;
        u uVar = new u(2, this);
        c1523l.getClass();
        this.f4066f = new C1520i(c1523l, uVar);
    }

    @Override // I4.b, v4.InterfaceC2154b
    public final Map b() {
        return (Map) AbstractC0832b.u(this.f4066f, f4065g[0]);
    }
}
