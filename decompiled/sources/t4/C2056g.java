package t4;

import P3.A;
import e5.AbstractC0832b;
import io.ktor.http.ContentDisposition;
import java.util.Collection;
import kotlin.jvm.internal.y;
import l4.AbstractC1420H;
import l4.InterfaceC1443v;
import m5.C1520i;
import m5.C1523l;
import r4.AbstractC1886o;
import r4.AbstractC1887p;
import u4.InterfaceC2099e;
import w4.InterfaceC2213c;
import x4.C2255A;
import x4.C2285l;

/* renamed from: t4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2056g implements InterfaceC2213c {

    /* renamed from: g, reason: collision with root package name */
    public static final W4.e f16055g;

    /* renamed from: h, reason: collision with root package name */
    public static final W4.b f16056h;
    public final C2255A a;

    /* renamed from: b, reason: collision with root package name */
    public final e4.k f16057b;

    /* renamed from: c, reason: collision with root package name */
    public final C1520i f16058c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f16053e = {y.a.h(new kotlin.jvm.internal.r(C2056g.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};

    /* renamed from: d, reason: collision with root package name */
    public static final C2054e f16052d = new C2054e();

    /* renamed from: f, reason: collision with root package name */
    public static final W4.c f16054f = AbstractC1887p.f15028k;

    static {
        W4.d dVar = AbstractC1886o.f14990c;
        f16055g = dVar.g();
        W4.c cVarI = dVar.i();
        f16056h = new W4.b(cVarI.b(), cVarI.a.g());
    }

    public C2056g(C1523l c1523l, C2255A c2255a) {
        C2055f c2055f = C2055f.f16051k;
        this.a = c2255a;
        this.f16057b = c2055f;
        this.f16058c = new C1520i(c1523l, new A3.q(21, this, c1523l));
    }

    @Override // w4.InterfaceC2213c
    public final Collection a(W4.c cVar) {
        kotlin.jvm.internal.l.f("packageFqName", cVar);
        return cVar.equals(f16054f) ? AbstractC1420H.K((C2285l) AbstractC0832b.u(this.f16058c, f16053e[0])) : A.f7737k;
    }

    @Override // w4.InterfaceC2213c
    public final InterfaceC2099e b(W4.b bVar) {
        kotlin.jvm.internal.l.f("classId", bVar);
        if (bVar.equals(f16056h)) {
            return (C2285l) AbstractC0832b.u(this.f16058c, f16053e[0]);
        }
        return null;
    }

    @Override // w4.InterfaceC2213c
    public final boolean c(W4.c cVar, W4.e eVar) {
        kotlin.jvm.internal.l.f("packageFqName", cVar);
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        return eVar.equals(f16055g) && cVar.equals(f16054f);
    }
}
