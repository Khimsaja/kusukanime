package p;

/* loaded from: classes.dex */
public final class r0 implements q0 {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14095b;

    public r0(Object obj, Object obj2) {
        this.a = obj;
        this.f14095b = obj2;
    }

    @Override // p.q0
    public final Object a() {
        return this.a;
    }

    @Override // p.q0
    public final Object c() {
        return this.f14095b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (kotlin.jvm.internal.l.a(this.a, q0Var.a())) {
            return kotlin.jvm.internal.l.a(this.f14095b, q0Var.c());
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f14095b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
