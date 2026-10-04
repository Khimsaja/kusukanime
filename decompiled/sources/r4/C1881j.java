package r4;

import e4.InterfaceC0821a;

/* renamed from: r4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1881j implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14941k;

    /* renamed from: l, reason: collision with root package name */
    public final EnumC1882k f14942l;

    public /* synthetic */ C1881j(EnumC1882k enumC1882k, int i7) {
        this.f14941k = i7;
        this.f14942l = enumC1882k;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f14941k) {
            case 0:
                return AbstractC1887p.f15028k.a(this.f14942l.f14953k);
            default:
                return AbstractC1887p.f15028k.a(this.f14942l.f14954l);
        }
    }
}
