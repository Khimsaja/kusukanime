package c5;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0754a {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0754a f11162k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ EnumC0754a[] f11163l;

    static {
        EnumC0754a enumC0754a = new EnumC0754a("WARNING", 0);
        EnumC0754a enumC0754a2 = new EnumC0754a("ERROR", 1);
        f11162k = enumC0754a2;
        EnumC0754a[] enumC0754aArr = {enumC0754a, enumC0754a2, new EnumC0754a("HIDDEN", 2)};
        f11163l = enumC0754aArr;
        AbstractC1420H.z(enumC0754aArr);
    }

    public static EnumC0754a valueOf(String str) {
        return (EnumC0754a) Enum.valueOf(EnumC0754a.class, str);
    }

    public static EnumC0754a[] values() {
        return (EnumC0754a[]) f11163l.clone();
    }
}
