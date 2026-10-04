package g5;

import P3.y;
import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2103i;
import u4.P;

/* loaded from: classes.dex */
public final class i extends p {

    /* renamed from: b, reason: collision with root package name */
    public final o f11749b;

    public i(o oVar) {
        kotlin.jvm.internal.l.f("workerScope", oVar);
        this.f11749b = oVar;
    }

    @Override // g5.p, g5.q
    public final InterfaceC2102h b(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        kotlin.jvm.internal.l.f("location", aVar);
        InterfaceC2102h interfaceC2102hB = this.f11749b.b(eVar, aVar);
        if (interfaceC2102hB != null) {
            InterfaceC2099e interfaceC2099e = interfaceC2102hB instanceof InterfaceC2099e ? (InterfaceC2099e) interfaceC2102hB : null;
            if (interfaceC2099e != null) {
                return interfaceC2099e;
            }
            if (interfaceC2102hB instanceof P) {
                return (P) interfaceC2102hB;
            }
        }
        return null;
    }

    @Override // g5.p, g5.o
    public final Set c() {
        return this.f11749b.c();
    }

    @Override // g5.p, g5.o
    public final Set d() {
        return this.f11749b.d();
    }

    @Override // g5.p, g5.q
    public final Collection e(f fVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        int i7 = f.f11735l & fVar.f11743b;
        f fVar2 = i7 == 0 ? null : new f(i7, fVar.a);
        if (fVar2 == null) {
            return y.f7779k;
        }
        Collection collectionE = this.f11749b.e(fVar2, kVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionE) {
            if (obj instanceof InterfaceC2103i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // g5.p, g5.o
    public final Set g() {
        return this.f11749b.g();
    }

    public final String toString() {
        return "Classes from " + this.f11749b;
    }
}
