package F1;

import B1.C0014a;
import B1.K;
import F.w;
import H.N;
import H5.A;
import H5.D;
import K.B;
import K.C;
import X4.y;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import h0.C0998u;
import j0.C1296b;
import j0.InterfaceC1298d;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import m.C1492m;
import n5.P;
import p.A0;
import p.AbstractC1714A;
import p.AbstractC1745d;
import p.C1743c;
import s.C1904b;
import s0.AbstractC1971p;
import s0.C1962g;
import u.C2062a;
import u.C2063b;
import u.C2064c;
import y0.C2349D;
import y0.C2351F;
import z0.C2471u;

/* loaded from: classes.dex */
public final class m implements n {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2205b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2206c = AbstractC1745d.a(0.0f);

    /* renamed from: d, reason: collision with root package name */
    public Object f2207d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public Object f2208e;

    /* JADX WARN: Multi-variable type inference failed */
    public m(boolean z7, InterfaceC0821a interfaceC0821a) {
        this.a = z7;
        this.f2205b = (kotlin.jvm.internal.m) interfaceC0821a;
    }

    public static int k(k kVar, int i7) {
        int iHashCode = kVar.f2197b.hashCode() + (kVar.a * 31);
        if (i7 < 2) {
            long jA = o.a(kVar.f2200e);
            return (iHashCode * 31) + ((int) (jA ^ (jA >>> 32)));
        }
        return kVar.f2200e.hashCode() + (iHashCode * 31);
    }

