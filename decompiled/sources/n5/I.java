package n5;

import java.util.Iterator;
import java.util.List;
import t5.AbstractC2061a;

/* loaded from: classes.dex */
public final class I extends t5.d {

    /* renamed from: l, reason: collision with root package name */
    public static final L2.e f13362l = new L2.e(29);

    /* renamed from: m, reason: collision with root package name */
    public static final I f13363m = new I(P3.y.f7779k);

    public I(List list) {
        this.f16095k = t5.k.f16112k;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1570g c1570g = (C1570g) it.next();
            c1570g.getClass();
            String strK = kotlin.jvm.internal.y.a.b(C1570g.class).k();
            kotlin.jvm.internal.l.c(strK);
            int iJ1 = f13362l.j1(strK);
            int iA = this.f16095k.a();
            if (iA != 0) {
                if (iA == 1) {
                    AbstractC2061a abstractC2061a = this.f16095k;
                    try {
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>", abstractC2061a);
                        t5.p pVar = (t5.p) abstractC2061a;
                        int i7 = pVar.f16120l;
                        if (i7 == iJ1) {
                            this.f16095k = new t5.p(iJ1, c1570g);
                        } else {
                            t5.c cVar = new t5.c();
                            cVar.f16093k = new Object[20];
                            cVar.f16094l = 0;
                            cVar.h(i7, pVar.f16119k);
                            this.f16095k = cVar;
                        }
                    } catch (ClassCastException e7) {
                        throw new IllegalStateException(t5.d.a(abstractC2061a, 1, "OneElementArrayMap"), e7);
                    }
                }
                this.f16095k.h(iJ1, c1570g);
            } else {
                AbstractC2061a abstractC2061a2 = this.f16095k;
                if (!(abstractC2061a2 instanceof t5.k)) {
                    throw new IllegalStateException(t5.d.a(abstractC2061a2, 0, "EmptyArrayMap"));
                }
                this.f16095k = new t5.p(iJ1, c1570g);
            }
        }
    }
}
