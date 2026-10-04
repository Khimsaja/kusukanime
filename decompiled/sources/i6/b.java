package i6;

import A3.q;
import T1.l;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import m6.n;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12046f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i7, Object obj) {
        super(str, true);
        this.f12045e = i7;
        this.f12046f = obj;
    }

    @Override // i6.a
    public final long a() throws IOException {
        switch (this.f12045e) {
            case 0:
                ((q) this.f12046f).invoke();
                return -1L;
            case 1:
                l lVar = (l) this.f12046f;
                long jNanoTime = System.nanoTime();
                Iterator it = ((ConcurrentLinkedQueue) lVar.f8931d).iterator();
                int i7 = 0;
                long j7 = Long.MIN_VALUE;
                j6.l lVar2 = null;
                int i8 = 0;
                while (it.hasNext()) {
                    j6.l lVar3 = (j6.l) it.next();
                    kotlin.jvm.internal.l.e("connection", lVar3);
                    synchronized (lVar3) {
                        if (lVar.d(lVar3, jNanoTime) > 0) {
                            i8++;
                        } else {
                            i7++;
                            long j8 = jNanoTime - lVar3.f12543q;
                            if (j8 > j7) {
                                lVar2 = lVar3;
                                j7 = j8;
                            }
                        }
                    }
                }
                long j9 = lVar.a;
                if (j7 < j9 && i7 <= 5) {
                    if (i7 > 0) {
                        return j9 - j7;
                    }
                    if (i8 > 0) {
                        return j9;
                    }
                    return -1L;
                }
                kotlin.jvm.internal.l.c(lVar2);
                synchronized (lVar2) {
                    if (!lVar2.f12542p.isEmpty()) {
                        return 0L;
                    }
                    if (lVar2.f12543q + j7 != jNanoTime) {
                        return 0L;
                    }
                    lVar2.f12536j = true;
                    ((ConcurrentLinkedQueue) lVar.f8931d).remove(lVar2);
                    Socket socket = lVar2.f12530d;
                    kotlin.jvm.internal.l.c(socket);
                    g6.b.d(socket);
                    if (!((ConcurrentLinkedQueue) lVar.f8931d).isEmpty()) {
                        return 0L;
                    }
                    ((c) lVar.f8929b).a();
                    return 0L;
                }
            default:
                n nVar = (n) this.f12046f;
                nVar.getClass();
                try {
                    nVar.f13044G.m(2, 0, false);
                    return -1L;
                } catch (IOException e7) {
                    nVar.b(2, 2, e7);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, String str) {
        super(str, true);
        this.f12045e = 1;
        this.f12046f = lVar;
    }
}
