package j3;

import java.io.Serializable;

/* renamed from: j3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1335v extends W implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final B2.e f12393k;

    public C1335v(B2.e eVar) {
        this.f12393k = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f12393k.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1335v) {
            return this.f12393k.equals(((C1335v) obj).f12393k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12393k.hashCode();
    }

    public final String toString() {
        return this.f12393k.toString();
    }
}
