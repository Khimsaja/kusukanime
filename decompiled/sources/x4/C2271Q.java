package x4;

import e4.InterfaceC0821a;
import n5.AbstractC1586x;
import u4.InterfaceC2112s;

/* renamed from: x4.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2271Q extends C2272S {

    /* renamed from: v, reason: collision with root package name */
    public final O3.q f17407v;

    public C2271Q(InterfaceC2112s interfaceC2112s, C2272S c2272s, int i7, v4.h hVar, W4.e eVar, AbstractC1586x abstractC1586x, boolean z7, boolean z8, boolean z9, AbstractC1586x abstractC1586x2, u4.M m7, InterfaceC0821a interfaceC0821a) {
        super(interfaceC2112s, c2272s, i7, hVar, eVar, abstractC1586x, z7, z8, z9, abstractC1586x2, m7);
        this.f17407v = z1.c.C(interfaceC0821a);
    }

    @Override // x4.C2272S
    public final C2272S N0(s4.f fVar, W4.e eVar, int i7) {
        v4.h annotations = getAnnotations();
        kotlin.jvm.internal.l.e("<get-annotations>(...)", annotations);
        AbstractC1586x type = getType();
        kotlin.jvm.internal.l.e("getType(...)", type);
        boolean zO0 = O0();
        u4.N n7 = u4.M.f16295i;
        C2280g c2280g = new C2280g(3, this);
        return new C2271Q(fVar, null, i7, annotations, eVar, type, zO0, this.f17410r, this.f17411s, this.f17412t, n7, c2280g);
    }
}
