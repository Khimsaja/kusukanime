package f6;

import f.AbstractC0847h;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: f6.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0910h {

    /* renamed from: c, reason: collision with root package name */
    public static final C0910h f11548c = new C0910h(P3.q.X0(new ArrayList()), null);
    public final Set a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0847h f11549b;

    public C0910h(Set set, AbstractC0847h abstractC0847h) {
        this.a = set;
        this.f11549b = abstractC0847h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0910h)) {
            return false;
        }
        C0910h c0910h = (C0910h) obj;
        return kotlin.jvm.internal.l.a(c0910h.a, this.a) && kotlin.jvm.internal.l.a(c0910h.f11549b, this.f11549b);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        AbstractC0847h abstractC0847h = this.f11549b;
        return iHashCode + (abstractC0847h != null ? abstractC0847h.hashCode() : 0);
    }
}
