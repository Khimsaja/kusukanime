package z0;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import g0.AbstractC0932a;
import h0.AbstractC0966K;
import h0.AbstractC0968M;
import h0.C0963H;
import h0.C0964I;
import h0.C0965J;
import h0.C0987j;
import h0.InterfaceC0967L;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m.AbstractC1489j;
import m.C1496q;
import y0.AbstractC2359f;
import y0.C2349D;
import y0.InterfaceC2366m;

/* loaded from: classes.dex */
public abstract class O implements R0 {
    public static final Class[] a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* renamed from: b, reason: collision with root package name */
    public static final g0.d f18644b = new g0.d(0.0f, 0.0f, 10.0f, 10.0f);

    public static final W0.i A(C2441e0 c2441e0, int i7) {
        Object next;
        Iterator<T> it = c2441e0.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C2349D) ((Map.Entry) next).getKey()).f17672l == i7) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (W0.i) entry.getValue();
        }
        return null;
    }

    public static final String B(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String C(int i7) {
        if (i7 == 0) {
            return "android.widget.Button";
        }
        if (i7 == 1) {
            return "android.widget.CheckBox";
        }
        if (i7 == 3) {
            return "android.widget.RadioButton";
        }
        if (i7 == 5) {
            return "android.widget.ImageView";
        }
        if (i7 == 6) {
            return "android.widget.Spinner";
        }
        return null;
    }

    public static void D(View view) {
        try {
            if (!U0.f18684C) {
                U0.f18684C = true;
                if (Build.VERSION.SDK_INT < 28) {
                    U0.f18682A = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                    U0.f18683B = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    U0.f18682A = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    U0.f18683B = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = U0.f18682A;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = U0.f18683B;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = U0.f18683B;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = U0.f18682A;
            if (method2 != null) {
                method2.invoke(view, new Object[0]);
            }
        } catch (Throwable unused) {
            U0.f18685D = true;
        }
    }

    public static final boolean h(F0.n nVar) {
        F0.i iVarI = nVar.i();
        return !iVarI.f2096k.containsKey(F0.q.f2136i);
    }

    public static final boolean m(F0.n nVar) {
        return nVar.f2103c.f17656C == T0.k.f8845l;
    }

    public static final boolean n(Object obj) {
        if (obj instanceof Y.p) {
            Y.p pVar = (Y.p) obj;
            if (pVar.c() == O.T.f7046m || pVar.c() == O.T.f7049p || pVar.c() == O.T.f7047n) {
                Object value = pVar.getValue();
                if (value == null) {
                    return true;
                }
                return n(value);
            }
        } else {
            if ((obj instanceof O3.e) && (obj instanceof Serializable)) {
                return false;
            }
            Class[] clsArr = a;
            for (int i7 = 0; i7 < 7; i7++) {
                if (clsArr[i7].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final int o(float f5) {
        return ((int) (f5 >= 0.0f ? Math.ceil(f5) : Math.floor(f5))) * (-1);
    }

    public static final float p(int i7, int i8, float[] fArr, float[] fArr2) {
        int i9 = i7 * 4;
        return (fArr[i9 + 3] * fArr2[12 + i8]) + (fArr[i9 + 2] * fArr2[8 + i8]) + (fArr[i9 + 1] * fArr2[4 + i8]) + (fArr[i9] * fArr2[i8]);
    }

    public static final C1496q q(F0.o oVar) {
        F0.n nVarA = oVar.a();
        C1496q c1496q = AbstractC1489j.a;
        C1496q c1496q2 = new C1496q();
        C2349D c2349d = nVarA.f2103c;
        if (c2349d.F() && c2349d.E()) {
            g0.d dVarE = nVarA.e();
            r(new Region(Math.round(dVarE.a), Math.round(dVarE.f11659b), Math.round(dVarE.f11660c), Math.round(dVarE.f11661d)), nVarA, c1496q2, nVarA, new Region());
        }
        return c1496q2;
    }

    public static final void r(Region region, F0.n nVar, C1496q c1496q, F0.n nVar2, Region region2) {
        C2349D c2349d;
        InterfaceC2366m interfaceC2366mZ;
        boolean zF = nVar2.f2103c.F();
        C2349D c2349d2 = nVar2.f2103c;
        boolean z7 = (zF && c2349d2.E()) ? false : true;
        boolean zIsEmpty = region.isEmpty();
        int i7 = nVar.f2107g;
        int i8 = nVar2.f2107g;
        if (!zIsEmpty || i8 == i7) {
            if (!z7 || nVar2.f2105e) {
                F0.i iVar = nVar2.f2104d;
                boolean z8 = iVar.f2097l;
                InterfaceC2366m interfaceC2366m = nVar2.a;
                if (z8 && (interfaceC2366mZ = P3.r.z(c2349d2)) != null) {
                    interfaceC2366m = interfaceC2366mZ;
                }
                a0.p pVar = ((a0.p) interfaceC2366m).f10402k;
                Object obj = iVar.f2096k.get(F0.h.f2071b);
                if (obj == null) {
                    obj = null;
                }
                boolean z9 = obj != null;
                boolean z10 = pVar.f10402k.f10414w;
                g0.d dVar = g0.d.f11658e;
                if (z10) {
                    if (z9) {
                        y0.Y yT = AbstractC2359f.t(pVar, 8);
                        if (yT.P0().f10414w) {
                            w0.r rVarF = w0.X.f(yT);
                            g0.b bVar = yT.I;
                            if (bVar == null) {
                                bVar = new g0.b();
                                bVar.a = 0.0f;
                                bVar.f11655b = 0.0f;
                                bVar.f11656c = 0.0f;
                                bVar.f11657d = 0.0f;
                                yT.I = bVar;
                            }
                            long jF0 = yT.F0(yT.O0());
                            bVar.a = -g0.f.d(jF0);
                            bVar.f11655b = -g0.f.b(jF0);
                            bVar.f11656c = g0.f.d(jF0) + yT.h0();
                            bVar.f11657d = g0.f.b(jF0) + yT.f0();
                            while (true) {
                                if (yT == rVarF) {
                                    dVar = new g0.d(bVar.a, bVar.f11655b, bVar.f11656c, bVar.f11657d);
                                    break;
                                }
                                yT.d1(bVar, false, true);
                                if (bVar.b()) {
                                    break;
                                }
                                yT = yT.f17827x;
                                kotlin.jvm.internal.l.c(yT);
                            }
                        }
                    } else {
                        y0.Y yT2 = AbstractC2359f.t(pVar, 8);
                        dVar = w0.X.f(yT2).K(yT2, true);
                    }
                }
                int iRound = Math.round(dVar.a);
                int iRound2 = Math.round(dVar.f11659b);
                int iRound3 = Math.round(dVar.f11660c);
                int iRound4 = Math.round(dVar.f11661d);
                region2.set(iRound, iRound2, iRound3, iRound4);
                if (i8 == i7) {
                    i8 = -1;
                }
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (nVar2.f2105e) {
                        F0.n nVarJ = nVar2.j();
                        g0.d dVarE = (nVarJ == null || (c2349d = nVarJ.f2103c) == null || !c2349d.F()) ? f18644b : nVarJ.e();
                        c1496q.h(i8, new M0(nVar2, new Rect(Math.round(dVarE.a), Math.round(dVarE.f11659b), Math.round(dVarE.f11660c), Math.round(dVarE.f11661d))));
                        return;
                    } else {
                        if (i8 == -1) {
                            c1496q.h(i8, new M0(nVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                c1496q.h(i8, new M0(nVar2, region2.getBounds()));
                List listH = F0.n.h(nVar2, 4);
                for (int size = listH.size() - 1; -1 < size; size--) {
                    r(region, nVar, c1496q, (F0.n) listH.get(size), region2);
                }
                if (u(nVar2)) {
                    region.op(iRound, iRound2, iRound3, iRound4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final H0.F s(F0.i iVar) {
        e4.k kVar;
        ArrayList arrayList = new ArrayList();
        Object obj = iVar.f2096k.get(F0.h.a);
        if (obj == null) {
            obj = null;
        }
        F0.a aVar = (F0.a) obj;
        if (aVar == null || (kVar = (e4.k) aVar.f2062b) == null || !((Boolean) kVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (H0.F) arrayList.get(0);
    }

    public static final boolean t(float[] fArr, float[] fArr2) {
        float f5 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = fArr[6];
        float f13 = fArr[7];
        float f14 = fArr[8];
        float f15 = fArr[9];
        float f16 = fArr[10];
        float f17 = fArr[11];
        float f18 = fArr[12];
        float f19 = fArr[13];
        float f20 = fArr[14];
        float f21 = fArr[15];
        float f22 = (f5 * f11) - (f7 * f10);
        float f23 = (f5 * f12) - (f8 * f10);
        float f24 = (f5 * f13) - (f9 * f10);
        float f25 = (f7 * f12) - (f8 * f11);
        float f26 = (f7 * f13) - (f9 * f11);
        float f27 = (f8 * f13) - (f9 * f12);
        float f28 = (f14 * f19) - (f15 * f18);
        float f29 = (f14 * f20) - (f16 * f18);
        float f30 = (f14 * f21) - (f17 * f18);
        float f31 = (f15 * f20) - (f16 * f19);
        float f32 = (f15 * f21) - (f17 * f19);
        float f33 = (f16 * f21) - (f17 * f20);
        float f34 = (f27 * f28) + (((f25 * f30) + ((f24 * f31) + ((f22 * f33) - (f23 * f32)))) - (f26 * f29));
        if (f34 == 0.0f) {
            return false;
        }
        float f35 = 1.0f / f34;
        fArr2[0] = ((f13 * f31) + ((f11 * f33) - (f12 * f32))) * f35;
        fArr2[1] = (((f8 * f32) + ((-f7) * f33)) - (f9 * f31)) * f35;
        fArr2[2] = ((f21 * f25) + ((f19 * f27) - (f20 * f26))) * f35;
        fArr2[3] = (((f16 * f26) + ((-f15) * f27)) - (f17 * f25)) * f35;
        float f36 = -f10;
        fArr2[4] = (((f12 * f30) + (f36 * f33)) - (f13 * f29)) * f35;
        fArr2[5] = ((f9 * f29) + ((f33 * f5) - (f8 * f30))) * f35;
        float f37 = -f18;
        fArr2[6] = (((f20 * f24) + (f37 * f27)) - (f21 * f23)) * f35;
        fArr2[7] = ((f17 * f23) + ((f27 * f14) - (f16 * f24))) * f35;
        fArr2[8] = ((f13 * f28) + ((f10 * f32) - (f11 * f30))) * f35;
        fArr2[9] = (((f30 * f7) + ((-f5) * f32)) - (f9 * f28)) * f35;
        fArr2[10] = ((f21 * f22) + ((f18 * f26) - (f19 * f24))) * f35;
        fArr2[11] = (((f24 * f15) + ((-f14) * f26)) - (f17 * f22)) * f35;
        fArr2[12] = (((f11 * f29) + (f36 * f31)) - (f12 * f28)) * f35;
        fArr2[13] = ((f8 * f28) + ((f5 * f31) - (f7 * f29))) * f35;
        fArr2[14] = (((f19 * f23) + (f37 * f25)) - (f20 * f22)) * f35;
        fArr2[15] = ((f16 * f22) + ((f14 * f25) - (f15 * f23))) * f35;
        return true;
    }

    public static final boolean u(F0.n nVar) {
        if (!x(nVar)) {
            return false;
        }
        F0.i iVar = nVar.f2104d;
        if (iVar.f2097l) {
            return true;
        }
        Set setKeySet = iVar.f2096k.keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            return false;
        }
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            if (((F0.t) it.next()).f2155c) {
                return true;
            }
        }
        return false;
    }

    public static final boolean v(AbstractC0966K abstractC0966K, float f5, float f7) {
        if (abstractC0966K instanceof C0964I) {
            g0.d dVar = ((C0964I) abstractC0966K).a;
            return dVar.a <= f5 && f5 < dVar.f11660c && dVar.f11659b <= f7 && f7 < dVar.f11661d;
        }
        if (!(abstractC0966K instanceof C0965J)) {
            if (abstractC0966K instanceof C0963H) {
                return w(((C0963H) abstractC0966K).a, f5, f7);
            }
            throw new D6.r();
        }
        g0.e eVar = ((C0965J) abstractC0966K).a;
        float f8 = eVar.a;
        if (f5 < f8) {
            return false;
        }
        float f9 = eVar.f11663c;
        if (f5 >= f9) {
            return false;
        }
        float f10 = eVar.f11662b;
        if (f7 < f10) {
            return false;
        }
        float f11 = eVar.f11664d;
        if (f7 >= f11) {
            return false;
        }
        long j7 = eVar.f11665e;
        float fB = AbstractC0932a.b(j7);
        long j8 = eVar.f11666f;
        if (AbstractC0932a.b(j8) + fB <= eVar.b()) {
            long j9 = eVar.f11668h;
            float fB2 = AbstractC0932a.b(j9);
            long j10 = eVar.f11667g;
            if (AbstractC0932a.b(j10) + fB2 <= eVar.b()) {
                if (AbstractC0932a.c(j9) + AbstractC0932a.c(j7) <= eVar.a()) {
                    if (AbstractC0932a.c(j10) + AbstractC0932a.c(j8) <= eVar.a()) {
                        float fB3 = AbstractC0932a.b(j7) + f8;
                        float fC = AbstractC0932a.c(j7) + f10;
                        float fB4 = f9 - AbstractC0932a.b(j8);
                        float fC2 = AbstractC0932a.c(j8) + f10;
                        float fB5 = f9 - AbstractC0932a.b(j10);
                        float fC3 = f11 - AbstractC0932a.c(j10);
                        float fC4 = f11 - AbstractC0932a.c(j9);
                        float fB6 = AbstractC0932a.b(j9) + f8;
                        if (f5 < fB3 && f7 < fC) {
                            return y(f5, f7, eVar.f11665e, fB3, fC);
                        }
                        if (f5 < fB6 && f7 > fC4) {
                            return y(f5, f7, eVar.f11668h, fB6, fC4);
                        }
                        if (f5 > fB4 && f7 < fC2) {
                            return y(f5, f7, eVar.f11666f, fB4, fC2);
                        }
                        if (f5 <= fB5 || f7 <= fC3) {
                            return true;
                        }
                        return y(f5, f7, eVar.f11667g, fB5, fC3);
                    }
                }
            }
        }
        C0987j c0987jH = AbstractC0968M.h();
        InterfaceC0967L.a(c0987jH, eVar);
        return w(c0987jH, f5, f7);
    }

    public static final boolean w(InterfaceC0967L interfaceC0967L, float f5, float f7) {
        g0.d dVar = new g0.d(f5 - 0.005f, f7 - 0.005f, f5 + 0.005f, f7 + 0.005f);
        C0987j c0987jH = AbstractC0968M.h();
        InterfaceC0967L.b(c0987jH, dVar);
        C0987j c0987jH2 = AbstractC0968M.h();
        c0987jH2.d(interfaceC0967L, c0987jH, 1);
        boolean zIsEmpty = c0987jH2.a.isEmpty();
        c0987jH2.e();
        c0987jH.e();
        return !zIsEmpty;
    }

    public static final boolean x(F0.n nVar) {
        y0.Y yC = nVar.c();
        if (!(yC != null ? yC.W0() : false)) {
            if (!nVar.f2104d.f2096k.containsKey(F0.q.f2140m)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean y(float f5, float f7, long j7, float f8, float f9) {
        float f10 = f5 - f8;
        float f11 = f7 - f9;
        float fB = AbstractC0932a.b(j7);
        float fC = AbstractC0932a.c(j7);
        return ((f11 * f11) / (fC * fC)) + ((f10 * f10) / (fB * fB)) <= 1.0f;
    }

    public static final void z(float[] fArr, float[] fArr2) {
        float fP = p(0, 0, fArr2, fArr);
        float fP2 = p(0, 1, fArr2, fArr);
        float fP3 = p(0, 2, fArr2, fArr);
        float fP4 = p(0, 3, fArr2, fArr);
        float fP5 = p(1, 0, fArr2, fArr);
        float fP6 = p(1, 1, fArr2, fArr);
        float fP7 = p(1, 2, fArr2, fArr);
        float fP8 = p(1, 3, fArr2, fArr);
        float fP9 = p(2, 0, fArr2, fArr);
        float fP10 = p(2, 1, fArr2, fArr);
        float fP11 = p(2, 2, fArr2, fArr);
        float fP12 = p(2, 3, fArr2, fArr);
        float fP13 = p(3, 0, fArr2, fArr);
        float fP14 = p(3, 1, fArr2, fArr);
        float fP15 = p(3, 2, fArr2, fArr);
        float fP16 = p(3, 3, fArr2, fArr);
        fArr[0] = fP;
        fArr[1] = fP2;
        fArr[2] = fP3;
        fArr[3] = fP4;
        fArr[4] = fP5;
        fArr[5] = fP6;
        fArr[6] = fP7;
        fArr[7] = fP8;
        fArr[8] = fP9;
        fArr[9] = fP10;
        fArr[10] = fP11;
        fArr[11] = fP12;
        fArr[12] = fP13;
        fArr[13] = fP14;
        fArr[14] = fP15;
        fArr[15] = fP16;
    }
}
