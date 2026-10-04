package o4;

import f6.AbstractC0905c;
import f6.AbstractC0915m;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import l4.EnumC1414B;
import l4.EnumC1435n;
import l4.InterfaceC1424c;
import l4.InterfaceC1436o;
import l4.InterfaceC1444w;
import n5.AbstractC1566c;
import p4.InterfaceC1801g;
import u4.AbstractC2108n;
import u4.EnumC2117x;
import u4.InterfaceC2097c;

/* renamed from: o4.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1694t implements InterfaceC1424c, x0 {

    /* renamed from: k, reason: collision with root package name */
    public final z0 f13750k = AbstractC0915m.D(null, new C1691q(this, 0));

    /* renamed from: l, reason: collision with root package name */
    public final z0 f13751l = AbstractC0915m.D(null, new C1691q(this, 2));

    /* renamed from: m, reason: collision with root package name */
    public final z0 f13752m = AbstractC0915m.D(null, new C1691q(this, 3));

    /* renamed from: n, reason: collision with root package name */
    public final z0 f13753n = AbstractC0915m.D(null, new C1691q(this, 4));

    /* renamed from: o, reason: collision with root package name */
    public final z0 f13754o = AbstractC0915m.D(null, new C1691q(this, 5));

    /* renamed from: p, reason: collision with root package name */
    public final z0 f13755p = AbstractC0915m.D(null, new C1691q(this, 6));

    /* renamed from: q, reason: collision with root package name */
    public final Object f13756q = z1.c.B(O3.j.f7525k, new C1691q(this, 7));

    public static Object e(v0 v0Var) throws NegativeArraySizeException {
        Class clsF = n6.m.F(AbstractC0905c.p(v0Var));
        if (clsF.isArray()) {
            Object objNewInstance = Array.newInstance(clsF.getComponentType(), 0);
            kotlin.jvm.internal.l.e("run(...)", objNewInstance);
            return objNewInstance;
        }
        throw new H5.C("Cannot instantiate the default empty array of type " + clsF.getSimpleName() + ", because it is not an array type");
    }

    @Override // l4.InterfaceC1424c
    public final Object call(Object... objArr) throws J1.n {
        kotlin.jvm.internal.l.f("args", objArr);
        try {
            return f().call(objArr);
        } catch (IllegalAccessException e7) {
            throw new J1.n(e7);
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [O3.i, java.lang.Object] */
    @Override // l4.InterfaceC1424c
    public final Object callBy(Map map) throws J1.n, NegativeArraySizeException {
        boolean z7;
        Object objE;
        kotlin.jvm.internal.l.f("args", map);
        boolean z8 = false;
        if (r()) {
            List<InterfaceC1436o> parameters = getParameters();
            ArrayList arrayList = new ArrayList(P3.r.p(parameters, 10));
            for (InterfaceC1436o interfaceC1436o : parameters) {
                if (map.containsKey(interfaceC1436o)) {
                    objE = map.get(interfaceC1436o);
                    if (objE == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + interfaceC1436o + ')');
                    }
                } else {
                    C1669a0 c1669a0 = (C1669a0) interfaceC1436o;
                    if (c1669a0.f()) {
                        objE = null;
                    } else {
                        if (!c1669a0.g()) {
                            throw new IllegalArgumentException("No argument provided for a required parameter: " + c1669a0);
                        }
                        objE = e(c1669a0.e());
                    }
                }
                arrayList.add(objE);
            }
            InterfaceC1801g interfaceC1801gH = h();
            if (interfaceC1801gH != null) {
                try {
                    return interfaceC1801gH.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e7) {
                    throw new J1.n(e7);
                }
            }
            throw new H5.C("This callable does not support a default call: " + p());
        }
        List<InterfaceC1436o> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return f().call(isSuspend() ? new S3.c[]{null} : new S3.c[0]);
            } catch (IllegalAccessException e8) {
                throw new J1.n(e8);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) ((Object[]) this.f13755p.invoke()).clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        boolean zBooleanValue = ((Boolean) this.f13756q.getValue()).booleanValue();
        int i7 = 0;
        for (InterfaceC1436o interfaceC1436o2 : parameters2) {
            int iQ = zBooleanValue ? q(interfaceC1436o2) : 1;
            if (map.containsKey(interfaceC1436o2)) {
                objArr[((C1669a0) interfaceC1436o2).f13675l] = map.get(interfaceC1436o2);
            } else {
                C1669a0 c1669a02 = (C1669a0) interfaceC1436o2;
                if (c1669a02.f()) {
                    if (zBooleanValue) {
                        int i8 = i7 + iQ;
                        for (int i9 = i7; i9 < i8; i9++) {
                            int i10 = (i9 / 32) + size;
                            Object obj = objArr[i10];
                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Int", obj);
                            objArr[i10] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i9 % 32)));
                        }
                        z7 = true;
                    } else {
                        z7 = true;
                        int i11 = (i7 / 32) + size;
                        Object obj2 = objArr[i11];
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Int", obj2);
                        objArr[i11] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i7 % 32)));
                    }
                    z8 = z7;
                } else if (!c1669a02.g()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + c1669a02);
                }
            }
            if (((C1669a0) interfaceC1436o2).f13676m == EnumC1435n.f12756n) {
                i7 += iQ;
            }
        }
        if (!z8) {
            try {
                InterfaceC1801g interfaceC1801gF = f();
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
                kotlin.jvm.internal.l.e("copyOf(...)", objArrCopyOf);
                return interfaceC1801gF.call(objArrCopyOf);
            } catch (IllegalAccessException e9) {
                throw new J1.n(e9);
            }
        }
        InterfaceC1801g interfaceC1801gH2 = h();
        if (interfaceC1801gH2 != null) {
            try {
                return interfaceC1801gH2.call(objArr);
            } catch (IllegalAccessException e10) {
                throw new J1.n(e10);
            }
        }
        throw new H5.C("This callable does not support a default call: " + p());
    }

    public abstract InterfaceC1801g f();

    public abstract AbstractC1654H g();

    @Override // l4.InterfaceC1423b
    public final List getAnnotations() {
        Object objInvoke = this.f13750k.invoke();
        kotlin.jvm.internal.l.e("invoke(...)", objInvoke);
        return (List) objInvoke;
    }

    @Override // l4.InterfaceC1424c
    public final List getParameters() {
        Object objInvoke = this.f13752m.invoke();
        kotlin.jvm.internal.l.e("invoke(...)", objInvoke);
        return (List) objInvoke;
    }

    @Override // l4.InterfaceC1424c
    public final InterfaceC1444w getReturnType() {
        Object objInvoke = this.f13753n.invoke();
        kotlin.jvm.internal.l.e("invoke(...)", objInvoke);
        return (InterfaceC1444w) objInvoke;
    }

    @Override // l4.InterfaceC1424c
    public final List getTypeParameters() {
        Object objInvoke = this.f13754o.invoke();
        kotlin.jvm.internal.l.e("invoke(...)", objInvoke);
        return (List) objInvoke;
    }

    @Override // l4.InterfaceC1424c
    public final EnumC1414B getVisibility() {
        H4.o visibility = p().getVisibility();
        kotlin.jvm.internal.l.e("getVisibility(...)", visibility);
        W4.c cVar = F0.a;
        if (visibility.equals(AbstractC2108n.f16322e)) {
            return EnumC1414B.f12735k;
        }
        if (visibility.equals(AbstractC2108n.f16320c)) {
            return EnumC1414B.f12736l;
        }
        if (visibility.equals(AbstractC2108n.f16321d)) {
            return EnumC1414B.f12737m;
        }
        if (visibility.equals(AbstractC2108n.a) || visibility.equals(AbstractC2108n.f16319b)) {
            return EnumC1414B.f12738n;
        }
        return null;
    }

    public abstract InterfaceC1801g h();

    @Override // l4.InterfaceC1424c
    public final boolean isAbstract() {
        return p().e() == EnumC2117x.f16345o;
    }

    @Override // l4.InterfaceC1424c
    public final boolean isFinal() {
        return p().e() == EnumC2117x.f16342l;
    }

    @Override // l4.InterfaceC1424c
    public final boolean isOpen() {
        return p().e() == EnumC2117x.f16344n;
    }

    public abstract InterfaceC2097c p();

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    public final int q(InterfaceC1436o interfaceC1436o) {
        if (!((Boolean) this.f13756q.getValue()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        C1669a0 c1669a0 = (C1669a0) interfaceC1436o;
        if (!F0.g(c1669a0.e())) {
            return 1;
        }
        ArrayList arrayListZ = e3.c.z(AbstractC1566c.b(c1669a0.e().f13766k));
        kotlin.jvm.internal.l.c(arrayListZ);
        return arrayListZ.size();
    }

    public final boolean r() {
        return kotlin.jvm.internal.l.a(getName(), "<init>") && g().d().isAnnotation();
    }

    public abstract boolean s();
}
