package r4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r4.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1890s {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumC1890s[] f15041n;

    /* renamed from: k, reason: collision with root package name */
    public final W4.b f15042k;

    /* renamed from: l, reason: collision with root package name */
    public final W4.e f15043l;

    /* renamed from: m, reason: collision with root package name */
    public final W4.b f15044m;

    static {
        EnumC1890s[] enumC1890sArr = {new EnumC1890s("UBYTE", 0, android.support.v4.media.session.b.s("kotlin/UByte", false)), new EnumC1890s("USHORT", 1, android.support.v4.media.session.b.s("kotlin/UShort", false)), new EnumC1890s("UINT", 2, android.support.v4.media.session.b.s("kotlin/UInt", false)), new EnumC1890s("ULONG", 3, android.support.v4.media.session.b.s("kotlin/ULong", false))};
        f15041n = enumC1890sArr;
        AbstractC1420H.z(enumC1890sArr);
    }

    public EnumC1890s(String str, int i7, W4.b bVar) {
        this.f15042k = bVar;
        W4.e eVarF = bVar.f();
        this.f15043l = eVarF;
        this.f15044m = new W4.b(bVar.a, W4.e.e(eVarF.b() + "Array"));
    }

    public static EnumC1890s valueOf(String str) {
        return (EnumC1890s) Enum.valueOf(EnumC1890s.class, str);
    }

    public static EnumC1890s[] values() {
        return (EnumC1890s[]) f15041n.clone();
    }
}
