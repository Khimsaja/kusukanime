package n5;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class J {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ J[] f13364k;

    static {
        J[] jArr = {new J("CHECK_ONLY_LOWER", 0), new J("CHECK_SUBTYPE_AND_LOWER", 1), new J("SKIP_LOWER", 2)};
        f13364k = jArr;
        AbstractC1420H.z(jArr);
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) f13364k.clone();
    }
}
