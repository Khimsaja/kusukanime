package s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1964i {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC1964i f15461k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC1964i f15462l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC1964i f15463m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumC1964i[] f15464n;

    static {
        EnumC1964i enumC1964i = new EnumC1964i("Initial", 0);
        f15461k = enumC1964i;
        EnumC1964i enumC1964i2 = new EnumC1964i("Main", 1);
        f15462l = enumC1964i2;
        EnumC1964i enumC1964i3 = new EnumC1964i("Final", 2);
        f15463m = enumC1964i3;
        f15464n = new EnumC1964i[]{enumC1964i, enumC1964i2, enumC1964i3};
    }

    public static EnumC1964i valueOf(String str) {
        return (EnumC1964i) Enum.valueOf(EnumC1964i.class, str);
    }

    public static EnumC1964i[] values() {
        return (EnumC1964i[]) f15464n.clone();
    }
}
