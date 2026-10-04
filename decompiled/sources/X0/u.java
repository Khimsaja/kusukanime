package X0;

import O3.C;
import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f9741l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f9742m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T0.i f9743n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f9744o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f9745p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(kotlin.jvm.internal.w wVar, v vVar, T0.i iVar, long j7, long j8) {
        super(0);
        this.f9741l = wVar;
        this.f9742m = vVar;
        this.f9743n = iVar;
        this.f9744o = j7;
        this.f9745p = j8;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        v vVar = this.f9742m;
        y positionProvider = vVar.getPositionProvider();
        T0.k parentLayoutDirection = vVar.getParentLayoutDirection();
        this.f9741l.f12719k = positionProvider.a(this.f9743n, this.f9744o, parentLayoutDirection, this.f9745p);
        return C.a;
    }
}
