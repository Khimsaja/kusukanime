package O1;

import B1.AbstractC0015b;
import H1.m0;
import io.ktor.sse.ServerSentEventKt;
import j3.AbstractC1331q;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import y1.C2392n;
import y1.C2393o;

/* loaded from: classes.dex */
public final class J implements InterfaceC0551z, InterfaceC0550y {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0551z[] f7271k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean[] f7272l;

    /* renamed from: m, reason: collision with root package name */
    public final IdentityHashMap f7273m;

    /* renamed from: n, reason: collision with root package name */
    public final A.e f7274n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f7275o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f7276p = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0550y f7277q;

    /* renamed from: r, reason: collision with root package name */
    public g0 f7278r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0551z[] f7279s;

    /* renamed from: t, reason: collision with root package name */
    public C0539m f7280t;

    public J(A.e eVar, long[] jArr, InterfaceC0551z... interfaceC0551zArr) {
        this.f7274n = eVar;
        this.f7271k = interfaceC0551zArr;
        eVar.getClass();
        j3.E e7 = j3.G.f12277l;
        j3.X x7 = j3.X.f12304o;
        this.f7280t = new C0539m(x7, x7);
        this.f7273m = new IdentityHashMap();
        this.f7279s = new InterfaceC0551z[0];
        this.f7272l = new boolean[interfaceC0551zArr.length];
        for (int i7 = 0; i7 < interfaceC0551zArr.length; i7++) {
            long j7 = jArr[i7];
            if (j7 != 0) {
                this.f7272l[i7] = true;
                this.f7271k[i7] = new f0(interfaceC0551zArr[i7], j7);
            }
        }
    }

    @Override // O1.b0
    public final boolean a() {
        return this.f7280t.a();
    }

