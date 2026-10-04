package v4;

import O3.t;
import P3.E;
import P3.q;
import P3.r;
import java.util.ArrayList;
import java.util.HashMap;
import l4.AbstractC1420H;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: A, reason: collision with root package name */
    public static final n f16666A;

    /* renamed from: B, reason: collision with root package name */
    public static final n f16667B;

    /* renamed from: C, reason: collision with root package name */
    public static final n f16668C;

    /* renamed from: D, reason: collision with root package name */
    public static final n f16669D;

    /* renamed from: E, reason: collision with root package name */
    public static final n f16670E;

    /* renamed from: F, reason: collision with root package name */
    public static final n f16671F;

    /* renamed from: G, reason: collision with root package name */
    public static final n f16672G;

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ n[] f16673H;
    public static final /* synthetic */ V3.b I;

    /* renamed from: l, reason: collision with root package name */
    public static final HashMap f16674l;

    /* renamed from: m, reason: collision with root package name */
    public static final n f16675m;

    /* renamed from: n, reason: collision with root package name */
    public static final n f16676n;

    /* renamed from: o, reason: collision with root package name */
    public static final n f16677o;

    /* renamed from: p, reason: collision with root package name */
    public static final n f16678p;

    /* renamed from: q, reason: collision with root package name */
    public static final n f16679q;

    /* renamed from: r, reason: collision with root package name */
    public static final n f16680r;

    /* renamed from: s, reason: collision with root package name */
    public static final n f16681s;

    /* renamed from: t, reason: collision with root package name */
    public static final n f16682t;

    /* renamed from: u, reason: collision with root package name */
    public static final n f16683u;

    /* renamed from: v, reason: collision with root package name */
    public static final n f16684v;

    /* renamed from: w, reason: collision with root package name */
    public static final n f16685w;

    /* renamed from: x, reason: collision with root package name */
    public static final n f16686x;

    /* renamed from: y, reason: collision with root package name */
    public static final n f16687y;

    /* renamed from: z, reason: collision with root package name */
    public static final n f16688z;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f16689k;

    static {
        n nVar = new n("CLASS", 0, true);
        f16675m = nVar;
        n nVar2 = new n("ANNOTATION_CLASS", 1, true);
        f16676n = nVar2;
        n nVar3 = new n("TYPE_PARAMETER", 2, false);
        f16677o = nVar3;
        n nVar4 = new n("PROPERTY", 3, true);
        f16678p = nVar4;
        n nVar5 = new n("FIELD", 4, true);
        f16679q = nVar5;
        n nVar6 = new n("LOCAL_VARIABLE", 5, true);
        f16680r = nVar6;
        n nVar7 = new n("VALUE_PARAMETER", 6, true);
        f16681s = nVar7;
        n nVar8 = new n("CONSTRUCTOR", 7, true);
        f16682t = nVar8;
        n nVar9 = new n("FUNCTION", 8, true);
        f16683u = nVar9;
        n nVar10 = new n("PROPERTY_GETTER", 9, true);
        f16684v = nVar10;
        n nVar11 = new n("PROPERTY_SETTER", 10, true);
        f16685w = nVar11;
        n nVar12 = new n("TYPE", 11, false);
        f16686x = nVar12;
        n nVar13 = new n("EXPRESSION", 12, false);
        n nVar14 = new n("FILE", 13, false);
        f16687y = nVar14;
        n nVar15 = new n("TYPEALIAS", 14, false);
        n nVar16 = new n("TYPE_PROJECTION", 15, false);
        n nVar17 = new n("STAR_PROJECTION", 16, false);
        n nVar18 = new n("PROPERTY_PARAMETER", 17, false);
        n nVar19 = new n("CLASS_ONLY", 18, false);
        f16688z = nVar19;
        n nVar20 = new n("OBJECT", 19, false);
        f16666A = nVar20;
        n nVar21 = new n("STANDALONE_OBJECT", 20, false);
        f16667B = nVar21;
        n nVar22 = new n("COMPANION_OBJECT", 21, false);
        f16668C = nVar22;
        n nVar23 = new n("INTERFACE", 22, false);
        f16669D = nVar23;
        n nVar24 = new n("ENUM_CLASS", 23, false);
        f16670E = nVar24;
        n nVar25 = new n("ENUM_ENTRY", 24, false);
        f16671F = nVar25;
        n nVar26 = new n("LOCAL_CLASS", 25, false);
        f16672G = nVar26;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10, nVar11, nVar12, nVar13, nVar14, nVar15, nVar16, nVar17, nVar18, nVar19, nVar20, nVar21, nVar22, nVar23, nVar24, nVar25, nVar26, new n("LOCAL_FUNCTION", 26, false), new n("MEMBER_FUNCTION", 27, false), new n("TOP_LEVEL_FUNCTION", 28, false), new n("MEMBER_PROPERTY", 29, false), new n("MEMBER_PROPERTY_WITH_BACKING_FIELD", 30, false), new n("MEMBER_PROPERTY_WITH_DELEGATE", 31, false), new n("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 32, false), new n("TOP_LEVEL_PROPERTY", 33, false), new n("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 34, false), new n("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 35, false), new n("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 36, false), new n("BACKING_FIELD", 37, true), new n("INITIALIZER", 38, false), new n("DESTRUCTURING_DECLARATION", 39, false), new n("LAMBDA_EXPRESSION", 40, false), new n("ANONYMOUS_FUNCTION", 41, false), new n("OBJECT_LITERAL", 42, false)};
        f16673H = nVarArr;
        V3.b bVarZ = AbstractC1420H.z(nVarArr);
        I = bVarZ;
        f16674l = new HashMap();
        t tVar = new t(4, bVarZ);
        while (tVar.hasNext()) {
            n nVar27 = (n) tVar.next();
            f16674l.put(nVar27.name(), nVar27);
        }
        V3.b bVar = I;
        ArrayList arrayList = new ArrayList();
        bVar.getClass();
        t tVar2 = new t(4, bVar);
        while (tVar2.hasNext()) {
            Object next = tVar2.next();
            if (((n) next).f16689k) {
                arrayList.add(next);
            }
        }
        q.X0(arrayList);
        q.X0(I);
        n nVar28 = f16676n;
        n nVar29 = f16675m;
        r.I(nVar28, nVar29);
        r.I(f16672G, nVar29);
        r.I(f16688z, nVar29);
        n nVar30 = f16668C;
        n nVar31 = f16666A;
        r.I(nVar30, nVar31, nVar29);
        r.I(f16667B, nVar31, nVar29);
        r.I(f16669D, nVar29);
        r.I(f16670E, nVar29);
        n nVar32 = f16671F;
        n nVar33 = f16678p;
        n nVar34 = f16679q;
        r.I(nVar32, nVar33, nVar34);
        n nVar35 = f16685w;
        r.H(nVar35);
        n nVar36 = f16684v;
        r.H(nVar36);
        r.H(f16683u);
        n nVar37 = f16687y;
        r.H(nVar37);
        EnumC2156d enumC2156d = EnumC2156d.f16645r;
        n nVar38 = f16681s;
        E.n0(new O3.l(enumC2156d, nVar38), new O3.l(EnumC2156d.f16639l, nVar34), new O3.l(EnumC2156d.f16641n, nVar33), new O3.l(EnumC2156d.f16640m, nVar37), new O3.l(EnumC2156d.f16642o, nVar36), new O3.l(EnumC2156d.f16643p, nVar35), new O3.l(EnumC2156d.f16644q, nVar38), new O3.l(EnumC2156d.f16646s, nVar38), new O3.l(EnumC2156d.f16647t, nVar34));
    }

    public n(String str, int i7, boolean z7) {
        this.f16689k = z7;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f16673H.clone();
    }
}
