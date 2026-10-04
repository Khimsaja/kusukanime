package Z3;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: k, reason: collision with root package name */
    public static final i f10263k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ i[] f10264l;

    static {
        i iVar = new i("TOP_DOWN", 0);
        i iVar2 = new i("BOTTOM_UP", 1);
        f10263k = iVar2;
        i[] iVarArr = {iVar, iVar2};
        f10264l = iVarArr;
        AbstractC1420H.z(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f10264l.clone();
    }
}
