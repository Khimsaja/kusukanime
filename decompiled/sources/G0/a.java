package G0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: k, reason: collision with root package name */
    public static final a f2595k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f2596l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ a[] f2597m;

    static {
        a aVar = new a("On", 0);
        f2595k = aVar;
        a aVar2 = new a("Off", 1);
        f2596l = aVar2;
        f2597m = new a[]{aVar, aVar2, new a("Indeterminate", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f2597m.clone();
    }
}
