package o4;

import f1.AbstractC0870c;
import f1.AbstractC0871d;
import f6.AbstractC0915m;
import io.ktor.http.ContentDisposition;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC1403c;
import l4.InterfaceC1434m;
import l4.InterfaceC1443v;
import p4.InterfaceC1801g;
import x4.C2263I;

/* loaded from: classes.dex */
public abstract class q0 extends AbstractC1694t implements InterfaceC1443v {

    /* renamed from: x, reason: collision with root package name */
    public static final Object f13736x = new Object();

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC1654H f13737r;

    /* renamed from: s, reason: collision with root package name */
    public final String f13738s;

    /* renamed from: t, reason: collision with root package name */
    public final String f13739t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f13740u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f13741v;

    /* renamed from: w, reason: collision with root package name */
    public final z0 f13742w;

    public q0(AbstractC1654H abstractC1654H, String str, String str2, C2263I c2263i, Object obj) {
        this.f13737r = abstractC1654H;
        this.f13738s = str;
        this.f13739t = str2;
        this.f13740u = obj;
        this.f13741v = z1.c.B(O3.j.f7525k, new k0(this, 0));
        this.f13742w = AbstractC0915m.D(c2263i, new k0(this, 1));
    }

    public final boolean equals(Object obj) {
        q0 q0VarC = F0.c(obj);
        return q0VarC != null && kotlin.jvm.internal.l.a(this.f13737r, q0VarC.f13737r) && kotlin.jvm.internal.l.a(this.f13738s, q0VarC.f13738s) && kotlin.jvm.internal.l.a(this.f13739t, q0VarC.f13739t) && kotlin.jvm.internal.l.a(this.f13740u, q0VarC.f13740u);
    }

    @Override // o4.AbstractC1694t
    public final InterfaceC1801g f() {
        return w().f();
    }

    @Override // o4.AbstractC1694t
    public final AbstractC1654H g() {
        return this.f13737r;
    }

    @Override // l4.InterfaceC1424c
    public final String getName() {
        return this.f13738s;
    }

    @Override // o4.AbstractC1694t
    public final InterfaceC1801g h() {
        w().getClass();
        return null;
    }

    public final int hashCode() {
        return this.f13739t.hashCode() + A6.b.b(this.f13738s, this.f13737r.hashCode() * 31, 31);
    }

    @Override // l4.InterfaceC1443v
    public final boolean isConst() {
        return p().isConst();
    }

    @Override // l4.InterfaceC1443v
    public final boolean isLateinit() {
        return p().O();
    }

    @Override // l4.InterfaceC1424c
    public final boolean isSuspend() {
        return false;
    }

    @Override // o4.AbstractC1694t
    public final boolean s() {
        return this.f13740u != AbstractC1403c.NO_RECEIVER;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O3.i, java.lang.Object] */
    public final Member t() {
        if (!p().U()) {
            return null;
        }
        W4.b bVar = D0.a;
        AbstractC0870c abstractC0870cB = D0.b(p());
        if (abstractC0870cB instanceof C1689o) {
            C1689o c1689o = (C1689o) abstractC0870cB;
            U4.d dVar = c1689o.f13724c;
            if ((dVar.f9253l & 16) == 16) {
                U4.c cVar = dVar.f9258q;
                int i7 = cVar.f9245l;
                if ((i7 & 1) != 1 || (i7 & 2) != 2) {
                    return null;
                }
                int i8 = cVar.f9246m;
                T4.g gVar = c1689o.f13725d;
                return this.f13737r.g(gVar.a(i8), gVar.a(cVar.f9247n));
            }
        }
        return (Field) this.f13741v.getValue();
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        e3.c.e(sb, this);
        sb.append(this instanceof InterfaceC1434m ? "var " : "val ");
        e3.c.f(sb, this);
        sb.append(z1.c.G(W4.e.e(this.f13738s)));
        sb.append(": ");
        sb.append(e3.c.E(getReturnType()));
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object u(Member member, Object obj) throws J1.n, SecurityException {
        try {
            Object obj2 = f13736x;
            if (obj == obj2 && p().D() == null) {
                throw new RuntimeException("'" + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objO = s() ? e3.c.o(this.f13740u, p()) : obj;
            if (objO == obj2) {
                objO = null;
            }
            if (!s()) {
                obj = null;
            }
            if (obj == obj2) {
                obj = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(AbstractC0871d.f0(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objO);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, new Object[0]);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (objO == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    kotlin.jvm.internal.l.e("get(...)", cls);
                    objO = F0.e(cls);
                }
                return method.invoke(null, objO);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) member;
            if (obj == null) {
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                kotlin.jvm.internal.l.e("get(...)", cls2);
                obj = F0.e(cls2);
            }
            return method2.invoke(null, objO, obj);
        } catch (IllegalAccessException e7) {
            throw new J1.n("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e7);
        }
    }

    @Override // o4.AbstractC1694t
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final u4.K p() {
        Object objInvoke = this.f13742w.invoke();
        kotlin.jvm.internal.l.e("invoke(...)", objInvoke);
        return (u4.K) objInvoke;
    }

    public abstract n0 w();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q0(AbstractC1654H abstractC1654H, String str, String str2, Object obj) {
        this(abstractC1654H, str, str2, null, obj);
        kotlin.jvm.internal.l.f("container", abstractC1654H);
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        kotlin.jvm.internal.l.f("signature", str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q0(AbstractC1654H abstractC1654H, C2263I c2263i) {
        kotlin.jvm.internal.l.f("container", abstractC1654H);
        kotlin.jvm.internal.l.f("descriptor", c2263i);
        String strB = c2263i.getName().b();
        kotlin.jvm.internal.l.e("asString(...)", strB);
        this(abstractC1654H, strB, D0.b(c2263i).G(), c2263i, AbstractC1403c.NO_RECEIVER);
    }
}
