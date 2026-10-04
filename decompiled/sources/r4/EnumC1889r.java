package r4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r4.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1889r {

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC1889r f15035l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC1889r f15036m;

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC1889r f15037n;

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC1889r f15038o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ EnumC1889r[] f15039p;

    /* renamed from: k, reason: collision with root package name */
    public final W4.e f15040k;

    static {
        EnumC1889r enumC1889r = new EnumC1889r("UBYTEARRAY", 0, android.support.v4.media.session.b.s("kotlin/UByteArray", false));
        f15035l = enumC1889r;
        EnumC1889r enumC1889r2 = new EnumC1889r("USHORTARRAY", 1, android.support.v4.media.session.b.s("kotlin/UShortArray", false));
        f15036m = enumC1889r2;
        EnumC1889r enumC1889r3 = new EnumC1889r("UINTARRAY", 2, android.support.v4.media.session.b.s("kotlin/UIntArray", false));
        f15037n = enumC1889r3;
        EnumC1889r enumC1889r4 = new EnumC1889r("ULONGARRAY", 3, android.support.v4.media.session.b.s("kotlin/ULongArray", false));
        f15038o = enumC1889r4;
        EnumC1889r[] enumC1889rArr = {enumC1889r, enumC1889r2, enumC1889r3, enumC1889r4};
        f15039p = enumC1889rArr;
        AbstractC1420H.z(enumC1889rArr);
    }

    public EnumC1889r(String str, int i7, W4.b bVar) {
        this.f15040k = bVar.f();
    }

    public static EnumC1889r valueOf(String str) {
        return (EnumC1889r) Enum.valueOf(EnumC1889r.class, str);
    }

    public static EnumC1889r[] values() {
        return (EnumC1889r[]) f15039p.clone();
    }
}
