package t4;

import b1.AbstractC0703b;
import e5.EnumC0834d;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import l4.AbstractC1420H;
import r4.AbstractC1875d;
import r4.AbstractC1886o;
import r4.AbstractC1887p;
import r4.EnumC1882k;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* renamed from: t4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2053d {
    public static final String a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f16038b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f16039c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f16040d;

    /* renamed from: e, reason: collision with root package name */
    public static final W4.b f16041e;

    /* renamed from: f, reason: collision with root package name */
    public static final W4.c f16042f;

    /* renamed from: g, reason: collision with root package name */
    public static final W4.b f16043g;

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f16044h;

    /* renamed from: i, reason: collision with root package name */
    public static final HashMap f16045i;

    /* renamed from: j, reason: collision with root package name */
    public static final HashMap f16046j;

    /* renamed from: k, reason: collision with root package name */
    public static final HashMap f16047k;

    /* renamed from: l, reason: collision with root package name */
    public static final HashMap f16048l;

    /* renamed from: m, reason: collision with root package name */
    public static final HashMap f16049m;

    /* renamed from: n, reason: collision with root package name */
    public static final List f16050n;

    static {
        StringBuilder sb = new StringBuilder();
        s4.g gVar = s4.g.f15830c;
        sb.append(gVar.a);
        sb.append('.');
        sb.append(gVar.f15834b);
        a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        s4.h hVar = s4.h.f15831c;
        sb2.append(hVar.a);
        sb2.append('.');
        sb2.append(hVar.f15834b);
        f16038b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        s4.j jVar = s4.j.f15833c;
        sb3.append(jVar.a);
        sb3.append('.');
        sb3.append(jVar.f15834b);
        f16039c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        s4.i iVar = s4.i.f15832c;
        sb4.append(iVar.a);
        sb4.append('.');
        sb4.append(iVar.f15834b);
        f16040d = sb4.toString();
        W4.b bVarL = android.support.v4.media.session.b.L(new W4.c("kotlin.jvm.functions.FunctionN"));
        f16041e = bVarL;
        f16042f = bVarL.a();
        f16043g = W4.h.f9653u;
        d(Class.class);
        f16044h = new HashMap();
        f16045i = new HashMap();
        f16046j = new HashMap();
        f16047k = new HashMap();
        f16048l = new HashMap();
        f16049m = new HashMap();
        W4.b bVarL2 = android.support.v4.media.session.b.L(AbstractC1886o.f14964B);
        W4.c cVar = AbstractC1886o.J;
        W4.c cVar2 = bVarL2.a;
        C2052c c2052c = new C2052c(d(Iterable.class), bVarL2, new W4.b(cVar2, AbstractC1420H.N(cVar, cVar2), false));
        W4.b bVarL3 = android.support.v4.media.session.b.L(AbstractC1886o.f14963A);
        W4.c cVar3 = AbstractC1886o.I;
        W4.c cVar4 = bVarL3.a;
        C2052c c2052c2 = new C2052c(d(Iterator.class), bVarL3, new W4.b(cVar4, AbstractC1420H.N(cVar3, cVar4), false));
        W4.b bVarL4 = android.support.v4.media.session.b.L(AbstractC1886o.f14965C);
        W4.c cVar5 = AbstractC1886o.f14971K;
        W4.c cVar6 = bVarL4.a;
        C2052c c2052c3 = new C2052c(d(Collection.class), bVarL4, new W4.b(cVar6, AbstractC1420H.N(cVar5, cVar6), false));
        W4.b bVarL5 = android.support.v4.media.session.b.L(AbstractC1886o.f14966D);
        W4.c cVar7 = AbstractC1886o.f14972L;
        W4.c cVar8 = bVarL5.a;
        C2052c c2052c4 = new C2052c(d(List.class), bVarL5, new W4.b(cVar8, AbstractC1420H.N(cVar7, cVar8), false));
        W4.b bVarL6 = android.support.v4.media.session.b.L(AbstractC1886o.f14968F);
        W4.c cVar9 = AbstractC1886o.f14974N;
        W4.c cVar10 = bVarL6.a;
        C2052c c2052c5 = new C2052c(d(Set.class), bVarL6, new W4.b(cVar10, AbstractC1420H.N(cVar9, cVar10), false));
        W4.b bVarL7 = android.support.v4.media.session.b.L(AbstractC1886o.f14967E);
        W4.c cVar11 = AbstractC1886o.f14973M;
        W4.c cVar12 = bVarL7.a;
        C2052c c2052c6 = new C2052c(d(ListIterator.class), bVarL7, new W4.b(cVar12, AbstractC1420H.N(cVar11, cVar12), false));
        W4.c cVar13 = AbstractC1886o.f14969G;
        W4.b bVarL8 = android.support.v4.media.session.b.L(cVar13);
        W4.c cVar14 = AbstractC1886o.f14975O;
        W4.c cVar15 = bVarL8.a;
        C2052c c2052c7 = new C2052c(d(Map.class), bVarL8, new W4.b(cVar15, AbstractC1420H.N(cVar14, cVar15), false));
        W4.b bVarD = android.support.v4.media.session.b.L(cVar13).d(AbstractC1886o.f14970H.a.g());
        W4.c cVar16 = AbstractC1886o.f14976P;
        W4.c cVar17 = bVarD.a;
        List<C2052c> listI = P3.r.I(c2052c, c2052c2, c2052c3, c2052c4, c2052c5, c2052c6, c2052c7, new C2052c(d(Map.Entry.class), bVarD, new W4.b(cVar17, AbstractC1420H.N(cVar16, cVar17), false)));
        f16050n = listI;
        c(Object.class, AbstractC1886o.a);
        c(String.class, AbstractC1886o.f14996f);
        c(CharSequence.class, AbstractC1886o.f14994e);
        b(Throwable.class, AbstractC1886o.f15003k);
        c(Cloneable.class, AbstractC1886o.f14990c);
        c(Number.class, AbstractC1886o.f15001i);
        b(Comparable.class, AbstractC1886o.f15004l);
        c(Enum.class, AbstractC1886o.f15002j);
        b(Annotation.class, AbstractC1886o.f15011s);
        for (C2052c c2052c8 : listI) {
            W4.b bVar = c2052c8.a;
            W4.b bVar2 = c2052c8.f16036b;
            a(bVar, bVar2);
            W4.b bVar3 = c2052c8.f16037c;
            f16045i.put(bVar3.a().a, bVar);
            f16048l.put(bVar3, bVar2);
            f16049m.put(bVar2, bVar3);
            W4.c cVarA = bVar2.a();
            W4.c cVarA2 = bVar3.a();
            f16046j.put(bVar3.a().a, cVarA);
            f16047k.put(cVarA.a, cVarA2);
        }
        for (EnumC0834d enumC0834d : EnumC0834d.values()) {
            W4.c cVar18 = enumC0834d.f11375n;
            if (cVar18 == null) {
                EnumC0834d.a(15);
                throw null;
            }
            W4.b bVar4 = new W4.b(cVar18.b(), cVar18.a.g());
            EnumC1882k enumC1882kD = enumC0834d.d();
            kotlin.jvm.internal.l.e("getPrimitiveType(...)", enumC1882kD);
            W4.c cVarA3 = AbstractC1887p.f15028k.a(enumC1882kD.f14953k);
            a(bVar4, new W4.b(cVarA3.b(), cVarA3.a.g()));
        }
        for (W4.b bVar5 : AbstractC1875d.a) {
            W4.c cVar19 = new W4.c("kotlin.jvm.internal." + bVar5.f().b() + "CompanionObject");
            a(new W4.b(cVar19.b(), cVar19.a.g()), bVar5.d(W4.g.f9627b));
        }
        for (int i7 = 0; i7 < 23; i7++) {
            W4.c cVar20 = new W4.c(AbstractC0703b.g(i7, "kotlin.jvm.functions.Function"));
            a(new W4.b(cVar20.b(), cVar20.a.g()), new W4.b(AbstractC1887p.f15028k, W4.e.e("Function" + i7)));
            f16045i.put(new W4.c(f16038b + i7).a, f16043g);
        }
        for (int i8 = 0; i8 < 22; i8++) {
            s4.i iVar2 = s4.i.f15832c;
            f16045i.put(new W4.c((iVar2.a + '.' + iVar2.f15834b) + i8).a, f16043g);
        }
        W4.c cVar21 = new W4.c("kotlin.concurrent.atomics.AtomicInt");
        W4.b bVarD2 = d(AtomicInteger.class);
        HashMap map = f16045i;
        map.put(cVar21.a, bVarD2);
        map.put(new W4.c("kotlin.concurrent.atomics.AtomicLong").a, d(AtomicLong.class));
        map.put(new W4.c("kotlin.concurrent.atomics.AtomicBoolean").a, d(AtomicBoolean.class));
        map.put(new W4.c("kotlin.concurrent.atomics.AtomicReference").a, d(AtomicReference.class));
        map.put(new W4.c("kotlin.concurrent.atomics.AtomicIntArray").a, d(AtomicIntegerArray.class));
        map.put(new W4.c("kotlin.concurrent.atomics.AtomicLongArray").a, d(AtomicLongArray.class));
        map.put(new W4.c("kotlin.concurrent.atomics.AtomicArray").a, d(AtomicReferenceArray.class));
        map.put(AbstractC1886o.f14988b.i().a, d(Void.class));
    }

    public static void a(W4.b bVar, W4.b bVar2) {
        f16044h.put(bVar.a().a, bVar2);
        f16045i.put(bVar2.a().a, bVar);
    }

    public static void b(Class cls, W4.c cVar) {
        W4.b bVarD = d(cls);
        kotlin.jvm.internal.l.f("topLevelFqName", cVar);
        a(bVarD, new W4.b(cVar.b(), cVar.a.g()));
    }

    public static void c(Class cls, W4.d dVar) {
        b(cls, dVar.i());
    }

    public static W4.b d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return d(declaringClass).d(W4.e.e(cls.getSimpleName()));
        }
        String canonicalName = cls.getCanonicalName();
        kotlin.jvm.internal.l.e("getCanonicalName(...)", canonicalName);
        W4.c cVar = new W4.c(canonicalName);
        return new W4.b(cVar.b(), cVar.a.g());
    }

    public static boolean e(W4.d dVar, String str) {
        Integer numU;
        String str2 = dVar.a;
        if (AbstractC2517v.T(str2, str, false)) {
            String strSubstring = str2.substring(str.length());
            kotlin.jvm.internal.l.e("substring(...)", strSubstring);
            if (!AbstractC2510o.x0(strSubstring, '0') && (numU = AbstractC2517v.U(strSubstring)) != null && numU.intValue() >= 23) {
                return true;
            }
        }
        return false;
    }

    public static W4.b f(W4.d dVar) {
        kotlin.jvm.internal.l.f("kotlinFqName", dVar);
        return (e(dVar, a) || e(dVar, f16039c)) ? f16041e : (e(dVar, f16038b) || e(dVar, f16040d)) ? f16043g : (W4.b) f16045i.get(dVar);
    }
}
