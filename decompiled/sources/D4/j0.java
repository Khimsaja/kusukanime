package D4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: l, reason: collision with root package name */
    public static final j0 f1600l;

    /* renamed from: m, reason: collision with root package name */
    public static final j0 f1601m;

    /* renamed from: n, reason: collision with root package name */
    public static final j0 f1602n;

    /* renamed from: o, reason: collision with root package name */
    public static final j0 f1603o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ j0[] f1604p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ V3.b f1605q;

    /* renamed from: k, reason: collision with root package name */
    public final C1.i f1606k;

    static {
        j0 j0Var = new j0("FINAL", 0, 0);
        f1600l = j0Var;
        j0 j0Var2 = new j0("OPEN", 1, 1);
        f1601m = j0Var2;
        j0 j0Var3 = new j0("ABSTRACT", 2, 2);
        f1602n = j0Var3;
        j0 j0Var4 = new j0("SEALED", 3, 3);
        f1603o = j0Var4;
        j0[] j0VarArr = {j0Var, j0Var2, j0Var3, j0Var4};
        f1604p = j0VarArr;
        f1605q = AbstractC1420H.z(j0VarArr);
    }

    public j0(String str, int i7, int i8) {
        T4.c cVar = T4.e.f9085e;
        kotlin.jvm.internal.l.e("MODALITY", cVar);
        this.f1606k = new C1.i(cVar, i8);
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) f1604p.clone();
    }
}
