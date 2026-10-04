package v4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import n5.C1583u;

/* loaded from: classes.dex */
public final class l implements h {

    /* renamed from: k, reason: collision with root package name */
    public final h f16660k;

    /* renamed from: l, reason: collision with root package name */
    public final C1583u f16661l;

    public l(h hVar, C1583u c1583u) {
        this.f16660k = hVar;
        this.f16661l = c1583u;
    }

    @Override // v4.h
    public final boolean d(W4.c cVar) {
        kotlin.jvm.internal.l.f("fqName", cVar);
        if (((Boolean) this.f16661l.invoke(cVar)).booleanValue()) {
            return this.f16660k.d(cVar);
        }
        return false;
    }

    @Override // v4.h
    public final boolean isEmpty() {
        h hVar = this.f16660k;
        if ((hVar instanceof Collection) && ((Collection) hVar).isEmpty()) {
            return false;
        }
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            W4.c cVarA = ((InterfaceC2154b) it.next()).a();
            if (cVarA != null && ((Boolean) this.f16661l.invoke(cVarA)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f16660k) {
            W4.c cVarA = ((InterfaceC2154b) obj).a();
            if (cVarA != null && ((Boolean) this.f16661l.invoke(cVarA)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // v4.h
    public final InterfaceC2154b l(W4.c cVar) {
        kotlin.jvm.internal.l.f("fqName", cVar);
        if (((Boolean) this.f16661l.invoke(cVar)).booleanValue()) {
            return this.f16660k.l(cVar);
        }
        return null;
    }
}
