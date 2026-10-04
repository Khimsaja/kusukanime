package O3;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: O3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0555d {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0555d f7516k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0555d f7517l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC0555d f7518m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumC0555d[] f7519n;

    static {
        EnumC0555d enumC0555d = new EnumC0555d("WARNING", 0);
        f7516k = enumC0555d;
        EnumC0555d enumC0555d2 = new EnumC0555d("ERROR", 1);
        f7517l = enumC0555d2;
        EnumC0555d enumC0555d3 = new EnumC0555d("HIDDEN", 2);
        f7518m = enumC0555d3;
        EnumC0555d[] enumC0555dArr = {enumC0555d, enumC0555d2, enumC0555d3};
        f7519n = enumC0555dArr;
        AbstractC1420H.z(enumC0555dArr);
    }

    public static EnumC0555d valueOf(String str) {
        return (EnumC0555d) Enum.valueOf(EnumC0555d.class, str);
    }

    public static EnumC0555d[] values() {
        return (EnumC0555d[]) f7519n.clone();
    }
}
