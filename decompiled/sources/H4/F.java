package H4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public class F {

    /* renamed from: l, reason: collision with root package name */
    public static final F f3695l;

    /* renamed from: m, reason: collision with root package name */
    public static final F f3696m;

    /* renamed from: n, reason: collision with root package name */
    public static final F f3697n;

    /* renamed from: o, reason: collision with root package name */
    public static final E f3698o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ F[] f3699p;

    /* renamed from: k, reason: collision with root package name */
    public final Object f3700k;

    static {
        F f5 = new F("NULL", 0, null);
        f3695l = f5;
        F f7 = new F("INDEX", 1, -1);
        f3696m = f7;
        F f8 = new F("FALSE", 2, Boolean.FALSE);
        f3697n = f8;
        E e7 = new E("MAP_GET_OR_DEFAULT", 3, null);
        f3698o = e7;
        F[] fArr = {f5, f7, f8, e7};
        f3699p = fArr;
        AbstractC1420H.z(fArr);
    }

    public F(String str, int i7, Object obj) {
        this.f3700k = obj;
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f3699p.clone();
    }
}
