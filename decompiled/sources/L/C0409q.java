package L;

import M.AbstractC0461t;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import com.kusukanime.R;

/* renamed from: L.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0409q {
    public static final C0409q a = new C0409q();

    /* renamed from: b, reason: collision with root package name */
    public static final float f5738b;

    static {
        float f5 = N.q.a;
        float f7 = N.q.f6749c;
        f5738b = 640;
    }

    public final void a(a0.n nVar, float f5, float f7, C.d dVar, long j7, C0510p c0510p, int i7) {
        a0.n nVar2;
        float f8;
        float f9;
        C.d dVar2;
        long jD;
        C.d dVar3;
        long j8;
        a0.n nVar3;
        float f10;
        float f11;
        c0510p.T(-1364277227);
        if (((i7 | 9654) & 9363) == 9362 && c0510p.y()) {
            c0510p.M();
            nVar3 = nVar;
            f10 = f5;
            f11 = f7;
            dVar3 = dVar;
            j8 = j7;
        } else {
            c0510p.O();
            if ((i7 & 1) == 0 || c0510p.x()) {
                a0.n nVar4 = a0.n.a;
                float f12 = N.q.f6748b;
                float f13 = N.q.a;
                nVar2 = nVar4;
                f8 = f12;
                f9 = f13;
                dVar2 = ((C0370f2) c0510p.k(AbstractC0374g2.a)).f5553e;
                jD = P.d(19, c0510p);
            } else {
                c0510p.M();
                nVar2 = nVar;
                f8 = f5;
                f9 = f7;
                dVar2 = dVar;
                jD = j7;
            }
            c0510p.q();
            String strB = AbstractC0461t.b(R.string.m3c_bottom_sheet_drag_handle_description, c0510p);
            a0.q qVarJ = androidx.compose.foundation.layout.a.j(nVar2, 0.0f, AbstractC0386j2.a, 1);
            boolean zF = c0510p.f(strB);
            Object objH = c0510p.H();
            if (zF || objH == C0502l.a) {
                objH = new F0.l(strB, 2);
                c0510p.b0(objH);
            }
            q2.a(F0.k.a(qVarJ, false, (e4.k) objH), dVar2, jD, 0L, 0.0f, 0.0f, W.f.b(-1039573072, new C0403o(f8, f9), c0510p), c0510p, 12582912, 120);
            dVar3 = dVar2;
            j8 = jD;
            nVar3 = nVar2;
            f10 = f8;
            f11 = f9;
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0406p(this, nVar3, f10, f11, dVar3, j8, i7);
        }
    }
}
