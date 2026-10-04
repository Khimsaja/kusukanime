package s;

import e4.InterfaceC0821a;

/* renamed from: s.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1901I extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f15141l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P f15142m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1901I(P p7, int i7) {
        super(0);
        this.f15141l = i7;
        this.f15142m = p7;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f15141l) {
            case 0:
                J5.e eVar = this.f15142m.f15195D;
                if (eVar != null) {
                    eVar.mo2trySendJP2dKIU(C1937s.a);
                }
                return O3.C.a;
            default:
                return Boolean.valueOf(!this.f15142m.Q0());
        }
    }
}
