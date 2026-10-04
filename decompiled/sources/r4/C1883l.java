package r4;

import e4.InterfaceC0821a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t4.C2058i;
import u4.InterfaceC2091G;
import x4.C2255A;
import x4.C2286m;
import x4.C2297x;

/* renamed from: r4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1883l implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14957k;

    /* renamed from: l, reason: collision with root package name */
    public final C2255A f14958l;

    public /* synthetic */ C1883l(C2255A c2255a, int i7) {
        this.f14957k = i7;
        this.f14958l = c2255a;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f14957k) {
            case 0:
                return ((C2297x) this.f14958l.F(AbstractC1887p.f15026i)).f17514q;
            case 1:
                return new C2058i(this.f14958l);
            default:
                C2255A c2255a = this.f14958l;
                T4.i iVar = c2255a.f17342q;
                if (iVar == null) {
                    StringBuilder sb = new StringBuilder("Dependencies of module ");
                    String str = c2255a.getName().f9624k;
                    kotlin.jvm.internal.l.e("toString(...)", str);
                    sb.append(str);
                    sb.append(" were not set before querying module content");
                    throw new AssertionError(sb.toString());
                }
                c2255a.M0();
                List list = iVar.f9111k;
                list.contains(c2255a);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C2255A) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(P3.r.p(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC2091G interfaceC2091G = ((C2255A) it2.next()).f17343r;
                    kotlin.jvm.internal.l.c(interfaceC2091G);
                    arrayList.add(interfaceC2091G);
                }
                return new C2286m("CompositeProvider@ModuleDescriptor for " + c2255a.getName(), arrayList);
        }
    }
}
