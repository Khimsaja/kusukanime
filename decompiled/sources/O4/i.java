package O4;

import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class i {
    public final h a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7566b;

    public i(h hVar) {
        this.a = hVar;
        this.f7566b = false;
    }

    public static i a(i iVar, h hVar, boolean z7, int i7) {
        if ((i7 & 1) != 0) {
            hVar = iVar.a;
        }
        if ((i7 & 2) != 0) {
            z7 = iVar.f7566b;
        }
        iVar.getClass();
        kotlin.jvm.internal.l.f("qualifier", hVar);
        return new i(hVar, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && this.f7566b == iVar.f7566b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7566b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb.append(this.a);
        sb.append(", isForWarningOnly=");
        return AbstractC0703b.n(sb, this.f7566b, ')');
    }

    public i(h hVar, boolean z7) {
        this.a = hVar;
        this.f7566b = z7;
    }
}
