package s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1903a0 {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC1903a0 f15259k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC1903a0 f15260l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumC1903a0[] f15261m;

    static {
        EnumC1903a0 enumC1903a0 = new EnumC1903a0("Vertical", 0);
        f15259k = enumC1903a0;
        EnumC1903a0 enumC1903a02 = new EnumC1903a0("Horizontal", 1);
        f15260l = enumC1903a02;
        f15261m = new EnumC1903a0[]{enumC1903a0, enumC1903a02};
    }

    public static EnumC1903a0 valueOf(String str) {
        return (EnumC1903a0) Enum.valueOf(EnumC1903a0.class, str);
    }

    public static EnumC1903a0[] values() {
        return (EnumC1903a0[]) f15261m.clone();
    }
}
