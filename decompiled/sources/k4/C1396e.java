package k4;

import P3.r;
import f4.InterfaceC0881a;

/* renamed from: k4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1396e implements Iterable, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final int f12672k;

    /* renamed from: l, reason: collision with root package name */
    public final int f12673l;

    /* renamed from: m, reason: collision with root package name */
    public final int f12674m;

    public C1396e(int i7, int i8, int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i9 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f12672k = i7;
        this.f12673l = r.B(i7, i8, i9);
        this.f12674m = i9;
    }

    @Override // java.lang.Iterable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f iterator() {
        return new f(this.f12672k, this.f12673l, this.f12674m);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1396e)) {
            return false;
        }
        if (isEmpty() && ((C1396e) obj).isEmpty()) {
            return true;
        }
        C1396e c1396e = (C1396e) obj;
        return this.f12672k == c1396e.f12672k && this.f12673l == c1396e.f12673l && this.f12674m == c1396e.f12674m;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f12672k * 31) + this.f12673l) * 31) + this.f12674m;
    }

    public boolean isEmpty() {
        int i7 = this.f12674m;
        int i8 = this.f12673l;
        int i9 = this.f12672k;
        return i7 > 0 ? i9 > i8 : i9 < i8;
    }

    public String toString() {
        StringBuilder sb;
        int i7 = this.f12673l;
        int i8 = this.f12672k;
        int i9 = this.f12674m;
        if (i9 > 0) {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append("..");
            sb.append(i7);
            sb.append(" step ");
            sb.append(i9);
        } else {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append(" downTo ");
            sb.append(i7);
            sb.append(" step ");
            sb.append(-i9);
        }
        return sb.toString();
    }
}
