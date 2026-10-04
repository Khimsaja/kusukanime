package p5;

import P3.y;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import l4.AbstractC1420H;
import n5.M;
import u4.InterfaceC2105k;

/* loaded from: classes.dex */
public final class l {
    public static final l a = new l();

    /* renamed from: b, reason: collision with root package name */
    public static final e f14455b = e.f14403k;

    /* renamed from: c, reason: collision with root package name */
    public static final C1812a f14456c;

    /* renamed from: d, reason: collision with root package name */
    public static final i f14457d;

    /* renamed from: e, reason: collision with root package name */
    public static final i f14458e;

    /* renamed from: f, reason: collision with root package name */
    public static final Set f14459f;

    static {
        b[] bVarArr = b.f14401k;
        f14456c = new C1812a(W4.e.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));
        f14457d = c(k.f14444r, new String[0]);
        f14458e = c(k.f14429E, new String[0]);
        f14459f = AbstractC1420H.K(new f());
    }

    public static final g a(h hVar, boolean z7, String... strArr) {
        kotlin.jvm.internal.l.f("formatParams", strArr);
        if (!z7) {
            return new g(hVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        kotlin.jvm.internal.l.f("formatParams", strArr2);
        return new m(hVar, (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static final g b(h hVar, String... strArr) {
        return a(hVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final i c(k kVar, String... strArr) {
        kotlin.jvm.internal.l.f("kind", kVar);
        y yVar = y.f7779k;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        kotlin.jvm.internal.l.f("formatParams", strArr2);
        return e(kVar, yVar, d(kVar, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static j d(k kVar, String... strArr) {
        kotlin.jvm.internal.l.f("kind", kVar);
        kotlin.jvm.internal.l.f("formatParams", strArr);
        return new j(kVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static i e(k kVar, List list, M m7, String... strArr) {
        kotlin.jvm.internal.l.f("kind", kVar);
        kotlin.jvm.internal.l.f("formatParams", strArr);
        return new i(m7, b(h.f14412o, m7.toString()), kVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean f(InterfaceC2105k interfaceC2105k) {
        if (interfaceC2105k != null) {
            return (interfaceC2105k instanceof C1812a) || (interfaceC2105k.k() instanceof C1812a) || interfaceC2105k == f14455b;
        }
        return false;
    }
}
