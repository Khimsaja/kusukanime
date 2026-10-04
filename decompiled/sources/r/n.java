package r;

import A3.t;
import D.AbstractC0047d0;
import H.C0184a;
import H.M;
import H0.I;
import L.C0375h;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import X0.z;
import a0.q;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import f1.AbstractC0870c;
import h0.AbstractC0959D;
import h0.AbstractC0968M;
import h0.C0998u;
import v.AbstractC2130i;
import v.C2127f;
import v.C2140t;
import v.C2141u;
import v.e0;
import v.f0;
import v.r;
import y0.C2361h;
import y0.C2363j;
import y0.InterfaceC2364k;

/* loaded from: classes.dex */
public abstract class n {
    public static final z a = new z(14);

    /* renamed from: b, reason: collision with root package name */
    public static final C1859a f14782b;

    static {
        long j7 = C0998u.f11830c;
        long j8 = C0998u.f11829b;
        f14782b = new C1859a(j7, j8, j8, C0998u.b(0.38f, j8), C0998u.b(0.38f, j8));
    }

    public static final void a(C1859a c1859a, W.a aVar, C0510p c0510p, int i7) {
        q shadowGraphicsLayerElement = a0.n.a;
        c0510p.T(-921259293);
        if ((((c0510p.f(c1859a) ? 4 : 2) | i7 | (c0510p.f(shadowGraphicsLayerElement) ? 32 : 16)) & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else {
            float f5 = h.f14767d;
            C.d dVarB = C.e.b(h.f14768e);
            float f7 = 0;
            boolean z7 = Float.compare(f5, f7) > 0;
            long j7 = AbstractC0959D.a;
            if (Float.compare(f5, f7) > 0 || z7) {
                shadowGraphicsLayerElement = new ShadowGraphicsLayerElement(dVarB, z7, j7, j7);
            }
            q qVarI0 = AbstractC0870c.i0(androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.a.m(androidx.compose.foundation.a.b(shadowGraphicsLayerElement, c1859a.a, AbstractC0968M.a)), 0.0f, h.f14772i, 1), AbstractC0870c.c0(c0510p));
            C2140t c2140tA = r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p, 0);
            int i8 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            q qVarC = a0.a.c(c0510p, qVarI0);
            InterfaceC2364k.f17877j.getClass();
            InterfaceC0821a interfaceC0821a = C2363j.f17871b;
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(interfaceC0821a);
            } else {
                c0510p.e0();
            }
            C0486d.R(c0510p, C2363j.f17875f, c2140tA);
            C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0M);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i8))) {
                AbstractC0703b.u(i8, c0510p, i8, c2361h);
            }
            C0486d.R(c0510p, C2363j.f17873d, qVarC);
            aVar.invoke(C2141u.a, c0510p, 54);
            c0510p.p(true);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new M(i7, 14, c1859a, aVar);
        }
    }

    public static final void b(String str, boolean z7, C1859a c1859a, InterfaceC0821a interfaceC0821a, C0510p c0510p, int i7) {
        int i8;
        a0.n nVar = a0.n.a;
        c0510p.T(791018367);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.f(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.g(z7) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p.f(c1859a) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0510p.f(nVar) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= c0510p.h(null) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i8 |= c0510p.h(interfaceC0821a) ? 131072 : 65536;
        }
        if ((74899 & i8) == 74898 && c0510p.y()) {
            c0510p.M();
        } else {
            a0.h hVar = h.f14769f;
            v.M m7 = AbstractC2130i.a;
            float f5 = h.f14771h;
            C2127f c2127fG = AbstractC2130i.g(f5);
            boolean z8 = ((i8 & 112) == 32) | ((458752 & i8) == 131072);
            Object objH = c0510p.H();
            if (z8 || objH == C0502l.a) {
                objH = new B.d(z7, interfaceC0821a);
                c0510p.b0(objH);
            }
            q qVarD = androidx.compose.foundation.layout.c.d(androidx.compose.foundation.a.e(nVar, z7, str, (InterfaceC0821a) objH, 4), 1.0f);
            float f7 = h.a;
            float f8 = h.f14765b;
            float f9 = h.f14766c;
            q qVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.l(qVarD, f7, f9, f8, f9), f5, 0.0f, 2);
            f0 f0VarB = e0.b(c2127fG, hVar, c0510p, 54);
            int i9 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            q qVarC = a0.a.c(c0510p, qVarJ);
            InterfaceC2364k.f17877j.getClass();
            InterfaceC0821a interfaceC0821a2 = C2363j.f17871b;
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(interfaceC0821a2);
            } else {
                c0510p.e0();
            }
            C0486d.R(c0510p, C2363j.f17875f, f0VarB);
            C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0M);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i9))) {
                AbstractC0703b.u(i9, c0510p, i9, c2361h);
            }
            C0486d.R(c0510p, C2363j.f17873d, qVarC);
            c0510p.R(554568909);
            c0510p.p(false);
            I i10 = new I(z7 ? c1859a.f14752b : c1859a.f14754d, h.f14773j, h.f14774k, null, h.f14776m, h.f14770g, h.f14775l, 16613240);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            AbstractC0047d0.a(str, new LayoutWeightElement(1.0f, true), i10, 0, false, 1, 0, c0510p, (i8 & 14) | 1572864, 440);
            c0510p.p(true);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new m(str, z7, c1859a, interfaceC0821a, i7);
        }
    }

    public static final void c(f fVar, InterfaceC0821a interfaceC0821a, t tVar, C0510p c0510p, int i7) {
        int i8;
        Object obj = a0.n.a;
        c0510p.T(712057293);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.f(fVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.h(interfaceC0821a) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p.f(obj) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0510p.h(tVar) ? 2048 : 1024;
        }
        if ((i8 & 1171) == 1170 && c0510p.y()) {
            c0510p.M();
        } else {
            Context context = (Context) c0510p.k(AndroidCompositionLocals_androidKt.f10669b);
            boolean zF = c0510p.f((Configuration) c0510p.k(AndroidCompositionLocals_androidKt.a)) | c0510p.f(context);
            Object objH = c0510p.H();
            if (zF || objH == C0502l.a) {
                C1859a c1859a = f14782b;
                long jC = c1859a.a;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                int iW = AbstractC0968M.w(jC);
                int color = typedArrayObtainStyledAttributes.getColor(0, iW);
                typedArrayObtainStyledAttributes.recycle();
                if (color != iW) {
                    jC = AbstractC0968M.c(color);
                }
                long j7 = jC;
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                ColorStateList colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(0);
                typedArrayObtainStyledAttributes2.recycle();
                long jC2 = c1859a.f14752b;
                int iW2 = AbstractC0968M.w(jC2);
                Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iW2)) : null;
                if (numValueOf != null && numValueOf.intValue() != iW2) {
                    jC2 = AbstractC0968M.c(numValueOf.intValue());
                }
                long j8 = jC2;
                long jC3 = c1859a.f14754d;
                int iW3 = AbstractC0968M.w(jC3);
                Integer numValueOf2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iW3)) : null;
                if (numValueOf2 != null && numValueOf2.intValue() != iW3) {
                    jC3 = AbstractC0968M.c(numValueOf2.intValue());
                }
                long j9 = jC3;
                Object c1859a2 = new C1859a(j7, j8, j8, j9, j9);
                c0510p.b0(c1859a2);
                objH = c1859a2;
            }
            d(fVar, interfaceC0821a, (C1859a) objH, tVar, c0510p, ((i8 << 3) & 57344) | (i8 & 1022));
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0184a(fVar, interfaceC0821a, tVar, i7);
        }
    }

    public static final void d(f fVar, InterfaceC0821a interfaceC0821a, C1859a c1859a, t tVar, C0510p c0510p, int i7) {
        int i8;
        InterfaceC0821a interfaceC0821a2;
        C0510p c0510p2;
        f fVar2;
        a0.n nVar = a0.n.a;
        c0510p.T(1447189339);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.f(fVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.h(interfaceC0821a) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p.f(nVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0510p.f(c1859a) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= c0510p.h(tVar) ? 16384 : 8192;
        }
        if ((i8 & 9363) == 9362 && c0510p.y()) {
            c0510p.M();
            interfaceC0821a2 = interfaceC0821a;
            c0510p2 = c0510p;
            fVar2 = fVar;
        } else {
            interfaceC0821a2 = interfaceC0821a;
            c0510p2 = c0510p;
            X0.k.a(fVar, interfaceC0821a2, a, W.f.b(795909757, new M(c1859a, tVar), c0510p), c0510p2, (i8 & 14) | 3456 | (i8 & 112), 0);
            fVar2 = fVar;
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0375h(fVar2, interfaceC0821a2, c1859a, tVar, i7);
        }
    }
}
