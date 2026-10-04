package y;

import java.util.Iterator;
import java.util.Map;

/* renamed from: y.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2314N extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public static final C2314N f17595l = new C2314N(2);

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        C2315O c2315o = (C2315O) obj2;
        X.c cVar = (X.c) c2315o.f17596b.getValue();
        if (cVar != null) {
            Iterator it = c2315o.f17597c.iterator();
            while (it.hasNext()) {
                cVar.e(it.next());
            }
        }
        Map mapA = c2315o.a.a();
        if (mapA.isEmpty()) {
            return null;
        }
        return mapA;
    }
}
