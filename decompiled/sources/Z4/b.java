package Z4;

import e4.n;
import u4.InterfaceC2096b;
import u4.InterfaceC2105k;

/* loaded from: classes.dex */
public final class b implements n {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2096b f10266k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC2096b f10267l;

    public b(InterfaceC2096b interfaceC2096b, InterfaceC2096b interfaceC2096b2) {
        this.f10266k = interfaceC2096b;
        this.f10267l = interfaceC2096b2;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(kotlin.jvm.internal.l.a((InterfaceC2105k) obj, this.f10266k) && kotlin.jvm.internal.l.a((InterfaceC2105k) obj2, this.f10267l));
    }
}
