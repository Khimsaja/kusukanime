package H0;

import h0.AbstractC0968M;
import h0.C0972Q;
import h0.C0998u;
import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3178l;

    /* renamed from: m, reason: collision with root package name */
    public static final x f3164m = new x(2, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final x f3165n = new x(2, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final x f3166o = new x(2, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final x f3167p = new x(2, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final x f3168q = new x(2, 4);

    /* renamed from: r, reason: collision with root package name */
    public static final x f3169r = new x(2, 5);

    /* renamed from: s, reason: collision with root package name */
    public static final x f3170s = new x(2, 6);

    /* renamed from: t, reason: collision with root package name */
    public static final x f3171t = new x(2, 7);

    /* renamed from: u, reason: collision with root package name */
    public static final x f3172u = new x(2, 8);

    /* renamed from: v, reason: collision with root package name */
    public static final x f3173v = new x(2, 9);

    /* renamed from: w, reason: collision with root package name */
    public static final x f3174w = new x(2, 10);

    /* renamed from: x, reason: collision with root package name */
    public static final x f3175x = new x(2, 11);

    /* renamed from: y, reason: collision with root package name */
    public static final x f3176y = new x(2, 12);

    /* renamed from: z, reason: collision with root package name */
    public static final x f3177z = new x(2, 13);

    /* renamed from: A, reason: collision with root package name */
    public static final x f3156A = new x(2, 14);

    /* renamed from: B, reason: collision with root package name */
    public static final x f3157B = new x(2, 15);

    /* renamed from: C, reason: collision with root package name */
    public static final x f3158C = new x(2, 16);

    /* renamed from: D, reason: collision with root package name */
    public static final x f3159D = new x(2, 17);

    /* renamed from: E, reason: collision with root package name */
    public static final x f3160E = new x(2, 18);

    /* renamed from: F, reason: collision with root package name */
    public static final x f3161F = new x(2, 19);

    /* renamed from: G, reason: collision with root package name */
    public static final x f3162G = new x(2, 20);

    /* renamed from: H, reason: collision with root package name */
    public static final x f3163H = new x(2, 21);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i7, int i8) {
        super(i7);
        this.f3178l = i8;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = 0;
        switch (this.f3178l) {
            case 0:
                X.b bVar = (X.b) obj;
                C0214f c0214f = (C0214f) obj2;
                String str = c0214f.a;
                L2.e eVar = A.a;
                List listA = c0214f.a();
                L2.e eVar2 = A.a;
                Object objA = A.a(listA, eVar2, bVar);
                Object obj3 = c0214f.f3111c;
                if (obj3 == null) {
                    obj3 = P3.y.f7779k;
                }
                return P3.r.f(str, objA, A.a(obj3, eVar2, bVar), A.a(c0214f.f3112d, eVar2, bVar));
            case 1:
                X.b bVar2 = (X.b) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i7 < size) {
                    arrayList.add(A.a((C0212d) list.get(i7), A.f3036b, bVar2));
                    i7++;
                }
                return arrayList;
            case 2:
                X.b bVar3 = (X.b) obj;
                C0212d c0212d = (C0212d) obj2;
                Object obj4 = c0212d.a;
                EnumC0216h enumC0216h = obj4 instanceof s ? EnumC0216h.f3113k : obj4 instanceof B ? EnumC0216h.f3114l : obj4 instanceof K ? EnumC0216h.f3115m : obj4 instanceof J ? EnumC0216h.f3116n : obj4 instanceof C0219k ? EnumC0216h.f3117o : obj4 instanceof C0218j ? EnumC0216h.f3118p : EnumC0216h.f3119q;
                int iOrdinal = enumC0216h.ordinal();
                Object objA2 = c0212d.a;
                switch (iOrdinal) {
                    case 0:
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle", objA2);
                        objA2 = A.a((s) objA2, A.f3041g, bVar3);
                        break;
                    case 1:
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle", objA2);
                        objA2 = A.a((B) objA2, A.f3042h, bVar3);
                        break;
                    case 2:
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation", objA2);
                        objA2 = A.a((K) objA2, A.f3037c, bVar3);
                        break;
                    case 3:
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation", objA2);
                        objA2 = A.a((J) objA2, A.f3038d, bVar3);
                        break;
                    case GzipHeaderFlags.EXTRA /* 4 */:
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url", objA2);
                        objA2 = A.a((C0219k) objA2, A.f3039e, bVar3);
                        break;
                    case 5:
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable", objA2);
                        objA2 = A.a((C0218j) objA2, A.f3040f, bVar3);
                        break;
                    case 6:
                        L2.e eVar3 = A.a;
                        break;
                    default:
                        throw new D6.r();
                }
                return P3.r.f(enumC0216h, objA2, Integer.valueOf(c0212d.f3107b), Integer.valueOf(c0212d.f3108c), c0212d.f3109d);
            case 3:
                return Float.valueOf(((S0.a) obj2).a);
            case GzipHeaderFlags.EXTRA /* 4 */:
                C0218j c0218j = (C0218j) obj2;
                return P3.r.f(c0218j.a, A.a(c0218j.f3121b, A.f3043i, (X.b) obj));
            case 5:
                long j7 = ((C0998u) obj2).a;
                return j7 == 16 ? Boolean.FALSE : Integer.valueOf(AbstractC0968M.w(j7));
            case 6:
                return Integer.valueOf(((M0.u) obj2).f6419k);
            case 7:
                C0219k c0219k = (C0219k) obj2;
                return P3.r.f(c0219k.a, A.a(c0219k.f3122b, A.f3043i, (X.b) obj));
            case 8:
                X.b bVar4 = (X.b) obj;
                List list2 = ((O0.b) obj2).f7250k;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i7 < size2) {
                    arrayList2.add(A.a((O0.a) list2.get(i7), A.f3054t, bVar4));
                    i7++;
                }
                return arrayList2;
            case 9:
                return ((O0.a) obj2).a.toLanguageTag();
            case 10:
                long j8 = ((g0.c) obj2).a;
                if (g0.c.b(j8, 9205357640488583168L)) {
                    return Boolean.FALSE;
                }
                Float fValueOf = Float.valueOf(g0.c.d(j8));
                L2.e eVar4 = A.a;
                return P3.r.f(fValueOf, Float.valueOf(g0.c.e(j8)));
            case 11:
                X.b bVar5 = (X.b) obj;
                s sVar = (s) obj2;
                S0.i iVar = new S0.i(sVar.a);
                L2.e eVar5 = A.a;
                S0.k kVar = new S0.k(sVar.f3145b);
                Object objA3 = A.a(new T0.m(sVar.f3146c), A.f3051q, bVar5);
                S0.o oVar = S0.o.f8720c;
                return P3.r.f(iVar, kVar, objA3, A.a(sVar.f3147d, A.f3046l, bVar5));
            case 12:
                X.b bVar6 = (X.b) obj;
                C0972Q c0972q = (C0972Q) obj2;
                return P3.r.f(A.a(new C0998u(c0972q.a), A.f3050p, bVar6), A.a(new g0.c(c0972q.f11802b), A.f3052r, bVar6), Float.valueOf(c0972q.f11803c));
            case 13:
                X.b bVar7 = (X.b) obj;
                B b4 = (B) obj2;
                C0998u c0998u = new C0998u(b4.a.b());
                z zVar = A.f3050p;
                Object objA4 = A.a(c0998u, zVar, bVar7);
                T0.m mVar = new T0.m(b4.f3055b);
                z zVar2 = A.f3051q;
                Object objA5 = A.a(mVar, zVar2, bVar7);
                M0.u uVar = M0.u.f6412l;
                Object objA6 = A.a(b4.f3056c, A.f3047m, bVar7);
                Object objA7 = A.a(new T0.m(b4.f3061h), zVar2, bVar7);
                Object objA8 = A.a(b4.f3062i, A.f3048n, bVar7);
                Object objA9 = A.a(b4.f3063j, A.f3045k, bVar7);
                O0.b bVar8 = O0.b.f7249m;
                Object objA10 = A.a(b4.f3064k, A.f3053s, bVar7);
                Object objA11 = A.a(new C0998u(b4.f3065l), zVar, bVar7);
                Object objA12 = A.a(b4.f3066m, A.f3044j, bVar7);
                C0972Q c0972q2 = C0972Q.f11801d;
                return P3.r.f(objA4, objA5, objA6, b4.f3057d, b4.f3058e, -1, b4.f3060g, objA7, objA8, objA9, objA10, objA11, objA12, A.a(b4.f3067n, A.f3049o, bVar7));
            case 14:
                return Integer.valueOf(((S0.j) obj2).a);
            case 15:
                S0.n nVar = (S0.n) obj2;
                return P3.r.f(Float.valueOf(nVar.a), Float.valueOf(nVar.f8719b));
            case 16:
                X.b bVar9 = (X.b) obj;
                S0.o oVar2 = (S0.o) obj2;
                T0.m mVar2 = new T0.m(oVar2.a);
                z zVar3 = A.f3051q;
                return P3.r.f(A.a(mVar2, zVar3, bVar9), A.a(new T0.m(oVar2.f8721b), zVar3, bVar9));
            case 17:
                X.b bVar10 = (X.b) obj;
                G g4 = (G) obj2;
                B b7 = g4.a;
                L2.e eVar6 = A.f3042h;
                return P3.r.f(A.a(b7, eVar6, bVar10), A.a(g4.f3088b, eVar6, bVar10), A.a(g4.f3089c, eVar6, bVar10), A.a(g4.f3090d, eVar6, bVar10));
            case 18:
                long j9 = ((H) obj2).a;
                int i8 = H.f3092c;
                Integer numValueOf = Integer.valueOf((int) (j9 >> 32));
                L2.e eVar7 = A.a;
                return P3.r.f(numValueOf, Integer.valueOf((int) (j9 & 4294967295L)));
            case 19:
                long j10 = ((T0.m) obj2).a;
                if (T0.m.a(j10, T0.m.f8848c)) {
                    return Boolean.FALSE;
                }
                Float fValueOf2 = Float.valueOf(T0.m.c(j10));
                L2.e eVar8 = A.a;
                return P3.r.f(fValueOf2, new T0.n(T0.m.b(j10)));
            case 20:
                String str2 = ((J) obj2).a;
                L2.e eVar9 = A.a;
                return str2;
            default:
                String str3 = ((K) obj2).a;
                L2.e eVar10 = A.a;
                return str3;
        }
    }
}
