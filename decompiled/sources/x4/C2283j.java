package x4;

import b1.AbstractC0703b;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import n5.V;
import u4.EnumC2117x;
import u4.InterfaceC2097c;
import u4.InterfaceC2099e;
import u4.InterfaceC2104j;
import u4.InterfaceC2105k;
import u4.InterfaceC2112s;

/* renamed from: x4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2283j extends AbstractC2294u implements InterfaceC2104j {

    /* renamed from: N, reason: collision with root package name */
    public final boolean f17435N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2283j(InterfaceC2099e interfaceC2099e, InterfaceC2104j interfaceC2104j, v4.h hVar, boolean z7, int i7, u4.M m7) {
        super(i7, W4.g.f9630e, interfaceC2099e, interfaceC2104j, m7, hVar);
        if (interfaceC2099e == null) {
            s0(0);
            throw null;
        }
        if (hVar == null) {
            s0(1);
            throw null;
        }
        if (i7 == 0) {
            s0(2);
            throw null;
        }
        if (m7 == null) {
            s0(3);
            throw null;
        }
        this.f17435N = z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void s0(int r8) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C2283j.s0(int):void");
    }

    @Override // u4.InterfaceC2104j
    public final boolean B() {
        return this.f17435N;
    }

    @Override // u4.InterfaceC2104j
    public final InterfaceC2099e C() {
        InterfaceC2099e interfaceC2099eK = k();
        if (interfaceC2099eK != null) {
            return interfaceC2099eK;
        }
        s0(18);
        throw null;
    }

    @Override // x4.AbstractC2294u, u4.InterfaceC2097c
    public final void W(Collection collection) {
        if (collection != null) {
            return;
        }
        s0(22);
        throw null;
    }

    @Override // x4.AbstractC2294u
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public C2283j P0(int i7, W4.e eVar, InterfaceC2105k interfaceC2105k, InterfaceC2112s interfaceC2112s, u4.M m7, v4.h hVar) {
        if (interfaceC2105k == null) {
            s0(23);
            throw null;
        }
        if (i7 == 0) {
            s0(24);
            throw null;
        }
        if (hVar == null) {
            s0(25);
            throw null;
        }
        if (i7 == 1 || i7 == 4) {
            return new C2283j((InterfaceC2099e) interfaceC2105k, this, hVar, this.f17435N, 1, m7);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC2105k + "\nkind: " + AbstractC0703b.B(i7));
    }

    @Override // x4.AbstractC2288o, u4.InterfaceC2105k
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2099e k() {
        InterfaceC2099e interfaceC2099e = (InterfaceC2099e) super.k();
        if (interfaceC2099e != null) {
            return interfaceC2099e;
        }
        s0(17);
        throw null;
    }

    @Override // x4.AbstractC2294u, x4.AbstractC2288o, x4.AbstractC2287n, u4.InterfaceC2105k
    /* renamed from: a1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C2283j a() {
        C2283j c2283j = (C2283j) super.a();
        if (c2283j != null) {
            return c2283j;
        }
        s0(19);
        throw null;
    }

    public final void b1(List list, H4.o oVar) {
        if (list == null) {
            s0(13);
            throw null;
        }
        if (oVar != null) {
            c1(list, oVar, k().n());
        } else {
            s0(14);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c1(java.util.List r12, H4.o r13, java.util.List r14) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L61
            if (r13 == 0) goto L5b
            if (r14 == 0) goto L55
            u4.e r1 = r11.k()
            boolean r2 = r1.j()
            if (r2 == 0) goto L21
            u4.k r1 = r1.k()
            boolean r2 = r1 instanceof u4.InterfaceC2099e
            if (r2 == 0) goto L21
            u4.e r1 = (u4.InterfaceC2099e) r1
            x4.v r1 = r1.r0()
            r4 = r1
            goto L22
        L21:
            r4 = r0
        L22:
            u4.e r1 = r11.k()
            java.util.List r2 = r1.l0()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L3e
            java.util.List r1 = r1.l0()
            if (r1 == 0) goto L38
        L36:
            r5 = r1
            goto L43
        L38:
            r12 = 15
            s0(r12)
            throw r0
        L3e:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            if (r1 == 0) goto L4f
            goto L36
        L43:
            u4.x r9 = u4.EnumC2117x.f16342l
            r3 = 0
            r8 = 0
            r2 = r11
            r7 = r12
            r10 = r13
            r6 = r14
            r2.S0(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L4f:
            r12 = 16
            s0(r12)
            throw r0
        L55:
            r12 = 12
            s0(r12)
            throw r0
        L5b:
            r12 = 11
            s0(r12)
            throw r0
        L61:
            r12 = 10
            s0(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C2283j.c1(java.util.List, H4.o, java.util.List):void");
    }

    @Override // x4.AbstractC2294u, u4.InterfaceC2112s, u4.O
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public final C2283j b(V v5) {
        if (v5 != null) {
            return (C2283j) super.b(v5);
        }
        s0(20);
        throw null;
    }

    @Override // x4.AbstractC2294u, u4.InterfaceC2097c, u4.InterfaceC2096b
    public final Collection m() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        s0(21);
        throw null;
    }

    @Override // x4.AbstractC2294u, u4.InterfaceC2105k
    public final Object u(X4.y yVar, Object obj) {
        return yVar.I(this, obj);
    }

    @Override // x4.AbstractC2294u, u4.InterfaceC2097c
    public final InterfaceC2097c z(InterfaceC2099e interfaceC2099e, EnumC2117x enumC2117x, H4.o oVar) {
        return (C2283j) N0(interfaceC2099e, enumC2117x, oVar);
    }
}
