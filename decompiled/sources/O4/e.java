package O4;

import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f7554e = new e(null, false);
    public final h a;

    /* renamed from: b, reason: collision with root package name */
    public final f f7555b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7556c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7557d;

    public e(h hVar, f fVar, boolean z7, boolean z8) {
        this.a = hVar;
        this.f7555b = fVar;
        this.f7556c = z7;
        this.f7557d = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.f7555b == eVar.f7555b && this.f7556c == eVar.f7556c && this.f7557d == eVar.f7557d;
    }

    public final int hashCode() {
        h hVar = this.a;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        f fVar = this.f7555b;
        return Boolean.hashCode(this.f7557d) + AbstractC0703b.d((iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 31, 31, this.f7556c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaTypeQualifiers(nullability=");
        sb.append(this.a);
        sb.append(", mutability=");
        sb.append(this.f7555b);
        sb.append(", definitelyNotNull=");
        sb.append(this.f7556c);
        sb.append(", isNullabilityQualifierForWarning=");
        return AbstractC0703b.n(sb, this.f7557d, ')');
    }

    public /* synthetic */ e(h hVar, boolean z7) {
        this(hVar, null, z7, false);
    }
}
