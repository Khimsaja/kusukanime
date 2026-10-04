package G3;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import l4.InterfaceC1428g;
import l4.InterfaceC1433l;
import l4.InterfaceC1436o;
import l4.InterfaceC1442u;
import o4.C1669a0;
import v.c0;

/* loaded from: classes.dex */
public final class A extends j {
    public final /* synthetic */ int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final F.w f2768b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2769c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2770d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2771e;

    public A(Class cls) throws NoSuchFieldException {
        int i7 = 0;
        this.f2769c = cls;
        try {
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            this.f2771e = enumArr;
            this.f2770d = new String[enumArr.length];
            while (true) {
                Enum[] enumArr2 = (Enum[]) this.f2771e;
                if (i7 >= enumArr2.length) {
                    this.f2768b = F.w.E((String[]) this.f2770d);
                    return;
                }
                String strName = enumArr2[i7].name();
                String[] strArr = (String[]) this.f2770d;
                Field field = cls.getField(strName);
                Set set = H3.e.a;
                i iVar = (i) field.getAnnotation(i.class);
                if (iVar != null) {
                    String strName2 = iVar.name();
                    if (!"\u0000".equals(strName2)) {
                        strName = strName2;
                    }
                }
                strArr[i7] = strName;
                i7++;
            }
        } catch (NoSuchFieldException e7) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e7);
        }
    }

    @Override // G3.j
    public final Object a(m mVar) {
        int iA0;
        String string;
        String string2;
        Object obj = this.f2771e;
        F.w wVar = this.f2768b;
        Object obj2 = this.f2770d;
        boolean z7 = true;
        switch (this.a) {
            case 0:
                n nVar = (n) mVar;
                int iY = nVar.f2817q;
                if (iY == 0) {
                    iY = nVar.Y();
                }
                if (iY < 8 || iY > 11) {
                    iA0 = -1;
                } else if (iY == 11) {
                    iA0 = nVar.a0(wVar, nVar.f2820t);
                } else {
                    int iU = nVar.f2815o.U((w6.x) wVar.f2038m);
                    if (iU != -1) {
                        nVar.f2817q = 0;
                        int[] iArr = nVar.f2809n;
                        int i7 = nVar.f2806k - 1;
                        iArr[i7] = iArr[i7] + 1;
                        iA0 = iU;
                    } else {
                        String strH = nVar.H();
                        iA0 = nVar.a0(wVar, strH);
                        if (iA0 == -1) {
                            nVar.f2817q = 11;
                            nVar.f2820t = strH;
                            nVar.f2809n[nVar.f2806k - 1] = r7[r5] - 1;
                        }
                    }
                }
                if (iA0 != -1) {
                    return ((Enum[]) obj)[iA0];
                }
                String strJ = mVar.j();
                throw new D6.r("Expected one of " + Arrays.asList((String[]) obj2) + " but was " + mVar.H() + " at path " + strJ);
            default:
                kotlin.jvm.internal.l.f("reader", mVar);
                InterfaceC1428g interfaceC1428g = (InterfaceC1428g) this.f2769c;
                int size = interfaceC1428g.getParameters().size();
                ArrayList arrayList = (ArrayList) obj2;
                int size2 = arrayList.size();
                Object[] objArr = new Object[size2];
                int i8 = 0;
                while (true) {
                    Object obj3 = I3.c.a;
                    if (i8 >= size2) {
                        mVar.e();
                        while (mVar.m()) {
                            int iO = mVar.O(wVar);
                            if (iO == -1) {
                                mVar.P();
                                mVar.T();
                            } else {
                                I3.a aVar = (I3.a) ((ArrayList) obj).get(iO);
                                int i9 = aVar.f4043e;
                                boolean z8 = z7;
                                Object obj4 = objArr[i9];
                                InterfaceC1442u interfaceC1442u = aVar.f4041c;
                                if (obj4 != obj3) {
                                    throw new D6.r("Multiple values for '" + interfaceC1442u.getName() + "' at " + mVar.j());
                                }
                                Object objA = aVar.f4040b.a(mVar);
                                objArr[i9] = objA;
                                if (objA == null && !interfaceC1442u.getReturnType().b()) {
                                    String name = interfaceC1442u.getName();
                                    Set set = H3.e.a;
                                    String strJ2 = mVar.j();
                                    String str = aVar.a;
                                    if (str.equals(name)) {
                                        string2 = "Non-null value '" + name + "' was null at " + strJ2;
                                    } else {
                                        StringBuilder sbC = c0.c("Non-null value '", name, "' (JSON name '", str, "') was null at ");
                                        sbC.append(strJ2);
                                        string2 = sbC.toString();
                                    }
                                    throw new D6.r(string2);
                                }
                                z7 = z8;
                            }
                        }
                        boolean z9 = z7;
                        mVar.i();
                        boolean z10 = arrayList.size() == size ? z9 : false;
                        for (int i10 = 0; i10 < size; i10++) {
                            if (objArr[i10] == obj3) {
                                if (((C1669a0) ((InterfaceC1436o) interfaceC1428g.getParameters().get(i10))).f()) {
                                    z10 = false;
                                } else {
                                    if (!((C1669a0) ((InterfaceC1436o) interfaceC1428g.getParameters().get(i10))).e().f13766k.u0()) {
                                        String name2 = ((C1669a0) ((InterfaceC1436o) interfaceC1428g.getParameters().get(i10))).getName();
                                        I3.a aVar2 = (I3.a) arrayList.get(i10);
                                        String str2 = aVar2 != null ? aVar2.a : null;
                                        Set set2 = H3.e.a;
                                        String strJ3 = mVar.j();
                                        if (str2.equals(name2)) {
                                            string = "Required value '" + name2 + "' missing at " + strJ3;
                                        } else {
                                            StringBuilder sbC2 = c0.c("Required value '", name2, "' (JSON name '", str2, "') missing at ");
                                            sbC2.append(strJ3);
                                            string = sbC2.toString();
                                        }
                                        throw new D6.r(string);
                                    }
                                    objArr[i10] = null;
                                }
                            }
                        }
                        Object objCall = z10 ? interfaceC1428g.call(Arrays.copyOf(objArr, size2)) : interfaceC1428g.callBy(new I3.b(interfaceC1428g.getParameters(), objArr));
                        int size3 = arrayList.size();
                        while (size < size3) {
                            Object obj5 = arrayList.get(size);
                            kotlin.jvm.internal.l.c(obj5);
                            I3.a aVar3 = (I3.a) obj5;
                            Object obj6 = objArr[size];
                            if (obj6 != obj3) {
                                ((InterfaceC1433l) aVar3.f4041c).set(objCall, obj6);
                            }
                            size++;
                        }
                        return objCall;
                    }
                    objArr[i8] = obj3;
                    i8++;
                }
                break;
        }
    }

    @Override // G3.j
    public final void c(p pVar, Object obj) {
        switch (this.a) {
            case 0:
                pVar.v(((String[]) this.f2770d)[((Enum) obj).ordinal()]);
                return;
            default:
                kotlin.jvm.internal.l.f("writer", pVar);
                if (obj == null) {
                    throw new NullPointerException("value == null");
                }
                pVar.e();
                Iterator it = ((ArrayList) this.f2770d).iterator();
                while (it.hasNext()) {
                    I3.a aVar = (I3.a) it.next();
                    if (aVar != null) {
                        pVar.i(aVar.a);
                        aVar.f4040b.c(pVar, aVar.f4041c.get(obj));
                    }
                }
                o oVar = (o) pVar;
                oVar.f2828o = false;
                oVar.H(3, 5, '}');
                return;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "JsonAdapter(" + ((Class) this.f2769c).getName() + ")";
            default:
                return "KotlinJsonAdapter(" + ((InterfaceC1428g) this.f2769c).getReturnType() + ')';
        }
    }

    public A(InterfaceC1428g interfaceC1428g, ArrayList arrayList, ArrayList arrayList2, F.w wVar) {
        this.f2769c = interfaceC1428g;
        this.f2770d = arrayList;
        this.f2771e = arrayList2;
        this.f2768b = wVar;
    }
}
