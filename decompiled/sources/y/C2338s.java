package y;

import D.C0068o;
import java.util.LinkedHashMap;

/* renamed from: y.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2338s {
    public final X.c a;

    /* renamed from: b, reason: collision with root package name */
    public final C0068o f17640b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f17641c = new LinkedHashMap();

    public C2338s(X.c cVar, C0068o c0068o) {
        this.a = cVar;
        this.f17640b = c0068o;
    }

    public final e4.n a(int i7, Object obj, Object obj2) {
        LinkedHashMap linkedHashMap = this.f17641c;
        C2337r c2337r = (C2337r) linkedHashMap.get(obj);
        if (c2337r != null && c2337r.f17637c == i7 && kotlin.jvm.internal.l.a(c2337r.f17636b, obj2)) {
            W.a aVar = c2337r.f17638d;
            if (aVar != null) {
                return aVar;
            }
            W.a aVar2 = new W.a(true, 1403994769, new H.M(19, c2337r.f17639e, c2337r));
            c2337r.f17638d = aVar2;
            return aVar2;
        }
        C2337r c2337r2 = new C2337r(this, i7, obj, obj2);
        linkedHashMap.put(obj, c2337r2);
        W.a aVar3 = c2337r2.f17638d;
        if (aVar3 != null) {
            return aVar3;
        }
        W.a aVar4 = new W.a(true, 1403994769, new H.M(19, this, c2337r2));
        c2337r2.f17638d = aVar4;
        return aVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        C2337r c2337r = (C2337r) this.f17641c.get(obj);
        if (c2337r != null) {
            return c2337r.f17636b;
        }
        InterfaceC2339t interfaceC2339t = (InterfaceC2339t) this.f17640b.invoke();
        int iA = interfaceC2339t.a(obj);
        if (iA != -1) {
            return interfaceC2339t.d(iA);
        }
        return null;
    }
}
