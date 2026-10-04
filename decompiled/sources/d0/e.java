package d0;

import X4.y;
import a0.p;
import y0.InterfaceC2366m;
import y0.o0;

/* loaded from: classes.dex */
public final class e extends p implements o0, InterfaceC2366m {

    /* renamed from: x, reason: collision with root package name */
    public e f11198x;

    public final boolean G0(y yVar) {
        e eVar = this.f11198x;
        if (eVar == null) {
            return false;
        }
        return eVar.G0(yVar);
    }

    public final void H0(y yVar) {
        e eVar = this.f11198x;
        if (eVar != null) {
            eVar.H0(yVar);
        }
    }

    public final void I0(y yVar) {
        e eVar = this.f11198x;
        if (eVar != null) {
            eVar.I0(yVar);
        }
        this.f11198x = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J0(X4.y r5) {
        /*
            r4 = this;
            d0.e r0 = r4.f11198x
            if (r0 == 0) goto L1d
            java.lang.Object r1 = r5.f9916l
            android.view.DragEvent r1 = (android.view.DragEvent) r1
            float r2 = r1.getX()
            float r1 = r1.getY()
            long r1 = e5.AbstractC0832b.e(r2, r1)
            boolean r1 = P3.F.f(r0, r1)
            r2 = 1
            if (r1 != r2) goto L1d
            r1 = r0
            goto L3a
        L1d:
            a0.p r1 = r4.f10402k
            boolean r1 = r1.f10414w
            if (r1 != 0) goto L25
            r1 = 0
            goto L38
        L25:
            kotlin.jvm.internal.x r1 = new kotlin.jvm.internal.x
            r1.<init>()
            D.i r2 = new D.i
            r3 = 10
            r2.<init>(r1, r4, r5, r3)
            y0.AbstractC2359f.z(r4, r2)
            java.lang.Object r1 = r1.f12720k
            y0.o0 r1 = (y0.o0) r1
        L38:
            d0.e r1 = (d0.e) r1
        L3a:
            if (r1 == 0) goto L45
            if (r0 != 0) goto L45
            r1.H0(r5)
            r1.J0(r5)
            goto L66
        L45:
            if (r1 != 0) goto L4d
            if (r0 == 0) goto L4d
            r0.I0(r5)
            goto L66
        L4d:
            boolean r2 = kotlin.jvm.internal.l.a(r1, r0)
            if (r2 != 0) goto L61
            if (r1 == 0) goto L5b
            r1.H0(r5)
            r1.J0(r5)
        L5b:
            if (r0 == 0) goto L66
            r0.I0(r5)
            goto L66
        L61:
            if (r1 == 0) goto L66
            r1.J0(r5)
        L66:
            r4.f11198x = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.e.J0(X4.y):void");
    }

    public final void K0(y yVar) {
        e eVar = this.f11198x;
        if (eVar != null) {
            eVar.K0(yVar);
        }
    }

    @Override // y0.o0
    public final Object p() {
        return c.a;
    }

    @Override // a0.p
    public final void z0() {
        this.f11198x = null;
    }
}
