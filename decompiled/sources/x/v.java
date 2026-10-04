package x;

import L.L1;
import O.C0486d;
import O.C0493g0;
import O.T;
import O.Z;
import f.AbstractC0847h;
import f1.AbstractC0870c;
import java.util.ArrayList;
import java.util.List;
import o.C1622t;
import s.C1904b;
import s.EnumC1903a0;
import s.InterfaceC1946w0;
import y.C2303C;
import y.C2306F;
import y.C2322c;
import y.InterfaceC2305E;
import y0.C2349D;

/* loaded from: classes.dex */
public final class v implements InterfaceC1946w0 {

    /* renamed from: t, reason: collision with root package name */
    public static final L2.e f17278t = q0.c.F(C2232f.f17205n, C2237k.f17219n);
    public final O4.c a;

    /* renamed from: b, reason: collision with root package name */
    public final w.n f17279b;

    /* renamed from: c, reason: collision with root package name */
    public final C0493g0 f17280c;

    /* renamed from: d, reason: collision with root package name */
    public final u.k f17281d;

    /* renamed from: e, reason: collision with root package name */
    public float f17282e;

    /* renamed from: f, reason: collision with root package name */
    public final s.r f17283f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f17284g;

    /* renamed from: h, reason: collision with root package name */
    public C2349D f17285h;

    /* renamed from: i, reason: collision with root package name */
    public final w.p f17286i;

    /* renamed from: j, reason: collision with root package name */
    public final C2322c f17287j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.a f17288k;

    /* renamed from: l, reason: collision with root package name */
    public final C1904b f17289l;

    /* renamed from: m, reason: collision with root package name */
    public final C2306F f17290m;

    /* renamed from: n, reason: collision with root package name */
    public final p2.l f17291n;

    /* renamed from: o, reason: collision with root package name */
    public final C2303C f17292o;

    /* renamed from: p, reason: collision with root package name */
    public final Z f17293p;

    /* renamed from: q, reason: collision with root package name */
    public final Z f17294q;

    /* renamed from: r, reason: collision with root package name */
    public final C0493g0 f17295r;

    /* renamed from: s, reason: collision with root package name */
    public final C0493g0 f17296s;

    public v(int i7, int i8) {
        O4.c cVar = new O4.c();
        cVar.f7552b = -1;
        cVar.f7553c = new Q.d(new InterfaceC2305E[16]);
        this.a = cVar;
        this.f17279b = new w.n(i7, i8, 1);
        this.f17280c = C0486d.K(x.a, T.f7046m);
        this.f17281d = new u.k();
        this.f17283f = new s.r(new C1622t(11, this));
        this.f17284g = true;
        this.f17286i = new w.p(this, 1);
        this.f17287j = new C2322c();
        this.f17288k = new androidx.compose.foundation.lazy.layout.a();
        this.f17289l = new C1904b(2);
        this.f17290m = new C2306F(new L1(i7, 4, this));
        this.f17291n = new p2.l(8, this);
        this.f17292o = new C2303C();
        this.f17293p = AbstractC0847h.l();
        this.f17294q = AbstractC0847h.l();
        Boolean bool = Boolean.FALSE;
        T t7 = T.f7049p;
        this.f17295r = C0486d.K(bool, t7);
        this.f17296s = C0486d.K(bool, t7);
    }

    @Override // s.InterfaceC1946w0
    public final boolean a() {
        return ((Boolean) this.f17296s.getValue()).booleanValue();
    }

    @Override // s.InterfaceC1946w0
    public final boolean b() {
        return this.f17283f.b();
    }

    @Override // s.InterfaceC1946w0
    public final boolean c() {
        return ((Boolean) this.f17295r.getValue()).booleanValue();
    }

