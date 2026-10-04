package L;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Z1 {

    /* renamed from: k, reason: collision with root package name */
    public static final Z1 f5433k;

    /* renamed from: l, reason: collision with root package name */
    public static final Z1 f5434l;

    /* renamed from: m, reason: collision with root package name */
    public static final Z1 f5435m;

    /* renamed from: n, reason: collision with root package name */
    public static final Z1 f5436n;

    /* renamed from: o, reason: collision with root package name */
    public static final Z1 f5437o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ Z1[] f5438p;

    static {
        Z1 z12 = new Z1("TopBar", 0);
        f5433k = z12;
        Z1 z13 = new Z1("MainContent", 1);
        f5434l = z13;
        Z1 z14 = new Z1("Snackbar", 2);
        f5435m = z14;
        Z1 z15 = new Z1("Fab", 3);
        f5436n = z15;
        Z1 z16 = new Z1("BottomBar", 4);
        f5437o = z16;
        f5438p = new Z1[]{z12, z13, z14, z15, z16};
    }

    public static Z1 valueOf(String str) {
        return (Z1) Enum.valueOf(Z1.class, str);
    }

    public static Z1[] values() {
        return (Z1[]) f5438p.clone();
    }
}
