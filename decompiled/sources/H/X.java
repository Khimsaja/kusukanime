package H;

import e4.InterfaceC0821a;
import k4.C1395d;
import l4.InterfaceC1443v;

/* loaded from: classes.dex */
public final class X extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2940l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f2941m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(InterfaceC0821a interfaceC0821a, int i7) {
        super(1);
        this.f2940l = i7;
        this.f2941m = interfaceC0821a;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        O3.C c2 = O3.C.a;
        InterfaceC0821a interfaceC0821a = this.f2941m;
        switch (this.f2940l) {
            case 0:
                break;
            case 1:
                interfaceC0821a.invoke();
                break;
            case 2:
                long j7 = ((g0.c) obj).a;
                interfaceC0821a.invoke();
                break;
            default:
                F0.e eVar = new F0.e(((Number) interfaceC0821a.invoke()).floatValue(), new C1395d(0.0f, 1.0f));
                InterfaceC1443v[] interfaceC1443vArr = F0.s.a;
                F0.t tVar = F0.q.f2130c;
                InterfaceC1443v interfaceC1443v = F0.s.a[1];
                tVar.a((F0.i) obj, eVar);
                break;
        }
        return c2;
    }
}
