package n5;

/* loaded from: classes.dex */
public final class O {
    public final u4.Q a;

    /* renamed from: b, reason: collision with root package name */
    public final M4.a f13376b;

    public O(u4.Q q6, M4.a aVar) {
        kotlin.jvm.internal.l.f("typeParameter", q6);
        kotlin.jvm.internal.l.f("typeAttr", aVar);
        this.a = q6;
        this.f13376b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof O)) {
            return false;
        }
        O o7 = (O) obj;
        return kotlin.jvm.internal.l.a(o7.a, this.a) && kotlin.jvm.internal.l.a(o7.f13376b, this.f13376b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        return this.f13376b.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.a + ", typeAttr=" + this.f13376b + ')';
    }
}
