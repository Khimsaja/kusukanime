package m0;

import T0.h;
import T0.j;
import android.graphics.Bitmap;
import b1.AbstractC0703b;
import g0.f;
import h0.C0985h;
import h0.C0990m;
import j0.C1296b;
import j0.InterfaceC1298d;
import l4.AbstractC1420H;
import y0.C2351F;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1506a extends AbstractC1507b {

    /* renamed from: o, reason: collision with root package name */
    public final C0985h f12957o;

    /* renamed from: p, reason: collision with root package name */
    public final long f12958p;

    /* renamed from: q, reason: collision with root package name */
    public int f12959q = 1;

    /* renamed from: r, reason: collision with root package name */
    public final long f12960r;

    /* renamed from: s, reason: collision with root package name */
    public float f12961s;

    /* renamed from: t, reason: collision with root package name */
    public C0990m f12962t;

    public C1506a(C0985h c0985h, long j7) {
        int i7;
        int i8;
        this.f12957o = c0985h;
        this.f12958p = j7;
        if (((int) 0) >= 0 && ((int) 0) >= 0 && (i7 = (int) (j7 >> 32)) >= 0 && (i8 = (int) (4294967295L & j7)) >= 0) {
            Bitmap bitmap = c0985h.a;
            if (i7 <= bitmap.getWidth() && i8 <= bitmap.getHeight()) {
                this.f12960r = j7;
                this.f12961s = 1.0f;
                return;
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // m0.AbstractC1507b
    public final void c(float f5) {
        this.f12961s = f5;
    }

    @Override // m0.AbstractC1507b
    public final void d(C0990m c0990m) {
        this.f12962t = c0990m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1506a)) {
            return false;
        }
        C1506a c1506a = (C1506a) obj;
        return this.f12957o.equals(c1506a.f12957o) && h.a(0L, 0L) && j.a(this.f12958p, c1506a.f12958p) && this.f12959q == c1506a.f12959q;
    }

    @Override // m0.AbstractC1507b
    public final long h() {
        return AbstractC1420H.O(this.f12960r);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12959q) + AbstractC0703b.c(AbstractC0703b.c(this.f12957o.hashCode() * 31, 31, 0L), 31, this.f12958p);
    }

    @Override // m0.AbstractC1507b
    public final void i(C2351F c2351f) {
        C1296b c1296b = c2351f.f17696k;
        InterfaceC1298d.A(c2351f, this.f12957o, this.f12958p, AbstractC1420H.a(Math.round(f.d(c1296b.d())), Math.round(f.b(c1296b.d()))), this.f12961s, this.f12962t, this.f12959q, 328);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f12957o);
        sb.append(", srcOffset=");
        sb.append((Object) h.d(0L));
        sb.append(", srcSize=");
        sb.append((Object) j.b(this.f12958p));
        sb.append(", filterQuality=");
        int i7 = this.f12959q;
        sb.append((Object) (i7 == 0 ? "None" : i7 == 1 ? "Low" : i7 == 2 ? "Medium" : i7 == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
