package H1;

import B1.AbstractC0015b;
import y1.C2393o;

/* loaded from: classes.dex */
public final class l0 {
    public final AbstractC0225f a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3535b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0225f f3536c;

    /* renamed from: d, reason: collision with root package name */
    public int f3537d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3538e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3539f = false;

    public l0(AbstractC0225f abstractC0225f, AbstractC0225f abstractC0225f2, int i7) {
        this.a = abstractC0225f;
        this.f3535b = i7;
        this.f3536c = abstractC0225f2;
    }

    public static void b(AbstractC0225f abstractC0225f) {
        int i7 = abstractC0225f.f3463r;
        if (i7 == 2) {
            AbstractC0015b.h(i7 == 2);
            abstractC0225f.f3463r = 1;
            abstractC0225f.u();
        }
    }

    public static boolean h(AbstractC0225f abstractC0225f) {
        return abstractC0225f.f3463r != 0;
    }

    public static void m(AbstractC0225f abstractC0225f, long j7) {
        abstractC0225f.f3469x = true;
        if (abstractC0225f instanceof P1.d) {
            P1.d dVar = (P1.d) abstractC0225f;
            AbstractC0015b.h(dVar.f3469x);
            dVar.f7735T = j7;
        }
    }

    public final void a(AbstractC0225f abstractC0225f, C0231l c0231l) {
        AbstractC0015b.h(this.a == abstractC0225f || this.f3536c == abstractC0225f);
        if (h(abstractC0225f)) {
            if (abstractC0225f == ((AbstractC0225f) c0231l.f3533o)) {
                c0231l.f3534p = null;
                c0231l.f3533o = null;
                c0231l.f3529k = true;
            }
            b(abstractC0225f);
            AbstractC0015b.h(abstractC0225f.f3463r == 1);
            abstractC0225f.f3458m.r();
            abstractC0225f.f3463r = 0;
            abstractC0225f.f3464s = null;
            abstractC0225f.f3465t = null;
            abstractC0225f.f3469x = false;
            abstractC0225f.o();
        }
    }

    public final int c() {
        boolean zH = h(this.a);
        AbstractC0225f abstractC0225f = this.f3536c;
        return (zH ? 1 : 0) + ((abstractC0225f == null || !h(abstractC0225f)) ? 0 : 1);
    }

