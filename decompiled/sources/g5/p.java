package g5;

import P3.y;
import io.ktor.http.ContentDisposition;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import u4.InterfaceC2102h;
import x4.C2266L;

/* loaded from: classes.dex */
public abstract class p implements o {
    @Override // g5.o
    public Collection a(W4.e eVar, C4.c cVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        return y.f7779k;
    }

    @Override // g5.q
    public InterfaceC2102h b(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        kotlin.jvm.internal.l.f("location", aVar);
        return null;
    }

    @Override // g5.o
    public Set c() {
        Collection collectionE = e(f.f11739p, w5.b.f17095k);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionE) {
            if (obj instanceof C2266L) {
                W4.e name = ((C2266L) obj).getName();
                kotlin.jvm.internal.l.e("getName(...)", name);
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // g5.o
    public Set d() {
        Collection collectionE = e(f.f11740q, w5.b.f17095k);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionE) {
            if (obj instanceof C2266L) {
                W4.e name = ((C2266L) obj).getName();
                kotlin.jvm.internal.l.e("getName(...)", name);
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // g5.q
    public Collection e(f fVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        return y.f7779k;
    }

    @Override // g5.o
    public Collection f(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        return y.f7779k;
    }

    @Override // g5.o
    public Set g() {
        return null;
    }
}
