package D4;

import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b0 {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1568b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1569c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1570d;

    public b0(int i7, String str) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        this.a = i7;
        this.f1568b = new ArrayList(0);
        this.f1569c = new ArrayList(0);
        this.f1570d = new ArrayList(0);
        F4.k.a.getClass();
        List listA = F4.j.a();
        new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((F4.k) it.next()).getClass();
        }
    }
}
