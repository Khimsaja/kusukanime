package O;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: O.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0511p0 {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0511p0 f7154k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0511p0 f7155l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC0511p0 f7156m;

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC0511p0 f7157n;

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC0511p0 f7158o;

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC0511p0 f7159p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ EnumC0511p0[] f7160q;

    static {
        EnumC0511p0 enumC0511p0 = new EnumC0511p0("ShutDown", 0);
        f7154k = enumC0511p0;
        EnumC0511p0 enumC0511p02 = new EnumC0511p0("ShuttingDown", 1);
        f7155l = enumC0511p02;
        EnumC0511p0 enumC0511p03 = new EnumC0511p0("Inactive", 2);
        f7156m = enumC0511p03;
        EnumC0511p0 enumC0511p04 = new EnumC0511p0("InactivePendingWork", 3);
        f7157n = enumC0511p04;
        EnumC0511p0 enumC0511p05 = new EnumC0511p0("Idle", 4);
        f7158o = enumC0511p05;
        EnumC0511p0 enumC0511p06 = new EnumC0511p0("PendingWork", 5);
        f7159p = enumC0511p06;
        f7160q = new EnumC0511p0[]{enumC0511p0, enumC0511p02, enumC0511p03, enumC0511p04, enumC0511p05, enumC0511p06};
    }

    public static EnumC0511p0 valueOf(String str) {
        return (EnumC0511p0) Enum.valueOf(EnumC0511p0.class, str);
    }

    public static EnumC0511p0[] values() {
        return (EnumC0511p0[]) f7160q.clone();
    }
}
