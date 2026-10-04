package p4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: p4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1796b {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC1796b f14369k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC1796b f14370l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumC1796b[] f14371m;

    static {
        EnumC1796b enumC1796b = new EnumC1796b("JAVA", 0);
        f14369k = enumC1796b;
        EnumC1796b enumC1796b2 = new EnumC1796b("KOTLIN", 1);
        f14370l = enumC1796b2;
        EnumC1796b[] enumC1796bArr = {enumC1796b, enumC1796b2};
        f14371m = enumC1796bArr;
        AbstractC1420H.z(enumC1796bArr);
    }

    public static EnumC1796b valueOf(String str) {
        return (EnumC1796b) Enum.valueOf(EnumC1796b.class, str);
    }

    public static EnumC1796b[] values() {
        return (EnumC1796b[]) f14371m.clone();
    }
}
