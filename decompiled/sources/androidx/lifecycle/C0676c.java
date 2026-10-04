package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0676c {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f10728b;

    public C0676c(Method method, int i7) throws SecurityException {
        this.a = i7;
        this.f10728b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0676c)) {
            return false;
        }
        C0676c c0676c = (C0676c) obj;
        return this.a == c0676c.a && this.f10728b.getName().equals(c0676c.f10728b.getName());
    }

    public final int hashCode() {
        return this.f10728b.getName().hashCode() + (this.a * 31);
    }
}
