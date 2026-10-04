package D4;

import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class X {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1538b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1539c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1540d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1541e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1542f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f1543g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1544h;

    public X(int i7, String str) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        this.a = i7;
        this.f1538b = new ArrayList(0);
        this.f1539c = new ArrayList(0);
        new ArrayList(0);
        this.f1540d = new ArrayList();
        this.f1541e = new ArrayList();
        this.f1542f = new ArrayList(0);
        this.f1543g = new ArrayList(0);
        F4.k.a.getClass();
        List listA = F4.j.a();
        ArrayList arrayList = new ArrayList(P3.r.p(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((G4.d) ((F4.k) it.next())).getClass();
            arrayList.add(new G4.c());
        }
        this.f1544h = arrayList;
    }
}
