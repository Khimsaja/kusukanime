package r4;

import e4.InterfaceC0821a;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import n5.B;

/* renamed from: r4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1877f implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14932k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC1880i f14933l;

    public /* synthetic */ C1877f(AbstractC1880i abstractC1880i, int i7) {
        this.f14932k = i7;
        this.f14933l = abstractC1880i;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        AbstractC1880i abstractC1880i = this.f14933l;
        switch (this.f14932k) {
            case 0:
                return Arrays.asList(abstractC1880i.l().F(AbstractC1887p.f15028k), abstractC1880i.l().F(AbstractC1887p.f15030m), abstractC1880i.l().F(AbstractC1887p.f15031n), abstractC1880i.l().F(AbstractC1887p.f15029l));
            default:
                EnumMap enumMap = new EnumMap(EnumC1882k.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (EnumC1882k enumC1882k : EnumC1882k.values()) {
                    String strB = enumC1882k.f14953k.b();
                    if (strB == null) {
                        abstractC1880i.getClass();
                        AbstractC1880i.a(47);
                        throw null;
                    }
                    B bG = abstractC1880i.k(strB).g();
                    if (bG == null) {
                        AbstractC1880i.a(48);
                        throw null;
                    }
                    String strB2 = enumC1882k.f14954l.b();
                    if (strB2 == null) {
                        AbstractC1880i.a(47);
                        throw null;
                    }
                    B bG2 = abstractC1880i.k(strB2).g();
                    if (bG2 == null) {
                        AbstractC1880i.a(48);
                        throw null;
                    }
                    enumMap.put((EnumMap) enumC1882k, (EnumC1882k) bG2);
                    map.put(bG, bG2);
                    map2.put(bG2, bG);
                }
                return new C1879h(enumMap, map, map2);
        }
    }
}
