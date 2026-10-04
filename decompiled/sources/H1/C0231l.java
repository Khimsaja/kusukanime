package H1;

import f6.AbstractC0893G;
import f6.C0890D;
import f6.C0894H;
import f6.C0895I;
import f6.C0896J;
import io.ktor.client.utils.CIOKt;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import m6.C1527a;
import w6.AbstractC2217b;

/* renamed from: H1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231l implements P {

    /* renamed from: k, reason: collision with root package name */
    public boolean f3529k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3530l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f3531m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f3532n;

    /* renamed from: o, reason: collision with root package name */
    public Object f3533o;

    /* renamed from: p, reason: collision with root package name */
    public Object f3534p;

    public C0231l(j6.i iVar, j6.e eVar, k6.d dVar) {
        kotlin.jvm.internal.l.f("call", iVar);
        kotlin.jvm.internal.l.f("finder", eVar);
        this.f3531m = iVar;
        this.f3532n = eVar;
        this.f3533o = dVar;
        this.f3534p = dVar.h();
    }

    @Override // H1.P
    public void a(y1.G g4) {
        P p7 = (P) this.f3534p;
        if (p7 != null) {
            p7.a(g4);
            g4 = ((P) this.f3534p).d();
        }
        ((n0) this.f3531m).a(g4);
    }

    @Override // H1.P
    public boolean b() {
        if (this.f3529k) {
            ((n0) this.f3531m).getClass();
            return false;
        }
        P p7 = (P) this.f3534p;
        p7.getClass();
        return p7.b();
    }

    public IOException c(boolean z7, boolean z8, IOException iOException) {
        if (iOException != null) {
            k(iOException);
        }
        j6.i iVar = (j6.i) this.f3531m;
        if (z8) {
            if (iOException != null) {
                kotlin.jvm.internal.l.f("call", iVar);
            } else {
                kotlin.jvm.internal.l.f("call", iVar);
            }
        }
        if (z7) {
            if (iOException != null) {
                kotlin.jvm.internal.l.f("call", iVar);
            } else {
                kotlin.jvm.internal.l.f("call", iVar);
            }
        }
        return iVar.h(this, z8, z7, iOException);
    }

    @Override // H1.P
    public y1.G d() {
        P p7 = (P) this.f3534p;
        return p7 != null ? p7.d() : ((n0) this.f3531m).f3547o;
    }

    @Override // H1.P
    public long e() {
        if (this.f3529k) {
            return ((n0) this.f3531m).e();
        }
        P p7 = (P) this.f3534p;
        p7.getClass();
        return p7.e();
    }

    public j6.c f(C0890D c0890d, boolean z7) {
        kotlin.jvm.internal.l.f("request", c0890d);
        this.f3529k = z7;
        AbstractC0893G abstractC0893G = c0890d.f11477d;
        kotlin.jvm.internal.l.c(abstractC0893G);
        long jContentLength = abstractC0893G.contentLength();
        kotlin.jvm.internal.l.f("call", (j6.i) this.f3531m);
        return new j6.c(this, ((k6.d) this.f3533o).f(c0890d, jContentLength), jContentLength);
    }

    public j6.k g() throws SocketException {
        ((j6.i) this.f3531m).l();
        j6.l lVarH = ((k6.d) this.f3533o).h();
        lVarH.getClass();
        Socket socket = lVarH.f12530d;
        kotlin.jvm.internal.l.c(socket);
        w6.C c2 = lVarH.f12534h;
        kotlin.jvm.internal.l.c(c2);
        w6.A a = lVarH.f12535i;
        kotlin.jvm.internal.l.c(a);
        socket.setSoTimeout(0);
        lVarH.k();
        return new j6.k(c2, a, this);
    }

    public void h(AbstractC0225f abstractC0225f) throws C0234o {
        P p7;
        P pI = abstractC0225f.i();
        if (pI == null || pI == (p7 = (P) this.f3534p)) {
            return;
        }
        if (p7 != null) {
            throw new C0234o(2, new IllegalStateException("Multiple renderer media clocks enabled."), CIOKt.DEFAULT_HTTP_POOL_SIZE);
        }
        this.f3534p = pI;
        this.f3533o = abstractC0225f;
        ((J1.C) pI).a(((n0) this.f3531m).f3547o);
    }

    public C0896J i(C0895I c0895i) throws IOException {
        k6.d dVar = (k6.d) this.f3533o;
        try {
            String strB = C0895I.b(c0895i, "Content-Type");
            long jE = dVar.e(c0895i);
            return new C0896J(strB, jE, AbstractC2217b.c(new j6.d(this, dVar.c(c0895i), jE)), 1);
        } catch (IOException e7) {
            kotlin.jvm.internal.l.f("call", (j6.i) this.f3531m);
            k(e7);
            throw e7;
        }
    }

    public C0894H j(boolean z7) throws IOException {
        try {
            C0894H c0894hG = ((k6.d) this.f3533o).g(z7);
            if (c0894hG != null) {
                c0894hG.f11494m = this;
            }
            return c0894hG;
        } catch (IOException e7) {
            kotlin.jvm.internal.l.f("call", (j6.i) this.f3531m);
            k(e7);
            throw e7;
        }
    }

    public void k(IOException iOException) {
        this.f3530l = true;
        ((j6.e) this.f3532n).c(iOException);
        j6.l lVarH = ((k6.d) this.f3533o).h();
        j6.i iVar = (j6.i) this.f3531m;
        synchronized (lVarH) {
            try {
                kotlin.jvm.internal.l.f("call", iVar);
                if (!(iOException instanceof m6.B)) {
                    if (!(lVarH.f12533g != null) || (iOException instanceof C1527a)) {
                        lVarH.f12536j = true;
                        if (lVarH.f12539m == 0) {
                            j6.l.d(iVar.f12509k, lVarH.f12528b, iOException);
                            lVarH.f12538l++;
                        }
                    }
                } else if (((m6.B) iOException).f12995k == 8) {
                    int i7 = lVarH.f12540n + 1;
                    lVarH.f12540n = i7;
                    if (i7 > 1) {
                        lVarH.f12536j = true;
                        lVarH.f12538l++;
                    }
                } else if (((m6.B) iOException).f12995k != 9 || !iVar.f12523y) {
                    lVarH.f12536j = true;
                    lVarH.f12538l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C0231l(L l7, B1.D d4) {
        this.f3532n = l7;
        this.f3531m = new n0(d4);
        this.f3529k = true;
    }
}
