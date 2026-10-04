package b5;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ m[] f10953k;

    static {
        m[] mVarArr = {new m("COMMON_SUPER_TYPE", 0), new m("INTERSECTION_TYPE", 1)};
        f10953k = mVarArr;
        AbstractC1420H.z(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f10953k.clone();
    }
}
