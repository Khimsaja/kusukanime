package t6;

import P3.r;
import f.AbstractC0841b;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import java.util.zip.Deflater;
import kotlin.jvm.internal.l;
import w6.A;
import w6.AbstractC2217b;
import w6.C2223h;
import w6.C2224i;
import w6.D;

/* loaded from: classes.dex */
public final class j implements Closeable {

    /* renamed from: k, reason: collision with root package name */
    public final A f16201k;

    /* renamed from: l, reason: collision with root package name */
    public final Random f16202l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f16203m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f16204n;

    /* renamed from: o, reason: collision with root package name */
    public final long f16205o;

    /* renamed from: p, reason: collision with root package name */
    public final C2224i f16206p;

    /* renamed from: q, reason: collision with root package name */
    public final C2224i f16207q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16208r;

    /* renamed from: s, reason: collision with root package name */
    public a f16209s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f16210t;

    /* renamed from: u, reason: collision with root package name */
    public final C2223h f16211u;

    public j(A a, Random random, boolean z7, boolean z8, long j7) {
        l.f("sink", a);
        this.f16201k = a;
        this.f16202l = random;
        this.f16203m = z7;
        this.f16204n = z8;
        this.f16205o = j7;
        this.f16206p = new C2224i();
        this.f16207q = a.f17110l;
        this.f16210t = new byte[4];
        this.f16211u = new C2223h();
    }

    public final void b(int i7, w6.l lVar) throws IOException {
        if (this.f16208r) {
            throw new IOException("closed");
        }
        int iD = lVar.d();
        if (iD > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        C2224i c2224i = this.f16207q;
        c2224i.g0(i7 | 128);
        c2224i.g0(iD | 128);
        byte[] bArr = this.f16210t;
        l.c(bArr);
        this.f16202l.nextBytes(bArr);
        c2224i.f0(bArr);
        if (iD > 0) {
            long j7 = c2224i.f17156l;
            c2224i.e0(lVar);
            C2223h c2223h = this.f16211u;
            l.c(c2223h);
            c2224i.O(c2223h);
            c2223h.e(j7);
            AbstractC0841b.t(c2223h, bArr);
            c2223h.close();
        }
        this.f16201k.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        a aVar = this.f16209s;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final void e(int i7, w6.l lVar) throws IOException {
        if (this.f16208r) {
            throw new IOException("closed");
        }
        C2224i c2224i = this.f16206p;
        c2224i.e0(lVar);
        int i8 = i7 | 128;
        if (this.f16203m && lVar.f17158k.length >= this.f16205o) {
            a aVar = this.f16209s;
            if (aVar == null) {
                aVar = new a(this.f16204n, 0);
                this.f16209s = aVar;
            }
            C2224i c2224i2 = aVar.f16151m;
            if (c2224i2.f17156l != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (aVar.f16150l) {
                ((Deflater) aVar.f16152n).reset();
            }
            long j7 = c2224i.f17156l;
            l6.e eVar = (l6.e) aVar.f16153o;
            eVar.f(c2224i, j7);
            eVar.flush();
            if (c2224i2.p(c2224i2.f17156l - r2.f17158k.length, b.a)) {
                long j8 = c2224i2.f17156l - 4;
                C2223h c2223hO = c2224i2.O(AbstractC2217b.a);
                try {
                    c2223hO.b(j8);
                    c2223hO.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        r.o(c2223hO, th);
                        throw th2;
                    }
                }
            } else {
                c2224i2.g0(0);
            }
            c2224i.f(c2224i2, c2224i2.f17156l);
            i8 = i7 | 192;
        }
        long j9 = c2224i.f17156l;
        C2224i c2224i3 = this.f16207q;
        c2224i3.g0(i8);
        if (j9 <= 125) {
            c2224i3.g0(((int) j9) | 128);
        } else if (j9 <= 65535) {
            c2224i3.g0(254);
            c2224i3.j0((int) j9);
        } else {
            c2224i3.g0(255);
            D dD0 = c2224i3.d0(8);
            int i9 = dD0.f17117c;
            byte[] bArr = dD0.a;
            bArr[i9] = (byte) ((j9 >>> 56) & 255);
            bArr[i9 + 1] = (byte) ((j9 >>> 48) & 255);
            bArr[i9 + 2] = (byte) ((j9 >>> 40) & 255);
            bArr[i9 + 3] = (byte) ((j9 >>> 32) & 255);
            bArr[i9 + 4] = (byte) ((j9 >>> 24) & 255);
            bArr[i9 + 5] = (byte) ((j9 >>> 16) & 255);
            bArr[i9 + 6] = (byte) ((j9 >>> 8) & 255);
            bArr[i9 + 7] = (byte) (j9 & 255);
            dD0.f17117c = i9 + 8;
            c2224i3.f17156l += 8;
        }
        byte[] bArr2 = this.f16210t;
        l.c(bArr2);
        this.f16202l.nextBytes(bArr2);
        c2224i3.f0(bArr2);
        if (j9 > 0) {
            C2223h c2223h = this.f16211u;
            l.c(c2223h);
            c2224i.O(c2223h);
            c2223h.e(0L);
            AbstractC0841b.t(c2223h, bArr2);
            c2223h.close();
        }
        c2224i3.f(c2224i, j9);
        A a = this.f16201k;
        if (a.f17111m) {
            throw new IllegalStateException("closed");
        }
        C2224i c2224i4 = a.f17110l;
        long j10 = c2224i4.f17156l;
        if (j10 > 0) {
            a.f17109k.f(c2224i4, j10);
        }
    }
}
