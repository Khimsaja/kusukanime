package D;

import G2.C0174k;
import O.R0;
import android.os.Bundle;
import p.AbstractC1745d;
import p.C1720G;
import p.C1723J;
import p.C1759k;
import s.C1928n;
import s.C1950y0;
import y.C2306F;
import y.C2338s;
import y.InterfaceC2317Q;

/* renamed from: D.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0076u extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1291l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1292m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1293n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1294o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1295p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0076u(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        super(1);
        this.f1291l = i7;
        this.f1292m = obj;
        this.f1293n = obj2;
        this.f1294o = obj3;
        this.f1295p = obj4;
    }

    /* JADX WARN: Type inference failed for: r14v23, types: [e4.a, kotlin.jvm.internal.m] */
    @Override // e4.k
    public final Object invoke(Object obj) {
        boolean z7;
        switch (this.f1291l) {
            case 0:
                C0053g0 c0053g0 = (C0053g0) this.f1292m;
                if (c0053g0.b()) {
                    kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                    C0056i c0056i = new C0056i(c0053g0.f1145d, c0053g0.f1161t, xVar, 2);
                    N0.x xVar2 = (N0.x) this.f1293n;
                    N0.r rVar = xVar2.a;
                    rVar.d((N0.w) this.f1294o, (N0.l) this.f1295p, c0056i, c0053g0.f1162u);
                    N0.B b4 = new N0.B(xVar2, rVar);
                    xVar2.f6898b.set(b4);
                    xVar.f12720k = b4;
                    c0053g0.f1146e = b4;
                }
                return new C0075t();
            case 1:
                C0174k c0174k = (C0174k) obj;
                kotlin.jvm.internal.l.f("it", c0174k);
                ((kotlin.jvm.internal.t) this.f1292m).f12716k = true;
                ((G2.E) this.f1293n).a((G2.y) this.f1294o, (Bundle) this.f1295p, c0174k, P3.y.f7779k);
                return O3.C.a;
            case 2:
                long jLongValue = ((Number) obj).longValue();
                R0 r02 = (R0) ((O.Z) this.f1292m).getValue();
                long jLongValue2 = r02 != null ? ((Number) r02.getValue()).longValue() : jLongValue;
                C1723J c1723j = (C1723J) this.f1293n;
                long j7 = c1723j.f13885c;
                Q.d dVar = c1723j.a;
                H5.A a = (H5.A) this.f1295p;
                int i7 = 0;
                kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) this.f1294o;
                if (j7 == Long.MIN_VALUE || uVar.f12717k != AbstractC1745d.n(a.getCoroutineContext())) {
                    c1723j.f13885c = jLongValue;
                    int i8 = dVar.f7829m;
                    if (i8 > 0) {
                        Object[] objArr = dVar.f7827k;
                        int i9 = 0;
                        do {
                            ((C1720G) objArr[i9]).f13859q = true;
                            i9++;
                        } while (i9 < i8);
                    }
                    uVar.f12717k = AbstractC1745d.n(a.getCoroutineContext());
                }
                float f5 = uVar.f12717k;
                if (f5 == 0.0f) {
                    int i10 = dVar.f7829m;
                    if (i10 > 0) {
                        Object[] objArr2 = dVar.f7827k;
                        do {
                            C1720G c1720g = (C1720G) objArr2[i7];
                            c1720g.f13856n.setValue(c1720g.f13857o.f14076c);
                            c1720g.f13859q = true;
                            i7++;
                        } while (i7 < i10);
                    }
                } else {
                    long j8 = (long) ((jLongValue2 - c1723j.f13885c) / f5);
                    int i11 = dVar.f7829m;
                    if (i11 > 0) {
                        Object[] objArr3 = dVar.f7827k;
                        z7 = true;
                        int i12 = 0;
                        do {
                            C1720G c1720g2 = (C1720G) objArr3[i12];
                            if (!c1720g2.f13858p) {
                                c1720g2.f13861s.f13884b.setValue(Boolean.FALSE);
                                if (c1720g2.f13859q) {
                                    c1720g2.f13859q = false;
                                    c1720g2.f13860r = j8;
                                }
                                long j9 = j8 - c1720g2.f13860r;
                                c1720g2.f13856n.setValue(c1720g2.f13857o.b(j9));
                                c1720g2.f13858p = c1720g2.f13857o.g(j9);
                            }
                            if (!c1720g2.f13858p) {
                                z7 = false;
                            }
                            i12++;
                        } while (i12 < i11);
                    } else {
                        z7 = true;
                    }
                    c1723j.f13886d.setValue(Boolean.valueOf(!z7));
                }
                return O3.C.a;
            case 3:
                C1759k c1759k = (C1759k) obj;
                float fFloatValue = ((Number) c1759k.f14030e.getValue()).floatValue();
                kotlin.jvm.internal.u uVar2 = (kotlin.jvm.internal.u) this.f1292m;
                float f7 = fFloatValue - uVar2.f12717k;
                float fA = ((C1950y0) this.f1293n).a(f7);
                uVar2.f12717k = ((Number) c1759k.f14030e.getValue()).floatValue();
                ((kotlin.jvm.internal.u) this.f1294o).f12717k = ((Number) c1759k.a.f13838b.invoke(c1759k.f14031f)).floatValue();
                if (Math.abs(f7 - fA) > 0.5f) {
                    c1759k.f14034i.setValue(Boolean.FALSE);
                    c1759k.f14029d.invoke();
                }
                ((C1928n) this.f1295p).getClass();
                return O3.C.a;
            default:
                B2.l lVar = new B2.l((C2338s) this.f1293n, (w0.a0) this.f1294o, (InterfaceC2317Q) this.f1295p, 27);
                C2306F c2306f = (C2306F) this.f1292m;
                c2306f.f17577c = lVar;
                return new r(10, c2306f);
        }
    }
}
