package x4;

import e4.InterfaceC0821a;
import java.util.List;
import n5.AbstractC1566c;
import n5.Y;

/* renamed from: x4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2274a implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17415k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC2275b f17416l;

    public /* synthetic */ C2274a(AbstractC2275b abstractC2275b, int i7) {
        this.f17415k = i7;
        this.f17416l = abstractC2275b;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        AbstractC2275b abstractC2275b = this.f17416l;
        switch (this.f17415k) {
            case 0:
                g5.o oVarG0 = abstractC2275b.g0();
                A4.j jVar = new A4.j(24, this);
                p5.i iVar = Y.a;
                if (p5.l.f(abstractC2275b)) {
                    return p5.l.c(p5.k.f14447u, abstractC2275b.toString());
                }
                n5.M mV = abstractC2275b.v();
                if (mV == null) {
                    Y.a(12);
                    throw null;
                }
                if (oVarG0 == null) {
                    Y.a(13);
                    throw null;
                }
                List listD = Y.d(mV.getParameters());
                n5.I.f13362l.getClass();
                return AbstractC1566c.w(n5.I.f13363m, mV, listD, false, oVarG0, jVar);
            case 1:
                return new g5.i(abstractC2275b.g0());
            default:
                return new C2295v(abstractC2275b);
        }
    }
}
