package H4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class B {

    /* renamed from: l, reason: collision with root package name */
    public static final B f3682l;

    /* renamed from: m, reason: collision with root package name */
    public static final B f3683m;

    /* renamed from: n, reason: collision with root package name */
    public static final B f3684n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ B[] f3685o;

    /* renamed from: k, reason: collision with root package name */
    public final String f3686k;

    static {
        B b4 = new B("IGNORE", 0, "ignore");
        f3682l = b4;
        B b7 = new B("WARN", 1, "warn");
        f3683m = b7;
        B b8 = new B("STRICT", 2, "strict");
        f3684n = b8;
        B[] bArr = {b4, b7, b8};
        f3685o = bArr;
        AbstractC1420H.z(bArr);
    }

    public B(String str, int i7, String str2) {
        this.f3686k = str2;
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f3685o.clone();
    }
}
