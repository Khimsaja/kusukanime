package O1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class X {
    public final R1.f a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7370b;

    /* renamed from: c, reason: collision with root package name */
    public final B1.B f7371c;

    /* renamed from: d, reason: collision with root package name */
    public W f7372d;

    /* renamed from: e, reason: collision with root package name */
    public W f7373e;

    /* renamed from: f, reason: collision with root package name */
    public W f7374f;

    /* renamed from: g, reason: collision with root package name */
    public long f7375g;

    public X(R1.f fVar) {
        this.a = fVar;
        int i7 = fVar.f8038b;
        this.f7370b = i7;
        this.f7371c = new B1.B(32);
        W w7 = new W(0L, i7);
        this.f7372d = w7;
        this.f7373e = w7;
        this.f7374f = w7;
    }

    public static W c(W w7, long j7, ByteBuffer byteBuffer, int i7) {
        while (j7 >= w7.f7367l) {
            w7 = (W) w7.f7369n;
        }
        while (i7 > 0) {
            int iMin = Math.min(i7, (int) (w7.f7367l - j7));
            R1.a aVar = (R1.a) w7.f7368m;
            byteBuffer.put(aVar.a, ((int) (j7 - w7.f7366k)) + aVar.f8031b, iMin);
            i7 -= iMin;
            j7 += iMin;
            if (j7 == w7.f7367l) {
                w7 = (W) w7.f7369n;
            }
        }
        return w7;
    }

    public static W d(W w7, long j7, byte[] bArr, int i7) {
        while (j7 >= w7.f7367l) {
            w7 = (W) w7.f7369n;
        }
        int i8 = i7;
        while (i8 > 0) {
            int iMin = Math.min(i8, (int) (w7.f7367l - j7));
            R1.a aVar = (R1.a) w7.f7368m;
            System.arraycopy(aVar.a, ((int) (j7 - w7.f7366k)) + aVar.f8031b, bArr, i7 - i8, iMin);
            i8 -= iMin;
            j7 += iMin;
            if (j7 == w7.f7367l) {
                w7 = (W) w7.f7369n;
            }
        }
        return w7;
    }

    public static W e(W w7, G1.f fVar, L1.g gVar, B1.B b4) {
        int iZ;
        if (fVar.c(1073741824)) {
            long j7 = gVar.f6022b;
            b4.C(1);
            W wD = d(w7, j7, b4.a, 1);
            long j8 = j7 + 1;
            byte b7 = b4.a[0];
            boolean z7 = (b7 & 128) != 0;
            int i7 = b7 & 127;
            G1.b bVar = fVar.f2608n;
            byte[] bArr = bVar.a;
            if (bArr == null) {
                bVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            w7 = d(wD, j8, bVar.a, i7);
            long j9 = j8 + i7;
            if (z7) {
                b4.C(2);
                w7 = d(w7, j9, b4.a, 2);
                j9 += 2;
                iZ = b4.z();
            } else {
                iZ = 1;
            }
            int[] iArr = bVar.f2600d;
            if (iArr == null || iArr.length < iZ) {
                iArr = new int[iZ];
            }
            int[] iArr2 = bVar.f2601e;
            if (iArr2 == null || iArr2.length < iZ) {
                iArr2 = new int[iZ];
            }
            if (z7) {
                int i8 = iZ * 6;
                b4.C(i8);
                w7 = d(w7, j9, b4.a, i8);
                j9 += i8;
                b4.F(0);
                for (int i9 = 0; i9 < iZ; i9++) {
                    iArr[i9] = b4.z();
                    iArr2[i9] = b4.x();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = gVar.a - ((int) (j9 - gVar.f6022b));
            }
            V1.F f5 = (V1.F) gVar.f6023c;
            int i10 = B1.K.a;
            byte[] bArr2 = f5.f9319b;
            byte[] bArr3 = bVar.a;
            bVar.f2602f = iZ;
            bVar.f2600d = iArr;
            bVar.f2601e = iArr2;
            bVar.f2598b = bArr2;
            bVar.a = bArr3;
            int i11 = f5.a;
            bVar.f2599c = i11;
            int i12 = f5.f9320c;
            bVar.f2603g = i12;
            int i13 = f5.f9321d;
            bVar.f2604h = i13;
            MediaCodec.CryptoInfo cryptoInfo = bVar.f2605i;
            cryptoInfo.numSubSamples = iZ;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i11;
            if (B1.K.a >= 24) {
                F.w wVar = bVar.f2606j;
                wVar.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) wVar.f2038m;
                pattern.set(i12, i13);
                ((MediaCodec.CryptoInfo) wVar.f2037l).setPattern(pattern);
            }
            long j10 = gVar.f6022b;
            int i14 = (int) (j9 - j10);
            gVar.f6022b = j10 + i14;
            gVar.a -= i14;
        }
        if (!fVar.c(268435456)) {
            fVar.h(gVar.a);
            return c(w7, gVar.f6022b, fVar.f2609o, gVar.a);
        }
        b4.C(4);
        W wD2 = d(w7, gVar.f6022b, b4.a, 4);
        int iX = b4.x();
        gVar.f6022b += 4;
        gVar.a -= 4;
        fVar.h(iX);
        W wC = c(wD2, gVar.f6022b, fVar.f2609o, iX);
        gVar.f6022b += iX;
        int i15 = gVar.a - iX;
        gVar.a = i15;
        ByteBuffer byteBuffer = fVar.f2612r;
        if (byteBuffer == null || byteBuffer.capacity() < i15) {
            fVar.f2612r = ByteBuffer.allocate(i15);
        } else {
            fVar.f2612r.clear();
        }
        return c(wC, gVar.f6022b, fVar.f2612r, gVar.a);
    }

    public final void a(long j7) {
        W w7;
        if (j7 == -1) {
            return;
        }
        while (true) {
            w7 = this.f7372d;
            if (j7 < w7.f7367l) {
                break;
            }
            R1.f fVar = this.a;
            R1.a aVar = (R1.a) w7.f7368m;
            synchronized (fVar) {
                R1.a[] aVarArr = fVar.f8042f;
                int i7 = fVar.f8041e;
                fVar.f8041e = i7 + 1;
                aVarArr[i7] = aVar;
                fVar.f8040d--;
                fVar.notifyAll();
            }
            W w8 = this.f7372d;
            w8.f7368m = null;
            W w9 = (W) w8.f7369n;
            w8.f7369n = null;
            this.f7372d = w9;
        }
        if (this.f7373e.f7366k < w7.f7366k) {
            this.f7373e = w7;
        }
    }

    public final int b(int i7) {
        R1.a aVar;
        W w7 = this.f7374f;
        if (((R1.a) w7.f7368m) == null) {
            R1.f fVar = this.a;
            synchronized (fVar) {
                try {
                    int i8 = fVar.f8040d + 1;
                    fVar.f8040d = i8;
                    int i9 = fVar.f8041e;
                    if (i9 > 0) {
                        R1.a[] aVarArr = fVar.f8042f;
                        int i10 = i9 - 1;
                        fVar.f8041e = i10;
                        aVar = aVarArr[i10];
                        aVar.getClass();
                        fVar.f8042f[fVar.f8041e] = null;
                    } else {
                        R1.a aVar2 = new R1.a(new byte[fVar.f8038b], 0);
                        R1.a[] aVarArr2 = fVar.f8042f;
                        if (i8 > aVarArr2.length) {
                            fVar.f8042f = (R1.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            W w8 = new W(this.f7374f.f7367l, this.f7370b);
            w7.f7368m = aVar;
            w7.f7369n = w8;
        }
        return Math.min(i7, (int) (this.f7374f.f7367l - this.f7375g));
    }
}
