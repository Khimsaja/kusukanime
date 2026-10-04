package g5;

import e4.InterfaceC0821a;
import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import m5.C1520i;
import m5.C1523l;
import m5.InterfaceC1526o;
import u4.InterfaceC2096b;
import u4.InterfaceC2102h;
import u4.InterfaceC2105k;

/* loaded from: classes.dex */
public final class k implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11752b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11753c;

    public k(o oVar) {
        this.f11753c = oVar;
    }

    @Override // g5.o
    public Collection a(W4.e eVar, C4.c cVar) {
        switch (this.f11752b) {
            case 1:
                kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
                return Z4.l.o(k(eVar, cVar), l.f11756n);
            default:
                return k(eVar, cVar);
        }
    }

    @Override // g5.q
    public final InterfaceC2102h b(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        kotlin.jvm.internal.l.f("location", aVar);
        return l().b(eVar, aVar);
    }

    @Override // g5.o
    public final Set c() {
        return l().c();
    }

    @Override // g5.o
    public final Set d() {
        return l().d();
    }

    @Override // g5.q
    public Collection e(f fVar, e4.k kVar) {
        switch (this.f11752b) {
            case 1:
                kotlin.jvm.internal.l.f("kindFilter", fVar);
                Collection collectionI = i(fVar, kVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionI) {
                    if (((InterfaceC2105k) obj) instanceof InterfaceC2096b) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                return P3.q.G0(Z4.l.o(arrayList, l.f11757o), arrayList2);
            default:
                return i(fVar, kVar);
        }
    }

    @Override // g5.o
    public Collection f(W4.e eVar, C4.a aVar) {
        switch (this.f11752b) {
            case 1:
                kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
                return Z4.l.o(j(eVar, aVar), l.f11755m);
            default:
                return j(eVar, aVar);
        }
    }

    @Override // g5.o
    public final Set g() {
        return l().g();
    }

    public final o h() {
        if (!(l() instanceof k)) {
            return l();
        }
        o oVarL = l();
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter", oVarL);
        return ((k) oVarL).h();
    }

    public final Collection i(f fVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        return l().e(fVar, kVar);
    }

    public final Collection j(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        return l().f(eVar, aVar);
    }

    public final Collection k(W4.e eVar, C4.c cVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        return l().a(eVar, cVar);
    }

    public final o l() {
        switch (this.f11752b) {
            case 0:
                return (o) ((C1520i) this.f11753c).invoke();
            default:
                return (o) this.f11753c;
        }
    }

    public k(InterfaceC1526o interfaceC1526o, InterfaceC0821a interfaceC0821a) {
        kotlin.jvm.internal.l.f("storageManager", interfaceC1526o);
        this.f11753c = new C1520i((C1523l) interfaceC1526o, new j(interfaceC0821a, 0));
    }
}
