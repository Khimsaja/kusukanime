package Q4;

import P3.F;
import java.util.LinkedHashMap;
import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: l, reason: collision with root package name */
    public static final A.e f7994l;

    /* renamed from: m, reason: collision with root package name */
    public static final LinkedHashMap f7995m;

    /* renamed from: n, reason: collision with root package name */
    public static final a f7996n;

    /* renamed from: o, reason: collision with root package name */
    public static final a f7997o;

    /* renamed from: p, reason: collision with root package name */
    public static final a f7998p;

    /* renamed from: q, reason: collision with root package name */
    public static final a f7999q;

    /* renamed from: r, reason: collision with root package name */
    public static final a f8000r;

    /* renamed from: s, reason: collision with root package name */
    public static final a f8001s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ a[] f8002t;

    /* renamed from: k, reason: collision with root package name */
    public final int f8003k;

    static {
        a aVar = new a("UNKNOWN", 0, 0);
        f7996n = aVar;
        a aVar2 = new a("CLASS", 1, 1);
        f7997o = aVar2;
        a aVar3 = new a("FILE_FACADE", 2, 2);
        f7998p = aVar3;
        a aVar4 = new a("SYNTHETIC_CLASS", 3, 3);
        f7999q = aVar4;
        a aVar5 = new a("MULTIFILE_CLASS", 4, 4);
        f8000r = aVar5;
        a aVar6 = new a("MULTIFILE_CLASS_PART", 5, 5);
        f8001s = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        f8002t = aVarArr;
        AbstractC1420H.z(aVarArr);
        f7994l = new A.e(28);
        a[] aVarArrValues = values();
        int I = F.I(aVarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(I < 16 ? 16 : I);
        for (a aVar7 : aVarArrValues) {
            linkedHashMap.put(Integer.valueOf(aVar7.f8003k), aVar7);
        }
        f7995m = linkedHashMap;
    }

    public a(String str, int i7, int i8) {
        this.f8003k = i8;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f8002t.clone();
    }
}
