package s4;

import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class l {
    public final k a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15835b;

    public l(k kVar, int i7) {
        this.a = kVar;
        this.f15835b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.l.a(this.a, lVar.a) && this.f15835b == lVar.f15835b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15835b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KindWithArity(kind=");
        sb.append(this.a);
        sb.append(", arity=");
        return AbstractC0703b.l(sb, this.f15835b, ')');
    }
}
