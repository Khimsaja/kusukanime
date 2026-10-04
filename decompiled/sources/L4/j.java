package L4;

import B1.C0023j;
import P3.F;
import e4.InterfaceC0821a;
import e5.C0831a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n5.AbstractC1586x;
import n5.W;
import u4.InterfaceC2099e;
import u4.Q;
import v4.C2158f;
import v4.C2159g;
import x4.C2272S;
import x4.C2283j;

/* loaded from: classes.dex */
public final class j implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6095k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final A2.b f6096l;

    /* renamed from: m, reason: collision with root package name */
    public final o f6097m;

    public j(A2.b bVar, o oVar) {
        this.f6096l = bVar;
        this.f6097m = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [L4.o, L4.z] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v10, types: [J4.b] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v5, types: [L4.E] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [J4.b, x4.j, x4.u] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v18, types: [O3.i, java.lang.Object] */
    @Override // e4.InterfaceC0821a
    public final Object invoke() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ?? r42;
        A2.b bVar;
        ?? r43;
        String str;
        String str2;
        ?? arrayList;
        A4.y yVar;
        O3.l lVar;
        List listD;
        switch (this.f6095k) {
            case 0:
                ?? r2 = this.f6097m;
                Constructor<?>[] declaredConstructors = r2.f6113o.a.getDeclaredConstructors();
                kotlin.jvm.internal.l.e("getDeclaredConstructors(...)", declaredConstructors);
                boolean z7 = false;
                List listW = y5.k.W(y5.k.U(new y5.f(P3.m.Q(declaredConstructors), false, A4.k.f228k), A4.l.f229k));
                ArrayList arrayList2 = new ArrayList(listW.size());
                Iterator it = listW.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    A2.b bVar2 = r2.f6145b;
                    InterfaceC2099e interfaceC2099e = r2.f6112n;
                    if (!zHasNext) {
                        A4.p pVar = r2.f6113o;
                        boolean zG = pVar.g();
                        C2158f c2158f = C2159g.a;
                        Object obj = null;
                        A2.b bVar3 = this.f6096l;
                        if (zG) {
                            J4.b bVarE1 = J4.b.e1(interfaceC2099e, c2158f, true, ((K4.a) bVar2.f110l).f4708j.b(pVar));
                            ArrayList arrayListF = pVar.f();
                            ArrayList arrayList3 = new ArrayList(arrayListF.size());
                            M4.a aVarF0 = n6.d.f0(W.f13382l, false, null, 6);
                            Iterator it2 = arrayListF.iterator();
                            int i7 = 0;
                            while (it2.hasNext()) {
                                A4.B b4 = (A4.B) it2.next();
                                A2.b bVar4 = bVar3;
                                J4.b bVar5 = bVarE1;
                                arrayList3.add(new C2272S(bVar5, null, i7, c2158f, b4.c(), ((B2.l) bVar2.f113o).R(b4.f(), aVarF0), false, false, false, null, ((K4.a) bVar2.f110l).f4708j.b(b4)));
                                obj = null;
                                bVarE1 = bVar5;
                                i7++;
                                bVar3 = bVar4;
                                z7 = false;
                            }
                            A2.b bVar6 = bVar3;
                            C2283j c2283j = bVarE1;
                            r42 = obj;
                            boolean z8 = z7;
                            bVar = bVar6;
                            c2283j.W0(z8);
                            H4.o visibility = interfaceC2099e.getVisibility();
                            kotlin.jvm.internal.l.e("getVisibility(...)", visibility);
                            if (visibility.equals(H4.p.f3740b)) {
                                visibility = H4.p.f3741c;
                                kotlin.jvm.internal.l.e("PROTECTED_AND_PACKAGE", visibility);
                            }
                            c2283j.b1(arrayList3, visibility);
                            c2283j.V0(false);
                            c2283j.X0(interfaceC2099e.g());
                            String strJ = F.j(c2283j, 2);
                            if (arrayList2.isEmpty()) {
                                arrayList2.add(c2283j);
                                ((K4.a) bVar.f110l).f4705g.getClass();
                            } else {
                                Iterator it3 = arrayList2.iterator();
                                while (it3.hasNext()) {
                                    if (kotlin.jvm.internal.l.a(F.j((C2283j) it3.next(), 2), strJ)) {
                                    }
                                }
                                arrayList2.add(c2283j);
                                ((K4.a) bVar.f110l).f4705g.getClass();
                            }
                        } else {
                            r42 = 0;
                            bVar = bVar3;
                        }
                        ((C0831a) ((K4.a) bVar.f110l).f4722x).getClass();
                        kotlin.jvm.internal.l.f("thisDescriptor", interfaceC2099e);
                        kotlin.jvm.internal.l.f("c", bVar);
                        K4.a aVar = (K4.a) bVar.f110l;
                        boolean zIsEmpty = arrayList2.isEmpty();
                        Collection collectionJ = arrayList2;
                        if (zIsEmpty) {
                            Class cls = pVar.a;
                            boolean zIsAnnotation = cls.isAnnotation();
                            cls.isInterface();
                            Object obj2 = r42;
                            if (zIsAnnotation) {
                                J4.b bVarE12 = J4.b.e1(interfaceC2099e, c2158f, true, ((K4.a) bVar2.f110l).f4708j.b(pVar));
                                if (zIsAnnotation) {
                                    List listD2 = pVar.d();
                                    arrayList = new ArrayList(listD2.size());
                                    M4.a aVarF02 = n6.d.f0(W.f13382l, true, r42, 6);
                                    ArrayList arrayList4 = new ArrayList();
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj3 : listD2) {
                                        if (kotlin.jvm.internal.l.a(((A4.y) obj3).c(), H4.x.f3755b)) {
                                            arrayList4.add(obj3);
                                        } else {
                                            arrayList5.add(obj3);
                                        }
                                    }
                                    arrayList4.size();
                                    A4.y yVar2 = (A4.y) P3.q.t0(arrayList4);
                                    B2.l lVar2 = (B2.l) bVar2.f113o;
                                    if (yVar2 != null) {
                                        A4.C cF = yVar2.f();
                                        if (cF instanceof A4.i) {
                                            A4.i iVar = (A4.i) cF;
                                            yVar = yVar2;
                                            lVar = new O3.l(lVar2.Q(iVar, aVarF02, true), lVar2.R(iVar.f224b, aVarF02));
                                        } else {
                                            yVar = yVar2;
                                            lVar = new O3.l(lVar2.R(cF, aVarF02), null);
                                        }
                                        J4.b bVar7 = bVarE12;
                                        str2 = "getVisibility(...)";
                                        str = "PROTECTED_AND_PACKAGE";
                                        r2.v(arrayList, bVar7, 0, yVar, (AbstractC1586x) lVar.f7528k, (AbstractC1586x) lVar.f7529l);
                                        r43 = bVar7;
                                    } else {
                                        yVar = yVar2;
                                        r43 = bVarE12;
                                        str = "PROTECTED_AND_PACKAGE";
                                        str2 = "getVisibility(...)";
                                    }
                                    int i8 = yVar != null ? 1 : 0;
                                    Iterator it4 = arrayList5.iterator();
                                    int i9 = 0;
                                    while (it4.hasNext()) {
                                        A4.y yVar3 = (A4.y) it4.next();
                                        r2.v(arrayList, r43, i9 + i8, yVar3, lVar2.R(yVar3.f(), aVarF02), null);
                                        i9++;
                                    }
                                } else {
                                    r43 = bVarE12;
                                    str = "PROTECTED_AND_PACKAGE";
                                    str2 = "getVisibility(...)";
                                    arrayList = Collections.EMPTY_LIST;
                                }
                                r43.W0(false);
                                H4.o visibility2 = interfaceC2099e.getVisibility();
                                kotlin.jvm.internal.l.e(str2, visibility2);
                                if (visibility2.equals(H4.p.f3740b)) {
                                    visibility2 = H4.p.f3741c;
                                    kotlin.jvm.internal.l.e(str, visibility2);
                                }
                                r43.b1(arrayList, visibility2);
                                r43.V0(true);
                                r43.X0(interfaceC2099e.g());
                                ((K4.a) bVar2.f110l).f4705g.getClass();
                                obj2 = r43;
                            }
                            collectionJ = P3.r.J(obj2);
                        }
                        return P3.q.S0(aVar.f4716r.e(bVar, collectionJ));
                    }
                    A4.s sVar = (A4.s) it.next();
                    K4.c cVarK = z1.c.K(bVar2, sVar);
                    K4.a aVar2 = (K4.a) bVar2.f110l;
                    J4.b bVarE13 = J4.b.e1(interfaceC2099e, cVarK, false, aVar2.f4708j.b(sVar));
                    A2.b bVar8 = new A2.b(aVar2, new C0023j(bVar2, bVarE13, sVar, interfaceC2099e.n().size()), (O3.i) bVar2.f112n);
                    Constructor constructor = sVar.a;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    kotlin.jvm.internal.l.c(genericParameterTypes);
                    if (genericParameterTypes.length == 0) {
                        listD = P3.y.f7779k;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) P3.m.b0(genericParameterTypes, 1, genericParameterTypes.length);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            throw new IllegalStateException("Illegal generic signature: " + constructor);
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            parameterAnnotations = (Annotation[][]) P3.m.b0(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
                        }
                        listD = sVar.d(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    E3.b bVarU = z.u(bVar8, bVarE13, listD);
                    List listN = interfaceC2099e.n();
                    kotlin.jvm.internal.l.e("getDeclaredTypeParameters(...)", listN);
                    ArrayList typeParameters = sVar.getTypeParameters();
                    ArrayList arrayList6 = new ArrayList(P3.r.p(typeParameters, 10));
                    Iterator it5 = typeParameters.iterator();
                    while (it5.hasNext()) {
                        Q qA = ((K4.e) bVar8.f111m).a((A4.D) it5.next());
                        kotlin.jvm.internal.l.c(qA);
                        arrayList6.add(qA);
                    }
                    bVarE13.c1((List) bVarU.f1932c, P3.r.Z(sVar.e()), P3.q.G0(listN, arrayList6));
                    bVarE13.V0(false);
                    bVarE13.W0(bVarU.f1931b);
                    bVarE13.X0(interfaceC2099e.g());
                    ((K4.a) bVar8.f110l).f4705g.getClass();
                    arrayList2.add(bVarE13);
                }
                break;
            default:
                A2.b bVar9 = this.f6096l;
                K4.a aVar3 = (K4.a) bVar9.f110l;
                InterfaceC2099e interfaceC2099e2 = this.f6097m.f6112n;
                ((C0831a) aVar3.f4722x).getClass();
                kotlin.jvm.internal.l.f("thisDescriptor", interfaceC2099e2);
                kotlin.jvm.internal.l.f("c", bVar9);
                return P3.q.X0(new ArrayList());
        }
    }

    public j(o oVar, A2.b bVar) {
        this.f6097m = oVar;
        this.f6096l = bVar;
    }
}
