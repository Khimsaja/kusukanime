package u4;

import java.util.List;
import m5.C1516e;
import m5.C1523l;

/* renamed from: u4.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2085A implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16283k;

    /* renamed from: l, reason: collision with root package name */
    public final A2.b f16284l;

    public /* synthetic */ C2085A(A2.b bVar, int i7) {
        this.f16283k = i7;
        this.f16284l = bVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f16283k) {
            case 0:
                W4.c cVar = (W4.c) obj;
                kotlin.jvm.internal.l.f("fqName", cVar);
                return new t4.n((InterfaceC2118y) this.f16284l.f111m, cVar, 1);
            default:
                C2086B c2086b = (C2086B) obj;
                kotlin.jvm.internal.l.f("<destruct>", c2086b);
                W4.b bVar = c2086b.a;
                if (bVar.f9617c) {
                    throw new UnsupportedOperationException("Unresolved local class: " + bVar);
                }
                W4.b bVarE = bVar.e();
                List list = c2086b.f16285b;
                A2.b bVar2 = this.f16284l;
                InterfaceC2101g interfaceC2101gT = bVarE != null ? bVar2.t(bVarE, P3.q.o0(list, 1)) : (InterfaceC2101g) ((C1516e) bVar2.f112n).invoke(bVar.a);
                boolean zG = bVar.g();
                C1523l c1523l = (C1523l) bVar2.f110l;
                W4.e eVarF = bVar.f();
                Integer num = (Integer) P3.q.t0(list);
                return new C2087C(c1523l, interfaceC2101gT, eVarF, zG, num != null ? num.intValue() : 0);
        }
    }
}
