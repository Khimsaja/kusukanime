package R2;

import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: k, reason: collision with root package name */
    public static final i f8090k;

    /* renamed from: l, reason: collision with root package name */
    public static final i f8091l;

    /* renamed from: m, reason: collision with root package name */
    public static final i f8092m;

    /* renamed from: n, reason: collision with root package name */
    public static final i f8093n;

    /* renamed from: o, reason: collision with root package name */
    public static final i f8094o;

    /* renamed from: p, reason: collision with root package name */
    public static final i f8095p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ i[] f8096q;

    static {
        i iVar = new i("Verbose", 0);
        f8090k = iVar;
        i iVar2 = new i("Debug", 1);
        f8091l = iVar2;
        i iVar3 = new i("Info", 2);
        f8092m = iVar3;
        i iVar4 = new i("Warn", 3);
        f8093n = iVar4;
        i iVar5 = new i("Error", 4);
        f8094o = iVar5;
        i iVar6 = new i("Assert", 5);
        f8095p = iVar6;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6};
        f8096q = iVarArr;
        AbstractC1420H.z(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f8096q.clone();
    }
}
