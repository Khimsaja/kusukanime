package t2;

import s2.C1979g;

/* renamed from: t2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2041g extends C1979g implements Comparable {

    /* renamed from: u, reason: collision with root package name */
    public long f15965u;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2041g c2041g = (C2041g) obj;
        if (c(4) != c2041g.c(4)) {
            return c(4) ? 1 : -1;
        }
        long j7 = this.f2611q - c2041g.f2611q;
        if (j7 == 0) {
            j7 = this.f15965u - c2041g.f15965u;
            if (j7 == 0) {
                return 0;
            }
        }
        return j7 > 0 ? 1 : -1;
    }
}