    @Override // s.InterfaceC1946w0
    public final float d(float f5) {
        return this.f17283f.d(f5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r8.e(r6, r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // s.InterfaceC1946w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(q.X r6, e4.n r7, S3.c r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof x.t
            if (r0 == 0) goto L13
            r0 = r8
            x.t r0 = (x.t) r0
            int r1 = r0.f17275p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17275p = r1
            goto L18
        L13:
            x.t r0 = new x.t
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f17273n
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f17275p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            P3.r.Y(r8)
            goto L63
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            e4.n r7 = r0.f17272m
            q.X r6 = r0.f17271l
            x.v r2 = r0.f17270k
            P3.r.Y(r8)
            goto L51
        L3c:
            P3.r.Y(r8)
            r0.f17270k = r5
            r0.f17271l = r6
            r0.f17272m = r7
            r0.f17275p = r4
            y.c r8 = r5.f17287j
            java.lang.Object r8 = r8.h(r0)
            if (r8 != r1) goto L50
            goto L62
        L50:
            r2 = r5
        L51:
            s.r r8 = r2.f17283f
            r2 = 0
            r0.f17270k = r2
            r0.f17271l = r2
            r0.f17272m = r2
            r0.f17275p = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L63
        L62:
            return r1
        L63:
            O3.C r6 = O3.C.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x.v.e(q.X, e4.n, S3.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void f(C2239m c2239m, boolean z7) {
        C2240n c2240n;
        int i7;
        C2240n c2240n2;
        this.f17282e -= c2239m.f17227d;
        this.f17280c.setValue(c2239m);
        int i8 = 0;
        o oVar = c2239m.a;
        this.f17296s.setValue(Boolean.valueOf(((oVar != null ? oVar.a : 0) == 0 && c2239m.f17225b == 0) ? false : true));
        this.f17295r.setValue(Boolean.valueOf(c2239m.f17226c));
        w.n nVar = this.f17279b;
        if (z7) {
            int i9 = c2239m.f17225b;
            if (i9 >= 0.0f) {
                nVar.f16772c.g(i9);
                return;
            }
            nVar.getClass();
            throw new IllegalStateException(("scrollOffset should be non-negative (" + i9 + ')').toString());
        }
        nVar.getClass();
        nVar.f16774e = (oVar == null || (c2240n2 = (C2240n) P3.m.i0(oVar.f17254b)) == null) ? null : c2240n2.f17238b;
        if (nVar.f16773d || c2239m.f17233j > 0) {
            nVar.f16773d = true;
            int i10 = c2239m.f17225b;
            if (i10 < 0.0f) {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + i10 + ')').toString());
            }
            nVar.a((oVar == null || (c2240n = (C2240n) P3.m.i0(oVar.f17254b)) == null) ? 0 : c2240n.a, i10);
        }
        if (this.f17284g) {
            O4.c cVar = this.a;
            if (cVar.f7552b != -1) {
                ?? r12 = c2239m.f17230g;
                if (r12.isEmpty()) {
                    return;
                }
                boolean z8 = cVar.a;
                EnumC1903a0 enumC1903a0 = EnumC1903a0.f15259k;
                EnumC1903a0 enumC1903a02 = c2239m.f17234k;
                if (z8) {
                    C2240n c2240n3 = (C2240n) P3.q.A0(r12);
                    i7 = (enumC1903a02 == enumC1903a0 ? c2240n3.f17252p : c2240n3.f17253q) + 1;
                } else {
                    C2240n c2240n4 = (C2240n) P3.q.r0(r12);
                    i7 = (enumC1903a02 == enumC1903a0 ? c2240n4.f17252p : c2240n4.f17253q) - 1;
                }
                if (cVar.f7552b != i7) {
                    cVar.f7552b = -1;
                    Q.d dVar = (Q.d) cVar.f7553c;
                    int i11 = dVar.f7829m;
                    if (i11 > 0) {
                        Object[] objArr = dVar.f7827k;
                        do {
                            ((InterfaceC2305E) objArr[i8]).cancel();
                            i8++;
                        } while (i8 < i11);
                    }
                    dVar.g();
                }
            }
        }
    }

    public final C2239m g() {
        return (C2239m) this.f17280c.getValue();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v6, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    public final void h(float f5, C2239m c2239m) {
        int i7;
        int i8;
        boolean z7;
        int i9;
        int i10;
        int i11;
        if (this.f17284g) {
            O4.c cVar = this.a;
            cVar.getClass();
            if (c2239m.f17230g.isEmpty()) {
                return;
            }
            boolean z8 = f5 < 0.0f;
            EnumC1903a0 enumC1903a0 = EnumC1903a0.f15259k;
            EnumC1903a0 enumC1903a02 = c2239m.f17234k;
            ?? r9 = c2239m.f17230g;
            if (z8) {
                C2240n c2240n = (C2240n) P3.q.A0(r9);
                i7 = (enumC1903a02 == enumC1903a0 ? c2240n.f17252p : c2240n.f17253q) + 1;
                i8 = ((C2240n) P3.q.A0(r9)).a + 1;
            } else {
                C2240n c2240n2 = (C2240n) P3.q.r0(r9);
                i7 = (enumC1903a02 == enumC1903a0 ? c2240n2.f17252p : c2240n2.f17253q) - 1;
                i8 = ((C2240n) P3.q.r0(r9)).a - 1;
            }
            if (i8 < 0 || i8 >= c2239m.f17233j) {
                return;
            }
            int i12 = cVar.f7552b;
            Q.d dVar = (Q.d) cVar.f7553c;
            if (i7 == i12 || i7 < 0) {
                z7 = z8;
            } else {
                if (cVar.a != z8 && (i11 = dVar.f7829m) > 0) {
                    Object[] objArr = dVar.f7827k;
                    int i13 = 0;
                    do {
                        ((InterfaceC2305E) objArr[i13]).cancel();
                        i13++;
                    } while (i13 < i11);
                }
                cVar.a = z8;
                cVar.f7552b = i7;
                dVar.g();
                p2.l lVar = this.f17291n;
                lVar.getClass();
                ArrayList arrayList = new ArrayList();
                v vVar = (v) lVar.f14298b;
                Y.h hVarC = Y.s.c();
                e4.k kVarF = hVarC != null ? hVarC.f() : null;
                Y.h hVarD = Y.s.d(hVarC);
                try {
                    List list = (List) ((C2239m) vVar.f17280c.getValue()).f17229f.invoke(Integer.valueOf(i7));
                    int size = list.size();
                    int i14 = 0;
                    while (i14 < size) {
                        O3.l lVar2 = (O3.l) list.get(i14);
                        boolean z9 = z8;
                        v vVar2 = vVar;
                        List list2 = list;
                        int i15 = i14;
                        arrayList.add(vVar.f17290m.a(((Number) lVar2.f7528k).intValue(), ((T0.a) lVar2.f7529l).a));
                        i14 = i15 + 1;
                        z8 = z9;
                        vVar = vVar2;
                        list = list2;
                    }
                    z7 = z8;
                    Y.s.f(hVarC, hVarD, kVarF);
                    dVar.d(dVar.f7829m, arrayList);
                } catch (Throwable th) {
                    Y.s.f(hVarC, hVarD, kVarF);
                    throw th;
                }
            }
            if (!z7) {
                if (c2239m.f17231h - AbstractC0870c.Z((C2240n) P3.q.r0(r9), enumC1903a02) >= f5 || (i9 = dVar.f7829m) <= 0) {
                    return;
                }
                Object[] objArr2 = dVar.f7827k;
                int i16 = 0;
                do {
                    ((InterfaceC2305E) objArr2[i16]).a();
                    i16++;
                } while (i16 < i9);
                return;
            }
            C2240n c2240n3 = (C2240n) P3.q.A0(r9);
            if (((AbstractC0870c.Z(c2240n3, enumC1903a02) + ((int) (enumC1903a02 == enumC1903a0 ? c2240n3.f17250n & 4294967295L : c2240n3.f17250n >> 32))) + c2239m.f17236m) - c2239m.f17232i >= (-f5) || (i10 = dVar.f7829m) <= 0) {
                return;
            }
            Object[] objArr3 = dVar.f7827k;
            int i17 = 0;
            do {
                ((InterfaceC2305E) objArr3[i17]).a();
                i17++;
            } while (i17 < i10);
        }
    }
}
