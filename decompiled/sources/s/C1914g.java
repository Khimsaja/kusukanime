package s;

import p.AbstractC1745d;
import p.C1770v;
import p.InterfaceC1760l;

/* renamed from: s.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1914g implements InterfaceC1910e {

    /* renamed from: b, reason: collision with root package name */
    public final p.A0 f15305b = AbstractC1745d.q(125, 0, new C1770v(0.25f, 0.1f, 0.25f), 2);

    @Override // s.InterfaceC1910e
    public final float a(float f5, float f7, float f8) {
        float fAbs = Math.abs((f7 + f5) - f5);
        float f9 = (0.3f * f8) - (0.0f * fAbs);
        float f10 = f8 - f9;
        if ((fAbs <= f8) && f10 < fAbs) {
            f9 = f8 - fAbs;
        }
        return f5 - f9;
    }

    @Override // s.InterfaceC1910e
    public final InterfaceC1760l b() {
        return this.f15305b;
    }
}
