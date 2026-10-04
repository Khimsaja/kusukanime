package v4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: k, reason: collision with root package name */
    public static final m f16662k;

    /* renamed from: l, reason: collision with root package name */
    public static final m f16663l;

    /* renamed from: m, reason: collision with root package name */
    public static final m f16664m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ m[] f16665n;

    static {
        m mVar = new m("RUNTIME", 0);
        f16662k = mVar;
        m mVar2 = new m("BINARY", 1);
        f16663l = mVar2;
        m mVar3 = new m("SOURCE", 2);
        f16664m = mVar3;
        m[] mVarArr = {mVar, mVar2, mVar3};
        f16665n = mVarArr;
        AbstractC1420H.z(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f16665n.clone();
    }
}
