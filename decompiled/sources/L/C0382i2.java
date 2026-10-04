package L;

import e4.InterfaceC0821a;

/* renamed from: L.i2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0382i2 extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f5611l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T0.b f5612m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ EnumC0394l2 f5613n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e4.k f5614o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0382i2(boolean z7, T0.b bVar, EnumC0394l2 enumC0394l2, e4.k kVar) {
        super(0);
        this.f5611l = z7;
        this.f5612m = bVar;
        this.f5613n = enumC0394l2;
        this.f5614o = kVar;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        return new C0390k2(this.f5611l, this.f5612m, this.f5613n, this.f5614o);
    }
}
