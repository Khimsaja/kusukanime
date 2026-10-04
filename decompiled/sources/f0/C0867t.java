package f0;

import O3.C;
import e4.InterfaceC0821a;

/* renamed from: f0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0867t extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11427l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0866s f11428m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0867t(C0866s c0866s, int i7) {
        super(0);
        this.f11427l = i7;
        this.f11428m = c0866s;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f11427l) {
            case 0:
                this.f11428m.G0();
                break;
            default:
                C0866s c0866s = this.f11428m;
                if (c0866s.f10402k.f10414w) {
                    AbstractC0851d.A(c0866s);
                }
                break;
        }
        return C.a;
    }
}
