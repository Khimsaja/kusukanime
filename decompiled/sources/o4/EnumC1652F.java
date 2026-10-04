package o4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o4.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1652F {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC1652F f13633k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC1652F f13634l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumC1652F[] f13635m;

    static {
        EnumC1652F enumC1652F = new EnumC1652F("DECLARED", 0);
        f13633k = enumC1652F;
        EnumC1652F enumC1652F2 = new EnumC1652F("INHERITED", 1);
        f13634l = enumC1652F2;
        EnumC1652F[] enumC1652FArr = {enumC1652F, enumC1652F2};
        f13635m = enumC1652FArr;
        AbstractC1420H.z(enumC1652FArr);
    }

    public static EnumC1652F valueOf(String str) {
        return (EnumC1652F) Enum.valueOf(EnumC1652F.class, str);
    }

    public static EnumC1652F[] values() {
        return (EnumC1652F[]) f13635m.clone();
    }
}
