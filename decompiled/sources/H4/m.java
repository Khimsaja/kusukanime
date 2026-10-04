package H4;

import b1.AbstractC0703b;
import java.util.Collection;

/* loaded from: classes.dex */
public final class m {
    public final O4.i a;

    /* renamed from: b, reason: collision with root package name */
    public final Collection f3734b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3735c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3736d;

    public m(O4.i iVar, Collection collection, boolean z7, boolean z8) {
        kotlin.jvm.internal.l.f("qualifierApplicabilityTypes", collection);
        this.a = iVar;
        this.f3734b = collection;
        this.f3735c = z7;
        this.f3736d = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.l.a(this.a, mVar.a) && kotlin.jvm.internal.l.a(this.f3734b, mVar.f3734b) && this.f3735c == mVar.f3735c && this.f3736d == mVar.f3736d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3736d) + AbstractC0703b.d((this.f3734b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.f3735c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.a);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.f3734b);
        sb.append(", definitelyNotNull=");
        sb.append(this.f3735c);
        sb.append(", preferQualifierOverBound=");
        return AbstractC0703b.n(sb, this.f3736d, ')');
    }

    public m(O4.i iVar, Collection collection, int i7) {
        this(iVar, collection, iVar.a == O4.h.f7564m, (i7 & 8) == 0);
    }
}
