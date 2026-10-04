package a6;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0671a {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0671a f10453k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0671a f10454l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumC0671a[] f10455m;

    static {
        EnumC0671a enumC0671a = new EnumC0671a("NONE", 0);
        f10453k = enumC0671a;
        EnumC0671a enumC0671a2 = new EnumC0671a("ALL_JSON_OBJECTS", 1);
        EnumC0671a enumC0671a3 = new EnumC0671a("POLYMORPHIC", 2);
        f10454l = enumC0671a3;
        EnumC0671a[] enumC0671aArr = {enumC0671a, enumC0671a2, enumC0671a3};
        f10455m = enumC0671aArr;
        AbstractC1420H.z(enumC0671aArr);
    }

    public static EnumC0671a valueOf(String str) {
        return (EnumC0671a) Enum.valueOf(EnumC0671a.class, str);
    }

    public static EnumC0671a[] values() {
        return (EnumC0671a[]) f10455m.clone();
    }
}
