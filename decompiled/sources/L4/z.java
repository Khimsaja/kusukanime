package L4;

import B1.C0023j;
import b1.AbstractC0703b;
import e5.AbstractC0832b;
import io.ktor.http.ContentDisposition;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import l4.InterfaceC1443v;
import m5.C1514c;
import m5.C1516e;
import m5.C1520i;
import m5.C1521j;
import m5.C1523l;
import n5.AbstractC1586x;
import n5.W;
import n5.a0;
import u4.EnumC2117x;
import u4.InterfaceC2105k;
import u4.N;
import u4.Q;
import x4.AbstractC2294u;
import x4.C2255A;
import x4.C2272S;
import x4.C2295v;

/* loaded from: classes.dex */
public abstract class z extends g5.p {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f6144m;

    /* renamed from: b, reason: collision with root package name */
    public final A2.b f6145b;

    /* renamed from: c, reason: collision with root package name */
    public final o f6146c;

    /* renamed from: d, reason: collision with root package name */
    public final C1514c f6147d;

    /* renamed from: e, reason: collision with root package name */
    public final C1520i f6148e;

    /* renamed from: f, reason: collision with root package name */
    public final C1516e f6149f;

    /* renamed from: g, reason: collision with root package name */
    public final C1521j f6150g;

    /* renamed from: h, reason: collision with root package name */
    public final C1516e f6151h;

    /* renamed from: i, reason: collision with root package name */
    public final C1520i f6152i;

    /* renamed from: j, reason: collision with root package name */
    public final C1520i f6153j;

    /* renamed from: k, reason: collision with root package name */
    public final C1520i f6154k;

