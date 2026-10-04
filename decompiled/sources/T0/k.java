package T0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: k, reason: collision with root package name */
    public static final k f8844k;

    /* renamed from: l, reason: collision with root package name */
    public static final k f8845l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ k[] f8846m;

    static {
        k kVar = new k("Ltr", 0);
        f8844k = kVar;
        k kVar2 = new k("Rtl", 1);
        f8845l = kVar2;
        f8846m = new k[]{kVar, kVar2};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f8846m.clone();
    }
}
