package D;

import H.InterfaceC0196m;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import v.AbstractC2123b;

/* renamed from: D.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0052g {
    public static final float a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f1142b;

    static {
        float f5 = 25;
        a = f5;
        f1142b = (f5 * 2.0f) / 2.4142137f;
    }

    public static final void a(InterfaceC0196m interfaceC0196m, a0.q qVar, long j7, C0510p c0510p, int i7) {
        int i8;
        c0510p.T(1776202187);
        int i9 = (c0510p.f(interfaceC0196m) ? 4 : 2) | i7 | (c0510p.f(qVar) ? 32 : 16) | 128;
        if ((i9 & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else {
            c0510p.O();
            if ((i7 & 1) == 0 || c0510p.x()) {
                i8 = i9 & (-897);
                j7 = 9205357640488583168L;
            } else {
                c0510p.M();
                i8 = i9 & (-897);
            }
            c0510p.q();
            int i10 = i8 & 14;
            boolean z7 = i10 == 4;
            Object objH = c0510p.H();
            if (z7 || objH == C0502l.a) {
                objH = new C0042b(0, interfaceC0196m);
                c0510p.b0(objH);
            }
            android.support.v4.media.session.b.b(interfaceC0196m, a0.b.f10382l, W.f.b(-1653527038, new M.M(2, j7, F0.k.a(qVar, false, (e4.k) objH)), c0510p), c0510p, i10 | 432);
        }
        long j8 = j7;
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0040a(interfaceC0196m, qVar, j8, i7);
        }
    }

    public static final void b(a0.q qVar, C0510p c0510p, int i7, int i8) {
        int i9;
        c0510p.T(694251107);
        int i10 = i8 & 1;
        if (i10 != 0) {
            i9 = i7 | 6;
        } else if ((i7 & 6) == 0) {
            i9 = (c0510p.f(qVar) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        if ((i9 & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            if (i10 != 0) {
                qVar = a0.n.a;
            }
            AbstractC2123b.a(c0510p, a0.a.a(androidx.compose.foundation.layout.c.k(qVar, f1142b, a), C0050f.f1140l));
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0044c(qVar, i7, i8);
        }
    }
}
