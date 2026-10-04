package g5;

import u4.InterfaceC2096b;
import u4.K;
import x4.C2266L;

/* loaded from: classes.dex */
public final class l implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public static final l f11754l = new l(0);

    /* renamed from: m, reason: collision with root package name */
    public static final l f11755m = new l(1);

    /* renamed from: n, reason: collision with root package name */
    public static final l f11756n = new l(2);

    /* renamed from: o, reason: collision with root package name */
    public static final l f11757o = new l(3);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11758k;

    public /* synthetic */ l(int i7) {
        this.f11758k = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f11758k) {
            case 0:
                kotlin.jvm.internal.l.f("it", (W4.e) obj);
                return Boolean.TRUE;
            case 1:
                C2266L c2266l = (C2266L) obj;
                kotlin.jvm.internal.l.f("$this$selectMostSpecificInEachOverridableGroup", c2266l);
                return c2266l;
            case 2:
                K k7 = (K) obj;
                kotlin.jvm.internal.l.f("$this$selectMostSpecificInEachOverridableGroup", k7);
                return k7;
            default:
                InterfaceC2096b interfaceC2096b = (InterfaceC2096b) obj;
                kotlin.jvm.internal.l.f("$this$selectMostSpecificInEachOverridableGroup", interfaceC2096b);
                return interfaceC2096b;
        }
    }
}
