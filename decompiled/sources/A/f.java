package A;

import e4.InterfaceC0821a;
import y0.Y;

/* loaded from: classes.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.j implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f12k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y f13l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f14m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(k kVar, Y y7, InterfaceC0821a interfaceC0821a) {
        super(0, kotlin.jvm.internal.k.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.f12k = kVar;
        this.f13l = y7;
        this.f14m = (kotlin.jvm.internal.m) interfaceC0821a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e4.a, kotlin.jvm.internal.m] */
    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        ?? r02 = this.f14m;
        return k.G0(this.f12k, this.f13l, r02);
    }
}
