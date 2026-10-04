package i6;

import K2.RunnableC0306j;
import R1.i;
import X4.y;
import b1.AbstractC0703b;
import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    public static final i f12052h = new i(21);

    /* renamed from: i, reason: collision with root package name */
    public static final d f12053i;

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f12054j;
    public final y a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12056c;

    /* renamed from: d, reason: collision with root package name */
    public long f12057d;

    /* renamed from: b, reason: collision with root package name */
    public int f12055b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f12058e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f12059f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final RunnableC0306j f12060g = new RunnableC0306j(4, this);

    static {
        String str = g6.b.f11776f + " TaskRunner";
        l.f(ContentDisposition.Parameters.Name, str);
        f12053i = new d(new y(new g6.a(str, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        l.e("getLogger(TaskRunner::class.java.name)", logger);
        f12054j = logger;
    }

    public d(y yVar) {
        this.a = yVar;
    }

    public static final void a(d dVar, a aVar) {
        dVar.getClass();
        byte[] bArr = g6.b.a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.a);
        try {
            long jA = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, jA);
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j7) {
        byte[] bArr = g6.b.a;
        c cVar = aVar.f12043c;
        l.c(cVar);
        if (cVar.f12049d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z7 = cVar.f12051f;
        cVar.f12051f = false;
        cVar.f12049d = null;
        this.f12058e.remove(cVar);
        if (j7 != -1 && !z7 && !cVar.f12048c) {
            cVar.d(aVar, j7, true);
        }
        if (cVar.f12050e.isEmpty()) {
            return;
        }
        this.f12059f.add(cVar);
    }

    public final a c() {
        long j7;
        a aVar;
        boolean z7;
        byte[] bArr = g6.b.a;
        while (true) {
            ArrayList arrayList = this.f12059f;
            if (arrayList.isEmpty()) {
                return null;
            }
            y yVar = this.a;
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            a aVar2 = null;
            while (true) {
                if (!it.hasNext()) {
                    j7 = jNanoTime;
                    aVar = null;
                    z7 = false;
                    break;
                }
                a aVar3 = (a) ((c) it.next()).f12050e.get(0);
                j7 = jNanoTime;
                aVar = null;
                long jMax = Math.max(0L, aVar3.f12044d - j7);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar2 != null) {
                        z7 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                jNanoTime = j7;
            }
            ArrayList arrayList2 = this.f12058e;
            if (aVar2 != null) {
                byte[] bArr2 = g6.b.a;
                aVar2.f12044d = -1L;
                c cVar = aVar2.f12043c;
                l.c(cVar);
                cVar.f12050e.remove(aVar2);
                arrayList.remove(cVar);
                cVar.f12049d = aVar2;
                arrayList2.add(cVar);
                if (z7 || (!this.f12056c && !arrayList.isEmpty())) {
                    RunnableC0306j runnableC0306j = this.f12060g;
                    l.f("runnable", runnableC0306j);
                    ((ThreadPoolExecutor) yVar.f9916l).execute(runnableC0306j);
                }
                return aVar2;
            }
            if (this.f12056c) {
                if (jMin >= this.f12057d - j7) {
                    return aVar;
                }
                notify();
                return aVar;
            }
            this.f12056c = true;
            this.f12057d = j7 + jMin;
            try {
                try {
                    long j8 = jMin / 1000000;
                    long j9 = jMin - (1000000 * j8);
                    if (j8 > 0 || jMin > 0) {
                        wait(j8, (int) j9);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((c) arrayList2.get(size)).b();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        c cVar2 = (c) arrayList.get(size2);
                        cVar2.b();
                        if (cVar2.f12050e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
            } finally {
                this.f12056c = false;
            }
        }
    }

    public final void d(c cVar) {
        l.f("taskQueue", cVar);
        byte[] bArr = g6.b.a;
        if (cVar.f12049d == null) {
            boolean zIsEmpty = cVar.f12050e.isEmpty();
            ArrayList arrayList = this.f12059f;
            if (zIsEmpty) {
                arrayList.remove(cVar);
            } else {
                l.f("<this>", arrayList);
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        boolean z7 = this.f12056c;
        y yVar = this.a;
        if (z7) {
            notify();
            return;
        }
        RunnableC0306j runnableC0306j = this.f12060g;
        l.f("runnable", runnableC0306j);
        ((ThreadPoolExecutor) yVar.f9916l).execute(runnableC0306j);
    }

    public final c e() {
        int i7;
        synchronized (this) {
            i7 = this.f12055b;
            this.f12055b = i7 + 1;
        }
        return new c(this, AbstractC0703b.g(i7, "Q"));
    }
}
