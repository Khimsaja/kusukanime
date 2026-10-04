package t4;

import e5.AbstractC0832b;
import java.util.ArrayList;
import java.util.List;
import k5.C1399c;
import u4.InterfaceC2118y;
import x4.C2297x;

/* renamed from: t4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2055f implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public static final C2055f f16051k = new C2055f();

    @Override // e4.k
    public final Object invoke(Object obj) {
        InterfaceC2118y interfaceC2118y = (InterfaceC2118y) obj;
        C2054e c2054e = C2056g.f16052d;
        kotlin.jvm.internal.l.f("module", interfaceC2118y);
        List list = (List) AbstractC0832b.u(((C2297x) interfaceC2118y.F(C2056g.f16054f)).f17512o, C2297x.f17509r[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof C1399c) {
                arrayList.add(obj2);
            }
        }
        return (C1399c) P3.q.r0(arrayList);
    }
}
