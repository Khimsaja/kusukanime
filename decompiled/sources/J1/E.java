package J1;

import B1.AbstractC0015b;
import B1.K;
import io.ktor.client.utils.CIOKt;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class E extends z1.h {

    /* renamed from: n, reason: collision with root package name */
    public int f4163n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4164o;

    /* renamed from: p, reason: collision with root package name */
    public int f4165p;

    /* renamed from: q, reason: collision with root package name */
    public long f4166q;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f4168s;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f4171v;

    /* renamed from: r, reason: collision with root package name */
    public int f4167r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f4169t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f4170u = 0;

    /* renamed from: l, reason: collision with root package name */
    public final long f4161l = 100000;

    /* renamed from: i, reason: collision with root package name */
    public final float f4158i = 0.2f;

    /* renamed from: m, reason: collision with root package name */
    public final long f4162m = 2000000;

    /* renamed from: k, reason: collision with root package name */
    public final int f4160k = 10;

    /* renamed from: j, reason: collision with root package name */
    public final short f4159j = 1024;

    public E() {
        byte[] bArr = K.f302c;
        this.f4168s = bArr;
        this.f4171v = bArr;
    }

    @Override // z1.h, z1.g
    public final boolean b() {
        return super.b() && this.f4164o;
    }

    @Override // z1.g
    public final void e(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f18968g.hasRemaining()) {
            int i7 = this.f4165p;
            short s7 = this.f4159j;
            if (i7 == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f4168s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s7) {
                        int i8 = this.f4163n;
                        iPosition = ((iLimit3 / i8) * i8) + i8;
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f4165p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    k(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException();
                }
                AbstractC0015b.h(this.f4169t < this.f4168s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s7) {
                        int i9 = this.f4163n;
                        iLimit = (iPosition2 / i9) * i9;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f4169t;
                int i10 = this.f4170u;
                int length2 = length + i10;
                byte[] bArr = this.f4168s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i10 - (bArr.length - length);
                }
                int i11 = length - length2;
                boolean z7 = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i11);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f4168s, length2, iMin);
                int i12 = this.f4170u + iMin;
                this.f4170u = i12;
                AbstractC0015b.h(i12 <= this.f4168s.length);
                boolean z8 = z7 && iPosition3 < i11;
                m(z8);
                if (z8) {
                    this.f4165p = 0;
                    this.f4167r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // z1.h
    public final z1.e g(z1.e eVar) throws z1.f {
        if (eVar.f18961c == 2) {
            return eVar.a == -1 ? z1.e.f18959e : eVar;
        }
        throw new z1.f(eVar);
    }

    @Override // z1.h
    public final void h() {
        if (b()) {
            int i7 = this.f18963b.f18960b * 2;
            this.f4163n = i7;
            int i8 = ((((int) ((this.f4161l * r0.a) / 1000000)) / 2) / i7) * i7 * 2;
            if (this.f4168s.length != i8) {
                this.f4168s = new byte[i8];
                this.f4171v = new byte[i8];
            }
        }
        this.f4165p = 0;
        this.f4166q = 0L;
        this.f4167r = 0;
        this.f4169t = 0;
        this.f4170u = 0;
    }

    @Override // z1.h
    public final void i() {
        if (this.f4170u > 0) {
            m(true);
            this.f4167r = 0;
        }
    }

    @Override // z1.h
    public final void j() {
        this.f4164o = false;
        byte[] bArr = K.f302c;
        this.f4168s = bArr;
        this.f4171v = bArr;
    }

    public final int l(int i7) {
        int length = ((((int) ((this.f4162m * this.f18963b.a) / 1000000)) - this.f4167r) * this.f4163n) - (this.f4168s.length / 2);
        AbstractC0015b.h(length >= 0);
        int iMin = (int) Math.min((i7 * this.f4158i) + 0.5f, length);
        int i8 = this.f4163n;
        return (iMin / i8) * i8;
    }

    public final void m(boolean z7) {
        int length;
        int iL;
        int i7 = this.f4170u;
        byte[] bArr = this.f4168s;
        if (i7 == bArr.length || z7) {
            if (this.f4167r == 0) {
                if (z7) {
                    n(i7, 3);
                    length = i7;
                } else {
                    AbstractC0015b.h(i7 >= bArr.length / 2);
                    length = this.f4168s.length / 2;
                    n(length, 0);
                }
                iL = length;
            } else if (z7) {
                int length2 = i7 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iL2 = l(length2) + (this.f4168s.length / 2);
                n(iL2, 2);
                iL = iL2;
                length = length3;
            } else {
                length = i7 - (bArr.length / 2);
                iL = l(length);
                n(iL, 1);
            }
            AbstractC0015b.g("bytesConsumed is not aligned to frame size: %s" + length, length % this.f4163n == 0);
            AbstractC0015b.h(i7 >= iL);
            this.f4170u -= length;
            int i8 = this.f4169t + length;
            this.f4169t = i8;
            this.f4169t = i8 % this.f4168s.length;
            this.f4167r = (iL / this.f4163n) + this.f4167r;
            this.f4166q += (length - iL) / r2;
        }
    }

    public final void n(int i7, int i8) {
        if (i7 == 0) {
            return;
        }
        AbstractC0015b.c(this.f4170u >= i7);
        if (i8 == 2) {
            int i9 = this.f4169t;
            int i10 = this.f4170u;
            int i11 = i9 + i10;
            byte[] bArr = this.f4168s;
            if (i11 <= bArr.length) {
                System.arraycopy(bArr, i11 - i7, this.f4171v, 0, i7);
            } else {
                int length = i10 - (bArr.length - i9);
                if (length >= i7) {
                    System.arraycopy(bArr, length - i7, this.f4171v, 0, i7);
                } else {
                    int i12 = i7 - length;
                    System.arraycopy(bArr, bArr.length - i12, this.f4171v, 0, i12);
                    System.arraycopy(this.f4168s, 0, this.f4171v, i12, length);
                }
            }
        } else {
            int i13 = this.f4169t;
            int i14 = i13 + i7;
            byte[] bArr2 = this.f4168s;
            if (i14 <= bArr2.length) {
                System.arraycopy(bArr2, i13, this.f4171v, 0, i7);
            } else {
                int length2 = bArr2.length - i13;
                System.arraycopy(bArr2, i13, this.f4171v, 0, length2);
                System.arraycopy(this.f4168s, 0, this.f4171v, length2, i7 - length2);
            }
        }
        AbstractC0015b.b("sizeToOutput is not aligned to frame size: " + i7, i7 % this.f4163n == 0);
        AbstractC0015b.h(this.f4169t < this.f4168s.length);
        byte[] bArr3 = this.f4171v;
        AbstractC0015b.b("byteOutput size is not aligned to frame size " + i7, i7 % this.f4163n == 0);
        if (i8 != 3) {
            for (int i15 = 0; i15 < i7; i15 += 2) {
                int i16 = i15 + 1;
                int i17 = (bArr3[i16] << 8) | (bArr3[i15] & 255);
                int i18 = this.f4160k;
                if (i8 == 0) {
                    i18 = ((((i15 * CIOKt.DEFAULT_HTTP_POOL_SIZE) / (i7 - 1)) * (i18 - 100)) / CIOKt.DEFAULT_HTTP_POOL_SIZE) + 100;
                } else if (i8 == 2) {
                    i18 += (((i15 * CIOKt.DEFAULT_HTTP_POOL_SIZE) * (100 - i18)) / (i7 - 1)) / CIOKt.DEFAULT_HTTP_POOL_SIZE;
                }
                int i19 = (i17 * i18) / 100;
                if (i19 >= 32767) {
                    bArr3[i15] = -1;
                    bArr3[i16] = 127;
                } else if (i19 <= -32768) {
                    bArr3[i15] = 0;
                    bArr3[i16] = -128;
                } else {
                    bArr3[i15] = (byte) (i19 & 255);
                    bArr3[i16] = (byte) (i19 >> 8);
                }
            }
        }
        k(i7).put(bArr3, 0, i7).flip();
    }
}
