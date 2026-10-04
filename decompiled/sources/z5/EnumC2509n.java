package z5;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z5.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2509n {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumC2509n[] f19062k;

    static {
        EnumC2509n[] enumC2509nArr = {new EnumC2509n("IGNORE_CASE", 0, 2), new EnumC2509n("MULTILINE", 1, 8), new EnumC2509n("LITERAL", 2, 16), new EnumC2509n("UNIX_LINES", 3, 1), new EnumC2509n("COMMENTS", 4, 4), new EnumC2509n("DOT_MATCHES_ALL", 5, 32), new EnumC2509n("CANON_EQ", 6, 128)};
        f19062k = enumC2509nArr;
        AbstractC1420H.z(enumC2509nArr);
    }

    public EnumC2509n(String str, int i7, int i8) {
    }

    public static EnumC2509n valueOf(String str) {
        return (EnumC2509n) Enum.valueOf(EnumC2509n.class, str);
    }

    public static EnumC2509n[] values() {
        return (EnumC2509n[]) f19062k.clone();
    }
}
