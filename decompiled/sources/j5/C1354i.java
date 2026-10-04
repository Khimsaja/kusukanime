package j5;

import X4.C0611h;
import java.util.List;
import java.util.Set;
import m5.C1523l;
import n5.C1574k;
import o5.C1710j;
import o5.C1712l;
import o5.InterfaceC1711k;
import u4.InterfaceC2088D;
import u4.InterfaceC2091G;
import u4.InterfaceC2099e;
import u4.InterfaceC2118y;
import w4.InterfaceC2212b;
import w4.InterfaceC2214d;

/* renamed from: j5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1354i {
    public final C1523l a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2118y f12414b;

    /* renamed from: c, reason: collision with root package name */
    public final C1355j f12415c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1350e f12416d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1346a f12417e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2091G f12418f;

    /* renamed from: g, reason: collision with root package name */
    public final C1355j f12419g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1358m f12420h;

    /* renamed from: i, reason: collision with root package name */
    public final C4.b f12421i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC1359n f12422j;

    /* renamed from: k, reason: collision with root package name */
    public final Iterable f12423k;

    /* renamed from: l, reason: collision with root package name */
    public final A2.b f12424l;

    /* renamed from: m, reason: collision with root package name */
    public final C1355j f12425m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC2212b f12426n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC2214d f12427o;

    /* renamed from: p, reason: collision with root package name */
    public final C0611h f12428p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC1711k f12429q;

    /* renamed from: r, reason: collision with root package name */
    public final List f12430r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC1357l f12431s;

    /* renamed from: t, reason: collision with root package name */
    public final C1352g f12432t;

    public C1354i(C1523l c1523l, InterfaceC2118y interfaceC2118y, InterfaceC1350e interfaceC1350e, InterfaceC1346a interfaceC1346a, InterfaceC2091G interfaceC2091G, InterfaceC1358m interfaceC1358m, InterfaceC1359n interfaceC1359n, Iterable iterable, A2.b bVar, InterfaceC2212b interfaceC2212b, InterfaceC2214d interfaceC2214d, C0611h c0611h, InterfaceC1711k interfaceC1711k, R1.i iVar, List list, InterfaceC1357l interfaceC1357l) {
        C1355j c1355j = C1355j.f12433l;
        C1355j c1355j2 = C1355j.f12437p;
        C4.b bVar2 = C4.b.a;
        C1355j c1355j3 = C1353h.a;
        kotlin.jvm.internal.l.f("moduleDescriptor", interfaceC2118y);
        kotlin.jvm.internal.l.f("extensionRegistryLite", c0611h);
        kotlin.jvm.internal.l.f("kotlinTypeChecker", interfaceC1711k);
        kotlin.jvm.internal.l.f("enumEntriesDeserializationSupport", interfaceC1357l);
        this.a = c1523l;
        this.f12414b = interfaceC2118y;
        this.f12415c = c1355j;
        this.f12416d = interfaceC1350e;
        this.f12417e = interfaceC1346a;
        this.f12418f = interfaceC2091G;
        this.f12419g = c1355j2;
        this.f12420h = interfaceC1358m;
        this.f12421i = bVar2;
        this.f12422j = interfaceC1359n;
        this.f12423k = iterable;
        this.f12424l = bVar;
        this.f12425m = c1355j3;
        this.f12426n = interfaceC2212b;
        this.f12427o = interfaceC2214d;
        this.f12428p = c0611h;
        this.f12429q = interfaceC1711k;
        this.f12430r = list;
        this.f12431s = interfaceC1357l;
        this.f12432t = new C1352g(this);
    }

    public final C1356k a(InterfaceC2088D interfaceC2088D, T4.g gVar, T4.i iVar, T4.k kVar, T4.a aVar, P4.g gVar2) {
        kotlin.jvm.internal.l.f("descriptor", interfaceC2088D);
        kotlin.jvm.internal.l.f("nameResolver", gVar);
        kotlin.jvm.internal.l.f("metadataVersion", aVar);
        return new C1356k(this, gVar, interfaceC2088D, iVar, kVar, aVar, gVar2, null, P3.y.f7779k);
    }

    public final InterfaceC2099e b(W4.b bVar) {
        kotlin.jvm.internal.l.f("classId", bVar);
        Set set = C1352g.f12412c;
        return this.f12432t.a(bVar, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1354i(C1523l c1523l, InterfaceC2118y interfaceC2118y, X4.y yVar, L2.e eVar, InterfaceC2091G interfaceC2091G, Iterable iterable, A2.b bVar, InterfaceC2212b interfaceC2212b, InterfaceC2214d interfaceC2214d, C0611h c0611h, C1712l c1712l, R1.i iVar, int i7) {
        C1712l c1712l2;
        C1355j c1355j = InterfaceC1358m.f12447g;
        C1355j c1355j2 = C1355j.f12435n;
        C1355j c1355j3 = C1355j.f12436o;
        if ((i7 & 65536) != 0) {
            InterfaceC1711k.f13810b.getClass();
            c1712l2 = C1710j.f13809b;
        } else {
            c1712l2 = c1712l;
        }
        this(c1523l, interfaceC2118y, yVar, eVar, interfaceC2091G, c1355j, c1355j2, iterable, bVar, interfaceC2212b, interfaceC2214d, c0611h, c1712l2, iVar, P3.r.H(C1574k.a), (i7 & 524288) != 0 ? C1355j.f12434m : c1355j3);
    }
}
