package m5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m5.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1522k {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC1522k f12986k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC1522k f12987l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC1522k f12988m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumC1522k[] f12989n;

    static {
        EnumC1522k enumC1522k = new EnumC1522k("NOT_COMPUTED", 0);
        f12986k = enumC1522k;
        EnumC1522k enumC1522k2 = new EnumC1522k("COMPUTING", 1);
        f12987l = enumC1522k2;
        EnumC1522k enumC1522k3 = new EnumC1522k("RECURSION_WAS_DETECTED", 2);
        f12988m = enumC1522k3;
        f12989n = new EnumC1522k[]{enumC1522k, enumC1522k2, enumC1522k3};
    }

    public static EnumC1522k valueOf(String str) {
        return (EnumC1522k) Enum.valueOf(EnumC1522k.class, str);
    }

    public static EnumC1522k[] values() {
        return (EnumC1522k[]) f12989n.clone();
    }
}
