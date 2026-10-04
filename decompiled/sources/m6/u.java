package m6;

import b1.AbstractC0703b;
import java.net.SocketTimeoutException;
import w6.C2221f;

/* loaded from: classes.dex */
public final class u extends C2221f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f13089n;

    public u(v vVar) {
        this.f13089n = vVar;
    }

    @Override // w6.C2221f
    public final void k() {
        this.f13089n.e(9);
        n nVar = this.f13089n.f13090b;
        synchronized (nVar) {
            long j7 = nVar.f13059x;
            long j8 = nVar.f13058w;
            if (j7 < j8) {
                return;
            }
            nVar.f13058w = j8 + 1;
            nVar.f13060y = System.nanoTime() + 1000000000;
            nVar.f13053r.c(new i6.b(AbstractC0703b.m(new StringBuilder(), nVar.f13048m, " ping"), 2, nVar), 0L);
        }
    }

    public final void l() {
        if (j()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