    public final AbstractC0225f d(Q q6) {
        O1.a0 a0Var;
        if (q6 != null && (a0Var = q6.f3344c[this.f3535b]) != null) {
            AbstractC0225f abstractC0225f = this.a;
            if (abstractC0225f.f3464s == a0Var) {
                return abstractC0225f;
            }
            AbstractC0225f abstractC0225f2 = this.f3536c;
            if (abstractC0225f2 != null && abstractC0225f2.f3464s == a0Var) {
                return abstractC0225f2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(H1.Q r8, H1.AbstractC0225f r9) {
        /*
            r7 = this;
            r0 = 1
            if (r9 != 0) goto L4
            goto L49
        L4:
            O1.a0[] r1 = r8.f3344c
            int r2 = r7.f3535b
            r1 = r1[r2]
            O1.a0 r3 = r9.f3464s
            if (r3 == 0) goto L49
            if (r3 != r1) goto L3a
            if (r1 == 0) goto L49
            boolean r1 = r9.k()
            if (r1 != 0) goto L49
            H1.Q r1 = r8.f3354m
            H1.S r3 = r8.f3348g
            boolean r3 = r3.f3363g
            if (r3 == 0) goto L3a
            if (r1 == 0) goto L3a
            boolean r3 = r1.f3346e
            if (r3 == 0) goto L3a
            boolean r3 = r9 instanceof P1.d
            if (r3 != 0) goto L39
            boolean r3 = r9 instanceof N1.b
            if (r3 != 0) goto L39
            long r3 = r9.f3468w
            long r5 = r1.e()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L3a
            goto L49
        L39:
            return r0
        L3a:
            H1.Q r8 = r8.f3354m
            if (r8 == 0) goto L47
            O1.a0[] r8 = r8.f3344c
            r8 = r8[r2]
            O1.a0 r9 = r9.f3464s
            if (r8 != r9) goto L47
            goto L49
        L47:
            r8 = 0
            return r8
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.l0.e(H1.Q, H1.f):boolean");
    }

    public final boolean f() {
        int i7 = this.f3537d;
        return i7 == 2 || i7 == 4 || i7 == 3;
    }

    public final boolean g() {
        int i7 = this.f3537d;
        if (i7 == 0 || i7 == 2 || i7 == 4) {
            return h(this.a);
        }
        AbstractC0225f abstractC0225f = this.f3536c;
        abstractC0225f.getClass();
        return abstractC0225f.f3463r != 0;
    }

    public final boolean i(int i7) {
        int i8 = this.f3537d;
        boolean z7 = i8 == 2 || i8 == 4;
        int i9 = this.f3535b;
        return (z7 && i7 == i9) || (i8 == 3 && i7 != i9);
    }

    public final void j(boolean z7) {
        if (z7) {
            if (this.f3538e) {
                AbstractC0225f abstractC0225f = this.a;
                AbstractC0015b.h(abstractC0225f.f3463r == 0);
                abstractC0225f.f3458m.r();
                abstractC0225f.s();
                this.f3538e = false;
                return;
            }
            return;
        }
        if (this.f3539f) {
            AbstractC0225f abstractC0225f2 = this.f3536c;
            abstractC0225f2.getClass();
            AbstractC0015b.h(abstractC0225f2.f3463r == 0);
            abstractC0225f2.f3458m.r();
            abstractC0225f2.s();
            this.f3539f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int k(AbstractC0225f abstractC0225f, Q q6, Q1.u uVar, C0231l c0231l) {
        AbstractC0225f abstractC0225f2;
        int i7;
        if (abstractC0225f == null || abstractC0225f.f3463r == 0 || (abstractC0225f == (abstractC0225f2 = this.a) && ((i7 = this.f3537d) == 2 || i7 == 4))) {
            return 1;
        }
        if (abstractC0225f == this.f3536c && this.f3537d == 3) {
            return 1;
        }
        O1.a0 a0Var = abstractC0225f.f3464s;
        O1.a0[] a0VarArr = q6.f3344c;
        int i8 = this.f3535b;
        Object[] objArr = a0Var != a0VarArr[i8];
        boolean zB = uVar.b(i8);
        if (!zB || objArr != false) {
            if (!abstractC0225f.f3469x) {
                Q1.s sVar = uVar.f7941c[i8];
                int length = sVar != null ? sVar.length() : 0;
                C2393o[] c2393oArr = new C2393o[length];
                for (int i9 = 0; i9 < length; i9++) {
                    sVar.getClass();
                    c2393oArr[i9] = sVar.b(i9);
                }
                O1.a0 a0Var2 = q6.f3344c[i8];
                a0Var2.getClass();
                abstractC0225f.y(c2393oArr, a0Var2, q6.e(), q6.f3357p, q6.f3348g.a);
                return 3;
            }
            if (!abstractC0225f.l()) {
                return 0;
            }
            a(abstractC0225f, c0231l);
            if (!zB || f()) {
                j(abstractC0225f == abstractC0225f2);
                return 1;
            }
        }
        return 1;
    }

    public final void l() {
        if (!h(this.a)) {
            j(true);
        }
        AbstractC0225f abstractC0225f = this.f3536c;
        if (abstractC0225f == null || abstractC0225f.f3463r != 0) {
            return;
        }
        j(false);
    }

    public final void n() {
        int i7;
        AbstractC0225f abstractC0225f = this.a;
        int i8 = abstractC0225f.f3463r;
        if (i8 == 1 && this.f3537d != 4) {
            AbstractC0015b.h(i8 == 1);
            abstractC0225f.f3463r = 2;
            abstractC0225f.t();
            return;
        }
        AbstractC0225f abstractC0225f2 = this.f3536c;
        if (abstractC0225f2 == null || (i7 = abstractC0225f2.f3463r) != 1 || this.f3537d == 3) {
            return;
        }
        AbstractC0015b.h(i7 == 1);
        abstractC0225f2.f3463r = 2;
        abstractC0225f2.t();
    }
}
