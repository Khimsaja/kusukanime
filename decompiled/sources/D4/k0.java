package D4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ k0[] f1608l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ V3.b f1609m;

    /* renamed from: k, reason: collision with root package name */
    public final C1.i f1610k;

    static {
        k0[] k0VarArr = {new k0("INTERNAL", 0, 0), new k0("PRIVATE", 1, 1), new k0("PROTECTED", 2, 2), new k0("PUBLIC", 3, 3), new k0("PRIVATE_TO_THIS", 4, 4), new k0("LOCAL", 5, 5)};
        f1608l = k0VarArr;
        f1609m = AbstractC1420H.z(k0VarArr);
    }

    public k0(String str, int i7, int i8) {
        T4.c cVar = T4.e.f9084d;
        kotlin.jvm.internal.l.e("VISIBILITY", cVar);
        this.f1610k = new C1.i(cVar, i8);
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) f1608l.clone();
    }
}