    public static k n(int i7, DataInputStream dataInputStream) throws IOException {
        p pVarA;
        int i8 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i7 < 2) {
            long j7 = dataInputStream.readLong();
            g gVar = new g();
            gVar.a("exo_len", Long.valueOf(j7));
            pVarA = p.f2209c.b(gVar);
        } else {
            pVarA = B0.b.a(dataInputStream);
        }
        return new k(i8, utf, pVarA);
    }

    @Override // F1.n
    public boolean a() {
        w wVar = (w) this.f2207d;
        return ((File) wVar.f2037l).exists() || ((File) wVar.f2038m).exists();
    }

    @Override // F1.n
    public void b(HashMap map) throws Throwable {
        if (this.a) {
            c(map);
        }
    }

    @Override // F1.n
    public void c(HashMap map) throws Throwable {
        DataOutputStream dataOutputStream;
        w wVar = (w) this.f2207d;
        DataOutputStream dataOutputStream2 = null;
        try {
            C0014a c0014aO = wVar.O();
            s sVar = (s) this.f2208e;
            if (sVar == null) {
                this.f2208e = new s(c0014aO);
            } else {
                sVar.b(c0014aO);
            }
            dataOutputStream = new DataOutputStream((s) this.f2208e);
        } catch (Throwable th) {
            th = th;
        }
        try {
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(map.size());
            int iK = 0;
            for (k kVar : map.values()) {
                dataOutputStream.writeInt(kVar.a);
                dataOutputStream.writeUTF(kVar.f2197b);
                B0.b.b(kVar.f2200e, dataOutputStream);
                iK += k(kVar, 2);
            }
            dataOutputStream.writeInt(iK);
            dataOutputStream.close();
            ((File) wVar.f2038m).delete();
            int i7 = K.a;
            this.a = false;
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream2 = dataOutputStream;
            K.f(dataOutputStream2);
            throw th;
        }
    }

    @Override // F1.n
    public void e(k kVar, boolean z7) {
        this.a = true;
    }

    @Override // F1.n
    public void f(k kVar) {
        this.a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0095 A[Catch: all -> 0x007e, IOException -> 0x0081, TRY_LEAVE, TryCatch #4 {IOException -> 0x0081, all -> 0x007e, blocks: (B:13:0x0041, B:18:0x004b, B:25:0x005f, B:26:0x0069, B:27:0x0072, B:34:0x0086, B:35:0x008b, B:36:0x008c, B:38:0x0095, B:40:0x009b, B:41:0x00aa), top: B:64:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    @Override // F1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(java.util.HashMap r13, android.util.SparseArray r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F1.m.g(java.util.HashMap, android.util.SparseArray):void");
    }

    @Override // F1.n
    public void h() {
        w wVar = (w) this.f2207d;
        ((File) wVar.f2037l).delete();
        ((File) wVar.f2038m).delete();
    }

    public void i(C2351F c2351f, float f5, long j7) {
        float fFloatValue = ((Number) ((C1743c) this.f2206c).d()).floatValue();
        if (fFloatValue > 0.0f) {
            long jB = C0998u.b(fFloatValue, j7);
            if (!this.a) {
                InterfaceC1298d.u(c2351f, jB, f5, 0L, 124);
                return;
            }
            C1296b c1296b = c2351f.f17696k;
            float fD = g0.f.d(c1296b.d());
            float fB = g0.f.b(c1296b.d());
            B2.l lVar = c1296b.f12205l;
            long jA = lVar.A();
            lVar.t().l();
            try {
                ((B2.l) ((y) lVar.f416l).f9916l).t().e(0.0f, 0.0f, fD, fB, 1);
                InterfaceC1298d.u(c2351f, jB, f5, 0L, 124);
            } finally {
                AbstractC0703b.y(lVar, jA);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [e4.a, kotlin.jvm.internal.m] */
    public void j(u.i iVar, A a) {
        boolean z7 = iVar instanceof u.g;
        ArrayList arrayList = (ArrayList) this.f2207d;
        if (z7) {
            arrayList.add(iVar);
        } else if (iVar instanceof u.h) {
            arrayList.remove(((u.h) iVar).a);
        } else if (iVar instanceof u.d) {
            arrayList.add(iVar);
        } else if (iVar instanceof u.e) {
            arrayList.remove(((u.e) iVar).a);
        } else if (iVar instanceof C2063b) {
            arrayList.add(iVar);
        } else if (iVar instanceof C2064c) {
            arrayList.remove(((C2064c) iVar).a);
        } else if (!(iVar instanceof C2062a)) {
            return;
        } else {
            arrayList.remove(((C2062a) iVar).a);
        }
        u.i iVar2 = (u.i) P3.q.B0(arrayList);
        if (kotlin.jvm.internal.l.a((u.i) this.f2208e, iVar2)) {
            return;
        }
        if (iVar2 != null) {
            K.h hVar = (K.h) ((kotlin.jvm.internal.m) this.f2205b).invoke();
            float f5 = z7 ? hVar.f4383c : iVar instanceof u.d ? hVar.f4382b : iVar instanceof C2063b ? hVar.a : 0.0f;
            A0 a02 = K.u.a;
            boolean z8 = iVar2 instanceof u.g;
            A0 a03 = K.u.a;
            if (!z8 && ((iVar2 instanceof u.d) || (iVar2 instanceof C2063b))) {
                a03 = new A0(45, AbstractC1714A.f13835c, 2);
            }
            D.x(a, null, new B(this, f5, a03, null), 3);
        } else {
            u.i iVar3 = (u.i) this.f2208e;
            A0 a04 = K.u.a;
            boolean z9 = iVar3 instanceof u.g;
            A0 a05 = K.u.a;
            if (!z9 && !(iVar3 instanceof u.d) && (iVar3 instanceof C2063b)) {
                a05 = new A0(150, AbstractC1714A.f13835c, 2);
            }
            D.x(a, null, new C(this, a05, null), 3);
        }
        this.f2208e = iVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int l(P p7, C2471u c2471u, boolean z7) {
        Object[] objArr;
        B2.l lVar;
        int i7;
        y0.r rVar = (y0.r) this.f2208e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            N nV = ((p2.l) this.f2207d).v(p7, c2471u);
            C1492m c1492m = (C1492m) nV.f2901c;
            int iF = c1492m.f();
            for (int i8 = 0; i8 < iF; i8++) {
                s0.r rVar2 = (s0.r) c1492m.g(i8);
                if (!rVar2.f15471d && !rVar2.f15475h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int iF2 = c1492m.f();
            int i9 = 0;
            while (true) {
                lVar = (B2.l) this.f2206c;
                if (i9 >= iF2) {
                    break;
                }
                s0.r rVar3 = (s0.r) c1492m.g(i9);
                if (objArr != false || AbstractC1971p.a(rVar3)) {
                    ((C2349D) this.f2205b).w(rVar3.f15470c, (y0.r) this.f2208e, rVar3.f15476i == 1, true);
                    if (!rVar.isEmpty()) {
                        lVar.g(rVar3.a, rVar, AbstractC1971p.a(rVar3));
                        rVar.clear();
                    }
                }
                i9++;
            }
            ((C1904b) lVar.f417m).d();
            boolean zQ = lVar.q(nV, z7);
            if (!nV.f2900b) {
                int iF3 = c1492m.f();
                for (int i10 = 0; i10 < iF3; i10++) {
                    s0.r rVar4 = (s0.r) c1492m.g(i10);
                    if (!g0.c.b(AbstractC1971p.f(rVar4, true), 0L) && rVar4.b()) {
                        i7 = 2;
                        break;
                    }
                }
            }
            i7 = 0;
            int i11 = (zQ ? 1 : 0) | i7;
            this.a = false;
            return i11;
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }

    public void m() {
        if (this.a) {
            return;
        }
        ((C1492m) ((p2.l) this.f2207d).f14298b).a();
        B2.l lVar = (B2.l) this.f2206c;
        Q.d dVar = ((C1904b) lVar.f417m).a;
        int i7 = dVar.f7829m;
        if (i7 > 0) {
            Object[] objArr = dVar.f7827k;
            int i8 = 0;
            do {
                ((C1962g) objArr[i8]).f();
                i8++;
            } while (i8 < i7);
        }
        ((C1904b) lVar.f417m).a.g();
    }

    @Override // F1.n
    public void d(long j7) {
    }
}
