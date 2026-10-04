package L1;

import B1.AbstractC0015b;
import C2.C0034g;
import F.w;
import H1.AbstractC0225f;
import H1.C0234o;
import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayDeque;
import y1.C2393o;

/* loaded from: classes.dex */
public final class h extends AbstractC0225f {

    /* renamed from: B, reason: collision with root package name */
    public final C0034g f6024B;

    /* renamed from: C, reason: collision with root package name */
    public final G1.f f6025C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayDeque f6026D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f6027E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f6028F;

    /* renamed from: G, reason: collision with root package name */
    public f f6029G;

    /* renamed from: H, reason: collision with root package name */
    public long f6030H;
    public long I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public int f6031K;

    /* renamed from: L, reason: collision with root package name */
    public C2393o f6032L;

    /* renamed from: M, reason: collision with root package name */
    public b f6033M;

    /* renamed from: N, reason: collision with root package name */
    public G1.f f6034N;

    /* renamed from: O, reason: collision with root package name */
    public ImageOutput f6035O;

    /* renamed from: P, reason: collision with root package name */
    public Bitmap f6036P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f6037Q;

    /* renamed from: R, reason: collision with root package name */
    public g f6038R;

    /* renamed from: S, reason: collision with root package name */
    public g f6039S;

    /* renamed from: T, reason: collision with root package name */
    public int f6040T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f6041U;

    public h(C0034g c0034g) {
        super(4);
        this.f6024B = c0034g;
        this.f6035O = ImageOutput.a;
        this.f6025C = new G1.f(0);
        this.f6029G = f.f6020c;
        this.f6026D = new ArrayDeque();
        this.I = -9223372036854775807L;
        this.f6030H = -9223372036854775807L;
        this.J = 0;
        this.f6031K = 1;
    }

    @Override // H1.AbstractC0225f
    public final int A(C2393o c2393o) {
        return this.f6024B.w(c2393o);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(long r13) throws java.lang.InterruptedException, H1.C0234o {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.h.C(long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D(long r13) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.h.D(long):boolean");
    }

    public final void E() throws InterruptedException, C0234o {
        if (this.f6041U) {
            C2393o c2393o = this.f6032L;
            c2393o.getClass();
            C0034g c0034g = this.f6024B;
            int iW = c0034g.w(c2393o);
            if (iW != AbstractC0225f.f(4, 0, 0, 0) && iW != AbstractC0225f.f(3, 0, 0, 0)) {
                throw g(new d("Provided decoder factory can't create decoder for format."), this.f6032L, false, 4005);
            }
            b bVar = this.f6033M;
            if (bVar != null) {
                bVar.a();
            }
            this.f6033M = new b((I1.e) c0034g.f741l);
            this.f6041U = false;
        }
    }

    public final void F() throws InterruptedException {
        this.f6034N = null;
        this.J = 0;
        this.I = -9223372036854775807L;
        b bVar = this.f6033M;
        if (bVar != null) {
            bVar.a();
            this.f6033M = null;
        }
    }

    @Override // H1.AbstractC0225f, H1.g0
    public final void c(int i7, Object obj) {
        if (i7 != 15) {
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.a;
        }
        this.f6035O = imageOutput;
    }

    @Override // H1.AbstractC0225f
    public final String j() {
        return "ImageRenderer";
    }

    @Override // H1.AbstractC0225f
    public final boolean l() {
        return this.f6028F;
    }

    @Override // H1.AbstractC0225f
    public final boolean n() {
        int i7 = this.f6031K;
        if (i7 != 3) {
            return i7 == 0 && this.f6037Q;
        }
        return true;
    }

    @Override // H1.AbstractC0225f
    public final void o() throws InterruptedException {
        this.f6032L = null;
        this.f6029G = f.f6020c;
        this.f6026D.clear();
        F();
        this.f6035O.a();
    }

    @Override // H1.AbstractC0225f
    public final void p(boolean z7, boolean z8) {
        this.f6031K = z8 ? 1 : 0;
    }

    @Override // H1.AbstractC0225f
    public final void q(long j7, boolean z7) {
        this.f6031K = Math.min(this.f6031K, 1);
        this.f6028F = false;
        this.f6027E = false;
        this.f6036P = null;
        this.f6038R = null;
        this.f6039S = null;
        this.f6037Q = false;
        this.f6034N = null;
        b bVar = this.f6033M;
        if (bVar != null) {
            bVar.flush();
        }
        this.f6026D.clear();
    }

    @Override // H1.AbstractC0225f
    public final void r() throws InterruptedException {
        F();
    }

    @Override // H1.AbstractC0225f
    public final void s() throws InterruptedException {
        F();
        this.f6031K = Math.min(this.f6031K, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // H1.AbstractC0225f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(y1.C2393o[] r5, long r6, long r8, O1.B r10) {
        /*
            r4 = this;
            L1.f r5 = r4.f6029G
            long r5 = r5.f6021b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.f6026D
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.I
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.f6030H
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            L1.f r6 = new L1.f
            long r0 = r4.I
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            L1.f r5 = new L1.f
            r5.<init>(r0, r8)
            r4.f6029G = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.h.v(y1.o[], long, long, O1.B):void");
    }

    @Override // H1.AbstractC0225f
    public final void x(long j7, long j8) throws InterruptedException, C0234o {
        if (this.f6028F) {
            return;
        }
        if (this.f6032L == null) {
            w wVar = this.f3458m;
            wVar.r();
            G1.f fVar = this.f6025C;
            fVar.f();
            int iW = w(wVar, fVar, 2);
            if (iW != -5) {
                if (iW == -4) {
                    AbstractC0015b.h(fVar.c(4));
                    this.f6027E = true;
                    this.f6028F = true;
                    return;
                }
                return;
            }
            C2393o c2393o = (C2393o) wVar.f2038m;
            AbstractC0015b.i(c2393o);
            this.f6032L = c2393o;
            this.f6041U = true;
        }
        if (this.f6033M == null) {
            E();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (C(j7)) {
            }
            while (D(j7)) {
            }
            Trace.endSection();
        } catch (d e7) {
            throw g(e7, null, false, 4003);
        }
    }
}
