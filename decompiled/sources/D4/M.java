package D4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class M {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public String f1507b;

    /* renamed from: m, reason: collision with root package name */
    public a0 f1518m;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f1522q;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1508c = new ArrayList(0);

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1509d = new ArrayList(1);

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1510e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1511f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f1512g = new ArrayList(0);

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1513h = new ArrayList(1);

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f1514i = new ArrayList(0);

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f1515j = new ArrayList(0);

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f1516k = new ArrayList(0);

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1517l = new ArrayList(0);

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1519n = new ArrayList(0);

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f1520o = new ArrayList(0);

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f1521p = new ArrayList(0);

    public M() {
        F4.k.a.getClass();
        List listA = F4.j.a();
        ArrayList arrayList = new ArrayList(P3.r.p(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((G4.d) ((F4.k) it.next())).getClass();
            arrayList.add(new G4.a());
        }
        this.f1522q = arrayList;
    }
}
