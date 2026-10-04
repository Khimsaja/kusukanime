package L4;

import A4.C0010c;
import P3.F;
import P3.J;
import e4.InterfaceC0821a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6098k;

    /* renamed from: l, reason: collision with root package name */
    public final o f6099l;

    public /* synthetic */ k(o oVar, int i7) {
        this.f6098k = i7;
        this.f6099l = oVar;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f6098k) {
            case 0:
                Class<?>[] declaredClasses = this.f6099l.f6113o.a.getDeclaredClasses();
                kotlin.jvm.internal.l.e("getDeclaredClasses(...)", declaredClasses);
                return P3.q.X0(y5.k.W(y5.k.V(new y5.f(P3.m.Q(declaredClasses), false, C0010c.f216n), C0010c.f217o)));
            case 1:
                List listB = this.f6099l.f6113o.b();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listB) {
                    if (((A4.v) obj).a.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int I = F.I(P3.r.p(arrayList, 10));
                if (I < 16) {
                    I = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(I);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(((A4.v) next).c(), next);
                }
                return linkedHashMap;
            default:
                o oVar = this.f6099l;
                return J.T(oVar.c(), oVar.d());
        }
    }
}
