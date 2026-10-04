package o4;

import e4.InterfaceC0821a;
import f6.AbstractC0905c;
import io.ktor.util.GzipHeaderFlags;
import j5.C1354i;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import l4.InterfaceC1443v;
import u4.AbstractC2115v;
import u4.InterfaceC2099e;
import u4.InterfaceC2104j;
import u4.InterfaceC2118y;
import z4.C2491c;
import z4.C2494f;

/* renamed from: o4.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1695u implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13758k;

    /* renamed from: l, reason: collision with root package name */
    public final C1649C f13759l;

    public /* synthetic */ C1695u(C1649C c1649c, int i7) {
        this.f13758k = i7;
        this.f13759l = c1649c;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [O3.i, java.lang.Object] */
    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        C1649C c1649c = this.f13759l;
        switch (this.f13758k) {
            case 0:
                return new C1700z(c1649c);
            case 1:
                return c1649c.r(c1649c.getDescriptor().g().k0(), EnumC1652F.f13633k);
            case 2:
                g5.o oVarC0 = c1649c.getDescriptor().c0();
                kotlin.jvm.internal.l.e("getStaticScope(...)", oVarC0);
                return c1649c.r(oVarC0, EnumC1652F.f13633k);
            case 3:
                return c1649c.r(c1649c.getDescriptor().g().k0(), EnumC1652F.f13634l);
            case GzipHeaderFlags.EXTRA /* 4 */:
                g5.o oVarC02 = c1649c.getDescriptor().c0();
                kotlin.jvm.internal.l.e("getStaticScope(...)", oVarC02);
                return c1649c.r(oVarC02, EnumC1652F.f13634l);
            case 5:
                HashSet hashSet = C1649C.f13627n;
                W4.b bVarA = c1649c.A();
                C1700z c1700z = (C1700z) c1649c.f13629m.getValue();
                c1700z.getClass();
                InterfaceC1443v interfaceC1443v = AbstractC1651E.f13632b[0];
                Object objInvoke = c1700z.a.invoke();
                kotlin.jvm.internal.l.e("getValue(...)", objInvoke);
                C2494f c2494f = (C2494f) objInvoke;
                C1354i c1354i = c2494f.a;
                InterfaceC2118y interfaceC2118y = c1354i.f12414b;
                boolean z7 = bVarA.f9617c;
                Class cls = c1649c.f13628l;
                InterfaceC2099e interfaceC2099eB = (z7 && cls.isAnnotationPresent(Metadata.class)) ? c1354i.b(bVarA) : AbstractC2115v.d(interfaceC2118y, bVarA);
                if (interfaceC2099eB != null) {
                    return interfaceC2099eB;
                }
                if (cls.isSynthetic()) {
                    return C1649C.z(bVarA, c2494f);
                }
                C2491c c2491cH = AbstractC0905c.h(cls);
                Q4.a aVar = c2491cH != null ? (Q4.a) c2491cH.f19031b.f8005c : null;
                switch (aVar == null ? -1 : AbstractC1647A.a[aVar.ordinal()]) {
                    case -1:
                    case 6:
                        throw new H5.C("Unresolved class: " + cls + " (kind = " + aVar + ')');
                    case 0:
                    default:
                        throw new D6.r();
                    case 1:
                    case 2:
                    case 3:
                    case GzipHeaderFlags.EXTRA /* 4 */:
                        return C1649C.z(bVarA, c2494f);
                    case 5:
                        throw new H5.C("Unknown class: " + cls + " (kind = " + aVar + ')');
                }
            case 6:
                Annotation[] annotations = c1649c.f13628l.getAnnotations();
                kotlin.jvm.internal.l.e("getAnnotations(...)", annotations);
                ArrayList arrayList = new ArrayList();
                for (Annotation annotation : annotations) {
                    if (!C1649C.f13627n.contains(n6.m.F(n6.m.B(annotation)).getName())) {
                        arrayList.add(annotation);
                    }
                }
                return F0.l(arrayList);
            case 7:
                if (c1649c.f13628l.isAnonymousClass()) {
                    return null;
                }
                W4.b bVarA2 = c1649c.A();
                if (bVarA2.f9617c) {
                    return null;
                }
                return bVarA2.a().a.a;
            default:
                Collection collectionH = c1649c.h();
                ArrayList arrayList2 = new ArrayList(P3.r.p(collectionH, 10));
                Iterator it = collectionH.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C1656J(c1649c, (InterfaceC2104j) it.next()));
                }
                return arrayList2;
        }
    }
}
