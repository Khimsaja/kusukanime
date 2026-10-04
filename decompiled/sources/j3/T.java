package j3;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* loaded from: classes.dex */
public final class T extends AbstractC1329o implements Serializable {

    /* renamed from: n, reason: collision with root package name */
    public transient Map f12298n;

    /* renamed from: o, reason: collision with root package name */
    public transient int f12299o;

    /* renamed from: p, reason: collision with root package name */
    public transient S f12300p;

    @Override // j3.AbstractC1329o
    public final C1318d a() {
        C1318d c1318d = this.f12369m;
        if (c1318d != null) {
            return c1318d;
        }
        Map map = this.f12298n;
        C1318d c1320f = map instanceof NavigableMap ? new C1320f(this, (NavigableMap) map) : map instanceof SortedMap ? new C1323i(this, (SortedMap) map) : new C1318d(this, map);
        this.f12369m = c1320f;
        return c1320f;
    }

    public final void b() {
        Map map = this.f12298n;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f12299o = 0;
    }
}
