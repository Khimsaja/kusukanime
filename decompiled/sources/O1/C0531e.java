package O1;

import y1.C2380b;

/* renamed from: O1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0531e extends AbstractC0543q {

    /* renamed from: c, reason: collision with root package name */
    public final long f7431c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7432d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7433e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7434f;

    public C0531e(y1.P p7, long j7, long j8) throws C0532f {
        super(p7);
        if (j8 != Long.MIN_VALUE && j8 < j7) {
            throw new C0532f(2, j7, j8);
        }
        boolean z7 = false;
        if (p7.h() != 1) {
            throw new C0532f(0);
        }
        y1.O oM = p7.m(0, new y1.O(), 0L);
        long jMax = Math.max(0L, j7);
        if (!oM.f17963j && jMax != 0 && !oM.f17960g) {
            throw new C0532f(1);
        }
        long jMax2 = j8 == Long.MIN_VALUE ? oM.f17965l : Math.max(0L, j8);
        long j9 = oM.f17965l;
        if (j9 != -9223372036854775807L) {
            jMax2 = jMax2 > j9 ? j9 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.f7431c = jMax;
        this.f7432d = jMax2;
        this.f7433e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (oM.f17961h && (jMax2 == -9223372036854775807L || (j9 != -9223372036854775807L && jMax2 == j9))) {
            z7 = true;
        }
        this.f7434f = z7;
    }

    @Override // O1.AbstractC0543q, y1.P
    public final y1.N f(int i7, y1.N n7, boolean z7) {
        this.f7481b.f(0, n7, z7);
        long j7 = n7.f17950e - this.f7431c;
        long j8 = this.f7433e;
        n7.h(n7.a, n7.f17947b, 0, j8 != -9223372036854775807L ? j8 - j7 : -9223372036854775807L, j7, C2380b.f18024c, false);
        return n7;
    }

    @Override // O1.AbstractC0543q, y1.P
    public final y1.O m(int i7, y1.O o7, long j7) {
        this.f7481b.m(0, o7, 0L);
        long j8 = o7.f17968o;
        long j9 = this.f7431c;
        o7.f17968o = j8 + j9;
        o7.f17965l = this.f7433e;
        o7.f17961h = this.f7434f;
        long j10 = o7.f17964k;
        if (j10 != -9223372036854775807L) {
            long jMax = Math.max(j10, j9);
            o7.f17964k = jMax;
            long j11 = this.f7432d;
            if (j11 != -9223372036854775807L) {
                jMax = Math.min(jMax, j11);
            }
            o7.f17964k = jMax - j9;
        }
        long jP = B1.K.P(j9);
        long j12 = o7.f17957d;
        if (j12 != -9223372036854775807L) {
            o7.f17957d = j12 + jP;
        }
        long j13 = o7.f17958e;
        if (j13 != -9223372036854775807L) {
            o7.f17958e = j13 + jP;
        }
        return o7;
    }
}
