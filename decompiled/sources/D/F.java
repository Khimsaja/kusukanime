package D;

import e4.InterfaceC0821a;
import io.ktor.util.GzipHeaderFlags;

/* loaded from: classes.dex */
public final class F extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1024l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H.S f1025m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(H.S s7, int i7) {
        super(0);
        this.f1024l = i7;
        this.f1025m = s7;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f1024l) {
            case 0:
                this.f1025m.l();
                break;
            case 1:
                this.f1025m.f(true);
                break;
            case 2:
                this.f1025m.b(true);
                break;
            case 3:
                this.f1025m.d();
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                H.S s7 = this.f1025m;
                s7.b(true);
                s7.k();
                break;
            case 5:
                H.S s8 = this.f1025m;
                s8.d();
                s8.k();
                break;
            case 6:
                H.S s9 = this.f1025m;
                s9.l();
                s9.k();
                break;
            default:
                this.f1025m.m();
                break;
        }
        return O3.C.a;
    }
}
