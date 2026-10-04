package t4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: k, reason: collision with root package name */
    public static final m f16067k;

    /* renamed from: l, reason: collision with root package name */
    public static final m f16068l;

    /* renamed from: m, reason: collision with root package name */
    public static final m f16069m;

    /* renamed from: n, reason: collision with root package name */
    public static final m f16070n;

    /* renamed from: o, reason: collision with root package name */
    public static final m f16071o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ m[] f16072p;

    static {
        m mVar = new m("HIDDEN", 0);
        f16067k = mVar;
        m mVar2 = new m("VISIBLE", 1);
        f16068l = mVar2;
        m mVar3 = new m("DEPRECATED_LIST_METHODS", 2);
        f16069m = mVar3;
        m mVar4 = new m("NOT_CONSIDERED", 3);
        f16070n = mVar4;
        m mVar5 = new m("DROP", 4);
        f16071o = mVar5;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5};
        f16072p = mVarArr;
        AbstractC1420H.z(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f16072p.clone();
    }
}
