package M1;

import B1.AbstractC0015b;
import B1.K;
import C2.C0034g;
import H1.AbstractC0225f;
import H1.C0226g;
import H1.C0227h;
import H1.C0234o;
import H1.H;
import J1.D;
import O1.a0;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import y1.C2393o;

/* loaded from: classes.dex */
public abstract class s extends AbstractC0225f {

    /* renamed from: L0, reason: collision with root package name */
    public static final byte[] f6478L0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public long A0;

    /* renamed from: B, reason: collision with root package name */
    public final l f6479B;

    /* renamed from: B0, reason: collision with root package name */
    public long f6480B0;

    /* renamed from: C, reason: collision with root package name */
    public final k f6481C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f6482C0;

    /* renamed from: D, reason: collision with root package name */
    public final float f6483D;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f6484D0;

    /* renamed from: E, reason: collision with root package name */
    public final G1.f f6485E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f6486E0;

    /* renamed from: F, reason: collision with root package name */
    public final G1.f f6487F;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f6488F0;

    /* renamed from: G, reason: collision with root package name */
    public final G1.f f6489G;

    /* renamed from: G0, reason: collision with root package name */
    public C0234o f6490G0;

    /* renamed from: H, reason: collision with root package name */
    public final i f6491H;

    /* renamed from: H0, reason: collision with root package name */
    public C0226g f6492H0;
    public final MediaCodec.BufferInfo I;

    /* renamed from: I0, reason: collision with root package name */
    public r f6493I0;
    public final ArrayDeque J;

    /* renamed from: J0, reason: collision with root package name */
    public long f6494J0;

    /* renamed from: K, reason: collision with root package name */
    public final D f6495K;

    /* renamed from: K0, reason: collision with root package name */
    public boolean f6496K0;

    /* renamed from: L, reason: collision with root package name */
    public C2393o f6497L;

    /* renamed from: M, reason: collision with root package name */
    public C2393o f6498M;

    /* renamed from: N, reason: collision with root package name */
    public C0034g f6499N;

    /* renamed from: O, reason: collision with root package name */
    public C0034g f6500O;

    /* renamed from: P, reason: collision with root package name */
    public H f6501P;

    /* renamed from: Q, reason: collision with root package name */
    public MediaCrypto f6502Q;

    /* renamed from: R, reason: collision with root package name */
    public final long f6503R;

    /* renamed from: S, reason: collision with root package name */
    public float f6504S;

    /* renamed from: T, reason: collision with root package name */
    public float f6505T;

    /* renamed from: U, reason: collision with root package name */
    public m f6506U;

    /* renamed from: V, reason: collision with root package name */
    public C2393o f6507V;

    /* renamed from: W, reason: collision with root package name */
    public MediaFormat f6508W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f6509X;

    /* renamed from: Y, reason: collision with root package name */
    public float f6510Y;

    /* renamed from: Z, reason: collision with root package name */
    public ArrayDeque f6511Z;

    /* renamed from: a0, reason: collision with root package name */
    public q f6512a0;

    /* renamed from: b0, reason: collision with root package name */
    public p f6513b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f6514c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f6515d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f6516e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f6517f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f6518g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f6519h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f6520i0;

    /* renamed from: j0, reason: collision with root package name */
    public long f6521j0;

    /* renamed from: k0, reason: collision with root package name */
    public long f6522k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f6523l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f6524m0;

