package h0;

/* renamed from: h0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0964I extends AbstractC0966K {
    public final g0.d a;

    public C0964I(g0.d dVar) {
        this.a = dVar;
    }

    @Override // h0.AbstractC0966K
    public final g0.d a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0964I) {
            return kotlin.jvm.internal.l.a(this.a, ((C0964I) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
