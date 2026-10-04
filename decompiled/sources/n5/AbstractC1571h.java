package n5;

import l4.InterfaceC1425d;
import l4.InterfaceC1443v;
import v4.C2159g;

/* renamed from: n5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1571h {
    public static final /* synthetic */ InterfaceC1443v[] a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1.m f13398b;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r(AbstractC1571h.class, "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;", 1);
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
        a = new InterfaceC1443v[]{zVar.h(rVar)};
        L2.e eVar = I.f13362l;
        InterfaceC1425d interfaceC1425dB = zVar.b(C1570g.class);
        eVar.getClass();
        String strK = interfaceC1425dB.k();
        kotlin.jvm.internal.l.c(strK);
        f13398b = new C1.m(eVar.j1(strK));
    }

    public static final v4.h a(I i7) {
        v4.h hVar;
        kotlin.jvm.internal.l.f("<this>", i7);
        C1570g c1570g = (C1570g) f13398b.getValue(i7, a[0]);
        return (c1570g == null || (hVar = c1570g.a) == null) ? C2159g.a : hVar;
    }
}
