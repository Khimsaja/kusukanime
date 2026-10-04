package o;

import e5.AbstractC0832b;
import f.AbstractC0841b;
import java.util.LinkedHashMap;
import l4.AbstractC1420H;
import p.A0;
import p.AbstractC1745d;
import p.B0;
import p.C0;
import p.C1752g0;
import p.InterfaceC1715B;
import p.J0;

/* renamed from: o.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1628z {
    public static final B0 a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1752g0 f13551b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1752g0 f13552c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1752g0 f13553d;

    static {
        C1618p c1618p = C1618p.f13528o;
        C1618p c1618p2 = C1618p.f13529p;
        B0 b02 = C0.a;
        a = new B0(c1618p, c1618p2);
        f13551b = AbstractC1745d.p(5, null);
        Object obj = J0.a;
        f13552c = AbstractC1745d.p(1, new T0.h(P3.F.b(1, 1)));
        f13553d = AbstractC1745d.p(1, new T0.j(AbstractC1420H.a(1, 1)));
    }

    public static C1593E a(A0 a02, int i7) {
        InterfaceC1715B interfaceC1715BP = a02;
        if ((i7 & 1) != 0) {
            interfaceC1715BP = AbstractC1745d.p(5, null);
        }
        return new C1593E(new C1602N(new C1595G(interfaceC1715BP), (AbstractC0832b) null, (AbstractC0841b) null, (LinkedHashMap) null, 62));
    }

    public static C1594F b(A0 a02, int i7) {
        InterfaceC1715B interfaceC1715BP = a02;
        if ((i7 & 1) != 0) {
            interfaceC1715BP = AbstractC1745d.p(5, null);
        }
        return new C1594F(new C1602N(new C1595G(interfaceC1715BP), (AbstractC0832b) null, (AbstractC0841b) null, (LinkedHashMap) null, 62));
    }
}
