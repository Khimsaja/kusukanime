package D4;

import java.util.ArrayList;
import l4.InterfaceC1443v;

/* renamed from: D4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0096o {
    public static final /* synthetic */ InterfaceC1443v[] a;

    /* renamed from: b, reason: collision with root package name */
    public static final B2.l f1614b;

    /* renamed from: c, reason: collision with root package name */
    public static final B2.l f1615c;

    /* renamed from: d, reason: collision with root package name */
    public static final F.w f1616d;

    /* renamed from: e, reason: collision with root package name */
    public static final F.w f1617e;

    static {
        kotlin.jvm.internal.o oVar = new kotlin.jvm.internal.o(AbstractC0096o.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmClass;)Z", 1);
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
        a = new InterfaceC1443v[]{zVar.f(oVar), A6.b.m(AbstractC0096o.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmConstructor;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmFunction;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmProperty;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmValueParameter;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmTypeAlias;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "modality", "getModality(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Modality;", 1, zVar), A6.b.m(AbstractC0096o.class, "visibility", "getVisibility(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Visibility;", 1, zVar), A6.b.m(AbstractC0096o.class, "kind", "getKind(Lkotlin/metadata/KmClass;)Lkotlin/metadata/ClassKind;", 1, zVar), A6.b.m(AbstractC0096o.class, "isInner", "isInner(Lkotlin/metadata/KmClass;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isData", "isData(Lkotlin/metadata/KmClass;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isExternal", "isExternal(Lkotlin/metadata/KmClass;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isExpect", "isExpect(Lkotlin/metadata/KmClass;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isValue", "isValue(Lkotlin/metadata/KmClass;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isFunInterface", "isFunInterface(Lkotlin/metadata/KmClass;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "hasEnumEntries", "getHasEnumEntries(Lkotlin/metadata/KmClass;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "visibility", "getVisibility(Lkotlin/metadata/KmConstructor;)Lkotlin/metadata/Visibility;", 1, zVar), A6.b.m(AbstractC0096o.class, "isSecondary", "isSecondary(Lkotlin/metadata/KmConstructor;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmConstructor;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "kind", "getKind(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/MemberKind;", 1, zVar), zVar.f(new kotlin.jvm.internal.o(AbstractC0096o.class, "visibility", "getVisibility(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Visibility;", 1)), A6.b.m(AbstractC0096o.class, "modality", "getModality(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Modality;", 1, zVar), A6.b.m(AbstractC0096o.class, "isOperator", "isOperator(Lkotlin/metadata/KmFunction;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isInfix", "isInfix(Lkotlin/metadata/KmFunction;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isInline", "isInline(Lkotlin/metadata/KmFunction;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isTailrec", "isTailrec(Lkotlin/metadata/KmFunction;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isExternal", "isExternal(Lkotlin/metadata/KmFunction;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmFunction;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isExpect", "isExpect(Lkotlin/metadata/KmFunction;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmFunction;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "visibility", "getVisibility(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Visibility;", 1, zVar), A6.b.m(AbstractC0096o.class, "modality", "getModality(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Modality;", 1, zVar), A6.b.m(AbstractC0096o.class, "kind", "getKind(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/MemberKind;", 1, zVar), A6.b.m(AbstractC0096o.class, "isVar", "isVar(Lkotlin/metadata/KmProperty;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isConst", "isConst(Lkotlin/metadata/KmProperty;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isLateinit", "isLateinit(Lkotlin/metadata/KmProperty;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "hasConstant", "getHasConstant(Lkotlin/metadata/KmProperty;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isExternal", "isExternal(Lkotlin/metadata/KmProperty;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isDelegated", "isDelegated(Lkotlin/metadata/KmProperty;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isExpect", "isExpect(Lkotlin/metadata/KmProperty;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "visibility", "getVisibility(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Visibility;", 1, zVar), A6.b.m(AbstractC0096o.class, "modality", "getModality(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Modality;", 1, zVar), A6.b.m(AbstractC0096o.class, "isNotDefault", "isNotDefault(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1, zVar), zVar.f(new kotlin.jvm.internal.o(AbstractC0096o.class, "isExternal", "isExternal(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1)), A6.b.m(AbstractC0096o.class, "isInline", "isInline(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isNullable", "isNullable(Lkotlin/metadata/KmType;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmType;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isDefinitelyNonNull", "isDefinitelyNonNull(Lkotlin/metadata/KmType;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isReified", "isReified(Lkotlin/metadata/KmTypeParameter;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "visibility", "getVisibility(Lkotlin/metadata/KmTypeAlias;)Lkotlin/metadata/Visibility;", 1, zVar), A6.b.m(AbstractC0096o.class, "declaresDefaultValue", "getDeclaresDefaultValue(Lkotlin/metadata/KmValueParameter;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isCrossinline", "isCrossinline(Lkotlin/metadata/KmValueParameter;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isNoinline", "isNoinline(Lkotlin/metadata/KmValueParameter;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isNegated", "isNegated(Lkotlin/metadata/KmEffectExpression;)Z", 1, zVar), A6.b.m(AbstractC0096o.class, "isNullCheckPredicate", "isNullCheckPredicate(Lkotlin/metadata/KmEffectExpression;)Z", 1, zVar)};
        T4.b bVar = T4.e.f9083c;
        kotlin.jvm.internal.l.e("HAS_ANNOTATIONS", bVar);
        C1.i iVar = new C1.i(bVar);
        E4.a aVar = E4.a.f1933k;
        if (iVar.f580b != 1 || iVar.f581c != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar, " was passed").toString());
        }
        C1.i iVar2 = new C1.i(bVar);
        int i7 = E4.b.f1934k;
        if (iVar2.f580b != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar2, " was passed").toString());
        }
        P3.r.v(new C1.i(bVar));
        C1.i iVar3 = new C1.i(bVar);
        E4.e eVar = E4.e.f1937k;
        if (iVar3.f580b != 1 || iVar3.f581c != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar3, " was passed").toString());
        }
        P3.r.P(new C1.i(bVar));
        P3.r.a0(new C1.i(bVar));
        C1.i iVar4 = new C1.i(bVar);
        int i8 = AbstractC0082a.f1560n;
        if (iVar4.f580b != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar4, " was passed").toString());
        }
        f1614b = P3.r.L(C0088g.f1584k);
        P3.r.b0(C0094m.f1612k);
        C0084c c0084c = C0084c.f1571k;
        T4.c cVar = T4.e.f9086f;
        kotlin.jvm.internal.l.e("CLASS_KIND", cVar);
        V3.b bVar2 = EnumC0097p.f1626t;
        ArrayList arrayList = new ArrayList(P3.r.p(bVar2, 10));
        O3.t tVar = new O3.t(4, bVar2);
        while (tVar.hasNext()) {
            arrayList.add(((EnumC0097p) tVar.next()).f1627k);
        }
        f1615c = new B2.l(c0084c, cVar, bVar2, arrayList);
        T4.b bVar3 = T4.e.f9087g;
        kotlin.jvm.internal.l.e("IS_INNER", bVar3);
        C1.i iVar5 = new C1.i(bVar3);
        E4.a aVar2 = E4.a.f1933k;
        f1616d = new F.w(aVar2, iVar5);
        T4.b bVar4 = T4.e.f9088h;
        kotlin.jvm.internal.l.e("IS_DATA", bVar4);
        C1.i iVar6 = new C1.i(bVar4);
        if (iVar6.f580b != 1 || iVar6.f581c != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar6, " was passed").toString());
        }
        T4.b bVar5 = T4.e.f9089i;
        kotlin.jvm.internal.l.e("IS_EXTERNAL_CLASS", bVar5);
        C1.i iVar7 = new C1.i(bVar5);
        if (iVar7.f580b != 1 || iVar7.f581c != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar7, " was passed").toString());
        }
        T4.b bVar6 = T4.e.f9090j;
        kotlin.jvm.internal.l.e("IS_EXPECT_CLASS", bVar6);
        C1.i iVar8 = new C1.i(bVar6);
        if (iVar8.f580b != 1 || iVar8.f581c != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar8, " was passed").toString());
        }
        T4.b bVar7 = T4.e.f9091k;
        kotlin.jvm.internal.l.e("IS_VALUE_CLASS", bVar7);
        f1617e = new F.w(aVar2, new C1.i(bVar7));
        T4.b bVar8 = T4.e.f9092l;
        kotlin.jvm.internal.l.e("IS_FUN_INTERFACE", bVar8);
        C1.i iVar9 = new C1.i(bVar8);
        if (iVar9.f580b != 1 || iVar9.f581c != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar9, " was passed").toString());
        }
        T4.b bVar9 = T4.e.f9093m;
        kotlin.jvm.internal.l.e("HAS_ENUM_ENTRIES", bVar9);
        C1.i iVar10 = new C1.i(bVar9);
        if (iVar10.f580b != 1 || iVar10.f581c != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar10, " was passed").toString());
        }
        P3.r.b0(C0095n.f1613k);
        T4.b bVar10 = T4.e.f9094n;
        kotlin.jvm.internal.l.e("IS_SECONDARY", bVar10);
        C1.i iVar11 = new C1.i(bVar10);
        int i9 = E4.b.f1934k;
        if (iVar11.f580b != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar11, " was passed").toString());
        }
        T4.b bVar11 = T4.e.f9095o;
        kotlin.jvm.internal.l.e("IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES", bVar11);
        C1.i iVar12 = new C1.i(bVar11);
        if (iVar12.f580b != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar12, " was passed").toString());
        }
        P3.r.K(C0085d.f1574k);
        P3.r.b0(C0090i.f1595k);
        P3.r.L(C0089h.f1589k);
        T4.b bVar12 = T4.e.f9097q;
        kotlin.jvm.internal.l.e("IS_OPERATOR", bVar12);
        P3.r.v(new C1.i(bVar12));
        T4.b bVar13 = T4.e.f9098r;
        kotlin.jvm.internal.l.e("IS_INFIX", bVar13);
        P3.r.v(new C1.i(bVar13));
        T4.b bVar14 = T4.e.f9099s;
        kotlin.jvm.internal.l.e("IS_INLINE", bVar14);
        P3.r.v(new C1.i(bVar14));
        T4.b bVar15 = T4.e.f9100t;
        kotlin.jvm.internal.l.e("IS_TAILREC", bVar15);
        P3.r.v(new C1.i(bVar15));
        T4.b bVar16 = T4.e.f9101u;
        kotlin.jvm.internal.l.e("IS_EXTERNAL_FUNCTION", bVar16);
        P3.r.v(new C1.i(bVar16));
        T4.b bVar17 = T4.e.f9102v;
        kotlin.jvm.internal.l.e("IS_SUSPEND", bVar17);
        P3.r.v(new C1.i(bVar17));
        T4.b bVar18 = T4.e.f9103w;
        kotlin.jvm.internal.l.e("IS_EXPECT_FUNCTION", bVar18);
        P3.r.v(new C1.i(bVar18));
        T4.b bVar19 = T4.e.f9104x;
        kotlin.jvm.internal.l.e("IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES", bVar19);
        P3.r.v(new C1.i(bVar19));
        P3.r.b0(C0091j.f1599k);
        P3.r.L(C0086e.f1576k);
        P3.r.K(C0083b.f1567k);
        T4.b bVar20 = T4.e.f9105y;
        kotlin.jvm.internal.l.e("IS_VAR", bVar20);
        C1.i iVar13 = new C1.i(bVar20);
        E4.e eVar2 = E4.e.f1937k;
        if (iVar13.f580b != 1 || iVar13.f581c != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar13, " was passed").toString());
        }
        T4.b bVar21 = T4.e.f9069B;
        kotlin.jvm.internal.l.e("IS_CONST", bVar21);
        C1.i iVar14 = new C1.i(bVar21);
        if (iVar14.f580b != 1 || iVar14.f581c != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar14, " was passed").toString());
        }
        T4.b bVar22 = T4.e.f9070C;
        kotlin.jvm.internal.l.e("IS_LATEINIT", bVar22);
        C1.i iVar15 = new C1.i(bVar22);
        if (iVar15.f580b != 1 || iVar15.f581c != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar15, " was passed").toString());
        }
        T4.b bVar23 = T4.e.f9071D;
        kotlin.jvm.internal.l.e("HAS_CONSTANT", bVar23);
        C1.i iVar16 = new C1.i(bVar23);
        if (iVar16.f580b != 1 || iVar16.f581c != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar16, " was passed").toString());
        }
        T4.b bVar24 = T4.e.f9072E;
        kotlin.jvm.internal.l.e("IS_EXTERNAL_PROPERTY", bVar24);
        C1.i iVar17 = new C1.i(bVar24);
        if (iVar17.f580b != 1 || iVar17.f581c != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar17, " was passed").toString());
        }
        T4.b bVar25 = T4.e.f9073F;
        kotlin.jvm.internal.l.e("IS_DELEGATED", bVar25);
        C1.i iVar18 = new C1.i(bVar25);
        if (iVar18.f580b != 1 || iVar18.f581c != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar18, " was passed").toString());
        }
        T4.b bVar26 = T4.e.f9074G;
        kotlin.jvm.internal.l.e("IS_EXPECT_PROPERTY", bVar26);
        C1.i iVar19 = new C1.i(bVar26);
        if (iVar19.f580b != 1 || iVar19.f581c != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar19, " was passed").toString());
        }
        P3.r.b0(C0092k.f1607k);
        P3.r.L(C0087f.f1581k);
        T4.b bVar27 = T4.e.f9076K;
        kotlin.jvm.internal.l.e("IS_NOT_DEFAULT", bVar27);
        P3.r.P(new C1.i(bVar27));
        T4.b bVar28 = T4.e.f9077L;
        kotlin.jvm.internal.l.e("IS_EXTERNAL_ACCESSOR", bVar28);
        P3.r.P(new C1.i(bVar28));
        T4.b bVar29 = T4.e.f9078M;
        kotlin.jvm.internal.l.e("IS_INLINE_ACCESSOR", bVar29);
        P3.r.P(new C1.i(bVar29));
        int i10 = E4.f.f1938k;
        T4.b bVar30 = T4.e.a;
        int i11 = bVar30.a + 1;
        int i12 = bVar30.f9067b;
        C1.i iVar20 = new C1.i(i11, i12, 1);
        int i13 = E4.f.f1938k;
        if (i12 != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar20, " was passed").toString());
        }
        T4.b bVar31 = T4.e.f9082b;
        int i14 = bVar31.a + 1;
        int i15 = bVar31.f9067b;
        C1.i iVar21 = new C1.i(i14, i15, 1);
        int i16 = E4.f.f1938k;
        if (i15 != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar21, " was passed").toString());
        }
        int i17 = AbstractC0082a.f1560n;
        P3.r.b0(C0093l.f1611k);
        T4.b bVar32 = T4.e.f9075H;
        kotlin.jvm.internal.l.e("DECLARES_DEFAULT_VALUE", bVar32);
        P3.r.a0(new C1.i(bVar32));
        T4.b bVar33 = T4.e.I;
        kotlin.jvm.internal.l.e("IS_CROSSINLINE", bVar33);
        P3.r.a0(new C1.i(bVar33));
        T4.b bVar34 = T4.e.J;
        kotlin.jvm.internal.l.e("IS_NOINLINE", bVar34);
        P3.r.a0(new C1.i(bVar34));
        int i18 = AbstractC0082a.f1560n;
        T4.b bVar35 = T4.e.f9079N;
        kotlin.jvm.internal.l.e("IS_NEGATED", bVar35);
        C1.i iVar22 = new C1.i(bVar35);
        if (iVar22.f580b != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar22, " was passed").toString());
        }
        int i19 = AbstractC0082a.f1560n;
        T4.b bVar36 = T4.e.f9080O;
        kotlin.jvm.internal.l.e("IS_NULL_CHECK_PREDICATE", bVar36);
        C1.i iVar23 = new C1.i(bVar36);
        if (iVar23.f580b != 1 || iVar23.f581c != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar23, " was passed").toString());
        }
    }

    public static final EnumC0097p a(M m7) {
        return (EnumC0097p) f1615c.D(m7, a[9]);
    }
}
