package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1624v {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC1624v f13538k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC1624v f13539l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC1624v f13540m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumC1624v[] f13541n;

    static {
        EnumC1624v enumC1624v = new EnumC1624v("PreEnter", 0);
        f13538k = enumC1624v;
        EnumC1624v enumC1624v2 = new EnumC1624v("Visible", 1);
        f13539l = enumC1624v2;
        EnumC1624v enumC1624v3 = new EnumC1624v("PostExit", 2);
        f13540m = enumC1624v3;
        f13541n = new EnumC1624v[]{enumC1624v, enumC1624v2, enumC1624v3};
    }

    public static EnumC1624v valueOf(String str) {
        return (EnumC1624v) Enum.valueOf(EnumC1624v.class, str);
    }

    public static EnumC1624v[] values() {
        return (EnumC1624v[]) f13541n.clone();
    }
}
