package m6;

import B1.AbstractC0015b;
import B1.K;
import android.util.SparseArray;
import p.AbstractC1766r;
import p.C1718E;
import p.E0;
import p.InterfaceC1774z;
import y1.C2393o;

/* loaded from: classes.dex */
public final class x implements E0, p2.b {

    /* renamed from: k, reason: collision with root package name */
    public final int f13109k;

    /* renamed from: l, reason: collision with root package name */
    public final int f13110l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f13111m;

    public x() {
        this.f13111m = new x[256];
        this.f13109k = 0;
        this.f13110l = 0;
    }

    @Override // p2.b
    public int c() {
        return this.f13109k;
    }

    @Override // p.D0
    public AbstractC1766r e(long j7, AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2, AbstractC1766r abstractC1766r3) {
        return ((A2.b) this.f13111m).e(j7, abstractC1766r, abstractC1766r2, abstractC1766r3);
    }

    @Override // p2.b
    public int f() {
        return this.f13110l;
    }

    @Override // p2.b
    public int g() {
        int i7 = this.f13109k;
        return i7 == -1 ? ((B1.B) this.f13111m).x() : i7;
    }

    @Override // p.D0
    public AbstractC1766r i(long j7, AbstractC1766r abstractC1766r, AbstractC1766r abstractC1766r2, AbstractC1766r abstractC1766r3) {
        return ((A2.b) this.f13111m).i(j7, abstractC1766r, abstractC1766r2, abstractC1766r3);
    }

    @Override // p.E0
    public int m() {
        return this.f13110l;
    }

    @Override // p.E0
    public int o() {
        return this.f13109k;
    }

    public x(int i7, int i8) {
        this.f13111m = null;
        this.f13109k = i7;
        int i9 = i8 & 7;
        this.f13110l = i9 == 0 ? 8 : i9;
    }

    public x(int i7, int i8, InterfaceC1774z interfaceC1774z) {
        this.f13109k = i7;
        this.f13110l = i8;
        this.f13111m = new A2.b(new C1718E(i7, i8, interfaceC1774z));
    }

    public x(int i7, int i8, SparseArray sparseArray) {
        this.f13109k = i7;
        this.f13110l = i8;
        this.f13111m = sparseArray;
    }

    public x(C1.d dVar, C2393o c2393o) {
        B1.B b4 = dVar.f573m;
        this.f13111m = b4;
        b4.F(12);
        int iX = b4.x();
        if ("audio/raw".equals(c2393o.f18112n)) {
            int iQ = K.q(c2393o.f18093F) * c2393o.f18091D;
            if (iX == 0 || iX % iQ != 0) {
                AbstractC0015b.v("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iQ + ", stsz sample size: " + iX);
                iX = iQ;
            }
        }
        this.f13109k = iX == 0 ? -1 : iX;
        this.f13110l = b4.x();
    }
}
