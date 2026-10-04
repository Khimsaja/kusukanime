package r4;

import java.util.Set;
import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1882k {

    /* renamed from: o, reason: collision with root package name */
    public static final Set f14943o;

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC1882k f14944p;

    /* renamed from: q, reason: collision with root package name */
    public static final EnumC1882k f14945q;

    /* renamed from: r, reason: collision with root package name */
    public static final EnumC1882k f14946r;

    /* renamed from: s, reason: collision with root package name */
    public static final EnumC1882k f14947s;

    /* renamed from: t, reason: collision with root package name */
    public static final EnumC1882k f14948t;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC1882k f14949u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC1882k f14950v;

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC1882k f14951w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ EnumC1882k[] f14952x;

    /* renamed from: k, reason: collision with root package name */
    public final W4.e f14953k;

    /* renamed from: l, reason: collision with root package name */
    public final W4.e f14954l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f14955m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f14956n;

    static {
        EnumC1882k enumC1882k = new EnumC1882k("BOOLEAN", 0, "Boolean");
        f14944p = enumC1882k;
        EnumC1882k enumC1882k2 = new EnumC1882k("CHAR", 1, "Char");
        f14945q = enumC1882k2;
        EnumC1882k enumC1882k3 = new EnumC1882k("BYTE", 2, "Byte");
        f14946r = enumC1882k3;
        EnumC1882k enumC1882k4 = new EnumC1882k("SHORT", 3, "Short");
        f14947s = enumC1882k4;
        EnumC1882k enumC1882k5 = new EnumC1882k("INT", 4, "Int");
        f14948t = enumC1882k5;
        EnumC1882k enumC1882k6 = new EnumC1882k("FLOAT", 5, "Float");
        f14949u = enumC1882k6;
        EnumC1882k enumC1882k7 = new EnumC1882k("LONG", 6, "Long");
        f14950v = enumC1882k7;
        EnumC1882k enumC1882k8 = new EnumC1882k("DOUBLE", 7, "Double");
        f14951w = enumC1882k8;
        EnumC1882k[] enumC1882kArr = {enumC1882k, enumC1882k2, enumC1882k3, enumC1882k4, enumC1882k5, enumC1882k6, enumC1882k7, enumC1882k8};
        f14952x = enumC1882kArr;
        AbstractC1420H.z(enumC1882kArr);
        f14943o = P3.m.v0(new EnumC1882k[]{enumC1882k2, enumC1882k3, enumC1882k4, enumC1882k5, enumC1882k6, enumC1882k7, enumC1882k8});
    }

    public EnumC1882k(String str, int i7, String str2) {
        this.f14953k = W4.e.e(str2);
        this.f14954l = W4.e.e(str2.concat("Array"));
        O3.j jVar = O3.j.f7525k;
        this.f14955m = z1.c.B(jVar, new C1881j(this, 0));
        this.f14956n = z1.c.B(jVar, new C1881j(this, 1));
    }

    public static EnumC1882k valueOf(String str) {
        return (EnumC1882k) Enum.valueOf(EnumC1882k.class, str);
    }

    public static EnumC1882k[] values() {
        return (EnumC1882k[]) f14952x.clone();
    }
}
