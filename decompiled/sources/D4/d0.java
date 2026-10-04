package D4;

import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d0 {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1575b;

    public d0(int i7, String str) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        this.a = i7;
        this.f1575b = new ArrayList(0);
        F4.k.a.getClass();
        List listA = F4.j.a();
        new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((F4.k) it.next()).getClass();
        }
    }
}
