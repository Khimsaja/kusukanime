package U1;

import B1.B;
import B1.K;
import F.w;
import H1.AbstractC0225f;
import java.nio.ByteBuffer;
import y1.C2393o;

/* loaded from: classes.dex */
public final class b extends AbstractC0225f {

    /* renamed from: B, reason: collision with root package name */
    public final G1.f f9132B;

    /* renamed from: C, reason: collision with root package name */
    public final B f9133C;

    /* renamed from: D, reason: collision with root package name */
    public a f9134D;

    /* renamed from: E, reason: collision with root package name */
    public long f9135E;

    public b() {
        super(6);
        this.f9132B = new G1.f(1);
        this.f9133C = new B();
    }

    @Override // H1.AbstractC0225f
    public final int A(C2393o c2393o) {
        return "application/x-camera-motion".equals(c2393o.f18112n) ? AbstractC0225f.f(4, 0, 0, 0) : AbstractC0225f.f(0, 0, 0, 0);
    }

    @Override // H1.AbstractC0225f, H1.g0
    public final void c(int i7, Object obj) {
        if (i7 == 8) {
            this.f9134D = (a) obj;
        }
    }

    @Override // H1.AbstractC0225f
    public final String j() {
        return "CameraMotionRenderer";
    }

    @Override // H1.AbstractC0225f
    public final boolean l() {
        return k();
    }

    @Override // H1.AbstractC0225f
    public final boolean n() {
        return true;
    }

    @Override // H1.AbstractC0225f
    public final void o() {
        a aVar = this.f9134D;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // H1.AbstractC0225f
    public final void q(long j7, boolean z7) {
        this.f9135E = Long.MIN_VALUE;
        a aVar = this.f9134D;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // H1.AbstractC0225f
    public final void x(long j7, long j8) {
        float[] fArr;
        while (!k() && this.f9135E < 100000 + j7) {
            G1.f fVar = this.f9132B;
            fVar.f();
            w wVar = this.f3458m;
            wVar.r();
            if (w(wVar, fVar, 0) != -4 || fVar.c(4)) {
                return;
            }
            long j9 = fVar.f2611q;
            this.f9135E = j9;
            boolean z7 = j9 < this.f3467v;
            if (this.f9134D != null && !z7) {
                fVar.j();
                ByteBuffer byteBuffer = fVar.f2609o;
                int i7 = K.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    B b4 = this.f9133C;
                    b4.D(bArrArray, iLimit);
                    b4.F(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i8 = 0; i8 < 3; i8++) {
                        fArr2[i8] = Float.intBitsToFloat(b4.i());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f9134D.b(this.f9135E - this.f3466u, fArr);
                }
            }
        }
    }
}
