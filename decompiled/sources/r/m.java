package r;

import O.C0486d;
import O.C0510p;
import O3.C;
import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f14777l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f14778m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1859a f14779n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f14780o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f14781p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(String str, boolean z7, C1859a c1859a, InterfaceC0821a interfaceC0821a, int i7) {
        super(2);
        this.f14777l = str;
        this.f14778m = z7;
        this.f14779n = c1859a;
        this.f14780o = (kotlin.jvm.internal.m) interfaceC0821a;
        this.f14781p = i7;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [e4.a, kotlin.jvm.internal.m] */
    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0486d.V(this.f14781p | 1);
        ?? r32 = this.f14780o;
        boolean z7 = this.f14778m;
        C1859a c1859a = this.f14779n;
        n.b(this.f14777l, z7, c1859a, r32, (C0510p) obj, iV);
        return C.a;
    }
}
