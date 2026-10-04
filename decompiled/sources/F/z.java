package F;

import H0.H;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import h0.AbstractC0968M;
import h0.C0962G;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final class z {
    public final C0141d a;

    /* renamed from: b, reason: collision with root package name */
    public final w f2046b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2048d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2049e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2050f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2051g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2052h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2053i;

    /* renamed from: j, reason: collision with root package name */
    public N0.w f2054j;

    /* renamed from: k, reason: collision with root package name */
    public H0.F f2055k;

    /* renamed from: l, reason: collision with root package name */
    public N0.q f2056l;

    /* renamed from: m, reason: collision with root package name */
    public g0.d f2057m;

    /* renamed from: n, reason: collision with root package name */
    public g0.d f2058n;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2047c = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f2059o = new CursorAnchorInfo.Builder();

    /* renamed from: p, reason: collision with root package name */
    public final float[] f2060p = C0962G.a();

    /* renamed from: q, reason: collision with root package name */
    public final Matrix f2061q = new Matrix();

    public z(C0141d c0141d, w wVar) {
        this.a = c0141d;
        this.f2046b = wVar;
    }

    public final void a() {
        boolean z7;
        boolean z8;
        S0.h hVar;
        w wVar = this.f2046b;
        InputMethodManager inputMethodManagerX = wVar.x();
        View view = (View) wVar.f2037l;
        if (!inputMethodManagerX.isActive(view) || this.f2054j == null || this.f2056l == null || this.f2055k == null || this.f2057m == null || this.f2058n == null) {
            return;
        }
        float[] fArr = this.f2060p;
        C0962G.d(fArr);
        w0.r rVar = (w0.r) this.a.f2012k.f2042A.getValue();
        if (rVar != null) {
            if (!rVar.B()) {
                rVar = null;
            }
            if (rVar != null) {
                rVar.C(fArr);
            }
        }
        g0.d dVar = this.f2058n;
        kotlin.jvm.internal.l.c(dVar);
        float f5 = -dVar.a;
        g0.d dVar2 = this.f2058n;
        kotlin.jvm.internal.l.c(dVar2);
        C0962G.h(fArr, f5, -dVar2.f11659b);
        Matrix matrix = this.f2061q;
        AbstractC0968M.q(matrix, fArr);
        N0.w wVar2 = this.f2054j;
        kotlin.jvm.internal.l.c(wVar2);
        N0.q qVar = this.f2056l;
        kotlin.jvm.internal.l.c(qVar);
        H0.F f7 = this.f2055k;
        kotlin.jvm.internal.l.c(f7);
        g0.d dVar3 = this.f2057m;
        kotlin.jvm.internal.l.c(dVar3);
        g0.d dVar4 = this.f2058n;
        kotlin.jvm.internal.l.c(dVar4);
        boolean z9 = this.f2050f;
        boolean z10 = this.f2051g;
        boolean z11 = this.f2052h;
        boolean z12 = this.f2053i;
        CursorAnchorInfo.Builder builder = this.f2059o;
        builder.reset();
        builder.setMatrix(matrix);
        long j7 = wVar2.f6896b;
        int iE = H.e(j7);
        builder.setSelectionRange(iE, H.d(j7));
        S0.h hVar2 = S0.h.f8713l;
        if (!z9 || iE < 0) {
            z7 = z10;
            z8 = z11;
            hVar = hVar2;
        } else {
            int iB = qVar.b(iE);
            g0.d dVarC = f7.c(iB);
            z7 = z10;
            z8 = z11;
            float fJ = e3.c.j(dVarC.a, 0.0f, (int) (f7.f3084c >> 32));
            boolean zU = n6.m.u(dVar3, fJ, dVarC.f11659b);
            boolean zU2 = n6.m.u(dVar3, fJ, dVarC.f11661d);
            boolean z13 = f7.a(iB) == hVar2;
            int i7 = (zU || zU2) ? 1 : 0;
            if (!zU || !zU2) {
                i7 |= 2;
            }
            if (z13) {
                i7 |= 4;
            }
            float f8 = dVarC.f11659b;
            float f9 = dVarC.f11661d;
            hVar = hVar2;
            builder.setInsertionMarkerLocation(fJ, f8, f9, f9, i7);
        }
        if (z7) {
            H h7 = wVar2.f6897c;
            int iE2 = h7 != null ? H.e(h7.a) : -1;
            int iD = h7 != null ? H.d(h7.a) : -1;
            if (iE2 >= 0 && iE2 < iD) {
                builder.setComposingText(iE2, wVar2.a.a.subSequence(iE2, iD));
                int iB2 = qVar.b(iE2);
                int iB3 = qVar.b(iD);
                float[] fArr2 = new float[(iB3 - iB2) * 4];
                N0.q qVar2 = qVar;
                f7.f3083b.a(AbstractC1420H.c(iB2, iB3), fArr2);
                while (iE2 < iD) {
                    N0.q qVar3 = qVar2;
                    int iB4 = qVar3.b(iE2);
                    int i8 = (iB4 - iB2) * 4;
                    float[] fArr3 = fArr2;
                    float f10 = fArr3[i8];
                    w wVar3 = wVar;
                    float f11 = fArr3[i8 + 1];
                    int i9 = iB2;
                    float f12 = fArr3[i8 + 2];
                    float f13 = fArr3[i8 + 3];
                    int i10 = (dVar3.f11660c <= f10 || f12 <= dVar3.a || dVar3.f11661d <= f11 || f13 <= dVar3.f11659b) ? 0 : 1;
                    if (!n6.m.u(dVar3, f10, f11) || !n6.m.u(dVar3, f12, f13)) {
                        i10 |= 2;
                    }
                    if (f7.a(iB4) == hVar) {
                        i10 |= 4;
                    }
                    builder.addCharacterBounds(iE2, f10, f11, f12, f13, i10);
                    iE2++;
                    fArr2 = fArr3;
                    wVar = wVar3;
                    iB2 = i9;
                    qVar2 = qVar3;
                }
            }
        }
        w wVar4 = wVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33 && z8) {
            l.a(builder, dVar4);
        }
        if (i11 >= 34 && z12) {
            n.a(builder, f7, dVar3);
        }
        wVar4.x().updateCursorAnchorInfo(view, builder.build());
        this.f2049e = false;
    }
}
