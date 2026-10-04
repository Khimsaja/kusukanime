package K5;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class P {

    /* renamed from: k, reason: collision with root package name */
    public static final P f4774k;

    /* renamed from: l, reason: collision with root package name */
    public static final P f4775l;

    /* renamed from: m, reason: collision with root package name */
    public static final P f4776m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ P[] f4777n;

    static {
        P p7 = new P("START", 0);
        f4774k = p7;
        P p8 = new P("STOP", 1);
        f4775l = p8;
        P p9 = new P("STOP_AND_RESET_REPLAY_CACHE", 2);
        f4776m = p9;
        P[] pArr = {p7, p8, p9};
        f4777n = pArr;
        AbstractC1420H.z(pArr);
    }

    public static P valueOf(String str) {
        return (P) Enum.valueOf(P.class, str);
    }

    public static P[] values() {
        return (P[]) f4777n.clone();
    }
}