    /* renamed from: n0, reason: collision with root package name */
    public ByteBuffer f6525n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f6526o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f6527p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f6528q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f6529r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f6530s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f6531t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f6532u0;
    public int v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f6533w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f6534x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f6535y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f6536z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(int i7, l lVar, float f5) {
        super(i7);
        k kVar = k.f6460l;
        this.f6479B = lVar;
        this.f6481C = kVar;
        this.f6483D = f5;
        this.f6485E = new G1.f(0);
        this.f6487F = new G1.f(0);
        this.f6489G = new G1.f(2);
        i iVar = new i(2);
        iVar.f6458v = 32;
        this.f6491H = iVar;
        this.I = new MediaCodec.BufferInfo();
        this.f6504S = 1.0f;
        this.f6505T = 1.0f;
        this.f6503R = -9223372036854775807L;
        this.J = new ArrayDeque();
        this.f6493I0 = r.f6474e;
        iVar.h(0);
        iVar.f2609o.order(ByteOrder.nativeOrder());
        D d4 = new D();
        d4.a = z1.g.a;
        d4.f4157c = 0;
        d4.f4156b = 2;
        this.f6495K = d4;
        this.f6510Y = -1.0f;
        this.f6514c0 = 0;
        this.f6532u0 = 0;
        this.f6523l0 = -1;
        this.f6524m0 = -1;
        this.f6522k0 = -9223372036854775807L;
        this.A0 = -9223372036854775807L;
        this.f6480B0 = -9223372036854775807L;
        this.f6494J0 = -9223372036854775807L;
        this.f6521j0 = -9223372036854775807L;
        this.v0 = 0;
        this.f6533w0 = 0;
        this.f6492H0 = new C0226g();
    }

    @Override // H1.AbstractC0225f
    public final int A(C2393o c2393o) throws C0234o {
        try {
            return s0(this.f6481C, c2393o);
        } catch (w e7) {
            throw g(e7, c2393o, false, 4002);
        }
    }

