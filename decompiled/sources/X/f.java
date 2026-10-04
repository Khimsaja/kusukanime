package X;

import D.C0042b;
import O.S0;
import java.util.Map;

/* loaded from: classes.dex */
public final class f {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9682b = true;

    /* renamed from: c, reason: collision with root package name */
    public final k f9683c;

    public f(g gVar, Object obj) {
        this.a = obj;
        Map map = (Map) gVar.a.get(obj);
        C0042b c0042b = new C0042b(21, gVar);
        S0 s02 = l.a;
        this.f9683c = new k(map, c0042b);
    }
}
