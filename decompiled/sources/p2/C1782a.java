package p2;

import B1.B;
import V1.AbstractC0597b;
import y1.E;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1782a {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public int f14201b;

    /* renamed from: c, reason: collision with root package name */
    public int f14202c;

    /* renamed from: d, reason: collision with root package name */
    public long f14203d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14204e;

    /* renamed from: f, reason: collision with root package name */
    public final B f14205f;

    /* renamed from: g, reason: collision with root package name */
    public final B f14206g;

    /* renamed from: h, reason: collision with root package name */
    public int f14207h;

    /* renamed from: i, reason: collision with root package name */
    public int f14208i;

    public C1782a(B b4, B b7, boolean z7) throws E {
        this.f14206g = b4;
        this.f14205f = b7;
        this.f14204e = z7;
        b7.F(12);
        this.a = b7.x();
        b4.F(12);
        this.f14208i = b4.x();
        AbstractC0597b.c("first_chunk must be 1", b4.g() == 1);
        this.f14201b = -1;
    }

    public final boolean a() {
        int i7 = this.f14201b + 1;
        this.f14201b = i7;
        if (i7 == this.a) {
            return false;
        }
        boolean z7 = this.f14204e;
        B b4 = this.f14205f;
        this.f14203d = z7 ? b4.y() : b4.v();
        if (this.f14201b == this.f14207h) {
            B b7 = this.f14206g;
            this.f14202c = b7.x();
            b7.G(4);
            int i8 = this.f14208i - 1;
            this.f14208i = i8;
            this.f14207h = i8 > 0 ? b7.x() - 1 : -1;
        }
        return true;
    }
}
