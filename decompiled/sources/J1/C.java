package J1;

import B1.AbstractC0015b;
import B1.K;
import C2.C0034g;
import H1.C0226g;
import H1.C0227h;
import H1.C0234o;
import H1.H;
import H1.P;
import H1.k0;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import y1.C2381c;
import y1.C2382d;
import y1.C2393o;

/* loaded from: classes.dex */
public final class C extends M1.s implements P {

    /* renamed from: M0, reason: collision with root package name */
    public final Context f4141M0;

    /* renamed from: N0, reason: collision with root package name */
    public final j f4142N0;

    /* renamed from: O0, reason: collision with root package name */
    public final A f4143O0;

    /* renamed from: P0, reason: collision with root package name */
    public final B2.l f4144P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f4145Q0;

    /* renamed from: R0, reason: collision with root package name */
    public boolean f4146R0;

    /* renamed from: S0, reason: collision with root package name */
    public boolean f4147S0;

    /* renamed from: T0, reason: collision with root package name */
    public C2393o f4148T0;

    /* renamed from: U0, reason: collision with root package name */
    public C2393o f4149U0;
    public long V0;

    /* renamed from: W0, reason: collision with root package name */
    public boolean f4150W0;

    /* renamed from: X0, reason: collision with root package name */
    public boolean f4151X0;

