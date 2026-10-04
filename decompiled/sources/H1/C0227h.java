package H1;

import B1.AbstractC0015b;
import android.text.TextUtils;
import y1.C2393o;

/* renamed from: H1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227h {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final C2393o f3483b;

    /* renamed from: c, reason: collision with root package name */
    public final C2393o f3484c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3485d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3486e;

    public C0227h(String str, C2393o c2393o, C2393o c2393o2, int i7, int i8) {
        AbstractC0015b.c(i7 == 0 || i8 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.a = str;
        c2393o.getClass();
        this.f3483b = c2393o;
        c2393o2.getClass();
        this.f3484c = c2393o2;
        this.f3485d = i7;
        this.f3486e = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0227h.class == obj.getClass()) {
            C0227h c0227h = (C0227h) obj;
            if (this.f3485d == c0227h.f3485d && this.f3486e == c0227h.f3486e && this.a.equals(c0227h.a) && this.f3483b.equals(c0227h.f3483b) && this.f3484c.equals(c0227h.f3484c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3484c.hashCode() + ((this.f3483b.hashCode() + A6.b.b(this.a, (((527 + this.f3485d) * 31) + this.f3486e) * 31, 31)) * 31);
    }
}
