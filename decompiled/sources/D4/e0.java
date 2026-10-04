package D4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: k, reason: collision with root package name */
    public static final e0 f1577k;

    /* renamed from: l, reason: collision with root package name */
    public static final e0 f1578l;

    /* renamed from: m, reason: collision with root package name */
    public static final e0 f1579m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ e0[] f1580n;

    static {
        e0 e0Var = new e0("INVARIANT", 0);
        f1577k = e0Var;
        e0 e0Var2 = new e0("IN", 1);
        f1578l = e0Var2;
        e0 e0Var3 = new e0("OUT", 2);
        f1579m = e0Var3;
        e0[] e0VarArr = {e0Var, e0Var2, e0Var3};
        f1580n = e0VarArr;
        AbstractC1420H.z(e0VarArr);
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f1580n.clone();
    }
}
