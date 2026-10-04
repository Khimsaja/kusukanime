package s;

import android.view.KeyEvent;
import e5.AbstractC0832b;
import f0.C0866s;
import f0.InterfaceC0857j;
import f0.InterfaceC0860m;
import f6.AbstractC0905c;
import l4.InterfaceC1443v;
import o.C1622t;
import p.C1772x;
import q0.C1844a;
import r0.C1861b;
import s0.C1963h;
import s0.EnumC1964i;
import y0.AbstractC2359f;

/* renamed from: s.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1944v0 extends P implements y0.a0, InterfaceC0860m, q0.d, y0.l0 {

    /* renamed from: H, reason: collision with root package name */
    public q.e0 f15388H;
    public X I;
    public final r0.e J;

    /* renamed from: K, reason: collision with root package name */
    public final C1913f0 f15389K;

    /* renamed from: L, reason: collision with root package name */
    public final C1928n f15390L;

    /* renamed from: M, reason: collision with root package name */
    public final D0 f15391M;

    /* renamed from: N, reason: collision with root package name */
    public final C1927m0 f15392N;

    /* renamed from: O, reason: collision with root package name */
    public final C1924l f15393O;

    /* renamed from: P, reason: collision with root package name */
    public C1902a f15394P;

    /* renamed from: Q, reason: collision with root package name */
    public D.S f15395Q;

    /* renamed from: R, reason: collision with root package name */
    public C1942u0 f15396R;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [s.X] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, s.v0, y0.n] */
    public C1944v0(q.e0 e0Var, InterfaceC1910e interfaceC1910e, X x7, EnumC1903a0 enumC1903a0, InterfaceC1946w0 interfaceC1946w0, u.k kVar, boolean z7, boolean z8) {
        super(C1912f.f15300o, z7, kVar, enumC1903a0);
        this.f15388H = e0Var;
        this.I = x7;
        r0.e eVar = new r0.e();
        this.J = eVar;
        C1913f0 c1913f0 = new C1913f0();
        c1913f0.f15304x = z7;
        G0(c1913f0);
        this.f15389K = c1913f0;
        C1928n c1928n = new C1928n(new C1772x(new X4.y(androidx.compose.foundation.gestures.a.f10577c)));
        this.f15390L = c1928n;
        q.e0 e0Var2 = this.f15388H;
        ?? r11 = this.I;
        D0 d02 = new D0(interfaceC1946w0, e0Var2, r11 == 0 ? c1928n : r11, enumC1903a0, z8, eVar);
        this.f15391M = d02;
        C1927m0 c1927m0 = new C1927m0(d02, z7);
        this.f15392N = c1927m0;
        C1924l c1924l = new C1924l(enumC1903a0, d02, z8, interfaceC1910e);
        G0(c1924l);
        this.f15393O = c1924l;
        G0(new r0.h(c1927m0, eVar));
        G0(new C0866s());
        A.k kVar2 = new A.k();
        kVar2.f32x = c1924l;
        G0(kVar2);
        C1622t c1622t = new C1622t(7, (Object) this);
        q.K k7 = new q.K();
        k7.f14492x = c1622t;
        G0(k7);
    }

    @Override // y0.a0
    public final void K() {
        AbstractC2359f.s(this, new C1861b(2, this));
    }

    @Override // s.P
    public final Object N0(N n7, O o7) {
        q.X x7 = q.X.f14514l;
        D0 d02 = this.f15391M;
        Object objE = d02.e(x7, new C1929n0(n7, d02, null), o7);
        return objE == T3.a.f9048k ? objE : O3.C.a;
    }

    @Override // s.P
    public final void P0(long j7) {
        H5.D.x(this.J.c(), null, new C1931o0(this, j7, null), 3);
    }

    @Override // f0.InterfaceC0860m
    public final void Q(InterfaceC0857j interfaceC0857j) {
        interfaceC0857j.b(false);
    }

    @Override // s.P
    public final boolean Q0() {
        D0 d02 = this.f15391M;
        if (d02.a.b()) {
            return true;
        }
        q.e0 e0Var = d02.f15098b;
        return e0Var != null ? e0Var.a() : false;
    }

    @Override // q0.d
    public final boolean S(KeyEvent keyEvent) {
        long jE;
        if (!this.f15193B || ((!C1844a.a(q0.c.B(keyEvent), C1844a.f14668l) && !C1844a.a(AbstractC0905c.a(keyEvent.getKeyCode()), C1844a.f14667k)) || q0.c.D(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z7 = this.f15391M.f15100d == EnumC1903a0.f15259k;
        C1924l c1924l = this.f15393O;
        if (z7) {
            int i7 = (int) (c1924l.f15333F & 4294967295L);
            jE = AbstractC0832b.e(0.0f, C1844a.a(AbstractC0905c.a(keyEvent.getKeyCode()), C1844a.f14667k) ? i7 : -i7);
        } else {
            int i8 = (int) (c1924l.f15333F >> 32);
            jE = AbstractC0832b.e(C1844a.a(AbstractC0905c.a(keyEvent.getKeyCode()), C1844a.f14667k) ? i8 : -i8, 0.0f);
        }
        H5.D.x(u0(), null, new C1935q0(this, jE, null), 3);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    @Override // s.P, y0.j0
    public final void W(C1963h c1963h, EnumC1964i enumC1964i, long j7) {
        long j8;
        ?? r02 = c1963h.a;
        int size = r02.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            if (((Boolean) this.f15192A.invoke((s0.r) r02.get(i7))).booleanValue()) {
                super.W(c1963h, enumC1964i, j7);
                break;
            }
            i7++;
        }
        if (enumC1964i == EnumC1964i.f15462l && c1963h.f15460d == 6) {
            ?? r8 = c1963h.a;
            int size2 = r8.size();
            for (int i8 = 0; i8 < size2; i8++) {
                if (((s0.r) r8.get(i8)).b()) {
                    return;
                }
            }
            kotlin.jvm.internal.l.c(this.f15394P);
            T0.b bVar = AbstractC2359f.v(this).f17655B;
            g0.c cVar = new g0.c(0L);
            int size3 = r8.size();
            int i9 = 0;
            while (true) {
                j8 = cVar.a;
                if (i9 >= size3) {
                    break;
                }
                cVar = new g0.c(g0.c.h(j8, ((s0.r) r8.get(i9)).f15477j));
                i9++;
            }
            H5.D.x(u0(), null, new C1938s0(this, g0.c.i(-bVar.x(64), j8), null), 3);
            int size4 = r8.size();
            for (int i10 = 0; i10 < size4; i10++) {
                ((s0.r) r8.get(i10)).a();
            }
        }
    }

    @Override // q0.d
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    @Override // a0.p
    public final boolean v0() {
        return false;
    }

    @Override // y0.l0
    public final void y(F0.i iVar) {
        if (this.f15193B && (this.f15395Q == null || this.f15396R == null)) {
            this.f15395Q = new D.S(19, this);
            this.f15396R = new C1942u0(this, null);
        }
        D.S s7 = this.f15395Q;
        if (s7 != null) {
            InterfaceC1443v[] interfaceC1443vArr = F0.s.a;
            iVar.j(F0.h.f2073d, new F0.a(null, s7));
        }
        C1942u0 c1942u0 = this.f15396R;
        if (c1942u0 != null) {
            InterfaceC1443v[] interfaceC1443vArr2 = F0.s.a;
            iVar.j(F0.h.f2074e, c1942u0);
        }
    }

    @Override // a0.p
    public final void y0() {
        AbstractC2359f.s(this, new C1861b(2, this));
        this.f15394P = C1902a.a;
    }

    @Override // s.P
    public final void O0(long j7) {
    }
}
