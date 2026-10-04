package j5;

import java.util.List;
import u4.InterfaceC2105k;

/* renamed from: j5.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1356k {
    public final C1354i a;

    /* renamed from: b, reason: collision with root package name */
    public final T4.g f12439b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2105k f12440c;

    /* renamed from: d, reason: collision with root package name */
    public final T4.i f12441d;

    /* renamed from: e, reason: collision with root package name */
    public final T4.k f12442e;

    /* renamed from: f, reason: collision with root package name */
    public final T4.a f12443f;

    /* renamed from: g, reason: collision with root package name */
    public final P4.g f12444g;

    /* renamed from: h, reason: collision with root package name */
    public final C1344D f12445h;

    /* renamed from: i, reason: collision with root package name */
    public final C1365t f12446i;

    public C1356k(C1354i c1354i, T4.g gVar, InterfaceC2105k interfaceC2105k, T4.i iVar, T4.k kVar, T4.a aVar, P4.g gVar2, C1344D c1344d, List list) {
        String strJ;
        kotlin.jvm.internal.l.f("components", c1354i);
        kotlin.jvm.internal.l.f("nameResolver", gVar);
        kotlin.jvm.internal.l.f("containingDeclaration", interfaceC2105k);
        kotlin.jvm.internal.l.f("versionRequirementTable", kVar);
        kotlin.jvm.internal.l.f("metadataVersion", aVar);
        kotlin.jvm.internal.l.f("typeParameters", list);
        this.a = c1354i;
        this.f12439b = gVar;
        this.f12440c = interfaceC2105k;
        this.f12441d = iVar;
        this.f12442e = kVar;
        this.f12443f = aVar;
        this.f12444g = gVar2;
        this.f12445h = new C1344D(this, c1344d, list, "Deserializer for \"" + interfaceC2105k.getName() + '\"', (gVar2 == null || (strJ = A6.b.j(new StringBuilder("Class '"), gVar2.a().a().a.a, '\'')) == null) ? "[container not found]" : strJ);
        this.f12446i = new C1365t(this);
    }

    public final C1356k a(InterfaceC2105k interfaceC2105k, List list, T4.g gVar, T4.i iVar, T4.k kVar, T4.a aVar) {
        kotlin.jvm.internal.l.f("typeParameterProtos", list);
        kotlin.jvm.internal.l.f("nameResolver", gVar);
        kotlin.jvm.internal.l.f("versionRequirementTable", kVar);
        kotlin.jvm.internal.l.f("metadataVersion", aVar);
        int i7 = aVar.f9062b;
        if ((i7 != 1 || aVar.f9063c < 4) && i7 <= 1) {
            kVar = this.f12442e;
        }
        return new C1356k(this.a, gVar, interfaceC2105k, iVar, kVar, aVar, this.f12444g, this.f12445h, list);
    }
}
