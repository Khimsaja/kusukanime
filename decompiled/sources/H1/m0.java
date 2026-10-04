package H1;

import B1.AbstractC0015b;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f3541c;
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3542b;

    static {
        m0 m0Var = new m0(0L, 0L);
        new m0(Long.MAX_VALUE, Long.MAX_VALUE);
        new m0(Long.MAX_VALUE, 0L);
        new m0(0L, Long.MAX_VALUE);
        f3541c = m0Var;
    }

    public m0(long j7, long j8) {
        AbstractC0015b.c(j7 >= 0);
        AbstractC0015b.c(j8 >= 0);
        this.a = j7;
        this.f3542b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m0.class == obj.getClass()) {
            m0 m0Var = (m0) obj;
            if (this.a == m0Var.a && this.f3542b == m0Var.f3542b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.f3542b);
    }
}
