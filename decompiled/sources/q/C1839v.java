package q;

import android.view.KeyEvent;
import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import f0.EnumC0865r;
import f0.InterfaceC0850c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import l4.InterfaceC1443v;
import s0.C1955C;
import s0.C1963h;
import s0.EnumC1964i;
import y0.AbstractC2367n;
import y0.InterfaceC2366m;

/* renamed from: q.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1839v extends AbstractC2367n implements y0.j0, q0.d, InterfaceC0850c, y0.l0, y0.o0 {

    /* renamed from: Q, reason: collision with root package name */
    public static final b0 f14633Q = new b0(2);

    /* renamed from: A, reason: collision with root package name */
    public S f14634A;

    /* renamed from: B, reason: collision with root package name */
    public String f14635B;

    /* renamed from: C, reason: collision with root package name */
    public F0.f f14636C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f14637D;

    /* renamed from: E, reason: collision with root package name */
    public InterfaceC0821a f14638E;

    /* renamed from: G, reason: collision with root package name */
    public final H f14640G;

    /* renamed from: H, reason: collision with root package name */
    public C1955C f14641H;
    public InterfaceC2366m I;
    public u.m J;

    /* renamed from: K, reason: collision with root package name */
    public u.g f14642K;

    /* renamed from: N, reason: collision with root package name */
    public u.k f14645N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f14646O;

    /* renamed from: P, reason: collision with root package name */
    public final b0 f14647P;

    /* renamed from: z, reason: collision with root package name */
    public u.k f14648z;

    /* renamed from: F, reason: collision with root package name */
    public final C1816D f14639F = new C1816D();

    /* renamed from: L, reason: collision with root package name */
    public final LinkedHashMap f14643L = new LinkedHashMap();

    /* renamed from: M, reason: collision with root package name */
    public long f14644M = 0;

    public C1839v(u.k kVar, S s7, boolean z7, String str, F0.f fVar, InterfaceC0821a interfaceC0821a) {
        this.f14648z = kVar;
        this.f14634A = s7;
        this.f14635B = str;
        this.f14636C = fVar;
        this.f14637D = z7;
        this.f14638E = interfaceC0821a;
        this.f14640G = new H(kVar);
        u.k kVar2 = this.f14648z;
        this.f14645N = kVar2;
        this.f14646O = kVar2 == null && this.f14634A != null;
        this.f14647P = f14633Q;
    }

    @Override // f0.InterfaceC0850c
    public final void B(EnumC0865r enumC0865r) {
        if (enumC0865r.a()) {
            L0();
        }
        if (this.f14637D) {
            this.f14640G.B(enumC0865r);
        }
    }

    public final void K0() {
        u.k kVar = this.f14648z;
        LinkedHashMap linkedHashMap = this.f14643L;
        if (kVar != null) {
            u.m mVar = this.J;
            if (mVar != null) {
                kVar.c(new u.l(mVar));
            }
            u.g gVar = this.f14642K;
            if (gVar != null) {
                kVar.c(new u.h(gVar));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                kVar.c(new u.l((u.m) it.next()));
            }
        }
        this.J = null;
        this.f14642K = null;
        linkedHashMap.clear();
    }

    public final void L0() {
        S s7;
        if (this.I == null && (s7 = this.f14634A) != null) {
            if (this.f14648z == null) {
                this.f14648z = new u.k();
            }
            this.f14640G.J0(this.f14648z);
            u.k kVar = this.f14648z;
            kotlin.jvm.internal.l.c(kVar);
            InterfaceC2366m interfaceC2366mB = s7.b(kVar);
            G0(interfaceC2366mB);
            this.I = interfaceC2366mB;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M0(u.k r4, q.S r5, boolean r6, java.lang.String r7, F0.f r8, e4.InterfaceC0821a r9) {
        /*
            r3 = this;
            u.k r0 = r3.f14645N
            boolean r0 = kotlin.jvm.internal.l.a(r0, r4)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L13
            r3.K0()
            r3.f14645N = r4
            r3.f14648z = r4
            r4 = r2
            goto L14
        L13:
            r4 = r1
        L14:
            q.S r0 = r3.f14634A
            boolean r0 = kotlin.jvm.internal.l.a(r0, r5)
            if (r0 != 0) goto L1f
            r3.f14634A = r5
            r4 = r2
        L1f:
            boolean r5 = r3.f14637D
            q.H r0 = r3.f14640G
            if (r5 == r6) goto L3e
            q.D r5 = r3.f14639F
            if (r6 == 0) goto L30
            r3.G0(r5)
            r3.G0(r0)
            goto L39
        L30:
            r3.H0(r5)
            r3.H0(r0)
            r3.K0()
        L39:
            y0.AbstractC2359f.p(r3)
            r3.f14637D = r6
        L3e:
            java.lang.String r5 = r3.f14635B
            boolean r5 = kotlin.jvm.internal.l.a(r5, r7)
            if (r5 != 0) goto L4b
            r3.f14635B = r7
            y0.AbstractC2359f.p(r3)
        L4b:
            F0.f r5 = r3.f14636C
            boolean r5 = kotlin.jvm.internal.l.a(r5, r8)
            if (r5 != 0) goto L58
            r3.f14636C = r8
            y0.AbstractC2359f.p(r3)
        L58:
            r3.f14638E = r9
            boolean r5 = r3.f14646O
            u.k r6 = r3.f14645N
            if (r6 != 0) goto L66
            q.S r7 = r3.f14634A
            if (r7 == 0) goto L66
            r7 = r2
            goto L67
        L66:
            r7 = r1
        L67:
            if (r5 == r7) goto L79
            if (r6 != 0) goto L70
            q.S r5 = r3.f14634A
            if (r5 == 0) goto L70
            r1 = r2
        L70:
            r3.f14646O = r1
            if (r1 != 0) goto L79
            y0.m r5 = r3.I
            if (r5 != 0) goto L79
            goto L7a
        L79:
            r2 = r4
        L7a:
            if (r2 == 0) goto L8f
            y0.m r4 = r3.I
            if (r4 != 0) goto L84
            boolean r5 = r3.f14646O
            if (r5 != 0) goto L8f
        L84:
            if (r4 == 0) goto L89
            r3.H0(r4)
        L89:
            r4 = 0
            r3.I = r4
            r3.L0()
        L8f:
            u.k r4 = r3.f14648z
            r0.J0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C1839v.M0(u.k, q.S, boolean, java.lang.String, F0.f, e4.a):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    @Override // q0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean S(android.view.KeyEvent r13) {
        /*
            r12 = this;
            r12.L0()
            boolean r0 = r12.f14637D
            java.util.LinkedHashMap r1 = r12.f14643L
            r2 = 3
            r3 = 160(0xa0, float:2.24E-43)
            r4 = 66
            r5 = 23
            r6 = 32
            r7 = 0
            r8 = 1
            r9 = 0
            if (r0 == 0) goto L66
            int r0 = q.AbstractC1840w.f14649b
            int r0 = q0.c.D(r13)
            r10 = 2
            if (r0 != r10) goto L66
            long r10 = q0.c.B(r13)
            long r10 = r10 >> r6
            int r0 = (int) r10
            if (r0 == r5) goto L2b
            if (r0 == r4) goto L2b
            if (r0 == r3) goto L2b
            goto L66
        L2b:
            int r0 = r13.getKeyCode()
            long r3 = f6.AbstractC0905c.a(r0)
            q0.a r0 = new q0.a
            r0.<init>(r3)
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto Laa
            u.m r0 = new u.m
            long r3 = r12.f14644M
            r0.<init>(r3)
            int r13 = r13.getKeyCode()
            long r3 = f6.AbstractC0905c.a(r13)
            q0.a r13 = new q0.a
            r13.<init>(r3)
            r1.put(r13, r0)
            u.k r13 = r12.f14648z
            if (r13 == 0) goto L65
            H5.A r13 = r12.u0()
            q.e r1 = new q.e
            r1.<init>(r12, r0, r9)
            H5.D.x(r13, r9, r1, r2)
        L65:
            return r8
        L66:
            boolean r0 = r12.f14637D
            if (r0 == 0) goto Laa
            int r0 = q.AbstractC1840w.f14649b
            int r0 = q0.c.D(r13)
            if (r0 != r8) goto Laa
            long r10 = q0.c.B(r13)
            long r10 = r10 >> r6
            int r0 = (int) r10
            if (r0 == r5) goto L7f
            if (r0 == r4) goto L7f
            if (r0 == r3) goto L7f
            return r7
        L7f:
            int r13 = r13.getKeyCode()
            long r3 = f6.AbstractC0905c.a(r13)
            q0.a r13 = new q0.a
            r13.<init>(r3)
            java.lang.Object r13 = r1.remove(r13)
            u.m r13 = (u.m) r13
            if (r13 == 0) goto La4
            u.k r0 = r12.f14648z
            if (r0 == 0) goto La4
            H5.A r0 = r12.u0()
            q.f r1 = new q.f
            r1.<init>(r12, r13, r9)
            H5.D.x(r0, r9, r1, r2)
        La4:
            e4.a r13 = r12.f14638E
            r13.invoke()
            return r8
        Laa:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C1839v.S(android.view.KeyEvent):boolean");
    }

    @Override // y0.j0
    public final void W(C1963h c1963h, EnumC1964i enumC1964i, long j7) {
        long j8 = ((j7 >> 33) << 32) | (((j7 << 32) >> 33) & 4294967295L);
        this.f14644M = AbstractC0832b.e((int) (j8 >> 32), (int) (j8 & 4294967295L));
        L0();
        if (this.f14637D && enumC1964i == EnumC1964i.f15462l) {
            int i7 = c1963h.f15460d;
            if (i7 == 4) {
                H5.D.x(u0(), null, new C1825g(this, null), 3);
            } else if (i7 == 5) {
                H5.D.x(u0(), null, new C1826h(this, null), 3);
            }
        }
        if (this.f14641H == null) {
            C1827i c1827i = new C1827i(this, null);
            C1963h c1963h2 = s0.w.a;
            C1955C c1955c = new C1955C(null, null, c1827i);
            G0(c1955c);
            this.f14641H = c1955c;
        }
        C1955C c1955c2 = this.f14641H;
        if (c1955c2 != null) {
            c1955c2.W(c1963h, enumC1964i, j7);
        }
    }

    @Override // y0.j0
    public final void f0() {
        u.g gVar;
        u.k kVar = this.f14648z;
        if (kVar != null && (gVar = this.f14642K) != null) {
            kVar.c(new u.h(gVar));
        }
        this.f14642K = null;
        C1955C c1955c = this.f14641H;
        if (c1955c != null) {
            c1955c.f0();
        }
    }

    @Override // y0.l0
    public final boolean j0() {
        return true;
    }

    @Override // q0.d
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    @Override // y0.o0
    public final Object p() {
        return this.f14647P;
    }

    @Override // a0.p
    public final boolean v0() {
        return false;
    }

    @Override // y0.l0
    public final void y(F0.i iVar) {
        F0.f fVar = this.f14636C;
        if (fVar != null) {
            F0.s.e(iVar, fVar.a);
        }
        String str = this.f14635B;
        B.e eVar = new B.e(28, this);
        InterfaceC1443v[] interfaceC1443vArr = F0.s.a;
        iVar.j(F0.h.f2071b, new F0.a(str, eVar));
        if (this.f14637D) {
            this.f14640G.y(iVar);
        } else {
            iVar.j(F0.q.f2136i, O3.C.a);
        }
        J0(iVar);
    }

    @Override // a0.p
    public final void y0() {
        if (!this.f14646O) {
            L0();
        }
        if (this.f14637D) {
            G0(this.f14639F);
            G0(this.f14640G);
        }
    }

    @Override // a0.p
    public final void z0() {
        K0();
        if (this.f14645N == null) {
            this.f14648z = null;
        }
        InterfaceC2366m interfaceC2366m = this.I;
        if (interfaceC2366m != null) {
            H0(interfaceC2366m);
        }
        this.I = null;
    }

    public void J0(F0.i iVar) {
    }
}
