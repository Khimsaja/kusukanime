package M;

import O.C0493g0;
import e4.InterfaceC0821a;

/* renamed from: M.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0452j extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6308l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0460s f6309m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0452j(C0460s c0460s, int i7) {
        super(0);
        this.f6308l = i7;
        this.f6309m = c0460s;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f6308l) {
            case 0:
                return this.f6309m.d();
            case 1:
                C0460s c0460s = this.f6309m;
                return new O3.l(c0460s.d(), c0460s.f6338h.getValue());
            case 2:
                C0460s c0460s2 = this.f6309m;
                Object value = c0460s2.f6342l.getValue();
                if (value != null) {
                    return value;
                }
                float f5 = c0460s2.f6340j.f();
                boolean zIsNaN = Float.isNaN(f5);
                C0493g0 c0493g0 = c0460s2.f6337g;
                if (zIsNaN) {
                    return c0493g0.getValue();
                }
                Object value2 = c0493g0.getValue();
                B bD = c0460s2.d();
                float fD = bD.d(value2);
                if (fD != f5 && !Float.isNaN(fD)) {
                    if (fD < f5) {
                        Object objB = bD.b(f5, true);
                        if (objB != null) {
                            return objB;
                        }
                    } else {
                        Object objB2 = bD.b(f5, false);
                        if (objB2 != null) {
                            return objB2;
                        }
                    }
                }
                return value2;
            case 3:
                C0460s c0460s3 = this.f6309m;
                float fD2 = c0460s3.d().d(c0460s3.f6337g.getValue());
                float fD3 = c0460s3.d().d(c0460s3.f6339i.getValue()) - fD2;
                float fAbs = Math.abs(fD3);
                float f7 = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float f8 = (c0460s3.f() - fD2) / fD3;
                    if (f8 < 1.0E-6f) {
                        f7 = 0.0f;
                    } else if (f8 <= 0.999999f) {
                        f7 = f8;
                    }
                }
                return Float.valueOf(f7);
            default:
                C0460s c0460s4 = this.f6309m;
                Object value3 = c0460s4.f6342l.getValue();
                if (value3 != null) {
                    return value3;
                }
                float f9 = c0460s4.f6340j.f();
                boolean zIsNaN2 = Float.isNaN(f9);
                C0493g0 c0493g02 = c0460s4.f6337g;
                return !zIsNaN2 ? c0460s4.c(f9, 0.0f, c0493g02.getValue()) : c0493g02.getValue();
        }
    }
}
