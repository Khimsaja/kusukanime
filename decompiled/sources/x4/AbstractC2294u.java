package x4;

import com.kusukanime.BuildConfig;
import io.ktor.http.ContentDisposition;
import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n5.AbstractC1586x;
import n5.V;
import n5.b0;
import u4.AbstractC2108n;
import u4.EnumC2117x;
import u4.InterfaceC2095a;
import u4.InterfaceC2099e;
import u4.InterfaceC2105k;
import u4.InterfaceC2112s;

/* renamed from: x4.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2294u extends AbstractC2288o implements InterfaceC2112s {

    /* renamed from: A, reason: collision with root package name */
    public boolean f17481A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f17482B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f17483C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f17484D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f17485E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f17486F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f17487G;

    /* renamed from: H, reason: collision with root package name */
    public Collection f17488H;
    public volatile A3.q I;
    public final InterfaceC2112s J;

    /* renamed from: K, reason: collision with root package name */
    public final int f17489K;

    /* renamed from: L, reason: collision with root package name */
    public InterfaceC2112s f17490L;

    /* renamed from: M, reason: collision with root package name */
    public Map f17491M;

    /* renamed from: o, reason: collision with root package name */
    public List f17492o;

    /* renamed from: p, reason: collision with root package name */
    public List f17493p;

    /* renamed from: q, reason: collision with root package name */
    public AbstractC1586x f17494q;

    /* renamed from: r, reason: collision with root package name */
    public List f17495r;

    /* renamed from: s, reason: collision with root package name */
    public C2295v f17496s;

    /* renamed from: t, reason: collision with root package name */
    public C2295v f17497t;

    /* renamed from: u, reason: collision with root package name */
    public EnumC2117x f17498u;

    /* renamed from: v, reason: collision with root package name */
    public H4.o f17499v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f17500w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f17501x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f17502y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f17503z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2294u(int i7, W4.e eVar, InterfaceC2105k interfaceC2105k, InterfaceC2112s interfaceC2112s, u4.M m7, v4.h hVar) {
        super(interfaceC2105k, hVar, eVar, m7);
        if (interfaceC2105k == null) {
            s0(0);
            throw null;
        }
        if (hVar == null) {
            s0(1);
            throw null;
        }
        if (eVar == null) {
            s0(2);
            throw null;
        }
        if (i7 == 0) {
            s0(3);
            throw null;
        }
        if (m7 == null) {
            s0(4);
            throw null;
        }
        this.f17499v = AbstractC2108n.f16326i;
        this.f17500w = false;
        this.f17501x = false;
        this.f17502y = false;
        this.f17503z = false;
        this.f17481A = false;
        this.f17482B = false;
        this.f17483C = false;
        this.f17484D = false;
        this.f17485E = false;
        this.f17486F = true;
        this.f17487G = false;
        this.f17488H = null;
        this.I = null;
        this.f17490L = null;
        this.f17491M = null;
        this.J = interfaceC2112s == null ? this : interfaceC2112s;
        this.f17489K = i7;
    }

    public static ArrayList R0(InterfaceC2112s interfaceC2112s, List list, V v5, boolean z7, boolean z8, boolean[] zArr) {
        if (list == null) {
            s0(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2272S c2272s = (C2272S) it.next();
            C2272S c2272s2 = c2272s;
            AbstractC1586x type = c2272s2.getType();
            b0 b0Var = b0.f13391n;
            AbstractC1586x abstractC1586xI = v5.i(type, b0Var);
            AbstractC1586x abstractC1586x = c2272s.f17412t;
            AbstractC1586x abstractC1586xI2 = abstractC1586x == null ? null : v5.i(abstractC1586x, b0Var);
            if (abstractC1586xI == null) {
                return null;
            }
            if ((abstractC1586xI != c2272s2.getType() || abstractC1586x != abstractC1586xI2) && zArr != null) {
                zArr[0] = true;
            }
            C2280g c2280g = c2272s instanceof C2271Q ? new C2280g(2, (List) ((C2271Q) c2272s).f17407v.getValue()) : null;
            C2272S c2272s3 = z7 ? null : c2272s;
            v4.h annotations = c2272s.getAnnotations();
            W4.e name = c2272s.getName();
            boolean zO0 = c2272s.O0();
            u4.M mL = z8 ? c2272s.l() : u4.M.f16295i;
            kotlin.jvm.internal.l.f("annotations", annotations);
            kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, name);
            kotlin.jvm.internal.l.f("source", mL);
            int i7 = c2272s.f17408p;
            boolean z9 = c2272s.f17410r;
            boolean z10 = c2272s.f17411s;
            arrayList.add(c2280g == null ? new C2272S(interfaceC2112s, c2272s3, i7, annotations, name, abstractC1586xI, zO0, z9, z10, abstractC1586xI2, mL) : new C2271Q(interfaceC2112s, c2272s3, i7, annotations, name, abstractC1586xI, zO0, z9, z10, abstractC1586xI2, mL, c2280g));
        }
        return arrayList;
    }

    public static /* synthetic */ void s0(int i7) {
        String str;
        int i8;
        switch (i7) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i8 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i8 = 3;
                break;
        }
        Object[] objArr = new Object[i8];
        switch (i7) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = ContentDisposition.Parameters.Name;
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case BuildConfig.VERSION_CODE /* 30 */:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i7) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i7) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case BuildConfig.VERSION_CODE /* 30 */:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // u4.InterfaceC2096b
    public final C2295v D() {
        return this.f17496s;
    }

    public boolean K() {
        return this.f17487G;
    }

    @Override // u4.InterfaceC2096b
    public final List M() {
        List list = this.f17495r;
        if (list != null) {
            return list;
        }
        s0(13);
        throw null;
    }

    public final InterfaceC2112s N0(InterfaceC2099e interfaceC2099e, EnumC2117x enumC2117x, H4.o oVar) {
        InterfaceC2112s interfaceC2112sBuild = f0().d(interfaceC2099e).j(enumC2117x).h(oVar).i(2).a().build();
        if (interfaceC2112sBuild != null) {
            return interfaceC2112sBuild;
        }
        s0(26);
        throw null;
    }

    @Override // u4.InterfaceC2097c
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public C2266L z(InterfaceC2099e interfaceC2099e, EnumC2117x enumC2117x, H4.o oVar) {
        return (C2266L) N0(interfaceC2099e, enumC2117x, oVar);
    }

    public abstract AbstractC2294u P0(int i7, W4.e eVar, InterfaceC2105k interfaceC2105k, InterfaceC2112s interfaceC2112s, u4.M m7, v4.h hVar);

    @Override // u4.InterfaceC2116w
    public final boolean Q() {
        return this.f17482B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fb  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x4.AbstractC2294u Q0(x4.C2293t r21) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.AbstractC2294u.Q0(x4.t):x4.u");
    }

    public void S0(C2295v c2295v, C2295v c2295v2, List list, List list2, List list3, AbstractC1586x abstractC1586x, EnumC2117x enumC2117x, H4.o oVar) {
        if (list == null) {
            s0(5);
            throw null;
        }
        if (list2 == null) {
            s0(6);
            throw null;
        }
        if (list3 == null) {
            s0(7);
            throw null;
        }
        if (oVar == null) {
            s0(8);
            throw null;
        }
        this.f17492o = P3.q.S0(list2);
        this.f17493p = P3.q.S0(list3);
        this.f17494q = abstractC1586x;
        this.f17498u = enumC2117x;
        this.f17499v = oVar;
        this.f17496s = c2295v;
        this.f17497t = c2295v2;
        this.f17495r = list;
        for (int i7 = 0; i7 < list2.size(); i7++) {
            u4.Q q6 = (u4.Q) list2.get(i7);
            if (q6.getIndex() != i7) {
                throw new IllegalStateException(q6 + " index is " + q6.getIndex() + " but position is " + i7);
            }
        }
        for (int i8 = 0; i8 < list3.size(); i8++) {
            C2272S c2272s = (C2272S) list3.get(i8);
            if (c2272s.f17408p != i8) {
                throw new IllegalStateException(c2272s + "index is " + c2272s.f17408p + " but position is " + i8);
            }
        }
    }

    public final C2293t T0(V v5) {
        if (v5 != null) {
            return new C2293t(this, v5.f(), k(), e(), getVisibility(), c(), m0(), M(), this.f17496s, getReturnType());
        }
        s0(24);
        throw null;
    }

    public final void U0(InterfaceC2095a interfaceC2095a, Object obj) {
        if (this.f17491M == null) {
            this.f17491M = new LinkedHashMap();
        }
        this.f17491M.put(interfaceC2095a, obj);
    }

    @Override // u4.InterfaceC2112s
    public final boolean V() {
        return this.f17483C;
    }

    public void V0(boolean z7) {
        this.f17486F = z7;
    }

    public void W(Collection collection) {
        if (collection == null) {
            s0(17);
            throw null;
        }
        this.f17488H = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((InterfaceC2112s) it.next()).e0()) {
                this.f17484D = true;
                return;
            }
        }
    }

    public void W0(boolean z7) {
        this.f17487G = z7;
    }

    public boolean X() {
        return this.f17481A;
    }

    public final void X0(n5.B b4) {
        if (b4 != null) {
            this.f17494q = b4;
        } else {
            s0(11);
            throw null;
        }
    }

    @Override // x4.AbstractC2288o, x4.AbstractC2287n, u4.InterfaceC2105k
    public InterfaceC2112s a() {
        InterfaceC2112s interfaceC2112s = this.J;
        InterfaceC2112s interfaceC2112sA = interfaceC2112s == this ? this : interfaceC2112s.a();
        if (interfaceC2112sA != null) {
            return interfaceC2112sA;
        }
        s0(20);
        throw null;
    }

    public Object a0(InterfaceC2095a interfaceC2095a) {
        Map map = this.f17491M;
        if (map == null) {
            return null;
        }
        return map.get(interfaceC2095a);
    }

    @Override // u4.InterfaceC2097c
    public final int c() {
        int i7 = this.f17489K;
        if (i7 != 0) {
            return i7;
        }
        s0(21);
        throw null;
    }

    @Override // u4.InterfaceC2116w
    public final EnumC2117x e() {
        EnumC2117x enumC2117x = this.f17498u;
        if (enumC2117x != null) {
            return enumC2117x;
        }
        s0(15);
        throw null;
    }

    @Override // u4.InterfaceC2112s
    public final boolean e0() {
        return this.f17484D;
    }

    public u4.r f0() {
        return T0(V.f13380b);
    }

    public AbstractC1586x getReturnType() {
        return this.f17494q;
    }

    @Override // u4.InterfaceC2096b
    public final List getTypeParameters() {
        List list = this.f17492o;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // u4.InterfaceC2107m
    public final H4.o getVisibility() {
        H4.o oVar = this.f17499v;
        if (oVar != null) {
            return oVar;
        }
        s0(16);
        throw null;
    }

    @Override // u4.InterfaceC2116w
    public final boolean i0() {
        return false;
    }

    public boolean isExternal() {
        return this.f17502y;
    }

    @Override // u4.InterfaceC2112s
    public final boolean isInfix() {
        if (this.f17501x) {
            return true;
        }
        Iterator it = a().m().iterator();
        while (it.hasNext()) {
            if (((InterfaceC2112s) it.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.f17503z;
    }

    @Override // u4.InterfaceC2112s
    public final boolean isOperator() {
        if (this.f17500w) {
            return true;
        }
        Iterator it = a().m().iterator();
        while (it.hasNext()) {
            if (((InterfaceC2112s) it.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.f17485E;
    }

    public Collection m() {
        A3.q qVar = this.I;
        if (qVar != null) {
            this.f17488H = (Collection) qVar.invoke();
            this.I = null;
        }
        Collection collection = this.f17488H;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        s0(14);
        throw null;
    }

    @Override // u4.InterfaceC2096b
    public final List m0() {
        List list = this.f17493p;
        if (list != null) {
            return list;
        }
        s0(19);
        throw null;
    }

    @Override // u4.InterfaceC2112s
    public final InterfaceC2112s s() {
        return this.f17490L;
    }

    @Override // u4.InterfaceC2096b
    public final C2295v t() {
        return this.f17497t;
    }

    public Object u(X4.y yVar, Object obj) {
        return yVar.J(this, obj);
    }

    @Override // u4.O
    public InterfaceC2112s b(V v5) {
        if (v5 == null) {
            s0(22);
            throw null;
        }
        if (v5.a.e()) {
            return this;
        }
        C2293t c2293tT0 = T0(v5);
        c2293tT0.f17461e = a();
        c2293tT0.f17471o = true;
        c2293tT0.f17479w = true;
        return c2293tT0.f17480x.Q0(c2293tT0);
    }
}
