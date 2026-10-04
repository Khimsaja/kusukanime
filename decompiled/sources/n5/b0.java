package n5;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: m, reason: collision with root package name */
    public static final b0 f13390m;

    /* renamed from: n, reason: collision with root package name */
    public static final b0 f13391n;

    /* renamed from: o, reason: collision with root package name */
    public static final b0 f13392o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ b0[] f13393p;

    /* renamed from: k, reason: collision with root package name */
    public final String f13394k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f13395l;

    static {
        b0 b0Var = new b0(0, "INVARIANT", "", true);
        f13390m = b0Var;
        b0 b0Var2 = new b0(1, "IN_VARIANCE", "in", false);
        f13391n = b0Var2;
        b0 b0Var3 = new b0(2, "OUT_VARIANCE", "out", true);
        f13392o = b0Var3;
        b0[] b0VarArr = {b0Var, b0Var2, b0Var3};
        f13393p = b0VarArr;
        AbstractC1420H.z(b0VarArr);
    }

    public b0(int i7, String str, String str2, boolean z7) {
        this.f13394k = str2;
        this.f13395l = z7;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f13393p.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f13394k;
    }
}
