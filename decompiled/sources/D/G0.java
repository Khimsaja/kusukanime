package D;

import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class G0 extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1033l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ J0 f1034m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G0(J0 j02, int i7) {
        super(0);
        this.f1033l = i7;
        this.f1034m = j02;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f1033l) {
            case 0:
                return Boolean.valueOf(this.f1034m.a.f() > 0.0f);
            default:
                J0 j02 = this.f1034m;
                return Boolean.valueOf(j02.a.f() < j02.f1057b.f());
        }
    }
}
