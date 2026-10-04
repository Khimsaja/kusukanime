package p4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: p4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1795a {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC1795a f14366k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC1795a f14367l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumC1795a[] f14368m;

    static {
        EnumC1795a enumC1795a = new EnumC1795a("CALL_BY_NAME", 0);
        f14366k = enumC1795a;
        EnumC1795a enumC1795a2 = new EnumC1795a("POSITIONAL_CALL", 1);
        f14367l = enumC1795a2;
        EnumC1795a[] enumC1795aArr = {enumC1795a, enumC1795a2};
        f14368m = enumC1795aArr;
        AbstractC1420H.z(enumC1795aArr);
    }

    public static EnumC1795a valueOf(String str) {
        return (EnumC1795a) Enum.valueOf(EnumC1795a.class, str);
    }

    public static EnumC1795a[] values() {
        return (EnumC1795a[]) f14368m.clone();
    }
}
