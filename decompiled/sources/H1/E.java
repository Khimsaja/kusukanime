package H1;

import android.media.MediaFormat;
import y1.C2393o;

/* loaded from: classes.dex */
public final class E implements T1.q, U1.a, g0 {

    /* renamed from: k, reason: collision with root package name */
    public T1.q f3213k;

    /* renamed from: l, reason: collision with root package name */
    public U1.a f3214l;

    /* renamed from: m, reason: collision with root package name */
    public T1.q f3215m;

    /* renamed from: n, reason: collision with root package name */
    public U1.a f3216n;

    @Override // T1.q
    public final void a(long j7, long j8, C2393o c2393o, MediaFormat mediaFormat) {
        long j9;
        long j10;
        C2393o c2393o2;
        MediaFormat mediaFormat2;
        T1.q qVar = this.f3215m;
        if (qVar != null) {
            qVar.a(j7, j8, c2393o, mediaFormat);
            mediaFormat2 = mediaFormat;
            c2393o2 = c2393o;
            j10 = j8;
            j9 = j7;
        } else {
            j9 = j7;
            j10 = j8;
            c2393o2 = c2393o;
            mediaFormat2 = mediaFormat;
        }
        T1.q qVar2 = this.f3213k;
        if (qVar2 != null) {
            qVar2.a(j9, j10, c2393o2, mediaFormat2);
        }
    }

    @Override // U1.a
    public final void b(long j7, float[] fArr) {
        U1.a aVar = this.f3216n;
        if (aVar != null) {
            aVar.b(j7, fArr);
        }
        U1.a aVar2 = this.f3214l;
        if (aVar2 != null) {
            aVar2.b(j7, fArr);
        }
    }

    @Override // H1.g0
    public final void c(int i7, Object obj) {
        if (i7 == 7) {
            this.f3213k = (T1.q) obj;
            return;
        }
        if (i7 == 8) {
            this.f3214l = (U1.a) obj;
            return;
        }
        if (i7 != 10000) {
            return;
        }
        U1.k kVar = (U1.k) obj;
        if (kVar == null) {
            this.f3215m = null;
            this.f3216n = null;
        } else {
            this.f3215m = kVar.getVideoFrameMetadataListener();
            this.f3216n = kVar.getCameraMotionListener();
        }
    }

    @Override // U1.a
    public final void d() {
        U1.a aVar = this.f3216n;
        if (aVar != null) {
            aVar.d();
        }
        U1.a aVar2 = this.f3214l;
        if (aVar2 != null) {
            aVar2.d();
        }
    }
}
