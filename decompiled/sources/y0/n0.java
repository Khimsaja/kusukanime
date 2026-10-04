package y0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: k, reason: collision with root package name */
    public static final n0 f17881k;

    /* renamed from: l, reason: collision with root package name */
    public static final n0 f17882l;

    /* renamed from: m, reason: collision with root package name */
    public static final n0 f17883m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ n0[] f17884n;

    static {
        n0 n0Var = new n0("ContinueTraversal", 0);
        f17881k = n0Var;
        n0 n0Var2 = new n0("SkipSubtreeAndContinueTraversal", 1);
        f17882l = n0Var2;
        n0 n0Var3 = new n0("CancelTraversal", 2);
        f17883m = n0Var3;
        f17884n = new n0[]{n0Var, n0Var2, n0Var3};
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) f17884n.clone();
    }
}
