package f0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: f0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0865r {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0865r f11420k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0865r f11421l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC0865r f11422m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumC0865r[] f11423n;

    static {
        EnumC0865r enumC0865r = new EnumC0865r("Active", 0);
        f11420k = enumC0865r;
        EnumC0865r enumC0865r2 = new EnumC0865r("ActiveParent", 1);
        f11421l = enumC0865r2;
        EnumC0865r enumC0865r3 = new EnumC0865r("Captured", 2);
        EnumC0865r enumC0865r4 = new EnumC0865r("Inactive", 3);
        f11422m = enumC0865r4;
        f11423n = new EnumC0865r[]{enumC0865r, enumC0865r2, enumC0865r3, enumC0865r4};
    }

    public static EnumC0865r valueOf(String str) {
        return (EnumC0865r) Enum.valueOf(EnumC0865r.class, str);
    }

    public static EnumC0865r[] values() {
        return (EnumC0865r[]) f11423n.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new D6.r();
            }
        }
        return true;
    }
}
