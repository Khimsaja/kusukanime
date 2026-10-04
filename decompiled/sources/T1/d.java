package T1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d {
    public long a;

    /* renamed from: b, reason: collision with root package name */
    public long f8860b;

    /* renamed from: c, reason: collision with root package name */
    public long f8861c;

    /* renamed from: d, reason: collision with root package name */
    public long f8862d;

    /* renamed from: e, reason: collision with root package name */
    public long f8863e;

    /* renamed from: f, reason: collision with root package name */
    public long f8864f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f8865g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    public int f8866h;

    public final boolean a() {
        return this.f8862d > 15 && this.f8866h == 0;
    }

    public final void b(long j7) {
        long j8 = this.f8862d;
        if (j8 == 0) {
            this.a = j7;
        } else if (j8 == 1) {
            long j9 = j7 - this.a;
            this.f8860b = j9;
            this.f8864f = j9;
            this.f8863e = 1L;
        } else {
            long j10 = j7 - this.f8861c;
            int i7 = (int) (j8 % 15);
            long jAbs = Math.abs(j10 - this.f8860b);
            boolean[] zArr = this.f8865g;
            if (jAbs <= 1000000) {
                this.f8863e++;
                this.f8864f += j10;
                if (zArr[i7]) {
                    zArr[i7] = false;
                    this.f8866h--;
                }
            } else if (!zArr[i7]) {
                zArr[i7] = true;
                this.f8866h++;
            }
        }
        this.f8862d++;
        this.f8861c = j7;
    }

    public final void c() {
        this.f8862d = 0L;
        this.f8863e = 0L;
        this.f8864f = 0L;
        this.f8866h = 0;
        Arrays.fill(this.f8865g, false);
    }
}
