package j5;

import P3.F;
import R4.C0583n;
import R4.J;
import R4.U;
import R4.c0;
import R4.i0;
import X4.AbstractC0615l;
import f1.AbstractC0870c;
import f1.AbstractC0871d;
import java.util.ArrayList;
import java.util.List;
import l5.C1448a;
import l5.C1450c;
import l5.C1456i;
import l5.C1466s;
import l5.C1469v;
import n5.AbstractC1586x;
import u4.InterfaceC2088D;
import u4.InterfaceC2096b;
import u4.InterfaceC2099e;
import u4.InterfaceC2105k;
import u4.M;
import v4.C2159g;
import x4.AbstractC2257C;
import x4.C2272S;
import x4.C2295v;

/* renamed from: j5.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1365t {
    public final C1356k a;

    /* renamed from: b, reason: collision with root package name */
    public final L2.e f12471b;

    public C1365t(C1356k c1356k) {
        kotlin.jvm.internal.l.f("c", c1356k);
        this.a = c1356k;
        C1354i c1354i = c1356k.a;
        this.f12471b = new L2.e(c1354i.f12414b, c1354i.f12424l);
    }

    public final AbstractC1368w a(InterfaceC2105k interfaceC2105k) {
        if (interfaceC2105k instanceof InterfaceC2088D) {
            W4.c cVar = ((AbstractC2257C) ((InterfaceC2088D) interfaceC2105k)).f17354o;
            C1356k c1356k = this.a;
            return new C1367v(cVar, c1356k.f12439b, c1356k.f12441d, c1356k.f12444g);
        }
        if (interfaceC2105k instanceof C1456i) {
            return ((C1456i) interfaceC2105k).f12783E;
        }
        return null;
    }

    public final ArrayList b(List list, List list2, AbstractC0615l abstractC0615l, int i7) {
        C1365t c1365t = this;
        C1356k c1356k = c1365t.a;
        InterfaceC2105k interfaceC2105k = c1356k.f12440c;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor", interfaceC2105k);
        InterfaceC2096b interfaceC2096b = (InterfaceC2096b) interfaceC2105k;
        InterfaceC2105k interfaceC2105kK = interfaceC2096b.k();
        kotlin.jvm.internal.l.e("getContainingDeclaration(...)", interfaceC2105kK);
        AbstractC1368w abstractC1368wA = c1365t.a(interfaceC2105kK);
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        for (Object obj : list) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                P3.r.X();
                throw null;
            }
            U u5 = (U) obj;
            c0 c0Var = (c0) P3.q.u0(i8, list2);
            C2295v c2295vE = Z4.l.e(interfaceC2096b, c1356k.f12445h.g(u5), null, (abstractC1368wA == null || !T4.e.f9083c.c((c0Var == null || (c0Var.f8398m & 1) != 1) ? 0 : c0Var.f8399n).booleanValue()) ? C2159g.a : new C1469v(c1356k.a.a, new C1364s(c1365t, abstractC1368wA, abstractC0615l, i7, i8, c0Var, 1)), i8);
            if (c2295vE != null) {
                arrayList.add(c2295vE);
            }
            c1365t = this;
            i8 = i9;
        }
        return arrayList;
    }

    public final v4.h c(AbstractC0615l abstractC0615l, int i7, int i8) {
        return !T4.e.f9083c.c(i7).booleanValue() ? C2159g.a : new C1469v(this.a.a.a, new C1362q(this, abstractC0615l, i8, 0));
    }

    public final v4.h d(J j7, boolean z7) {
        return !T4.e.f9083c.c(j7.f8213n).booleanValue() ? C2159g.a : new C1469v(this.a.a.a, new C1363r(this, z7, j7));
    }

    public final C1450c e(C0583n c0583n, boolean z7) {
        C1356k c1356k = this.a;
        InterfaceC2105k interfaceC2105k = c1356k.f12440c;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", interfaceC2105k);
        InterfaceC2099e interfaceC2099e = (InterfaceC2099e) interfaceC2105k;
        C1450c c1450c = new C1450c(interfaceC2099e, null, c(c0583n, c0583n.f8576n, 1), z7, 1, c0583n, c1356k.f12439b, c1356k.f12441d, c1356k.f12442e, c1356k.f12444g, null);
        C1356k c1356kA = c1356k.a(c1450c, P3.y.f7779k, c1356k.f12439b, c1356k.f12441d, c1356k.f12442e, c1356k.f12443f);
        List list = c0583n.f8577o;
        kotlin.jvm.internal.l.e("getValueParameterList(...)", list);
        c1450c.b1(c1356kA.f12446i.h(list, c0583n, 1), AbstractC0871d.O((i0) T4.e.f9084d.c(c0583n.f8576n)));
        c1450c.X0(interfaceC2099e.g());
        c1450c.f17482B = interfaceC2099e.Q();
        c1450c.f17486F = !T4.e.f9095o.c(c0583n.f8576n).booleanValue();
        return c1450c;
    }

    public final C1466s f(R4.B b4) {
        int i7;
        AbstractC1586x abstractC1586xG;
        kotlin.jvm.internal.l.f("proto", b4);
        int i8 = 1;
        if ((b4.f8128m & 1) == 1) {
            i7 = b4.f8129n;
        } else {
            int i9 = b4.f8130o;
            i7 = ((i9 >> 8) << 6) + (i9 & 63);
        }
        int i10 = i7;
        v4.h hVarC = c(b4, i10, 1);
        int i11 = b4.f8128m;
        int i12 = i11 & 32;
        C1356k c1356k = this.a;
        v4.h c1448a = (i12 == 32 || (i11 & 64) == 64) ? new C1448a(c1356k.a.a, new C1362q(this, b4, i8, 1)) : C2159g.a;
        W4.c cVarG = d5.e.g(c1356k.f12440c);
        int i13 = b4.f8131p;
        T4.g gVar = c1356k.f12439b;
        T4.k kVar = cVarG.a(AbstractC0870c.U(gVar, i13)).equals(z.a) ? T4.k.f9115b : c1356k.f12442e;
        W4.e eVarU = AbstractC0870c.U(gVar, b4.f8131p);
        int iL0 = AbstractC0871d.l0((R4.C) T4.e.f9096p.c(i10));
        T4.i iVar = c1356k.f12441d;
        v4.h hVar = c1448a;
        C1466s c1466s = new C1466s(c1356k.f12440c, null, hVarC, eVarU, iL0, b4, c1356k.f12439b, iVar, kVar, c1356k.f12444g, null);
        List list = b4.f8134s;
        kotlin.jvm.internal.l.e("getTypeParameterList(...)", list);
        C1356k c1356kA = c1356k.a(c1466s, list, c1356k.f12439b, c1356k.f12441d, c1356k.f12442e, c1356k.f12443f);
        U uO = F.O(b4, iVar);
        C1344D c1344d = c1356kA.f12445h;
        C2295v c2295vK = (uO == null || (abstractC1586xG = c1344d.g(uO)) == null) ? null : Z4.l.k(c1466s, abstractC1586xG, hVar);
        InterfaceC2105k interfaceC2105k = c1356k.f12440c;
        InterfaceC2099e interfaceC2099e = interfaceC2105k instanceof InterfaceC2099e ? (InterfaceC2099e) interfaceC2105k : null;
        C2295v c2295vR0 = interfaceC2099e != null ? interfaceC2099e.r0() : null;
        List listM = F.m(b4, iVar);
        List list2 = b4.f8140y;
        kotlin.jvm.internal.l.e("getContextParameterList(...)", list2);
        C1365t c1365t = c1356kA.f12446i;
        ArrayList arrayListB = c1365t.b(listM, list2, b4, 1);
        List listB = c1344d.b();
        List list3 = b4.f8141z;
        kotlin.jvm.internal.l.e("getValueParameterList(...)", list3);
        c1466s.b1(c2295vK, c2295vR0, arrayListB, listB, c1365t.h(list3, b4, 1), c1344d.g(F.S(b4, iVar)), C1355j.f((R4.D) T4.e.f9085e.c(i10)), AbstractC0871d.O((i0) T4.e.f9084d.c(i10)), P3.z.f7780k);
        c1466s.f17500w = T4.e.f9097q.c(i10).booleanValue();
        c1466s.f17501x = T4.e.f9098r.c(i10).booleanValue();
        c1466s.f17502y = T4.e.f9101u.c(i10).booleanValue();
        c1466s.f17503z = T4.e.f9099s.c(i10).booleanValue();
        c1466s.f17481A = T4.e.f9100t.c(i10).booleanValue();
        c1466s.f17485E = T4.e.f9102v.c(i10).booleanValue();
        c1466s.f17482B = T4.e.f9103w.c(i10).booleanValue();
        c1466s.f17486F = !T4.e.f9104x.c(i10).booleanValue();
        c1356k.a.f12425m.getClass();
        return c1466s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014f  */
    /* JADX WARN: Type inference failed for: r5v10, types: [u4.e] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l5.C1465r g(R4.J r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.C1365t.g(R4.J, boolean):l5.r");
    }

    public final List h(List list, AbstractC0615l abstractC0615l, int i7) {
        C1365t c1365t = this;
        C1356k c1356k = c1365t.a;
        InterfaceC2105k interfaceC2105k = c1356k.f12440c;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor", interfaceC2105k);
        InterfaceC2096b interfaceC2096b = (InterfaceC2096b) interfaceC2105k;
        InterfaceC2105k interfaceC2105kK = interfaceC2096b.k();
        kotlin.jvm.internal.l.e("getContainingDeclaration(...)", interfaceC2105kK);
        AbstractC1368w abstractC1368wA = c1365t.a(interfaceC2105kK);
        ArrayList arrayList = new ArrayList(P3.r.p(list, 10));
        int i8 = 0;
        for (Object obj : list) {
            int i9 = i8 + 1;
            AbstractC1586x abstractC1586xG = null;
            if (i8 < 0) {
                P3.r.X();
                throw null;
            }
            c0 c0Var = (c0) obj;
            int i10 = (c0Var.f8398m & 1) == 1 ? c0Var.f8399n : 0;
            v4.h c1469v = (abstractC1368wA == null || !T4.e.f9083c.c(i10).booleanValue()) ? C2159g.a : new C1469v(c1356k.a.a, new C1364s(c1365t, abstractC1368wA, abstractC0615l, i7, i8, c0Var, 0));
            W4.e eVarU = AbstractC0870c.U(c1356k.f12439b, c0Var.f8400o);
            T4.i iVar = c1356k.f12441d;
            U uI0 = F.i0(c0Var, iVar);
            C1344D c1344d = c1356k.f12445h;
            AbstractC1586x abstractC1586xG2 = c1344d.g(uI0);
            boolean zBooleanValue = T4.e.f9075H.c(i10).booleanValue();
            boolean zBooleanValue2 = T4.e.I.c(i10).booleanValue();
            boolean zBooleanValue3 = T4.e.J.c(i10).booleanValue();
            U uL0 = F.l0(c0Var, iVar);
            if (uL0 != null) {
                abstractC1586xG = c1344d.g(uL0);
            }
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new C2272S(interfaceC2096b, null, i8, c1469v, eVarU, abstractC1586xG2, zBooleanValue, zBooleanValue2, zBooleanValue3, abstractC1586xG, M.f16295i));
            arrayList = arrayList2;
            i8 = i9;
            c1365t = this;
        }
        return P3.q.S0(arrayList);
    }
}
