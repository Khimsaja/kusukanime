package W4;

import P3.E;
import P3.F;
import P3.J;
import P3.m;
import P3.r;
import io.ktor.http.ContentType;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: A, reason: collision with root package name */
    public static final b f9633A;
    public static final c a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f9634b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f9635c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f9636d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f9637e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f9638f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f9639g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f9640h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f9641i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f9642j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f9643k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f9644l;

    /* renamed from: m, reason: collision with root package name */
    public static final b f9645m;

    /* renamed from: n, reason: collision with root package name */
    public static final b f9646n;

    /* renamed from: o, reason: collision with root package name */
    public static final b f9647o;

    /* renamed from: p, reason: collision with root package name */
    public static final b f9648p;

    /* renamed from: q, reason: collision with root package name */
    public static final b f9649q;

    /* renamed from: r, reason: collision with root package name */
    public static final b f9650r;

    /* renamed from: s, reason: collision with root package name */
    public static final b f9651s;

    /* renamed from: t, reason: collision with root package name */
    public static final b f9652t;

    /* renamed from: u, reason: collision with root package name */
    public static final b f9653u;

    /* renamed from: v, reason: collision with root package name */
    public static final Set f9654v;

    /* renamed from: w, reason: collision with root package name */
    public static final Set f9655w;

    /* renamed from: x, reason: collision with root package name */
    public static final b f9656x;

    /* renamed from: y, reason: collision with root package name */
    public static final b f9657y;

    /* renamed from: z, reason: collision with root package name */
    public static final b f9658z;

    static {
        c cVar = new c("kotlin");
        a = cVar;
        c cVarA = cVar.a(e.e("reflect"));
        f9634b = cVarA;
        cVar.a(e.e("experimental"));
        c cVarA2 = cVar.a(e.e("collections"));
        f9635c = cVarA2;
        cVar.a(e.e("sequences"));
        c cVarA3 = cVar.a(e.e("ranges"));
        f9636d = cVarA3;
        c cVarA4 = cVar.a(e.e("jvm"));
        cVar.a(e.e("js"));
        cVar.a(e.e("annotations")).a(e.e("jvm"));
        cVarA4.a(e.e("internal"));
        cVarA4.a(e.e("functions"));
        c cVarA5 = cVar.a(e.e("annotation"));
        f9637e = cVarA5;
        c cVarA6 = cVar.a(e.e("internal"));
        cVarA6.a(e.e("ir"));
        c cVarA7 = cVar.a(e.e("coroutines"));
        f9638f = cVarA7;
        cVarA7.a(e.e("intrinsics"));
        f9639g = cVar.a(e.e("enums"));
        cVar.a(e.e("contracts"));
        c cVarA8 = cVar.a(e.e("concurrent")).a(e.e("atomics"));
        f9640h = cVarA8;
        cVar.a(e.e("test"));
        cVar.a(e.e(ContentType.Text.TYPE));
        m.v0(new c[]{cVar, cVarA2, cVarA3, cVarA5});
        m.v0(new c[]{cVar, cVarA2, cVarA3, cVarA5, cVarA, cVarA6, cVarA7, cVarA8});
        n6.d.d("Nothing");
        f9641i = n6.d.d("Unit");
        f9642j = n6.d.d("Any");
        f9643k = n6.d.d("Enum");
        n6.d.d("Annotation");
        f9644l = n6.d.d("Array");
        b bVarD = n6.d.d("Boolean");
        f9645m = bVarD;
        b bVarD2 = n6.d.d("Char");
        b bVarD3 = n6.d.d("Byte");
        b bVarD4 = n6.d.d("Short");
        b bVarD5 = n6.d.d("Int");
        f9646n = bVarD5;
        b bVarD6 = n6.d.d("Long");
        f9647o = bVarD6;
        b bVarD7 = n6.d.d("Float");
        b bVarD8 = n6.d.d("Double");
        f9648p = n6.d.r(bVarD3);
        f9649q = n6.d.r(bVarD4);
        f9650r = n6.d.r(bVarD5);
        f9651s = n6.d.r(bVarD6);
        n6.d.d("CharSequence");
        f9652t = n6.d.d("String");
        n6.d.d("Throwable");
        n6.d.d("Cloneable");
        n6.d.n("KProperty");
        n6.d.n("KMutableProperty");
        n6.d.n("KProperty0");
        n6.d.n("KMutableProperty0");
        n6.d.n("KProperty1");
        n6.d.n("KMutableProperty1");
        n6.d.n("KProperty2");
        n6.d.n("KMutableProperty2");
        f9653u = n6.d.n("KFunction");
        n6.d.n("KClass");
        n6.d.n("KCallable");
        n6.d.n("KType");
        n6.d.d("Comparable");
        n6.d.d("Number");
        n6.d.d("Function");
        Set setV0 = m.v0(new b[]{bVarD, bVarD2, bVarD3, bVarD4, bVarD5, bVarD6, bVarD7, bVarD8});
        f9654v = setV0;
        m.v0(new b[]{bVarD3, bVarD4, bVarD5, bVarD6});
        Set set = setV0;
        int I = F.I(r.p(set, 10));
        if (I < 16) {
            I = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(I);
        for (Object obj : set) {
            linkedHashMap.put(obj, n6.d.m(((b) obj).f()));
        }
        n6.d.j(linkedHashMap);
        Set setV02 = m.v0(new b[]{f9648p, f9649q, f9650r, f9651s});
        f9655w = setV02;
        Set set2 = setV02;
        int I6 = F.I(r.p(set2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(I6 >= 16 ? I6 : 16);
        for (Object obj2 : set2) {
            linkedHashMap2.put(obj2, n6.d.m(((b) obj2).f()));
        }
        n6.d.j(linkedHashMap2);
        Set set3 = f9654v;
        Set set4 = f9655w;
        LinkedHashSet linkedHashSetT = J.T(set3, set4);
        b bVar = f9652t;
        J.U(linkedHashSetT, bVar);
        c cVar2 = f9638f;
        e eVarE = e.e("Continuation");
        l.f("packageFqName", cVar2);
        c cVar3 = c.f9618c;
        F.g0(eVarE).a.c();
        n6.d.g("Iterator");
        n6.d.g("Iterable");
        n6.d.g("Collection");
        n6.d.g("List");
        n6.d.g("ListIterator");
        n6.d.g("Set");
        b bVarG = n6.d.g("Map");
        n6.d.g("AbstractMap");
        n6.d.g("MutableIterator");
        n6.d.g("CharIterator");
        n6.d.g("MutableIterable");
        n6.d.g("MutableCollection");
        f9656x = n6.d.g("MutableList");
        n6.d.g("MutableListIterator");
        f9657y = n6.d.g("MutableSet");
        b bVarG2 = n6.d.g("MutableMap");
        f9658z = bVarG2;
        bVarG.d(e.e("Entry"));
        bVarG2.d(e.e("MutableEntry"));
        n6.d.d("Result");
        c cVar4 = f9636d;
        e eVarE2 = e.e("IntRange");
        l.f("packageFqName", cVar4);
        F.g0(eVarE2).a.c();
        e eVarE3 = e.e("LongRange");
        l.f("packageFqName", cVar4);
        F.g0(eVarE3).a.c();
        e eVarE4 = e.e("CharRange");
        l.f("packageFqName", cVar4);
        F.g0(eVarE4).a.c();
        c cVar5 = f9637e;
        e eVarE5 = e.e("AnnotationRetention");
        l.f("packageFqName", cVar5);
        F.g0(eVarE5).a.c();
        e eVarE6 = e.e("AnnotationTarget");
        l.f("packageFqName", cVar5);
        F.g0(eVarE6).a.c();
        n6.d.d("DeprecationLevel");
        f9633A = new b(f9639g, e.e("EnumEntries"));
        b bVarB = n6.d.b("AtomicBoolean");
        b bVarB2 = n6.d.b("AtomicInt");
        b bVarB3 = n6.d.b("AtomicLong");
        n6.d.b("AtomicReference");
        O3.l lVar = new O3.l(f9645m, bVarB);
        b bVar2 = f9646n;
        O3.l lVar2 = new O3.l(bVar2, bVarB2);
        b bVar3 = f9647o;
        E.n0(lVar, lVar2, new O3.l(bVar3, bVarB3));
        n6.d.b("AtomicArray");
        E.n0(new O3.l(bVar2, n6.d.b("AtomicIntArray")), new O3.l(bVar3, n6.d.b("AtomicLongArray")));
        J.U(J.U(J.U(J.U(J.T(set3, set4), bVar), f9641i), f9642j), f9643k);
    }
}
