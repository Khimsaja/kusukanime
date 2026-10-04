package J1;

import B1.K;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class G extends z1.h {

    /* renamed from: i, reason: collision with root package name */
    public int f4173i;

    /* renamed from: j, reason: collision with root package name */
    public int f4174j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4175k;

    /* renamed from: l, reason: collision with root package name */
    public int f4176l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f4177m;

    /* renamed from: n, reason: collision with root package name */
    public int f4178n;

    /* renamed from: o, reason: collision with root package name */
    public long f4179o;

    @Override // z1.h, z1.g
    public final ByteBuffer a() {
        int i7;
        if (super.d() && (i7 = this.f4178n) > 0) {
            k(i7).put(this.f4177m, 0, this.f4178n).flip();
            this.f4178n = 0;
        }
        return super.a();
    }

    @Override // z1.h, z1.g
    public final boolean d() {
        return super.d() && this.f4178n == 0;
    }

    @Override // z1.g
    public final void e(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i7 = iLimit - iPosition;
        if (i7 == 0) {
            return;
        }
        int iMin = Math.min(i7, this.f4176l);
        this.f4179o += iMin / this.f18963b.f18962d;
        this.f4176l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f4176l > 0) {
            return;
        }
        int i8 = i7 - iMin;
        int length = (this.f4178n + i8) - this.f4177m.length;
        ByteBuffer byteBufferK = k(length);
        int iH = K.h(length, 0, this.f4178n);
        byteBufferK.put(this.f4177m, 0, iH);
        int iH2 = K.h(length - iH, 0, i8);
        byteBuffer.limit(byteBuffer.position() + iH2);
        byteBufferK.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i9 = i8 - iH2;
        int i10 = this.f4178n - iH;
        this.f4178n = i10;
        byte[] bArr = this.f4177m;
        System.arraycopy(bArr, iH, bArr, 0, i10);
        byteBuffer.get(this.f4177m, this.f4178n, i9);
        this.f4178n += i9;
        byteBufferK.flip();
    }

    @Override // z1.h
    public final z1.e g(z1.e eVar) throws z1.f {
        int i7 = eVar.f18961c;
        if (i7 != 2 && i7 != 4) {
            throw new z1.f(eVar);
        }
        this.f4175k = true;
        return (this.f4173i == 0 && this.f4174j == 0) ? z1.e.f18959e : eVar;
    }

    @Override // z1.h
    public final void h() {
        if (this.f4175k) {
            this.f4175k = false;
            int i7 = this.f4174j;
            int i8 = this.f18963b.f18962d;
            this.f4177m = new byte[i7 * i8];
            this.f4176l = this.f4173i * i8;
        }
        this.f4178n = 0;
    }

    @Override // z1.h
    public final void i() {
        if (this.f4175k) {
            if (this.f4178n > 0) {
                this.f4179o += r0 / this.f18963b.f18962d;
            }
            this.f4178n = 0;
        }
    }

    @Override // z1.h
    public final void j() {
        this.f4177m = K.f302c;
    }
}
