package X0;

import O3.C;
import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f9707l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f9708m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z f9709n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f9710o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ T0.k f9711p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v vVar, InterfaceC0821a interfaceC0821a, z zVar, String str, T0.k kVar) {
        super(0);
        this.f9707l = vVar;
        this.f9708m = interfaceC0821a;
        this.f9709n = zVar;
        this.f9710o = str;
        this.f9711p = kVar;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        this.f9707l.l(this.f9708m, this.f9709n, this.f9710o, this.f9711p);
        return C.a;
    }
}
