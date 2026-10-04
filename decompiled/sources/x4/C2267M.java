package x4;

import java.util.Set;
import u4.InterfaceC2118y;

/* renamed from: x4.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2267M extends g5.p {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2118y f17399b;

    /* renamed from: c, reason: collision with root package name */
    public final W4.c f17400c;

    public C2267M(InterfaceC2118y interfaceC2118y, W4.c cVar) {
        kotlin.jvm.internal.l.f("moduleDescriptor", interfaceC2118y);
        kotlin.jvm.internal.l.f("fqName", cVar);
        this.f17399b = interfaceC2118y;
        this.f17400c = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r9.a.contains(g5.c.a) != false) goto L9;
     */
    @Override // g5.p, g5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection e(g5.f r9, e4.k r10) {
        /*
            r8 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.l.f(r0, r9)
            int r0 = g5.f.f11731h
            boolean r0 = r9.a(r0)
            P3.y r1 = P3.y.f7779k
            if (r0 != 0) goto L10
            goto L24
        L10:
            W4.c r0 = r8.f17400c
            W4.d r2 = r0.a
            boolean r2 = r2.c()
            if (r2 == 0) goto L25
            g5.c r2 = g5.c.a
            java.util.List r9 = r9.a
            boolean r9 = r9.contains(r2)
            if (r9 == 0) goto L25
        L24:
            return r1
        L25:
            u4.y r9 = r8.f17399b
            java.util.Collection r1 = r9.h(r0, r10)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L38:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r1.next()
            W4.c r3 = (W4.c) r3
            W4.d r3 = r3.a
            W4.e r3 = r3.g()
            java.lang.Object r4 = r10.invoke(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L38
            boolean r4 = r3.f9625l
            r5 = 0
            if (r4 == 0) goto L5c
            goto L7b
        L5c:
            W4.c r3 = r0.a(r3)
            u4.H r3 = r9.F(r3)
            x4.x r3 = (x4.C2297x) r3
            m5.i r4 = r3.f17513p
            l4.v[] r6 = x4.C2297x.f17509r
            r7 = 1
            r6 = r6[r7]
            java.lang.Object r4 = e5.AbstractC0832b.u(r4, r6)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L7a
            goto L7b
        L7a:
            r5 = r3
        L7b:
            w5.k.a(r2, r5)
            goto L38
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C2267M.e(g5.f, e4.k):java.util.Collection");
    }

    @Override // g5.p, g5.o
    public final Set g() {
        return P3.A.f7737k;
    }

    public final String toString() {
        return "subpackages of " + this.f17400c + " from " + this.f17399b;
    }
}
