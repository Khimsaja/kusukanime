package j6;

import H1.C0231l;
import P3.v;
import f6.C0887A;
import f6.C0890D;
import f6.C0895I;
import f6.InterfaceC0908f;
import f6.InterfaceC0909g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import n6.o;

/* loaded from: classes.dex */
public final class i implements InterfaceC0908f {

    /* renamed from: A, reason: collision with root package name */
    public volatile l f12508A;

    /* renamed from: k, reason: collision with root package name */
    public final C0887A f12509k;

    /* renamed from: l, reason: collision with root package name */
    public final C0890D f12510l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f12511m;

    /* renamed from: n, reason: collision with root package name */
    public final T1.l f12512n;

    /* renamed from: o, reason: collision with root package name */
    public final h f12513o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f12514p;

    /* renamed from: q, reason: collision with root package name */
    public Object f12515q;

    /* renamed from: r, reason: collision with root package name */
    public e f12516r;

    /* renamed from: s, reason: collision with root package name */
    public l f12517s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f12518t;

    /* renamed from: u, reason: collision with root package name */
    public C0231l f12519u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f12520v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f12521w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f12522x;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f12523y;

    /* renamed from: z, reason: collision with root package name */
    public volatile C0231l f12524z;

    public i(C0887A c0887a, C0890D c0890d, boolean z7) {
        kotlin.jvm.internal.l.f("client", c0887a);
        kotlin.jvm.internal.l.f("originalRequest", c0890d);
        this.f12509k = c0887a;
        this.f12510l = c0890d;
        this.f12511m = z7;
        this.f12512n = (T1.l) c0887a.f11448l.f9916l;
        c0887a.f11451o.getClass();
        h hVar = new h(this);
        hVar.g(0, TimeUnit.MILLISECONDS);
        this.f12513o = hVar;
        this.f12514p = new AtomicBoolean();
        this.f12522x = true;
    }

    public static final String a(i iVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(iVar.f12523y ? "canceled " : "");
        sb.append(iVar.f12511m ? "web socket" : "call");
        sb.append(" to ");
        sb.append(iVar.f12510l.a.g());
        return sb.toString();
    }

