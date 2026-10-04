package o4;

import e5.AbstractC0832b;
import f6.AbstractC0915m;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1403c;
import l4.InterfaceC1428g;
import l4.InterfaceC1443v;
import n5.AbstractC1586x;
import p4.C1802h;
import p4.C1803i;
import p4.InterfaceC1801g;
import u4.AbstractC2108n;
import u4.InterfaceC2099e;
import u4.InterfaceC2112s;
import x4.AbstractC2287n;
import x4.C2272S;
import x4.C2283j;

/* renamed from: o4.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1656J extends AbstractC1694t implements kotlin.jvm.internal.h, InterfaceC1428g, InterfaceC1678f {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f13640x = {kotlin.jvm.internal.y.a.h(new kotlin.jvm.internal.r(C1656J.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0))};

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC1654H f13641r;

    /* renamed from: s, reason: collision with root package name */
    public final String f13642s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f13643t;

    /* renamed from: u, reason: collision with root package name */
    public final z0 f13644u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f13645v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f13646w;

    public C1656J(AbstractC1654H abstractC1654H, String str, String str2, InterfaceC2112s interfaceC2112s, Object obj) {
        this.f13641r = abstractC1654H;
        this.f13642s = str2;
        this.f13643t = obj;
        this.f13644u = AbstractC0915m.D(interfaceC2112s, new A3.q(13, this, str));
        O3.j jVar = O3.j.f7525k;
        this.f13645v = z1.c.B(jVar, new C1655I(this, 0));
        this.f13646w = z1.c.B(jVar, new C1655I(this, 1));
    }

    public final boolean equals(Object obj) {
        C1656J c1656jB = F0.b(obj);
        return c1656jB != null && kotlin.jvm.internal.l.a(this.f13641r, c1656jB.f13641r) && getName().equals(c1656jB.getName()) && kotlin.jvm.internal.l.a(this.f13642s, c1656jB.f13642s) && kotlin.jvm.internal.l.a(this.f13643t, c1656jB.f13643t);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // o4.AbstractC1694t
    public final InterfaceC1801g f() {
        return (InterfaceC1801g) this.f13645v.getValue();
    }

    @Override // o4.AbstractC1694t
    public final AbstractC1654H g() {
        return this.f13641r;
    }

    @Override // kotlin.jvm.internal.h
    public final int getArity() {
        return AbstractC0915m.r(f());
    }

    @Override // l4.InterfaceC1424c
    public final String getName() {
        String strB = ((AbstractC2287n) p()).getName().b();
        kotlin.jvm.internal.l.e("asString(...)", strB);
        return strB;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // o4.AbstractC1694t
    public final InterfaceC1801g h() {
        return (InterfaceC1801g) this.f13646w.getValue();
    }

    public final int hashCode() {
        return this.f13642s.hashCode() + ((getName().hashCode() + (this.f13641r.hashCode() * 31)) * 31);
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // l4.InterfaceC1428g
    public final boolean isExternal() {
        return p().isExternal();
    }

    @Override // l4.InterfaceC1428g
    public final boolean isInfix() {
        return p().isInfix();
    }

    @Override // l4.InterfaceC1428g
    public final boolean isInline() {
        return p().isInline();
    }

    @Override // l4.InterfaceC1428g
    public final boolean isOperator() {
        return p().isOperator();
    }

    @Override // l4.InterfaceC1424c
    public final boolean isSuspend() {
        return p().isSuspend();
    }

    @Override // o4.AbstractC1694t
    public final boolean s() {
        return this.f13643t != AbstractC1403c.NO_RECEIVER;
    }

    public final p4.x t(Constructor constructor, InterfaceC2112s interfaceC2112s, boolean z7) {
        Object obj = this.f13643t;
        Class<?> cls = null;
        if (!z7) {
            C2283j c2283j = interfaceC2112s instanceof C2283j ? (C2283j) interfaceC2112s : null;
            if (c2283j != null) {
                C2283j c2283j2 = c2283j;
                if (!AbstractC2108n.e(c2283j2.getVisibility())) {
                    InterfaceC2099e interfaceC2099eC = c2283j.C();
                    kotlin.jvm.internal.l.e("getConstructedClass(...)", interfaceC2099eC);
                    if (!Z4.g.e(interfaceC2099eC) && !Z4.e.p(c2283j.C())) {
                        List listM0 = c2283j2.m0();
                        kotlin.jvm.internal.l.e("getValueParameters(...)", listM0);
                        if (!listM0.isEmpty()) {
                            Iterator it = listM0.iterator();
                            while (it.hasNext()) {
                                AbstractC1586x type = ((C2272S) it.next()).getType();
                                kotlin.jvm.internal.l.e("getType(...)", type);
                                if (AbstractC0832b.B(type)) {
                                    if (s()) {
                                        return new C1802h(constructor, e3.c.o(obj, p()), 0);
                                    }
                                    kotlin.jvm.internal.l.f("constructor", constructor);
                                    Class declaringClass = constructor.getDeclaringClass();
                                    kotlin.jvm.internal.l.e("getDeclaringClass(...)", declaringClass);
                                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                                    kotlin.jvm.internal.l.e("getGenericParameterTypes(...)", genericParameterTypes);
                                    return new C1803i(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : P3.m.b0(genericParameterTypes, 0, genericParameterTypes.length - 1)), 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (s()) {
            return new C1802h(constructor, e3.c.o(obj, p()), 1);
        }
        kotlin.jvm.internal.l.f("constructor", constructor);
        Class declaringClass2 = constructor.getDeclaringClass();
        kotlin.jvm.internal.l.e("getDeclaringClass(...)", declaringClass2);
        Class declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        if (declaringClass4 != null && !Modifier.isStatic(declaringClass3.getModifiers())) {
            cls = declaringClass4;
        }
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        kotlin.jvm.internal.l.e("getGenericParameterTypes(...)", genericParameterTypes2);
        return new C1803i(constructor, declaringClass2, cls, genericParameterTypes2, 1);
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        e3.c.e(sb, this);
        sb.append("fun ");
        e3.c.f(sb, this);
        sb.append(z1.c.G(W4.e.e(getName())));
        P3.q.x0(AbstractC0915m.w(this), sb, ", ", "(", ")", C1672c.f13691v, 48);
        sb.append(": ");
        sb.append(e3.c.E(getReturnType()));
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p4.w u(java.lang.reflect.Method r6, boolean r7) {
        /*
            r5 = this;
            boolean r0 = r5.s()
            if (r0 == 0) goto L51
            p4.t r0 = new p4.t
            u4.s r1 = r5.p()
            x4.v r1 = r1.t()
            java.lang.Object r2 = r5.f13643t
            if (r1 == 0) goto L45
            n5.x r1 = r1.getType()
            int r3 = Z4.g.a
            n5.M r1 = r1.t0()
            u4.h r1 = r1.f()
            if (r1 == 0) goto L29
            boolean r1 = Z4.g.b(r1)
            goto L2a
        L29:
            r1 = 0
        L2a:
            r3 = 1
            if (r1 != r3) goto L45
            java.lang.Class[] r1 = r6.getParameterTypes()
            java.lang.String r4 = "getParameterTypes(...)"
            kotlin.jvm.internal.l.e(r4, r1)
            java.lang.Object r1 = P3.m.i0(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 == 0) goto L45
            boolean r1 = r1.isInterface()
            if (r1 != r3) goto L45
            goto L4d
        L45:
            u4.s r1 = r5.p()
            java.lang.Object r2 = e3.c.o(r2, r1)
        L4d:
            r0.<init>(r6, r7, r2)
            return r0
        L51:
            p4.v r7 = new p4.v
            r0 = 2
            r7.<init>(r6, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.C1656J.u(java.lang.reflect.Method, boolean):p4.w");
    }

    @Override // o4.AbstractC1694t
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2112s p() {
        InterfaceC1443v interfaceC1443v = f13640x[0];
        Object objInvoke = this.f13644u.invoke();
        kotlin.jvm.internal.l.e("getValue(...)", objInvoke);
        return (InterfaceC2112s) objInvoke;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override // e4.p
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // e4.q
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1656J(AbstractC1654H abstractC1654H, InterfaceC2112s interfaceC2112s) {
        kotlin.jvm.internal.l.f("container", abstractC1654H);
        kotlin.jvm.internal.l.f("descriptor", interfaceC2112s);
        String strB = ((AbstractC2287n) interfaceC2112s).getName().b();
        kotlin.jvm.internal.l.e("asString(...)", strB);
        this(abstractC1654H, strB, D0.c(interfaceC2112s).h(), interfaceC2112s, AbstractC1403c.NO_RECEIVER);
    }
}
