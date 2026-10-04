package L4;

import e5.AbstractC0832b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.List;
import m5.C1520i;
import m5.C1523l;
import n5.M;
import o5.C1706f;
import u4.AbstractC2108n;
import u4.EnumC2100f;
import u4.EnumC2117x;
import u4.InterfaceC2099e;
import u4.InterfaceC2105k;
import u4.L;
import u4.N;
import u4.S;
import u4.Z;
import u4.c0;
import u4.f0;
import x4.AbstractC2284k;
import x4.C2283j;
import y4.C2415a;
import y4.C2416b;
import y4.C2417c;

/* loaded from: classes.dex */
public final class i extends AbstractC2284k implements J4.c {

    /* renamed from: A, reason: collision with root package name */
    public final o f6079A;

    /* renamed from: B, reason: collision with root package name */
    public final L f6080B;

    /* renamed from: C, reason: collision with root package name */
    public final g5.i f6081C;

    /* renamed from: D, reason: collision with root package name */
    public final C f6082D;

    /* renamed from: E, reason: collision with root package name */
    public final K4.c f6083E;

    /* renamed from: F, reason: collision with root package name */
    public final C1520i f6084F;

    /* renamed from: q, reason: collision with root package name */
    public final A2.b f6085q;

    /* renamed from: r, reason: collision with root package name */
    public final A4.p f6086r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC2099e f6087s;

    /* renamed from: t, reason: collision with root package name */
    public final A2.b f6088t;

    /* renamed from: u, reason: collision with root package name */
    public final O3.q f6089u;

    /* renamed from: v, reason: collision with root package name */
    public final EnumC2100f f6090v;

    /* renamed from: w, reason: collision with root package name */
    public final EnumC2117x f6091w;

    /* renamed from: x, reason: collision with root package name */
    public final f0 f6092x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f6093y;

    /* renamed from: z, reason: collision with root package name */
    public final h f6094z;

