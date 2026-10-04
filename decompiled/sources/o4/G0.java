package o4;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class G0 {
    public final WeakReference a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13636b;

    public G0(ClassLoader classLoader) {
        this.a = new WeakReference(classLoader);
        this.f13636b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof G0) && this.a.get() == ((G0) obj).a.get();
    }

    public final int hashCode() {
        return this.f13636b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
