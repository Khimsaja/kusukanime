package H0;

import p.AbstractC1755i;

/* renamed from: H0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210b {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3101b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3102c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3103d;

    public /* synthetic */ C0210b(int i7, int i8, Object obj) {
        this(obj, i7, i8, "");
    }

    public final C0212d a(int i7) {
        int i8 = this.f3102c;
        if (i8 != Integer.MIN_VALUE) {
            i7 = i8;
        }
        if (i7 == Integer.MIN_VALUE) {
            throw new IllegalStateException("Item.end should be set first");
        }
        return new C0212d(this.a, this.f3101b, i7, this.f3103d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0210b)) {
            return false;
        }
        C0210b c0210b = (C0210b) obj;
        return kotlin.jvm.internal.l.a(this.a, c0210b.a) && this.f3101b == c0210b.f3101b && this.f3102c == c0210b.f3102c && kotlin.jvm.internal.l.a(this.f3103d, c0210b.f3103d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.f3103d.hashCode() + AbstractC1755i.a(this.f3102c, AbstractC1755i.a(this.f3101b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.f3101b);
        sb.append(", end=");
        sb.append(this.f3102c);
        sb.append(", tag=");
        return A6.b.j(sb, this.f3103d, ')');
    }

    public C0210b(Object obj, int i7, int i8, String str) {
        this.a = obj;
        this.f3101b = i7;
        this.f3102c = i8;
        this.f3103d = str;
    }
}
