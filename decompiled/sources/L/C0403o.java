package L;

import O.C0510p;
import v.AbstractC2136o;

/* renamed from: L.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0403o extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f5689l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f5690m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0403o(float f5, float f7) {
        super(2);
        this.f5689l = f5;
        this.f5690m = f7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        C0510p c0510p = (C0510p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            AbstractC2136o.a(androidx.compose.foundation.layout.c.k(a0.n.a, this.f5689l, this.f5690m), c0510p, 0);
        }
        return O3.C.a;
    }
}
