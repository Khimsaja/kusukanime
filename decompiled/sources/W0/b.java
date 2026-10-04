package W0;

import O3.C;
import i1.AbstractC1067u;
import java.util.HashMap;
import y0.C2349D;
import y0.e0;
import z0.C2456m;
import z0.C2471u;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9519l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f9520m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2349D f9521n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(q qVar, C2349D c2349d, int i7) {
        super(1);
        this.f9519l = i7;
        this.f9520m = qVar;
        this.f9521n = c2349d;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f9519l) {
            case 0:
                e0 e0Var = (e0) obj;
                C2471u c2471u = e0Var instanceof C2471u ? (C2471u) e0Var : null;
                q qVar = this.f9520m;
                if (c2471u != null) {
                    HashMap<i, C2349D> holderToLayoutNode = c2471u.getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
                    C2349D c2349d = this.f9521n;
                    holderToLayoutNode.put(qVar, c2349d);
                    c2471u.getAndroidViewsHandler$ui_release().addView(qVar);
                    c2471u.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(c2349d, qVar);
                    qVar.setImportantForAccessibility(1);
                    AbstractC1067u.b(qVar, new C2456m(c2471u, c2349d, c2471u));
                }
                if (qVar.getView().getParent() != qVar) {
                    qVar.addView(qVar.getView());
                }
                break;
            case 1:
                k.d(this.f9520m, this.f9521n);
                break;
            default:
                q qVar2 = this.f9520m;
                k.d(qVar2, this.f9521n);
                ((C2471u) qVar2.f9546m).f18852E = true;
                break;
        }
        return C.a;
    }
}
