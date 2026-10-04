package G;

import D.AbstractC0047d0;
import H0.C0209a;
import H0.I;
import H0.r;
import M0.i;
import P3.y;
import T0.k;
import kotlin.jvm.internal.l;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final class d {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public I f2562b;

    /* renamed from: c, reason: collision with root package name */
    public i f2563c;

    /* renamed from: d, reason: collision with root package name */
    public int f2564d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2565e;

    /* renamed from: f, reason: collision with root package name */
    public int f2566f;

    /* renamed from: g, reason: collision with root package name */
    public int f2567g;

    /* renamed from: i, reason: collision with root package name */
    public T0.b f2569i;

    /* renamed from: j, reason: collision with root package name */
    public C0209a f2570j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2571k;

    /* renamed from: m, reason: collision with root package name */
    public b f2573m;

    /* renamed from: n, reason: collision with root package name */
    public r f2574n;

    /* renamed from: o, reason: collision with root package name */
    public k f2575o;

    /* renamed from: h, reason: collision with root package name */
    public long f2568h = a.a;

    /* renamed from: l, reason: collision with root package name */
    public long f2572l = AbstractC1420H.a(0, 0);

    /* renamed from: p, reason: collision with root package name */
    public long f2576p = q0.c.x(0, 0, 0, 0);

    /* renamed from: q, reason: collision with root package name */
    public int f2577q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f2578r = -1;

    public d(String str, I i7, i iVar, int i8, boolean z7, int i9, int i10) {
        this.a = str;
        this.f2562b = i7;
        this.f2563c = iVar;
        this.f2564d = i8;
        this.f2565e = z7;
        this.f2566f = i9;
        this.f2567g = i10;
    }

    public final int a(int i7, k kVar) {
        int i8 = this.f2577q;
        int i9 = this.f2578r;
        if (i7 == i8 && i8 != -1) {
            return i9;
        }
        int iK = AbstractC0047d0.k(b(q0.c.a(0, i7, 0, Integer.MAX_VALUE), kVar).b());
        this.f2577q = i7;
        this.f2578r = iK;
        return iK;
    }

    public final C0209a b(long j7, k kVar) {
        r rVarD = d(kVar);
        boolean z7 = this.f2565e;
        int i7 = this.f2564d;
        float fC = rVarD.c();
        int iH = ((z7 || i7 == 2) && T0.a.d(j7)) ? T0.a.h(j7) : Integer.MAX_VALUE;
        if (T0.a.j(j7) != iH) {
            iH = e3.c.k(AbstractC0047d0.k(fC), T0.a.j(j7), iH);
        }
        int iG = T0.a.g(j7);
        int iMin = Math.min(0, 262142);
        int iMin2 = iH == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(iH, 262142);
        int iF = q0.c.f(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
        long jA = q0.c.a(iMin, iMin2, Math.min(iF, 0), iG != Integer.MAX_VALUE ? Math.min(iF, iG) : Integer.MAX_VALUE);
        boolean z8 = this.f2565e;
        int i8 = this.f2564d;
        int i9 = this.f2566f;
        return new C0209a((P0.c) rVarD, ((z8 || i8 != 2) && i9 >= 1) ? i9 : 1, i8 == 2, jA);
    }

    public final void c(T0.b bVar) {
        long jA;
        T0.b bVar2 = this.f2569i;
        if (bVar != null) {
            int i7 = a.f2553b;
            jA = a.a(bVar.a(), bVar.n());
        } else {
            jA = a.a;
        }
        if (bVar2 == null) {
            this.f2569i = bVar;
            this.f2568h = jA;
            return;
        }
        if (bVar == null || this.f2568h != jA) {
            this.f2569i = bVar;
            this.f2568h = jA;
            this.f2570j = null;
            this.f2574n = null;
            this.f2575o = null;
            this.f2577q = -1;
            this.f2578r = -1;
            this.f2576p = q0.c.x(0, 0, 0, 0);
            this.f2572l = AbstractC1420H.a(0, 0);
            this.f2571k = false;
        }
    }

    public final r d(k kVar) {
        r cVar = this.f2574n;
        if (cVar == null || kVar != this.f2575o || cVar.b()) {
            this.f2575o = kVar;
            String str = this.a;
            I iX = n6.d.X(this.f2562b, kVar);
            T0.b bVar = this.f2569i;
            l.c(bVar);
            i iVar = this.f2563c;
            y yVar = y.f7779k;
            cVar = new P0.c(str, iX, yVar, yVar, iVar, bVar);
        }
        this.f2574n = cVar;
        return cVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f2570j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        long j7 = this.f2568h;
        int i7 = a.f2553b;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j7 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j7 & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
