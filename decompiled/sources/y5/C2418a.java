package y5;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: y5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2418a implements h {
    public final AtomicReference a;

    public C2418a(h hVar) {
        this.a = new AtomicReference(hVar);
    }

    @Override // y5.h
    public final Iterator iterator() {
        h hVar = (h) this.a.getAndSet(null);
        if (hVar != null) {
            return hVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
