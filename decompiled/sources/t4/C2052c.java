package t4;

/* renamed from: t4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2052c {
    public final W4.b a;

    /* renamed from: b, reason: collision with root package name */
    public final W4.b f16036b;

    /* renamed from: c, reason: collision with root package name */
    public final W4.b f16037c;

    public C2052c(W4.b bVar, W4.b bVar2, W4.b bVar3) {
        this.a = bVar;
        this.f16036b = bVar2;
        this.f16037c = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2052c)) {
            return false;
        }
        C2052c c2052c = (C2052c) obj;
        return kotlin.jvm.internal.l.a(this.a, c2052c.a) && kotlin.jvm.internal.l.a(this.f16036b, c2052c.f16036b) && kotlin.jvm.internal.l.a(this.f16037c, c2052c.f16037c);
    }

    public final int hashCode() {
        return this.f16037c.hashCode() + ((this.f16036b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.a + ", kotlinReadOnly=" + this.f16036b + ", kotlinMutable=" + this.f16037c + ')';
    }
}
