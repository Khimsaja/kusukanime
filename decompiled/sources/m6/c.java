package m6;

import java.io.IOException;
import java.util.ArrayList;
import w6.AbstractC2217b;
import w6.C;
import w6.C2224i;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public final C f13005c;

    /* renamed from: f, reason: collision with root package name */
    public int f13008f;

    /* renamed from: g, reason: collision with root package name */
    public int f13009g;
    public int a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13004b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public C1528b[] f13006d = new C1528b[8];

    /* renamed from: e, reason: collision with root package name */
    public int f13007e = 7;

    public c(q qVar) {
        this.f13005c = AbstractC2217b.c(qVar);
    }

    public final int a(int i7) {
        int i8;
        int i9 = 0;
        if (i7 > 0) {
            int length = this.f13006d.length;
            while (true) {
                length--;
                i8 = this.f13007e;
                if (length < i8 || i7 <= 0) {
                    break;
                }
                C1528b c1528b = this.f13006d[length];
                kotlin.jvm.internal.l.c(c1528b);
                int i10 = c1528b.f13003c;
                i7 -= i10;
                this.f13009g -= i10;
                this.f13008f--;
                i9++;
            }
            C1528b[] c1528bArr = this.f13006d;
            System.arraycopy(c1528bArr, i8 + 1, c1528bArr, i8 + 1 + i9, this.f13008f);
            this.f13007e += i9;
        }
        return i9;
    }

    public final w6.l b(int i7) throws IOException {
        if (i7 >= 0) {
            C1528b[] c1528bArr = e.a;
            if (i7 <= c1528bArr.length - 1) {
                return c1528bArr[i7].a;
            }
        }
        int length = this.f13007e + 1 + (i7 - e.a.length);
        if (length >= 0) {
            C1528b[] c1528bArr2 = this.f13006d;
            if (length < c1528bArr2.length) {
                C1528b c1528b = c1528bArr2[length];
                kotlin.jvm.internal.l.c(c1528b);
                return c1528b.a;
            }
        }
        throw new IOException("Header index too large " + (i7 + 1));
    }

    public final void c(C1528b c1528b) {
        this.f13004b.add(c1528b);
        int i7 = this.a;
        int i8 = c1528b.f13003c;
        if (i8 > i7) {
            C1528b[] c1528bArr = this.f13006d;
            P3.m.c0(c1528bArr, 0, c1528bArr.length);
            this.f13007e = this.f13006d.length - 1;
            this.f13008f = 0;
            this.f13009g = 0;
            return;
        }
        a((this.f13009g + i8) - i7);
        int i9 = this.f13008f + 1;
        C1528b[] c1528bArr2 = this.f13006d;
        if (i9 > c1528bArr2.length) {
            C1528b[] c1528bArr3 = new C1528b[c1528bArr2.length * 2];
            System.arraycopy(c1528bArr2, 0, c1528bArr3, c1528bArr2.length, c1528bArr2.length);
            this.f13007e = this.f13006d.length - 1;
            this.f13006d = c1528bArr3;
        }
        int i10 = this.f13007e;
        this.f13007e = i10 - 1;
        this.f13006d[i10] = c1528b;
        this.f13008f++;
        this.f13009g += i8;
    }

    public final w6.l d() {
        int i7;
        C c2 = this.f13005c;
        byte b4 = c2.readByte();
        byte[] bArr = g6.b.a;
        int i8 = b4 & 255;
        int i9 = 0;
        boolean z7 = (b4 & 128) == 128;
        long jE = e(i8, 127);
        if (!z7) {
            return c2.e(jE);
        }
        C2224i c2224i = new C2224i();
        int[] iArr = y.a;
        kotlin.jvm.internal.l.f("source", c2);
        x xVar = y.f13113c;
        x xVar2 = xVar;
        int i10 = 0;
        for (long j7 = 0; j7 < jE; j7++) {
            byte b7 = c2.readByte();
            byte[] bArr2 = g6.b.a;
            i9 = (i9 << 8) | (b7 & 255);
            i10 += 8;
            while (i10 >= 8) {
                x[] xVarArr = (x[]) xVar2.f13111m;
                kotlin.jvm.internal.l.c(xVarArr);
                xVar2 = xVarArr[(i9 >>> (i10 - 8)) & 255];
                kotlin.jvm.internal.l.c(xVar2);
                if (((x[]) xVar2.f13111m) == null) {
                    c2224i.g0(xVar2.f13109k);
                    i10 -= xVar2.f13110l;
                    xVar2 = xVar;
                } else {
                    i10 -= 8;
                }
            }
        }
        while (i10 > 0) {
            x[] xVarArr2 = (x[]) xVar2.f13111m;
            kotlin.jvm.internal.l.c(xVarArr2);
            x xVar3 = xVarArr2[(i9 << (8 - i10)) & 255];
            kotlin.jvm.internal.l.c(xVar3);
            if (((x[]) xVar3.f13111m) != null || (i7 = xVar3.f13110l) > i10) {
                break;
            }
            c2224i.g0(xVar3.f13109k);
            i10 -= i7;
            xVar2 = xVar;
        }
        return c2224i.T(c2224i.f17156l);
    }

    public final int e(int i7, int i8) {
        int i9 = i7 & i8;
        if (i9 < i8) {
            return i9;
        }
        int i10 = 0;
        while (true) {
            byte b4 = this.f13005c.readByte();
            byte[] bArr = g6.b.a;
            int i11 = b4 & 255;
            if ((b4 & 128) == 0) {
                return i8 + (i11 << i10);
            }
            i8 += (b4 & 127) << i10;
            i10 += 7;
        }
    }
}
