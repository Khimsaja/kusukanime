package O3;

/* loaded from: classes.dex */
public final class h implements Comparable {

    /* renamed from: k, reason: collision with root package name */
    public final int f7521k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7522l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7523m;

    /* renamed from: n, reason: collision with root package name */
    public final int f7524n;

    static {
        new h(2, 2, 20);
    }

    public h(int i7, int i8, int i9) {
        this.f7521k = i7;
        this.f7522l = i8;
        this.f7523m = i9;
        if (i7 >= 0 && i7 < 256 && i8 >= 0 && i8 < 256 && i9 >= 0 && i9 < 256) {
            this.f7524n = (i7 << 16) + (i8 << 8) + i9;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i7 + '.' + i8 + '.' + i9).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        kotlin.jvm.internal.l.f("other", hVar);
        return this.f7524n - hVar.f7524n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        h hVar = obj instanceof h ? (h) obj : null;
        return hVar != null && this.f7524n == hVar.f7524n;
    }

    public final int hashCode() {
        return this.f7524n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7521k);
        sb.append('.');
        sb.append(this.f7522l);
        sb.append('.');
        sb.append(this.f7523m);
        return sb.toString();
    }
}
