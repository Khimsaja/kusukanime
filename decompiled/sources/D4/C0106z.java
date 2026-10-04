package D4;

/* renamed from: D4.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106z extends L {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1632b;

    public C0106z(String str, String str2) {
        kotlin.jvm.internal.l.f("enumClassName", str);
        kotlin.jvm.internal.l.f("enumEntryName", str2);
        this.a = str;
        this.f1632b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0106z)) {
            return false;
        }
        C0106z c0106z = (C0106z) obj;
        return kotlin.jvm.internal.l.a(this.a, c0106z.a) && kotlin.jvm.internal.l.a(this.f1632b, c0106z.f1632b);
    }

    public final int hashCode() {
        return this.f1632b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EnumValue(");
        sb.append(this.a);
        sb.append('.');
        return A6.b.j(sb, this.f1632b, ')');
    }
}
