package V2;

import D.C0042b;
import H1.C0221b;
import H5.D;
import H5.v0;
import O3.C;
import O5.l;
import P3.F;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import w6.A;
import w6.AbstractC2217b;
import w6.C2219d;
import w6.J;
import w6.v;
import w6.y;
import z5.AbstractC2510o;
import z5.AbstractC2517v;
import z5.C2508m;

/* loaded from: classes.dex */
public final class g implements Closeable, Flushable {

    /* renamed from: A, reason: collision with root package name */
    public static final C2508m f9459A = new C2508m("[a-z0-9_-]{1,120}");

    /* renamed from: k, reason: collision with root package name */
    public final y f9460k;

    /* renamed from: l, reason: collision with root package name */
    public final long f9461l;

    /* renamed from: m, reason: collision with root package name */
    public final y f9462m;

    /* renamed from: n, reason: collision with root package name */
    public final y f9463n;

    /* renamed from: o, reason: collision with root package name */
    public final y f9464o;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashMap f9465p;

    /* renamed from: q, reason: collision with root package name */
    public final M5.c f9466q;

    /* renamed from: r, reason: collision with root package name */
    public long f9467r;

    /* renamed from: s, reason: collision with root package name */
    public int f9468s;

    /* renamed from: t, reason: collision with root package name */
    public A f9469t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9470u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9471v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9472w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9473x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9474y;

    /* renamed from: z, reason: collision with root package name */
    public final e f9475z;

