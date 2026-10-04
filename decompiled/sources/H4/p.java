package H4;

import io.ktor.util.GzipHeaderFlags;
import java.util.HashMap;
import u4.AbstractC2108n;
import u4.InterfaceC2088D;
import u4.InterfaceC2097c;
import u4.InterfaceC2105k;
import u4.InterfaceC2107m;
import u4.N;
import x4.AbstractC2257C;
import y4.C2415a;
import y4.C2416b;
import y4.C2417c;

/* loaded from: classes.dex */
public abstract class p {
    public static final o a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f3740b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f3741c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f3742d;

    static {
        C2415a c2415a = C2415a.f18371c;
        o oVar = new o(c2415a, 0);
        a = oVar;
        C2417c c2417c = C2417c.f18373c;
        o oVar2 = new o(c2417c, 1);
        f3740b = oVar2;
        C2416b c2416b = C2416b.f18372c;
        o oVar3 = new o(c2416b, 2);
        f3741c = oVar3;
        HashMap map = new HashMap();
        f3742d = map;
        map.put(c2415a, oVar);
        map.put(c2417c, oVar2);
        map.put(c2416b, oVar3);
    }

    public static /* synthetic */ void a(int i7) {
        String str = (i7 == 5 || i7 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 5 || i7 == 6) ? 2 : 3];
        switch (i7) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i7 == 5 || i7 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i7 == 2 || i7 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i7 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i7 != 5 && i7 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 5 && i7 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(N n7, InterfaceC2107m interfaceC2107m, InterfaceC2105k interfaceC2105k) {
        if (interfaceC2105k == null) {
            a(1);
            throw null;
        }
        int i7 = Z4.e.a;
        if (c(interfaceC2107m instanceof InterfaceC2097c ? Z4.e.s((InterfaceC2097c) interfaceC2107m) : interfaceC2107m, interfaceC2105k)) {
            return true;
        }
        return AbstractC2108n.f16320c.a(n7, interfaceC2107m, interfaceC2105k);
    }

    public static boolean c(InterfaceC2107m interfaceC2107m, InterfaceC2105k interfaceC2105k) {
        if (interfaceC2107m == null) {
            a(2);
            throw null;
        }
        if (interfaceC2105k == null) {
            a(3);
            throw null;
        }
        InterfaceC2088D interfaceC2088D = (InterfaceC2088D) Z4.e.i(interfaceC2107m, InterfaceC2088D.class, false);
        InterfaceC2088D interfaceC2088D2 = (InterfaceC2088D) Z4.e.i(interfaceC2105k, InterfaceC2088D.class, false);
        return (interfaceC2088D2 == null || interfaceC2088D == null || !((AbstractC2257C) interfaceC2088D).f17354o.equals(((AbstractC2257C) interfaceC2088D2).f17354o)) ? false : true;
    }
}
