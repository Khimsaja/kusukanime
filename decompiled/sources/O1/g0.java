package O1;

import B1.AbstractC0015b;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: d, reason: collision with root package name */
    public static final g0 f7448d = new g0(new y1.Q[0]);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final j3.X f7449b;

    /* renamed from: c, reason: collision with root package name */
    public int f7450c;

    static {
        B1.K.B(0);
    }

    public g0(y1.Q... qArr) {
        this.f7449b = j3.G.t(qArr);
        this.a = qArr.length;
        int i7 = 0;
        while (true) {
            j3.X x7 = this.f7449b;
            if (i7 >= x7.f12306n) {
                return;
            }
            int i8 = i7 + 1;
            for (int i9 = i8; i9 < x7.f12306n; i9++) {
                if (((y1.Q) x7.get(i7)).equals(x7.get(i9))) {
                    AbstractC0015b.n("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i7 = i8;
        }
    }

    public final y1.Q a(int i7) {
        return (y1.Q) this.f7449b.get(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.a == g0Var.a && this.f7449b.equals(g0Var.f7449b);
    }

    public final int hashCode() {
        if (this.f7450c == 0) {
            this.f7450c = this.f7449b.hashCode();
        }
        return this.f7450c;
    }

    public final String toString() {
        return this.f7449b.toString();
    }
}
