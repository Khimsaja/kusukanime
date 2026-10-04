package z;

import p.InterfaceC1760l;
import s.InterfaceC1910e;

/* loaded from: classes.dex */
public final class m implements InterfaceC1910e {

    /* renamed from: b, reason: collision with root package name */
    public final C2425d f18487b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1910e f18488c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1760l f18489d;

    public m(C2425d c2425d, InterfaceC1910e interfaceC1910e) {
        this.f18487b = c2425d;
        this.f18488c = interfaceC1910e;
        this.f18489d = interfaceC1910e.b();
    }

    @Override // s.InterfaceC1910e
    public final float a(float f5, float f7, float f8) {
        float fA = this.f18488c.a(f5, f7, f8);
        C2425d c2425d = this.f18487b;
        if (fA == 0.0f) {
            int i7 = c2425d.f18407e;
            if (i7 == 0) {
                return 0.0f;
            }
            float fN = i7 * (-1.0f);
            if (((Boolean) c2425d.f18402E.getValue()).booleanValue()) {
                fN += c2425d.n();
            }
            return e3.c.j(fN, -f8, f8);
        }
        float fN2 = c2425d.f18407e * (-1);
        while (fA > 0.0f && fN2 < fA) {
            fN2 += c2425d.n();
        }
        while (fA < 0.0f && fN2 > fA) {
            fN2 -= c2425d.n();
        }
        return fN2;
    }

    @Override // s.InterfaceC1910e
    public final InterfaceC1760l b() {
        return this.f18489d;
    }
}
