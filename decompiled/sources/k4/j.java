package k4;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: n, reason: collision with root package name */
    public static final j f12687n = new j(1, 0);

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (isEmpty() && ((j) obj).isEmpty()) {
            return true;
        }
        j jVar = (j) obj;
        if (this.f12680k == jVar.f12680k) {
            return this.f12681l == jVar.f12681l;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j7 = this.f12680k;
        long j8 = 31 * (j7 ^ (j7 >>> 32));
        long j9 = this.f12681l;
        return (int) (j8 + (j9 ^ (j9 >>> 32)));
    }

    public final boolean isEmpty() {
        return this.f12680k > this.f12681l;
    }

    public final String toString() {
        return this.f12680k + ".." + this.f12681l;
    }
}
