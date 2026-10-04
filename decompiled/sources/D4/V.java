package D4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class V {

    /* renamed from: k, reason: collision with root package name */
    public static final V f1533k;

    /* renamed from: l, reason: collision with root package name */
    public static final V f1534l;

    /* renamed from: m, reason: collision with root package name */
    public static final V f1535m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ V[] f1536n;

    static {
        V v5 = new V("RETURNS_CONSTANT", 0);
        f1533k = v5;
        V v7 = new V("CALLS", 1);
        f1534l = v7;
        V v8 = new V("RETURNS_NOT_NULL", 2);
        f1535m = v8;
        V[] vArr = {v5, v7, v8};
        f1536n = vArr;
        AbstractC1420H.z(vArr);
    }

    public static V valueOf(String str) {
        return (V) Enum.valueOf(V.class, str);
    }

    public static V[] values() {
        return (V[]) f1536n.clone();
    }
}
