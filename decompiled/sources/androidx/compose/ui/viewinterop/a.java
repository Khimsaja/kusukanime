package androidx.compose.ui.viewinterop;

import H.C0184a;
import L2.f;
import O.C0486d;
import O.C0502l;
import O.C0506n;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import T0.b;
import W0.m;
import W0.n;
import X.j;
import X.l;
import a0.p;
import a0.q;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0694v;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import e4.k;
import f0.C0866s;
import f6.AbstractC0905c;
import t1.AbstractC2034a;
import y0.C2349D;
import y0.C2361h;
import y0.C2363j;
import y0.InterfaceC2364k;
import y0.S;
import z0.AbstractC2455l0;

/* loaded from: classes.dex */
public abstract class a {
    public static final void a(k kVar, q qVar, k kVar2, C0510p c0510p, int i7) {
        int i8;
        InterfaceC0694v interfaceC0694v;
        InterfaceC0501k0 interfaceC0501k0;
        Object obj;
        f fVar;
        Object obj2 = W0.a.f9517p;
        c0510p.T(-180024211);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.h(kVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.f(qVar) ? 32 : 16;
        }
        int i9 = i8 | 384;
        if ((i7 & 3072) == 0) {
            i9 |= c0510p.h(obj2) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i9 |= c0510p.h(kVar2) ? 16384 : 8192;
        }
        if ((i9 & 9363) == 9362 && c0510p.y()) {
            c0510p.M();
        } else {
            int i10 = c0510p.f7128P;
            q qVarK = qVar.k(FocusGroupPropertiesElement.a);
            FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement = new S() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                public final boolean equals(Object obj3) {
                    return obj3 == this;
                }

                @Override // y0.S
                public final p h() {
                    return new C0866s();
                }

                public final int hashCode() {
                    return 1739042953;
                }

                @Override // y0.S
                public final /* bridge */ /* synthetic */ void m(p pVar) {
                }
            };
            q qVarC = a0.a.c(c0510p, qVarK.k(focusTargetNode$FocusTargetElement).k(FocusTargetPropertiesElement.a).k(focusTargetNode$FocusTargetElement));
            b bVar = (b) c0510p.k(AbstractC2455l0.f18787f);
            T0.k kVar3 = (T0.k) c0510p.k(AbstractC2455l0.f18793l);
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            InterfaceC0694v interfaceC0694v2 = (InterfaceC0694v) c0510p.k(AbstractC2034a.a);
            f fVar2 = (f) c0510p.k(AndroidCompositionLocals_androidKt.f10672e);
            c0510p.R(608726777);
            int i11 = i9 & 14;
            int i12 = c0510p.f7128P;
            Context context = (Context) c0510p.k(AndroidCompositionLocals_androidKt.f10669b);
            C0506n c0506nM = C0486d.M(c0510p);
            j jVar = (j) c0510p.k(l.a);
            View view = (View) c0510p.k(AndroidCompositionLocals_androidKt.f10673f);
            boolean zH = c0510p.h(context) | ((((i11 & 14) ^ 6) > 4 && c0510p.f(kVar)) || (i11 & 6) == 4) | c0510p.h(c0506nM) | c0510p.h(jVar) | c0510p.d(i12) | c0510p.h(view);
            Object objH = c0510p.H();
            if (zH || objH == C0502l.a) {
                interfaceC0694v = interfaceC0694v2;
                interfaceC0501k0 = interfaceC0501k0M;
                obj = obj2;
                fVar = fVar2;
                Object nVar = new n(context, kVar, c0506nM, jVar, i12, view);
                c0510p.b0(nVar);
                objH = nVar;
            } else {
                interfaceC0694v = interfaceC0694v2;
                interfaceC0501k0 = interfaceC0501k0M;
                obj = obj2;
                fVar = fVar2;
            }
            InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH;
            c0510p.N(125, 1, null, null);
            c0510p.f7144q = true;
            if (c0510p.f7127O) {
                c0510p.l(interfaceC0821a);
            } else {
                c0510p.e0();
            }
            InterfaceC2364k.f17877j.getClass();
            C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0);
            C0486d.R(c0510p, m.f9568o, qVarC);
            C0486d.R(c0510p, m.f9569p, bVar);
            C0486d.R(c0510p, m.f9570q, interfaceC0694v);
            C0486d.R(c0510p, m.f9571r, fVar);
            C0486d.R(c0510p, m.f9572s, kVar3);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i10))) {
                AbstractC0703b.u(i10, c0510p, i10, c2361h);
            }
            C0486d.R(c0510p, m.f9566m, kVar2);
            C0486d.R(c0510p, m.f9567n, obj);
            c0510p.p(true);
            c0510p.p(false);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0184a(kVar, qVar, kVar2, i7, 3);
        }
    }

    public static final void b(k kVar, q qVar, k kVar2, C0510p c0510p, int i7, int i8) {
        int i9;
        c0510p.T(-1783766393);
        int i10 = (c0510p.h(kVar) ? 4 : 2) | i7;
        if ((i7 & 48) == 0) {
            i10 |= c0510p.f(qVar) ? 32 : 16;
        }
        int i11 = i8 & 4;
        if (i11 != 0) {
            i9 = i10 | 384;
        } else {
            i9 = i10 | (c0510p.h(kVar2) ? 256 : 128);
        }
        if ((i9 & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else {
            W0.a aVar = W0.a.f9517p;
            if (i11 != 0) {
                kVar2 = aVar;
            }
            a(kVar, qVar, kVar2, c0510p, ((i9 << 6) & 57344) | (i9 & 14) | 3072 | (i9 & 112));
        }
        k kVar3 = kVar2;
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new W0.l(kVar, qVar, kVar3, i7, i8);
        }
    }

    public static final W0.q c(C2349D c2349d) {
        W0.q qVar = c2349d.f17680t;
        if (qVar != null) {
            return qVar;
        }
        AbstractC0905c.D("Required value was null.");
        throw null;
    }
}
