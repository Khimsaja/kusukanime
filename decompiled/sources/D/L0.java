package D;

import io.ktor.util.GzipHeaderFlags;
import w0.AbstractC2182Q;

/* loaded from: classes.dex */
public final class L0 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1073l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w0.S f1074m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L0(w0.S s7, int i7) {
        super(1);
        this.f1073l = i7;
        this.f1074m = s7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f1073l) {
            case 0:
                AbstractC2182Q.f((AbstractC2182Q) obj, this.f1074m, 0, 0);
                break;
            case 1:
                AbstractC2182Q.d((AbstractC2182Q) obj, this.f1074m, 0, 0);
                break;
            case 2:
                AbstractC2182Q.d((AbstractC2182Q) obj, this.f1074m, 0, 0);
                break;
            case 3:
                AbstractC2182Q.f((AbstractC2182Q) obj, this.f1074m, 0, 0);
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                AbstractC2182Q.f((AbstractC2182Q) obj, this.f1074m, 0, 0);
                break;
            case 5:
                AbstractC2182Q.f((AbstractC2182Q) obj, this.f1074m, 0, 0);
                break;
            case 6:
                AbstractC2182Q.d((AbstractC2182Q) obj, this.f1074m, 0, 0);
                break;
            case 7:
                AbstractC2182Q.d((AbstractC2182Q) obj, this.f1074m, 0, 0);
                break;
            case 8:
                AbstractC2182Q.d((AbstractC2182Q) obj, this.f1074m, 0, 0);
                break;
            case 9:
                AbstractC2182Q.f((AbstractC2182Q) obj, this.f1074m, 0, 0);
                break;
            case 10:
                AbstractC2182Q.f((AbstractC2182Q) obj, this.f1074m, 0, 0);
                break;
            case 11:
                AbstractC2182Q abstractC2182Q = (AbstractC2182Q) obj;
                T0.k kVarB = abstractC2182Q.b();
                T0.k kVar = T0.k.f8844k;
                w0.S s7 = this.f1074m;
                if (kVarB == kVar || abstractC2182Q.c() == 0) {
                    AbstractC2182Q.a(abstractC2182Q, s7);
                    s7.j0(T0.h.c(0L, s7.f16844o), 0.0f, null);
                } else {
                    int i7 = (int) 0;
                    long jB = P3.F.b((abstractC2182Q.c() - s7.f16840k) - i7, i7);
                    AbstractC2182Q.a(abstractC2182Q, s7);
                    s7.j0(T0.h.c(jB, s7.f16844o), 0.0f, null);
                }
                break;
            case 12:
                AbstractC2182Q.f((AbstractC2182Q) obj, this.f1074m, 0, 0);
                break;
            case 13:
                AbstractC2182Q.f((AbstractC2182Q) obj, this.f1074m, 0, 0);
                break;
            default:
                AbstractC2182Q.g((AbstractC2182Q) obj, this.f1074m, 0, 0);
                break;
        }
        return O3.C.a;
    }
}
