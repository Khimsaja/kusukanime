package O4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: k, reason: collision with root package name */
    public static final s f7592k;

    /* renamed from: l, reason: collision with root package name */
    public static final s f7593l;

    /* renamed from: m, reason: collision with root package name */
    public static final s f7594m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ s[] f7595n;

    static {
        s sVar = new s("FLEXIBLE_LOWER", 0);
        f7592k = sVar;
        s sVar2 = new s("FLEXIBLE_UPPER", 1);
        f7593l = sVar2;
        s sVar3 = new s("INFLEXIBLE", 2);
        f7594m = sVar3;
        s[] sVarArr = {sVar, sVar2, sVar3};
        f7595n = sVarArr;
        AbstractC1420H.z(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f7595n.clone();
    }
}
