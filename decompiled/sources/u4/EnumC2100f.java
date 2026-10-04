package u4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2100f {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC2100f f16311k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC2100f f16312l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC2100f f16313m;

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC2100f f16314n;

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC2100f f16315o;

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC2100f f16316p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ EnumC2100f[] f16317q;

    static {
        EnumC2100f enumC2100f = new EnumC2100f("CLASS", 0);
        f16311k = enumC2100f;
        EnumC2100f enumC2100f2 = new EnumC2100f("INTERFACE", 1);
        f16312l = enumC2100f2;
        EnumC2100f enumC2100f3 = new EnumC2100f("ENUM_CLASS", 2);
        f16313m = enumC2100f3;
        EnumC2100f enumC2100f4 = new EnumC2100f("ENUM_ENTRY", 3);
        f16314n = enumC2100f4;
        EnumC2100f enumC2100f5 = new EnumC2100f("ANNOTATION_CLASS", 4);
        f16315o = enumC2100f5;
        EnumC2100f enumC2100f6 = new EnumC2100f("OBJECT", 5);
        f16316p = enumC2100f6;
        EnumC2100f[] enumC2100fArr = {enumC2100f, enumC2100f2, enumC2100f3, enumC2100f4, enumC2100f5, enumC2100f6};
        f16317q = enumC2100fArr;
        AbstractC1420H.z(enumC2100fArr);
    }

    public static EnumC2100f valueOf(String str) {
        return (EnumC2100f) Enum.valueOf(EnumC2100f.class, str);
    }

    public static EnumC2100f[] values() {
        return (EnumC2100f[]) f16317q.clone();
    }

    public final boolean a() {
        return this == f16316p || this == f16314n;
    }
}
