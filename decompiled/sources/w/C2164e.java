package w;

import M0.G;
import M0.H;
import O.C0510p;
import O3.C;
import android.graphics.Typeface;
import x.C2235i;

/* renamed from: w.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2164e extends kotlin.jvm.internal.m implements e4.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f16695l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f16696m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2164e(int i7, Object obj) {
        super(4);
        this.f16695l = i7;
        this.f16696m = obj;
    }

    @Override // e4.p
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f16695l) {
            case 0:
                C2160a c2160a = (C2160a) obj;
                ((Number) obj2).intValue();
                C0510p c0510p = (C0510p) obj3;
                int iIntValue = ((Number) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c0510p.f(c2160a) ? 4 : 2;
                }
                if ((iIntValue & 131) == 130 && c0510p.y()) {
                    c0510p.M();
                } else {
                    ((W.a) this.f16696m).invoke(c2160a, c0510p, Integer.valueOf(iIntValue & 14));
                }
                return C.a;
            case 1:
                C2235i c2235i = (C2235i) obj;
                ((Number) obj2).intValue();
                C0510p c0510p2 = (C0510p) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c0510p2.f(c2235i) ? 4 : 2;
                }
                if ((iIntValue2 & 131) == 130 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    ((W.a) this.f16696m).invoke(c2235i, c0510p2, Integer.valueOf(iIntValue2 & 14));
                }
                return C.a;
            default:
                int i7 = ((M0.q) obj3).a;
                int i8 = ((M0.r) obj4).a;
                P0.c cVar = (P0.c) this.f16696m;
                H hB = ((M0.k) cVar.f7696o).b((M0.j) obj, (M0.u) obj2, i7, i8);
                if (hB instanceof G) {
                    Object obj5 = ((G) hB).f6382k;
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.graphics.Typeface", obj5);
                    return (Typeface) obj5;
                }
                B2.l lVar = new B2.l(hB, cVar.f7701t);
                cVar.f7701t = lVar;
                Object obj6 = lVar.f418n;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.graphics.Typeface", obj6);
                return (Typeface) obj6;
        }
    }
}
