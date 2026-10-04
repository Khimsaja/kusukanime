package D;

import O.C0485c0;
import O.C0486d;
import O.C0493g0;
import s.EnumC1903a0;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: f, reason: collision with root package name */
    public static final L2.e f1056f = q0.c.F(I0.f1050l, C0054h.f1177w);
    public final C0485c0 a;

    /* renamed from: b, reason: collision with root package name */
    public final C0485c0 f1057b = C0486d.I(0.0f);

    /* renamed from: c, reason: collision with root package name */
    public g0.d f1058c = g0.d.f11658e;

    /* renamed from: d, reason: collision with root package name */
    public long f1059d = H0.H.f3091b;

    /* renamed from: e, reason: collision with root package name */
    public final C0493g0 f1060e;

    public J0(EnumC1903a0 enumC1903a0, float f5) {
        this.a = C0486d.I(f5);
        this.f1060e = C0486d.K(enumC1903a0, O.T.f7049p);
    }

    public final void a(EnumC1903a0 enumC1903a0, g0.d dVar, int i7, int i8) {
        float f5 = i8 - i7;
        this.f1057b.g(f5);
        g0.d dVar2 = this.f1058c;
        float f7 = dVar2.a;
        float f8 = dVar.a;
        C0485c0 c0485c0 = this.a;
        float f9 = dVar.f11659b;
        if (f8 != f7 || f9 != dVar2.f11659b) {
            boolean z7 = enumC1903a0 == EnumC1903a0.f15259k;
            if (z7) {
                f8 = f9;
            }
            float f10 = z7 ? dVar.f11661d : dVar.f11660c;
            float f11 = c0485c0.f();
            float f12 = i7;
            float f13 = f11 + f12;
            c0485c0.g(c0485c0.f() + ((f10 <= f13 && (f8 >= f11 || f10 - f8 <= f12)) ? (f8 >= f11 || f10 - f8 > f12) ? 0.0f : f8 - f11 : f10 - f13));
            this.f1058c = dVar;
        }
        c0485c0.g(e3.c.j(c0485c0.f(), 0.0f, f5));
    }
}
