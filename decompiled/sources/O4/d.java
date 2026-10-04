package O4;

import H4.EnumC0247a;
import java.util.ArrayList;
import java.util.Collection;
import n5.AbstractC1566c;
import n5.AbstractC1580q;
import n5.AbstractC1586x;
import n5.B;
import n5.a0;
import u4.InterfaceC2096b;
import u4.InterfaceC2097c;

/* loaded from: classes.dex */
public final class d {
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static O4.c c(n5.B r18, L4.l r19, int r20, O4.s r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.d.c(n5.B, L4.l, int, O4.s, boolean, boolean):O4.c");
    }

    public static F5.o d(a0 a0Var, L4.l lVar, int i7, boolean z7) {
        AbstractC1586x abstractC1586xF;
        Object objH = null;
        if (AbstractC1566c.k(a0Var)) {
            return new F5.o(1, 2, (Object) null);
        }
        if (!(a0Var instanceof AbstractC1580q)) {
            if (!(a0Var instanceof B)) {
                throw new D6.r();
            }
            c cVarC = c((B) a0Var, lVar, i7, s.f7594m, false, z7);
            boolean z8 = cVarC.a;
            a0 a0VarH = (B) cVarC.f7553c;
            if (z8) {
                a0VarH = AbstractC1566c.H(a0Var, a0VarH);
            }
            return new F5.o(cVarC.f7552b, 2, a0VarH);
        }
        boolean z9 = a0Var instanceof M4.i;
        AbstractC1580q abstractC1580q = (AbstractC1580q) a0Var;
        c cVarC2 = c(abstractC1580q.f13407l, lVar, i7, s.f7592k, z9, z7);
        c cVarC3 = c(abstractC1580q.f13408m, lVar, i7, s.f7593l, z9, z7);
        B b4 = (B) cVarC3.f7553c;
        B b7 = (B) cVarC2.f7553c;
        if (b7 != null || b4 != null) {
            if (cVarC2.a || cVarC3.a) {
                if (b4 != null) {
                    if (b7 == null) {
                        b7 = b4;
                    }
                    abstractC1586xF = AbstractC1566c.f(b7, b4);
                } else {
                    kotlin.jvm.internal.l.c(b7);
                    abstractC1586xF = b7;
                }
                objH = AbstractC1566c.H(a0Var, abstractC1586xF);
            } else {
                B b8 = abstractC1580q.f13408m;
                B b9 = abstractC1580q.f13407l;
                B b10 = b7;
                if (z9) {
                    B b11 = b7;
                    if (b7 == null) {
                        b11 = b9;
                    }
                    if (b4 == null) {
                        b4 = b8;
                    }
                    objH = new M4.i(b11, b4);
                } else {
                    if (b7 == null) {
                        b10 = b9;
                    }
                    if (b4 == null) {
                        b4 = b8;
                    }
                    objH = AbstractC1566c.f(b10, b4);
                }
            }
        }
        return new F5.o(cVarC2.f7552b, 2, objH);
    }

    public AbstractC1586x a(J4.a aVar, InterfaceC2096b interfaceC2096b, boolean z7, A2.b bVar, EnumC0247a enumC0247a, t tVar, boolean z8, e4.k kVar) {
        r rVar = new r(interfaceC2096b, z7, bVar, enumC0247a, false);
        AbstractC1586x abstractC1586x = (AbstractC1586x) kVar.invoke(aVar);
        Collection collectionM = aVar.m();
        kotlin.jvm.internal.l.e("getOverriddenDescriptors(...)", collectionM);
        Collection<InterfaceC2097c> collection = collectionM;
        ArrayList arrayList = new ArrayList(P3.r.p(collection, 10));
        for (InterfaceC2097c interfaceC2097c : collection) {
            kotlin.jvm.internal.l.c(interfaceC2097c);
            arrayList.add((AbstractC1586x) kVar.invoke(interfaceC2097c));
        }
        return b(rVar, abstractC1586x, arrayList, tVar, z8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c1  */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v20, types: [O4.f] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [O4.h] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [H4.m] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [O4.h] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [O4.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n5.AbstractC1586x b(O4.r r27, n5.AbstractC1586x r28, java.util.List r29, O4.t r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.d.b(O4.r, n5.x, java.util.List, O4.t, boolean):n5.x");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bb  */
    /* JADX WARN: Type inference failed for: r23v0, types: [O4.d] */
    /* JADX WARN: Type inference failed for: r4v3, types: [u4.b, u4.c, u4.k] */
    /* JADX WARN: Type inference failed for: r4v4, types: [J4.a] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList e(A2.b r24, java.util.Collection r25) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.d.e(A2.b, java.util.Collection):java.util.ArrayList");
    }
}
