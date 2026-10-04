package T2;

import m0.AbstractC1507b;

/* loaded from: classes.dex */
public final class e extends g {
    public final AbstractC1507b a;

    public e(AbstractC1507b abstractC1507b) {
        this.a = abstractC1507b;
    }

    @Override // T2.g
    public final AbstractC1507b a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && kotlin.jvm.internal.l.a(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        AbstractC1507b abstractC1507b = this.a;
        if (abstractC1507b == null) {
            return 0;
        }
        return abstractC1507b.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.a + ')';
    }
}
