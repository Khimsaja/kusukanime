package B6;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class f implements z6.a {

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f559k = false;

    /* renamed from: l, reason: collision with root package name */
    public final ConcurrentHashMap f560l = new ConcurrentHashMap();

    /* renamed from: m, reason: collision with root package name */
    public final LinkedBlockingQueue f561m = new LinkedBlockingQueue();

    @Override // z6.a
    public final synchronized z6.b c(String str) {
        e eVar;
        eVar = (e) this.f560l.get(str);
        if (eVar == null) {
            eVar = new e(str, this.f561m, this.f559k);
            this.f560l.put(str, eVar);
        }
        return eVar;
    }
}
