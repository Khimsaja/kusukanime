package t4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2057h {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumC2057h[] f16059k;

    static {
        EnumC2057h[] enumC2057hArr = {new EnumC2057h("FROM_DEPENDENCIES", 0), new EnumC2057h("FROM_CLASS_LOADER", 1), new EnumC2057h("FALLBACK", 2)};
        f16059k = enumC2057hArr;
        AbstractC1420H.z(enumC2057hArr);
    }

    public static EnumC2057h valueOf(String str) {
        return (EnumC2057h) Enum.valueOf(EnumC2057h.class, str);
    }

    public static EnumC2057h[] values() {
        return (EnumC2057h[]) f16059k.clone();
    }
}
