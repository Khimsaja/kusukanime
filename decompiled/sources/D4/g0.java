package D4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: k, reason: collision with root package name */
    public static final g0 f1585k;

    /* renamed from: l, reason: collision with root package name */
    public static final g0 f1586l;

    /* renamed from: m, reason: collision with root package name */
    public static final g0 f1587m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ g0[] f1588n;

    static {
        g0 g0Var = new g0("WARNING", 0);
        f1585k = g0Var;
        g0 g0Var2 = new g0("ERROR", 1);
        f1586l = g0Var2;
        g0 g0Var3 = new g0("HIDDEN", 2);
        f1587m = g0Var3;
        g0[] g0VarArr = {g0Var, g0Var2, g0Var3};
        f1588n = g0VarArr;
        AbstractC1420H.z(g0VarArr);
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f1588n.clone();
    }
}
