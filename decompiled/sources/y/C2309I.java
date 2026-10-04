package y;

import e4.InterfaceC0821a;

/* renamed from: y.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2309I extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f17579l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2312L f17580m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2309I(C2312L c2312l, int i7) {
        super(0);
        this.f17579l = i7;
        this.f17580m = c2312l;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f17579l) {
            case 0:
                C2312L c2312l = this.f17580m;
                return Float.valueOf(c2312l.f17591y.a() - c2312l.f17591y.e());
            case 1:
                return Float.valueOf(this.f17580m.f17591y.b());
            default:
                return Float.valueOf(this.f17580m.f17591y.f());
        }
    }
}
