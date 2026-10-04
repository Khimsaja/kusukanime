package H4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: H4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0247a {

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0247a f3711l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC0247a f3712m;

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC0247a f3713n;

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC0247a f3714o;

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC0247a f3715p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ EnumC0247a[] f3716q;

    /* renamed from: k, reason: collision with root package name */
    public final String f3717k;

    static {
        EnumC0247a enumC0247a = new EnumC0247a("METHOD_RETURN_TYPE", 0, "METHOD");
        f3711l = enumC0247a;
        EnumC0247a enumC0247a2 = new EnumC0247a("VALUE_PARAMETER", 1, "PARAMETER");
        f3712m = enumC0247a2;
        EnumC0247a enumC0247a3 = new EnumC0247a("FIELD", 2, "FIELD");
        f3713n = enumC0247a3;
        EnumC0247a enumC0247a4 = new EnumC0247a("TYPE_USE", 3, "TYPE_USE");
        f3714o = enumC0247a4;
        EnumC0247a enumC0247a5 = new EnumC0247a("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");
        f3715p = enumC0247a5;
        EnumC0247a[] enumC0247aArr = {enumC0247a, enumC0247a2, enumC0247a3, enumC0247a4, enumC0247a5, new EnumC0247a("TYPE_PARAMETER", 5, "TYPE_PARAMETER")};
        f3716q = enumC0247aArr;
        AbstractC1420H.z(enumC0247aArr);
    }

    public EnumC0247a(String str, int i7, String str2) {
        this.f3717k = str2;
    }

    public static EnumC0247a valueOf(String str) {
        return (EnumC0247a) Enum.valueOf(EnumC0247a.class, str);
    }

    public static EnumC0247a[] values() {
        return (EnumC0247a[]) f3716q.clone();
    }
}
