package o4;

import Z5.C0649s;

/* renamed from: o4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1674d {
    public static final C0649s a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0649s f13697b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0649s f13698c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0649s f13699d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0649s f13700e;

    static {
        C1672c c1672c = C1672c.f13681l;
        int i7 = AbstractC1670b.a;
        a = new C0649s(1, c1672c);
        f13697b = new C0649s(1, C1672c.f13682m);
        f13698c = new C0649s(1, C1672c.f13683n);
        f13699d = new C0649s(1, C1672c.f13684o);
        f13700e = new C0649s(1, C1672c.f13685p);
    }

    public static final C1649C a(Class cls) {
        kotlin.jvm.internal.l.f("jClass", cls);
        Object objA = a.a(cls);
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>", objA);
        return (C1649C) objA;
    }
}
