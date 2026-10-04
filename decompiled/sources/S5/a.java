package S5;

import b1.AbstractC0703b;
import java.io.EOFException;
import v.c0;

/* loaded from: classes.dex */
public final class a implements n, l {

    /* renamed from: k, reason: collision with root package name */
    public j f8782k;

    /* renamed from: l, reason: collision with root package name */
    public j f8783l;

    /* renamed from: m, reason: collision with root package name */
    public long f8784m;

    @Override // S5.n
    public final long B(e eVar) {
        kotlin.jvm.internal.l.f("sink", eVar);
        long j7 = this.f8784m;
        if (j7 > 0) {
            eVar.write(this, j7);
        }
        return j7;
    }

    @Override // S5.n
    public final int C(byte[] bArr, int i7, int i8) {
        kotlin.jvm.internal.l.f("sink", bArr);
        p.a(bArr.length, i7, i8);
        j jVar = this.f8782k;
        if (jVar == null) {
            return -1;
        }
        int iMin = Math.min(i8 - i7, jVar.b());
        int i9 = (i7 + iMin) - i7;
        int i10 = jVar.f8801b;
        P3.m.U(i7, i10, i10 + i9, jVar.a, bArr);
        jVar.f8801b += i9;
        this.f8784m -= iMin;
        if (p.f(jVar)) {
            g();
        }
        return iMin;
    }

    @Override // S5.l
    public final void D(byte b4) {
        j jVarM = m(1);
        int i7 = jVarM.f8802c;
        jVarM.f8802c = i7 + 1;
        jVarM.a[i7] = b4;
        this.f8784m++;
    }

    @Override // S5.l
    public final void I(n nVar, long j7) throws EOFException {
        if (j7 < 0) {
            throw new IllegalArgumentException(("byteCount (" + j7 + ") < 0").toString());
        }
        long j8 = j7;
        while (j8 > 0) {
            long atMostTo = nVar.readAtMostTo(this, j8);
            if (atMostTo == -1) {
                throw new EOFException(A6.b.f(j7 - j8, " were read.", A6.b.k("Source exhausted before reading ", j7, " bytes. Only ")));
            }
            j8 -= atMostTo;
        }
    }

    @Override // S5.l
    public final long M(f fVar) {
        kotlin.jvm.internal.l.f("source", fVar);
        long j7 = 0;
        while (true) {
            long atMostTo = fVar.readAtMostTo(this, 8192L);
            if (atMostTo == -1) {
                return j7;
            }
            j7 += atMostTo;
        }
    }

    @Override // S5.n
    public final h N() {
        return new h(new d(this));
    }

