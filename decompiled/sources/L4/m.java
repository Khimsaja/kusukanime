package L4;

import java.lang.reflect.Modifier;
import l4.InterfaceC1443v;
import n5.AbstractC1586x;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import x4.C2266L;

/* loaded from: classes.dex */
public final class m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public static final m f6103l = new m(0);

    /* renamed from: m, reason: collision with root package name */
    public static final m f6104m = new m(1);

    /* renamed from: n, reason: collision with root package name */
    public static final m f6105n = new m(2);

    /* renamed from: o, reason: collision with root package name */
    public static final m f6106o = new m(3);

    /* renamed from: p, reason: collision with root package name */
    public static final m f6107p = new m(4);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6108k;

    public /* synthetic */ m(int i7) {
        this.f6108k = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f6108k) {
            case 0:
                int i7 = o.f6111v;
                kotlin.jvm.internal.l.f("it", (A4.x) obj);
                return Boolean.valueOf(!Modifier.isStatic(r3.b().getModifiers()));
            case 1:
                C2266L c2266l = (C2266L) obj;
                InterfaceC1443v[] interfaceC1443vArr = z.f6144m;
                kotlin.jvm.internal.l.f("$this$selectMostSpecificInEachOverridableGroup", c2266l);
                return c2266l;
            case 2:
                A4.x xVar = (A4.x) obj;
                int i8 = C.f6050p;
                kotlin.jvm.internal.l.f("it", xVar);
                return Boolean.valueOf(Modifier.isStatic(xVar.b().getModifiers()));
            case 3:
                g5.o oVar = (g5.o) obj;
                int i9 = C.f6050p;
                kotlin.jvm.internal.l.f("it", oVar);
                return oVar.d();
            default:
                int i10 = C.f6050p;
                InterfaceC2102h interfaceC2102hF = ((AbstractC1586x) obj).t0().f();
                if (interfaceC2102hF instanceof InterfaceC2099e) {
                    return (InterfaceC2099e) interfaceC2102hF;
                }
                return null;
        }
    }
}
