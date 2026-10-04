package u4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u4.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2117x {

    /* renamed from: k, reason: collision with root package name */
    public static final N f16341k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC2117x f16342l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC2117x f16343m;

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC2117x f16344n;

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC2117x f16345o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ EnumC2117x[] f16346p;

    static {
        EnumC2117x enumC2117x = new EnumC2117x("FINAL", 0);
        f16342l = enumC2117x;
        EnumC2117x enumC2117x2 = new EnumC2117x("SEALED", 1);
        f16343m = enumC2117x2;
        EnumC2117x enumC2117x3 = new EnumC2117x("OPEN", 2);
        f16344n = enumC2117x3;
        EnumC2117x enumC2117x4 = new EnumC2117x("ABSTRACT", 3);
        f16345o = enumC2117x4;
        EnumC2117x[] enumC2117xArr = {enumC2117x, enumC2117x2, enumC2117x3, enumC2117x4};
        f16346p = enumC2117xArr;
        AbstractC1420H.z(enumC2117xArr);
        f16341k = new N(5);
    }

    public static EnumC2117x valueOf(String str) {
        return (EnumC2117x) Enum.valueOf(EnumC2117x.class, str);
    }

    public static EnumC2117x[] values() {
        return (EnumC2117x[]) f16346p.clone();
    }
}
