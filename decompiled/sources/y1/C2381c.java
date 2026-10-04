package y1;

import v.c0;

/* renamed from: y1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2381c {

    /* renamed from: b, reason: collision with root package name */
    public static final C2381c f18030b = new C2381c();
    public p2.l a;

    static {
        c0.d(0, 1, 2, 3, 4);
    }

    public final p2.l a() {
        if (this.a == null) {
            this.a = new p2.l(this);
        }
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2381c.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 486696559;
    }
}
