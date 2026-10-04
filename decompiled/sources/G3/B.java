package G3;

import java.util.List;
import java.util.Map;
import java.util.Set;
import p.AbstractC1755i;

/* loaded from: classes.dex */
public final class B extends j {
    public final x a;

    /* renamed from: b, reason: collision with root package name */
    public final j f2772b;

    /* renamed from: c, reason: collision with root package name */
    public final j f2773c;

    /* renamed from: d, reason: collision with root package name */
    public final j f2774d;

    /* renamed from: e, reason: collision with root package name */
    public final j f2775e;

    /* renamed from: f, reason: collision with root package name */
    public final j f2776f;

    public B(x xVar) {
        this.a = xVar;
        Set set = H3.e.a;
        this.f2772b = xVar.a(List.class, set, null);
        this.f2773c = xVar.a(Map.class, set, null);
        this.f2774d = xVar.a(String.class, set, null);
        this.f2775e = xVar.a(Double.class, set, null);
        this.f2776f = xVar.a(Boolean.class, set, null);
    }

    @Override // G3.j
    public final Object a(m mVar) {
        int iB = AbstractC1755i.b(mVar.J());
        if (iB == 0) {
            return this.f2772b.a(mVar);
        }
        if (iB == 2) {
            return this.f2773c.a(mVar);
        }
        if (iB == 5) {
            return this.f2774d.a(mVar);
        }
        if (iB == 6) {
            return this.f2775e.a(mVar);
        }
        if (iB == 7) {
            return this.f2776f.a(mVar);
        }
        if (iB == 8) {
            mVar.x();
            return null;
        }
        throw new IllegalStateException("Expected a value but was " + A6.b.t(mVar.J()) + " at path " + mVar.j());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020 A[PHI: r1
      0x0020: PHI (r1v4 java.lang.Class<?>) = (r1v1 java.lang.Class<?>), (r1v2 java.lang.Class<?>) binds: [B:7:0x001e, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // G3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(G3.p r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.Class r0 = r6.getClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto L18
            r5.e()
            G3.o r5 = (G3.o) r5
            r6 = 0
            r5.f2828o = r6
            r6 = 3
            r0 = 5
            r1 = 125(0x7d, float:1.75E-43)
            r5.H(r6, r0, r1)
            return
        L18:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L22
        L20:
            r0 = r1
            goto L2b
        L22:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L2b
            goto L20
        L2b:
            java.util.Set r1 = H3.e.a
            G3.x r2 = r4.a
            r3 = 0
            G3.j r0 = r2.a(r0, r1, r3)
            r0.c(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.B.c(G3.p, java.lang.Object):void");
    }

    public final String toString() {
        return "JsonAdapter(Object)";
    }
}
