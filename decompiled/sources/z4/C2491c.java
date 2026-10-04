package z4;

import kotlin.jvm.internal.l;
import z5.AbstractC2517v;

/* renamed from: z4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2491c {
    public final Class a;

    /* renamed from: b, reason: collision with root package name */
    public final Q4.b f19031b;

    public C2491c(Class cls, Q4.b bVar) {
        this.a = cls;
        this.f19031b = bVar;
    }

    public final String a() {
        return AbstractC2517v.Q(this.a.getName(), '.', '/').concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2491c) {
            return l.a(this.a, ((C2491c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return C2491c.class.getName() + ": " + this.a;
    }
}
