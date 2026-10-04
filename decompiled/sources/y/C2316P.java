package y;

import O1.W;
import android.os.Trace;
import java.util.List;
import m.C1503x;
import s0.C1966k;
import w0.Y;
import w0.a0;

/* renamed from: y.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2316P implements InterfaceC2305E {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17598b;

    /* renamed from: c, reason: collision with root package name */
    public final W f17599c;

    /* renamed from: d, reason: collision with root package name */
    public Y f17600d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17601e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17602f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17603g;

    /* renamed from: h, reason: collision with root package name */
    public Y.k f17604h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17605i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ B2.l f17606j;

    public C2316P(B2.l lVar, int i7, long j7, W w7) {
        this.f17606j = lVar;
        this.a = i7;
        this.f17598b = j7;
        this.f17599c = w7;
    }

    @Override // y.InterfaceC2305E
    public final void a() {
        this.f17605i = true;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [e4.k, kotlin.jvm.internal.m] */
    public final boolean b(V1.r rVar) {
        List list;
        Y.k kVar;
        if (c()) {
            Object objD = ((InterfaceC2339t) ((C2338s) this.f17606j.f416l).f17640b.invoke()).d(this.a);
            boolean z7 = this.f17600d != null;
            W w7 = this.f17599c;
            if (!z7) {
                long jC = (objD == null || ((C1503x) w7.f7368m).b(objD) < 0) ? w7.f7366k : ((C1503x) w7.f7368m).c(objD);
                long jA = rVar.a();
                if ((!this.f17605i || jA <= 0) && jC >= jA) {
                    return true;
                }
                long jNanoTime = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    d();
                    Trace.endSection();
                    long jNanoTime2 = System.nanoTime() - jNanoTime;
                    if (objD != null) {
                        C1503x c1503x = (C1503x) w7.f7368m;
                        int iB = c1503x.b(objD);
                        ((C1503x) w7.f7368m).e(W.a(w7, jNanoTime2, iB >= 0 ? c1503x.f12936c[iB] : 0L), objD);
                    }
                    w7.f7366k = W.a(w7, jNanoTime2, w7.f7366k);
                } finally {
                }
            }
            if (!this.f17605i) {
                if (!this.f17603g) {
                    if (rVar.a() <= 0) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        Y y7 = this.f17600d;
                        if (y7 == null) {
                            throw new IllegalArgumentException("Should precompose before resolving nested prefetch states");
                        }
                        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                        y7.b(new C1966k(xVar, 1));
                        List list2 = (List) xVar.f12720k;
                        if (list2 != null) {
                            kVar = new Y.k();
                            kVar.f9987e = this;
                            kVar.f9985c = list2;
                            kVar.f9986d = new List[list2.size()];
                            if (list2.isEmpty()) {
                                throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                            }
                        } else {
                            kVar = null;
                        }
                        this.f17604h = kVar;
                        this.f17603g = true;
                    } finally {
                    }
                }
                Y.k kVar2 = this.f17604h;
                if (kVar2 != null) {
                    List[] listArr = (List[]) kVar2.f9986d;
                    int i7 = kVar2.a;
                    List list3 = (List) kVar2.f9985c;
                    if (i7 < list3.size()) {
                        if (((C2316P) kVar2.f9987e).f17602f) {
                            throw new IllegalStateException("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:nested");
                        while (kVar2.a < list3.size()) {
                            try {
                                if (listArr[kVar2.a] == null) {
                                    if (rVar.a() <= 0) {
                                        return true;
                                    }
                                    int i8 = kVar2.a;
                                    C2306F c2306f = (C2306F) list3.get(i8);
                                    ?? r11 = c2306f.a;
                                    if (r11 == 0) {
                                        list = P3.y.f7779k;
                                    } else {
                                        C2304D c2304d = new C2304D(c2306f);
                                        r11.invoke(c2304d);
                                        list = c2304d.a;
                                    }
                                    listArr[i8] = list;
                                }
                                List list4 = listArr[kVar2.a];
                                kotlin.jvm.internal.l.c(list4);
                                while (kVar2.f9984b < list4.size()) {
                                    if (((C2316P) list4.get(kVar2.f9984b)).b(rVar)) {
                                        return true;
                                    }
                                    kVar2.f9984b++;
                                }
                                kVar2.f9984b = 0;
                                kVar2.a++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
            }
            if (!this.f17601e) {
                long j7 = this.f17598b;
                if (!T0.a.k(j7)) {
                    long jC2 = (objD == null || ((C1503x) w7.f7369n).b(objD) < 0) ? w7.f7367l : ((C1503x) w7.f7369n).c(objD);
                    long jA2 = rVar.a();
                    if ((!this.f17605i || jA2 <= 0) && jC2 >= jA2) {
                        return true;
                    }
                    long jNanoTime3 = System.nanoTime();
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        e(j7);
                        Trace.endSection();
                        long jNanoTime4 = System.nanoTime() - jNanoTime3;
                        if (objD != null) {
                            C1503x c1503x2 = (C1503x) w7.f7369n;
                            int iB2 = c1503x2.b(objD);
                            ((C1503x) w7.f7369n).e(W.a(w7, jNanoTime4, iB2 >= 0 ? c1503x2.f12936c[iB2] : 0L), objD);
                        }
                        w7.f7367l = W.a(w7, jNanoTime4, w7.f7367l);
                        return false;
                    } finally {
                    }
                }
            }
        }
        return false;
    }

    public final boolean c() {
        if (this.f17602f) {
            return false;
        }
        int iB = ((InterfaceC2339t) ((C2338s) this.f17606j.f416l).f17640b.invoke()).b();
        int i7 = this.a;
        return i7 >= 0 && i7 < iB;
    }

    @Override // y.InterfaceC2305E
    public final void cancel() {
        if (this.f17602f) {
            return;
        }
        this.f17602f = true;
        Y y7 = this.f17600d;
        if (y7 != null) {
            y7.dispose();
        }
        this.f17600d = null;
    }

    public final void d() {
        if (!c()) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()");
        }
        if (this.f17600d != null) {
            throw new IllegalArgumentException("Request was already composed!");
        }
        B2.l lVar = this.f17606j;
        InterfaceC2339t interfaceC2339t = (InterfaceC2339t) ((C2338s) lVar.f416l).f17640b.invoke();
        int i7 = this.a;
        Object objC = interfaceC2339t.c(i7);
        this.f17600d = ((a0) lVar.f417m).a().g(objC, ((C2338s) lVar.f416l).a(i7, objC, interfaceC2339t.d(i7)));
    }

    public final void e(long j7) {
        if (this.f17602f) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f17601e) {
            throw new IllegalArgumentException("Request was already measured!");
        }
        this.f17601e = true;
        Y y7 = this.f17600d;
        if (y7 == null) {
            throw new IllegalArgumentException("performComposition() must be called before performMeasure()");
        }
        int iA = y7.a();
        for (int i7 = 0; i7 < iA; i7++) {
            y7.c(i7, j7);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.a);
        sb.append(", constraints = ");
        sb.append((Object) T0.a.l(this.f17598b));
        sb.append(", isComposed = ");
        sb.append(this.f17600d != null);
        sb.append(", isMeasured = ");
        sb.append(this.f17601e);
        sb.append(", isCanceled = ");
        sb.append(this.f17602f);
        sb.append(" }");
        return sb.toString();
    }
}
