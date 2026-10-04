package j3;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: j3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1330p extends W implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final i3.d f12370k;

    /* renamed from: l, reason: collision with root package name */
    public final W f12371l;

    public C1330p(i3.d dVar, W w7) {
        this.f12370k = dVar;
        this.f12371l = w7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        i3.d dVar = this.f12370k;
        return this.f12371l.compare(dVar.apply(obj), dVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1330p) {
            C1330p c1330p = (C1330p) obj;
            if (this.f12370k.equals(c1330p.f12370k) && this.f12371l.equals(c1330p.f12371l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12370k, this.f12371l});
    }

    public final String toString() {
        return this.f12371l + ".onResultOf(" + this.f12370k + ")";
    }
}
