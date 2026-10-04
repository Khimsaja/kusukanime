package x4;

import e4.InterfaceC0821a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import m5.C1519h;
import n5.AbstractC1586x;
import n5.V;
import u4.EnumC2117x;
import u4.InterfaceC2094J;
import u4.InterfaceC2095a;
import u4.InterfaceC2099e;
import u4.InterfaceC2105k;
import u4.InterfaceC2112s;
import v4.C2158f;
import v4.C2159g;

/* renamed from: x4.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2263I extends AbstractC2273T implements u4.K {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f17376A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f17377B;

    /* renamed from: C, reason: collision with root package name */
    public List f17378C;

    /* renamed from: D, reason: collision with root package name */
    public C2295v f17379D;

    /* renamed from: E, reason: collision with root package name */
    public C2295v f17380E;

    /* renamed from: F, reason: collision with root package name */
    public ArrayList f17381F;

    /* renamed from: G, reason: collision with root package name */
    public C2264J f17382G;

    /* renamed from: H, reason: collision with root package name */
    public C2265K f17383H;
    public C2292s I;
    public C2292s J;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f17384p;

    /* renamed from: q, reason: collision with root package name */
    public C1519h f17385q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0821a f17386r;

    /* renamed from: s, reason: collision with root package name */
    public final EnumC2117x f17387s;

    /* renamed from: t, reason: collision with root package name */
    public H4.o f17388t;

    /* renamed from: u, reason: collision with root package name */
    public Collection f17389u;

    /* renamed from: v, reason: collision with root package name */
    public final u4.K f17390v;

    /* renamed from: w, reason: collision with root package name */
    public final int f17391w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f17392x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f17393y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f17394z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2263I(InterfaceC2105k interfaceC2105k, u4.K k7, v4.h hVar, EnumC2117x enumC2117x, H4.o oVar, boolean z7, W4.e eVar, int i7, u4.M m7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        super(interfaceC2105k, hVar, eVar, null, m7);
        if (interfaceC2105k == null) {
            s0(0);
            throw null;
        }
        if (hVar == null) {
            s0(1);
            throw null;
        }
        if (enumC2117x == null) {
            s0(2);
            throw null;
        }
        if (oVar == null) {
            s0(3);
            throw null;
        }
        if (eVar == null) {
            s0(4);
            throw null;
        }
        if (i7 == 0) {
            s0(5);
            throw null;
        }
        if (m7 == null) {
            s0(6);
            throw null;
        }
        this.f17384p = z7;
        this.f17389u = null;
        this.f17378C = Collections.EMPTY_LIST;
        this.f17387s = enumC2117x;
        this.f17388t = oVar;
        this.f17390v = k7 == null ? this : k7;
        this.f17391w = i7;
        this.f17392x = z8;
        this.f17393y = z9;
        this.f17394z = z10;
        this.f17376A = z11;
        this.f17377B = z12;
    }

    public static C2263I O0(InterfaceC2099e interfaceC2099e, EnumC2117x enumC2117x, H4.o oVar, boolean z7, W4.e eVar, int i7, u4.M m7) {
        C2158f c2158f = C2159g.a;
        if (interfaceC2099e == null) {
            s0(7);
            throw null;
        }
        if (oVar == null) {
            s0(10);
            throw null;
        }
        if (eVar == null) {
            s0(11);
            throw null;
        }
        if (i7 == 0) {
            s0(12);
            throw null;
        }
        if (m7 != null) {
            return new C2263I(interfaceC2099e, null, c2158f, enumC2117x, oVar, z7, eVar, i7, m7, false, false, false, false, false);
        }
        s0(13);
        throw null;
    }

    public static InterfaceC2112s Q0(V v5, InterfaceC2094J interfaceC2094J) {
        if (interfaceC2094J == null) {
            s0(31);
            throw null;
        }
        InterfaceC2112s interfaceC2112s = ((AbstractC2261G) interfaceC2094J).f17365v;
        if (interfaceC2112s != null) {
            return interfaceC2112s.b(v5);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void s0(int r11) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C2263I.s0(int):void");
    }

    @Override // u4.U
    public final boolean A() {
        return this.f17384p;
    }

    @Override // x4.AbstractC2273T, u4.InterfaceC2096b
    public final C2295v D() {
        return this.f17380E;
    }

    @Override // u4.K
    public final C2292s G() {
        return this.J;
    }

    @Override // u4.K
    public final C2292s L() {
        return this.I;
    }

    @Override // u4.InterfaceC2096b
    public final List M() {
        List list = this.f17378C;
        if (list != null) {
            return list;
        }
        s0(22);
        throw null;
    }

    @Override // u4.InterfaceC2097c
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public final C2263I z(InterfaceC2099e interfaceC2099e, EnumC2117x enumC2117x, H4.o oVar) {
        C2262H c2262h = new C2262H(this);
        if (interfaceC2099e == null) {
            C2262H.a(0);
            throw null;
        }
        c2262h.a = interfaceC2099e;
        c2262h.f17368d = null;
        c2262h.f17366b = enumC2117x;
        if (oVar == null) {
            C2262H.a(8);
            throw null;
        }
        c2262h.f17367c = oVar;
        c2262h.f17369e = 2;
        c2262h.f17371g = false;
        C2263I c2263iB = c2262h.b();
        if (c2263iB != null) {
            return c2263iB;
        }
        s0(42);
        throw null;
    }

    @Override // u4.U
    public final boolean O() {
        return this.f17392x;
    }

    public C2263I P0(InterfaceC2105k interfaceC2105k, EnumC2117x enumC2117x, H4.o oVar, u4.K k7, int i7, W4.e eVar) {
        u4.N n7 = u4.M.f16295i;
        if (interfaceC2105k == null) {
            s0(32);
            throw null;
        }
        if (enumC2117x == null) {
            s0(33);
            throw null;
        }
        if (oVar == null) {
            s0(34);
            throw null;
        }
        if (i7 == 0) {
            s0(35);
            throw null;
        }
        if (eVar == null) {
            s0(36);
            throw null;
        }
        v4.h annotations = getAnnotations();
        boolean zIsConst = isConst();
        boolean zIsExternal = isExternal();
        return new C2263I(interfaceC2105k, k7, annotations, enumC2117x, oVar, this.f17384p, eVar, i7, n7, this.f17392x, zIsConst, this.f17394z, zIsExternal, this.f17377B);
    }

    @Override // u4.InterfaceC2116w
    public final boolean Q() {
        return this.f17394z;
    }

    public final void R0(C2264J c2264j, C2265K c2265k, C2292s c2292s, C2292s c2292s2) {
        this.f17382G = c2264j;
        this.f17383H = c2265k;
        this.I = c2292s;
        this.J = c2292s2;
    }

    public final void S0(C1519h c1519h, InterfaceC0821a interfaceC0821a) {
        if (interfaceC0821a == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
        }
        this.f17386r = interfaceC0821a;
        if (c1519h == null) {
            c1519h = (C1519h) interfaceC0821a.invoke();
        }
        this.f17385q = c1519h;
    }

    @Override // u4.K
    public final boolean U() {
        return this.f17377B;
    }

    public final void U0(AbstractC1586x abstractC1586x, List list, C2295v c2295v, C2295v c2295v2, List list2) {
        if (abstractC1586x == null) {
            s0(17);
            throw null;
        }
        if (list == null) {
            s0(18);
            throw null;
        }
        if (list2 == null) {
            s0(19);
            throw null;
        }
        this.f17414o = abstractC1586x;
        this.f17381F = new ArrayList(list);
        this.f17380E = c2295v2;
        this.f17379D = c2295v;
        this.f17378C = list2;
    }

    @Override // u4.InterfaceC2097c
    public final void W(Collection collection) {
        if (collection != null) {
            this.f17389u = collection;
        } else {
            s0(40);
            throw null;
        }
    }

    public Object a0(InterfaceC2095a interfaceC2095a) {
        return null;
    }

    @Override // u4.InterfaceC2097c
    public final int c() {
        int i7 = this.f17391w;
        if (i7 != 0) {
            return i7;
        }
        s0(39);
        throw null;
    }

    @Override // u4.InterfaceC2116w
    public final EnumC2117x e() {
        EnumC2117x enumC2117x = this.f17387s;
        if (enumC2117x != null) {
            return enumC2117x;
        }
        s0(24);
        throw null;
    }

    @Override // u4.K
    public final C2264J getGetter() {
        return this.f17382G;
    }

    @Override // x4.AbstractC2273T, u4.InterfaceC2096b
    public final AbstractC1586x getReturnType() {
        AbstractC1586x type = getType();
        if (type != null) {
            return type;
        }
        s0(23);
        throw null;
    }

    @Override // u4.K
    public final C2265K getSetter() {
        return this.f17383H;
    }

    @Override // x4.AbstractC2273T, u4.InterfaceC2096b
    public final List getTypeParameters() {
        ArrayList arrayList = this.f17381F;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // u4.InterfaceC2107m
    public final H4.o getVisibility() {
        H4.o oVar = this.f17388t;
        if (oVar != null) {
            return oVar;
        }
        s0(25);
        throw null;
    }

    @Override // u4.U
    public final b5.g h0() {
        C1519h c1519h = this.f17385q;
        if (c1519h != null) {
            return (b5.g) c1519h.invoke();
        }
        return null;
    }

    @Override // u4.InterfaceC2116w
    public final boolean i0() {
        return false;
    }

    public boolean isConst() {
        return this.f17393y;
    }

    public boolean isExternal() {
        return this.f17376A;
    }

    @Override // u4.InterfaceC2096b
    public final Collection m() {
        Collection collection = this.f17389u;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        s0(41);
        throw null;
    }

    @Override // u4.K
    public final ArrayList o() {
        ArrayList arrayList = new ArrayList(2);
        C2264J c2264j = this.f17382G;
        if (c2264j != null) {
            arrayList.add(c2264j);
        }
        C2265K c2265k = this.f17383H;
        if (c2265k != null) {
            arrayList.add(c2265k);
        }
        return arrayList;
    }

    @Override // x4.AbstractC2273T, u4.InterfaceC2096b
    public final C2295v t() {
        return this.f17379D;
    }

    @Override // u4.InterfaceC2105k
    public final Object u(X4.y yVar, Object obj) {
        return yVar.M(this, obj);
    }

    @Override // u4.O
    public final u4.K b(V v5) {
        if (v5 == null) {
            s0(27);
            throw null;
        }
        if (v5.a.e()) {
            return this;
        }
        C2262H c2262h = new C2262H(this);
        n5.T tF = v5.f();
        if (tF == null) {
            C2262H.a(15);
            throw null;
        }
        c2262h.f17370f = tF;
        c2262h.f17368d = a();
        return c2262h.b();
    }

    @Override // x4.AbstractC2288o, x4.AbstractC2287n, u4.InterfaceC2105k
    public final u4.K a() {
        u4.K k7 = this.f17390v;
        u4.K kA = k7 == this ? this : k7.a();
        if (kA != null) {
            return kA;
        }
        s0(38);
        throw null;
    }

    public void T0(AbstractC1586x abstractC1586x) {
    }
}
