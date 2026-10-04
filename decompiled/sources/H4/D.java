package H4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class D {

    /* renamed from: k, reason: collision with root package name */
    public static final D f3691k;

    /* renamed from: l, reason: collision with root package name */
    public static final D f3692l;

    /* renamed from: m, reason: collision with root package name */
    public static final D f3693m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ D[] f3694n;

    static {
        D d4 = new D("ONE_COLLECTION_PARAMETER", 0);
        f3691k = d4;
        D d6 = new D("OBJECT_PARAMETER_NON_GENERIC", 1);
        f3692l = d6;
        D d7 = new D("OBJECT_PARAMETER_GENERIC", 2);
        f3693m = d7;
        D[] dArr = {d4, d6, d7};
        f3694n = dArr;
        AbstractC1420H.z(dArr);
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f3694n.clone();
    }
}
