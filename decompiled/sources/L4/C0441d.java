package L4;

import e5.AbstractC0832b;
import f1.AbstractC0870c;
import io.ktor.http.ContentDisposition;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import l4.InterfaceC1443v;
import m5.C1520i;
import m5.C1523l;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2103i;
import u4.InterfaceC2116w;

/* renamed from: L4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0441d implements g5.o {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f6060f = {kotlin.jvm.internal.y.a.h(new kotlin.jvm.internal.r(C0441d.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* renamed from: b, reason: collision with root package name */
    public final A2.b f6061b;

    /* renamed from: c, reason: collision with root package name */
    public final q f6062c;

    /* renamed from: d, reason: collision with root package name */
    public final v f6063d;

    /* renamed from: e, reason: collision with root package name */
    public final C1520i f6064e;

    public C0441d(A2.b bVar, A4.z zVar, q qVar) {
        kotlin.jvm.internal.l.f("packageFragment", qVar);
        this.f6061b = bVar;
        this.f6062c = qVar;
        this.f6063d = new v(bVar, zVar, qVar);
        C1523l c1523l = ((K4.a) bVar.f110l).a;
        H4.u uVar = new H4.u(3, this);
        c1523l.getClass();
        this.f6064e = new C1520i(c1523l, uVar);
    }

    @Override // g5.o
    public final Collection a(W4.e eVar, C4.c cVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        i(eVar, cVar);
        g5.o[] oVarArrH = h();
        this.f6063d.getClass();
        Collection collectionM = P3.y.f7779k;
        for (g5.o oVar : oVarArrH) {
            collectionM = AbstractC0832b.m(collectionM, oVar.a(eVar, cVar));
        }
        return collectionM == null ? P3.A.f7737k : collectionM;
    }

    @Override // g5.q
    public final InterfaceC2102h b(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        kotlin.jvm.internal.l.f("location", aVar);
        i(eVar, aVar);
        v vVar = this.f6063d;
        vVar.getClass();
        InterfaceC2102h interfaceC2102h = null;
        InterfaceC2099e interfaceC2099eV = vVar.v(eVar, null);
        if (interfaceC2099eV != null) {
            return interfaceC2099eV;
        }
        for (g5.o oVar : h()) {
            InterfaceC2102h interfaceC2102hB = oVar.b(eVar, aVar);
            if (interfaceC2102hB != null) {
                if (!(interfaceC2102hB instanceof InterfaceC2103i) || !((InterfaceC2116w) interfaceC2102hB).Q()) {
                    return interfaceC2102hB;
                }
                if (interfaceC2102h == null) {
                    interfaceC2102h = interfaceC2102hB;
                }
            }
        }
        return interfaceC2102h;
    }

    @Override // g5.o
    public final Set c() {
        g5.o[] oVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (g5.o oVar : oVarArrH) {
            P3.v.e0(linkedHashSet, oVar.c());
        }
        linkedHashSet.addAll(this.f6063d.c());
        return linkedHashSet;
    }

    @Override // g5.o
    public final Set d() {
        g5.o[] oVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (g5.o oVar : oVarArrH) {
            P3.v.e0(linkedHashSet, oVar.d());
        }
        linkedHashSet.addAll(this.f6063d.d());
        return linkedHashSet;
    }

    @Override // g5.q
    public final Collection e(g5.f fVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        g5.o[] oVarArrH = h();
        Collection collectionE = this.f6063d.e(fVar, kVar);
        for (g5.o oVar : oVarArrH) {
            collectionE = AbstractC0832b.m(collectionE, oVar.e(fVar, kVar));
        }
        return collectionE == null ? P3.A.f7737k : collectionE;
    }

    @Override // g5.o
    public final Collection f(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        i(eVar, aVar);
        g5.o[] oVarArrH = h();
        Collection collectionF = this.f6063d.f(eVar, aVar);
        for (g5.o oVar : oVarArrH) {
            collectionF = AbstractC0832b.m(collectionF, oVar.f(eVar, aVar));
        }
        return collectionF == null ? P3.A.f7737k : collectionF;
    }

    @Override // g5.o
    public final Set g() {
        HashSet hashSetO = AbstractC0870c.O(P3.m.O(h()));
        if (hashSetO == null) {
            return null;
        }
        hashSetO.addAll(this.f6063d.g());
        return hashSetO;
    }

    public final g5.o[] h() {
        return (g5.o[]) AbstractC0832b.u(this.f6064e, f6060f[0]);
    }

    public final void i(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        kotlin.jvm.internal.l.f("location", aVar);
        K4.a aVar2 = (K4.a) this.f6061b.f110l;
        q0.c.L(aVar2.f4712n, aVar, this.f6062c, eVar);
    }

    public final String toString() {
        return "scope for " + this.f6062c;
    }
}
