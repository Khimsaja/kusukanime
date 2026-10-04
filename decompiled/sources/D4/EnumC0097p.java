package D4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: D4.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0097p {

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0097p f1618l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC0097p f1619m;

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC0097p f1620n;

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC0097p f1621o;

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC0097p f1622p;

    /* renamed from: q, reason: collision with root package name */
    public static final EnumC0097p f1623q;

    /* renamed from: r, reason: collision with root package name */
    public static final EnumC0097p f1624r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ EnumC0097p[] f1625s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ V3.b f1626t;

    /* renamed from: k, reason: collision with root package name */
    public final C1.i f1627k;

    static {
        EnumC0097p enumC0097p = new EnumC0097p("CLASS", 0, 0);
        f1618l = enumC0097p;
        EnumC0097p enumC0097p2 = new EnumC0097p("INTERFACE", 1, 1);
        f1619m = enumC0097p2;
        EnumC0097p enumC0097p3 = new EnumC0097p("ENUM_CLASS", 2, 2);
        f1620n = enumC0097p3;
        EnumC0097p enumC0097p4 = new EnumC0097p("ENUM_ENTRY", 3, 3);
        f1621o = enumC0097p4;
        EnumC0097p enumC0097p5 = new EnumC0097p("ANNOTATION_CLASS", 4, 4);
        f1622p = enumC0097p5;
        EnumC0097p enumC0097p6 = new EnumC0097p("OBJECT", 5, 5);
        f1623q = enumC0097p6;
        EnumC0097p enumC0097p7 = new EnumC0097p("COMPANION_OBJECT", 6, 6);
        f1624r = enumC0097p7;
        EnumC0097p[] enumC0097pArr = {enumC0097p, enumC0097p2, enumC0097p3, enumC0097p4, enumC0097p5, enumC0097p6, enumC0097p7};
        f1625s = enumC0097pArr;
        f1626t = AbstractC1420H.z(enumC0097pArr);
    }

    public EnumC0097p(String str, int i7, int i8) {
        T4.c cVar = T4.e.f9086f;
        kotlin.jvm.internal.l.e("CLASS_KIND", cVar);
        this.f1627k = new C1.i(cVar, i8);
    }

    public static EnumC0097p valueOf(String str) {
        return (EnumC0097p) Enum.valueOf(EnumC0097p.class, str);
    }

    public static EnumC0097p[] values() {
        return (EnumC0097p[]) f1625s.clone();
    }
}
