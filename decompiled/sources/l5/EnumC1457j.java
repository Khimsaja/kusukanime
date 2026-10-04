package l5;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l5.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1457j {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC1457j f12797k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC1457j f12798l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumC1457j[] f12799m;

    static {
        EnumC1457j enumC1457j = new EnumC1457j("STABLE", 0);
        f12797k = enumC1457j;
        EnumC1457j enumC1457j2 = new EnumC1457j("UNSTABLE", 1);
        f12798l = enumC1457j2;
        EnumC1457j[] enumC1457jArr = {enumC1457j, enumC1457j2};
        f12799m = enumC1457jArr;
        AbstractC1420H.z(enumC1457jArr);
    }

    public static EnumC1457j valueOf(String str) {
        return (EnumC1457j) Enum.valueOf(EnumC1457j.class, str);
    }

    public static EnumC1457j[] values() {
        return (EnumC1457j[]) f12799m.clone();
    }
}
