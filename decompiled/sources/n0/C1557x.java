package n0;

import b1.AbstractC0703b;
import j0.InterfaceC1298d;

/* renamed from: n0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1557x extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f13210l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1558y f13211m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1557x(C1558y c1558y, int i7) {
        super(1);
        this.f13210l = i7;
        this.f13211m = c1558y;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [e4.a, kotlin.jvm.internal.m] */
    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f13210l) {
            case 0:
                C1558y c1558y = this.f13211m;
                c1558y.f13214d = true;
                c1558y.f13216f.invoke();
                return O3.C.a;
            default:
                InterfaceC1298d interfaceC1298d = (InterfaceC1298d) obj;
                C1558y c1558y2 = this.f13211m;
                C1535b c1535b = c1558y2.f13212b;
                float f5 = c1558y2.f13221k;
                float f7 = c1558y2.f13222l;
                B2.l lVarD = interfaceC1298d.D();
                long jA = lVarD.A();
                lVarD.t().l();
                try {
                    ((X4.y) lVarD.f416l).E(f5, f7, 0L);
                    c1535b.a(interfaceC1298d);
                    AbstractC0703b.y(lVarD, jA);
                    return O3.C.a;
                } catch (Throwable th) {
                    AbstractC0703b.y(lVarD, jA);
                    throw th;
                }
        }
    }
}
