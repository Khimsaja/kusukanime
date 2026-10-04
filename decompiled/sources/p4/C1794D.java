package p4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import o4.F0;

/* renamed from: p4.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1794D implements InterfaceC1801g {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1801g f14361b;

    /* renamed from: c, reason: collision with root package name */
    public final Member f14362c;

    /* renamed from: d, reason: collision with root package name */
    public final B2.l f14363d;

    /* renamed from: e, reason: collision with root package name */
    public final k4.g[] f14364e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14365f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072 A[LOOP:1: B:23:0x006c->B:25:0x0072, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d3  */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v44, types: [k4.e, k4.g] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1794D(p4.InterfaceC1801g r11, u4.InterfaceC2112s r12, boolean r13) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.C1794D.<init>(p4.g, u4.s, boolean):void");
    }

    @Override // p4.InterfaceC1801g
    public final List a() {
        return this.f14361b.a();
    }

    @Override // p4.InterfaceC1801g
    public final Member b() {
        return this.f14362c;
    }

    @Override // p4.InterfaceC1801g
    public final boolean c() {
        return this.f14361b instanceof r;
    }

    @Override // p4.InterfaceC1801g
    public final Object call(Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method;
        Object objInvoke;
        Object objE;
        Object objE2;
        kotlin.jvm.internal.l.f("args", objArr);
        B2.l lVar = this.f14363d;
        k4.g gVar = (k4.g) lVar.f416l;
        List[] listArr = (List[]) lVar.f417m;
        if (!gVar.isEmpty()) {
            boolean z7 = this.f14365f;
            int i7 = gVar.f12673l;
            int i8 = gVar.f12672k;
            if (z7) {
                Q3.c cVar = new Q3.c(objArr.length);
                for (int i9 = 0; i9 < i8; i9++) {
                    cVar.add(objArr[i9]);
                }
                if (i8 <= i7) {
                    while (true) {
                        List<Method> list = listArr[i8];
                        Object obj = objArr[i8];
                        if (list != null) {
                            for (Method method2 : list) {
                                if (obj != null) {
                                    objE2 = method2.invoke(obj, new Object[0]);
                                } else {
                                    Class<?> returnType = method2.getReturnType();
                                    kotlin.jvm.internal.l.e("getReturnType(...)", returnType);
                                    objE2 = F0.e(returnType);
                                }
                                cVar.add(objE2);
                            }
                        } else {
                            cVar.add(obj);
                        }
                        if (i8 == i7) {
                            break;
                        }
                        i8++;
                    }
                }
                int i10 = i7 + 1;
                int length = objArr.length - 1;
                if (i10 <= length) {
                    while (true) {
                        cVar.add(objArr[i10]);
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
                objArr = P3.r.h(cVar).toArray(new Object[0]);
            } else {
                int length2 = objArr.length;
                Object[] objArr2 = new Object[length2];
                for (int i11 = 0; i11 < length2; i11++) {
                    if (i11 > i7 || i8 > i11) {
                        objE = objArr[i11];
                    } else {
                        List list2 = listArr[i11];
                        Method method3 = list2 != null ? (Method) P3.q.K0(list2) : null;
                        objE = objArr[i11];
                        if (method3 != null) {
                            if (objE != null) {
                                objE = method3.invoke(objE, new Object[0]);
                            } else {
                                Class<?> returnType2 = method3.getReturnType();
                                kotlin.jvm.internal.l.e("getReturnType(...)", returnType2);
                                objE = F0.e(returnType2);
                            }
                        }
                    }
                    objArr2[i11] = objE;
                }
                objArr = objArr2;
            }
        }
        Object objCall = this.f14361b.call(objArr);
        return (objCall == T3.a.f9048k || (method = (Method) lVar.f418n) == null || (objInvoke = method.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    public final k4.g d(int i7) {
        k4.g[] gVarArr = this.f14364e;
        if (i7 >= 0 && i7 < gVarArr.length) {
            return gVarArr[i7];
        }
        if (gVarArr.length == 0) {
            return new k4.g(i7, i7, 1);
        }
        int length = ((k4.g) P3.m.o0(gVarArr)).f12673l + 1 + (i7 - gVarArr.length);
        return new k4.g(length, length, 1);
    }

    @Override // p4.InterfaceC1801g
    public final Type getReturnType() {
        return this.f14361b.getReturnType();
    }
}
