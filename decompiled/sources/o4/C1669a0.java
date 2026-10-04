package o4;

import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import f6.AbstractC0915m;
import java.io.IOException;
import java.util.List;
import l4.EnumC1435n;
import l4.InterfaceC1428g;
import l4.InterfaceC1434m;
import l4.InterfaceC1436o;
import l4.InterfaceC1443v;
import n5.AbstractC1586x;
import u4.InterfaceC2093I;
import x4.C2272S;

/* renamed from: o4.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1669a0 implements InterfaceC1436o {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f13673p;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC1694t f13674k;

    /* renamed from: l, reason: collision with root package name */
    public final int f13675l;

    /* renamed from: m, reason: collision with root package name */
    public final EnumC1435n f13676m;

    /* renamed from: n, reason: collision with root package name */
    public final z0 f13677n;

    /* renamed from: o, reason: collision with root package name */
    public final z0 f13678o;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r(C1669a0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0);
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
        f13673p = new InterfaceC1443v[]{zVar.h(rVar), AbstractC0703b.r(C1669a0.class, "annotations", "getAnnotations()Ljava/util/List;", 0, zVar)};
    }

    public C1669a0(AbstractC1694t abstractC1694t, int i7, EnumC1435n enumC1435n, InterfaceC0821a interfaceC0821a) {
        kotlin.jvm.internal.l.f("callable", abstractC1694t);
        this.f13674k = abstractC1694t;
        this.f13675l = i7;
        this.f13676m = enumC1435n;
        this.f13677n = AbstractC0915m.D(null, interfaceC0821a);
        this.f13678o = AbstractC0915m.D(null, new Y(this, 0));
    }

    public final InterfaceC2093I d() {
        InterfaceC1443v interfaceC1443v = f13673p[0];
        Object objInvoke = this.f13677n.invoke();
        kotlin.jvm.internal.l.e("getValue(...)", objInvoke);
        return (InterfaceC2093I) objInvoke;
    }

    public final v0 e() {
        AbstractC1586x type = d().getType();
        kotlin.jvm.internal.l.e("getType(...)", type);
        return new v0(type, new Y(this, 1));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1669a0)) {
            return false;
        }
        C1669a0 c1669a0 = (C1669a0) obj;
        if (kotlin.jvm.internal.l.a(this.f13674k, c1669a0.f13674k)) {
            return this.f13675l == c1669a0.f13675l;
        }
        return false;
    }

    public final boolean f() {
        InterfaceC2093I interfaceC2093ID = d();
        C2272S c2272s = interfaceC2093ID instanceof C2272S ? (C2272S) interfaceC2093ID : null;
        if (c2272s != null) {
            return d5.e.a(c2272s);
        }
        return false;
    }

    public final boolean g() {
        InterfaceC2093I interfaceC2093ID = d();
        return (interfaceC2093ID instanceof C2272S) && ((C2272S) interfaceC2093ID).f17412t != null;
    }

    @Override // l4.InterfaceC1423b
    public final List getAnnotations() {
        InterfaceC1443v interfaceC1443v = f13673p[1];
        Object objInvoke = this.f13678o.invoke();
        kotlin.jvm.internal.l.e("getValue(...)", objInvoke);
        return (List) objInvoke;
    }

    public final String getName() {
        InterfaceC2093I interfaceC2093ID = d();
        C2272S c2272s = interfaceC2093ID instanceof C2272S ? (C2272S) interfaceC2093ID : null;
        if (c2272s != null && !c2272s.k().K()) {
            W4.e name = c2272s.getName();
            kotlin.jvm.internal.l.e("getName(...)", name);
            if (!name.f9625l) {
                return name.b();
            }
        }
        return null;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13675l) + (this.f13674k.hashCode() * 31);
    }

    public final String toString() throws IOException {
        String string;
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.f13676m.ordinal();
        if (iOrdinal == 0) {
            sb.append("instance parameter");
        } else if (iOrdinal == 1) {
            sb.append("context parameter " + getName());
        } else if (iOrdinal == 2) {
            sb.append("extension receiver parameter");
        } else {
            if (iOrdinal != 3) {
                throw new D6.r();
            }
            sb.append("parameter #" + this.f13675l + ' ' + getName());
        }
        sb.append(" of ");
        Object obj = this.f13674k;
        if (obj instanceof InterfaceC1443v) {
            InterfaceC1443v interfaceC1443v = (InterfaceC1443v) obj;
            kotlin.jvm.internal.l.f("property", interfaceC1443v);
            StringBuilder sb2 = new StringBuilder();
            e3.c.e(sb2, interfaceC1443v);
            sb2.append(interfaceC1443v instanceof InterfaceC1434m ? "var " : "val ");
            e3.c.f(sb2, interfaceC1443v);
            sb2.append(z1.c.G(W4.e.e(interfaceC1443v.getName())));
            sb2.append(": ");
            sb2.append(e3.c.E(interfaceC1443v.getReturnType()));
            string = sb2.toString();
        } else {
            if (!(obj instanceof InterfaceC1428g)) {
                throw new IllegalStateException(("Illegal callable: " + obj).toString());
            }
            InterfaceC1428g interfaceC1428g = (InterfaceC1428g) obj;
            kotlin.jvm.internal.l.f("function", interfaceC1428g);
            StringBuilder sb3 = new StringBuilder();
            e3.c.e(sb3, interfaceC1428g);
            sb3.append("fun ");
            e3.c.f(sb3, interfaceC1428g);
            sb3.append(z1.c.G(W4.e.e(interfaceC1428g.getName())));
            P3.q.x0(AbstractC0915m.w(interfaceC1428g), sb3, ", ", "(", ")", C1672c.f13691v, 48);
            sb3.append(": ");
            sb3.append(e3.c.E(interfaceC1428g.getReturnType()));
            string = sb3.toString();
        }
        sb.append(string);
        return sb.toString();
    }
}
