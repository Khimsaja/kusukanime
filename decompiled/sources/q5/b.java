package q5;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: k, reason: collision with root package name */
    public static final b f14745k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ b[] f14746l;

    static {
        b bVar = new b("FOR_SUBTYPING", 0);
        f14745k = bVar;
        b[] bVarArr = {bVar, new b("FOR_INCORPORATION", 1), new b("FROM_EXPRESSION", 2)};
        f14746l = bVarArr;
        AbstractC1420H.z(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f14746l.clone();
    }
}
