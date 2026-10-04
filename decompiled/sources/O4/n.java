package O4;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n {
    public final t a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7577b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7578c;

    /* renamed from: d, reason: collision with root package name */
    public final n f7579d;

    public n(t tVar, ArrayList arrayList, String str) {
        this.a = tVar;
        this.f7577b = arrayList;
        this.f7578c = str;
        n nVar = null;
        if (str != null) {
            t tVarA = tVar != null ? tVar.a() : null;
            ArrayList arrayList2 = new ArrayList(P3.r.p(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t tVar2 = (t) it.next();
                arrayList2.add(tVar2 != null ? tVar2.a() : null);
            }
            nVar = new n(tVarA, arrayList2, null);
        }
        this.f7579d = nVar;
    }
}
