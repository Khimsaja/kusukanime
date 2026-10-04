package L;

import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class X0 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5413l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0390k2 f5414m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f5415n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X0(C0390k2 c0390k2, InterfaceC0821a interfaceC0821a, int i7) {
        super(1);
        this.f5413l = i7;
        this.f5414m = c0390k2;
        this.f5415n = interfaceC0821a;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f5413l) {
            case 0:
                if (!this.f5414m.c()) {
                    this.f5415n.invoke();
                }
                break;
            default:
                if (!this.f5414m.c()) {
                    this.f5415n.invoke();
                }
                break;
        }
        return O3.C.a;
    }
}
