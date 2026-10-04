package W4;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: k, reason: collision with root package name */
    public static final i f9659k;

    /* renamed from: l, reason: collision with root package name */
    public static final i f9660l;

    /* renamed from: m, reason: collision with root package name */
    public static final i f9661m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ i[] f9662n;

    static {
        i iVar = new i("BEGINNING", 0);
        f9659k = iVar;
        i iVar2 = new i("MIDDLE", 1);
        f9660l = iVar2;
        i iVar3 = new i("AFTER_DOT", 2);
        f9661m = iVar3;
        i[] iVarArr = {iVar, iVar2, iVar3};
        f9662n = iVarArr;
        AbstractC1420H.z(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f9662n.clone();
    }
}
