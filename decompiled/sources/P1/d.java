package P1;

import B1.AbstractC0015b;
import C2.C0034g;
import D4.S;
import F.w;
import G1.f;
import H1.AbstractC0225f;
import H1.D;
import O1.B;
import O1.a0;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import j3.G;
import j3.X;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import p.I0;
import s2.C1973a;
import s2.C1975c;
import s2.C1978f;
import s2.C1979g;
import s2.InterfaceC1977e;
import y1.C2393o;

/* loaded from: classes.dex */
public final class d extends AbstractC0225f implements Handler.Callback {

    /* renamed from: B, reason: collision with root package name */
    public final I0 f7719B;

    /* renamed from: C, reason: collision with root package name */
    public final f f7720C;

    /* renamed from: D, reason: collision with root package name */
    public a f7721D;

    /* renamed from: E, reason: collision with root package name */
    public final C0034g f7722E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f7723F;

    /* renamed from: G, reason: collision with root package name */
    public int f7724G;

    /* renamed from: H, reason: collision with root package name */
    public InterfaceC1977e f7725H;
    public C1979g I;
    public C1975c J;

    /* renamed from: K, reason: collision with root package name */
    public C1975c f7726K;

    /* renamed from: L, reason: collision with root package name */
    public int f7727L;

    /* renamed from: M, reason: collision with root package name */
    public final Handler f7728M;

    /* renamed from: N, reason: collision with root package name */
    public final D f7729N;

    /* renamed from: O, reason: collision with root package name */
    public final w f7730O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f7731P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f7732Q;

    /* renamed from: R, reason: collision with root package name */
    public C2393o f7733R;

    /* renamed from: S, reason: collision with root package name */
    public long f7734S;

    /* renamed from: T, reason: collision with root package name */
    public long f7735T;

    /* renamed from: U, reason: collision with root package name */
    public IOException f7736U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(D d4, Looper looper) {
        super(3);
        C0034g c0034g = c.f7718e;
        this.f7729N = d4;
        this.f7728M = looper == null ? null : new Handler(looper, this);
        this.f7722E = c0034g;
        this.f7719B = new I0(8);
        this.f7720C = new f(1);
        this.f7730O = new w(18, false);
        this.f7735T = -9223372036854775807L;
        this.f7734S = -9223372036854775807L;
    }

