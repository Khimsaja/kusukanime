package L4;

import e4.InterfaceC0821a;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class w implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6137k;

    /* renamed from: l, reason: collision with root package name */
    public final z f6138l;

    public /* synthetic */ w(z zVar, int i7) {
        this.f6137k = i7;
        this.f6138l = zVar;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f6137k) {
            case 0:
                g5.f fVar = g5.f.f11736m;
                g5.o.a.getClass();
                g5.l lVar = g5.l.f11754l;
                z zVar = this.f6138l;
                zVar.getClass();
                kotlin.jvm.internal.l.f("kindFilter", fVar);
                C4.c cVar = C4.c.f962n;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (fVar.a(g5.f.f11735l)) {
                    for (W4.e eVar : zVar.h(fVar, lVar)) {
                        lVar.invoke(eVar);
                        w5.k.a(linkedHashSet, zVar.b(eVar, cVar));
                    }
                }
                boolean zA = fVar.a(g5.f.f11732i);
                List list = fVar.a;
                if (zA && !list.contains(g5.b.a)) {
                    for (W4.e eVar2 : zVar.i(fVar, lVar)) {
                        lVar.invoke(eVar2);
                        linkedHashSet.addAll(zVar.f(eVar2, cVar));
                    }
                }
                if (fVar.a(g5.f.f11733j) && !list.contains(g5.b.a)) {
                    for (W4.e eVar3 : zVar.o(fVar)) {
                        lVar.invoke(eVar3);
                        linkedHashSet.addAll(zVar.a(eVar3, cVar));
                    }
                }
                return P3.q.S0(linkedHashSet);
            case 1:
                return this.f6138l.k();
            case 2:
                return this.f6138l.i(g5.f.f11739p, null);
            case 3:
                return this.f6138l.o(g5.f.f11740q);
            default:
                return this.f6138l.h(g5.f.f11738o, null);
        }
    }
}
