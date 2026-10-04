package s0;

import b1.AbstractC0703b;
import java.util.ArrayList;
import p.AbstractC1755i;

/* loaded from: classes.dex */
public final class t {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15483b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15484c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15485d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15486e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15487f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15488g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15489h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f15490i;

    /* renamed from: j, reason: collision with root package name */
    public final long f15491j;

    /* renamed from: k, reason: collision with root package name */
    public final long f15492k;

    public t(long j7, long j8, long j9, long j10, boolean z7, float f5, int i7, boolean z8, ArrayList arrayList, long j11, long j12) {
        this.a = j7;
        this.f15483b = j8;
        this.f15484c = j9;
        this.f15485d = j10;
        this.f15486e = z7;
        this.f15487f = f5;
        this.f15488g = i7;
        this.f15489h = z8;
        this.f15490i = arrayList;
        this.f15491j = j11;
        this.f15492k = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return q.a(this.a, tVar.a) && this.f15483b == tVar.f15483b && g0.c.b(this.f15484c, tVar.f15484c) && g0.c.b(this.f15485d, tVar.f15485d) && this.f15486e == tVar.f15486e && Float.compare(this.f15487f, tVar.f15487f) == 0 && this.f15488g == tVar.f15488g && this.f15489h == tVar.f15489h && this.f15490i.equals(tVar.f15490i) && g0.c.b(this.f15491j, tVar.f15491j) && g0.c.b(this.f15492k, tVar.f15492k);
    }

    public final int hashCode() {
        return Long.hashCode(this.f15492k) + AbstractC0703b.c((this.f15490i.hashCode() + AbstractC0703b.d(AbstractC1755i.a(this.f15488g, AbstractC0703b.b(this.f15487f, AbstractC0703b.d(AbstractC0703b.c(AbstractC0703b.c(AbstractC0703b.c(Long.hashCode(this.a) * 31, 31, this.f15483b), 31, this.f15484c), 31, this.f15485d), 31, this.f15486e), 31), 31), 31, this.f15489h)) * 31, 31, this.f15491j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) q.b(this.a));
        sb.append(", uptime=");
        sb.append(this.f15483b);
        sb.append(", positionOnScreen=");
        sb.append((Object) g0.c.j(this.f15484c));
        sb.append(", position=");
        sb.append((Object) g0.c.j(this.f15485d));
        sb.append(", down=");
        sb.append(this.f15486e);
        sb.append(", pressure=");
        sb.append(this.f15487f);
        sb.append(", type=");
        int i7 = this.f15488g;
        sb.append((Object) (i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", activeHover=");
        sb.append(this.f15489h);
        sb.append(", historical=");
        sb.append(this.f15490i);
        sb.append(", scrollDelta=");
        sb.append((Object) g0.c.j(this.f15491j));
        sb.append(", originalEventPosition=");
        sb.append((Object) g0.c.j(this.f15492k));
        sb.append(')');
        return sb.toString();
    }
}
