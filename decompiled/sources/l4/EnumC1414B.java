package l4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l4.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1414B {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC1414B f12735k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC1414B f12736l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC1414B f12737m;

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC1414B f12738n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ EnumC1414B[] f12739o;

    static {
        EnumC1414B enumC1414B = new EnumC1414B("PUBLIC", 0);
        f12735k = enumC1414B;
        EnumC1414B enumC1414B2 = new EnumC1414B("PROTECTED", 1);
        f12736l = enumC1414B2;
        EnumC1414B enumC1414B3 = new EnumC1414B("INTERNAL", 2);
        f12737m = enumC1414B3;
        EnumC1414B enumC1414B4 = new EnumC1414B("PRIVATE", 3);
        f12738n = enumC1414B4;
        EnumC1414B[] enumC1414BArr = {enumC1414B, enumC1414B2, enumC1414B3, enumC1414B4};
        f12739o = enumC1414BArr;
        AbstractC1420H.z(enumC1414BArr);
    }

    public static EnumC1414B valueOf(String str) {
        return (EnumC1414B) Enum.valueOf(EnumC1414B.class, str);
    }

    public static EnumC1414B[] values() {
        return (EnumC1414B[]) f12739o.clone();
    }
}
