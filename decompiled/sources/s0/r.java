package s0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15469b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15470c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15471d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15472e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15473f;

    /* renamed from: g, reason: collision with root package name */
    public final long f15474g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15475h;

    /* renamed from: i, reason: collision with root package name */
    public final int f15476i;

    /* renamed from: j, reason: collision with root package name */
    public final long f15477j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f15478k;

    /* renamed from: l, reason: collision with root package name */
    public final long f15479l;

    /* renamed from: m, reason: collision with root package name */
    public C1958c f15480m;

    public r(long j7, long j8, long j9, boolean z7, float f5, long j10, long j11, boolean z8, boolean z9, int i7, long j12) {
        this.a = j7;
        this.f15469b = j8;
        this.f15470c = j9;
        this.f15471d = z7;
        this.f15472e = f5;
        this.f15473f = j10;
        this.f15474g = j11;
        this.f15475h = z8;
        this.f15476i = i7;
        this.f15477j = j12;
        this.f15479l = 0L;
        C1958c c1958c = new C1958c();
        c1958c.a = z9;
        c1958c.f15442b = z9;
        this.f15480m = c1958c;
    }

    public final void a() {
        C1958c c1958c = this.f15480m;
        c1958c.f15442b = true;
        c1958c.a = true;
    }

    public final boolean b() {
        C1958c c1958c = this.f15480m;
        return c1958c.f15442b || c1958c.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) q.b(this.a));
        sb.append(", uptimeMillis=");
        sb.append(this.f15469b);
        sb.append(", position=");
        sb.append((Object) g0.c.j(this.f15470c));
        sb.append(", pressed=");
        sb.append(this.f15471d);
        sb.append(", pressure=");
        sb.append(this.f15472e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f15473f);
        sb.append(", previousPosition=");
        sb.append((Object) g0.c.j(this.f15474g));
        sb.append(", previousPressed=");
        sb.append(this.f15475h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i7 = this.f15476i;
        sb.append((Object) (i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", historical=");
        Object obj = this.f15478k;
        if (obj == null) {
            obj = P3.y.f7779k;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) g0.c.j(this.f15477j));
        sb.append(')');
        return sb.toString();
    }

    public r(long j7, long j8, long j9, boolean z7, float f5, long j10, long j11, boolean z8, int i7, ArrayList arrayList, long j12, long j13) {
        this(j7, j8, j9, z7, f5, j10, j11, z8, false, i7, j12);
        this.f15478k = arrayList;
        this.f15479l = j13;
    }
}
