package a4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0664b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumC0664b[] f10438k;

    static {
        EnumC0664b[] enumC0664bArr = {new EnumC0664b("PRESENT", 0), new EnumC0664b("ABSENT", 1), new EnumC0664b("PRESENT_OPTIONAL", 2), new EnumC0664b("ABSENT_OPTIONAL", 3)};
        f10438k = enumC0664bArr;
        AbstractC1420H.z(enumC0664bArr);
    }

    public static EnumC0664b valueOf(String str) {
        return (EnumC0664b) Enum.valueOf(EnumC0664b.class, str);
    }

    public static EnumC0664b[] values() {
        return (EnumC0664b[]) f10438k.clone();
    }
}