    @Override // O1.InterfaceC0550y
    public final void b(InterfaceC0551z interfaceC0551z) {
        ArrayList arrayList = this.f7275o;
        arrayList.remove(interfaceC0551z);
        if (arrayList.isEmpty()) {
            InterfaceC0551z[] interfaceC0551zArr = this.f7271k;
            int i7 = 0;
            for (InterfaceC0551z interfaceC0551z2 : interfaceC0551zArr) {
                i7 += interfaceC0551z2.j().a;
            }
            y1.Q[] qArr = new y1.Q[i7];
            int i8 = 0;
            for (int i9 = 0; i9 < interfaceC0551zArr.length; i9++) {
                g0 g0VarJ = interfaceC0551zArr[i9].j();
                int i10 = g0VarJ.a;
                int i11 = 0;
                while (i11 < i10) {
                    y1.Q qA = g0VarJ.a(i11);
                    int i12 = qA.a;
                    C2393o[] c2393oArr = new C2393o[i12];
                    for (int i13 = 0; i13 < i12; i13++) {
                        C2393o c2393o = qA.f17971d[i13];
                        C2392n c2392nA = c2393o.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i9);
                        sb.append(ServerSentEventKt.COLON);
                        String str = c2393o.a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        c2392nA.a = sb.toString();
                        c2393oArr[i13] = new C2393o(c2392nA);
                    }
                    y1.Q q6 = new y1.Q(i9 + ServerSentEventKt.COLON + qA.f17969b, c2393oArr);
                    this.f7276p.put(q6, qA);
                    qArr[i8] = q6;
                    i11++;
                    i8++;
                }
            }
            this.f7278r = new g0(qArr);
            InterfaceC0550y interfaceC0550y = this.f7277q;
            interfaceC0550y.getClass();
            interfaceC0550y.b(this);
        }
    }

    @Override // O1.InterfaceC0550y
    public final void c(b0 b0Var) {
        InterfaceC0550y interfaceC0550y = this.f7277q;
        interfaceC0550y.getClass();
        interfaceC0550y.c(this);
    }

    @Override // O1.InterfaceC0551z
    public final long d(Q1.s[] sVarArr, boolean[] zArr, a0[] a0VarArr, boolean[] zArr2, long j7) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[sVarArr.length];
        int[] iArr3 = new int[sVarArr.length];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int length = sVarArr.length;
            identityHashMap = this.f7273m;
            if (i8 >= length) {
                break;
            }
            a0 a0Var = a0VarArr[i8];
            Integer num = a0Var == null ? null : (Integer) identityHashMap.get(a0Var);
            iArr2[i8] = num == null ? -1 : num.intValue();
            Q1.s sVar = sVarArr[i8];
            if (sVar != null) {
                String str = sVar.g().f17969b;
                iArr3[i8] = Integer.parseInt(str.substring(0, str.indexOf(ServerSentEventKt.COLON)));
            } else {
                iArr3[i8] = -1;
            }
            i8++;
        }
        identityHashMap.clear();
        int length2 = sVarArr.length;
        a0[] a0VarArr2 = new a0[length2];
        a0[] a0VarArr3 = new a0[sVarArr.length];
        Q1.s[] sVarArr2 = new Q1.s[sVarArr.length];
        InterfaceC0551z[] interfaceC0551zArr = this.f7271k;
        ArrayList arrayList = new ArrayList(interfaceC0551zArr.length);
        long j8 = j7;
        int i9 = 0;
        while (i9 < interfaceC0551zArr.length) {
            int i10 = i7;
            while (i10 < sVarArr.length) {
                a0VarArr3[i10] = iArr2[i10] == i9 ? a0VarArr[i10] : null;
                if (iArr3[i10] == i9) {
                    Q1.s sVar2 = sVarArr[i10];
                    sVar2.getClass();
                    iArr = iArr2;
                    y1.Q q6 = (y1.Q) this.f7276p.get(sVar2.g());
                    q6.getClass();
                    sVarArr2[i10] = new I(sVar2, q6);
                } else {
                    iArr = iArr2;
                    sVarArr2[i10] = null;
                }
                i10++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            InterfaceC0551z[] interfaceC0551zArr2 = interfaceC0551zArr;
            int i11 = i9;
            long jD = interfaceC0551zArr2[i9].d(sVarArr2, zArr, a0VarArr3, zArr2, j8);
            if (i11 == 0) {
                j8 = jD;
            } else if (jD != j8) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z7 = false;
            for (int i12 = 0; i12 < sVarArr.length; i12++) {
                if (iArr3[i12] == i11) {
                    a0 a0Var2 = a0VarArr3[i12];
                    a0Var2.getClass();
                    a0VarArr2[i12] = a0VarArr3[i12];
                    identityHashMap.put(a0Var2, Integer.valueOf(i11));
                    z7 = true;
                } else if (iArr4[i12] == i11) {
                    AbstractC0015b.h(a0VarArr3[i12] == null);
                }
            }
            if (z7) {
                arrayList.add(interfaceC0551zArr2[i11]);
            }
            i9 = i11 + 1;
            interfaceC0551zArr = interfaceC0551zArr2;
            iArr2 = iArr4;
            i7 = 0;
        }
        int i13 = i7;
        System.arraycopy(a0VarArr2, i13, a0VarArr, i13, length2);
        this.f7279s = (InterfaceC0551z[]) arrayList.toArray(new InterfaceC0551z[i13]);
        AbstractList abstractListR = AbstractC1331q.r(arrayList, new I1.e(7));
        this.f7274n.getClass();
        this.f7280t = new C0539m(arrayList, abstractListR);
        return j8;
    }

    @Override // O1.b0
    public final boolean e(H1.O o7) {
        ArrayList arrayList = this.f7275o;
        if (arrayList.isEmpty()) {
            return this.f7280t.e(o7);
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((InterfaceC0551z) arrayList.get(i7)).e(o7);
        }
        return false;
    }

    @Override // O1.b0
    public final long f() {
        return this.f7280t.f();
    }

    @Override // O1.InterfaceC0551z
    public final long g() {
        long j7 = -9223372036854775807L;
        for (InterfaceC0551z interfaceC0551z : this.f7279s) {
            long jG = interfaceC0551z.g();
            if (jG == -9223372036854775807L) {
                if (j7 != -9223372036854775807L && interfaceC0551z.q(j7) != j7) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j7 == -9223372036854775807L) {
                for (InterfaceC0551z interfaceC0551z2 : this.f7279s) {
                    if (interfaceC0551z2 == interfaceC0551z) {
                        break;
                    }
                    if (interfaceC0551z2.q(jG) != jG) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j7 = jG;
            } else if (jG != j7) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j7;
    }

    @Override // O1.InterfaceC0551z
    public final void i(InterfaceC0550y interfaceC0550y, long j7) {
        this.f7277q = interfaceC0550y;
        ArrayList arrayList = this.f7275o;
        InterfaceC0551z[] interfaceC0551zArr = this.f7271k;
        Collections.addAll(arrayList, interfaceC0551zArr);
        for (InterfaceC0551z interfaceC0551z : interfaceC0551zArr) {
            interfaceC0551z.i(this, j7);
        }
    }

    @Override // O1.InterfaceC0551z
    public final g0 j() {
        g0 g0Var = this.f7278r;
        g0Var.getClass();
        return g0Var;
    }

    @Override // O1.b0
    public final long n() {
        return this.f7280t.n();
    }

    @Override // O1.InterfaceC0551z
    public final void o() {
        for (InterfaceC0551z interfaceC0551z : this.f7271k) {
            interfaceC0551z.o();
        }
    }

    @Override // O1.InterfaceC0551z
    public final long q(long j7) {
        long jQ = this.f7279s[0].q(j7);
        int i7 = 1;
        while (true) {
            InterfaceC0551z[] interfaceC0551zArr = this.f7279s;
            if (i7 >= interfaceC0551zArr.length) {
                return jQ;
            }
            if (interfaceC0551zArr[i7].q(jQ) != jQ) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i7++;
        }
    }

    @Override // O1.InterfaceC0551z
    public final void r(long j7) {
        for (InterfaceC0551z interfaceC0551z : this.f7279s) {
            interfaceC0551z.r(j7);
        }
    }

    @Override // O1.InterfaceC0551z
    public final long s(long j7, m0 m0Var) {
        InterfaceC0551z[] interfaceC0551zArr = this.f7279s;
        return (interfaceC0551zArr.length > 0 ? interfaceC0551zArr[0] : this.f7271k[0]).s(j7, m0Var);
    }

    @Override // O1.b0
    public final void t(long j7) {
        this.f7280t.t(j7);
    }
}
