package U2;

import g3.AbstractC0946e;
import w6.AbstractC2217b;
import w6.C;
import w6.InterfaceC2226k;
import w6.y;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: k, reason: collision with root package name */
    public final y f9216k;

    /* renamed from: l, reason: collision with root package name */
    public final w6.o f9217l;

    /* renamed from: m, reason: collision with root package name */
    public final String f9218m;

    /* renamed from: n, reason: collision with root package name */
    public final V2.i f9219n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9220o;

    /* renamed from: p, reason: collision with root package name */
    public C f9221p;

    public l(y yVar, w6.o oVar, String str, V2.i iVar) {
        this.f9216k = yVar;
        this.f9217l = oVar;
        this.f9218m = str;
        this.f9219n = iVar;
    }

    @Override // U2.m
    public final q0.c b() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f9220o = true;
            C c2 = this.f9221p;
            if (c2 != null) {
                AbstractC0946e.a(c2);
            }
            V2.i iVar = this.f9219n;
            if (iVar != null) {
                AbstractC0946e.a(iVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // U2.m
    public final synchronized InterfaceC2226k e() {
        if (this.f9220o) {
            throw new IllegalStateException("closed");
        }
        C c2 = this.f9221p;
        if (c2 != null) {
            return c2;
        }
        C c4 = AbstractC2217b.c(this.f9217l.x(this.f9216k));
        this.f9221p = c4;
        return c4;
    }
}