    /* renamed from: l, reason: collision with root package name */
    public final C1516e f6155l;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r(z.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0);
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
        f6144m = new InterfaceC1443v[]{zVar.h(rVar), AbstractC0703b.r(z.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0, zVar), AbstractC0703b.r(z.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0, zVar)};
    }

    public z(A2.b bVar, o oVar) {
        kotlin.jvm.internal.l.f("c", bVar);
        this.f6145b = bVar;
        this.f6146c = oVar;
        C1523l c1523l = ((K4.a) bVar.f110l).a;
        w wVar = new w(this, 0);
        c1523l.getClass();
        this.f6147d = new C1514c(c1523l, wVar);
        w wVar2 = new w(this, 1);
        c1523l.getClass();
        this.f6148e = new C1520i(c1523l, wVar2);
        this.f6149f = c1523l.b(new x(this, 0));
        this.f6150g = c1523l.c(new x(this, 1));
        this.f6151h = c1523l.b(new x(this, 2));
        w wVar3 = new w(this, 2);
        c1523l.getClass();
        this.f6152i = new C1520i(c1523l, wVar3);
        w wVar4 = new w(this, 3);
        c1523l.getClass();
        this.f6153j = new C1520i(c1523l, wVar4);
        w wVar5 = new w(this, 4);
        c1523l.getClass();
        this.f6154k = new C1520i(c1523l, wVar5);
        this.f6155l = c1523l.b(new x(this, 3));
    }

    public static AbstractC1586x l(A4.y yVar, A2.b bVar) {
        kotlin.jvm.internal.l.f("method", yVar);
        Class<?> declaringClass = ((Method) yVar.b()).getDeclaringClass();
        kotlin.jvm.internal.l.e("getDeclaringClass(...)", declaringClass);
        M4.a aVarF0 = n6.d.f0(W.f13382l, declaringClass.isAnnotation(), null, 6);
        return ((B2.l) bVar.f113o).R(yVar.f(), aVarF0);
    }

    public static E3.b u(A2.b bVar, AbstractC2294u abstractC2294u, List list) {
        O3.l lVar;
        W4.e eVarD;
        P3.o oVarY0 = P3.q.Y0(list);
        ArrayList arrayList = new ArrayList(P3.r.p(oVarY0, 10));
        Iterator it = oVarY0.iterator();
        boolean z7 = false;
        while (true) {
            P3.C c2 = (P3.C) it;
            if (!c2.f7740l.hasNext()) {
                return new E3.b(z7, 1, P3.q.S0(arrayList));
            }
            P3.B b4 = (P3.B) c2.next();
            int i7 = b4.a;
            A4.E e7 = (A4.E) b4.f7738b;
            K4.c cVarK = z1.c.K(bVar, e7);
            M4.a aVarF0 = n6.d.f0(W.f13382l, false, null, 7);
            K4.a aVar = (K4.a) bVar.f110l;
            A4.C c4 = e7.a;
            boolean z8 = e7.f211d;
            B2.l lVar2 = (B2.l) bVar.f113o;
            C2255A c2255a = aVar.f4713o;
            if (z8) {
                A4.i iVar = c4 instanceof A4.i ? (A4.i) c4 : null;
                if (iVar == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + e7);
                }
                a0 a0VarQ = lVar2.Q(iVar, aVarF0, true);
                lVar = new O3.l(a0VarQ, c2255a.f17339n.f(a0VarQ));
            } else {
                lVar = new O3.l(lVar2.R(c4, aVarF0), null);
            }
            AbstractC1586x abstractC1586x = (AbstractC1586x) lVar.f7528k;
            AbstractC1586x abstractC1586x2 = (AbstractC1586x) lVar.f7529l;
            if (kotlin.jvm.internal.l.a(abstractC2294u.getName().b(), "equals") && list.size() == 1 && c2255a.f17339n.o().equals(abstractC1586x)) {
                eVarD = W4.e.e("other");
            } else {
                String str = e7.f210c;
                eVarD = str != null ? W4.e.d(str) : null;
                if (eVarD == null) {
                    z7 = true;
                }
                if (eVarD == null) {
                    eVarD = W4.e.e("p" + i7);
                }
            }
            arrayList.add(new C2272S(abstractC2294u, null, i7, cVarK, eVarD, abstractC1586x, false, false, false, abstractC1586x2, aVar.f4708j.b(e7)));
        }
    }

    @Override // g5.p, g5.o
    public Collection a(W4.e eVar, C4.c cVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        return !d().contains(eVar) ? P3.y.f7779k : (Collection) this.f6155l.invoke(eVar);
    }

    @Override // g5.p, g5.o
    public final Set c() {
        return (Set) AbstractC0832b.u(this.f6152i, f6144m[0]);
    }

    @Override // g5.p, g5.o
    public final Set d() {
        return (Set) AbstractC0832b.u(this.f6153j, f6144m[1]);
    }

    @Override // g5.p, g5.q
    public Collection e(g5.f fVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        return (Collection) this.f6147d.invoke();
    }

    @Override // g5.p, g5.o
    public Collection f(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        kotlin.jvm.internal.l.f("location", aVar);
        return !c().contains(eVar) ? P3.y.f7779k : (Collection) this.f6151h.invoke(eVar);
    }

    @Override // g5.p, g5.o
    public final Set g() {
        return (Set) AbstractC0832b.u(this.f6154k, f6144m[2]);
    }

    public abstract Set h(g5.f fVar, g5.l lVar);

    public abstract Set i(g5.f fVar, g5.l lVar);

    public void j(W4.e eVar, ArrayList arrayList) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
    }

    public abstract InterfaceC0440c k();

    public abstract void m(LinkedHashSet linkedHashSet, W4.e eVar);

    public abstract void n(W4.e eVar, ArrayList arrayList);

    public abstract Set o(g5.f fVar);

    public abstract C2295v p();

    public abstract InterfaceC2105k q();

    public boolean r(J4.f fVar) {
        return true;
    }

    public abstract y s(A4.y yVar, ArrayList arrayList, AbstractC1586x abstractC1586x, List list);

    /* JADX WARN: Type inference failed for: r3v2, types: [O3.i, java.lang.Object] */
    public final J4.f t(A4.y yVar) {
        kotlin.jvm.internal.l.f("method", yVar);
        A2.b bVar = this.f6145b;
        J4.f fVarC1 = J4.f.c1(q(), z1.c.K(bVar, yVar), yVar.c(), ((K4.a) bVar.f110l).f4708j.b(yVar), ((InterfaceC0440c) this.f6148e.invoke()).f(yVar.c()) != null && ((ArrayList) yVar.g()).isEmpty());
        kotlin.jvm.internal.l.f("<this>", bVar);
        A2.b bVar2 = new A2.b((K4.a) bVar.f110l, new C0023j(bVar, fVarC1, yVar, 0), (O3.i) bVar.f112n);
        ArrayList typeParameters = yVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(P3.r.p(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            Q qA = ((K4.e) bVar2.f111m).a((A4.D) it.next());
            kotlin.jvm.internal.l.c(qA);
            arrayList.add(qA);
        }
        E3.b bVarU = u(bVar2, fVarC1, yVar.g());
        y yVarS = s(yVar, arrayList, l(yVar, bVar2), (List) bVarU.f1932c);
        C2295v c2295vP = p();
        P3.y yVar2 = P3.y.f7779k;
        N n7 = EnumC2117x.f16341k;
        boolean zIsAbstract = Modifier.isAbstract(((Method) yVar.b()).getModifiers());
        boolean zIsFinal = Modifier.isFinal(((Method) yVar.b()).getModifiers());
        n7.getClass();
        fVarC1.b1(null, c2295vP, yVar2, yVarS.f6142c, yVarS.f6141b, yVarS.a, zIsAbstract ? EnumC2117x.f16345o : !zIsFinal ? EnumC2117x.f16344n : EnumC2117x.f16342l, P3.r.Z(yVar.e()), P3.z.f7780k);
        fVarC1.d1(false, bVarU.f1931b);
        if (yVarS.f6143d.isEmpty()) {
            return fVarC1;
        }
        ((K4.a) bVar2.f110l).f4703e.getClass();
        throw new UnsupportedOperationException("Should not be called");
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}
