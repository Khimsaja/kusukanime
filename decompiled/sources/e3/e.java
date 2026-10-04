package e3;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: k, reason: collision with root package name */
    public static final e f11348k;

    /* renamed from: l, reason: collision with root package name */
    public static final e f11349l;

    /* renamed from: m, reason: collision with root package name */
    public static final e f11350m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ e[] f11351n;

    static {
        e eVar = new e("EXACT", 0);
        f11348k = eVar;
        e eVar2 = new e("INEXACT", 1);
        f11349l = eVar2;
        e eVar3 = new e("AUTOMATIC", 2);
        f11350m = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        f11351n = eVarArr;
        AbstractC1420H.z(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f11351n.clone();
    }
}
