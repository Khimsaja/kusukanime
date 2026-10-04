package S0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: k, reason: collision with root package name */
    public static final h f8712k;

    /* renamed from: l, reason: collision with root package name */
    public static final h f8713l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ h[] f8714m;

    static {
        h hVar = new h("Ltr", 0);
        f8712k = hVar;
        h hVar2 = new h("Rtl", 1);
        f8713l = hVar2;
        f8714m = new h[]{hVar, hVar2};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f8714m.clone();
    }
}
