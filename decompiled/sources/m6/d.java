package m6;

import java.io.EOFException;
import java.util.Arrays;
import w6.C2224i;

/* loaded from: classes.dex */
public final class d {
    public final C2224i a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13011c;

    /* renamed from: g, reason: collision with root package name */
    public int f13015g;

    /* renamed from: h, reason: collision with root package name */
    public int f13016h;

    /* renamed from: b, reason: collision with root package name */
    public int f13010b = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f13012d = 4096;

    /* renamed from: e, reason: collision with root package name */
    public C1528b[] f13013e = new C1528b[8];

    /* renamed from: f, reason: collision with root package name */
    public int f13014f = 7;

    public d(C2224i c2224i) {
        this.a = c2224i;
    }

    public final void a(int i7) {
        int i8;
        if (i7 > 0) {
            int length = this.f13013e.length - 1;
            int i9 = 0;
            while (true) {
                i8 = this.f13014f;
                if (length < i8 || i7 <= 0) {
                    break;
                }
                C1528b c1528b = this.f13013e[length];
                kotlin.jvm.internal.l.c(c1528b);
                i7 -= c1528b.f13003c;
                int i10 = this.f13016h;
                C1528b c1528b2 = this.f13013e[length];
                kotlin.jvm.internal.l.c(c1528b2);
                this.f13016h = i10 - c1528b2.f13003c;
                this.f13015g--;
                i9++;
                length--;
            }
            C1528b[] c1528bArr = this.f13013e;
            int i11 = i8 + 1;
            System.arraycopy(c1528bArr, i11, c1528bArr, i11 + i9, this.f13015g);
            C1528b[] c1528bArr2 = this.f13013e;
            int i12 = this.f13014f + 1;
            Arrays.fill(c1528bArr2, i12, i12 + i9, (Object) null);
            this.f13014f += i9;
        }
    }

    public final void b(C1528b c1528b) {
        int i7 = this.f13012d;
        int i8 = c1528b.f13003c;
        if (i8 > i7) {
            C1528b[] c1528bArr = this.f13013e;
            P3.m.c0(c1528bArr, 0, c1528bArr.length);
            this.f13014f = this.f13013e.length - 1;
            this.f13015g = 0;
            this.f13016h = 0;
            return;
        }
        a((this.f13016h + i8) - i7);
        int i9 = this.f13015g + 1;
        C1528b[] c1528bArr2 = this.f13013e;
        if (i9 > c1528bArr2.length) {
            C1528b[] c1528bArr3 = new C1528b[c1528bArr2.length * 2];
            System.arraycopy(c1528bArr2, 0, c1528bArr3, c1528bArr2.length, c1528bArr2.length);
            this.f13014f = this.f13013e.length - 1;
            this.f13013e = c1528bArr3;
        }
        int i10 = this.f13014f;
        this.f13014f = i10 - 1;
        this.f13013e[i10] = c1528b;
        this.f13015g++;
        this.f13016h += i8;
    }

    public final void c(w6.l lVar) throws EOFException {
        kotlin.jvm.internal.l.f("data", lVar);
        C2224i c2224i = this.a;
        int[] iArr = y.a;
        int iD = lVar.d();
        long j7 = 0;
        for (int i7 = 0; i7 < iD; i7++) {
            byte bI = lVar.i(i7);
            byte[] bArr = g6.b.a;
            j7 += y.f13112b[bI & 255];
        }
        if (((int) ((j7 + 7) >> 3)) >= lVar.d()) {
            e(lVar.d(), 127, 0);
            c2224i.e0(lVar);
            return;
        }
        C2224i c2224i2 = new C2224i();
        int[] iArr2 = y.a;
        int iD2 = lVar.d();
        long j8 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < iD2; i9++) {
            byte bI2 = lVar.i(i9);
            byte[] bArr2 = g6.b.a;
            int i10 = bI2 & 255;
            int i11 = y.a[i10];
            byte b4 = y.f13112b[i10];
            j8 = (j8 << b4) | i11;
            i8 += b4;
            while (i8 >= 8) {
                i8 -= 8;
                c2224i2.g0((int) (j8 >> i8));
            }
        }
        if (i8 > 0) {
            c2224i2.g0((int) ((255 >>> i8) | (j8 << (8 - i8))));
        }
        w6.l lVarT = c2224i2.T(c2224i2.f17156l);
        e(lVarT.d(), 127, 128);
        c2224i.e0(lVarT);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.d.d(java.util.ArrayList):void");
    }

    public final void e(int i7, int i8, int i9) {
        C2224i c2224i = this.a;
        if (i7 < i8) {
            c2224i.g0(i7 | i9);
            return;
        }
        c2224i.g0(i9 | i8);
        int i10 = i7 - i8;
        while (i10 >= 128) {
            c2224i.g0(128 | (i10 & 127));
            i10 >>>= 7;
        }
        c2224i.g0(i10);
    }
}
