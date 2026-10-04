package D4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Q {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1526b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1527c = new ArrayList(0);

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1528d = new ArrayList(0);

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1529e;

    public Q(int i7) {
        this.a = i7;
        F4.k.a.getClass();
        List listA = F4.j.a();
        ArrayList arrayList = new ArrayList(P3.r.p(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((G4.d) ((F4.k) it.next())).getClass();
            arrayList.add(new G4.b());
        }
        this.f1529e = arrayList;
    }
}
