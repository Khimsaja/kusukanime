package B;

import D.C0042b;
import D.C0066n;
import D.D0;
import D.H0;
import D.J0;
import L.D2;
import L.t2;
import L.y2;
import M.W;
import O.C0486d;
import O.C0502l;
import O.C0510p;
import O.Z;
import O3.C;
import a0.n;
import a0.q;
import e4.InterfaceC0821a;
import e4.o;
import f.AbstractC0847h;
import kotlin.jvm.internal.m;
import q.M;
import q.S;
import r.C1859a;
import s.EnumC1903a0;
import s.InterfaceC1946w0;
import s.r;
import u.j;
import u.k;
import z0.AbstractC2455l0;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class c extends m implements o {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f263l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f264m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f265n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f266o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(C0066n c0066n, boolean z7, InterfaceC0821a interfaceC0821a) {
        super(3);
        this.f263l = 4;
        this.f265n = c0066n;
        this.f264m = z7;
        this.f266o = (m) interfaceC0821a;
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [e4.a, kotlin.jvm.internal.m] */
    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i7 = 1;
        k kVar = null;
        Object obj4 = C0502l.a;
        Object obj5 = this.f266o;
        Object obj6 = this.f265n;
        switch (this.f263l) {
            case 0:
                C0510p c0510p = (C0510p) obj2;
                ((Number) obj3).intValue();
                c0510p.R(290332169);
                M m7 = (M) c0510p.k(androidx.compose.foundation.d.a);
                if (m7 instanceof S) {
                    c0510p.R(-2130154122);
                    c0510p.p(false);
                } else {
                    c0510p.R(-2130046149);
                    Object objH = c0510p.H();
                    if (objH == obj4) {
                        objH = new k();
                        c0510p.b0(objH);
                    }
                    kVar = (k) objH;
                    c0510p.p(false);
                }
                q qVarB = androidx.compose.foundation.selection.b.b(n.a, this.f264m, kVar, m7, (F0.f) obj6, (e4.k) obj5);
                c0510p.p(false);
                return qVarB;
            case 1:
                C0510p c0510p2 = (C0510p) obj2;
                ((Number) obj3).intValue();
                c0510p2.R(805428266);
                J0 j02 = (J0) obj6;
                boolean z7 = ((EnumC1903a0) j02.f1060e.getValue()) == EnumC1903a0.f15259k || !(c0510p2.k(AbstractC2455l0.f18793l) == T0.k.f8845l);
                boolean zF = c0510p2.f(j02);
                Object objH2 = c0510p2.H();
                if (zF || objH2 == obj4) {
                    objH2 = new C0042b(2, j02);
                    c0510p2.b0(objH2);
                }
                Z zN = C0486d.N((e4.k) objH2, c0510p2);
                Object objH3 = c0510p2.H();
                if (objH3 == obj4) {
                    Object rVar = new r(new D0(i, zN));
                    c0510p2.b0(rVar);
                    objH3 = rVar;
                }
                InterfaceC1946w0 interfaceC1946w0 = (InterfaceC1946w0) objH3;
                boolean zF2 = c0510p2.f(interfaceC1946w0) | c0510p2.f(j02);
                Object objH4 = c0510p2.H();
                if (zF2 || objH4 == obj4) {
                    objH4 = new H0(interfaceC1946w0, j02);
                    c0510p2.b0(objH4);
                }
                q qVarB2 = androidx.compose.foundation.gestures.a.b(n.a, (H0) objH4, (EnumC1903a0) j02.f1060e.getValue(), null, this.f264m && j02.f1057b.f() != 0.0f, z7, null, (k) obj5, null);
                c0510p2.p(false);
                return qVarB2;
            case 2:
                C0510p c0510p3 = (C0510p) obj2;
                ((Number) obj3).intValue();
                c0510p3.R(-891038934);
                Z zD = W.d(this.f264m, false, ((Boolean) AbstractC0847h.k((j) obj6, c0510p3, 0).getValue()).booleanValue(), (t2) obj5, y2.f5962e, y2.f5961d, c0510p3, 0);
                n nVar = n.a;
                int i8 = D2.a;
                q qVarC = androidx.compose.ui.draw.a.c(nVar, new D0(i7, zD));
                c0510p3.p(false);
                return qVarC;
            case 3:
                C0510p c0510p4 = (C0510p) obj2;
                ((Number) obj3).intValue();
                c0510p4.R(-756081143);
                M m8 = (M) c0510p4.k(androidx.compose.foundation.d.a);
                if (m8 instanceof S) {
                    c0510p4.R(617140216);
                    c0510p4.p(false);
                } else {
                    c0510p4.R(617248189);
                    Object objH5 = c0510p4.H();
                    if (objH5 == obj4) {
                        objH5 = new k();
                        c0510p4.b0(objH5);
                    }
                    kVar = (k) objH5;
                    c0510p4.p(false);
                }
                q qVarC2 = androidx.compose.foundation.a.c(n.a, kVar, m8, this.f264m, (String) obj6, null, (InterfaceC0821a) obj5);
                c0510p4.p(false);
                return qVarC2;
            default:
                C1859a c1859a = (C1859a) obj;
                C0510p c0510p5 = (C0510p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c0510p5.f(c1859a) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c0510p5.y()) {
                    c0510p5.M();
                } else {
                    String str = (String) ((C0066n) obj6).invoke(c0510p5, 0);
                    if (AbstractC2510o.g0(str)) {
                        throw new IllegalStateException("Label must not be blank");
                    }
                    r.n.b(str, this.f264m, c1859a, (m) obj5, c0510p5, (iIntValue << 6) & 896);
                }
                return C.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(J0 j02, boolean z7, k kVar) {
        super(3);
        this.f263l = 1;
        this.f265n = j02;
        this.f264m = z7;
        this.f266o = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, boolean z7, t2 t2Var) {
        super(3);
        this.f263l = 2;
        y2 y2Var = y2.a;
        y2 y2Var2 = y2.a;
        this.f265n = jVar;
        this.f264m = z7;
        this.f266o = t2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(boolean z7, Object obj, O3.e eVar, int i7) {
        super(3);
        this.f263l = i7;
        this.f264m = z7;
        this.f265n = obj;
        this.f266o = eVar;
    }
}
