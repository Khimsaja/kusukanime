package y1;

import java.util.Objects;
import v.c0;

/* loaded from: classes.dex */
public final class N {
    public Integer a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17947b;

    /* renamed from: c, reason: collision with root package name */
    public int f17948c;

    /* renamed from: d, reason: collision with root package name */
    public long f17949d;

    /* renamed from: e, reason: collision with root package name */
    public long f17950e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17951f;

    /* renamed from: g, reason: collision with root package name */
    public C2380b f17952g = C2380b.f18024c;

    static {
        c0.d(0, 1, 2, 3, 4);
    }

    public final long a(int i7, int i8) {
        C2379a c2379aA = this.f17952g.a(i7);
        if (c2379aA.a != -1) {
            return c2379aA.f18022f[i8];
        }
        return -9223372036854775807L;
    }

    public final int b(long j7) {
        int i7;
        C2379a c2379aA;
        int i8;
        C2380b c2380b = this.f17952g;
        long j8 = this.f17949d;
        c2380b.getClass();
        if (j7 != Long.MIN_VALUE && (j8 == -9223372036854775807L || j7 < j8)) {
            int i9 = 0;
            while (true) {
                i7 = c2380b.a;
                if (i9 >= i7) {
                    break;
                }
                c2380b.a(i9).getClass();
                c2380b.a(i9).getClass();
                if (0 > j7 && ((i8 = (c2379aA = c2380b.a(i9)).a) == -1 || c2379aA.a(-1) < i8)) {
                    break;
                }
                i9++;
            }
            if (i9 < i7) {
                return i9;
            }
        }
        return -1;
    }

    public final int c(long j7) {
        C2380b c2380b = this.f17952g;
        int i7 = c2380b.a;
        int i8 = i7 - 1;
        if (i8 == i7 - 1) {
            c2380b.a(i8).getClass();
        }
        while (i8 >= 0 && j7 != Long.MIN_VALUE) {
            c2380b.a(i8).getClass();
            if (j7 >= 0) {
                break;
            }
            i8--;
        }
        if (i8 >= 0) {
            C2379a c2379aA = c2380b.a(i8);
            int i9 = c2379aA.a;
            if (i9 != -1) {
                for (int i10 = 0; i10 < i9; i10++) {
                    int i11 = c2379aA.f18021e[i10];
                    if (i11 != 0 && i11 != 1) {
                    }
                }
            }
            return i8;
        }
        return -1;
    }

    public final long d(int i7) {
        this.f17952g.a(i7).getClass();
        return 0L;
    }

    public final int e(int i7) {
        return this.f17952g.a(i7).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !N.class.equals(obj.getClass())) {
            return false;
        }
        N n7 = (N) obj;
        return Objects.equals(this.a, n7.a) && Objects.equals(this.f17947b, n7.f17947b) && this.f17948c == n7.f17948c && this.f17949d == n7.f17949d && this.f17950e == n7.f17950e && this.f17951f == n7.f17951f && Objects.equals(this.f17952g, n7.f17952g);
    }

    public final boolean f(int i7) {
        C2380b c2380b = this.f17952g;
        int i8 = c2380b.a;
        if (i7 != i8 - 1 || i7 != i8 - 1) {
            return false;
        }
        c2380b.a(i7).getClass();
        return false;
    }

    public final boolean g(int i7) {
        this.f17952g.a(i7).getClass();
        return false;
    }

    public final void h(Integer num, Object obj, int i7, long j7, long j8, C2380b c2380b, boolean z7) {
        this.a = num;
        this.f17947b = obj;
        this.f17948c = i7;
        this.f17949d = j7;
        this.f17950e = j8;
        this.f17952g = c2380b;
        this.f17951f = z7;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (217 + (num == null ? 0 : num.hashCode())) * 31;
        Object obj = this.f17947b;
        int iHashCode2 = (((iHashCode + (obj != null ? obj.hashCode() : 0)) * 31) + this.f17948c) * 31;
        long j7 = this.f17949d;
        int i7 = (iHashCode2 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f17950e;
        return this.f17952g.hashCode() + ((((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.f17951f ? 1 : 0)) * 31);
    }
}
