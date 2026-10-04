package Y4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: m, reason: collision with root package name */
    public static final a f10133m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ a[] f10134n;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f10135k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f10136l;

    static {
        a aVar = new a("NO_ARGUMENTS", 0, 3);
        f10133m = aVar;
        a[] aVarArr = {aVar, new a("UNLESS_EMPTY", 1, 2), new a("ALWAYS_PARENTHESIZED", 2, true, true)};
        f10134n = aVarArr;
        AbstractC1420H.z(aVarArr);
    }

    public /* synthetic */ a(String str, int i7, int i8) {
        this(str, i7, (i8 & 1) == 0, false);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f10134n.clone();
    }

    public a(String str, int i7, boolean z7, boolean z8) {
        this.f10135k = z7;
        this.f10136l = z8;
    }
}
