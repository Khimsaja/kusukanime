package D6;

import java.io.IOException;
import w6.C2224i;
import w6.InterfaceC2226k;

/* loaded from: classes.dex */
public final class A extends w6.q {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1637l = 0;

    /* renamed from: m, reason: collision with root package name */
    public Object f1638m;

    public /* synthetic */ A(w6.H h7) {
        super(h7);
    }

    @Override // w6.q, w6.H
    public final long F(C2224i c2224i, long j7) throws Exception {
        switch (this.f1637l) {
            case 0:
                try {
                    return super.F(c2224i, j7);
                } catch (IOException e7) {
                    ((B) this.f1638m).f1641m = e7;
                    throw e7;
                }
            default:
                try {
                    return super.F(c2224i, j7);
                } catch (Exception e8) {
                    this.f1638m = e8;
                    throw e8;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b4, InterfaceC2226k interfaceC2226k) {
        super(interfaceC2226k);
        this.f1638m = b4;
    }
}
