package D;

import io.ktor.util.GzipHeaderFlags;
import java.util.List;
import s.EnumC1903a0;

/* renamed from: D.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0054h extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: m, reason: collision with root package name */
    public static final C0054h f1167m = new C0054h(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C0054h f1168n = new C0054h(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C0054h f1169o = new C0054h(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final C0054h f1170p = new C0054h(1, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final C0054h f1171q = new C0054h(1, 4);

    /* renamed from: r, reason: collision with root package name */
    public static final C0054h f1172r = new C0054h(1, 5);

    /* renamed from: s, reason: collision with root package name */
    public static final C0054h f1173s = new C0054h(1, 6);

    /* renamed from: t, reason: collision with root package name */
    public static final C0054h f1174t = new C0054h(1, 7);

    /* renamed from: u, reason: collision with root package name */
    public static final C0054h f1175u = new C0054h(1, 8);

    /* renamed from: v, reason: collision with root package name */
    public static final C0054h f1176v = new C0054h(1, 9);

    /* renamed from: w, reason: collision with root package name */
    public static final C0054h f1177w = new C0054h(1, 10);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1178l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0054h(int i7, int i8) {
        super(i7);
        this.f1178l = i8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        Integer numValueOf;
        O3.C c2 = O3.C.a;
        switch (this.f1178l) {
            case 0:
                return c2;
            case 1:
                return c2;
            case 2:
                return c2;
            case 3:
                return c2;
            case GzipHeaderFlags.EXTRA /* 4 */:
                H.O o7 = (H.O) obj;
                long j7 = o7.f2907f;
                int i7 = H0.H.f3092c;
                return new N0.g(((int) (j7 & 4294967295L)) - AbstractC0047d0.p((int) (4294967295L & j7), o7.f2908g.a), 0);
            case 5:
                H.O o8 = (H.O) obj;
                String str = o8.f2908g.a;
                long j8 = o8.f2907f;
                int i8 = H0.H.f3092c;
                int iM = AbstractC0047d0.m((int) (j8 & 4294967295L), str);
                if (iM != -1) {
                    return new N0.g(0, iM - ((int) (4294967295L & o8.f2907f)));
                }
                return null;
            case 6:
                H.O o9 = (H.O) obj;
                Integer numD = o9.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue = numD.intValue();
                long j9 = o9.f2907f;
                int i9 = H0.H.f3092c;
                return new N0.g(((int) (4294967295L & j9)) - iIntValue, 0);
            case 7:
                H.O o10 = (H.O) obj;
                Integer numC = o10.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue2 = numC.intValue();
                long j10 = o10.f2907f;
                int i10 = H0.H.f3092c;
                return new N0.g(0, iIntValue2 - ((int) (4294967295L & j10)));
            case 8:
                H.O o11 = (H.O) obj;
                H0.F f5 = o11.f2904c;
                if (f5 != null) {
                    int iE = H0.H.e(o11.f2907f);
                    N0.q qVar = o11.f2905d;
                    numValueOf = Integer.valueOf(qVar.a(f5.h(f5.e(qVar.b(iE)))));
                } else {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    return null;
                }
                int iIntValue3 = numValueOf.intValue();
                long j11 = o11.f2907f;
                int i11 = H0.H.f3092c;
                return new N0.g(((int) (4294967295L & j11)) - iIntValue3, 0);
            case 9:
                H.O o12 = (H.O) obj;
                Integer numB = o12.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue4 = numB.intValue();
                long j12 = o12.f2907f;
                int i12 = H0.H.f3092c;
                return new N0.g(0, iIntValue4 - ((int) (4294967295L & j12)));
            default:
                List list = (List) obj;
                Object obj2 = list.get(1);
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Boolean", obj2);
                EnumC1903a0 enumC1903a0 = ((Boolean) obj2).booleanValue() ? EnumC1903a0.f15259k : EnumC1903a0.f15260l;
                Object obj3 = list.get(0);
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Float", obj3);
                return new J0(enumC1903a0, ((Float) obj3).floatValue());
        }
    }
}