    @Override // H1.AbstractC0225f
    public final int B() {
        return 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x031c  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(long r26, long r28) throws H1.C0234o {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.s.C(long, long):boolean");
    }

    public abstract C0227h D(p pVar, C2393o c2393o, C2393o c2393o2);

    public o E(IllegalStateException illegalStateException, p pVar) {
        return new o(illegalStateException, pVar);
    }

    public final void F() {
        this.f6530s0 = false;
        this.f6491H.f();
        this.f6489G.f();
        this.f6529r0 = false;
        this.f6528q0 = false;
        D d4 = this.f6495K;
        d4.getClass();
        d4.a = z1.g.a;
        d4.f4157c = 0;
        d4.f4156b = 2;
    }

    public final boolean G() throws MediaCryptoException, C0234o {
        if (!this.f6534x0) {
            u0();
            return true;
        }
        this.v0 = 1;
        if (this.f6516e0) {
            this.f6533w0 = 3;
            return false;
        }
        this.f6533w0 = 2;
        return true;
    }

    public final boolean H(long j7, long j8) throws MediaCryptoException, C0234o {
        boolean z7;
        boolean z8;
        MediaCodec.BufferInfo bufferInfo;
        boolean zH0;
        ByteBuffer byteBuffer;
        int i7;
        int i8;
        long j9;
        boolean z9;
        boolean z10;
        C2393o c2393o;
        int iH;
        m mVar = this.f6506U;
        mVar.getClass();
        boolean z11 = this.f6524m0 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.I;
        if (!z11) {
            if (this.f6517f0 && this.f6535y0) {
                try {
                    iH = mVar.h(bufferInfo2);
                } catch (IllegalStateException unused) {
                    g0();
                    if (this.f6484D0) {
                        j0();
                    }
                }
            } else {
                iH = mVar.h(bufferInfo2);
            }
            if (iH < 0) {
                if (iH == -2) {
                    this.f6536z0 = true;
                    m mVar2 = this.f6506U;
                    mVar2.getClass();
                    MediaFormat mediaFormatA0 = mVar2.a0();
                    if (this.f6514c0 != 0 && mediaFormatA0.getInteger("width") == 32 && mediaFormatA0.getInteger("height") == 32) {
                        this.f6519h0 = true;
                        return true;
                    }
                    this.f6508W = mediaFormatA0;
                    this.f6509X = true;
                    return true;
                }
                if (this.f6520i0 && (this.f6482C0 || this.v0 == 2)) {
                    g0();
                }
                long j10 = this.f6521j0;
                if (j10 != -9223372036854775807L) {
                    long j11 = j10 + 100;
                    this.f3462q.getClass();
                    if (j11 < System.currentTimeMillis()) {
                        g0();
                        return false;
                    }
                }
                return false;
            }
            if (this.f6519h0) {
                this.f6519h0 = false;
                mVar.o(iH);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                g0();
                return false;
            }
            this.f6524m0 = iH;
            ByteBuffer byteBufferB0 = mVar.B0(iH);
            this.f6525n0 = byteBufferB0;
            if (byteBufferB0 != null) {
                byteBufferB0.position(bufferInfo2.offset);
                this.f6525n0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            long j12 = bufferInfo2.presentationTimeUs;
            this.f6526o0 = j12 < this.f3467v;
            long j13 = this.f6480B0;
            this.f6527p0 = j13 != -9223372036854775807L && j13 <= j12;
            v0(j12);
        }
        if (this.f6517f0 && this.f6535y0) {
            try {
                byteBuffer = this.f6525n0;
                i7 = this.f6524m0;
                i8 = bufferInfo2.flags;
                j9 = bufferInfo2.presentationTimeUs;
                z9 = this.f6526o0;
                z10 = this.f6527p0;
                c2393o = this.f6498M;
                c2393o.getClass();
                z7 = true;
                z8 = false;
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused2) {
                z8 = false;
            }
            try {
                zH0 = h0(j7, j8, mVar, byteBuffer, i7, i8, 1, j9, z9, z10, c2393o);
            } catch (IllegalStateException unused3) {
                g0();
                if (!this.f6484D0) {
                    return z8;
                }
                j0();
                return z8;
            }
        } else {
            z7 = true;
            z8 = false;
            bufferInfo = bufferInfo2;
            ByteBuffer byteBuffer2 = this.f6525n0;
            int i9 = this.f6524m0;
            int i10 = bufferInfo.flags;
            long j14 = bufferInfo.presentationTimeUs;
            boolean z12 = this.f6526o0;
            boolean z13 = this.f6527p0;
            C2393o c2393o2 = this.f6498M;
            c2393o2.getClass();
            zH0 = h0(j7, j8, mVar, byteBuffer2, i9, i10, 1, j14, z12, z13, c2393o2);
        }
        if (!zH0) {
            return z8;
        }
        d0(bufferInfo.presentationTimeUs);
        boolean z14 = (bufferInfo.flags & 4) != 0 ? z7 : z8;
        if (!z14 && this.f6535y0 && this.f6527p0) {
            this.f3462q.getClass();
            this.f6521j0 = System.currentTimeMillis();
        }
        this.f6524m0 = -1;
        this.f6525n0 = null;
        if (!z14) {
            return z7;
        }
        g0();
        return z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean I() throws android.media.MediaCryptoException, H1.C0234o {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.s.I():boolean");
    }

    public final void J() {
        try {
            m mVar = this.f6506U;
            AbstractC0015b.i(mVar);
            mVar.flush();
        } finally {
            l0();
        }
    }

    public final boolean K() throws MediaCryptoException {
        if (this.f6506U == null) {
            return false;
        }
        int i7 = this.f6533w0;
        if (i7 == 3 || ((this.f6515d0 && !this.f6536z0) || (this.f6516e0 && this.f6535y0))) {
            j0();
            return true;
        }
        if (i7 == 2) {
            int i8 = K.a;
            AbstractC0015b.h(i8 >= 23);
            if (i8 >= 23) {
                try {
                    u0();
                } catch (C0234o e7) {
                    AbstractC0015b.w("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e7);
                    j0();
                    return true;
                }
            }
        }
        J();
        return false;
    }

    public final List L(boolean z7) {
        C2393o c2393o = this.f6497L;
        c2393o.getClass();
        k kVar = this.f6481C;
        ArrayList arrayListP = P(kVar, c2393o, z7);
        if (!arrayListP.isEmpty() || !z7) {
            return arrayListP;
        }
        ArrayList arrayListP2 = P(kVar, c2393o, false);
        if (!arrayListP2.isEmpty()) {
            AbstractC0015b.v("MediaCodecRenderer", "Drm session requires secure decoder for " + c2393o.f18112n + ", but no secure decoder available. Trying to proceed with " + arrayListP2 + ".");
        }
        return arrayListP2;
    }

    public int M(G1.f fVar) {
        return 0;
    }

    public boolean N() {
        return false;
    }

    public abstract float O(float f5, C2393o[] c2393oArr);

    public abstract ArrayList P(k kVar, C2393o c2393o, boolean z7);

    public abstract B0.b Q(p pVar, C2393o c2393o, MediaCrypto mediaCrypto, float f5);

    public abstract void R(G1.f fVar);

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(M1.p r13, android.media.MediaCrypto r14) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.s.S(M1.p, android.media.MediaCrypto):void");
    }

    public final boolean T(long j7, long j8) {
        if (j8 >= j7) {
            return false;
        }
        C2393o c2393o = this.f6498M;
        return c2393o == null || !Objects.equals(c2393o.f18112n, "audio/opus") || j7 - j8 > 80000;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U() throws H1.C0234o {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.s.U():void");
    }

    public final void V(MediaCrypto mediaCrypto, boolean z7) throws q {
        C2393o c2393o = this.f6497L;
        c2393o.getClass();
        if (this.f6511Z == null) {
            try {
                List listL = L(z7);
                this.f6511Z = new ArrayDeque();
                ArrayList arrayList = (ArrayList) listL;
                if (!arrayList.isEmpty()) {
                    this.f6511Z.add((p) arrayList.get(0));
                }
                this.f6512a0 = null;
            } catch (w e7) {
                throw new q(c2393o, e7, z7, -49998);
            }
        }
        if (this.f6511Z.isEmpty()) {
            throw new q(c2393o, null, z7, -49999);
        }
        ArrayDeque arrayDeque = this.f6511Z;
        arrayDeque.getClass();
        while (this.f6506U == null) {
            p pVar = (p) arrayDeque.peekFirst();
            pVar.getClass();
            if (!W(c2393o) || !q0(pVar)) {
                return;
            }
            try {
                S(pVar, mediaCrypto);
            } catch (Exception e8) {
                AbstractC0015b.w("MediaCodecRenderer", "Failed to initialize decoder: " + pVar, e8);
                arrayDeque.removeFirst();
                q qVar = new q("Decoder init failed: " + pVar.a + ", " + c2393o, e8, c2393o.f18112n, z7, pVar, e8 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e8).getDiagnosticInfo() : null);
                X(qVar);
                q qVar2 = this.f6512a0;
                if (qVar2 == null) {
                    this.f6512a0 = qVar;
                } else {
                    this.f6512a0 = new q(qVar2.getMessage(), qVar2.getCause(), qVar2.f6470k, qVar2.f6471l, qVar2.f6472m, qVar2.f6473n);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.f6512a0;
                }
            }
        }
        this.f6511Z = null;
    }

    public boolean W(C2393o c2393o) {
        return true;
    }

    public abstract void X(Exception exc);

    public abstract void Y(long j7, long j8, String str);

    public abstract void Z(String str);

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e3, code lost:
    
        if (r4.v(r3) != false) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public H1.C0227h a0(F.w r14) throws H1.C0234o {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.s.a0(F.w):H1.h");
    }

    public abstract void b0(C2393o c2393o, MediaFormat mediaFormat);

    public void d0(long j7) {
        this.f6494J0 = j7;
        while (true) {
            ArrayDeque arrayDeque = this.J;
            if (arrayDeque.isEmpty() || j7 < ((r) arrayDeque.peek()).a) {
                return;
            }
            r rVar = (r) arrayDeque.poll();
            rVar.getClass();
            o0(rVar);
            e0();
        }
    }

    public abstract void e0();

    public final void g0() throws MediaCryptoException, C0234o {
        int i7 = this.f6533w0;
        if (i7 == 1) {
            J();
            return;
        }
        if (i7 == 2) {
            J();
            u0();
        } else if (i7 != 3) {
            this.f6484D0 = true;
            k0();
        } else {
            j0();
            U();
        }
    }

    public abstract boolean h0(long j7, long j8, m mVar, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z7, boolean z8, C2393o c2393o);

    public final boolean i0(int i7) throws MediaCryptoException, C0234o {
        F.w wVar = this.f3458m;
        wVar.r();
        G1.f fVar = this.f6485E;
        fVar.f();
        int iW = w(wVar, fVar, i7 | 4);
        if (iW == -5) {
            a0(wVar);
            return true;
        }
        if (iW != -4 || !fVar.c(4)) {
            return false;
        }
        this.f6482C0 = true;
        g0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j0() {
        try {
            m mVar = this.f6506U;
            if (mVar != null) {
                mVar.a();
                this.f6492H0.f3472b++;
                p pVar = this.f6513b0;
                pVar.getClass();
                Z(pVar.a);
            }
            this.f6506U = null;
            try {
                MediaCrypto mediaCrypto = this.f6502Q;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f6506U = null;
            try {
                MediaCrypto mediaCrypto2 = this.f6502Q;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public abstract void k0();

    public void l0() {
        this.f6523l0 = -1;
        this.f6487F.f2609o = null;
        this.f6524m0 = -1;
        this.f6525n0 = null;
        this.f6522k0 = -9223372036854775807L;
        this.f6535y0 = false;
        this.f6521j0 = -9223372036854775807L;
        this.f6534x0 = false;
        this.f6518g0 = false;
        this.f6519h0 = false;
        this.f6526o0 = false;
        this.f6527p0 = false;
        this.A0 = -9223372036854775807L;
        this.f6480B0 = -9223372036854775807L;
        this.f6494J0 = -9223372036854775807L;
        this.v0 = 0;
        this.f6533w0 = 0;
        this.f6532u0 = this.f6531t0 ? 1 : 0;
    }

    public final void m0() {
        l0();
        this.f6490G0 = null;
        this.f6511Z = null;
        this.f6513b0 = null;
        this.f6507V = null;
        this.f6508W = null;
        this.f6509X = false;
        this.f6536z0 = false;
        this.f6510Y = -1.0f;
        this.f6514c0 = 0;
        this.f6515d0 = false;
        this.f6516e0 = false;
        this.f6517f0 = false;
        this.f6520i0 = false;
        this.f6531t0 = false;
        this.f6532u0 = 0;
    }

    @Override // H1.AbstractC0225f
    public boolean n() {
        boolean zF;
        if (this.f6497L != null) {
            if (k()) {
                zF = this.f3469x;
            } else {
                a0 a0Var = this.f3464s;
                a0Var.getClass();
                zF = a0Var.f();
            }
            if (!zF) {
                if (!(this.f6524m0 >= 0)) {
                    if (this.f6522k0 != -9223372036854775807L) {
                        this.f3462q.getClass();
                        if (SystemClock.elapsedRealtime() < this.f6522k0) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void n0(C0034g c0034g) {
        C0034g c0034g2 = this.f6499N;
        if (c0034g2 != c0034g) {
            if (c0034g != null) {
                c0034g.c(null);
            }
            if (c0034g2 != null) {
                c0034g2.s(null);
            }
        }
        this.f6499N = c0034g;
    }

    @Override // H1.AbstractC0225f
    public void o() throws MediaCryptoException {
        this.f6497L = null;
        o0(r.f6474e);
        this.J.clear();
        K();
    }

    public final void o0(r rVar) {
        this.f6493I0 = rVar;
        if (rVar.f6476c != -9223372036854775807L) {
            this.f6496K0 = true;
            c0();
        }
    }

    public boolean p0(G1.f fVar) {
        return false;
    }

    @Override // H1.AbstractC0225f
    public void q(long j7, boolean z7) throws C0234o {
        this.f6482C0 = false;
        this.f6484D0 = false;
        this.f6488F0 = false;
        if (this.f6528q0) {
            this.f6491H.f();
            this.f6489G.f();
            this.f6529r0 = false;
            D d4 = this.f6495K;
            d4.getClass();
            d4.a = z1.g.a;
            d4.f4157c = 0;
            d4.f4156b = 2;
        } else if (K()) {
            U();
        }
        if (this.f6493I0.f6477d.z() > 0) {
            this.f6486E0 = true;
        }
        this.f6493I0.f6477d.c();
        this.J.clear();
    }

    public boolean q0(p pVar) {
        return true;
    }

    public boolean r0(C2393o c2393o) {
        return false;
    }

    public abstract int s0(k kVar, C2393o c2393o);

    public final boolean t0(C2393o c2393o) throws C0234o {
        if (K.a >= 23 && this.f6506U != null && this.f6533w0 != 3 && this.f3463r != 0) {
            float f5 = this.f6505T;
            c2393o.getClass();
            C2393o[] c2393oArr = this.f3465t;
            c2393oArr.getClass();
            float fO = O(f5, c2393oArr);
            float f7 = this.f6510Y;
            if (f7 != fO) {
                if (fO == -1.0f) {
                    if (this.f6534x0) {
                        this.v0 = 1;
                        this.f6533w0 = 3;
                        return false;
                    }
                    j0();
                    U();
                    return false;
                }
                if (f7 != -1.0f || fO > this.f6483D) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fO);
                    m mVar = this.f6506U;
                    mVar.getClass();
                    mVar.e(bundle);
                    this.f6510Y = fO;
                }
            }
        }
        return true;
    }

    public final void u0() throws MediaCryptoException, C0234o {
        C0034g c0034g = this.f6500O;
        c0034g.getClass();
        G1.a aVarJ = c0034g.j();
        if (aVarJ instanceof K1.j) {
            try {
                MediaCrypto mediaCrypto = this.f6502Q;
                mediaCrypto.getClass();
                ((K1.j) aVarJ).getClass();
                mediaCrypto.setMediaDrmSession(null);
            } catch (MediaCryptoException e7) {
                throw g(e7, this.f6497L, false, 6006);
            }
        }
        n0(this.f6500O);
        this.v0 = 0;
        this.f6533w0 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // H1.AbstractC0225f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(y1.C2393o[] r13, long r14, long r16, O1.B r18) {
        /*
            r12 = this;
            M1.r r13 = r12.f6493I0
            long r0 = r13.f6476c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L1e
            M1.r r4 = new M1.r
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r14
            r9 = r16
            r4.<init>(r5, r7, r9)
            r12.o0(r4)
            return
        L1e:
            java.util.ArrayDeque r13 = r12.J
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L52
            long r0 = r12.A0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L36
            long r4 = r12.f6494J0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L52
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L52
        L36:
            M1.r r5 = new M1.r
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.o0(r5)
            M1.r r13 = r12.f6493I0
            long r13 = r13.f6476c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L51
            r12.e0()
        L51:
            return
        L52:
            M1.r r5 = new M1.r
            long r6 = r12.A0
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r13.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.s.v(y1.o[], long, long, O1.B):void");
    }

    public final void v0(long j7) {
        C2393o c2393o = (C2393o) this.f6493I0.f6477d.v(j7);
        if (c2393o == null && this.f6496K0 && this.f6508W != null) {
            c2393o = (C2393o) this.f6493I0.f6477d.u();
        }
        if (c2393o != null) {
            this.f6498M = c2393o;
        } else if (!this.f6509X || this.f6498M == null) {
            return;
        }
        C2393o c2393o2 = this.f6498M;
        c2393o2.getClass();
        b0(c2393o2, this.f6508W);
        this.f6509X = false;
        this.f6496K0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0078 A[LOOP:1: B:31:0x0053->B:41:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099 A[LOOP:2: B:42:0x0079->B:52:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0079 A[EDGE_INSN: B:87:0x0079->B:90:? BREAK  A[LOOP:1: B:31:0x0053->B:41:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a A[EDGE_INSN: B:88:0x009a->B:53:0x009a BREAK  A[LOOP:2: B:42:0x0079->B:52:0x0099], SYNTHETIC] */
    @Override // H1.AbstractC0225f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(long r12, long r14) throws android.media.MediaCryptoException, H1.C0234o {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.s.x(long, long):void");
    }

    @Override // H1.AbstractC0225f
    public void z(float f5, float f7) throws C0234o {
        this.f6504S = f5;
        this.f6505T = f7;
        t0(this.f6507V);
    }

    public void c0() {
    }

    public void f0(G1.f fVar) {
    }
}
