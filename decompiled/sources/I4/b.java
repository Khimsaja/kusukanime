package I4;

import A3.q;
import A4.C0012e;
import P3.z;
import e5.AbstractC0832b;
import io.ktor.http.LinkHeader;
import java.util.Map;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.y;
import l4.InterfaceC1443v;
import m5.C1520i;
import m5.C1523l;
import n5.AbstractC1586x;
import n5.B;
import u4.M;

/* loaded from: classes.dex */
public class b implements J4.h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f4049e = {y.a.h(new r(b.class, LinkHeader.Parameters.Type, "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};
    public final W4.c a;

    /* renamed from: b, reason: collision with root package name */
    public final M f4050b;

    /* renamed from: c, reason: collision with root package name */
    public final C1520i f4051c;

    /* renamed from: d, reason: collision with root package name */
    public final N4.a f4052d;

    public b(A2.b bVar, C0012e c0012e, W4.c cVar) {
        l.f("c", bVar);
        l.f("fqName", cVar);
        this.a = cVar;
        K4.a aVar = (K4.a) bVar.f110l;
        this.f4050b = c0012e != null ? aVar.f4708j.b(c0012e) : M.f16295i;
        C1523l c1523l = aVar.a;
        q qVar = new q(2, bVar, this);
        c1523l.getClass();
        this.f4051c = new C1520i(c1523l, qVar);
        this.f4052d = c0012e != null ? (N4.a) P3.q.s0(c0012e.b()) : null;
    }

    @Override // v4.InterfaceC2154b
    public final W4.c a() {
        return this.a;
    }

    @Override // v4.InterfaceC2154b
    public Map b() {
        return z.f7780k;
    }

    @Override // v4.InterfaceC2154b
    public final AbstractC1586x getType() {
        return (B) AbstractC0832b.u(this.f4051c, f4049e[0]);
    }

    @Override // v4.InterfaceC2154b
    public final M l() {
        return this.f4050b;
    }
}
