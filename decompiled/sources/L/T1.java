package L;

import b1.AbstractC0703b;
import h0.C0998u;
import y0.InterfaceC2366m;

/* loaded from: classes.dex */
public final class T1 implements q.S {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5360b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5361c;

    public T1(boolean z7, float f5, long j7) {
        this.a = z7;
        this.f5360b = f5;
        this.f5361c = j7;
    }

    @Override // q.S
    public final InterfaceC2366m b(u.j jVar) {
        Y y7 = new Y(this);
        return new C0348a0(jVar, this.a, this.f5360b, y7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T1)) {
            return false;
        }
        T1 t12 = (T1) obj;
        if (this.a == t12.a && T0.e.a(this.f5360b, t12.f5360b)) {
            return C0998u.c(this.f5361c, t12.f5361c);
        }
        return false;
    }

    public final int hashCode() {
        int iB = AbstractC0703b.b(this.f5360b, Boolean.hashCode(this.a) * 31, 961);
        int i7 = C0998u.f11835h;
        return Long.hashCode(this.f5361c) + iB;
    }
}
