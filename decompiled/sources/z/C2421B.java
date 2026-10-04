package z;

import O.C0485c0;
import O.C0487d0;
import e4.InterfaceC0821a;

/* renamed from: z.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2421B extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f18396l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C f18397m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2421B(C c2, int i7) {
        super(0);
        this.f18396l = i7;
        this.f18397m = c2;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        int iF;
        switch (this.f18396l) {
            case 0:
                C c2 = this.f18397m;
                return Integer.valueOf(c2.f18412j.b() ? c2.f18421s.f() : c2.j());
            default:
                C c4 = this.f18397m;
                if (c4.f18412j.b()) {
                    C0487d0 c0487d0 = c4.f18420r;
                    iF = c0487d0.f() != -1 ? c0487d0.f() : Math.abs(((C0485c0) c4.f18405c.f7470d).f()) >= Math.abs(Math.min(c4.f18418p.x(G.a), ((float) c4.m()) / 2.0f) / ((float) c4.m())) ? ((Boolean) c4.f18402E.getValue()).booleanValue() ? c4.f18406d + 1 : c4.f18406d : c4.j();
                } else {
                    iF = c4.j();
                }
                return Integer.valueOf(c4.i(iF));
        }
    }
}
