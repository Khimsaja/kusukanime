package H5;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class B {

    /* renamed from: k, reason: collision with root package name */
    public static final B f3790k;

    /* renamed from: l, reason: collision with root package name */
    public static final B f3791l;

    /* renamed from: m, reason: collision with root package name */
    public static final B f3792m;

    /* renamed from: n, reason: collision with root package name */
    public static final B f3793n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ B[] f3794o;

    static {
        B b4 = new B("DEFAULT", 0);
        f3790k = b4;
        B b7 = new B("LAZY", 1);
        f3791l = b7;
        B b8 = new B("ATOMIC", 2);
        f3792m = b8;
        B b9 = new B("UNDISPATCHED", 3);
        f3793n = b9;
        B[] bArr = {b4, b7, b8, b9};
        f3794o = bArr;
        AbstractC1420H.z(bArr);
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f3794o.clone();
    }
}
