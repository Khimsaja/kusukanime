package L;

/* renamed from: L.f2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370f2 {
    public final C.d a;

    /* renamed from: b, reason: collision with root package name */
    public final C.d f5550b;

    /* renamed from: c, reason: collision with root package name */
    public final C.d f5551c;

    /* renamed from: d, reason: collision with root package name */
    public final C.d f5552d;

    /* renamed from: e, reason: collision with root package name */
    public final C.d f5553e;

    public C0370f2(C.d dVar, C.d dVar2, C.d dVar3, C.d dVar4, C.d dVar5) {
        this.a = dVar;
        this.f5550b = dVar2;
        this.f5551c = dVar3;
        this.f5552d = dVar4;
        this.f5553e = dVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0370f2)) {
            return false;
        }
        C0370f2 c0370f2 = (C0370f2) obj;
        return kotlin.jvm.internal.l.a(this.a, c0370f2.a) && kotlin.jvm.internal.l.a(this.f5550b, c0370f2.f5550b) && kotlin.jvm.internal.l.a(this.f5551c, c0370f2.f5551c) && kotlin.jvm.internal.l.a(this.f5552d, c0370f2.f5552d) && kotlin.jvm.internal.l.a(this.f5553e, c0370f2.f5553e);
    }

    public final int hashCode() {
        return this.f5553e.hashCode() + ((this.f5552d.hashCode() + ((this.f5551c.hashCode() + ((this.f5550b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.f5550b + ", medium=" + this.f5551c + ", large=" + this.f5552d + ", extraLarge=" + this.f5553e + ')';
    }
}