    public g(long j7, O5.d dVar, v vVar, y yVar) {
        this.f9460k = yVar;
        this.f9461l = j7;
        if (j7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f9462m = yVar.d("journal");
        this.f9463n = yVar.d("journal.tmp");
        this.f9464o = yVar.d("journal.bkp");
        this.f9465p = new LinkedHashMap(0, 0.75f, true);
        v0 v0VarE = D.e();
        dVar.getClass();
        this.f9466q = D.c(F.M(v0VarE, l.f7635l.Z(1)));
        this.f9475z = new e(vVar);
    }

    public static void L(String str) {
        if (!f9459A.b(str)) {
            throw new IllegalArgumentException(A6.b.d('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0119 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:15:0x0030, B:23:0x003e, B:25:0x0056, B:29:0x0073, B:31:0x0081, B:33:0x0088, B:26:0x005c, B:28:0x006c, B:37:0x00a8, B:39:0x00af, B:42:0x00b4, B:44:0x00c5, B:47:0x00ca, B:52:0x0105, B:54:0x0110, B:58:0x0119, B:48:0x00e2, B:50:0x00f7, B:51:0x0102, B:36:0x0098, B:61:0x011e, B:62:0x0125), top: B:65:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(V2.g r9, H1.C0221b r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V2.g.b(V2.g, H1.b, boolean):void");
    }

    public final void H(c cVar) {
        A a;
        int i7 = cVar.f9452h;
        String str = cVar.a;
        if (i7 > 0 && (a = this.f9469t) != null) {
            a.R("DIRTY");
            a.A(32);
            a.R(str);
            a.A(10);
            a.flush();
        }
        if (cVar.f9452h > 0 || cVar.f9451g != null) {
            cVar.f9450f = true;
            return;
        }
        for (int i8 = 0; i8 < 2; i8++) {
            this.f9475z.e((y) cVar.f9447c.get(i8));
            long j7 = this.f9467r;
            long[] jArr = cVar.f9446b;
            this.f9467r = j7 - jArr[i8];
            jArr[i8] = 0;
        }
        this.f9468s++;
        A a7 = this.f9469t;
        if (a7 != null) {
            a7.R("REMOVE");
            a7.A(32);
            a7.R(str);
            a7.A(10);
        }
        this.f9465p.remove(str);
        if (this.f9468s >= 2000) {
            j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        H(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f9467r
            long r2 = r4.f9461l
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f9465p
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            V2.c r1 = (V2.c) r1
            boolean r2 = r1.f9450f
            if (r2 != 0) goto L12
            r4.H(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f9473x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V2.g.J():void");
    }

    public final synchronized void O() {
        C c2;
        try {
            A a = this.f9469t;
            if (a != null) {
                a.close();
            }
            A aB = AbstractC2217b.b(this.f9475z.v(this.f9463n));
            Throwable th = null;
            try {
                aB.R("libcore.io.DiskLruCache");
                aB.A(10);
                aB.R("1");
                aB.A(10);
                aB.S(1);
                aB.A(10);
                aB.S(2);
                aB.A(10);
                aB.A(10);
                for (c cVar : this.f9465p.values()) {
                    if (cVar.f9451g != null) {
                        aB.R("DIRTY");
                        aB.A(32);
                        aB.R(cVar.a);
                        aB.A(10);
                    } else {
                        aB.R("CLEAN");
                        aB.A(32);
                        aB.R(cVar.a);
                        for (long j7 : cVar.f9446b) {
                            aB.A(32);
                            aB.S(j7);
                        }
                        aB.A(10);
                    }
                }
                c2 = C.a;
                try {
                    aB.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    aB.close();
                } catch (Throwable th4) {
                    q0.c.j(th3, th4);
                }
                c2 = null;
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            kotlin.jvm.internal.l.c(c2);
            if (this.f9475z.g(this.f9462m)) {
                this.f9475z.H(this.f9462m, this.f9464o);
                this.f9475z.H(this.f9463n, this.f9462m);
                this.f9475z.e(this.f9464o);
            } else {
                this.f9475z.H(this.f9463n, this.f9462m);
            }
            this.f9469t = m();
            this.f9468s = 0;
            this.f9470u = false;
            this.f9474y = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f9471v && !this.f9472w) {
                for (c cVar : (c[]) this.f9465p.values().toArray(new c[0])) {
                    C0221b c0221b = cVar.f9451g;
                    if (c0221b != null) {
                        c cVar2 = (c) c0221b.f3405l;
                        if (kotlin.jvm.internal.l.a(cVar2.f9451g, c0221b)) {
                            cVar2.f9450f = true;
                        }
                    }
                }
                J();
                D.h(this.f9466q, null);
                A a = this.f9469t;
                kotlin.jvm.internal.l.c(a);
                a.close();
                this.f9469t = null;
                this.f9472w = true;
                return;
            }
            this.f9472w = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized C0221b e(String str) {
        try {
            if (this.f9472w) {
                throw new IllegalStateException("cache is closed");
            }
            L(str);
            i();
            c cVar = (c) this.f9465p.get(str);
            if ((cVar != null ? cVar.f9451g : null) != null) {
                return null;
            }
            if (cVar != null && cVar.f9452h != 0) {
                return null;
            }
            if (!this.f9473x && !this.f9474y) {
                A a = this.f9469t;
                kotlin.jvm.internal.l.c(a);
                a.R("DIRTY");
                a.A(32);
                a.R(str);
                a.A(10);
                a.flush();
                if (this.f9470u) {
                    return null;
                }
                if (cVar == null) {
                    cVar = new c(this, str);
                    this.f9465p.put(str, cVar);
                }
                C0221b c0221b = new C0221b(this, cVar);
                cVar.f9451g = c0221b;
                return c0221b;
            }
            j();
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f9471v) {
            if (this.f9472w) {
                throw new IllegalStateException("cache is closed");
            }
            J();
            A a = this.f9469t;
            kotlin.jvm.internal.l.c(a);
            a.flush();
        }
    }

    public final synchronized d g(String str) {
        d dVarA;
        if (this.f9472w) {
            throw new IllegalStateException("cache is closed");
        }
        L(str);
        i();
        c cVar = (c) this.f9465p.get(str);
        if (cVar != null && (dVarA = cVar.a()) != null) {
            boolean z7 = true;
            this.f9468s++;
            A a = this.f9469t;
            kotlin.jvm.internal.l.c(a);
            a.R("READ");
            a.A(32);
            a.R(str);
            a.A(10);
            if (this.f9468s < 2000) {
                z7 = false;
            }
            if (z7) {
                j();
            }
            return dVarA;
        }
        return null;
    }

    public final synchronized void i() {
        try {
            if (this.f9471v) {
                return;
            }
            this.f9475z.e(this.f9463n);
            if (this.f9475z.g(this.f9464o)) {
                if (this.f9475z.g(this.f9462m)) {
                    this.f9475z.e(this.f9464o);
                } else {
                    this.f9475z.H(this.f9464o, this.f9462m);
                }
            }
            if (this.f9475z.g(this.f9462m)) {
                try {
                    v();
                    s();
                    this.f9471v = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        e3.c.u(this.f9475z, this.f9460k);
                        this.f9472w = false;
                    } catch (Throwable th) {
                        this.f9472w = false;
                        throw th;
                    }
                }
            }
            O();
            this.f9471v = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void j() {
        D.x(this.f9466q, null, new f(this, null), 3);
    }

    public final A m() {
        e eVar = this.f9475z;
        eVar.getClass();
        y yVar = this.f9462m;
        kotlin.jvm.internal.l.f("file", yVar);
        eVar.getClass();
        kotlin.jvm.internal.l.f("file", yVar);
        eVar.f9457l.getClass();
        return AbstractC2217b.b(new h(new C2219d(1, new FileOutputStream(yVar.e(), true), new J()), new C0042b(19, this)));
    }

    public final void s() {
        Iterator it = this.f9465p.values().iterator();
        long j7 = 0;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            int i7 = 0;
            if (cVar.f9451g == null) {
                while (i7 < 2) {
                    j7 += cVar.f9446b[i7];
                    i7++;
                }
            } else {
                cVar.f9451g = null;
                while (i7 < 2) {
                    y yVar = (y) cVar.f9447c.get(i7);
                    e eVar = this.f9475z;
                    eVar.e(yVar);
                    eVar.e((y) cVar.f9448d.get(i7));
                    i7++;
                }
                it.remove();
            }
        }
        this.f9467r = j7;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v() throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            V2.e r2 = r13.f9475z
            w6.y r3 = r13.f9462m
            w6.H r2 = r2.x(r3)
            w6.C r2 = w6.AbstractC2217b.c(r2)
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = 0
            java.lang.String r6 = r2.s(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r7 = r2.s(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r8 = r2.s(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r9 = r2.s(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r10 = r2.s(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r11 = "libcore.io.DiskLruCache"
            boolean r11 = r11.equals(r6)     // Catch: java.lang.Throwable -> L61
            if (r11 == 0) goto L84
            java.lang.String r11 = "1"
            boolean r11 = r11.equals(r7)     // Catch: java.lang.Throwable -> L61
            if (r11 == 0) goto L84
            r11 = 1
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L61
            boolean r11 = kotlin.jvm.internal.l.a(r11, r8)     // Catch: java.lang.Throwable -> L61
            if (r11 == 0) goto L84
            r11 = 2
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L61
            boolean r11 = kotlin.jvm.internal.l.a(r11, r9)     // Catch: java.lang.Throwable -> L61
            if (r11 == 0) goto L84
            int r11 = r10.length()     // Catch: java.lang.Throwable -> L61
            if (r11 > 0) goto L84
            r0 = 0
        L57:
            java.lang.String r1 = r2.s(r3)     // Catch: java.lang.Throwable -> L61 java.io.EOFException -> L63
            r13.x(r1)     // Catch: java.lang.Throwable -> L61 java.io.EOFException -> L63
            int r0 = r0 + 1
            goto L57
        L61:
            r0 = move-exception
            goto Lb3
        L63:
            java.util.LinkedHashMap r1 = r13.f9465p     // Catch: java.lang.Throwable -> L61
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L61
            int r0 = r0 - r1
            r13.f9468s = r0     // Catch: java.lang.Throwable -> L61
            boolean r0 = r2.z()     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L76
            r13.O()     // Catch: java.lang.Throwable -> L61
            goto L7c
        L76:
            w6.A r0 = r13.m()     // Catch: java.lang.Throwable -> L61
            r13.f9469t = r0     // Catch: java.lang.Throwable -> L61
        L7c:
            O3.C r0 = O3.C.a     // Catch: java.lang.Throwable -> L61
            r2.close()     // Catch: java.lang.Throwable -> L82
            goto Lbe
        L82:
            r5 = move-exception
            goto Lbe
        L84:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L61
            r4.append(r6)     // Catch: java.lang.Throwable -> L61
            r4.append(r0)     // Catch: java.lang.Throwable -> L61
            r4.append(r7)     // Catch: java.lang.Throwable -> L61
            r4.append(r0)     // Catch: java.lang.Throwable -> L61
            r4.append(r8)     // Catch: java.lang.Throwable -> L61
            r4.append(r0)     // Catch: java.lang.Throwable -> L61
            r4.append(r9)     // Catch: java.lang.Throwable -> L61
            r4.append(r0)     // Catch: java.lang.Throwable -> L61
            r4.append(r10)     // Catch: java.lang.Throwable -> L61
            r0 = 93
            r4.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L61
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L61
            throw r3     // Catch: java.lang.Throwable -> L61
        Lb3:
            r2.close()     // Catch: java.lang.Throwable -> Lb7
            goto Lbb
        Lb7:
            r1 = move-exception
            q0.c.j(r0, r1)
        Lbb:
            r12 = r5
            r5 = r0
            r0 = r12
        Lbe:
            if (r5 != 0) goto Lc4
            kotlin.jvm.internal.l.c(r0)
            return
        Lc4:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: V2.g.v():void");
    }

    public final void x(String str) throws IOException {
        String strSubstring;
        int iD0 = AbstractC2510o.d0(str, ' ', 0, 6);
        if (iD0 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i7 = iD0 + 1;
        int iD02 = AbstractC2510o.d0(str, ' ', i7, 4);
        LinkedHashMap linkedHashMap = this.f9465p;
        if (iD02 == -1) {
            strSubstring = str.substring(i7);
            kotlin.jvm.internal.l.e("substring(...)", strSubstring);
            if (iD0 == 6 && AbstractC2517v.T(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i7, iD02);
            kotlin.jvm.internal.l.e("substring(...)", strSubstring);
        }
        Object cVar = linkedHashMap.get(strSubstring);
        if (cVar == null) {
            cVar = new c(this, strSubstring);
            linkedHashMap.put(strSubstring, cVar);
        }
        c cVar2 = (c) cVar;
        if (iD02 == -1 || iD0 != 5 || !AbstractC2517v.T(str, "CLEAN", false)) {
            if (iD02 == -1 && iD0 == 5 && AbstractC2517v.T(str, "DIRTY", false)) {
                cVar2.f9451g = new C0221b(this, cVar2);
                return;
            } else {
                if (iD02 != -1 || iD0 != 4 || !AbstractC2517v.T(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String strSubstring2 = str.substring(iD02 + 1);
        kotlin.jvm.internal.l.e("substring(...)", strSubstring2);
        List listV0 = AbstractC2510o.v0(strSubstring2, new char[]{' '});
        cVar2.f9449e = true;
        cVar2.f9451g = null;
        int size = listV0.size();
        cVar2.f9453i.getClass();
        if (size != 2) {
            throw new IOException("unexpected journal line: " + listV0);
        }
        try {
            int size2 = listV0.size();
            for (int i8 = 0; i8 < size2; i8++) {
                cVar2.f9446b[i8] = Long.parseLong((String) listV0.get(i8));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listV0);
        }
    }
}
