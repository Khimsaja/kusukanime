package androidx.lifecycle;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0689p {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0689p f10736k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0689p f10737l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC0689p f10738m;

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC0689p f10739n;

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC0689p f10740o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ EnumC0689p[] f10741p;

    static {
        EnumC0689p enumC0689p = new EnumC0689p("DESTROYED", 0);
        f10736k = enumC0689p;
        EnumC0689p enumC0689p2 = new EnumC0689p("INITIALIZED", 1);
        f10737l = enumC0689p2;
        EnumC0689p enumC0689p3 = new EnumC0689p("CREATED", 2);
        f10738m = enumC0689p3;
        EnumC0689p enumC0689p4 = new EnumC0689p("STARTED", 3);
        f10739n = enumC0689p4;
        EnumC0689p enumC0689p5 = new EnumC0689p("RESUMED", 4);
        f10740o = enumC0689p5;
        EnumC0689p[] enumC0689pArr = {enumC0689p, enumC0689p2, enumC0689p3, enumC0689p4, enumC0689p5};
        f10741p = enumC0689pArr;
        AbstractC1420H.z(enumC0689pArr);
    }

    public static EnumC0689p valueOf(String str) {
        return (EnumC0689p) Enum.valueOf(EnumC0689p.class, str);
    }

    public static EnumC0689p[] values() {
        return (EnumC0689p[]) f10741p.clone();
    }
}
