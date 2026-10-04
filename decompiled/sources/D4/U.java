package D4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class U {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ U[] f1532k;

    static {
        U[] uArr = {new U("AT_MOST_ONCE", 0), new U("EXACTLY_ONCE", 1), new U("AT_LEAST_ONCE", 2)};
        f1532k = uArr;
        AbstractC1420H.z(uArr);
    }

    public static U valueOf(String str) {
        return (U) Enum.valueOf(U.class, str);
    }

    public static U[] values() {
        return (U[]) f1532k.clone();
    }
}
