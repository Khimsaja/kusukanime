package X0;

import b1.AbstractC0703b;
import p.AbstractC1755i;

/* loaded from: classes.dex */
public final class q {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9731b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9732c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9733d;

    public q(boolean z7, boolean z8, int i7, boolean z9, boolean z10) {
        this.a = z7;
        this.f9731b = z8;
        this.f9732c = z9;
        this.f9733d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && this.f9731b == qVar.f9731b && this.f9732c == qVar.f9732c && this.f9733d == qVar.f9733d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9733d) + AbstractC0703b.d((AbstractC1755i.b(1) + AbstractC0703b.d(Boolean.hashCode(this.a) * 31, 31, this.f9731b)) * 31, 31, this.f9732c);
    }

    public q(int i7) {
        this(true, (i7 & 2) != 0, 1, true, true);
    }
}
