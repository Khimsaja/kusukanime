package T3;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: k, reason: collision with root package name */
    public static final a f9048k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f9049l;

    /* renamed from: m, reason: collision with root package name */
    public static final a f9050m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ a[] f9051n;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f9048k = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f9049l = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f9050m = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f9051n = aVarArr;
        AbstractC1420H.z(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f9051n.clone();
    }
}
