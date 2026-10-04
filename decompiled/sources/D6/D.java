package D6;

import b1.AbstractC0703b;
import f6.AbstractC0893G;
import f6.AbstractC0897K;
import f6.C0887A;
import f6.C0889C;
import f6.C0890D;
import f6.C0894H;
import f6.C0895I;
import f6.C0917o;
import f6.C0921s;
import f6.C0922t;
import f6.C0925w;
import f6.C0927y;
import f6.InterfaceC0907e;
import f6.InterfaceC0908f;
import java.io.IOException;
import java.util.ArrayList;
import w6.C2224i;

/* loaded from: classes.dex */
public final class D implements InterfaceC0111e {

    /* renamed from: k, reason: collision with root package name */
    public final U f1644k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f1645l;

    /* renamed from: m, reason: collision with root package name */
    public final Object[] f1646m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0907e f1647n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0120n f1648o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f1649p;

    /* renamed from: q, reason: collision with root package name */
    public j6.i f1650q;

    /* renamed from: r, reason: collision with root package name */
    public Throwable f1651r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1652s;

    public D(U u5, Object obj, Object[] objArr, InterfaceC0907e interfaceC0907e, InterfaceC0120n interfaceC0120n) {
        this.f1644k = u5;
        this.f1645l = obj;
        this.f1646m = objArr;
        this.f1647n = interfaceC0907e;
        this.f1648o = interfaceC0120n;
    }

    public final j6.i a() {
        C0922t c0922tA;
        U u5 = this.f1644k;
        Object[] objArr = this.f1646m;
        int length = objArr.length;
        c0[] c0VarArr = u5.f1731j;
        if (length != c0VarArr.length) {
            StringBuilder sbP = AbstractC0703b.p(length, "Argument count (", ") doesn't match expected count (");
            sbP.append(c0VarArr.length);
            sbP.append(")");
            throw new IllegalArgumentException(sbP.toString());
        }
        S s7 = new S(u5.f1724c, u5.f1723b, u5.f1725d, u5.f1726e, u5.f1727f, u5.f1728g, u5.f1729h, u5.f1730i);
        if (u5.f1732k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i7 = 0; i7 < length; i7++) {
            arrayList.add(objArr[i7]);
            c0VarArr[i7].a(s7, objArr[i7]);
        }
        C0921s c0921s = s7.f1691d;
        if (c0921s != null) {
            c0922tA = c0921s.a();
        } else {
            String str = s7.f1690c;
            C0922t c0922t = s7.f1689b;
            c0922t.getClass();
            kotlin.jvm.internal.l.f("link", str);
            C0921s c0921sF = c0922t.f(str);
            c0922tA = c0921sF != null ? c0921sF.a() : null;
            if (c0922tA == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + c0922t + ", Relative: " + s7.f1690c);
            }
        }
        AbstractC0893G q6 = s7.f1698k;
        if (q6 == null) {
            D4.T t7 = s7.f1697j;
            if (t7 != null) {
                q6 = new C0917o(t7.a, t7.f1531b);
            } else {
                B2.l lVar = s7.f1696i;
                if (lVar != null) {
                    ArrayList arrayList2 = (ArrayList) lVar.f418n;
                    if (arrayList2.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    q6 = new C0927y((w6.l) lVar.f416l, (C0925w) lVar.f417m, g6.b.w(arrayList2));
                } else if (s7.f1695h) {
                    q6 = AbstractC0893G.create((C0925w) null, new byte[0]);
                }
            }
        }
        C0925w c0925w = s7.f1694g;
        D4.S s8 = s7.f1693f;
        if (c0925w != null) {
            if (q6 != null) {
                q6 = new Q(q6, c0925w);
            } else {
                s8.h("Content-Type", c0925w.a);
            }
        }
        C0889C c0889c = s7.f1692e;
        c0889c.getClass();
        c0889c.a = c0922tA;
        c0889c.f11472c = s8.l().j();
        c0889c.d(s7.a, q6);
        c0889c.e(C0127v.class, new C0127v(this.f1645l, u5.a, arrayList));
        return ((C0887A) this.f1647n).b(c0889c.a());
    }

    public final InterfaceC0908f b() throws IOException {
        j6.i iVar = this.f1650q;
        if (iVar != null) {
            return iVar;
        }
        Throwable th = this.f1651r;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            j6.i iVarA = a();
            this.f1650q = iVarA;
            return iVarA;
        } catch (IOException | Error | RuntimeException e7) {
            c0.s(e7);
            this.f1651r = e7;
            throw e7;
        }
    }

    public final V c(C0895I c0895i) throws IOException {
        C0894H c0894hG = c0895i.g();
        AbstractC0897K abstractC0897K = c0895i.f11501q;
        c0894hG.f11488g = new C(abstractC0897K.e(), abstractC0897K.b());
        C0895I c0895iA = c0894hG.a();
        int i7 = c0895iA.f11498n;
        if (i7 < 200 || i7 >= 300) {
            try {
                abstractC0897K.g().y(new C2224i());
                abstractC0897K.e();
                abstractC0897K.b();
                if (c0895iA.e()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new V(c0895iA, null);
            } finally {
                abstractC0897K.close();
            }
        }
        if (i7 == 204 || i7 == 205) {
            abstractC0897K.close();
            if (c0895iA.e()) {
                return new V(c0895iA, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        B b4 = new B(abstractC0897K);
        try {
            Object objA = this.f1648o.a(b4);
            if (c0895iA.e()) {
                return new V(c0895iA, objA);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e7) {
            IOException iOException = b4.f1641m;
            if (iOException == null) {
                throw e7;
            }
            throw iOException;
        }
    }

    @Override // D6.InterfaceC0111e
    public final void cancel() {
        j6.i iVar;
        this.f1649p = true;
        synchronized (this) {
            iVar = this.f1650q;
        }
        if (iVar != null) {
            iVar.cancel();
        }
    }

    @Override // D6.InterfaceC0111e
    /* renamed from: clone */
    public final InterfaceC0111e m1clone() {
        return new D(this.f1644k, this.f1645l, this.f1646m, this.f1647n, this.f1648o);
    }

    @Override // D6.InterfaceC0111e
    public final synchronized C0890D j() {
        try {
        } catch (IOException e7) {
            throw new RuntimeException("Unable to create request.", e7);
        }
        return ((j6.i) b()).f12510l;
    }

    @Override // D6.InterfaceC0111e
    public final void m(InterfaceC0114h interfaceC0114h) {
        j6.i iVar;
        Throwable th;
        synchronized (this) {
            try {
                if (this.f1652s) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f1652s = true;
                iVar = this.f1650q;
                th = this.f1651r;
                if (iVar == null && th == null) {
                    try {
                        j6.i iVarA = a();
                        this.f1650q = iVarA;
                        iVar = iVarA;
                    } catch (Throwable th2) {
                        th = th2;
                        c0.s(th);
                        this.f1651r = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC0114h.a(this, th);
            return;
        }
        if (this.f1649p) {
            iVar.cancel();
        }
        iVar.d(new F.w(this, interfaceC0114h, 11));
    }

    @Override // D6.InterfaceC0111e
    public final boolean s() {
        boolean z7 = true;
        if (this.f1649p) {
            return true;
        }
        synchronized (this) {
            j6.i iVar = this.f1650q;
            if (iVar == null || !iVar.f12523y) {
                z7 = false;
            }
        }
        return z7;
    }

    /* renamed from: clone, reason: collision with other method in class */
    public final Object m0clone() {
        return new D(this.f1644k, this.f1645l, this.f1646m, this.f1647n, this.f1648o);
    }
}