    public final void b(l lVar) {
        byte[] bArr = g6.b.a;
        if (this.f12517s != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f12517s = lVar;
        lVar.f12542p.add(new g(this, this.f12515q));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketK;
        byte[] bArr = g6.b.a;
        l lVar = this.f12517s;
        if (lVar != null) {
            synchronized (lVar) {
                socketK = k();
            }
            if (this.f12517s == null) {
                if (socketK != null) {
                    g6.b.d(socketK);
                }
            } else if (socketK != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f12518t && this.f12513o.j()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            kotlin.jvm.internal.l.c(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final void cancel() {
        Socket socket;
        if (this.f12523y) {
            return;
        }
        this.f12523y = true;
        C0231l c0231l = this.f12524z;
        if (c0231l != null) {
            ((k6.d) c0231l.f3533o).cancel();
        }
        l lVar = this.f12508A;
        if (lVar == null || (socket = lVar.f12529c) == null) {
            return;
        }
        g6.b.d(socket);
    }

    public final Object clone() {
        return new i(this.f12509k, this.f12510l, this.f12511m);
    }

    public final void d(InterfaceC0909g interfaceC0909g) {
        f fVar;
        if (!this.f12514p.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        o oVar = o.a;
        this.f12515q = o.a.g();
        A2.b bVar = this.f12509k.f11447k;
        f fVar2 = new f(this, interfaceC0909g);
        bVar.getClass();
        synchronized (bVar) {
            ((ArrayDeque) bVar.f111m).add(fVar2);
            if (!this.f12511m) {
                String str = this.f12510l.a.f11607d;
                Iterator it = ((ArrayDeque) bVar.f112n).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = ((ArrayDeque) bVar.f111m).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                fVar = null;
                                break;
                            } else {
                                fVar = (f) it2.next();
                                if (kotlin.jvm.internal.l.a(fVar.f12506m.f12510l.a.f11607d, str)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        fVar = (f) it.next();
                        if (kotlin.jvm.internal.l.a(fVar.f12506m.f12510l.a.f11607d, str)) {
                            break;
                        }
                    }
                }
                if (fVar != null) {
                    fVar2.f12505l = fVar.f12505l;
                }
            }
        }
        bVar.y();
    }

    public final C0895I e() {
        if (!this.f12514p.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f12513o.i();
        o oVar = o.a;
        this.f12515q = o.a.g();
        try {
            A2.b bVar = this.f12509k.f11447k;
            synchronized (bVar) {
                ((ArrayDeque) bVar.f113o).add(this);
            }
            return g();
        } finally {
            A2.b bVar2 = this.f12509k.f11447k;
            bVar2.getClass();
            bVar2.r((ArrayDeque) bVar2.f113o, this);
        }
    }

    public final void f(boolean z7) {
        C0231l c0231l;
        synchronized (this) {
            if (!this.f12522x) {
                throw new IllegalStateException("released");
            }
        }
        if (z7 && (c0231l = this.f12524z) != null) {
            ((k6.d) c0231l.f3533o).cancel();
            ((i) c0231l.f3531m).h(c0231l, true, true, null);
        }
        this.f12519u = null;
    }

    public final C0895I g() {
        ArrayList arrayList = new ArrayList();
        v.e0(arrayList, this.f12509k.f11449m);
        arrayList.add(new k6.a(this.f12509k));
        arrayList.add(new k6.a(this.f12509k.f11456t));
        this.f12509k.getClass();
        arrayList.add(new h6.b());
        arrayList.add(a.a);
        if (!this.f12511m) {
            v.e0(arrayList, this.f12509k.f11450n);
        }
        arrayList.add(new k6.b(this.f12511m));
        C0890D c0890d = this.f12510l;
        C0887A c0887a = this.f12509k;
        boolean z7 = false;
        try {
            try {
                C0895I c0895iB = new k6.f(this, arrayList, 0, null, c0890d, c0887a.f11444G, c0887a.f11445H, c0887a.I).b(this.f12510l);
                if (this.f12523y) {
                    g6.b.c(c0895iB);
                    throw new IOException("Canceled");
                }
                i(null);
                return c0895iB;
            } catch (IOException e7) {
                z7 = true;
                IOException iOExceptionI = i(e7);
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Throwable", iOExceptionI);
                throw iOExceptionI;
            }
        } catch (Throwable th) {
            if (!z7) {
                i(null);
            }
            throw th;
        }
    }

    public final IOException h(C0231l c0231l, boolean z7, boolean z8, IOException iOException) {
        boolean z9;
        boolean z10;
        kotlin.jvm.internal.l.f("exchange", c0231l);
        if (c0231l.equals(this.f12524z)) {
            synchronized (this) {
                z9 = false;
                if (z7) {
                    try {
                        if (!this.f12520v) {
                            if (z8 || !this.f12521w) {
                                z10 = false;
                            }
                        }
                        if (z7) {
                            this.f12520v = false;
                        }
                        if (z8) {
                            this.f12521w = false;
                        }
                        boolean z11 = this.f12520v;
                        boolean z12 = (z11 || this.f12521w) ? false : true;
                        if (!z11 && !this.f12521w) {
                            if (!this.f12522x) {
                                z9 = true;
                            }
                        }
                        z10 = z9;
                        z9 = z12;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z8) {
                    }
                    z10 = false;
                }
            }
            if (z9) {
                this.f12524z = null;
                l lVar = this.f12517s;
                if (lVar != null) {
                    synchronized (lVar) {
                        lVar.f12539m++;
                    }
                }
            }
            if (z10) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException i(IOException iOException) {
        boolean z7;
        synchronized (this) {
            z7 = false;
            if (this.f12522x) {
                this.f12522x = false;
                if (!this.f12520v) {
                    if (!this.f12521w) {
                        z7 = true;
                    }
                }
            }
        }
        return z7 ? c(iOException) : iOException;
    }

    public final Socket k() {
        l lVar = this.f12517s;
        kotlin.jvm.internal.l.c(lVar);
        byte[] bArr = g6.b.a;
        ArrayList arrayList = lVar.f12542p;
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (kotlin.jvm.internal.l.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i7);
        this.f12517s = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        lVar.f12543q = System.nanoTime();
        T1.l lVar2 = this.f12512n;
        lVar2.getClass();
        byte[] bArr2 = g6.b.a;
        boolean z7 = lVar.f12536j;
        i6.c cVar = (i6.c) lVar2.f8929b;
        if (!z7) {
            cVar.c((i6.b) lVar2.f8930c, 0L);
            return null;
        }
        lVar.f12536j = true;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) lVar2.f8931d;
        concurrentLinkedQueue.remove(lVar);
        if (concurrentLinkedQueue.isEmpty()) {
            cVar.a();
        }
        Socket socket = lVar.f12530d;
        kotlin.jvm.internal.l.c(socket);
        return socket;
    }

    public final void l() {
        if (this.f12518t) {
            throw new IllegalStateException("Check failed.");
        }
        this.f12518t = true;
        this.f12513o.j();
    }
}
