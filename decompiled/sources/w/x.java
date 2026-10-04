package w;

import H5.D;
import O.C0502l;
import O.C0510p;
import P3.y;
import e4.InterfaceC0821a;
import s.EnumC1903a0;

/* loaded from: classes.dex */
public abstract class x {
    public static final float a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final l f16812b = new l(null, 0, false, 0.0f, new v(0), 0.0f, false, D.c(S3.i.f8767k), z1.c.a(), q0.c.b(0, 0, 15), y.f7779k, 0, 0, 0, EnumC1903a0.f15259k, 0, 0);

    public static final u a(C0510p c0510p) {
        Object[] objArr = new Object[0];
        L2.e eVar = u.f16790w;
        boolean zD = c0510p.d(0) | c0510p.d(0);
        Object objH = c0510p.H();
        if (zD || objH == C0502l.a) {
            objH = new w(0);
            c0510p.b0(objH);
        }
        return (u) z1.c.F(objArr, eVar, (InterfaceC0821a) objH, c0510p, 0, 4);
    }
}
