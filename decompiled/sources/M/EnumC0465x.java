package M;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: M.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0465x {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0465x f6363k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0465x f6364l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC0465x f6365m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumC0465x[] f6366n;

    static {
        EnumC0465x enumC0465x = new EnumC0465x("Focused", 0);
        f6363k = enumC0465x;
        EnumC0465x enumC0465x2 = new EnumC0465x("UnfocusedEmpty", 1);
        f6364l = enumC0465x2;
        EnumC0465x enumC0465x3 = new EnumC0465x("UnfocusedNotEmpty", 2);
        f6365m = enumC0465x3;
        f6366n = new EnumC0465x[]{enumC0465x, enumC0465x2, enumC0465x3};
    }

    public static EnumC0465x valueOf(String str) {
        return (EnumC0465x) Enum.valueOf(EnumC0465x.class, str);
    }

    public static EnumC0465x[] values() {
        return (EnumC0465x[]) f6366n.clone();
    }
}