    /* renamed from: Y0, reason: collision with root package name */
    public boolean f4152Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int f4153Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Context context, M1.l lVar, Handler handler, H1.D d4, A a) {
        super(1, lVar, 44100.0f);
        B2.l lVar2 = K.a >= 35 ? new B2.l(11) : null;
        this.f4141M0 = context.getApplicationContext();
        this.f4143O0 = a;
        this.f4144P0 = lVar2;
        this.f4153Z0 = -1000;
        this.f4142N0 = new j(handler, d4, 0);
        a.f4131r = new C0034g(13, this);
    }

    @Override // M1.s
    public final C0227h D(M1.p pVar, C2393o c2393o, C2393o c2393o2) {
        C0227h c0227hB = pVar.b(c2393o, c2393o2);
        boolean z7 = this.f6500O == null && r0(c2393o2);
        int i7 = c0227hB.f3486e;
        if (z7) {
            i7 |= 32768;
        }
        if (x0(pVar, c2393o2) > this.f4145Q0) {
            i7 |= 64;
        }
        int i8 = i7;
        return new C0227h(pVar.a, c2393o, c2393o2, i8 == 0 ? c0227hB.f3485d : 0, i8);
    }

    @Override // M1.s
    public final float O(float f5, C2393o[] c2393oArr) {
        int iMax = -1;
        for (C2393o c2393o : c2393oArr) {
            int i7 = c2393o.f18092E;
            if (i7 != -1) {
                iMax = Math.max(iMax, i7);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f5;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // M1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList P(M1.k r4, y1.C2393o r5, boolean r6) {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = r5.f18112n
            if (r1 != 0) goto L8
            j3.X r4 = j3.X.f12304o
            goto L2f
        L8:
            J1.A r1 = r3.f4143O0
            int r1 = r1.i(r5)
            if (r1 == 0) goto L2b
            java.lang.String r1 = "audio/raw"
            java.util.List r1 = M1.z.e(r1, r0, r0)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L1e
            r1 = 0
            goto L24
        L1e:
            java.lang.Object r1 = r1.get(r0)
            M1.p r1 = (M1.p) r1
        L24:
            if (r1 == 0) goto L2b
            j3.X r4 = j3.G.w(r1)
            goto L2f
        L2b:
            j3.X r4 = M1.z.g(r4, r5, r6, r0)
        L2f:
            java.util.HashMap r6 = M1.z.a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            C2.G r4 = new C2.G
            r1 = 12
            r4.<init>(r1, r5)
            M1.u r5 = new M1.u
            r5.<init>(r0, r4)
            java.util.Collections.sort(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C.P(M1.k, y1.o, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    @Override // M1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final B0.b Q(M1.p r12, y1.C2393o r13, android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C.Q(M1.p, y1.o, android.media.MediaCrypto, float):B0.b");
    }

    @Override // M1.s
    public final void R(G1.f fVar) {
        C2393o c2393o;
        u uVar;
        if (K.a < 29 || (c2393o = fVar.f2607m) == null || !Objects.equals(c2393o.f18112n, "audio/opus") || !this.f6528q0) {
            return;
        }
        ByteBuffer byteBuffer = fVar.f2612r;
        byteBuffer.getClass();
        C2393o c2393o2 = fVar.f2607m;
        c2393o2.getClass();
        if (byteBuffer.remaining() == 8) {
            int i7 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            A a = this.f4143O0;
            AudioTrack audioTrack = a.f4135v;
            if (audioTrack == null || !A.p(audioTrack) || (uVar = a.f4133t) == null || !uVar.f4280k) {
                return;
            }
            a.f4135v.setOffloadDelayPadding(c2393o2.f18094G, i7);
        }
    }

    @Override // M1.s
    public final void X(Exception exc) {
        AbstractC0015b.n("MediaCodecAudioRenderer", "Audio codec error", exc);
        j jVar = this.f4142N0;
        Handler handler = jVar.a;
        if (handler != null) {
            handler.post(new h(jVar, exc, 9));
        }
    }

    @Override // M1.s
    public final void Y(long j7, long j8, String str) {
        j jVar = this.f4142N0;
        Handler handler = jVar.a;
        if (handler != null) {
            handler.post(new h(jVar, str, j7, j8));
        }
    }

    @Override // M1.s
    public final void Z(String str) {
        j jVar = this.f4142N0;
        Handler handler = jVar.a;
        if (handler != null) {
            handler.post(new h(jVar, str, 2));
        }
    }

    @Override // H1.P
    public final void a(y1.G g4) {
        A a = this.f4143O0;
        a.getClass();
        a.f4084C = new y1.G(K.g(g4.a, 0.1f, 8.0f), K.g(g4.f17937b, 0.1f, 8.0f));
        if (a.x()) {
            a.v();
            return;
        }
        v vVar = new v(g4, -9223372036854775807L, -9223372036854775807L);
        if (a.o()) {
            a.f4082A = vVar;
        } else {
            a.f4083B = vVar;
        }
    }

    @Override // M1.s
    public final C0227h a0(F.w wVar) throws C0234o {
        C2393o c2393o = (C2393o) wVar.f2038m;
        c2393o.getClass();
        this.f4148T0 = c2393o;
        C0227h c0227hA0 = super.a0(wVar);
        j jVar = this.f4142N0;
        Handler handler = jVar.a;
        if (handler != null) {
            handler.post(new h(jVar, c2393o, c0227hA0));
        }
        return c0227hA0;
    }

    @Override // H1.P
    public final boolean b() {
        boolean z7 = this.f4152Y0;
        this.f4152Y0 = false;
        return z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0104 A[Catch: l -> 0x0102, TryCatch #0 {l -> 0x0102, blocks: (B:42:0x00d9, B:45:0x00e1, B:47:0x00e5, B:49:0x00ee, B:53:0x00fc, B:56:0x0104, B:60:0x010b, B:61:0x0110), top: B:65:0x00d9 }] */
    @Override // M1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0(y1.C2393o r14, android.media.MediaFormat r15) throws H1.C0234o {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C.b0(y1.o, android.media.MediaFormat):void");
    }

    @Override // H1.AbstractC0225f, H1.g0
    public final void c(int i7, Object obj) throws IllegalStateException {
        C0034g c0034g;
        B2.l lVar;
        A a = this.f4143O0;
        if (i7 == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (a.f4094O != fFloatValue) {
                a.f4094O = fFloatValue;
                if (a.o()) {
                    a.f4135v.setVolume(a.f4094O);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == 3) {
            C2381c c2381c = (C2381c) obj;
            c2381c.getClass();
            if (a.f4139z.equals(c2381c)) {
                return;
            }
            a.f4139z = c2381c;
            if (a.f4106a0) {
                return;
            }
            C0289e c0289e = a.f4137x;
            if (c0289e != null) {
                c0289e.f4196i = c2381c;
                c0289e.a(C0286b.c(c0289e.a, c2381c, c0289e.f4195h));
            }
            a.g();
            return;
        }
        if (i7 == 6) {
            C2382d c2382d = (C2382d) obj;
            c2382d.getClass();
            if (a.f4104Y.equals(c2382d)) {
                return;
            }
            if (a.f4135v != null) {
                a.f4104Y.getClass();
            }
            a.f4104Y = c2382d;
            return;
        }
        if (i7 == 12) {
            if (K.a >= 23) {
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                if (audioDeviceInfo == null) {
                    c0034g = null;
                } else {
                    a.getClass();
                    c0034g = new C0034g(11, audioDeviceInfo);
                }
                a.f4105Z = c0034g;
                C0289e c0289e2 = a.f4137x;
                if (c0289e2 != null) {
                    c0289e2.b(audioDeviceInfo);
                }
                AudioTrack audioTrack = a.f4135v;
                if (audioTrack != null) {
                    C0034g c0034g2 = a.f4105Z;
                    audioTrack.setPreferredDevice(c0034g2 != null ? (AudioDeviceInfo) c0034g2.f741l : null);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == 16) {
            obj.getClass();
            this.f4153Z0 = ((Integer) obj).intValue();
            M1.m mVar = this.f6506U;
            if (mVar != null && K.a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f4153Z0));
                mVar.e(bundle);
                return;
            }
            return;
        }
        if (i7 == 9) {
            obj.getClass();
            a.f4085D = ((Boolean) obj).booleanValue();
            v vVar = new v(a.x() ? y1.G.f17936d : a.f4084C, -9223372036854775807L, -9223372036854775807L);
            if (a.o()) {
                a.f4082A = vVar;
                return;
            } else {
                a.f4083B = vVar;
                return;
            }
        }
        if (i7 != 10) {
            if (i7 == 11) {
                H h7 = (H) obj;
                h7.getClass();
                this.f6501P = h7;
                return;
            }
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        if (a.f4103X != iIntValue) {
            a.f4103X = iIntValue;
            a.f4102W = iIntValue != 0;
            a.g();
        }
        if (K.a < 35 || (lVar = this.f4144P0) == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) lVar.f418n;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            lVar.f418n = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(iIntValue, n3.a.f13346k, new M1.j(lVar));
        lVar.f418n = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) lVar.f416l).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    @Override // M1.s
    public final void c0() {
        this.f4143O0.getClass();
    }

    @Override // H1.P
    public final y1.G d() {
        return this.f4143O0.f4084C;
    }

    @Override // H1.P
    public final long e() {
        if (this.f3463r == 2) {
            y0();
        }
        return this.V0;
    }

    @Override // M1.s
    public final void e0() {
        this.f4143O0.f4091L = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    @Override // M1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h0(long r1, long r3, M1.m r5, java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, y1.C2393o r14) throws H1.C0234o {
        /*
            r0 = this;
            r6.getClass()
            y1.o r1 = r0.f4149U0
            r2 = 1
            if (r1 == 0) goto L13
            r1 = r8 & 2
            if (r1 == 0) goto L13
            r5.getClass()
            r5.o(r7)
            return r2
        L13:
            J1.A r1 = r0.f4143O0
            if (r12 == 0) goto L26
            if (r5 == 0) goto L1c
            r5.o(r7)
        L1c:
            H1.g r3 = r0.f6492H0
            int r4 = r3.f3476f
            int r4 = r4 + r9
            r3.f3476f = r4
            r1.f4091L = r2
            return r2
        L26:
            boolean r1 = r1.l(r6, r10, r9)     // Catch: J1.o -> L3b J1.m -> L55
            if (r1 == 0) goto L39
            if (r5 == 0) goto L31
            r5.o(r7)
        L31:
            H1.g r1 = r0.f6492H0
            int r3 = r1.f3475e
            int r3 = r3 + r9
            r1.f3475e = r3
            return r2
        L39:
            r1 = 0
            return r1
        L3b:
            r1 = move-exception
            boolean r2 = r0.f6528q0
            if (r2 == 0) goto L4c
            H1.k0 r2 = r0.f3459n
            r2.getClass()
            int r2 = r2.a
            if (r2 == 0) goto L4c
            r2 = 5003(0x138b, float:7.01E-42)
            goto L4e
        L4c:
            r2 = 5002(0x138a, float:7.009E-42)
        L4e:
            boolean r3 = r1.f4217l
            H1.o r1 = r0.g(r1, r14, r3, r2)
            throw r1
        L55:
            r1 = move-exception
            y1.o r2 = r0.f4148T0
            boolean r3 = r0.f6528q0
            if (r3 == 0) goto L68
            H1.k0 r3 = r0.f3459n
            r3.getClass()
            int r3 = r3.a
            if (r3 == 0) goto L68
            r3 = 5004(0x138c, float:7.012E-42)
            goto L6a
        L68:
            r3 = 5001(0x1389, float:7.008E-42)
        L6a:
            boolean r4 = r1.f4215l
            H1.o r1 = r0.g(r1, r2, r4, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C.h0(long, long, M1.m, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, y1.o):boolean");
    }

    @Override // H1.AbstractC0225f
    public final String j() {
        return "MediaCodecAudioRenderer";
    }

    @Override // M1.s
    public final void k0() throws IllegalStateException, C0234o {
        try {
            A a = this.f4143O0;
            if (!a.f4098S && a.o() && a.f()) {
                a.s();
                a.f4098S = true;
            }
        } catch (o e7) {
            throw g(e7, e7.f4218m, e7.f4217l, this.f6528q0 ? 5003 : 5002);
        }
    }

    @Override // H1.AbstractC0225f
    public final boolean l() {
        if (!this.f6484D0) {
            return false;
        }
        A a = this.f4143O0;
        if (a.o()) {
            return a.f4098S && !a.m();
        }
        return true;
    }

    @Override // M1.s, H1.AbstractC0225f
    public final boolean n() {
        return this.f4143O0.m() || super.n();
    }

    @Override // M1.s, H1.AbstractC0225f
    public final void o() {
        j jVar = this.f4142N0;
        this.f4151X0 = true;
        this.f4148T0 = null;
        try {
            this.f4143O0.g();
            try {
                super.o();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.o();
                throw th;
            } finally {
            }
        }
    }

    @Override // H1.AbstractC0225f
    public final void p(boolean z7, boolean z8) throws IllegalStateException {
        C0226g c0226g = new C0226g();
        this.f6492H0 = c0226g;
        j jVar = this.f4142N0;
        Handler handler = jVar.a;
        if (handler != null) {
            handler.post(new h(jVar, c0226g, 0));
        }
        k0 k0Var = this.f3459n;
        k0Var.getClass();
        boolean z9 = k0Var.f3528b;
        A a = this.f4143O0;
        if (z9) {
            AbstractC0015b.h(a.f4102W);
            if (!a.f4106a0) {
                a.f4106a0 = true;
                a.g();
            }
        } else if (a.f4106a0) {
            a.f4106a0 = false;
            a.g();
        }
        I1.l lVar = this.f3461p;
        lVar.getClass();
        a.f4130q = lVar;
        B1.D d4 = this.f3462q;
        d4.getClass();
        a.f4117g.I = d4;
    }

    @Override // M1.s, H1.AbstractC0225f
    public final void q(long j7, boolean z7) throws IllegalStateException, C0234o {
        super.q(j7, z7);
        this.f4143O0.g();
        this.V0 = j7;
        this.f4152Y0 = false;
        this.f4150W0 = true;
    }

    @Override // H1.AbstractC0225f
    public final void r() {
        B2.l lVar;
        C0287c c0287c;
        C0289e c0289e = this.f4143O0.f4137x;
        if (c0289e != null && c0289e.f4197j) {
            c0289e.f4194g = null;
            int i7 = K.a;
            Context context = c0289e.a;
            if (i7 >= 23 && (c0287c = c0289e.f4191d) != null) {
                z1.c.s(context).unregisterAudioDeviceCallback(c0287c);
            }
            context.unregisterReceiver(c0289e.f4192e);
            C0288d c0288d = c0289e.f4193f;
            if (c0288d != null) {
                c0288d.a.unregisterContentObserver(c0288d);
            }
            c0289e.f4197j = false;
        }
        if (K.a < 35 || (lVar = this.f4144P0) == null) {
            return;
        }
        ((HashSet) lVar.f416l).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) lVar.f418n;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // M1.s
    public final boolean r0(C2393o c2393o) {
        k0 k0Var = this.f3459n;
        k0Var.getClass();
        if (k0Var.a != 0) {
            int iW0 = w0(c2393o);
            if ((iW0 & 512) != 0) {
                k0 k0Var2 = this.f3459n;
                k0Var2.getClass();
                if (k0Var2.a == 2 || (iW0 & 1024) != 0 || (c2393o.f18094G == 0 && c2393o.f18095H == 0)) {
                    return true;
                }
            }
        }
        return this.f4143O0.i(c2393o) != 0;
    }

    @Override // H1.AbstractC0225f
    public final void s() throws IllegalStateException {
        A a = this.f4143O0;
        this.f4152Y0 = false;
        try {
            try {
                F();
                j0();
                C0034g c0034g = this.f6500O;
                if (c0034g != null) {
                    c0034g.s(null);
                }
                this.f6500O = null;
            } catch (Throwable th) {
                C0034g c0034g2 = this.f6500O;
                if (c0034g2 != null) {
                    c0034g2.s(null);
                }
                this.f6500O = null;
                throw th;
            }
        } finally {
            if (this.f4151X0) {
                this.f4151X0 = false;
                a.u();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    @Override // M1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int s0(M1.k r17, y1.C2393o r18) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C.s0(M1.k, y1.o):int");
    }

    @Override // H1.AbstractC0225f
    public final void t() throws IllegalStateException {
        this.f4143O0.r();
    }

    @Override // H1.AbstractC0225f
    public final void u() throws IllegalStateException {
        y0();
        A a = this.f4143O0;
        a.f4101V = false;
        if (a.o()) {
            r rVar = a.f4117g;
            rVar.e();
            if (rVar.f4260x == -9223372036854775807L) {
                q qVar = rVar.f4241e;
                qVar.getClass();
                qVar.a();
            } else {
                rVar.f4262z = rVar.b();
                if (!A.p(a.f4135v)) {
                    return;
                }
            }
            a.f4135v.pause();
        }
    }

    public final int w0(C2393o c2393o) {
        C0291g c0291gH = this.f4143O0.h(c2393o);
        if (!c0291gH.a) {
            return 0;
        }
        int i7 = c0291gH.f4201b ? 1536 : 512;
        return c0291gH.f4202c ? i7 | 2048 : i7;
    }

    public final int x0(M1.p pVar, C2393o c2393o) {
        int i7;
        if (!"OMX.google.raw.decoder".equals(pVar.a) || (i7 = K.a) >= 24 || (i7 == 23 && K.E(this.f4141M0))) {
            return c2393o.f18113o;
        }
        return -1;
    }

    public final void y0() {
        long jMax;
        ArrayDeque arrayDeque;
        long j7;
        l();
        A a = this.f4143O0;
        if (!a.o() || a.f4092M) {
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(a.f4117g.a(), K.J(a.f4133t.f4274e, a.k()));
            while (true) {
                arrayDeque = a.f4119h;
                if (arrayDeque.isEmpty() || jMin < ((v) arrayDeque.getFirst()).f4283c) {
                    break;
                } else {
                    a.f4083B = (v) arrayDeque.remove();
                }
            }
            v vVar = a.f4083B;
            long jL = jMin - vVar.f4283c;
            long jT = K.t(vVar.a.a, jL);
            boolean zIsEmpty = arrayDeque.isEmpty();
            B2.l lVar = a.f4107b;
            if (zIsEmpty) {
                z1.j jVar = (z1.j) lVar.f418n;
                if (jVar.b()) {
                    if (jVar.f19005o >= 1024) {
                        long j8 = jVar.f19004n;
                        jVar.f19000j.getClass();
                        long j9 = j8 - ((r12.f18979k * r12.f18970b) * 2);
                        int i7 = jVar.f18998h.a;
                        int i8 = jVar.f18997g.a;
                        jL = i7 == i8 ? K.L(jL, j9, jVar.f19005o, RoundingMode.DOWN) : K.L(jL, j9 * i7, jVar.f19005o * i8, RoundingMode.DOWN);
                    } else {
                        jL = (long) (jVar.f18993c * jL);
                    }
                }
                v vVar2 = a.f4083B;
                j7 = vVar2.f4282b + jL;
                vVar2.f4284d = jL - jT;
            } else {
                v vVar3 = a.f4083B;
                j7 = vVar3.f4282b + jT + vVar3.f4284d;
            }
            long j10 = ((E) lVar.f417m).f4166q;
            jMax = K.J(a.f4133t.f4274e, j10) + j7;
            long j11 = a.f4118g0;
            if (j10 > j11) {
                long J = K.J(a.f4133t.f4274e, j10 - j11);
                a.f4118g0 = j10;
                a.f4120h0 += J;
                if (a.f4122i0 == null) {
                    a.f4122i0 = new Handler(Looper.myLooper());
                }
                a.f4122i0.removeCallbacksAndMessages(null);
                a.f4122i0.postDelayed(new B1.w(8, a), 100L);
            }
        }
        if (jMax != Long.MIN_VALUE) {
            if (!this.f4150W0) {
                jMax = Math.max(this.V0, jMax);
            }
            this.V0 = jMax;
            this.f4150W0 = false;
        }
    }

    @Override // H1.AbstractC0225f
    public final P i() {
        return this;
    }
}
