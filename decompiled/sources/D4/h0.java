package D4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: k, reason: collision with root package name */
    public static final h0 f1590k;

    /* renamed from: l, reason: collision with root package name */
    public static final h0 f1591l;

    /* renamed from: m, reason: collision with root package name */
    public static final h0 f1592m;

    /* renamed from: n, reason: collision with root package name */
    public static final h0 f1593n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ h0[] f1594o;

    static {
        h0 h0Var = new h0("LANGUAGE_VERSION", 0);
        f1590k = h0Var;
        h0 h0Var2 = new h0("COMPILER_VERSION", 1);
        f1591l = h0Var2;
        h0 h0Var3 = new h0("API_VERSION", 2);
        f1592m = h0Var3;
        h0 h0Var4 = new h0("UNKNOWN", 3);
        f1593n = h0Var4;
        h0[] h0VarArr = {h0Var, h0Var2, h0Var3, h0Var4};
        f1594o = h0VarArr;
        AbstractC1420H.z(h0VarArr);
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) f1594o.clone();
    }
}
