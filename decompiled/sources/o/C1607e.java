package o;

import l4.AbstractC1420H;
import w0.AbstractC2182Q;
import w0.S;

/* renamed from: o.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1607e extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S[] f13499l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1608f f13500m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f13501n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13502o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1607e(S[] sArr, C1608f c1608f, int i7, int i8) {
        super(1);
        this.f13499l = sArr;
        this.f13500m = c1608f;
        this.f13501n = i7;
        this.f13502o = i8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        AbstractC2182Q abstractC2182Q = (AbstractC2182Q) obj;
        for (S s7 : this.f13499l) {
            if (s7 != null) {
                long jA = this.f13500m.a.f13508b.a(AbstractC1420H.a(s7.f16840k, s7.f16841l), AbstractC1420H.a(this.f13501n, this.f13502o), T0.k.f8844k);
                AbstractC2182Q.d(abstractC2182Q, s7, (int) (jA >> 32), (int) (jA & 4294967295L));
            }
        }
        return O3.C.a;
    }
}
