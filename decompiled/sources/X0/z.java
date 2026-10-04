package X0;

import O.C0525y;
import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class z {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9763b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9764c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9765d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9766e;

    public z(int i7) {
        this(1, (i7 & 1) == 0, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.a == zVar.a && this.f9763b == zVar.f9763b && this.f9764c == zVar.f9764c && this.f9765d == zVar.f9765d && this.f9766e == zVar.f9766e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC0703b.d(AbstractC0703b.d(AbstractC0703b.d(AbstractC0703b.d(this.a * 31, 31, this.f9763b), 31, this.f9764c), 31, this.f9765d), 31, this.f9766e);
    }

    public z(int i7, boolean z7, boolean z8) {
        C0525y c0525y = k.a;
        int i8 = !z7 ? 262152 : 262144;
        i8 = i7 == 2 ? i8 | 8192 : i8;
        i8 = z8 ? i8 : i8 | 512;
        boolean z9 = i7 == 1;
        this.a = i8;
        this.f9763b = z9;
        this.f9764c = true;
        this.f9765d = true;
        this.f9766e = true;
    }
}
