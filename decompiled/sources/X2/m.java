package X2;

/* loaded from: classes.dex */
public final class m extends e {
    public final U2.m a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9826b;

    /* renamed from: c, reason: collision with root package name */
    public final U2.e f9827c;

    public m(U2.m mVar, String str, U2.e eVar) {
        this.a = mVar;
        this.f9826b = str;
        this.f9827c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.l.a(this.a, mVar.a) && kotlin.jvm.internal.l.a(this.f9826b, mVar.f9826b) && this.f9827c == mVar.f9827c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.f9826b;
        return this.f9827c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
