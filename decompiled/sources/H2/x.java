package H2;

import G2.C0174k;
import O.R0;
import O.Z;
import java.util.List;
import java.util.Map;
import o.C1593E;
import o.C1594F;
import o.C1600L;
import o.C1606d;
import o.C1613k;
import o.C1623u;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Map f3662l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f3663m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e4.k f3664n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e4.k f3665o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e4.k f3666p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ R0 f3667q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Z f3668r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Map map, i iVar, e4.k kVar, e4.k kVar2, e4.k kVar3, R0 r02, Z z7) {
        super(1);
        this.f3662l = map;
        this.f3663m = iVar;
        this.f3664n = kVar;
        this.f3665o = kVar2;
        this.f3666p = kVar3;
        this.f3667q = r02;
        this.f3668r = z7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        C1613k c1613k = (C1613k) obj;
        float fFloatValue = 0.0f;
        if (!((List) this.f3667q.getValue()).contains(c1613k.a())) {
            return new C1623u(C1593E.f13480b, C1594F.f13481b, 0.0f, new C1600L(C1606d.f13496m));
        }
        String str = ((C0174k) c1613k.a()).f2707p;
        Map map = this.f3662l;
        Float f5 = (Float) map.get(str);
        if (f5 != null) {
            fFloatValue = f5.floatValue();
        } else {
            map.put(((C0174k) c1613k.a()).f2707p, Float.valueOf(0.0f));
        }
        if (!kotlin.jvm.internal.l.a(((C0174k) c1613k.c()).f2707p, ((C0174k) c1613k.a()).f2707p)) {
            fFloatValue = (((Boolean) this.f3663m.f3614c.getValue()).booleanValue() || ((Boolean) this.f3668r.getValue()).booleanValue()) ? fFloatValue - 1.0f : fFloatValue + 1.0f;
        }
        map.put(((C0174k) c1613k.c()).f2707p, Float.valueOf(fFloatValue));
        return new C1623u((C1593E) this.f3664n.invoke(c1613k), (C1594F) this.f3665o.invoke(c1613k), fFloatValue, (C1600L) this.f3666p.invoke(c1613k));
    }
}
