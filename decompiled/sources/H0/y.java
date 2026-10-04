package H0;

import android.util.Log;
import e5.AbstractC0832b;
import h0.AbstractC0968M;
import h0.C0972Q;
import h0.C0998u;
import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3201l;

    /* renamed from: m, reason: collision with root package name */
    public static final y f3187m = new y(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final y f3188n = new y(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final y f3189o = new y(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final y f3190p = new y(1, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final y f3191q = new y(1, 4);

    /* renamed from: r, reason: collision with root package name */
    public static final y f3192r = new y(1, 5);

    /* renamed from: s, reason: collision with root package name */
    public static final y f3193s = new y(1, 6);

    /* renamed from: t, reason: collision with root package name */
    public static final y f3194t = new y(1, 7);

    /* renamed from: u, reason: collision with root package name */
    public static final y f3195u = new y(1, 8);

    /* renamed from: v, reason: collision with root package name */
    public static final y f3196v = new y(1, 9);

    /* renamed from: w, reason: collision with root package name */
    public static final y f3197w = new y(1, 10);

    /* renamed from: x, reason: collision with root package name */
    public static final y f3198x = new y(1, 11);

    /* renamed from: y, reason: collision with root package name */
    public static final y f3199y = new y(1, 12);

    /* renamed from: z, reason: collision with root package name */
    public static final y f3200z = new y(1, 13);

    /* renamed from: A, reason: collision with root package name */
    public static final y f3179A = new y(1, 14);

    /* renamed from: B, reason: collision with root package name */
    public static final y f3180B = new y(1, 15);

    /* renamed from: C, reason: collision with root package name */
    public static final y f3181C = new y(1, 16);

    /* renamed from: D, reason: collision with root package name */
    public static final y f3182D = new y(1, 17);

    /* renamed from: E, reason: collision with root package name */
    public static final y f3183E = new y(1, 18);

    /* renamed from: F, reason: collision with root package name */
    public static final y f3184F = new y(1, 19);

    /* renamed from: G, reason: collision with root package name */
    public static final y f3185G = new y(1, 20);

    /* renamed from: H, reason: collision with root package name */
    public static final y f3186H = new y(1, 21);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i7, int i8) {
        super(i7);
        this.f3201l = i8;
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v49, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r3v31, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r3v34, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r3v57, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r4v40, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r5v20, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r5v31, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r8v6, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // e4.k
    public final Object invoke(Object obj) {
        int i7 = 0;
        List list = null;
        b = null;
        B b4 = null;
        mVar = null;
        T0.m mVar = null;
        c0972q = null;
        C0972Q c0972q = null;
        oVar = null;
        S0.o oVar = null;
        g = null;
        G g4 = null;
        g = null;
        G g7 = null;
        c0218j = null;
        C0218j c0218j = null;
        c0219k = null;
        C0219k c0219k = null;
        j = null;
        J j7 = null;
        k = null;
        K k7 = null;
        b = null;
        B b7 = null;
        sVar = null;
        s sVar = null;
        list = null;
        switch (this.f3201l) {
            case 0:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list2 = (List) obj;
                Object obj2 = list2.get(1);
                L2.e eVar = A.a;
                Boolean bool = Boolean.FALSE;
                List list3 = (kotlin.jvm.internal.l.a(obj2, bool) || obj2 == null) ? null : (List) ((e4.k) eVar.f6046m).invoke(obj2);
                Object obj3 = list2.get(2);
                List list4 = (kotlin.jvm.internal.l.a(obj3, bool) || obj3 == null) ? null : (List) ((e4.k) eVar.f6046m).invoke(obj3);
                Object obj4 = list2.get(0);
                String str = obj4 != null ? (String) obj4 : null;
                kotlin.jvm.internal.l.c(str);
                if (list3 == null || list3.isEmpty()) {
                    list3 = null;
                }
                if (list4 == null || list4.isEmpty()) {
                    list4 = null;
                }
                Object obj5 = list2.get(3);
                if (!kotlin.jvm.internal.l.a(obj5, bool) && obj5 != null) {
                    list = (List) ((e4.k) eVar.f6046m).invoke(obj5);
                }
                return new C0214f(str, list3, list4, list);
            case 1:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list5 = (List) obj;
                ArrayList arrayList = new ArrayList(list5.size());
                int size = list5.size();
                while (i7 < size) {
                    Object obj6 = list5.get(i7);
                    C0212d c0212d = (kotlin.jvm.internal.l.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (C0212d) ((e4.k) A.f3036b.f6046m).invoke(obj6);
                    kotlin.jvm.internal.l.c(c0212d);
                    arrayList.add(c0212d);
                    i7++;
                }
                return arrayList;
            case 2:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list6 = (List) obj;
                Object obj7 = list6.get(0);
                EnumC0216h enumC0216h = obj7 != null ? (EnumC0216h) obj7 : null;
                kotlin.jvm.internal.l.c(enumC0216h);
                Object obj8 = list6.get(2);
                Integer num = obj8 != null ? (Integer) obj8 : null;
                kotlin.jvm.internal.l.c(num);
                int iIntValue = num.intValue();
                Object obj9 = list6.get(3);
                Integer num2 = obj9 != null ? (Integer) obj9 : null;
                kotlin.jvm.internal.l.c(num2);
                int iIntValue2 = num2.intValue();
                Object obj10 = list6.get(4);
                String str2 = obj10 != null ? (String) obj10 : null;
                kotlin.jvm.internal.l.c(str2);
                switch (enumC0216h.ordinal()) {
                    case 0:
                        Object obj11 = list6.get(1);
                        L2.e eVar2 = A.f3041g;
                        if (!kotlin.jvm.internal.l.a(obj11, Boolean.FALSE) && obj11 != null) {
                            sVar = (s) ((e4.k) eVar2.f6046m).invoke(obj11);
                        }
                        kotlin.jvm.internal.l.c(sVar);
                        return new C0212d(sVar, iIntValue, iIntValue2, str2);
                    case 1:
                        Object obj12 = list6.get(1);
                        L2.e eVar3 = A.f3042h;
                        if (!kotlin.jvm.internal.l.a(obj12, Boolean.FALSE) && obj12 != null) {
                            b7 = (B) ((e4.k) eVar3.f6046m).invoke(obj12);
                        }
                        kotlin.jvm.internal.l.c(b7);
                        return new C0212d(b7, iIntValue, iIntValue2, str2);
                    case 2:
                        Object obj13 = list6.get(1);
                        L2.e eVar4 = A.f3037c;
                        if (!kotlin.jvm.internal.l.a(obj13, Boolean.FALSE) && obj13 != null) {
                            k7 = (K) ((e4.k) eVar4.f6046m).invoke(obj13);
                        }
                        kotlin.jvm.internal.l.c(k7);
                        return new C0212d(k7, iIntValue, iIntValue2, str2);
                    case 3:
                        Object obj14 = list6.get(1);
                        L2.e eVar5 = A.f3038d;
                        if (!kotlin.jvm.internal.l.a(obj14, Boolean.FALSE) && obj14 != null) {
                            j7 = (J) ((e4.k) eVar5.f6046m).invoke(obj14);
                        }
                        kotlin.jvm.internal.l.c(j7);
                        return new C0212d(j7, iIntValue, iIntValue2, str2);
                    case GzipHeaderFlags.EXTRA /* 4 */:
                        Object obj15 = list6.get(1);
                        L2.e eVar6 = A.f3039e;
                        if (!kotlin.jvm.internal.l.a(obj15, Boolean.FALSE) && obj15 != null) {
                            c0219k = (C0219k) ((e4.k) eVar6.f6046m).invoke(obj15);
                        }
                        kotlin.jvm.internal.l.c(c0219k);
                        return new C0212d(c0219k, iIntValue, iIntValue2, str2);
                    case 5:
                        Object obj16 = list6.get(1);
                        L2.e eVar7 = A.f3040f;
                        if (!kotlin.jvm.internal.l.a(obj16, Boolean.FALSE) && obj16 != null) {
                            c0218j = (C0218j) ((e4.k) eVar7.f6046m).invoke(obj16);
                        }
                        kotlin.jvm.internal.l.c(c0218j);
                        return new C0212d(c0218j, iIntValue, iIntValue2, str2);
                    case 6:
                        Object obj17 = list6.get(1);
                        String str3 = obj17 != null ? (String) obj17 : null;
                        kotlin.jvm.internal.l.c(str3);
                        return new C0212d(str3, iIntValue, iIntValue2, str2);
                    default:
                        throw new D6.r();
                }
            case 3:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Float", obj);
                return new S0.a(((Float) obj).floatValue());
            case GzipHeaderFlags.EXTRA /* 4 */:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list7 = (List) obj;
                Object obj18 = list7.get(0);
                String str4 = obj18 != null ? (String) obj18 : null;
                kotlin.jvm.internal.l.c(str4);
                Object obj19 = list7.get(1);
                L2.e eVar8 = A.f3043i;
                if (!kotlin.jvm.internal.l.a(obj19, Boolean.FALSE) && obj19 != null) {
                    g7 = (G) ((e4.k) eVar8.f6046m).invoke(obj19);
                }
                return new C0218j(str4, g7);
            case 5:
                if (kotlin.jvm.internal.l.a(obj, Boolean.FALSE)) {
                    return new C0998u(C0998u.f11834g);
                }
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Int", obj);
                return new C0998u(AbstractC0968M.c(((Integer) obj).intValue()));
            case 6:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Int", obj);
                return new M0.u(((Integer) obj).intValue());
            case 7:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list8 = (List) obj;
                Object obj20 = list8.get(0);
                String str5 = obj20 != null ? (String) obj20 : null;
                kotlin.jvm.internal.l.c(str5);
                Object obj21 = list8.get(1);
                L2.e eVar9 = A.f3043i;
                if (!kotlin.jvm.internal.l.a(obj21, Boolean.FALSE) && obj21 != null) {
                    g4 = (G) ((e4.k) eVar9.f6046m).invoke(obj21);
                }
                return new C0219k(str5, g4);
            case 8:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list9 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list9.size());
                int size2 = list9.size();
                while (i7 < size2) {
                    Object obj22 = list9.get(i7);
                    O0.a aVar = (kotlin.jvm.internal.l.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (O0.a) ((e4.k) A.f3054t.f6046m).invoke(obj22);
                    kotlin.jvm.internal.l.c(aVar);
                    arrayList2.add(aVar);
                    i7++;
                }
                return new O0.b(arrayList2);
            case 9:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.String", obj);
                String str6 = (String) obj;
                O0.c.a.getClass();
                Locale localeForLanguageTag = Locale.forLanguageTag(str6);
                if (kotlin.jvm.internal.l.a(localeForLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str6 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new O0.a(localeForLanguageTag);
            case 10:
                if (kotlin.jvm.internal.l.a(obj, Boolean.FALSE)) {
                    return new g0.c(9205357640488583168L);
                }
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list10 = (List) obj;
                Object obj23 = list10.get(0);
                Float f5 = obj23 != null ? (Float) obj23 : null;
                kotlin.jvm.internal.l.c(f5);
                float fFloatValue = f5.floatValue();
                Object obj24 = list10.get(1);
                Float f7 = obj24 != null ? (Float) obj24 : null;
                kotlin.jvm.internal.l.c(f7);
                return new g0.c(AbstractC0832b.e(fFloatValue, f7.floatValue()));
            case 11:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list11 = (List) obj;
                Object obj25 = list11.get(0);
                S0.i iVar = obj25 != null ? (S0.i) obj25 : null;
                kotlin.jvm.internal.l.c(iVar);
                Object obj26 = list11.get(1);
                S0.k kVar = obj26 != null ? (S0.k) obj26 : null;
                kotlin.jvm.internal.l.c(kVar);
                Object obj27 = list11.get(2);
                T0.n[] nVarArr = T0.m.f8847b;
                z zVar = A.f3051q;
                Boolean bool2 = Boolean.FALSE;
                T0.m mVar2 = ((kotlin.jvm.internal.l.a(obj27, bool2) && zVar == null) || obj27 == null) ? null : (T0.m) zVar.f3203l.invoke(obj27);
                kotlin.jvm.internal.l.c(mVar2);
                Object obj28 = list11.get(3);
                S0.o oVar2 = S0.o.f8720c;
                L2.e eVar10 = A.f3046l;
                if (!kotlin.jvm.internal.l.a(obj28, bool2) && obj28 != null) {
                    oVar = (S0.o) ((e4.k) eVar10.f6046m).invoke(obj28);
                }
                return new s(iVar.a, kVar.a, mVar2.a, oVar, null, null, 0, Integer.MIN_VALUE, null);
            case 12:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list12 = (List) obj;
                Object obj29 = list12.get(0);
                int i8 = C0998u.f11835h;
                z zVar2 = A.f3050p;
                Boolean bool3 = Boolean.FALSE;
                C0998u c0998u = ((kotlin.jvm.internal.l.a(obj29, bool3) && zVar2 == null) || obj29 == null) ? null : (C0998u) zVar2.f3203l.invoke(obj29);
                kotlin.jvm.internal.l.c(c0998u);
                Object obj30 = list12.get(1);
                z zVar3 = A.f3052r;
                g0.c cVar = ((kotlin.jvm.internal.l.a(obj30, bool3) && zVar3 == null) || obj30 == null) ? null : (g0.c) zVar3.f3203l.invoke(obj30);
                kotlin.jvm.internal.l.c(cVar);
                Object obj31 = list12.get(2);
                Float f8 = obj31 != null ? (Float) obj31 : null;
                kotlin.jvm.internal.l.c(f8);
                return new C0972Q(f8.floatValue(), c0998u.a, cVar.a);
            case 13:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list13 = (List) obj;
                Object obj32 = list13.get(0);
                int i9 = C0998u.f11835h;
                z zVar4 = A.f3050p;
                Boolean bool4 = Boolean.FALSE;
                C0998u c0998u2 = ((kotlin.jvm.internal.l.a(obj32, bool4) && zVar4 == null) || obj32 == null) ? null : (C0998u) zVar4.f3203l.invoke(obj32);
                kotlin.jvm.internal.l.c(c0998u2);
                Object obj33 = list13.get(1);
                T0.n[] nVarArr2 = T0.m.f8847b;
                z zVar5 = A.f3051q;
                T0.m mVar3 = ((kotlin.jvm.internal.l.a(obj33, bool4) && zVar5 == null) || obj33 == null) ? null : (T0.m) zVar5.f3203l.invoke(obj33);
                kotlin.jvm.internal.l.c(mVar3);
                Object obj34 = list13.get(2);
                M0.u uVar = M0.u.f6412l;
                M0.u uVar2 = (kotlin.jvm.internal.l.a(obj34, bool4) || obj34 == null) ? null : (M0.u) ((e4.k) A.f3047m.f6046m).invoke(obj34);
                Object obj35 = list13.get(3);
                M0.q qVar = obj35 != null ? (M0.q) obj35 : null;
                Object obj36 = list13.get(4);
                M0.r rVar = obj36 != null ? (M0.r) obj36 : null;
                Object obj37 = list13.get(6);
                String str7 = obj37 != null ? (String) obj37 : null;
                Object obj38 = list13.get(7);
                T0.m mVar4 = ((kotlin.jvm.internal.l.a(obj38, bool4) && zVar5 == null) || obj38 == null) ? null : (T0.m) zVar5.f3203l.invoke(obj38);
                kotlin.jvm.internal.l.c(mVar4);
                Object obj39 = list13.get(8);
                S0.a aVar2 = (kotlin.jvm.internal.l.a(obj39, bool4) || obj39 == null) ? null : (S0.a) ((e4.k) A.f3048n.f6046m).invoke(obj39);
                Object obj40 = list13.get(9);
                S0.n nVar = (kotlin.jvm.internal.l.a(obj40, bool4) || obj40 == null) ? null : (S0.n) ((e4.k) A.f3045k.f6046m).invoke(obj40);
                Object obj41 = list13.get(10);
                O0.b bVar = O0.b.f7249m;
                O0.b bVar2 = (kotlin.jvm.internal.l.a(obj41, bool4) || obj41 == null) ? null : (O0.b) ((e4.k) A.f3053s.f6046m).invoke(obj41);
                Object obj42 = list13.get(11);
                C0998u c0998u3 = ((kotlin.jvm.internal.l.a(obj42, bool4) && zVar4 == null) || obj42 == null) ? null : (C0998u) zVar4.f3203l.invoke(obj42);
                kotlin.jvm.internal.l.c(c0998u3);
                Object obj43 = list13.get(12);
                S0.j jVar = (kotlin.jvm.internal.l.a(obj43, bool4) || obj43 == null) ? null : (S0.j) ((e4.k) A.f3044j.f6046m).invoke(obj43);
                Object obj44 = list13.get(13);
                C0972Q c0972q2 = C0972Q.f11801d;
                L2.e eVar11 = A.f3049o;
                if (!kotlin.jvm.internal.l.a(obj44, bool4) && obj44 != null) {
                    c0972q = (C0972Q) ((e4.k) eVar11.f6046m).invoke(obj44);
                }
                return new B(c0998u2.a, mVar3.a, uVar2, qVar, rVar, (M0.j) null, str7, mVar4.a, aVar2, nVar, bVar2, c0998u3.a, jVar, c0972q, 49184);
            case 14:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Int", obj);
                return new S0.j(((Integer) obj).intValue());
            case 15:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>", obj);
                List list14 = (List) obj;
                return new S0.n(((Number) list14.get(0)).floatValue(), ((Number) list14.get(1)).floatValue());
            case 16:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list15 = (List) obj;
                Object obj45 = list15.get(0);
                T0.n[] nVarArr3 = T0.m.f8847b;
                z zVar6 = A.f3051q;
                Boolean bool5 = Boolean.FALSE;
                T0.m mVar5 = ((kotlin.jvm.internal.l.a(obj45, bool5) && zVar6 == null) || obj45 == null) ? null : (T0.m) zVar6.f3203l.invoke(obj45);
                kotlin.jvm.internal.l.c(mVar5);
                Object obj46 = list15.get(1);
                if ((!kotlin.jvm.internal.l.a(obj46, bool5) || zVar6 != null) && obj46 != null) {
                    mVar = (T0.m) zVar6.f3203l.invoke(obj46);
                }
                kotlin.jvm.internal.l.c(mVar);
                return new S0.o(mVar5.a, mVar.a);
            case 17:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list16 = (List) obj;
                Object obj47 = list16.get(0);
                L2.e eVar12 = A.f3042h;
                Boolean bool6 = Boolean.FALSE;
                B b8 = (kotlin.jvm.internal.l.a(obj47, bool6) || obj47 == null) ? null : (B) ((e4.k) eVar12.f6046m).invoke(obj47);
                Object obj48 = list16.get(1);
                B b9 = (kotlin.jvm.internal.l.a(obj48, bool6) || obj48 == null) ? null : (B) ((e4.k) eVar12.f6046m).invoke(obj48);
                Object obj49 = list16.get(2);
                B b10 = (kotlin.jvm.internal.l.a(obj49, bool6) || obj49 == null) ? null : (B) ((e4.k) eVar12.f6046m).invoke(obj49);
                Object obj50 = list16.get(3);
                if (!kotlin.jvm.internal.l.a(obj50, bool6) && obj50 != null) {
                    b4 = (B) ((e4.k) eVar12.f6046m).invoke(obj50);
                }
                return new G(b8, b9, b10, b4);
            case 18:
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list17 = (List) obj;
                Object obj51 = list17.get(0);
                Integer num3 = obj51 != null ? (Integer) obj51 : null;
                kotlin.jvm.internal.l.c(num3);
                int iIntValue3 = num3.intValue();
                Object obj52 = list17.get(1);
                Integer num4 = obj52 != null ? (Integer) obj52 : null;
                kotlin.jvm.internal.l.c(num4);
                return new H(AbstractC1420H.c(iIntValue3, num4.intValue()));
            case 19:
                if (kotlin.jvm.internal.l.a(obj, Boolean.FALSE)) {
                    return new T0.m(T0.m.f8848c);
                }
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list18 = (List) obj;
                Object obj53 = list18.get(0);
                Float f9 = obj53 != null ? (Float) obj53 : null;
                kotlin.jvm.internal.l.c(f9);
                float fFloatValue2 = f9.floatValue();
                Object obj54 = list18.get(1);
                T0.n nVar2 = obj54 != null ? (T0.n) obj54 : null;
                kotlin.jvm.internal.l.c(nVar2);
                return new T0.m(n6.d.T(fFloatValue2, nVar2.a));
            case 20:
                String str8 = obj != null ? (String) obj : null;
                kotlin.jvm.internal.l.c(str8);
                return new J(str8);
            default:
                String str9 = obj != null ? (String) obj : null;
                kotlin.jvm.internal.l.c(str9);
                return new K(str9);
        }
    }
}
