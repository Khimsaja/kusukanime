package Y4;

import P3.H;
import java.util.ArrayList;
import u4.InterfaceC2088D;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2105k;
import u4.Q;
import x4.AbstractC2257C;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final b f10137b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f10138c = new b(1);

    /* renamed from: d, reason: collision with root package name */
    public static final b f10139d = new b(2);
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i7) {
        this.a = i7;
    }

    public static String b(InterfaceC2102h interfaceC2102h) {
        String strI;
        W4.e name = interfaceC2102h.getName();
        kotlin.jvm.internal.l.e("getName(...)", name);
        String strG = z1.c.G(name);
        if (!(interfaceC2102h instanceof Q)) {
            InterfaceC2105k interfaceC2105kK = interfaceC2102h.k();
            kotlin.jvm.internal.l.e("getContainingDeclaration(...)", interfaceC2105kK);
            if (interfaceC2105kK instanceof InterfaceC2099e) {
                strI = b((InterfaceC2102h) interfaceC2105kK);
            } else if (interfaceC2105kK instanceof InterfaceC2088D) {
                W4.d dVar = ((AbstractC2257C) ((InterfaceC2088D) interfaceC2105kK)).f17354o.a;
                kotlin.jvm.internal.l.f("<this>", dVar);
                strI = z1.c.I(W4.d.f(dVar));
            } else {
                strI = null;
            }
            if (strI != null && !strI.equals("")) {
                return strI + '.' + strG;
            }
        }
        return strG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [u4.h, u4.k] */
    /* JADX WARN: Type inference failed for: r2v8, types: [u4.k] */
    /* JADX WARN: Type inference failed for: r2v9, types: [u4.k] */
    @Override // Y4.c
    public final String a(InterfaceC2102h interfaceC2102h, h hVar) {
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.l.f("renderer", hVar);
                if (interfaceC2102h instanceof Q) {
                    W4.e name = ((Q) interfaceC2102h).getName();
                    kotlin.jvm.internal.l.e("getName(...)", name);
                    return hVar.L(name, false);
                }
                W4.d dVarG = Z4.e.g(interfaceC2102h);
                kotlin.jvm.internal.l.e("getFqName(...)", dVarG);
                return hVar.m(z1.c.I(W4.d.f(dVarG)));
            case 1:
                kotlin.jvm.internal.l.f("renderer", hVar);
                if (interfaceC2102h instanceof Q) {
                    W4.e name2 = ((Q) interfaceC2102h).getName();
                    kotlin.jvm.internal.l.e("getName(...)", name2);
                    return hVar.L(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(interfaceC2102h.getName());
                    interfaceC2102h = interfaceC2102h.k();
                } while (interfaceC2102h instanceof InterfaceC2099e);
                return z1.c.I(new H(arrayList));
            default:
                kotlin.jvm.internal.l.f("renderer", hVar);
                return b(interfaceC2102h);
        }
    }
}
