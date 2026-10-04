package p5;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ b[] f14401k;

    static {
        b[] bVarArr = {new b("ERROR_CLASS", 0), new b("ERROR_FUNCTION", 1), new b("ERROR_SCOPE", 2), new b("ERROR_MODULE", 3), new b("ERROR_PROPERTY", 4), new b("ERROR_TYPE", 5), new b("PARENT_OF_ERROR_SCOPE", 6)};
        f14401k = bVarArr;
        AbstractC1420H.z(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f14401k.clone();
    }
}
