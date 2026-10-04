package L4;

import e4.InterfaceC0821a;
import java.util.ArrayList;
import java.util.Iterator;
import u4.AbstractC2115v;
import u4.Q;

/* loaded from: classes.dex */
public final class g implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6074k;

    /* renamed from: l, reason: collision with root package name */
    public final i f6075l;

    public /* synthetic */ g(i iVar, int i7) {
        this.f6074k = i7;
        this.f6075l = iVar;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f6074k) {
            case 0:
                i iVar = this.f6075l;
                if (d5.e.f(iVar) == null) {
                    return null;
                }
                ((K4.a) iVar.f6085q.f110l).f4721w.getClass();
                return null;
            case 1:
                i iVar2 = this.f6075l;
                ArrayList typeParameters = iVar2.f6086r.getTypeParameters();
                ArrayList arrayList = new ArrayList(P3.r.p(typeParameters, 10));
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    A4.D d4 = (A4.D) it.next();
                    Q qA = ((K4.e) iVar2.f6088t.f111m).a(d4);
                    if (qA == null) {
                        throw new AssertionError("Parameter " + d4 + " surely belongs to class " + iVar2.f6086r + ", so it must be resolved");
                    }
                    arrayList.add(qA);
                }
                return arrayList;
            default:
                return AbstractC2115v.c(this.f6075l);
        }
    }
}
