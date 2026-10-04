package l5;

import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import f6.AbstractC0915m;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.y;
import l4.InterfaceC1443v;
import m5.C1520i;
import m5.C1523l;
import v4.InterfaceC2154b;

/* renamed from: l5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1448a implements v4.h {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f12760l = {y.a.h(new kotlin.jvm.internal.r(C1448a.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* renamed from: k, reason: collision with root package name */
    public final C1520i f12761k;

    public C1448a(C1523l c1523l, InterfaceC0821a interfaceC0821a) {
        kotlin.jvm.internal.l.f("storageManager", c1523l);
        this.f12761k = new C1520i(c1523l, interfaceC0821a);
    }

    @Override // v4.h
    public final /* bridge */ boolean d(W4.c cVar) {
        return AbstractC0915m.x(this, cVar);
    }

    @Override // v4.h
    public boolean isEmpty() {
        return ((List) AbstractC0832b.u(this.f12761k, f12760l[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((List) AbstractC0832b.u(this.f12761k, f12760l[0])).iterator();
    }

    @Override // v4.h
    public final /* bridge */ InterfaceC2154b l(W4.c cVar) {
        return AbstractC0915m.p(this, cVar);
    }
}
