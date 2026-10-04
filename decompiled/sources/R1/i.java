package R1;

import P3.r;
import V1.A;
import V1.G;
import V1.InterfaceC0601f;
import V1.p;
import android.graphics.Bitmap;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0684k;
import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import b3.C0710b;
import b3.C0711c;
import b3.InterfaceC0718j;
import e5.AbstractC0832b;
import f.AbstractC0841b;
import f6.EnumC0888B;
import h0.AbstractC0966K;
import h0.C0961F;
import h0.C0964I;
import h0.C0998u;
import h0.InterfaceC0973S;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import m5.C1523l;
import p.C1768t;
import v1.AbstractC2148b;
import v1.C2147a;
import w6.C2224i;
import x1.C2250b;

/* loaded from: classes.dex */
public final class i implements InterfaceC0601f, p, InterfaceC0718j, c3.e, InterfaceC0973S {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8064k;

    public /* synthetic */ i(int i7) {
        this.f8064k = i7;
    }

    public static final float[] e() {
        float[] fArr = C1768t.f14111s;
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[91];
        C1768t.f14111s = fArr2;
        return fArr2;
    }

    public static final float i(float f5, float[] fArr, float[] fArr2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float fAbs = Math.abs(f5);
        float fSignum = Math.signum(f5);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i7 = -(iBinarySearch + 1);
        int i8 = i7 - 1;
        if (i8 >= fArr.length - 1) {
            float f11 = fArr[fArr.length - 1];
            float f12 = fArr2[fArr.length - 1];
            if (f11 == 0.0f) {
                return 0.0f;
            }
            return (f12 / f11) * f5;
        }
        if (i8 == -1) {
            float f13 = fArr[0];
            f9 = fArr2[0];
            f10 = f13;
            f8 = 0.0f;
            f7 = 0.0f;
        } else {
            float f14 = fArr[i8];
            float f15 = fArr[i7];
            f7 = fArr2[i8];
            f8 = f14;
            f9 = fArr2[i7];
            f10 = f15;
        }
        return (((f9 - f7) * Math.max(0.0f, Math.min(1.0f, f8 == f10 ? 0.0f : (fAbs - f8) / (f10 - f8)))) + f7) * fSignum;
    }

    public static ArrayList l(List list) {
        kotlin.jvm.internal.l.f("protocols", list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC0888B) obj) != EnumC0888B.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC0888B) it.next()).f11470k);
        }
        return arrayList2;
    }

    public static byte[] n(List list) {
        kotlin.jvm.internal.l.f("protocols", list);
        C2224i c2224i = new C2224i();
        Iterator it = l(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            c2224i.g0(str.length());
            c2224i.k0(str);
        }
        return c2224i.P(c2224i.f17156l);
    }

    public static U o(W w7, I i7, int i8) {
        Q qC = i7;
        if ((i8 & 2) != 0) {
            qC = w7 instanceof InterfaceC0684k ? ((InterfaceC0684k) w7).c() : C2250b.a;
        }
        AbstractC2148b abstractC2148bD = w7 instanceof InterfaceC0684k ? ((InterfaceC0684k) w7).d() : C2147a.f16519b;
        kotlin.jvm.internal.l.f("factory", qC);
        kotlin.jvm.internal.l.f("extras", abstractC2148bD);
        return new U(w7.e(), qC, abstractC2148bD);
    }

    public static boolean r() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static C0961F u(O3.l[] lVarArr) {
        O3.l[] lVarArr2 = (O3.l[]) Arrays.copyOf(lVarArr, lVarArr.length);
        long jE = AbstractC0832b.e(0.0f, 0.0f);
        long jE2 = AbstractC0832b.e(0.0f, Float.POSITIVE_INFINITY);
        ArrayList arrayList = new ArrayList(lVarArr2.length);
        for (O3.l lVar : lVarArr2) {
            arrayList.add(new C0998u(((C0998u) lVar.f7529l).a));
        }
        ArrayList arrayList2 = new ArrayList(lVarArr2.length);
        for (O3.l lVar2 : lVarArr2) {
            arrayList2.add(Float.valueOf(((Number) lVar2.f7528k).floatValue()));
        }
        return new C0961F(arrayList, arrayList2, jE, jE2);
    }

    @Override // V1.p
    public void b() {
        switch (this.f8064k) {
            case 3:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // h0.InterfaceC0973S
    public AbstractC0966K c(long j7, T0.k kVar, T0.b bVar) {
        return new C0964I(AbstractC0841b.c(0L, j7));
    }

    @Override // b3.InterfaceC0718j
    public C0711c g(C0710b c0710b) {
        return null;
    }

    @Override // c3.e
    public boolean h() {
        return true;
    }

    @Override // V1.p
    public void k(A a) {
        switch (this.f8064k) {
            case 3:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // V1.p
    public G m(int i7, int i8) {
        switch (this.f8064k) {
            case 3:
                throw new UnsupportedOperationException();
            default:
                return new V1.m();
        }
    }

    public int q(int i7) {
        return i7 == 7 ? 6 : 3;
    }

    public A5.d s() {
        switch (this.f8064k) {
            case 5:
                Instant instantNow = Instant.now();
                kotlin.jvm.internal.l.e("now(...)", instantNow);
                A5.d dVar = A5.d.f249m;
                return A5.g.h(instantNow.getEpochSecond(), instantNow.getNano());
            default:
                A5.d dVar2 = A5.d.f249m;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j7 = jCurrentTimeMillis / 1000;
                if ((jCurrentTimeMillis ^ 1000) < 0 && j7 * 1000 != jCurrentTimeMillis) {
                    j7--;
                }
                long j8 = jCurrentTimeMillis % 1000;
                return j7 < -31557014167219200L ? A5.d.f249m : j7 > 31556889864403199L ? A5.d.f250n : A5.g.h(j7, (int) ((j8 + (1000 & (((j8 ^ 1000) & ((-j8) | j8)) >> 63))) * 1000000));
        }
    }

    public String toString() {
        switch (this.f8064k) {
            case 20:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }

    public i(C1523l c1523l) {
        this.f8064k = 18;
        String str = C1523l.f12990d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    private final void p() {
    }

    @Override // c3.e
    public void a() {
    }

    private final void t(A a) {
    }

    @Override // V1.InterfaceC0601f
    public long d(long j7) {
        return j7;
    }

    @Override // b3.InterfaceC0718j
    public void f(int i7) {
    }

    @Override // b3.InterfaceC0718j
    public void j(C0710b c0710b, Bitmap bitmap, Map map, int i7) {
    }
}