    @Override // S5.n
    public final void Q(long j7) throws EOFException {
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.h("byteCount: ", j7).toString());
        }
        if (this.f8784m >= j7) {
            return;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.f8784m + ", required: " + j7 + ')');
    }

    public final long b() {
        long j7 = this.f8784m;
        if (j7 == 0) {
            return 0L;
        }
        j jVar = this.f8783l;
        kotlin.jvm.internal.l.c(jVar);
        return (jVar.f8802c >= 8192 || !jVar.f8804e) ? j7 : j7 - (r3 - jVar.f8801b);
    }

    @Override // S5.n
    public final boolean c(long j7) {
        if (j7 >= 0) {
            return this.f8784m >= j7;
        }
        throw new IllegalArgumentException(("byteCount: " + j7 + " < 0").toString());
    }

    public final byte e(long j7) {
        long j8 = 0;
        if (j7 >= 0) {
            long j9 = this.f8784m;
            if (j7 < j9) {
                if (j7 == 0) {
                    j jVar = this.f8782k;
                    kotlin.jvm.internal.l.c(jVar);
                    return jVar.c(0);
                }
                j jVar2 = this.f8782k;
                if (jVar2 == null) {
                    kotlin.jvm.internal.l.c(null);
                    throw null;
                }
                if (j9 - j7 >= j7) {
                    while (jVar2 != null) {
                        long j10 = (jVar2.f8802c - jVar2.f8801b) + j8;
                        if (j10 > j7) {
                            break;
                        }
                        jVar2 = jVar2.f8805f;
                        j8 = j10;
                    }
                    kotlin.jvm.internal.l.c(jVar2);
                    return jVar2.c((int) (j7 - j8));
                }
                j jVar3 = this.f8783l;
                while (jVar3 != null && j9 > j7) {
                    j9 -= jVar3.f8802c - jVar3.f8801b;
                    if (j9 <= j7) {
                        break;
                    }
                    jVar3 = jVar3.f8806g;
                }
                kotlin.jvm.internal.l.c(jVar3);
                return jVar3.c((int) (j7 - j9));
            }
        }
        throw new IndexOutOfBoundsException(A6.b.f(this.f8784m, "))", A6.b.k("position (", j7, ") is not within the range [0..size(")));
    }

    public final void g() {
        j jVar = this.f8782k;
        kotlin.jvm.internal.l.c(jVar);
        j jVar2 = jVar.f8805f;
        this.f8782k = jVar2;
        if (jVar2 == null) {
            this.f8783l = null;
        } else {
            jVar2.f8806g = null;
        }
        jVar.f8805f = null;
        k.a(jVar);
    }

    @Override // S5.l
    public final void h(long j7) {
        j jVarM = m(8);
        int i7 = jVarM.f8802c;
        byte[] bArr = jVarM.a;
        bArr[i7] = (byte) ((j7 >>> 56) & 255);
        bArr[i7 + 1] = (byte) ((j7 >>> 48) & 255);
        bArr[i7 + 2] = (byte) ((j7 >>> 40) & 255);
        bArr[i7 + 3] = (byte) ((j7 >>> 32) & 255);
        bArr[i7 + 4] = (byte) ((j7 >>> 24) & 255);
        bArr[i7 + 5] = (byte) ((j7 >>> 16) & 255);
        bArr[i7 + 6] = (byte) ((j7 >>> 8) & 255);
        bArr[i7 + 7] = (byte) (j7 & 255);
        jVarM.f8802c = i7 + 8;
        this.f8784m += 8;
    }

    public final /* synthetic */ void i() {
        j jVar = this.f8783l;
        kotlin.jvm.internal.l.c(jVar);
        j jVar2 = jVar.f8806g;
        this.f8783l = jVar2;
        if (jVar2 == null) {
            this.f8782k = null;
        } else {
            jVar2.f8805f = null;
        }
        jVar.f8806g = null;
        k.a(jVar);
    }

    public final void j(long j7) throws EOFException {
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.f8784m + ", required: " + j7 + ')');
    }

    public final /* synthetic */ j m(int i7) {
        if (i7 < 1 || i7 > 8192) {
            throw new IllegalArgumentException(c0.a(i7, "unexpected capacity (", "), should be in range [1, 8192]").toString());
        }
        j jVar = this.f8783l;
        if (jVar == null) {
            j jVarB = k.b();
            this.f8782k = jVarB;
            this.f8783l = jVarB;
            return jVarB;
        }
        if (jVar.f8802c + i7 <= 8192 && jVar.f8804e) {
            return jVar;
        }
        j jVarB2 = k.b();
        jVar.e(jVarB2);
        this.f8783l = jVarB2;
        return jVarB2;
    }

    public final void n(long j7) {
        if (j7 < 0) {
            throw new IllegalArgumentException(("byteCount (" + j7 + ") < 0").toString());
        }
        long j8 = j7;
        while (j8 > 0) {
            j jVar = this.f8782k;
            if (jVar == null) {
                throw new EOFException("Buffer exhausted before skipping " + j7 + " bytes.");
            }
            int iMin = (int) Math.min(j8, jVar.f8802c - jVar.f8801b);
            long j9 = iMin;
            this.f8784m -= j9;
            j8 -= j9;
            int i7 = jVar.f8801b + iMin;
            jVar.f8801b = i7;
            if (i7 == jVar.f8802c) {
                g();
            }
        }
    }

    @Override // S5.l
    public final void o(short s7) {
        j jVarM = m(2);
        int i7 = jVarM.f8802c;
        byte[] bArr = jVarM.a;
        bArr[i7] = (byte) ((s7 >>> 8) & 255);
        bArr[i7 + 1] = (byte) (s7 & 255);
        jVarM.f8802c = i7 + 2;
        this.f8784m += 2;
    }

    @Override // S5.l
    public final void r(int i7) {
        j jVarM = m(4);
        int i8 = jVarM.f8802c;
        byte[] bArr = jVarM.a;
        bArr[i8] = (byte) ((i7 >>> 24) & 255);
        bArr[i8 + 1] = (byte) ((i7 >>> 16) & 255);
        bArr[i8 + 2] = (byte) ((i7 >>> 8) & 255);
        bArr[i8 + 3] = (byte) (i7 & 255);
        jVarM.f8802c = i8 + 4;
        this.f8784m += 4;
    }

    @Override // S5.f
    public final long readAtMostTo(a aVar, long j7) {
        kotlin.jvm.internal.l.f("sink", aVar);
        if (j7 < 0) {
            throw new IllegalArgumentException(("byteCount (" + j7 + ") < 0").toString());
        }
        long j8 = this.f8784m;
        if (j8 == 0) {
            return -1L;
        }
        if (j7 > j8) {
            j7 = j8;
        }
        aVar.write(this, j7);
        return j7;
    }

    @Override // S5.n
    public final byte readByte() throws EOFException {
        j jVar = this.f8782k;
        if (jVar == null) {
            j(1L);
            throw null;
        }
        int iB = jVar.b();
        if (iB == 0) {
            g();
            return readByte();
        }
        int i7 = jVar.f8801b;
        jVar.f8801b = i7 + 1;
        byte b4 = jVar.a[i7];
        this.f8784m--;
        if (iB == 1) {
            g();
        }
        return b4;
    }

    @Override // S5.n
    public final int readInt() throws EOFException {
        j jVar = this.f8782k;
        if (jVar == null) {
            j(4L);
            throw null;
        }
        int iB = jVar.b();
        if (iB < 4) {
            Q(4L);
            if (iB != 0) {
                return (readShort() << 16) | (readShort() & 65535);
            }
            g();
            return readInt();
        }
        int i7 = jVar.f8801b;
        byte[] bArr = jVar.a;
        int i8 = ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 2] & 255) << 8) | (bArr[i7 + 3] & 255);
        jVar.f8801b = i7 + 4;
        this.f8784m -= 4;
        if (iB == 4) {
            g();
        }
        return i8;
    }

    @Override // S5.n
    public final long readLong() throws EOFException {
        j jVar = this.f8782k;
        if (jVar == null) {
            j(8L);
            throw null;
        }
        int iB = jVar.b();
        if (iB < 8) {
            Q(8L);
            if (iB != 0) {
                return (readInt() << 32) | (readInt() & 4294967295L);
            }
            g();
            return readLong();
        }
        int i7 = jVar.f8801b;
        byte[] bArr = jVar.a;
        long j7 = (bArr[i7 + 7] & 255) | ((bArr[i7] & 255) << 56) | ((bArr[i7 + 1] & 255) << 48) | ((bArr[i7 + 2] & 255) << 40) | ((bArr[i7 + 3] & 255) << 32) | ((bArr[i7 + 4] & 255) << 24) | ((bArr[i7 + 5] & 255) << 16) | ((bArr[i7 + 6] & 255) << 8);
        jVar.f8801b = i7 + 8;
        this.f8784m -= 8;
        if (iB == 8) {
            g();
        }
        return j7;
    }

    @Override // S5.n
    public final short readShort() throws EOFException {
        j jVar = this.f8782k;
        if (jVar == null) {
            j(2L);
            throw null;
        }
        int iB = jVar.b();
        if (iB < 2) {
            Q(2L);
            if (iB != 0) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            g();
            return readShort();
        }
        int i7 = jVar.f8801b;
        byte[] bArr = jVar.a;
        short s7 = (short) ((bArr[i7 + 1] & 255) | ((bArr[i7] & 255) << 8));
        jVar.f8801b = i7 + 2;
        this.f8784m -= 2;
        if (iB == 2) {
            g();
        }
        return s7;
    }

    @Override // S5.n
    public final void t(l lVar, long j7) throws EOFException {
        kotlin.jvm.internal.l.f("sink", lVar);
        if (j7 < 0) {
            throw new IllegalArgumentException(("byteCount (" + j7 + ") < 0").toString());
        }
        long j8 = this.f8784m;
        if (j8 >= j7) {
            lVar.write(this, j7);
        } else {
            lVar.write(this, j8);
            throw new EOFException(A6.b.f(this.f8784m, " bytes were written.", A6.b.k("Buffer exhausted before writing ", j7, " bytes. Only ")));
        }
    }

    public final String toString() {
        long j7 = this.f8784m;
        if (j7 == 0) {
            return "Buffer(size=0)";
        }
        long j8 = 64;
        int iMin = (int) Math.min(j8, j7);
        StringBuilder sb = new StringBuilder((iMin * 2) + (this.f8784m > j8 ? 1 : 0));
        int i7 = 0;
        for (j jVar = this.f8782k; jVar != null; jVar = jVar.f8805f) {
            int i8 = 0;
            while (i7 < iMin && i8 < jVar.b()) {
                int i9 = i8 + 1;
                byte bC = jVar.c(i8);
                i7++;
                char[] cArr = p.a;
                sb.append(cArr[(bC >> 4) & 15]);
                sb.append(cArr[bC & 15]);
                i8 = i9;
            }
        }
        if (this.f8784m > j8) {
            sb.append((char) 8230);
        }
        return "Buffer(size=" + this.f8784m + " hex=" + ((Object) sb) + ')';
    }

    @Override // S5.l
    public final void write(byte[] bArr, int i7, int i8) {
        kotlin.jvm.internal.l.f("source", bArr);
        p.a(bArr.length, i7, i8);
        int i9 = i7;
        while (i9 < i8) {
            j jVarM = m(1);
            int iMin = Math.min(i8 - i9, jVarM.a()) + i9;
            P3.m.U(jVarM.f8802c, i9, iMin, bArr, jVarM.a);
            jVarM.f8802c = (iMin - i9) + jVarM.f8802c;
            i9 = iMin;
        }
        this.f8784m += i8 - i7;
    }

    @Override // S5.n
    public final boolean z() {
        return this.f8784m == 0;
    }

    @Override // S5.e
    public final void write(a aVar, long j7) {
        j jVarB;
        kotlin.jvm.internal.l.f("source", aVar);
        if (aVar != this) {
            p.b(aVar.f8784m, 0L, j7);
            while (j7 > 0) {
                kotlin.jvm.internal.l.c(aVar.f8782k);
                int i7 = 0;
                if (j7 < r0.b()) {
                    j jVar = this.f8783l;
                    if (jVar != null && jVar.f8804e) {
                        long j8 = jVar.f8802c + j7;
                        p pVar = jVar.f8803d;
                        if (j8 - ((pVar == null || ((i) pVar).f8800b <= 0) ? jVar.f8801b : 0) <= 8192) {
                            j jVar2 = aVar.f8782k;
                            kotlin.jvm.internal.l.c(jVar2);
                            jVar2.g(jVar, (int) j7);
                            aVar.f8784m -= j7;
                            this.f8784m += j7;
                            return;
                        }
                    }
                    j jVar3 = aVar.f8782k;
                    kotlin.jvm.internal.l.c(jVar3);
                    int i8 = (int) j7;
                    if (i8 > 0 && i8 <= jVar3.f8802c - jVar3.f8801b) {
                        if (i8 >= 1024) {
                            jVarB = jVar3.f();
                        } else {
                            jVarB = k.b();
                            int i9 = jVar3.f8801b;
                            P3.m.U(0, i9, i9 + i8, jVar3.a, jVarB.a);
                        }
                        jVarB.f8802c = jVarB.f8801b + i8;
                        jVar3.f8801b += i8;
                        j jVar4 = jVar3.f8806g;
                        if (jVar4 != null) {
                            jVar4.e(jVarB);
                        } else {
                            jVarB.f8805f = jVar3;
                            jVar3.f8806g = jVarB;
                        }
                        aVar.f8782k = jVarB;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range");
                    }
                }
                j jVar5 = aVar.f8782k;
                kotlin.jvm.internal.l.c(jVar5);
                long jB = jVar5.b();
                j jVarD = jVar5.d();
                aVar.f8782k = jVarD;
                if (jVarD == null) {
                    aVar.f8783l = null;
                }
                if (this.f8782k == null) {
                    this.f8782k = jVar5;
                    this.f8783l = jVar5;
                } else {
                    j jVar6 = this.f8783l;
                    kotlin.jvm.internal.l.c(jVar6);
                    jVar6.e(jVar5);
                    j jVar7 = jVar5.f8806g;
                    if (jVar7 != null) {
                        if (jVar7.f8804e) {
                            int i10 = jVar5.f8802c - jVar5.f8801b;
                            kotlin.jvm.internal.l.c(jVar7);
                            int i11 = 8192 - jVar7.f8802c;
                            j jVar8 = jVar5.f8806g;
                            kotlin.jvm.internal.l.c(jVar8);
                            p pVar2 = jVar8.f8803d;
                            if (pVar2 == null || ((i) pVar2).f8800b <= 0) {
                                j jVar9 = jVar5.f8806g;
                                kotlin.jvm.internal.l.c(jVar9);
                                i7 = jVar9.f8801b;
                            }
                            if (i10 <= i11 + i7) {
                                j jVar10 = jVar5.f8806g;
                                kotlin.jvm.internal.l.c(jVar10);
                                jVar5.g(jVar10, i10);
                                if (jVar5.d() == null) {
                                    k.a(jVar5);
                                    jVar5 = jVar10;
                                } else {
                                    throw new IllegalStateException("Check failed.");
                                }
                            }
                        }
                        this.f8783l = jVar5;
                        if (jVar5.f8806g == null) {
                            this.f8782k = jVar5;
                        }
                    } else {
                        throw new IllegalStateException("cannot compact");
                    }
                }
                aVar.f8784m -= jB;
                this.f8784m += jB;
                j7 -= jB;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // S5.n, S5.l
    public final a a() {
        return this;
    }

    @Override // java.lang.AutoCloseable, S5.e
    public final void close() {
    }

    @Override // S5.e, java.io.Flushable
    public final void flush() {
    }

    @Override // S5.l
    public final void q() {
    }
}
