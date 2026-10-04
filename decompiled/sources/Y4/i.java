package Y4;

import java.util.ArrayList;
import java.util.Set;
import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: A, reason: collision with root package name */
    public static final i f10166A;

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ i[] f10167B;

    /* renamed from: l, reason: collision with root package name */
    public static final Set f10168l;

    /* renamed from: m, reason: collision with root package name */
    public static final Set f10169m;

    /* renamed from: n, reason: collision with root package name */
    public static final i f10170n;

    /* renamed from: o, reason: collision with root package name */
    public static final i f10171o;

    /* renamed from: p, reason: collision with root package name */
    public static final i f10172p;

    /* renamed from: q, reason: collision with root package name */
    public static final i f10173q;

    /* renamed from: r, reason: collision with root package name */
    public static final i f10174r;

    /* renamed from: s, reason: collision with root package name */
    public static final i f10175s;

    /* renamed from: t, reason: collision with root package name */
    public static final i f10176t;

    /* renamed from: u, reason: collision with root package name */
    public static final i f10177u;

    /* renamed from: v, reason: collision with root package name */
    public static final i f10178v;

    /* renamed from: w, reason: collision with root package name */
    public static final i f10179w;

    /* renamed from: x, reason: collision with root package name */
    public static final i f10180x;

    /* renamed from: y, reason: collision with root package name */
    public static final i f10181y;

    /* renamed from: z, reason: collision with root package name */
    public static final i f10182z;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f10183k;

    static {
        i iVar = new i("VISIBILITY", 0, true);
        f10170n = iVar;
        i iVar2 = new i("MODALITY", 1, true);
        f10171o = iVar2;
        i iVar3 = new i("OVERRIDE", 2, true);
        f10172p = iVar3;
        i iVar4 = new i("ANNOTATIONS", 3, false);
        f10173q = iVar4;
        i iVar5 = new i("INNER", 4, true);
        f10174r = iVar5;
        i iVar6 = new i("MEMBER_KIND", 5, true);
        f10175s = iVar6;
        i iVar7 = new i("DATA", 6, true);
        f10176t = iVar7;
        i iVar8 = new i("INLINE", 7, true);
        f10177u = iVar8;
        i iVar9 = new i("EXPECT", 8, true);
        f10178v = iVar9;
        i iVar10 = new i("ACTUAL", 9, true);
        f10179w = iVar10;
        i iVar11 = new i("CONST", 10, true);
        f10180x = iVar11;
        i iVar12 = new i("LATEINIT", 11, true);
        f10181y = iVar12;
        i iVar13 = new i("FUN", 12, true);
        f10182z = iVar13;
        i iVar14 = new i("VALUE", 13, true);
        f10166A = iVar14;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14};
        f10167B = iVarArr;
        AbstractC1420H.z(iVarArr);
        i[] iVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (i iVar15 : iVarArrValues) {
            if (iVar15.f10183k) {
                arrayList.add(iVar15);
            }
        }
        f10168l = P3.q.X0(arrayList);
        f10169m = P3.m.v0(values());
    }

    public i(String str, int i7, boolean z7) {
        this.f10183k = z7;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f10167B.clone();
    }
}
