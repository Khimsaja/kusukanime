package O4;

import O3.C;
import n5.AbstractC1586x;
import n5.a0;
import t4.C2053d;
import u4.InterfaceC2097c;
import u4.InterfaceC2102h;
import x4.C2295v;

/* loaded from: classes.dex */
public final class o implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public static final o f7580l = new o(0);

    /* renamed from: m, reason: collision with root package name */
    public static final o f7581m = new o(1);

    /* renamed from: n, reason: collision with root package name */
    public static final o f7582n = new o(2);

    /* renamed from: o, reason: collision with root package name */
    public static final o f7583o = new o(3);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7584k;

    public /* synthetic */ o(int i7) {
        this.f7584k = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f7584k) {
            case 0:
                InterfaceC2097c interfaceC2097c = (InterfaceC2097c) obj;
                kotlin.jvm.internal.l.f("it", interfaceC2097c);
                C2295v c2295vD = interfaceC2097c.D();
                kotlin.jvm.internal.l.c(c2295vD);
                return c2295vD.getType();
            case 1:
                InterfaceC2097c interfaceC2097c2 = (InterfaceC2097c) obj;
                kotlin.jvm.internal.l.f("it", interfaceC2097c2);
                AbstractC1586x returnType = interfaceC2097c2.getReturnType();
                kotlin.jvm.internal.l.c(returnType);
                return returnType;
            case 2:
                a0 a0Var = (a0) obj;
                kotlin.jvm.internal.l.f("it", a0Var);
                return Boolean.valueOf(a0Var instanceof M4.i);
            case 3:
                InterfaceC2102h interfaceC2102hF = ((a0) obj).t0().f();
                if (interfaceC2102hF == null) {
                    return Boolean.FALSE;
                }
                W4.e name = interfaceC2102hF.getName();
                W4.c cVar = C2053d.f16042f;
                return Boolean.valueOf(kotlin.jvm.internal.l.a(name, cVar.a.g()) && kotlin.jvm.internal.l.a(d5.e.c(interfaceC2102hF), cVar));
            default:
                p pVar = (p) obj;
                kotlin.jvm.internal.l.f("$this$function", pVar);
                String strConcat = "java/util/".concat("Spliterator");
                e eVar = m.f7574b;
                pVar.c(strConcat, eVar, eVar);
                return C.a;
        }
    }
}
