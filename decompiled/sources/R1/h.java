package R1;

import B1.AbstractC0015b;
import B1.w;
import B1.x;
import B1.z;
import E1.D;
import O1.B;
import android.content.Context;
import j3.AbstractC1331q;
import j3.G;
import j3.X;
import j3.c0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class h implements e, D {

    /* renamed from: p, reason: collision with root package name */
    public static final X f8043p = G.v(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: q, reason: collision with root package name */
    public static final X f8044q = G.v(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: r, reason: collision with root package name */
    public static final X f8045r = G.v(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: s, reason: collision with root package name */
    public static final X f8046s = G.v(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: t, reason: collision with root package name */
    public static final X f8047t = G.v(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: u, reason: collision with root package name */
    public static final X f8048u = G.v(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: v, reason: collision with root package name */
    public static h f8049v;
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f8050b;

    /* renamed from: c, reason: collision with root package name */
    public final d f8051c;

    /* renamed from: d, reason: collision with root package name */
    public final B1.D f8052d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8053e;

    /* renamed from: f, reason: collision with root package name */
    public final o f8054f;

    /* renamed from: g, reason: collision with root package name */
    public int f8055g;

    /* renamed from: h, reason: collision with root package name */
    public long f8056h;

    /* renamed from: i, reason: collision with root package name */
    public long f8057i;

    /* renamed from: j, reason: collision with root package name */
    public long f8058j;

    /* renamed from: k, reason: collision with root package name */
    public long f8059k;

    /* renamed from: l, reason: collision with root package name */
    public long f8060l;

    /* renamed from: m, reason: collision with root package name */
    public long f8061m;

    /* renamed from: n, reason: collision with root package name */
    public int f8062n;

    /* renamed from: o, reason: collision with root package name */
    public String f8063o;

    public h(Context context, HashMap map) {
        boolean z7;
        B1.D d4 = B1.D.a;
        this.a = context == null ? null : context.getApplicationContext();
        this.f8050b = c0.a(map);
        this.f8051c = new d(0);
        this.f8054f = new o();
        this.f8052d = d4;
        this.f8053e = true;
        if (context == null) {
            this.f8062n = 0;
            this.f8060l = 1000000L;
            return;
        }
        z zVarA = z.a(context);
        int iB = zVarA.b();
        this.f8062n = iB;
        this.f8060l = a(iB);
        g gVar = new g(this);
        Executor executorO = AbstractC0015b.o();
        CopyOnWriteArrayList copyOnWriteArrayList = zVarA.f368b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            x xVar = (x) it.next();
            if (xVar.a.get() == null) {
                copyOnWriteArrayList.remove(xVar);
            }
        }
        x xVar2 = new x(zVarA, gVar, executorO);
        synchronized (zVarA.f369c) {
            zVarA.f368b.add(xVar2);
            z7 = zVarA.f371e;
        }
        if (z7) {
            xVar2.f364b.execute(new w(0, xVar2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:1149:0x13fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(int r21) {
        /*
            Method dump skipped, instructions count: 9240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.h.a(int):long");
    }

    public final void b(int i7, long j7, long j8) {
        final int i8;
        final long j9;
        final long j10;
        if (i7 == 0 && j7 == 0 && j8 == this.f8061m) {
            return;
        }
        this.f8061m = j8;
        Iterator it = this.f8051c.a.iterator();
        while (it.hasNext()) {
            final c cVar = (c) it.next();
            if (cVar.f8037c) {
                i8 = i7;
                j9 = j7;
                j10 = j8;
            } else {
                i8 = i7;
                j9 = j7;
                j10 = j8;
                cVar.a.post(new Runnable() { // from class: R1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        I1.f fVar = cVar.f8036b;
                        B0.b bVar = fVar.f3955d;
                        I1.a aVarI = fVar.I(((G) bVar.f276l).isEmpty() ? null : (B) AbstractC1331q.g((G) bVar.f276l));
                        fVar.M(aVarI, 1006, new I1.d(aVarI, i8, j9, j10));
                    }
                });
            }
            i7 = i8;
            j7 = j9;
            j8 = j10;
        }
    }
}
