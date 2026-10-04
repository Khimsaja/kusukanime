package T2;

import d3.C0803o;
import m0.AbstractC1507b;

/* loaded from: classes.dex */
public final class f extends g {
    public final AbstractC1507b a;

    /* renamed from: b, reason: collision with root package name */
    public final C0803o f8998b;

    public f(AbstractC1507b abstractC1507b, C0803o c0803o) {
        this.a = abstractC1507b;
        this.f8998b = c0803o;
    }

    @Override // T2.g
    public final AbstractC1507b a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.l.a(this.a, fVar.a) && kotlin.jvm.internal.l.a(this.f8998b, fVar.f8998b);
    }

    public final int hashCode() {
        return this.f8998b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.a + ", result=" + this.f8998b + ')';
    }
}
