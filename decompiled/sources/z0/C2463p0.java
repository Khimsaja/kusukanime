package z0;

import e4.InterfaceC0821a;

/* renamed from: z0.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2463p0 extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f18825l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ F.w f18826m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f18827n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2463p0(boolean z7, F.w wVar, String str) {
        super(0);
        this.f18825l = z7;
        this.f18826m = wVar;
        this.f18827n = str;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        if (this.f18825l) {
            F.w wVar = this.f18826m;
            String str = this.f18827n;
            M2.a aVar = (M2.a) wVar.f2037l;
            synchronized (((A.e) aVar.f6545f)) {
            }
        }
        return O3.C.a;
    }
}
