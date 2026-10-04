package D;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class W {

    /* renamed from: k, reason: collision with root package name */
    public static final W f1107k;

    /* renamed from: l, reason: collision with root package name */
    public static final W f1108l;

    /* renamed from: m, reason: collision with root package name */
    public static final W f1109m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ W[] f1110n;

    static {
        W w7 = new W("None", 0);
        f1107k = w7;
        W w8 = new W("Selection", 1);
        f1108l = w8;
        W w9 = new W("Cursor", 2);
        f1109m = w9;
        f1110n = new W[]{w7, w8, w9};
    }

    public static W valueOf(String str) {
        return (W) Enum.valueOf(W.class, str);
    }

    public static W[] values() {
        return (W[]) f1110n.clone();
    }
}
