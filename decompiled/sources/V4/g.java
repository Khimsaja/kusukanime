package V4;

import P3.F;
import P3.q;
import P3.r;
import R4.B;
import R4.C0570a;
import R4.C0580k;
import R4.C0583n;
import R4.J;
import R4.U;
import R4.c0;
import T4.i;
import U4.j;
import X4.AbstractC0605b;
import X4.C0609f;
import X4.C0611h;
import X4.C0617n;
import b1.AbstractC0703b;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class g {
    public static final C0611h a;

    static {
        C0611h c0611h = new C0611h();
        c0611h.a(j.a);
        c0611h.a(j.f9298b);
        c0611h.a(j.f9299c);
        c0611h.a(j.f9300d);
        c0611h.a(j.f9301e);
        c0611h.a(j.f9302f);
        c0611h.a(j.f9303g);
        c0611h.a(j.f9304h);
        c0611h.a(j.f9305i);
        c0611h.a(j.f9306j);
        c0611h.a(j.f9307k);
        c0611h.a(j.f9308l);
        c0611h.a(j.f9309m);
        c0611h.a(j.f9310n);
        a = c0611h;
    }

    public static e a(C0583n c0583n, T4.g gVar, i iVar) {
        String strY0;
        l.f("proto", c0583n);
        l.f("nameResolver", gVar);
        l.f("typeTable", iVar);
        C0617n c0617n = j.a;
        l.e("constructorSignature", c0617n);
        U4.c cVar = (U4.c) android.support.v4.media.session.b.w(c0583n, c0617n);
        String strA = (cVar == null || (cVar.f9245l & 1) != 1) ? "<init>" : gVar.a(cVar.f9246m);
        if (cVar == null || (cVar.f9245l & 2) != 2) {
            List<c0> list = c0583n.f8577o;
            l.e("getValueParameterList(...)", list);
            ArrayList arrayList = new ArrayList(r.p(list, 10));
            for (c0 c0Var : list) {
                l.c(c0Var);
                String strE = e(F.i0(c0Var, iVar), gVar);
                if (strE == null) {
                    return null;
                }
                arrayList.add(strE);
            }
            strY0 = q.y0(arrayList, "", "(", ")V", null, 56);
        } else {
            strY0 = gVar.a(cVar.f9247n);
        }
        return new e(strA, strY0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x0052: IF  (r4v2 java.lang.String) == (null java.lang.String)  -> B:23:0x0054 A[HIDDEN] (LINE:83)
          (r4v2 java.lang.String) from 0x0055: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:22:0x0052, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static V4.d b(R4.J r4, T4.g r5, T4.i r6, boolean r7) {
        /*
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.l.f(r0, r4)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.l.f(r0, r5)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.l.f(r0, r6)
            X4.n r0 = U4.j.f9300d
            java.lang.String r1 = "propertySignature"
            kotlin.jvm.internal.l.e(r1, r0)
            java.lang.Object r0 = android.support.v4.media.session.b.w(r4, r0)
            U4.d r0 = (U4.d) r0
            r1 = 0
            if (r0 != 0) goto L20
            goto L54
        L20:
            int r2 = r0.f9253l
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L29
            U4.b r0 = r0.f9254m
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 != 0) goto L2f
            if (r7 == 0) goto L2f
            goto L54
        L2f:
            if (r0 == 0) goto L39
            int r7 = r0.f9237l
            r7 = r7 & r3
            if (r7 != r3) goto L39
            int r7 = r0.f9238m
            goto L3b
        L39:
            int r7 = r4.f8215p
        L3b:
            if (r0 == 0) goto L4a
            int r2 = r0.f9237l
            r3 = 2
            r2 = r2 & r3
            if (r2 != r3) goto L4a
            int r4 = r0.f9239n
            java.lang.String r4 = r5.a(r4)
            goto L55
        L4a:
            R4.U r4 = P3.F.T(r4, r6)
            java.lang.String r4 = e(r4, r5)
            if (r4 != 0) goto L55
        L54:
            return r1
        L55:
            V4.d r6 = new V4.d
            java.lang.String r5 = r5.a(r7)
            r6.<init>(r5, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.g.b(R4.J, T4.g, T4.i, boolean):V4.d");
    }

    public static e c(B b4, T4.g gVar, i iVar) {
        String strM;
        l.f("proto", b4);
        l.f("nameResolver", gVar);
        l.f("typeTable", iVar);
        C0617n c0617n = j.f9298b;
        l.e("methodSignature", c0617n);
        U4.c cVar = (U4.c) android.support.v4.media.session.b.w(b4, c0617n);
        int i7 = (cVar == null || (cVar.f9245l & 1) != 1) ? b4.f8131p : cVar.f9246m;
        if (cVar == null || (cVar.f9245l & 2) != 2) {
            List listJ = r.J(F.O(b4, iVar));
            List<c0> list = b4.f8141z;
            l.e("getValueParameterList(...)", list);
            ArrayList arrayList = new ArrayList(r.p(list, 10));
            for (c0 c0Var : list) {
                l.c(c0Var);
                arrayList.add(F.i0(c0Var, iVar));
            }
            ArrayList arrayListG0 = q.G0(listJ, arrayList);
            ArrayList arrayList2 = new ArrayList(r.p(arrayListG0, 10));
            Iterator it = arrayListG0.iterator();
            while (it.hasNext()) {
                String strE = e((U) it.next(), gVar);
                if (strE == null) {
                    return null;
                }
                arrayList2.add(strE);
            }
            String strE2 = e(F.S(b4, iVar), gVar);
            if (strE2 == null) {
                return null;
            }
            strM = AbstractC0703b.m(new StringBuilder(), q.y0(arrayList2, "", "(", ")", null, 56), strE2);
        } else {
            strM = gVar.a(cVar.f9247n);
        }
        return new e(gVar.a(i7), strM);
    }

    public static final boolean d(J j7) {
        l.f("proto", j7);
        T4.b bVar = c.a;
        Object objK = j7.k(j.f9301e);
        l.e("getExtension(...)", objK);
        return bVar.c(((Number) objK).intValue()).booleanValue();
    }

    public static String e(U u5, T4.g gVar) {
        if (u5.p()) {
            return b.b(gVar.c(u5.f8302s));
        }
        return null;
    }

    public static final O3.l f(String[] strArr, String[] strArr2) throws X4.r {
        l.f("strings", strArr2);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(strArr));
        f fVarG = g(byteArrayInputStream, strArr2);
        C0570a c0570a = C0580k.f8528R;
        c0570a.getClass();
        C0609f c0609f = new C0609f(byteArrayInputStream);
        AbstractC0605b abstractC0605b = (AbstractC0605b) c0570a.a(c0609f, a);
        try {
            c0609f.a(0);
            if (abstractC0605b.a()) {
                return new O3.l(fVarG, (C0580k) abstractC0605b);
            }
            X4.r rVar = new X4.r(new D6.r().getMessage());
            rVar.f9907k = abstractC0605b;
            throw rVar;
        } catch (X4.r e7) {
            e7.f9907k = abstractC0605b;
            throw e7;
        }
    }

    public static f g(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        U4.i iVar = (U4.i) U4.i.f9291r.b(byteArrayInputStream, a);
        l.e("parseDelimitedFrom(...)", iVar);
        return new f(iVar, strArr);
    }

    public static final O3.l h(String[] strArr, String[] strArr2) throws X4.r {
        l.f("data", strArr);
        l.f("strings", strArr2);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(strArr));
        f fVarG = g(byteArrayInputStream, strArr2);
        C0570a c0570a = R4.F.f8153v;
        c0570a.getClass();
        C0609f c0609f = new C0609f(byteArrayInputStream);
        AbstractC0605b abstractC0605b = (AbstractC0605b) c0570a.a(c0609f, a);
        try {
            c0609f.a(0);
            if (abstractC0605b.a()) {
                return new O3.l(fVarG, (R4.F) abstractC0605b);
            }
            X4.r rVar = new X4.r(new D6.r().getMessage());
            rVar.f9907k = abstractC0605b;
            throw rVar;
        } catch (X4.r e7) {
            e7.f9907k = abstractC0605b;
            throw e7;
        }
    }
}
