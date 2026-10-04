package V1;

import B1.K;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import y1.AbstractC2402y;

/* loaded from: classes.dex */
public final class k implements o {

    /* renamed from: l, reason: collision with root package name */
    public final E1.h f9390l;

    /* renamed from: m, reason: collision with root package name */
    public final long f9391m;

    /* renamed from: n, reason: collision with root package name */
    public long f9392n;

    /* renamed from: p, reason: collision with root package name */
    public int f9394p;

    /* renamed from: q, reason: collision with root package name */
    public int f9395q;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f9393o = new byte[65536];

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f9389k = new byte[4096];

    static {
        AbstractC2402y.a("media3.extractor");
    }

    public k(E1.h hVar, long j7, long j8) {
        this.f9390l = hVar;
        this.f9392n = j7;
        this.f9391m = j8;
    }

    @Override // V1.o
    public final boolean a(byte[] bArr, int i7, int i8, boolean z7) {
        int iMin;
        int i9 = this.f9395q;
        if (i9 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i9, i8);
            System.arraycopy(this.f9393o, 0, bArr, i7, iMin);
            r(iMin);
        }
        int iQ = iMin;
        while (iQ < i8 && iQ != -1) {
            iQ = q(bArr, i7, i8, iQ, z7);
        }
        if (iQ != -1) {
            this.f9392n += iQ;
        }
        return iQ != -1;
    }

    public final boolean b(int i7, boolean z7) throws EOFException, InterruptedIOException {
        k(i7);
        int iQ = this.f9395q - this.f9394p;
        while (iQ < i7) {
            int i8 = i7;
            boolean z8 = z7;
            iQ = q(this.f9393o, this.f9394p, i8, iQ, z8);
            if (iQ == -1) {
                return false;
            }
            this.f9395q = this.f9394p + iQ;
            i7 = i8;
            z7 = z8;
        }
        this.f9394p += i7;
        return true;
    }

    @Override // V1.o
    public final long c() {
        return this.f9391m;
    }

    @Override // V1.o
    public final void e() {
        this.f9394p = 0;
    }

    @Override // V1.o
    public final void f(int i7) {
        int iMin = Math.min(this.f9395q, i7);
        r(iMin);
        int iQ = iMin;
        while (iQ < i7 && iQ != -1) {
            byte[] bArr = this.f9389k;
            iQ = q(bArr, -iQ, Math.min(i7, bArr.length + iQ), iQ, false);
        }
        if (iQ != -1) {
            this.f9392n += iQ;
        }
    }

    @Override // V1.o
    public final boolean h(byte[] bArr, int i7, int i8, boolean z7) {
        if (!b(i8, z7)) {
            return false;
        }
        System.arraycopy(this.f9393o, this.f9394p - i8, bArr, i7, i8);
        return true;
    }

    @Override // V1.o
    public final long i() {
        return this.f9392n + this.f9394p;
    }

    public final void k(int i7) {
        int i8 = this.f9394p + i7;
        byte[] bArr = this.f9393o;
        if (i8 > bArr.length) {
            this.f9393o = Arrays.copyOf(this.f9393o, K.h(bArr.length * 2, 65536 + i8, i8 + 524288));
        }
    }

    @Override // V1.o
    public final void l(byte[] bArr, int i7, int i8) {
        h(bArr, i7, i8, false);
    }

    public final int m(byte[] bArr, int i7, int i8) throws EOFException, InterruptedIOException {
        k kVar;
        int iMin;
        k(i8);
        int i9 = this.f9395q;
        int i10 = this.f9394p;
        int i11 = i9 - i10;
        if (i11 == 0) {
            kVar = this;
            iMin = kVar.q(this.f9393o, i10, i8, 0, true);
            if (iMin == -1) {
                return -1;
            }
            kVar.f9395q += iMin;
        } else {
            kVar = this;
            iMin = Math.min(i8, i11);
        }
        System.arraycopy(kVar.f9393o, kVar.f9394p, bArr, i7, iMin);
        kVar.f9394p += iMin;
        return iMin;
    }

    @Override // V1.o
    public final void n(int i7) throws EOFException, InterruptedIOException {
        b(i7, false);
    }

    @Override // y1.InterfaceC2385g
    public final int o(byte[] bArr, int i7, int i8) throws EOFException, InterruptedIOException {
        k kVar;
        int i9 = this.f9395q;
        int iQ = 0;
        if (i9 != 0) {
            int iMin = Math.min(i9, i8);
            System.arraycopy(this.f9393o, 0, bArr, i7, iMin);
            r(iMin);
            iQ = iMin;
        }
        if (iQ == 0) {
            kVar = this;
            iQ = kVar.q(bArr, i7, i8, 0, true);
        } else {
            kVar = this;
        }
        if (iQ != -1) {
            kVar.f9392n += iQ;
        }
        return iQ;
    }

    @Override // V1.o
    public final long p() {
        return this.f9392n;
    }

    public final int q(byte[] bArr, int i7, int i8, int i9, boolean z7) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iO = this.f9390l.o(bArr, i7 + i9, i8 - i9);
        if (iO != -1) {
            return i9 + iO;
        }
        if (i9 == 0 && z7) {
            return -1;
        }
        throw new EOFException();
    }

    public final void r(int i7) {
        int i8 = this.f9395q - i7;
        this.f9395q = i8;
        this.f9394p = 0;
        byte[] bArr = this.f9393o;
        byte[] bArr2 = i8 < bArr.length - 524288 ? new byte[65536 + i8] : bArr;
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        this.f9393o = bArr2;
    }

    @Override // V1.o
    public final void readFully(byte[] bArr, int i7, int i8) {
        a(bArr, i7, i8, false);
    }
}
