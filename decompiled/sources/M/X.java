package M;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class X {

    /* renamed from: k, reason: collision with root package name */
    public static final X f6275k;

    /* renamed from: l, reason: collision with root package name */
    public static final X f6276l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ X[] f6277m;

    static {
        X x7 = new X("Filled", 0);
        f6275k = x7;
        X x8 = new X("Outlined", 1);
        f6276l = x8;
        f6277m = new X[]{x7, x8};
    }

    public static X valueOf(String str) {
        return (X) Enum.valueOf(X.class, str);
    }

    public static X[] values() {
        return (X[]) f6277m.clone();
    }
}
