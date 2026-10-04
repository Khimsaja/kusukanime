package j5;

/* renamed from: j5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1351f {
    public final W4.b a;

    /* renamed from: b, reason: collision with root package name */
    public final C1349d f12411b;

    public C1351f(W4.b bVar, C1349d c1349d) {
        kotlin.jvm.internal.l.f("classId", bVar);
        this.a = bVar;
        this.f12411b = c1349d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1351f) {
            return kotlin.jvm.internal.l.a(this.a, ((C1351f) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
