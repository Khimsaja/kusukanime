package S3;

import e4.n;
import java.io.Serializable;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class i implements h, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public static final i f8767k = new i();

    @Override // S3.h
    public final f get(g gVar) {
        l.f("key", gVar);
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // S3.h
    public final h minusKey(g gVar) {
        l.f("key", gVar);
        return this;
    }

    @Override // S3.h
    public final h plus(h hVar) {
        l.f("context", hVar);
        return hVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // S3.h
    public final Object fold(Object obj, n nVar) {
        return obj;
    }
}
