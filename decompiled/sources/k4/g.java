package k4;

/* loaded from: classes.dex */
public final class g extends C1396e {

    /* renamed from: n, reason: collision with root package name */
    public static final g f12679n = new g(1, 0, 1);

    @Override // k4.C1396e
    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (isEmpty() && ((g) obj).isEmpty()) {
            return true;
        }
        g gVar = (g) obj;
        if (this.f12672k == gVar.f12672k) {
            return this.f12673l == gVar.f12673l;
        }
        return false;
    }

    public final boolean h(int i7) {
        return this.f12672k <= i7 && i7 <= this.f12673l;
    }

    @Override // k4.C1396e
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f12672k * 31) + this.f12673l;
    }

    @Override // k4.C1396e
    public final boolean isEmpty() {
        return this.f12672k > this.f12673l;
    }

    @Override // k4.C1396e
    public final String toString() {
        return this.f12672k + ".." + this.f12673l;
    }
}
