package w6;

/* loaded from: classes.dex */
public final class D {
    public final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f17116b;

    /* renamed from: c, reason: collision with root package name */
    public int f17117c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17118d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17119e;

    /* renamed from: f, reason: collision with root package name */
    public D f17120f;

    /* renamed from: g, reason: collision with root package name */
    public D f17121g;

    public D() {
        this.a = new byte[8192];
        this.f17119e = true;
        this.f17118d = false;
    }

    public final D a() {
        D d4 = this.f17120f;
        if (d4 == this) {
            d4 = null;
        }
        D d6 = this.f17121g;
        kotlin.jvm.internal.l.c(d6);
        d6.f17120f = this.f17120f;
        D d7 = this.f17120f;
        kotlin.jvm.internal.l.c(d7);
        d7.f17121g = this.f17121g;
        this.f17120f = null;
        this.f17121g = null;
        return d4;
    }

    public final void b(D d4) {
        kotlin.jvm.internal.l.f("segment", d4);
        d4.f17121g = this;
        d4.f17120f = this.f17120f;
        D d6 = this.f17120f;
        kotlin.jvm.internal.l.c(d6);
        d6.f17121g = d4;
        this.f17120f = d4;
    }

    public final D c() {
        this.f17118d = true;
        return new D(this.a, this.f17116b, this.f17117c, true, false);
    }

    public final void d(D d4, int i7) {
        kotlin.jvm.internal.l.f("sink", d4);
        if (!d4.f17119e) {
            throw new IllegalStateException("only owner can write");
        }
        int i8 = d4.f17117c;
        int i9 = i8 + i7;
        byte[] bArr = d4.a;
        if (i9 > 8192) {
            if (d4.f17118d) {
                throw new IllegalArgumentException();
            }
            int i10 = d4.f17116b;
            if (i9 - i10 > 8192) {
                throw new IllegalArgumentException();
            }
            P3.m.U(0, i10, i8, bArr, bArr);
            d4.f17117c -= d4.f17116b;
            d4.f17116b = 0;
        }
        int i11 = d4.f17117c;
        int i12 = this.f17116b;
        P3.m.U(i11, i12, i12 + i7, this.a, bArr);
        d4.f17117c += i7;
        this.f17116b += i7;
    }

    public D(byte[] bArr, int i7, int i8, boolean z7, boolean z8) {
        kotlin.jvm.internal.l.f("data", bArr);
        this.a = bArr;
        this.f17116b = i7;
        this.f17117c = i8;
        this.f17118d = z7;
        this.f17119e = z8;
    }
}
