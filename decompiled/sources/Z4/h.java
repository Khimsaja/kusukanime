package Z4;

import java.util.Comparator;
import u4.EnumC2100f;
import u4.InterfaceC2099e;
import u4.InterfaceC2104j;
import u4.InterfaceC2105k;
import u4.InterfaceC2112s;
import u4.K;
import u4.P;

/* loaded from: classes.dex */
public final class h implements Comparator {

    /* renamed from: l, reason: collision with root package name */
    public static final h f10268l = new h(0);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10269k;

    public /* synthetic */ h(int i7) {
        this.f10269k = i7;
    }

    public static int a(InterfaceC2105k interfaceC2105k) {
        if (interfaceC2105k == null) {
            e.a(36);
            throw null;
        }
        int i7 = e.a;
        if (e.m(interfaceC2105k, EnumC2100f.f16314n)) {
            return 8;
        }
        if (interfaceC2105k instanceof InterfaceC2104j) {
            return 7;
        }
        if (interfaceC2105k instanceof K) {
            return ((K) interfaceC2105k).D() == null ? 6 : 5;
        }
        if (interfaceC2105k instanceof InterfaceC2112s) {
            return ((InterfaceC2112s) interfaceC2105k).D() == null ? 4 : 3;
        }
        if (interfaceC2105k instanceof InterfaceC2099e) {
            return 2;
        }
        return interfaceC2105k instanceof P ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer numValueOf;
        switch (this.f10269k) {
            case 0:
                InterfaceC2105k interfaceC2105k = (InterfaceC2105k) obj;
                InterfaceC2105k interfaceC2105k2 = (InterfaceC2105k) obj2;
                int iA = a(interfaceC2105k2) - a(interfaceC2105k);
                if (iA != 0) {
                    numValueOf = Integer.valueOf(iA);
                } else {
                    EnumC2100f enumC2100f = EnumC2100f.f16314n;
                    if (e.m(interfaceC2105k, enumC2100f) && e.m(interfaceC2105k2, enumC2100f)) {
                        numValueOf = 0;
                    } else {
                        int iCompareTo = interfaceC2105k.getName().f9624k.compareTo(interfaceC2105k2.getName().f9624k);
                        numValueOf = iCompareTo != 0 ? Integer.valueOf(iCompareTo) : null;
                    }
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                return 0;
            default:
                return z1.c.h(d5.e.g((InterfaceC2099e) obj).a.a, d5.e.g((InterfaceC2099e) obj2).a.a);
        }
    }
}
