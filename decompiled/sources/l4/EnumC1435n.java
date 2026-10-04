package l4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1435n {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC1435n f12753k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC1435n f12754l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC1435n f12755m;

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC1435n f12756n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ EnumC1435n[] f12757o;

    static {
        EnumC1435n enumC1435n = new EnumC1435n("INSTANCE", 0);
        f12753k = enumC1435n;
        EnumC1435n enumC1435n2 = new EnumC1435n("CONTEXT", 1);
        f12754l = enumC1435n2;
        EnumC1435n enumC1435n3 = new EnumC1435n("EXTENSION_RECEIVER", 2);
        f12755m = enumC1435n3;
        EnumC1435n enumC1435n4 = new EnumC1435n("VALUE", 3);
        f12756n = enumC1435n4;
        EnumC1435n[] enumC1435nArr = {enumC1435n, enumC1435n2, enumC1435n3, enumC1435n4};
        f12757o = enumC1435nArr;
        AbstractC1420H.z(enumC1435nArr);
    }

    public static EnumC1435n valueOf(String str) {
        return (EnumC1435n) Enum.valueOf(EnumC1435n.class, str);
    }

    public static EnumC1435n[] values() {
        return (EnumC1435n[]) f12757o.clone();
    }
}
