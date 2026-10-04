package a6;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0672b {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0672b f10456k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0672b f10457l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumC0672b[] f10458m;

    static {
        EnumC0672b enumC0672b = new EnumC0672b("WHITESPACE_SEPARATED", 0);
        f10456k = enumC0672b;
        EnumC0672b enumC0672b2 = new EnumC0672b("ARRAY_WRAPPED", 1);
        f10457l = enumC0672b2;
        EnumC0672b[] enumC0672bArr = {enumC0672b, enumC0672b2, new EnumC0672b("AUTO_DETECT", 2)};
        f10458m = enumC0672bArr;
        AbstractC1420H.z(enumC0672bArr);
    }

    public static EnumC0672b valueOf(String str) {
        return (EnumC0672b) Enum.valueOf(EnumC0672b.class, str);
    }

    public static EnumC0672b[] values() {
        return (EnumC0672b[]) f10458m.clone();
    }
}
