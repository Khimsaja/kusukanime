package j5;

/* renamed from: j5.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1360o {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final T4.f f12448b;

    /* renamed from: c, reason: collision with root package name */
    public final T4.f f12449c;

    /* renamed from: d, reason: collision with root package name */
    public final T4.f f12450d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12451e;

    public C1360o(Object obj, T4.f fVar, T4.f fVar2, T4.f fVar3, String str) {
        kotlin.jvm.internal.l.f("filePath", str);
        this.a = obj;
        this.f12448b = fVar;
        this.f12449c = fVar2;
        this.f12450d = fVar3;
        this.f12451e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1360o)) {
            return false;
        }
        C1360o c1360o = (C1360o) obj;
        return this.a.equals(c1360o.a) && kotlin.jvm.internal.l.a(this.f12448b, c1360o.f12448b) && kotlin.jvm.internal.l.a(this.f12449c, c1360o.f12449c) && this.f12450d.equals(c1360o.f12450d) && kotlin.jvm.internal.l.a(this.f12451e, c1360o.f12451e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        T4.f fVar = this.f12448b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        T4.f fVar2 = this.f12449c;
        return this.f12451e.hashCode() + ((this.f12450d.hashCode() + ((iHashCode2 + (fVar2 != null ? fVar2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.a);
        sb.append(", compilerVersion=");
        sb.append(this.f12448b);
        sb.append(", languageVersion=");
        sb.append(this.f12449c);
        sb.append(", expectedVersion=");
        sb.append(this.f12450d);
        sb.append(", filePath=");
        return A6.b.j(sb, this.f12451e, ')');
    }
}
