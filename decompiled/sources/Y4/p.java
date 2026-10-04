package Y4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: k, reason: collision with root package name */
    public static final p f10235k;

    /* renamed from: l, reason: collision with root package name */
    public static final p f10236l;

    /* renamed from: m, reason: collision with root package name */
    public static final p f10237m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ p[] f10238n;

    static {
        p pVar = new p("ALL", 0);
        f10235k = pVar;
        p pVar2 = new p("ONLY_NON_SYNTHESIZED", 1);
        f10236l = pVar2;
        p pVar3 = new p("NONE", 2);
        f10237m = pVar3;
        p[] pVarArr = {pVar, pVar2, pVar3};
        f10238n = pVarArr;
        AbstractC1420H.z(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f10238n.clone();
    }
}
