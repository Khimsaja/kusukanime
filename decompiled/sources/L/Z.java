package L;

import K.C0293b;
import K.C0295d;
import e4.InterfaceC0821a;
import y0.AbstractC2359f;

/* loaded from: classes.dex */
public final class Z extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5429l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0348a0 f5430m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(C0348a0 c0348a0, int i7) {
        super(0);
        this.f5429l = i7;
        this.f5430m = c0348a0;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        C0348a0 c0348a0 = this.f5430m;
        switch (this.f5429l) {
            case 0:
                return E0.f5044b;
            default:
                if (((R1) AbstractC2359f.i(c0348a0, S1.f5339b)) == null) {
                    K.w wVar = c0348a0.f5442D;
                    if (wVar != null) {
                        c0348a0.H0(wVar);
                    }
                } else if (c0348a0.f5442D == null) {
                    Y y7 = new Y(c0348a0);
                    Z z7 = new Z(c0348a0, 0);
                    p.A0 a02 = K.u.a;
                    boolean z8 = K.A.a;
                    u.j jVar = c0348a0.f5443z;
                    boolean z9 = c0348a0.f5439A;
                    float f5 = c0348a0.f5440B;
                    K.w c0295d = z8 ? new C0295d(jVar, z9, f5, y7, z7) : new C0293b(jVar, z9, f5, y7, z7);
                    c0348a0.G0(c0295d);
                    c0348a0.f5442D = c0295d;
                }
                return O3.C.a;
        }
    }
}
