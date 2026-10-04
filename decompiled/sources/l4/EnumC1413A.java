package l4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l4.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1413A {

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC1413A f12731k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC1413A f12732l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC1413A f12733m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumC1413A[] f12734n;

    static {
        EnumC1413A enumC1413A = new EnumC1413A("INVARIANT", 0);
        f12731k = enumC1413A;
        EnumC1413A enumC1413A2 = new EnumC1413A("IN", 1);
        f12732l = enumC1413A2;
        EnumC1413A enumC1413A3 = new EnumC1413A("OUT", 2);
        f12733m = enumC1413A3;
        EnumC1413A[] enumC1413AArr = {enumC1413A, enumC1413A2, enumC1413A3};
        f12734n = enumC1413AArr;
        AbstractC1420H.z(enumC1413AArr);
    }

    public static EnumC1413A valueOf(String str) {
        return (EnumC1413A) Enum.valueOf(EnumC1413A.class, str);
    }

    public static EnumC1413A[] values() {
        return (EnumC1413A[]) f12734n.clone();
    }
}
