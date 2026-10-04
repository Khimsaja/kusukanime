package D4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ i0[] f1596l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ V3.b f1597m;

    /* renamed from: k, reason: collision with root package name */
    public final C1.i f1598k;

    static {
        i0[] i0VarArr = {new i0("DECLARATION", 0, 0), new i0("FAKE_OVERRIDE", 1, 1), new i0("DELEGATION", 2, 2), new i0("SYNTHESIZED", 3, 3)};
        f1596l = i0VarArr;
        f1597m = AbstractC1420H.z(i0VarArr);
    }

    public i0(String str, int i7, int i8) {
        T4.c cVar = T4.e.f9096p;
        kotlin.jvm.internal.l.e("MEMBER_KIND", cVar);
        this.f1598k = new C1.i(cVar, i8);
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f1596l.clone();
    }
}
