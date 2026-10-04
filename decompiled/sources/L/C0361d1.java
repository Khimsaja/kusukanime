package L;

import e4.InterfaceC0821a;
import java.io.Serializable;
import java.util.List;
import l4.InterfaceC1443v;
import v.AbstractC2136o;
import v.C2138q;
import w0.AbstractC2182Q;
import w0.InterfaceC2172G;
import w0.InterfaceC2175J;

/* renamed from: L.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0361d1 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5497l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f5498m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f5499n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f5500o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Serializable f5501p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f5502q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f5503r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0361d1(Object obj, Object obj2, Object obj3, Serializable serializable, Object obj4, Object obj5, int i7) {
        super(1);
        this.f5497l = i7;
        this.f5498m = obj;
        this.f5499n = obj2;
        this.f5500o = obj3;
        this.f5501p = serializable;
        this.f5502q = obj4;
        this.f5503r = obj5;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.Map] */
    @Override // e4.k
    public final Object invoke(Object obj) {
        O3.C c2 = O3.C.a;
        Object obj2 = this.f5503r;
        Object obj3 = this.f5502q;
        Serializable serializable = this.f5501p;
        Object obj4 = this.f5500o;
        Object obj5 = this.f5499n;
        int i7 = 0;
        Object obj6 = this.f5498m;
        switch (this.f5497l) {
            case 0:
                F0.i iVar = (F0.i) obj;
                C0349a1 c0349a1 = new C0349a1((InterfaceC0821a) obj3, i7);
                InterfaceC1443v[] interfaceC1443vArr = F0.s.a;
                iVar.j(F0.h.f2089t, new F0.a((String) obj5, c0349a1));
                C0390k2 c0390k2 = (C0390k2) obj6;
                EnumC0394l2 enumC0394l2 = (EnumC0394l2) c0390k2.f5637b.f6337g.getValue();
                EnumC0394l2 enumC0394l22 = EnumC0394l2.f5651m;
                M5.c cVar = (M5.c) obj2;
                if (enumC0394l2 != enumC0394l22) {
                    if (c0390k2.f5637b.d().a.containsKey(enumC0394l22)) {
                        iVar.j(F0.h.f2088s, new F0.a((String) serializable, new A.m(6, c0390k2, cVar)));
                        break;
                    }
                } else {
                    iVar.j(F0.h.f2087r, new F0.a((String) obj4, new A.j(c0390k2, cVar, c0390k2, 2)));
                    break;
                }
                break;
            default:
                AbstractC2182Q abstractC2182Q = (AbstractC2182Q) obj;
                w0.S[] sArr = (w0.S[]) obj6;
                int length = sArr.length;
                int i8 = 0;
                while (i7 < length) {
                    w0.S s7 = sArr[i7];
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.layout.Placeable", s7);
                    AbstractC2136o.b(abstractC2182Q, s7, (InterfaceC2172G) ((List) obj5).get(i8), ((InterfaceC2175J) obj4).getLayoutDirection(), ((kotlin.jvm.internal.v) serializable).f12718k, ((kotlin.jvm.internal.v) obj3).f12718k, ((C2138q) obj2).a);
                    i7++;
                    i8++;
                }
                break;
        }
        return c2;
    }
}
