package q;

import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class O extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: m, reason: collision with root package name */
    public static final O f14494m = new O(0, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final O f14495n = new O(0, 1);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f14496l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(int i7, int i8) {
        super(i7);
        this.f14496l = i8;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f14496l) {
            case 0:
                return C1813A.a;
            case 1:
                return new c0();
            default:
                return new o0(0);
        }
    }
}