    @Override // H1.AbstractC0225f
    public final int A(C2393o c2393o) {
        if (!Objects.equals(c2393o.f18112n, "application/x-media3-cues")) {
            C0034g c0034g = this.f7722E;
            c0034g.getClass();
            if (!((I0) c0034g.f741l).c(c2393o)) {
                String str = c2393o.f18112n;
                if (!Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                    return y1.D.k(str) ? AbstractC0225f.f(1, 0, 0, 0) : AbstractC0225f.f(0, 0, 0, 0);
                }
            }
        }
        return AbstractC0225f.f(c2393o.f18098M == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void C() {
        AbstractC0015b.g("Legacy decoding is disabled, can't handle " + this.f7733R.f18112n + " samples (expected application/x-media3-cues).", Objects.equals(this.f7733R.f18112n, "application/cea-608") || Objects.equals(this.f7733R.f18112n, "application/x-mp4-cea-608") || Objects.equals(this.f7733R.f18112n, "application/cea-708"));
    }

    public final long D() {
        if (this.f7727L == -1) {
            return Long.MAX_VALUE;
        }
        this.J.getClass();
        if (this.f7727L >= this.J.m()) {
            return Long.MAX_VALUE;
        }
        return this.J.e(this.f7727L);
    }

    public final long E(long j7) {
        AbstractC0015b.h(j7 != -9223372036854775807L);
        return j7 - this.f3466u;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F() {
        /*
            r7 = this;
            r0 = 1
            r7.f7723F = r0
            y1.o r1 = r7.f7733R
            r1.getClass()
            C2.g r2 = r7.f7722E
            r2.getClass()
            java.lang.String r3 = r1.f18112n
            if (r3 == 0) goto L4d
            int r4 = r1.I
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case 930165504: goto L31;
                case 1566015601: goto L28;
                case 1566016562: goto L1d;
                default: goto L1b;
            }
        L1b:
            r0 = r5
            goto L3b
        L1d:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L26
            goto L1b
        L26:
            r0 = 2
            goto L3b
        L28:
            java.lang.String r6 = "application/cea-608"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L3b
            goto L1b
        L31:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3a
            goto L1b
        L3a:
            r0 = 0
        L3b:
            switch(r0) {
                case 0: goto L47;
                case 1: goto L47;
                case 2: goto L3f;
                default: goto L3e;
            }
        L3e:
            goto L4d
        L3f:
            t2.f r0 = new t2.f
            java.util.List r1 = r1.f18115q
            r0.<init>(r4, r1)
            goto L6e
        L47:
            t2.c r0 = new t2.c
            r0.<init>(r3, r4)
            goto L6e
        L4d:
            java.lang.Object r0 = r2.f741l
            p.I0 r0 = (p.I0) r0
            boolean r2 = r0.c(r1)
            if (r2 == 0) goto L76
            s2.j r0 = r0.k(r1)
            L1.b r1 = new L1.b
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>(r0)
            r0 = r1
        L6e:
            r7.f7725H = r0
            long r1 = r7.f3467v
            r0.c(r1)
            return
        L76:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r1 = b1.AbstractC0703b.i(r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.d.F():void");
    }

    public final void G(A1.c cVar) {
        G g4 = cVar.a;
        D d4 = this.f7729N;
        d4.f3212k.f3272w.e(27, new C2.G(6, g4));
        H1.G g7 = d4.f3212k;
        g7.f3252k0 = cVar;
        g7.f3272w.e(27, new C2.G(3, cVar));
    }

    public final void H() {
        this.I = null;
        this.f7727L = -1;
        C1975c c1975c = this.J;
        if (c1975c != null) {
            c1975c.g();
            this.J = null;
        }
        C1975c c1975c2 = this.f7726K;
        if (c1975c2 != null) {
            c1975c2.g();
            this.f7726K = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        G((A1.c) message.obj);
        return true;
    }

    @Override // H1.AbstractC0225f
    public final String j() {
        return "TextRenderer";
    }

    @Override // H1.AbstractC0225f
    public final boolean l() {
        return this.f7732Q;
    }

    @Override // H1.AbstractC0225f
    public final boolean n() {
        if (this.f7733R != null) {
            if (this.f7736U == null) {
                try {
                    a0 a0Var = this.f3464s;
                    a0Var.getClass();
                    a0Var.h();
                } catch (IOException e7) {
                    this.f7736U = e7;
                }
            }
            if (this.f7736U != null) {
                C2393o c2393o = this.f7733R;
                c2393o.getClass();
                if (Objects.equals(c2393o.f18112n, "application/x-media3-cues")) {
                    a aVar = this.f7721D;
                    aVar.getClass();
                    return aVar.b(this.f7734S) != Long.MIN_VALUE;
                }
                if (!this.f7732Q) {
                    if (this.f7731P) {
                        C1975c c1975c = this.J;
                        long j7 = this.f7734S;
                        if (c1975c == null || c1975c.e(c1975c.m() - 1) <= j7) {
                            C1975c c1975c2 = this.f7726K;
                            long j8 = this.f7734S;
                            if ((c1975c2 == null || c1975c2.e(c1975c2.m() - 1) <= j8) && this.I != null) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // H1.AbstractC0225f
    public final void o() {
        this.f7733R = null;
        this.f7735T = -9223372036854775807L;
        X x7 = X.f12304o;
        E(this.f7734S);
        A1.c cVar = new A1.c(x7);
        Handler handler = this.f7728M;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            G(cVar);
        }
        this.f7734S = -9223372036854775807L;
        if (this.f7725H != null) {
            H();
            InterfaceC1977e interfaceC1977e = this.f7725H;
            interfaceC1977e.getClass();
            interfaceC1977e.a();
            this.f7725H = null;
            this.f7724G = 0;
        }
    }

    @Override // H1.AbstractC0225f
    public final void q(long j7, boolean z7) {
        this.f7734S = j7;
        a aVar = this.f7721D;
        if (aVar != null) {
            aVar.clear();
        }
        X x7 = X.f12304o;
        E(this.f7734S);
        A1.c cVar = new A1.c(x7);
        Handler handler = this.f7728M;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            G(cVar);
        }
        this.f7731P = false;
        this.f7732Q = false;
        this.f7735T = -9223372036854775807L;
        C2393o c2393o = this.f7733R;
        if (c2393o == null || Objects.equals(c2393o.f18112n, "application/x-media3-cues")) {
            return;
        }
        if (this.f7724G == 0) {
            H();
            InterfaceC1977e interfaceC1977e = this.f7725H;
            interfaceC1977e.getClass();
            interfaceC1977e.flush();
            interfaceC1977e.c(this.f3467v);
            return;
        }
        H();
        InterfaceC1977e interfaceC1977e2 = this.f7725H;
        interfaceC1977e2.getClass();
        interfaceC1977e2.a();
        this.f7725H = null;
        this.f7724G = 0;
        F();
    }

    @Override // H1.AbstractC0225f
    public final void v(C2393o[] c2393oArr, long j7, long j8, B b4) {
        C2393o c2393o = c2393oArr[0];
        this.f7733R = c2393o;
        if (Objects.equals(c2393o.f18112n, "application/x-media3-cues")) {
            this.f7721D = this.f7733R.J == 1 ? new b() : new S(4, false);
            return;
        }
        C();
        if (this.f7725H != null) {
            this.f7724G = 1;
        } else {
            F();
        }
    }

    @Override // H1.AbstractC0225f
    public final void x(long j7, long j8) {
        boolean z7;
        w wVar;
        boolean z8;
        long jE;
        if (this.f3469x) {
            long j9 = this.f7735T;
            if (j9 != -9223372036854775807L && j7 >= j9) {
                H();
                this.f7732Q = true;
            }
        }
        if (this.f7732Q) {
            return;
        }
        C2393o c2393o = this.f7733R;
        c2393o.getClass();
        boolean zEquals = Objects.equals(c2393o.f18112n, "application/x-media3-cues");
        Handler handler = this.f7728M;
        boolean zC = false;
        zC = false;
        zC = false;
        w wVar2 = this.f7730O;
        if (zEquals) {
            this.f7721D.getClass();
            if (!this.f7731P) {
                f fVar = this.f7720C;
                if (w(wVar2, fVar, 0) == -4) {
                    if (fVar.c(4)) {
                        this.f7731P = true;
                    } else {
                        fVar.j();
                        ByteBuffer byteBuffer = fVar.f2609o;
                        byteBuffer.getClass();
                        long j10 = fVar.f2611q;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.f7719B.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        q2.d dVar = new q2.d(1);
                        j3.D dR = G.r();
                        for (int i7 = 0; i7 < parcelableArrayList.size(); i7++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i7);
                            bundle2.getClass();
                            dR.a(dVar.apply(bundle2));
                        }
                        C1973a c1973a = new C1973a(j10, bundle.getLong("d"), dR.f());
                        fVar.f();
                        zC = this.f7721D.c(c1973a, j7);
                    }
                }
            }
            long jB = this.f7721D.b(this.f7734S);
            if (jB == Long.MIN_VALUE && this.f7731P && !zC) {
                this.f7732Q = true;
            }
            if (jB != Long.MIN_VALUE && jB <= j7) {
                zC = true;
            }
            if (zC) {
                G gA = this.f7721D.a(j7);
                long jD = this.f7721D.d(j7);
                E(jD);
                A1.c cVar = new A1.c(gA);
                if (handler != null) {
                    handler.obtainMessage(1, cVar).sendToTarget();
                } else {
                    G(cVar);
                }
                this.f7721D.e(jD);
            }
            this.f7734S = j7;
            return;
        }
        C();
        this.f7734S = j7;
        if (this.f7726K == null) {
            InterfaceC1977e interfaceC1977e = this.f7725H;
            interfaceC1977e.getClass();
            interfaceC1977e.d(j7);
            try {
                InterfaceC1977e interfaceC1977e2 = this.f7725H;
                interfaceC1977e2.getClass();
                this.f7726K = (C1975c) interfaceC1977e2.e();
            } catch (C1978f e7) {
                AbstractC0015b.n("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f7733R, e7);
                X x7 = X.f12304o;
                E(this.f7734S);
                A1.c cVar2 = new A1.c(x7);
                if (handler != null) {
                    handler.obtainMessage(1, cVar2).sendToTarget();
                } else {
                    G(cVar2);
                }
                H();
                InterfaceC1977e interfaceC1977e3 = this.f7725H;
                interfaceC1977e3.getClass();
                interfaceC1977e3.a();
                this.f7725H = null;
                this.f7724G = 0;
                F();
                return;
            }
        }
        if (this.f3463r != 2) {
            return;
        }
        if (this.J != null) {
            long jD2 = D();
            z7 = false;
            while (jD2 <= j7) {
                this.f7727L++;
                jD2 = D();
                z7 = true;
            }
        } else {
            z7 = false;
        }
        C1975c c1975c = this.f7726K;
        if (c1975c == null) {
            wVar = wVar2;
            z8 = z7;
        } else if (c1975c.c(4)) {
            if (!z7 && D() == Long.MAX_VALUE) {
                if (this.f7724G == 2) {
                    H();
                    InterfaceC1977e interfaceC1977e4 = this.f7725H;
                    interfaceC1977e4.getClass();
                    interfaceC1977e4.a();
                    this.f7725H = null;
                    this.f7724G = 0;
                    F();
                } else {
                    H();
                    this.f7732Q = true;
                }
            }
            wVar = wVar2;
            z8 = z7;
        } else {
            wVar = wVar2;
            z8 = z7;
            if (c1975c.f2614m <= j7) {
                C1975c c1975c2 = this.J;
                if (c1975c2 != null) {
                    c1975c2.g();
                }
                this.f7727L = c1975c.d(j7);
                this.J = c1975c;
                this.f7726K = null;
                z8 = true;
            }
        }
        if (z8) {
            this.J.getClass();
            int iD = this.J.d(j7);
            if (iD == 0 || this.J.m() == 0) {
                jE = this.J.f2614m;
            } else if (iD == -1) {
                C1975c c1975c3 = this.J;
                jE = c1975c3.e(c1975c3.m() - 1);
            } else {
                jE = this.J.e(iD - 1);
            }
            E(jE);
            A1.c cVar3 = new A1.c(this.J.i(j7));
            if (handler != null) {
                handler.obtainMessage(1, cVar3).sendToTarget();
            } else {
                G(cVar3);
            }
        }
        if (this.f7724G == 2) {
            return;
        }
        while (!this.f7731P) {
            try {
                C1979g c1979g = this.I;
                if (c1979g == null) {
                    InterfaceC1977e interfaceC1977e5 = this.f7725H;
                    interfaceC1977e5.getClass();
                    c1979g = (C1979g) interfaceC1977e5.f();
                    if (c1979g == null) {
                        return;
                    } else {
                        this.I = c1979g;
                    }
                }
                if (this.f7724G == 1) {
                    c1979g.f575l = 4;
                    InterfaceC1977e interfaceC1977e6 = this.f7725H;
                    interfaceC1977e6.getClass();
                    interfaceC1977e6.b(c1979g);
                    this.I = null;
                    this.f7724G = 2;
                    return;
                }
                int iW = w(wVar, c1979g, 0);
                if (iW == -4) {
                    if (c1979g.c(4)) {
                        this.f7731P = true;
                        this.f7723F = false;
                    } else {
                        C2393o c2393o2 = (C2393o) wVar.f2038m;
                        if (c2393o2 == null) {
                            return;
                        }
                        c1979g.f15518t = c2393o2.f18117s;
                        c1979g.j();
                        this.f7723F &= !c1979g.c(1);
                    }
                    if (!this.f7723F) {
                        InterfaceC1977e interfaceC1977e7 = this.f7725H;
                        interfaceC1977e7.getClass();
                        interfaceC1977e7.b(c1979g);
                        this.I = null;
                    }
                } else if (iW == -3) {
                    return;
                }
            } catch (C1978f e8) {
                AbstractC0015b.n("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f7733R, e8);
                X x8 = X.f12304o;
                E(this.f7734S);
                A1.c cVar4 = new A1.c(x8);
                if (handler != null) {
                    handler.obtainMessage(1, cVar4).sendToTarget();
                } else {
                    G(cVar4);
                }
                H();
                InterfaceC1977e interfaceC1977e8 = this.f7725H;
                interfaceC1977e8.getClass();
                interfaceC1977e8.a();
                this.f7725H = null;
                this.f7724G = 0;
                F();
                return;
            }
        }
    }
}
