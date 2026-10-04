package T1;

import B1.AbstractC0015b;
import B1.C;
import B1.F;
import B1.G;
import B1.K;
import F2.D;
import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import b1.AbstractC0703b;
import f6.C0903a;
import j3.E;
import j3.X;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import y1.C2384f;
import y1.C2392n;
import y1.C2393o;
import y1.Z;
import y1.b0;

/* loaded from: classes.dex */
public final class l {
    public long a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8929b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8930c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8931d;

    public l(i6.d dVar) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        kotlin.jvm.internal.l.f("taskRunner", dVar);
        kotlin.jvm.internal.l.f("timeUnit", timeUnit);
        this.a = timeUnit.toNanos(5L);
        this.f8929b = dVar.e();
        this.f8930c = new i6.b(this, AbstractC0703b.m(new StringBuilder(), g6.b.f11776f, " ConnectionPool"));
        this.f8931d = new ConcurrentLinkedQueue();
    }

    public boolean a(C0903a c0903a, j6.i iVar, ArrayList arrayList, boolean z7) {
        kotlin.jvm.internal.l.f("call", iVar);
        Iterator it = ((ConcurrentLinkedQueue) this.f8931d).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            j6.l lVar = (j6.l) it.next();
            kotlin.jvm.internal.l.e("connection", lVar);
            synchronized (lVar) {
                if (z7) {
                    if (!(lVar.f12533g != null)) {
                        continue;
                    }
                }
                if (lVar.h(c0903a, arrayList)) {
                    iVar.b(lVar);
                    return true;
                }
            }
        }
    }

    public void b(boolean z7) {
        G g4;
        this.a = -9223372036854775807L;
        o oVar = (o) this.f8931d;
        if (oVar.f8941k == 1) {
            c cVar = oVar.f8936f;
            if (z7) {
                s sVar = cVar.a;
                v vVar = sVar.f8946b;
                vVar.f8976m = 0L;
                vVar.f8979p = -1L;
                vVar.f8977n = -1L;
                sVar.f8952h = -9223372036854775807L;
                sVar.f8950f = -9223372036854775807L;
                sVar.d(1);
                sVar.f8953i = -9223372036854775807L;
            }
            w wVar = cVar.f8853c;
            B1.s sVar2 = wVar.f8985f;
            sVar2.f358b = 0;
            sVar2.f359c = 0;
            wVar.f8986g = -9223372036854775807L;
            G g7 = wVar.f8984e;
            if (g7.z() > 0) {
                AbstractC0015b.c(g7.z() > 0);
                while (g7.z() > 1) {
                    g7.u();
                }
                Object objU = g7.u();
                objU.getClass();
                g7.a(0L, (Long) objU);
            }
            G g8 = wVar.f8983d;
            if (g8.z() > 0) {
                AbstractC0015b.c(g8.z() > 0);
                while (g8.z() > 1) {
                    g8.u();
                }
                Object objU2 = g8.u();
                objU2.getClass();
                g8.a(0L, (b0) objU2);
            }
            cVar.f8854d.clear();
            while (true) {
                g4 = oVar.f8932b;
                if (g4.z() <= 1) {
                    break;
                } else {
                    g4.u();
                }
            }
            if (g4.z() == 1) {
                Long l7 = (Long) g4.u();
                l7.getClass();
                cVar.a(l7.longValue(), oVar.f8943m);
            }
            oVar.f8942l = -9223372036854775807L;
            F f5 = oVar.f8939i;
            AbstractC0015b.i(f5);
            f5.c(new D(oVar));
        }
    }

    public boolean c(C2393o c2393o) {
        o oVar = (o) this.f8931d;
        AbstractC0015b.h(oVar.f8941k == 0);
        C2384f c2384f = c2393o.f18089B;
        if (c2384f == null || !c2384f.d()) {
            c2384f = C2384f.f18035h;
        }
        if (c2384f.f18037c != 7 || K.a < 34) {
        }
        Looper looperMyLooper = Looper.myLooper();
        AbstractC0015b.i(looperMyLooper);
        oVar.f8939i = oVar.f8937g.a(looperMyLooper, null);
        try {
            oVar.f8933c.a();
            throw null;
        } catch (Z e7) {
            throw new A(e7, c2393o);
        }
    }

    public int d(j6.l lVar, long j7) {
        byte[] bArr = g6.b.a;
        ArrayList arrayList = lVar.f12542p;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i7);
            if (reference.get() != null) {
                i7++;
            } else {
                String str = "A connection to " + lVar.f12528b.a.f11529i + " was leaked. Did you forget to close a response body?";
                n6.o oVar = n6.o.a;
                n6.o.a.k(str, ((j6.g) reference).a);
                arrayList.remove(i7);
                lVar.f12536j = true;
                if (arrayList.isEmpty()) {
                    lVar.f12543q = j7 - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public void e(int i7) {
        v vVar = ((o) this.f8931d).f8936f.a.f8946b;
        if (vVar.f8973j == i7) {
            return;
        }
        vVar.f8973j = i7;
        vVar.d(true);
    }

    public void f(Surface surface, C c2) {
        o oVar = (o) this.f8931d;
        Pair pair = oVar.f8940j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C) oVar.f8940j.second).equals(c2)) {
            return;
        }
        oVar.f8940j = Pair.create(surface, c2);
        int i7 = c2.a;
    }

    public void g(float f5) {
        ((o) this.f8931d).f8936f.a.g(f5);
    }

    public void h(long j7, long j8) {
        o oVar = (o) this.f8931d;
        G g4 = oVar.f8932b;
        long j9 = this.a;
        g4.a(j9 == -9223372036854775807L ? 0L : j9 + 1, Long.valueOf(j7));
        oVar.f8943m = j8;
        oVar.f8936f.a(0L, j8);
    }

    public void i(List list) {
        if (((X) this.f8929b).equals(list)) {
            return;
        }
        o oVar = (o) this.f8931d;
        oVar.f8933c.getClass();
        j3.D d4 = new j3.D(4);
        d4.c(list);
        d4.c(oVar.f8935e);
        this.f8929b = d4.f();
        C2393o c2393o = (C2393o) this.f8930c;
        if (c2393o == null) {
            return;
        }
        C2392n c2392nA = c2393o.a();
        C2384f c2384f = c2393o.f18089B;
        if (c2384f == null || !c2384f.d()) {
            c2384f = C2384f.f18035h;
        }
        c2392nA.f18053A = c2384f;
        c2392nA.a();
        AbstractC0015b.i(null);
        throw null;
    }

    public void j(q qVar) {
        ((o) this.f8931d).f8936f.f8859i = qVar;
    }

    public void k() {
        long j7 = this.a;
        o oVar = (o) this.f8931d;
        if (oVar.f8942l >= j7) {
            long j8 = oVar.f8936f.f8853c.f8986g;
        }
    }

    public l(o oVar, Context context) {
        this.f8931d = oVar;
        K.D(context);
        E e7 = j3.G.f12277l;
        this.f8929b = X.f12304o;
        this.a = -9223372036854775807L;
    }
}
