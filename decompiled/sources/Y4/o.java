package Y4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: k, reason: collision with root package name */
    public static final o f10232k;

    /* renamed from: l, reason: collision with root package name */
    public static final o f10233l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ o[] f10234m;

    static {
        o oVar = new o("RENDER_OVERRIDE", 0);
        f10232k = oVar;
        o oVar2 = new o("RENDER_OPEN", 1);
        f10233l = oVar2;
        o[] oVarArr = {oVar, oVar2, new o("RENDER_OPEN_OVERRIDE", 2)};
        f10234m = oVarArr;
        AbstractC1420H.z(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f10234m.clone();
    }
}