    static {
        P3.m.v0(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(A2.b bVar, InterfaceC2105k interfaceC2105k, A4.p pVar, InterfaceC2099e interfaceC2099e) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        EnumC2117x enumC2117x;
        kotlin.jvm.internal.l.f("outerContext", bVar);
        kotlin.jvm.internal.l.f("containingDeclaration", interfaceC2105k);
        kotlin.jvm.internal.l.f("jClass", pVar);
        K4.a aVar = (K4.a) bVar.f110l;
        super(aVar.a, interfaceC2105k, pVar.e(), aVar.f4708j.b(pVar));
        this.f6085q = bVar;
        this.f6086r = pVar;
        this.f6087s = interfaceC2099e;
        A2.b bVarN = q0.c.n(bVar, this, pVar, 4);
        this.f6088t = bVarN;
        K4.a aVar2 = (K4.a) bVarN.f110l;
        aVar2.f4705g.getClass();
        this.f6089u = z1.c.C(new g(this, 0));
        Class cls = pVar.a;
        this.f6090v = cls.isAnnotation() ? EnumC2100f.f16315o : cls.isInterface() ? EnumC2100f.f16312l : cls.isEnum() ? EnumC2100f.f16313m : EnumC2100f.f16311k;
        if (cls.isAnnotation() || cls.isEnum()) {
            enumC2117x = EnumC2117x.f16342l;
        } else {
            N n7 = EnumC2117x.f16341k;
            Boolean boolQ = n6.d.Q(cls);
            boolean zBooleanValue = boolQ != null ? boolQ.booleanValue() : false;
            Boolean boolQ2 = n6.d.Q(cls);
            boolean z7 = (boolQ2 != null ? boolQ2.booleanValue() : false) || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface();
            boolean zIsFinal = Modifier.isFinal(cls.getModifiers());
            n7.getClass();
            enumC2117x = zBooleanValue ? EnumC2117x.f16343m : z7 ? EnumC2117x.f16345o : !zIsFinal ? EnumC2117x.f16344n : EnumC2117x.f16342l;
        }
        this.f6091w = enumC2117x;
        int modifiers = cls.getModifiers();
        this.f6092x = Modifier.isPublic(modifiers) ? c0.f16306c : Modifier.isPrivate(modifiers) ? Z.f16303c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C2417c.f18373c : C2416b.f18372c : C2415a.f18371c;
        Class<?> declaringClass = cls.getDeclaringClass();
        this.f6093y = ((declaringClass != null ? new A4.p(declaringClass) : null) == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
        this.f6094z = new h(this);
        o oVar = new o(bVarN, this, pVar, interfaceC2099e != null, null);
        this.f6079A = oVar;
        N n8 = L.f16291d;
        C1523l c1523l = aVar2.a;
        aVar2.f4719u.getClass();
        A4.j jVar = new A4.j(8, this);
        n8.getClass();
        kotlin.jvm.internal.l.f("storageManager", c1523l);
        this.f6080B = new L(this, c1523l, jVar);
        this.f6081C = new g5.i(oVar);
        this.f6082D = new C(bVarN, pVar, this);
        this.f6083E = z1.c.K(bVarN, pVar);
        g gVar = new g(this, 1);
        c1523l.getClass();
        this.f6084F = new C1520i(c1523l, gVar);
    }

    @Override // u4.InterfaceC2099e
    public final boolean E() {
        return false;
    }

    @Override // u4.InterfaceC2116w
    public final boolean Q() {
        return false;
    }

    @Override // x4.AbstractC2275b, u4.InterfaceC2099e
    public final g5.o Y() {
        return this.f6081C;
    }

    @Override // u4.InterfaceC2099e
    public final S Z() {
        return null;
    }

    @Override // u4.InterfaceC2099e
    public final C2283j b0() {
        return null;
    }

    @Override // u4.InterfaceC2099e
    public final EnumC2100f c() {
        return this.f6090v;
    }

    @Override // u4.InterfaceC2099e
    public final g5.o c0() {
        return this.f6082D;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2116w
    public final EnumC2117x e() {
        return this.f6091w;
    }

    @Override // x4.AbstractC2275b, u4.InterfaceC2099e
    public final g5.o g0() {
        return (o) super.g0();
    }

    @Override // v4.InterfaceC2153a
    public final v4.h getAnnotations() {
        return this.f6083E;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2116w, u4.InterfaceC2107m
    public final H4.o getVisibility() {
        H4.o oVar = AbstractC2108n.a;
        f0 f0Var = this.f6092x;
        if (kotlin.jvm.internal.l.a(f0Var, oVar)) {
            Class<?> declaringClass = this.f6086r.a.getDeclaringClass();
            if ((declaringClass != null ? new A4.p(declaringClass) : null) == null) {
                H4.o oVar2 = H4.p.a;
                kotlin.jvm.internal.l.c(oVar2);
                return oVar2;
            }
        }
        return P3.r.Z(f0Var);
    }

    @Override // u4.InterfaceC2099e
    public final boolean i() {
        return false;
    }

    @Override // u4.InterfaceC2116w
    public final boolean i0() {
        return false;
    }

    @Override // u4.InterfaceC2099e
    public final boolean isInline() {
        return false;
    }

    @Override // u4.InterfaceC2103i
    public final boolean j() {
        return this.f6093y;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2103i
    public final List n() {
        return (List) this.f6084F.invoke();
    }

    @Override // u4.InterfaceC2099e
    public final boolean p0() {
        return false;
    }

    @Override // x4.AbstractC2299z
    public final g5.o q(C1706f c1706f) {
        L l7 = this.f6080B;
        d5.e.j(l7.a);
        return (o) ((g5.o) AbstractC0832b.u(l7.f16294c, L.f16292e[0]));
    }

    public final o q0() {
        return (o) super.g0();
    }

    public final String toString() {
        return "Lazy Java class " + d5.e.h(this);
    }

    @Override // u4.InterfaceC2102h
    public final M v() {
        return this.f6094z;
    }

    @Override // u4.InterfaceC2099e
    public final boolean x() {
        return false;
    }

    @Override // u4.InterfaceC2099e
    public final Collection y() {
        return (List) this.f6079A.f6115q.invoke();
    }
}
