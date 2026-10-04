package t;

import O.C0493g0;
import O3.C;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import p.C1759k;
import s.C1950y0;

/* renamed from: t.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2029i extends m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f15869l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f15870m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u f15871n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1950y0 f15872o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f15873p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2029i(float f5, u uVar, C1950y0 c1950y0, e4.k kVar) {
        super(1);
        this.f15870m = f5;
        this.f15871n = uVar;
        this.f15872o = c1950y0;
        this.f15873p = (m) kVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [e4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r5v1, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r9v12, types: [e4.a, kotlin.jvm.internal.m] */
    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f15869l) {
            case 0:
                C1759k c1759k = (C1759k) obj;
                float fAbs = Math.abs(((Number) c1759k.f14030e.getValue()).floatValue());
                float f5 = this.f15870m;
                float fAbs2 = Math.abs(f5);
                u uVar = this.f15871n;
                ?? r42 = c1759k.f14029d;
                C0493g0 c0493g0 = c1759k.f14034i;
                C0493g0 c0493g02 = c1759k.f14030e;
                C2023c c2023c = (C2023c) this.f15873p;
                C1950y0 c1950y0 = this.f15872o;
                if (fAbs >= fAbs2) {
                    float fC = k.c(((Number) c0493g02.getValue()).floatValue(), f5);
                    float f7 = fC - uVar.f12717k;
                    float fA = c1950y0.a(f7);
                    c2023c.invoke(Float.valueOf(fA));
                    if (Math.abs(f7 - fA) > 0.5f) {
                        c0493g0.setValue(Boolean.FALSE);
                        r42.invoke();
                    }
                    c0493g0.setValue(Boolean.FALSE);
                    r42.invoke();
                    uVar.f12717k = fC;
                } else {
                    float fFloatValue = ((Number) c0493g02.getValue()).floatValue() - uVar.f12717k;
                    float fA2 = c1950y0.a(fFloatValue);
                    c2023c.invoke(Float.valueOf(fA2));
                    if (Math.abs(fFloatValue - fA2) > 0.5f) {
                        c0493g0.setValue(Boolean.FALSE);
                        r42.invoke();
                    }
                    uVar.f12717k = ((Number) c0493g02.getValue()).floatValue();
                }
                break;
            default:
                C1759k c1759k2 = (C1759k) obj;
                float fC2 = k.c(((Number) c1759k2.f14030e.getValue()).floatValue(), this.f15870m);
                u uVar2 = this.f15871n;
                float f8 = fC2 - uVar2.f12717k;
                float fA3 = this.f15872o.a(f8);
                this.f15873p.invoke(Float.valueOf(fA3));
                if (Math.abs(f8 - fA3) > 0.5f || fC2 != ((Number) c1759k2.f14030e.getValue()).floatValue()) {
                    c1759k2.f14034i.setValue(Boolean.FALSE);
                    c1759k2.f14029d.invoke();
                }
                uVar2.f12717k += fA3;
                break;
        }
        return C.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2029i(float f5, u uVar, C1950y0 c1950y0, C2023c c2023c) {
        super(1);
        this.f15870m = f5;
        this.f15871n = uVar;
        this.f15872o = c1950y0;
        this.f15873p = c2023c;
    }
}
