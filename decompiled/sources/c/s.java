package c;

import O3.C;
import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11097l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x f11098m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(x xVar, int i7) {
        super(0);
        this.f11097l = i7;
        this.f11098m = xVar;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f11097l) {
            case 0:
                this.f11098m.c();
                break;
            case 1:
                this.f11098m.b();
                break;
            default:
                this.f11098m.c();
                break;
        }
        return C.a;
    }
}
