package v;

/* renamed from: v.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2143w extends AbstractC2123b {

    /* renamed from: h, reason: collision with root package name */
    public final a0.g f16515h;

    public C2143w(a0.g gVar) {
        this.f16515h = gVar;
    }

    @Override // v.AbstractC2123b
    public final int b(int i7, T0.k kVar) {
        return this.f16515h.a(0, i7, kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2143w) && kotlin.jvm.internal.l.a(this.f16515h, ((C2143w) obj).f16515h);
    }

    public final int hashCode() {
        return Float.hashCode(this.f16515h.a);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f16515h + ')';
    }
}
