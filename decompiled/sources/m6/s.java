package m6;

import w6.C2224i;
import w6.G;
import w6.J;

/* loaded from: classes.dex */
public final class s implements G {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f13079k;

    /* renamed from: l, reason: collision with root package name */
    public final C2224i f13080l = new C2224i();

    /* renamed from: m, reason: collision with root package name */
    public boolean f13081m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f13082n;

    public s(v vVar, boolean z7) {
        this.f13082n = vVar;
        this.f13079k = z7;
    }

    /* JADX WARN: Finally extract failed */
    public final void b(boolean z7) {
        long jMin;
        boolean z8;
        v vVar = this.f13082n;
        synchronized (vVar) {
            vVar.f13100l.i();
            while (vVar.f13093e >= vVar.f13094f && !this.f13079k && !this.f13081m) {
                try {
                    synchronized (vVar) {
                        int i7 = vVar.f13101m;
                        if (i7 != 0) {
                            break;
                        } else {
                            vVar.k();
                        }
                    }
                } catch (Throwable th) {
                    vVar.f13100l.l();
                    throw th;
                }
            }
            vVar.f13100l.l();
            vVar.b();
            jMin = Math.min(vVar.f13094f - vVar.f13093e, this.f13080l.f17156l);
            vVar.f13093e += jMin;
            z8 = z7 && jMin == this.f13080l.f17156l;
        }
        this.f13082n.f13100l.i();
        try {
            v vVar2 = this.f13082n;
            vVar2.f13090b.m(vVar2.a, z8, this.f13080l, jMin);
        } finally {
            this.f13082n.f13100l.l();
        }
    }

    @Override // w6.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z7;
        v vVar = this.f13082n;
        byte[] bArr = g6.b.a;
        synchronized (vVar) {
            if (this.f13081m) {
                return;
            }
            synchronized (vVar) {
                z7 = vVar.f13101m == 0;
            }
            v vVar2 = this.f13082n;
            if (!vVar2.f13098j.f13079k) {
                if (this.f13080l.f17156l > 0) {
                    while (this.f13080l.f17156l > 0) {
                        b(true);
                    }
                } else if (z7) {
                    vVar2.f13090b.m(vVar2.a, true, null, 0L);
                }
            }
            synchronized (this.f13082n) {
                this.f13081m = true;
            }
            this.f13082n.f13090b.flush();
            this.f13082n.a();
        }
    }

    @Override // w6.G
    public final J d() {
        return this.f13082n.f13100l;
    }

    @Override // w6.G
    public final void f(C2224i c2224i, long j7) {
        kotlin.jvm.internal.l.f("source", c2224i);
        byte[] bArr = g6.b.a;
        C2224i c2224i2 = this.f13080l;
        c2224i2.f(c2224i, j7);
        while (c2224i2.f17156l >= 16384) {
            b(false);
        }
    }

    @Override // w6.G, java.io.Flushable
    public final void flush() {
        v vVar = this.f13082n;
        byte[] bArr = g6.b.a;
        synchronized (vVar) {
            vVar.b();
        }
        while (this.f13080l.f17156l > 0) {
            b(false);
            this.f13082n.f13090b.flush();
        }
    }
}
