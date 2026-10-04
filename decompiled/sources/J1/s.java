package J1;

import B1.K;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s extends z1.h {

    /* renamed from: i, reason: collision with root package name */
    public int[] f4263i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f4264j;

    @Override // z1.g
    public final void e(ByteBuffer byteBuffer) {
        int[] iArr = this.f4264j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferK = k(((iLimit - iPosition) / this.f18963b.f18962d) * this.f18964c.f18962d);
        while (iPosition < iLimit) {
            for (int i7 : iArr) {
                int iQ = (K.q(this.f18963b.f18961c) * i7) + iPosition;
                int i8 = this.f18963b.f18961c;
                if (i8 == 2) {
                    byteBufferK.putShort(byteBuffer.getShort(iQ));
                } else {
                    if (i8 != 4) {
                        throw new IllegalStateException("Unexpected encoding: " + this.f18963b.f18961c);
                    }
                    byteBufferK.putFloat(byteBuffer.getFloat(iQ));
                }
            }
            iPosition += this.f18963b.f18962d;
        }
        byteBuffer.position(iLimit);
        byteBufferK.flip();
    }

    @Override // z1.h
    public final z1.e g(z1.e eVar) throws z1.f {
        int[] iArr = this.f4263i;
        if (iArr == null) {
            return z1.e.f18959e;
        }
        int i7 = eVar.f18961c;
        if (i7 != 2 && i7 != 4) {
            throw new z1.f(eVar);
        }
        int length = iArr.length;
        int i8 = eVar.f18960b;
        boolean z7 = i8 != length;
        int i9 = 0;
        while (i9 < iArr.length) {
            int i10 = iArr[i9];
            if (i10 >= i8) {
                throw new z1.f("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", eVar);
            }
            z7 |= i10 != i9;
            i9++;
        }
        if (z7) {
            return new z1.e(eVar.a, iArr.length, i7);
        }
        return z1.e.f18959e;
    }

    @Override // z1.h
    public final void h() {
        this.f4264j = this.f4263i;
    }

    @Override // z1.h
    public final void j() {
        this.f4264j = null;
        this.f4263i = null;
    }
}
