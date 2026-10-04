package y0;

import e4.InterfaceC0821a;
import x0.InterfaceC2243c;

/* renamed from: y0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2355b extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f17830l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2356c f17831m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2355b(C2356c c2356c, int i7) {
        super(0);
        this.f17830l = i7;
        this.f17831m = c2356c;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f17830l) {
            case 0:
                this.f17831m.I0();
                break;
            default:
                C2356c c2356c = this.f17831m;
                a0.o oVar = c2356c.f17833x;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer", oVar);
                ((InterfaceC2243c) oVar).j(c2356c);
                break;
        }
        return O3.C.a;
    }
}
