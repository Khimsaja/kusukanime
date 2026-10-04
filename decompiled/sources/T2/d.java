package T2;

import d3.C0793e;
import m0.AbstractC1507b;

/* loaded from: classes.dex */
public final class d extends g {
    public final AbstractC1507b a;

    /* renamed from: b, reason: collision with root package name */
    public final C0793e f8997b;

    public d(AbstractC1507b abstractC1507b, C0793e c0793e) {
        this.a = abstractC1507b;
        this.f8997b = c0793e;
    }

    @Override // T2.g
    public final AbstractC1507b a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.l.a(this.a, dVar.a) && kotlin.jvm.internal.l.a(this.f8997b, dVar.f8997b);
    }

    public final int hashCode() {
        AbstractC1507b abstractC1507b = this.a;
        return this.f8997b.hashCode() + ((abstractC1507b == null ? 0 : abstractC1507b.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.a + ", result=" + this.f8997b + ')';
    }
}
