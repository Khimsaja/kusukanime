package kotlin.jvm.internal;

/* loaded from: classes.dex */
public final class q implements InterfaceC1404d {

    /* renamed from: k, reason: collision with root package name */
    public final Class f12715k;

    public q(Class cls) {
        l.f("jClass", cls);
        this.f12715k = cls;
    }

    @Override // kotlin.jvm.internal.InterfaceC1404d
    public final Class d() {
        return this.f12715k;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return l.a(this.f12715k, ((q) obj).f12715k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12715k.hashCode();
    }

    public final String toString() {
        return this.f12715k.toString() + " (Kotlin reflection is not available)";
    }
}
