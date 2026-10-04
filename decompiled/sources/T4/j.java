package T4;

import p.AbstractC1755i;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final j f9112d = new j(256, 256, 256);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9113b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9114c;

    public j(int i7, int i8, int i9) {
        this.a = i7;
        this.f9113b = i8;
        this.f9114c = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.f9113b == jVar.f9113b && this.f9114c == jVar.f9114c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9114c) + AbstractC1755i.a(this.f9113b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        int i7 = this.f9113b;
        int i8 = this.a;
        int i9 = this.f9114c;
        if (i9 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(i8);
            sb.append('.');
            sb.append(i7);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i8);
        sb2.append('.');
        sb2.append(i7);
        sb2.append('.');
        sb2.append(i9);
        return sb2.toString();
    }
}
