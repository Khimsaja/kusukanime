package v4;

import f1.AbstractC0870c;
import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: v4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2156d {

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC2156d f16639l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC2156d f16640m;

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC2156d f16641n;

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC2156d f16642o;

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC2156d f16643p;

    /* renamed from: q, reason: collision with root package name */
    public static final EnumC2156d f16644q;

    /* renamed from: r, reason: collision with root package name */
    public static final EnumC2156d f16645r;

    /* renamed from: s, reason: collision with root package name */
    public static final EnumC2156d f16646s;

    /* renamed from: t, reason: collision with root package name */
    public static final EnumC2156d f16647t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC2156d[] f16648u;

    /* renamed from: k, reason: collision with root package name */
    public final String f16649k;

    static {
        EnumC2156d enumC2156d = new EnumC2156d("ALL", 0, null);
        EnumC2156d enumC2156d2 = new EnumC2156d("FIELD", 1, null);
        f16639l = enumC2156d2;
        EnumC2156d enumC2156d3 = new EnumC2156d("FILE", 2, null);
        f16640m = enumC2156d3;
        EnumC2156d enumC2156d4 = new EnumC2156d("PROPERTY", 3, null);
        f16641n = enumC2156d4;
        EnumC2156d enumC2156d5 = new EnumC2156d("PROPERTY_GETTER", 4, "get");
        f16642o = enumC2156d5;
        EnumC2156d enumC2156d6 = new EnumC2156d("PROPERTY_SETTER", 5, "set");
        f16643p = enumC2156d6;
        EnumC2156d enumC2156d7 = new EnumC2156d("RECEIVER", 6, null);
        f16644q = enumC2156d7;
        EnumC2156d enumC2156d8 = new EnumC2156d("CONSTRUCTOR_PARAMETER", 7, "param");
        f16645r = enumC2156d8;
        EnumC2156d enumC2156d9 = new EnumC2156d("SETTER_PARAMETER", 8, "setparam");
        f16646s = enumC2156d9;
        EnumC2156d enumC2156d10 = new EnumC2156d("PROPERTY_DELEGATE_FIELD", 9, "delegate");
        f16647t = enumC2156d10;
        EnumC2156d[] enumC2156dArr = {enumC2156d, enumC2156d2, enumC2156d3, enumC2156d4, enumC2156d5, enumC2156d6, enumC2156d7, enumC2156d8, enumC2156d9, enumC2156d10};
        f16648u = enumC2156dArr;
        AbstractC1420H.z(enumC2156dArr);
    }

    public EnumC2156d(String str, int i7, String str2) {
        this.f16649k = str2 == null ? AbstractC0870c.h0(name()) : str2;
    }

    public static EnumC2156d valueOf(String str) {
        return (EnumC2156d) Enum.valueOf(EnumC2156d.class, str);
    }

    public static EnumC2156d[] values() {
        return (EnumC2156d[]) f16648u.clone();
    }
}
