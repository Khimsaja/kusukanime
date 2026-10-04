package L;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: L.l2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0394l2 {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0394l2 f5649k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0394l2 f5650l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC0394l2 f5651m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumC0394l2[] f5652n;

    static {
        EnumC0394l2 enumC0394l2 = new EnumC0394l2("Hidden", 0);
        f5649k = enumC0394l2;
        EnumC0394l2 enumC0394l22 = new EnumC0394l2("Expanded", 1);
        f5650l = enumC0394l22;
        EnumC0394l2 enumC0394l23 = new EnumC0394l2("PartiallyExpanded", 2);
        f5651m = enumC0394l23;
        f5652n = new EnumC0394l2[]{enumC0394l2, enumC0394l22, enumC0394l23};
    }

    public static EnumC0394l2 valueOf(String str) {
        return (EnumC0394l2) Enum.valueOf(EnumC0394l2.class, str);
    }

    public static EnumC0394l2[] values() {
        return (EnumC0394l2[]) f5652n.clone();
    }
}
