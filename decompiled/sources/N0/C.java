package N0;

import H0.C0214f;

/* loaded from: classes.dex */
public final class C {
    public final C0214f a;

    /* renamed from: b, reason: collision with root package name */
    public final q f6851b;

    public C(C0214f c0214f, q qVar) {
        this.a = c0214f;
        this.f6851b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c2 = (C) obj;
        return kotlin.jvm.internal.l.a(this.a, c2.a) && kotlin.jvm.internal.l.a(this.f6851b, c2.f6851b);
    }

    public final int hashCode() {
        return this.f6851b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.f6851b + ')';
    }
}
