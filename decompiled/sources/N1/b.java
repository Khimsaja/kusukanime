package N1;

import B1.AbstractC0015b;
import B1.K;
import B1.q;
import F.w;
import H1.AbstractC0225f;
import H1.D;
import H1.G;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import e2.C0818a;
import java.util.ArrayList;
import y1.A;
import y1.B;
import y1.C;
import y1.C2393o;
import y1.C2403z;
import z1.c;

/* loaded from: classes.dex */
public final class b extends AbstractC0225f implements Handler.Callback {

    /* renamed from: B, reason: collision with root package name */
    public final a f6917B;

    /* renamed from: C, reason: collision with root package name */
    public final D f6918C;

    /* renamed from: D, reason: collision with root package name */
    public final Handler f6919D;

    /* renamed from: E, reason: collision with root package name */
    public final C0818a f6920E;

    /* renamed from: F, reason: collision with root package name */
    public c f6921F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f6922G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f6923H;
    public long I;
    public C J;

    /* renamed from: K, reason: collision with root package name */
    public long f6924K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(D d4, Looper looper) {
        super(5);
        a aVar = a.a;
        this.f6918C = d4;
        this.f6919D = looper == null ? null : new Handler(looper, this);
        this.f6917B = aVar;
        this.f6920E = new C0818a(1);
        this.f6924K = -9223372036854775807L;
    }

    @Override // H1.AbstractC0225f
    public final int A(C2393o c2393o) {
        if (this.f6917B.b(c2393o)) {
            return AbstractC0225f.f(c2393o.f18098M == 0 ? 4 : 2, 0, 0, 0);
        }
        return AbstractC0225f.f(0, 0, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(y1.C r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            y1.B[] r1 = r6.a
            int r2 = r1.length
            if (r0 >= r2) goto L46
            r2 = r1[r0]
            y1.o r2 = r2.a()
            if (r2 == 0) goto L3e
            N1.a r3 = r5.f6917B
            boolean r4 = r3.b(r2)
            if (r4 == 0) goto L3e
            z1.c r2 = r3.a(r2)
            r1 = r1[r0]
            byte[] r1 = r1.b()
            r1.getClass()
            e2.a r3 = r5.f6920E
            r3.f()
            int r4 = r1.length
            r3.h(r4)
            java.nio.ByteBuffer r4 = r3.f2609o
            r4.put(r1)
            r3.j()
            y1.C r1 = r2.k(r3)
            if (r1 == 0) goto L43
            r5.C(r1, r7)
            goto L43
        L3e:
            r1 = r1[r0]
            r7.add(r1)
        L43:
            int r0 = r0 + 1
            goto L1
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.b.C(y1.C, java.util.ArrayList):void");
    }

    public final long D(long j7) {
        AbstractC0015b.h(j7 != -9223372036854775807L);
        AbstractC0015b.h(this.f6924K != -9223372036854775807L);
        return j7 - this.f6924K;
    }

    public final void E(C c2) {
        D d4 = this.f6918C;
        G g4 = d4.f3212k;
        C2403z c2403zA = g4.f3262p0.a();
        int i7 = 0;
        while (true) {
            B[] bArr = c2.a;
            if (i7 >= bArr.length) {
                break;
            }
            bArr[i7].c(c2403zA);
            i7++;
        }
        g4.f3262p0 = new A(c2403zA);
        A aL0 = g4.L0();
        boolean zEquals = aL0.equals(g4.f3240Y);
        q qVar = g4.f3272w;
        if (!zEquals) {
            g4.f3240Y = aL0;
            qVar.c(14, new C2.G(4, d4));
        }
        qVar.c(28, new C2.G(5, c2));
        qVar.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        E((C) message.obj);
        return true;
    }

    @Override // H1.AbstractC0225f
    public final String j() {
        return "MetadataRenderer";
    }

    @Override // H1.AbstractC0225f
    public final boolean l() {
        return this.f6923H;
    }

    @Override // H1.AbstractC0225f
    public final boolean n() {
        return true;
    }

    @Override // H1.AbstractC0225f
    public final void o() {
        this.J = null;
        this.f6921F = null;
        this.f6924K = -9223372036854775807L;
    }

    @Override // H1.AbstractC0225f
    public final void q(long j7, boolean z7) {
        this.J = null;
        this.f6922G = false;
        this.f6923H = false;
    }

    @Override // H1.AbstractC0225f
    public final void v(C2393o[] c2393oArr, long j7, long j8, O1.B b4) {
        this.f6921F = this.f6917B.a(c2393oArr[0]);
        C c2 = this.J;
        if (c2 != null) {
            long j9 = this.f6924K;
            long j10 = c2.f17930b;
            long j11 = (j9 + j10) - j8;
            if (j10 != j11) {
                c2 = new C(j11, c2.a);
            }
            this.J = c2;
        }
        this.f6924K = j8;
    }

    @Override // H1.AbstractC0225f
    public final void x(long j7, long j8) {
        boolean z7 = true;
        while (z7) {
            if (!this.f6922G && this.J == null) {
                C0818a c0818a = this.f6920E;
                c0818a.f();
                w wVar = this.f3458m;
                wVar.r();
                int iW = w(wVar, c0818a, 0);
                if (iW == -4) {
                    if (c0818a.c(4)) {
                        this.f6922G = true;
                    } else if (c0818a.f2611q >= this.f3467v) {
                        c0818a.f11347t = this.I;
                        c0818a.j();
                        c cVar = this.f6921F;
                        int i7 = K.a;
                        C cK = cVar.k(c0818a);
                        if (cK != null) {
                            ArrayList arrayList = new ArrayList(cK.a.length);
                            C(cK, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.J = new C(D(c0818a.f2611q), (B[]) arrayList.toArray(new B[0]));
                            }
                        }
                    }
                } else if (iW == -5) {
                    C2393o c2393o = (C2393o) wVar.f2038m;
                    c2393o.getClass();
                    this.I = c2393o.f18117s;
                }
            }
            C c2 = this.J;
            if (c2 == null || c2.f17930b > D(j7)) {
                z7 = false;
            } else {
                C c4 = this.J;
                Handler handler = this.f6919D;
                if (handler != null) {
                    handler.obtainMessage(1, c4).sendToTarget();
                } else {
                    E(c4);
                }
                this.J = null;
                z7 = true;
            }
            if (this.f6922G && this.J == null) {
                this.f6923H = true;
            }
        }
    }
}
