package G3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class h extends j {

    /* renamed from: c, reason: collision with root package name */
    public static final C0181a f2804c = new C0181a(2);
    public final j a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2805b;

    public h(j jVar, int i7) {
        this.f2805b = i7;
        this.a = jVar;
    }

    @Override // G3.j
    public Object a(m mVar) {
        Collection arrayList;
        switch (this.f2805b) {
            case 0:
                arrayList = new ArrayList();
                break;
            default:
                arrayList = new LinkedHashSet();
                break;
        }
        mVar.b();
        while (mVar.m()) {
            arrayList.add(this.a.a(mVar));
        }
        mVar.g();
        return arrayList;
    }

    @Override // G3.j
    public void c(p pVar, Object obj) {
        pVar.b();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            this.a.c(pVar, it.next());
        }
        ((o) pVar).H(1, 2, ']');
    }

    public final String toString() {
        return this.a + ".collection()";
    }
}
