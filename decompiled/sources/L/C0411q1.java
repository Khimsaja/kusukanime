package L;

import e4.InterfaceC0821a;
import h0.C0970O;

/* renamed from: L.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0411q1 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5750l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f5751m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f5752n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0411q1(boolean z7, InterfaceC0821a interfaceC0821a, int i7) {
        super(1);
        this.f5750l = i7;
        this.f5751m = z7;
        this.f5752n = interfaceC0821a;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f5750l) {
            case 0:
                ((C0970O) obj).b(this.f5751m ? 1.0f : ((Number) this.f5752n.invoke()).floatValue());
                break;
            default:
                ((C0970O) obj).e(!this.f5751m && ((Boolean) this.f5752n.invoke()).booleanValue());
                break;
        }
        return O3.C.a;
    }
}
