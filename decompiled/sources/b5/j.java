package b5;

import O3.C;
import n5.AbstractC1586x;
import u4.InterfaceC2118y;

/* loaded from: classes.dex */
public final class j extends g {

    /* renamed from: b, reason: collision with root package name */
    public final String f10951b;

    public j(String str) {
        super(C.a);
        this.f10951b = str;
    }

    @Override // b5.g
    public final AbstractC1586x a(InterfaceC2118y interfaceC2118y) {
        kotlin.jvm.internal.l.f("module", interfaceC2118y);
        return p5.l.c(p5.k.f14428D, this.f10951b);
    }

    @Override // b5.g
    public final Object b() {
        throw new UnsupportedOperationException();
    }

    @Override // b5.g
    public final String toString() {
        return this.f10951b;
    }
}
