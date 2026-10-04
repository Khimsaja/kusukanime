package H4;

/* loaded from: classes.dex */
public final class C {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final W4.e f3687b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3688c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3689d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3690e;

    public C(String str, W4.e eVar, String str2, String str3) {
        kotlin.jvm.internal.l.f("classInternalName", str);
        this.a = str;
        this.f3687b = eVar;
        this.f3688c = str2;
        this.f3689d = str3;
        String str4 = eVar + '(' + str2 + ')' + str3;
        kotlin.jvm.internal.l.f("jvmDescriptor", str4);
        this.f3690e = str + '.' + str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c2 = (C) obj;
        return kotlin.jvm.internal.l.a(this.a, c2.a) && kotlin.jvm.internal.l.a(this.f3687b, c2.f3687b) && kotlin.jvm.internal.l.a(this.f3688c, c2.f3688c) && kotlin.jvm.internal.l.a(this.f3689d, c2.f3689d);
    }

    public final int hashCode() {
        return this.f3689d.hashCode() + A6.b.b(this.f3688c, (this.f3687b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.f3687b);
        sb.append(", parameters=");
        sb.append(this.f3688c);
        sb.append(", returnType=");
        return A6.b.j(sb, this.f3689d, ')');
    }
}
