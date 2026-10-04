package L;

import D.C0042b;
import M.AbstractC0461t;
import O.C0486d;
import O.C0502l;
import O.C0510p;
import O.InterfaceC0501k0;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import b1.AbstractC0703b;
import com.kusukanime.R;
import e4.InterfaceC0821a;
import p.C1743c;
import v.AbstractC2130i;
import v.AbstractC2136o;
import v.C2140t;
import v.C2141u;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* renamed from: L.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0365e1 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f5512l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1743c f5513m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W.a f5514n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0390k2 f5515o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f5516p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ M5.c f5517q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ W.a f5518r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0365e1(e4.n nVar, C1743c c1743c, W.a aVar, C0390k2 c0390k2, InterfaceC0821a interfaceC0821a, M5.c cVar, W.a aVar2) {
        super(2);
        this.f5512l = (kotlin.jvm.internal.m) nVar;
        this.f5513m = c1743c;
        this.f5514n = aVar;
        this.f5515o = c0390k2;
        this.f5516p = interfaceC0821a;
        this.f5517q = cVar;
        this.f5518r = aVar2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [e4.n, kotlin.jvm.internal.m] */
    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        boolean z7;
        boolean z8;
        C0510p c0510p = (C0510p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            a0.q qVarA = v.p0.a(androidx.compose.foundation.layout.c.d(a0.n.a, 1.0f), (v.m0) this.f5512l.invoke(c0510p, 0));
            C1743c c1743c = this.f5513m;
            boolean zH = c0510p.h(c1743c);
            Object objH = c0510p.H();
            O.T t7 = C0502l.a;
            if (zH || objH == t7) {
                objH = new C0042b(10, c1743c);
                c0510p.b0(objH);
            }
            a0.q qVarA2 = androidx.compose.ui.graphics.a.a(qVarA, (e4.k) objH);
            C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p, 0);
            int i7 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            a0.q qVarC = a0.a.c(c0510p, qVarA2);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C2361h c2361h = C2363j.f17875f;
            C0486d.R(c0510p, c2361h, c2140tA);
            C2361h c2361h2 = C2363j.f17874e;
            C0486d.R(c0510p, c2361h2, interfaceC0501k0M);
            C2361h c2361h3 = C2363j.f17876g;
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i7))) {
                AbstractC0703b.u(i7, c0510p, i7, c2361h3);
            }
            C2361h c2361h4 = C2363j.f17873d;
            C0486d.R(c0510p, c2361h4, qVarC);
            C2141u c2141u = C2141u.a;
            c0510p.R(-1636564008);
            W.a aVar = this.f5514n;
            if (aVar != null) {
                String strB = AbstractC0461t.b(R.string.m3c_bottom_sheet_collapse_description, c0510p);
                String strB2 = AbstractC0461t.b(R.string.m3c_bottom_sheet_dismiss_description, c0510p);
                String strB3 = AbstractC0461t.b(R.string.m3c_bottom_sheet_expand_description, c0510p);
                HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(a0.b.f10394x);
                C0390k2 c0390k2 = this.f5515o;
                boolean zF = c0510p.f(c0390k2) | c0510p.f(strB2);
                InterfaceC0821a interfaceC0821a = this.f5516p;
                boolean zF2 = zF | c0510p.f(interfaceC0821a) | c0510p.f(strB3);
                M5.c cVar = this.f5517q;
                boolean zH2 = zF2 | c0510p.h(cVar) | c0510p.f(strB);
                Object objH2 = c0510p.H();
                if (zH2 || objH2 == t7) {
                    C0361d1 c0361d1 = new C0361d1(c0390k2, strB2, strB3, strB, interfaceC0821a, cVar, 0);
                    c0510p.b0(c0361d1);
                    objH2 = c0361d1;
                }
                a0.q qVarA3 = F0.k.a(horizontalAlignElement, true, (e4.k) objH2);
                InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10381k, false);
                int i8 = c0510p.f7128P;
                InterfaceC0501k0 interfaceC0501k0M2 = c0510p.m();
                a0.q qVarC2 = a0.a.c(c0510p, qVarA3);
                c0510p.V();
                if (c0510p.f7127O) {
                    c0510p.l(c2362i);
                } else {
                    c0510p.e0();
                }
                C0486d.R(c0510p, c2361h, interfaceC2173HE);
                C0486d.R(c0510p, c2361h2, interfaceC0501k0M2);
                if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i8))) {
                    AbstractC0703b.u(i8, c0510p, i8, c2361h3);
                }
                C0486d.R(c0510p, c2361h4, qVarC2);
                z8 = true;
                z7 = false;
                AbstractC0703b.v(0, aVar, c0510p, true);
            } else {
                z7 = false;
                z8 = true;
            }
            c0510p.p(z7);
            this.f5518r.invoke(c2141u, c0510p, 6);
            c0510p.p(z8);
        }
        return O3.C.a;
    }
}
