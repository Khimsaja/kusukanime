package U2;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: k, reason: collision with root package name */
    public static final e f9204k;

    /* renamed from: l, reason: collision with root package name */
    public static final e f9205l;

    /* renamed from: m, reason: collision with root package name */
    public static final e f9206m;

    /* renamed from: n, reason: collision with root package name */
    public static final e f9207n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ e[] f9208o;

    static {
        e eVar = new e("MEMORY_CACHE", 0);
        f9204k = eVar;
        e eVar2 = new e("MEMORY", 1);
        f9205l = eVar2;
        e eVar3 = new e("DISK", 2);
        f9206m = eVar3;
        e eVar4 = new e("NETWORK", 3);
        f9207n = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        f9208o = eVarArr;
        AbstractC1420H.z(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f9208o.clone();
    }
}
