package U1;

import B1.AbstractC0015b;
import B1.B;
import B1.C0024k;
import B1.G;
import H1.C0221b;
import T1.q;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import y1.C2393o;

/* loaded from: classes.dex */
public final class i implements q, a {

    /* renamed from: s, reason: collision with root package name */
    public int f9164s;

    /* renamed from: t, reason: collision with root package name */
    public SurfaceTexture f9165t;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f9168w;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f9156k = new AtomicBoolean();

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f9157l = new AtomicBoolean(true);

    /* renamed from: m, reason: collision with root package name */
    public final g f9158m = new g();

    /* renamed from: n, reason: collision with root package name */
    public final C0221b f9159n = new C0221b(3);

    /* renamed from: o, reason: collision with root package name */
    public final G f9160o = new G(0, (byte) 0);

    /* renamed from: p, reason: collision with root package name */
    public final G f9161p = new G(0, (byte) 0);

    /* renamed from: q, reason: collision with root package name */
    public final float[] f9162q = new float[16];

    /* renamed from: r, reason: collision with root package name */
    public final float[] f9163r = new float[16];

    /* renamed from: u, reason: collision with root package name */
    public volatile int f9166u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f9167v = -1;

    @Override // T1.q
    public final void a(long j7, long j8, C2393o c2393o, MediaFormat mediaFormat) {
        int i7;
        ArrayList arrayListU;
        int iG;
        this.f9160o.a(j8, Long.valueOf(j7));
        byte[] bArr = c2393o.f18124z;
        int i8 = c2393o.f18088A;
        byte[] bArr2 = this.f9168w;
        int i9 = this.f9167v;
        this.f9168w = bArr;
        if (i8 == -1) {
            i8 = this.f9166u;
        }
        this.f9167v = i8;
        if (i9 == i8 && Arrays.equals(bArr2, this.f9168w)) {
            return;
        }
        byte[] bArr3 = this.f9168w;
        f fVar = null;
        if (bArr3 != null) {
            int i10 = this.f9167v;
            B b4 = new B(bArr3);
            try {
                b4.G(4);
                iG = b4.g();
                b4.F(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (iG == 1886547818) {
                b4.G(8);
                int i11 = b4.f288b;
                int i12 = b4.f289c;
                while (i11 < i12) {
                    int iG2 = b4.g() + i11;
                    if (iG2 > i11 && iG2 <= i12) {
                        int iG3 = b4.g();
                        if (iG3 != 2037673328 && iG3 != 1836279920) {
                            b4.F(iG2);
                            i11 = iG2;
                        }
                        b4.E(iG2);
                        arrayListU = n6.d.U(b4);
                        break;
                    }
                    break;
                }
                arrayListU = null;
            } else {
                arrayListU = n6.d.U(b4);
            }
            if (arrayListU != null) {
                int size = arrayListU.size();
                if (size == 1) {
                    e eVar = (e) arrayListU.get(0);
                    fVar = new f(eVar, eVar, i10);
                } else if (size == 2) {
                    fVar = new f((e) arrayListU.get(0), (e) arrayListU.get(1), i10);
                }
            }
        }
        if (fVar == null || !g.b(fVar)) {
            int i13 = this.f9167v;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f5 = radians / 36;
            float f7 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 36; i14 < i17; i17 = 36) {
                float f8 = radians / 2.0f;
                float f9 = (i14 * f5) - f8;
                int i18 = i14 + 1;
                float f10 = (i18 * f5) - f8;
                int i19 = 0;
                while (i19 < 73) {
                    float f11 = f10;
                    int i20 = i18;
                    float f12 = radians;
                    int i21 = i15;
                    int i22 = i16;
                    int i23 = 2;
                    int i24 = 0;
                    while (i24 < i23) {
                        float f13 = i24 == 0 ? f9 : f11;
                        float f14 = radians2;
                        float f15 = i19 * f7;
                        float f16 = f9;
                        float f17 = f5;
                        double d4 = 50.0f;
                        double d6 = (f15 + 3.1415927f) - (f14 / 2.0f);
                        double dSin = Math.sin(d6) * d4;
                        double d7 = f13;
                        fArr[i21] = -((float) (Math.cos(d7) * dSin));
                        fArr[i21 + 1] = (float) (Math.sin(d7) * d4);
                        int i25 = i21 + 3;
                        fArr[i21 + 2] = (float) (Math.cos(d6) * d4 * Math.cos(d7));
                        fArr2[i22] = f15 / f14;
                        int i26 = i22 + 2;
                        fArr2[i22 + 1] = ((i14 + i24) * f17) / f12;
                        if ((i19 == 0 && i24 == 0) || (i19 == 72 && i24 == 1)) {
                            System.arraycopy(fArr, i21, fArr, i25, 3);
                            i21 += 6;
                            i7 = 2;
                            System.arraycopy(fArr2, i22, fArr2, i26, 2);
                            i22 += 4;
                        } else {
                            i7 = 2;
                            i21 = i25;
                            i22 = i26;
                        }
                        i24++;
                        i23 = i7;
                        radians2 = f14;
                        f9 = f16;
                        f5 = f17;
                    }
                    i19++;
                    i15 = i21;
                    i16 = i22;
                    f10 = f11;
                    i18 = i20;
                    radians = f12;
                    f5 = f5;
                }
                i14 = i18;
            }
            e eVar2 = new e(new G(0, 1, fArr, fArr2));
            fVar = new f(eVar2, eVar2, i13);
        }
        this.f9161p.a(j8, fVar);
    }

    @Override // U1.a
    public final void b(long j7, float[] fArr) {
        ((G) this.f9159n.f3407n).a(j7, fArr);
    }

    public final SurfaceTexture c() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            AbstractC0015b.d();
            this.f9158m.a();
            AbstractC0015b.d();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            AbstractC0015b.d();
            int i7 = iArr[0];
            GLES20.glBindTexture(36197, i7);
            AbstractC0015b.d();
            GLES20.glTexParameteri(36197, 10240, 9729);
            AbstractC0015b.d();
            GLES20.glTexParameteri(36197, 10241, 9729);
            AbstractC0015b.d();
            GLES20.glTexParameteri(36197, 10242, 33071);
            AbstractC0015b.d();
            GLES20.glTexParameteri(36197, 10243, 33071);
            AbstractC0015b.d();
            this.f9164s = i7;
        } catch (C0024k e7) {
            AbstractC0015b.n("SceneRenderer", "Failed to initialize the renderer", e7);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f9164s);
        this.f9165t = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: U1.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f9155k.f9156k.set(true);
            }
        });
        return this.f9165t;
    }

    @Override // U1.a
    public final void d() {
        this.f9160o.c();
        C0221b c0221b = this.f9159n;
        ((G) c0221b.f3407n).c();
        c0221b.f3404k = false;
        this.f9157l.set(true);
    }
}
