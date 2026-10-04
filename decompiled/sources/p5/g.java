package p5;

import P3.A;
import P3.y;
import g5.o;
import io.ktor.http.ContentDisposition;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import l4.AbstractC1420H;
import u4.AbstractC2108n;
import u4.EnumC2117x;
import u4.InterfaceC2102h;
import u4.M;
import v4.C2158f;
import v4.C2159g;

/* loaded from: classes.dex */
public class g implements o {

    /* renamed from: b, reason: collision with root package name */
    public final String f14408b;

    public g(h hVar, String... strArr) {
        kotlin.jvm.internal.l.f("formatParams", strArr);
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f14408b = String.format(hVar.f14415k, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // g5.q
    public InterfaceC2102h b(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        kotlin.jvm.internal.l.f("location", aVar);
        b[] bVarArr = b.f14401k;
        return new C1812a(W4.e.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{eVar}, 1))));
    }

    @Override // g5.o
    public Set c() {
        return A.f7737k;
    }

    @Override // g5.o
    public Set d() {
        return A.f7737k;
    }

    @Override // g5.q
    public Collection e(g5.f fVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        return y.f7779k;
    }

    @Override // g5.o
    public Set g() {
        return A.f7737k;
    }

    @Override // g5.o
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set f(W4.e eVar, C4.c cVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        C1812a c1812a = l.f14456c;
        kotlin.jvm.internal.l.f("containingDeclaration", c1812a);
        C2158f c2158f = C2159g.a;
        b[] bVarArr = b.f14401k;
        c cVar2 = new c(c1812a, null, c2158f, W4.e.g("<Error function>"), 1, M.f16295i);
        y yVar = y.f7779k;
        cVar2.S0(null, null, yVar, yVar, yVar, l.c(k.f14441o, new String[0]), EnumC2117x.f16344n, AbstractC2108n.f16322e);
        return AbstractC1420H.K(cVar2);
    }

    @Override // g5.o
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set a(W4.e eVar, C4.c cVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        return l.f14459f;
    }

    public String toString() {
        return A6.b.j(new StringBuilder("ErrorScope{"), this.f14408b, '}');
    }
}
