package M4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: k, reason: collision with root package name */
    public static final b f6553k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f6554l;

    /* renamed from: m, reason: collision with root package name */
    public static final b f6555m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ b[] f6556n;

    static {
        b bVar = new b("INFLEXIBLE", 0);
        f6553k = bVar;
        b bVar2 = new b("FLEXIBLE_UPPER_BOUND", 1);
        f6554l = bVar2;
        b bVar3 = new b("FLEXIBLE_LOWER_BOUND", 2);
        f6555m = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f6556n = bVarArr;
        AbstractC1420H.z(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f6556n.clone();
    }
}
