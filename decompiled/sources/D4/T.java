package D4;

import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class T {
    public final ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1531b;

    public T(int i7) {
        switch (i7) {
            case 2:
                this.a = new ArrayList();
                this.f1531b = new ArrayList();
                break;
            default:
                this.a = new ArrayList(0);
                this.f1531b = new ArrayList(0);
                break;
        }
    }

    public T(int i7, String str, e0 e0Var) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        this.a = new ArrayList(1);
        F4.k.a.getClass();
        List listA = F4.j.a();
        ArrayList arrayList = new ArrayList(P3.r.p(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((G4.d) ((F4.k) it.next())).getClass();
            arrayList.add(new G4.g());
        }
        this.f1531b = arrayList;
    }
}
