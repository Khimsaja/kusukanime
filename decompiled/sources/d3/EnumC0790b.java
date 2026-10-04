package d3;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: d3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0790b {

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC0790b f11237m;

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC0790b f11238n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ EnumC0790b[] f11239o;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f11240k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f11241l;

    static {
        EnumC0790b enumC0790b = new EnumC0790b("ENABLED", 0, true, true);
        f11237m = enumC0790b;
        EnumC0790b enumC0790b2 = new EnumC0790b("READ_ONLY", 1, true, false);
        EnumC0790b enumC0790b3 = new EnumC0790b("WRITE_ONLY", 2, false, true);
        EnumC0790b enumC0790b4 = new EnumC0790b("DISABLED", 3, false, false);
        f11238n = enumC0790b4;
        EnumC0790b[] enumC0790bArr = {enumC0790b, enumC0790b2, enumC0790b3, enumC0790b4};
        f11239o = enumC0790bArr;
        AbstractC1420H.z(enumC0790bArr);
    }

    public EnumC0790b(String str, int i7, boolean z7, boolean z8) {
        this.f11240k = z7;
        this.f11241l = z8;
    }

    public static EnumC0790b valueOf(String str) {
        return (EnumC0790b) Enum.valueOf(EnumC0790b.class, str);
    }

    public static EnumC0790b[] values() {
        return (EnumC0790b[]) f11239o.clone();
    }
}
