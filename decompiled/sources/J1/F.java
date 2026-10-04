package J1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class F extends z1.h {

    /* renamed from: i, reason: collision with root package name */
    public static final int f4172i = Float.floatToIntBits(Float.NaN);

    public static void l(int i7, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i7 * 4.656612875245797E-10d));
        if (iFloatToIntBits == f4172i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // z1.g
    public final void e(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferK;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i7 = iLimit - iPosition;
        int i8 = this.f18963b.f18961c;
        if (i8 == 21) {
            byteBufferK = k((i7 / 3) * 4);
            while (iPosition < iLimit) {
                l(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferK);
                iPosition += 3;
            }
        } else if (i8 == 22) {
            byteBufferK = k(i7);
            while (iPosition < iLimit) {
                l((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferK);
                iPosition += 4;
            }
        } else if (i8 == 1342177280) {
            byteBufferK = k((i7 / 3) * 4);
            while (iPosition < iLimit) {
                l(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferK);
                iPosition += 3;
            }
        } else {
            if (i8 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferK = k(i7);
            while (iPosition < iLimit) {
                l((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferK);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferK.flip();
    }

    @Override // z1.h
    public final z1.e g(z1.e eVar) throws z1.f {
        int i7 = eVar.f18961c;
        if (i7 == 21 || i7 == 1342177280 || i7 == 22 || i7 == 1610612736 || i7 == 4) {
            return i7 != 4 ? new z1.e(eVar.a, eVar.f18960b, 4) : z1.e.f18959e;
        }
        throw new z1.f(eVar);
    }
}
