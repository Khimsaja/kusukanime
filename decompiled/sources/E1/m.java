package E1;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class m implements g {

    /* renamed from: l, reason: collision with root package name */
    public String f1902l;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1905o;

    /* renamed from: k, reason: collision with root package name */
    public final F.w f1901k = new F.w(13);

    /* renamed from: m, reason: collision with root package name */
    public int f1903m = 8000;

    /* renamed from: n, reason: collision with root package name */
    public int f1904n = 8000;

    public final void a(Map map) {
        F.w wVar = this.f1901k;
        synchronized (wVar) {
            wVar.f2038m = null;
            ((HashMap) wVar.f2037l).clear();
            ((HashMap) wVar.f2037l).putAll(map);
        }
    }

    @Override // E1.g
    public final h k() {
        return new p(this.f1902l, this.f1903m, this.f1904n, this.f1905o, this.f1901k);
    }
}
