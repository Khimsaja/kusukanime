package q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class X {

    /* renamed from: k, reason: collision with root package name */
    public static final X f14513k;

    /* renamed from: l, reason: collision with root package name */
    public static final X f14514l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ X[] f14515m;

    static {
        X x7 = new X("Default", 0);
        f14513k = x7;
        X x8 = new X("UserInput", 1);
        f14514l = x8;
        f14515m = new X[]{x7, x8, new X("PreventUserInput", 2)};
    }

    public static X valueOf(String str) {
        return (X) Enum.valueOf(X.class, str);
    }

    public static X[] values() {
        return (X[]) f14515m.clone();
    }
}
