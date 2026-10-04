package D;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class V {

    /* renamed from: k, reason: collision with root package name */
    public static final V f1103k;

    /* renamed from: l, reason: collision with root package name */
    public static final V f1104l;

    /* renamed from: m, reason: collision with root package name */
    public static final V f1105m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ V[] f1106n;

    static {
        V v5 = new V("Cursor", 0);
        f1103k = v5;
        V v7 = new V("SelectionStart", 1);
        f1104l = v7;
        V v8 = new V("SelectionEnd", 2);
        f1105m = v8;
        f1106n = new V[]{v5, v7, v8};
    }

    public static V valueOf(String str) {
        return (V) Enum.valueOf(V.class, str);
    }

    public static V[] values() {
        return (V[]) f1106n.clone();
    }
}
