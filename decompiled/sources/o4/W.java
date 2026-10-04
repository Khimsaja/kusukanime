package o4;

import b1.AbstractC0703b;
import f6.AbstractC0915m;
import l4.InterfaceC1443v;

/* loaded from: classes.dex */
public final class W extends AbstractC1651E {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f13662g;

    /* renamed from: c, reason: collision with root package name */
    public final z0 f13663c;

    /* renamed from: d, reason: collision with root package name */
    public final z0 f13664d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f13665e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f13666f;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r(W.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0);
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
        f13662g = new InterfaceC1443v[]{zVar.h(rVar), AbstractC0703b.r(W.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0, zVar), AbstractC0703b.r(W.class, "members", "getMembers()Ljava/util/Collection;", 0, zVar)};
    }

    public W(X x7) {
        super(x7);
        this.f13663c = AbstractC0915m.D(null, new C1665T(x7, 1));
        this.f13664d = AbstractC0915m.D(null, new C1666U(this, 0));
        O3.j jVar = O3.j.f7525k;
        this.f13665e = z1.c.B(jVar, new C1667V(this, x7));
        this.f13666f = z1.c.B(jVar, new C1666U(this, 1));
        AbstractC0915m.D(null, new C1667V(x7, this));
    }
}
