package D3;

import O.C0486d;
import O.C0510p;
import O.InterfaceC0501k0;
import O3.C;
import b1.AbstractC0703b;
import io.ktor.util.GzipHeaderFlags;
import v.AbstractC2130i;
import v.C2140t;
import v.C2141u;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1466k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ W.a f1467l;

    public /* synthetic */ m(W.a aVar, int i7) {
        this.f1466k = i7;
        this.f1467l = aVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f1466k;
        C0510p c0510p = (C0510p) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i7) {
            case 0:
                if ((iIntValue & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    a0.n nVar = a0.n.a;
                    C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p, 0);
                    int i8 = c0510p.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
                    a0.q qVarC = a0.a.c(c0510p, nVar);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i = C2363j.f17871b;
                    c0510p.V();
                    if (c0510p.f7127O) {
                        c0510p.l(c2362i);
                    } else {
                        c0510p.e0();
                    }
                    C0486d.R(c0510p, C2363j.f17875f, c2140tA);
                    C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0M);
                    C2361h c2361h = C2363j.f17876g;
                    if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i8))) {
                        AbstractC0703b.u(i8, c0510p, i8, c2361h);
                    }
                    C0486d.R(c0510p, C2363j.f17873d, qVarC);
                    this.f1467l.invoke(C2141u.a, c0510p, 6);
                    c0510p.p(true);
                }
                break;
            case 1:
                if ((iIntValue & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    this.f1467l.invoke(c0510p, 0);
                }
                break;
            case 2:
                if ((iIntValue & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    this.f1467l.invoke(c0510p, 0);
                }
                break;
            case 3:
                if ((iIntValue & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    this.f1467l.invoke(c0510p, 0);
                }
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                if ((iIntValue & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    this.f1467l.invoke(c0510p, 0);
                }
                break;
            default:
                if ((iIntValue & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    this.f1467l.invoke(c0510p, 0);
                }
                break;
        }
        return C.a;
    }
}
