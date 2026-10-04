package g5;

import P3.A;
import P3.v;
import P3.y;
import e5.AbstractC0832b;
import f1.AbstractC0870c;
import io.ktor.http.ContentDisposition;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import u4.InterfaceC2102h;
import u4.InterfaceC2103i;
import u4.InterfaceC2116w;

/* renamed from: g5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0954a implements o {

    /* renamed from: b, reason: collision with root package name */
    public final String f11722b;

    /* renamed from: c, reason: collision with root package name */
    public final o[] f11723c;

    public C0954a(String str, o[] oVarArr) {
        this.f11722b = str;
        this.f11723c = oVarArr;
    }

    @Override // g5.o
    public final Collection a(W4.e eVar, C4.c cVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        o[] oVarArr = this.f11723c;
        int length = oVarArr.length;
        if (length == 0) {
            return y.f7779k;
        }
        if (length == 1) {
            return oVarArr[0].a(eVar, cVar);
        }
        Collection collectionM = null;
        for (o oVar : oVarArr) {
            collectionM = AbstractC0832b.m(collectionM, oVar.a(eVar, cVar));
        }
        return collectionM == null ? A.f7737k : collectionM;
    }

    @Override // g5.q
    public final InterfaceC2102h b(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        kotlin.jvm.internal.l.f("location", aVar);
        InterfaceC2102h interfaceC2102h = null;
        for (o oVar : this.f11723c) {
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
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (o oVar : this.f11723c) {
            v.e0(linkedHashSet, oVar.c());
        }
        return linkedHashSet;
    }

    @Override // g5.o
    public final Set d() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (o oVar : this.f11723c) {
            v.e0(linkedHashSet, oVar.d());
        }
        return linkedHashSet;
    }

    @Override // g5.q
    public final Collection e(f fVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        o[] oVarArr = this.f11723c;
        int length = oVarArr.length;
        if (length == 0) {
            return y.f7779k;
        }
        if (length == 1) {
            return oVarArr[0].e(fVar, kVar);
        }
        Collection collectionM = null;
        for (o oVar : oVarArr) {
            collectionM = AbstractC0832b.m(collectionM, oVar.e(fVar, kVar));
        }
        return collectionM == null ? A.f7737k : collectionM;
    }

    @Override // g5.o
    public final Collection f(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        o[] oVarArr = this.f11723c;
        int length = oVarArr.length;
        if (length == 0) {
            return y.f7779k;
        }
        if (length == 1) {
            return oVarArr[0].f(eVar, aVar);
        }
        Collection collectionM = null;
        for (o oVar : oVarArr) {
            collectionM = AbstractC0832b.m(collectionM, oVar.f(eVar, aVar));
        }
        return collectionM == null ? A.f7737k : collectionM;
    }

    @Override // g5.o
    public final Set g() {
        return AbstractC0870c.O(P3.m.O(this.f11723c));
    }

    public final String toString() {
        return this.f11722b;
    }
}
