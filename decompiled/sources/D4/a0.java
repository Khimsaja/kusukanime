package D4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a0 {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public n6.d f1561b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1562c = new ArrayList(0);

    /* renamed from: d, reason: collision with root package name */
    public a0 f1563d;

    /* renamed from: e, reason: collision with root package name */
    public a0 f1564e;

    /* renamed from: f, reason: collision with root package name */
    public W f1565f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f1566g;

    public a0(int i7) {
        this.a = i7;
        F4.k.a.getClass();
        List listA = F4.j.a();
        ArrayList arrayList = new ArrayList(P3.r.p(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((G4.d) ((F4.k) it.next())).getClass();
            arrayList.add(new G4.f());
        }
        this.f1566g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.metadata.KmType", obj);
        a0 a0Var = (a0) obj;
        if (this.a != a0Var.a) {
            return false;
        }
        n6.d dVar = this.f1561b;
        if (dVar == null) {
            kotlin.jvm.internal.l.l("classifier");
            throw null;
        }
        n6.d dVar2 = a0Var.f1561b;
        if (dVar2 != null) {
            return dVar.equals(dVar2) && kotlin.jvm.internal.l.a(this.f1562c, a0Var.f1562c) && kotlin.jvm.internal.l.a(this.f1564e, a0Var.f1564e) && kotlin.jvm.internal.l.a(this.f1563d, a0Var.f1563d) && kotlin.jvm.internal.l.a(this.f1565f, a0Var.f1565f) && kotlin.jvm.internal.l.a(this.f1566g, a0Var.f1566g);
        }
        kotlin.jvm.internal.l.l("classifier");
        throw null;
    }

    public final int hashCode() {
        int i7 = this.a * 31;
        n6.d dVar = this.f1561b;
        if (dVar != null) {
            return this.f1562c.hashCode() + ((dVar.hashCode() + i7) * 31);
        }
        kotlin.jvm.internal.l.l("classifier");
        throw null;
    }
}
