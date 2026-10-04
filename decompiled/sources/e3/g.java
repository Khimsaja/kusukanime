package e3;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: k, reason: collision with root package name */
    public static final g f11352k;

    /* renamed from: l, reason: collision with root package name */
    public static final g f11353l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ g[] f11354m;

    static {
        g gVar = new g("FILL", 0);
        f11352k = gVar;
        g gVar2 = new g("FIT", 1);
        f11353l = gVar2;
        g[] gVarArr = {gVar, gVar2};
        f11354m = gVarArr;
        AbstractC1420H.z(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f11354m.clone();
    }
}
