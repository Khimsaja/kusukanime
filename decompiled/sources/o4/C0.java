package o4;

import e4.InterfaceC0821a;
import r4.AbstractC1887p;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final class C0 implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13630k;

    /* renamed from: l, reason: collision with root package name */
    public final String f13631l;

    public /* synthetic */ C0(String str, int i7) {
        this.f13630k = i7;
        this.f13631l = str;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f13630k) {
            case 0:
                String strJ = A6.b.j(new StringBuilder(), AbstractC1887p.f15030m.a.a, '.');
                if (!AbstractC2517v.T(this.f13631l, strJ, false)) {
                    strJ = null;
                }
                return strJ == null ? "" : strJ;
            default:
                String strJ2 = A6.b.j(new StringBuilder(), AbstractC1887p.f15028k.a.a, '.');
                if (!AbstractC2517v.T(this.f13631l, strJ2, false)) {
                    strJ2 = null;
                }
                return strJ2 == null ? "" : strJ2;
        }
    }
}
