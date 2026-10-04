package j3;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class e0 extends W implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final W f12346k;

    public e0(W w7) {
        this.f12346k = w7;
    }

    @Override // j3.W
    public final W a() {
        return this.f12346k;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f12346k.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            return this.f12346k.equals(((e0) obj).f12346k);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f12346k.hashCode();
    }

    public final String toString() {
        return this.f12346k + ".reverse()";
    }
}
