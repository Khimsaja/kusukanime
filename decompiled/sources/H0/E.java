package H0;

import b1.AbstractC0703b;
import java.util.List;
import p.AbstractC1755i;

/* loaded from: classes.dex */
public final class E {
    public final C0214f a;

    /* renamed from: b, reason: collision with root package name */
    public final I f3074b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3075c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3076d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3077e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3078f;

    /* renamed from: g, reason: collision with root package name */
    public final T0.b f3079g;

    /* renamed from: h, reason: collision with root package name */
    public final T0.k f3080h;

    /* renamed from: i, reason: collision with root package name */
    public final M0.i f3081i;

    /* renamed from: j, reason: collision with root package name */
    public final long f3082j;

    public E(C0214f c0214f, I i7, List list, int i8, boolean z7, int i9, T0.b bVar, T0.k kVar, M0.i iVar, long j7) {
        this.a = c0214f;
        this.f3074b = i7;
        this.f3075c = list;
        this.f3076d = i8;
        this.f3077e = z7;
        this.f3078f = i9;
        this.f3079g = bVar;
        this.f3080h = kVar;
        this.f3081i = iVar;
        this.f3082j = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e7 = (E) obj;
        return kotlin.jvm.internal.l.a(this.a, e7.a) && kotlin.jvm.internal.l.a(this.f3074b, e7.f3074b) && kotlin.jvm.internal.l.a(this.f3075c, e7.f3075c) && this.f3076d == e7.f3076d && this.f3077e == e7.f3077e && this.f3078f == e7.f3078f && kotlin.jvm.internal.l.a(this.f3079g, e7.f3079g) && this.f3080h == e7.f3080h && kotlin.jvm.internal.l.a(this.f3081i, e7.f3081i) && T0.a.b(this.f3082j, e7.f3082j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f3082j) + ((this.f3081i.hashCode() + ((this.f3080h.hashCode() + ((this.f3079g.hashCode() + AbstractC1755i.a(this.f3078f, AbstractC0703b.d((((this.f3075c.hashCode() + ((this.f3074b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31) + this.f3076d) * 31, 31, this.f3077e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.f3074b);
        sb.append(", placeholders=");
        sb.append(this.f3075c);
        sb.append(", maxLines=");
        sb.append(this.f3076d);
        sb.append(", softWrap=");
        sb.append(this.f3077e);
        sb.append(", overflow=");
        int i7 = this.f3078f;
        sb.append((Object) (i7 == 1 ? "Clip" : i7 == 2 ? "Ellipsis" : i7 == 3 ? "Visible" : "Invalid"));
        sb.append(", density=");
        sb.append(this.f3079g);
        sb.append(", layoutDirection=");
        sb.append(this.f3080h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.f3081i);
        sb.append(", constraints=");
        sb.append((Object) T0.a.l(this.f3082j));
        sb.append(')');
        return sb.toString();
    }
}
