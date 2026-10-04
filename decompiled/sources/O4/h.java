package O4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: k, reason: collision with root package name */
    public static final h f7562k;

    /* renamed from: l, reason: collision with root package name */
    public static final h f7563l;

    /* renamed from: m, reason: collision with root package name */
    public static final h f7564m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ h[] f7565n;

    static {
        h hVar = new h("FORCE_FLEXIBILITY", 0);
        f7562k = hVar;
        h hVar2 = new h("NULLABLE", 1);
        f7563l = hVar2;
        h hVar3 = new h("NOT_NULL", 2);
        f7564m = hVar3;
        h[] hVarArr = {hVar, hVar2, hVar3};
        f7565n = hVarArr;
        AbstractC1420H.z(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f7565n.clone();
    }
}
