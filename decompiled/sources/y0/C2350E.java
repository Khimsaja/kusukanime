package y0;

import e5.AbstractC0832b;
import h0.C0970O;
import java.util.HashMap;
import java.util.Map;
import o.C1622t;
import w0.AbstractC2185c;
import w0.C2196n;

/* renamed from: y0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2350E {
    public final w0.S a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17688c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17689d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17690e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17691f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17692g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC2354a f17693h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f17695j;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17687b = true;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f17694i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public C2350E(InterfaceC2354a interfaceC2354a, int i7) {
        this.f17695j = i7;
        this.a = (w0.S) interfaceC2354a;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [e4.n, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r8v4, types: [w0.S, y0.a] */
    public static final void a(C2350E c2350e, C2196n c2196n, int i7, Y y7) {
        c2350e.getClass();
        float f5 = i7;
        long jE = AbstractC0832b.e(f5, f5);
        while (true) {
            switch (c2350e.f17695j) {
                case 0:
                    C0970O c0970o = Y.f17808O;
                    jE = y7.h1(jE);
                    break;
                default:
                    O oN0 = y7.N0();
                    kotlin.jvm.internal.l.c(oN0);
                    long j7 = oN0.f17778w;
                    jE = g0.c.h(AbstractC0832b.e((int) (j7 >> 32), (int) (j7 & 4294967295L)), jE);
                    break;
            }
            y7 = y7.f17827x;
            kotlin.jvm.internal.l.c(y7);
            if (y7.equals(c2350e.a.j())) {
                int iRound = Math.round(c2196n instanceof C2196n ? g0.c.e(jE) : g0.c.d(jE));
                HashMap map = c2350e.f17694i;
                if (map.containsKey(c2196n)) {
                    int iIntValue = ((Number) P3.E.m0(c2196n, map)).intValue();
                    C2196n c2196n2 = AbstractC2185c.a;
                    iRound = ((Number) c2196n.a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                }
                map.put(c2196n, Integer.valueOf(iRound));
                return;
            }
            if (c2350e.b(y7).containsKey(c2196n)) {
                float fC = c2350e.c(y7, c2196n);
                jE = AbstractC0832b.e(fC, fC);
            }
        }
    }

    public final Map b(Y y7) {
        switch (this.f17695j) {
            case 0:
                return y7.y0().m();
            default:
                O oN0 = y7.N0();
                kotlin.jvm.internal.l.c(oN0);
                return oN0.y0().m();
        }
    }

    public final int c(Y y7, C2196n c2196n) {
        switch (this.f17695j) {
            case 0:
                return y7.c0(c2196n);
            default:
                O oN0 = y7.N0();
                kotlin.jvm.internal.l.c(oN0);
                return oN0.c0(c2196n);
        }
    }

    public final boolean d() {
        return this.f17688c || this.f17690e || this.f17691f || this.f17692g;
    }

    public final boolean e() {
        h();
        return this.f17693h != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [w0.S, y0.a] */
    public final void f() {
        this.f17687b = true;
        ?? r02 = this.a;
        InterfaceC2354a interfaceC2354aL = r02.l();
        if (interfaceC2354aL == null) {
            return;
        }
        if (this.f17688c) {
            interfaceC2354aL.X();
        } else if (this.f17690e || this.f17689d) {
            interfaceC2354aL.requestLayout();
        }
        if (this.f17691f) {
            r02.X();
        }
        if (this.f17692g) {
            r02.requestLayout();
        }
        interfaceC2354aL.m().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [w0.S, y0.a] */
    public final void g() {
        HashMap map = this.f17694i;
        map.clear();
        C1622t c1622t = new C1622t(14, this);
        ?? r2 = this.a;
        r2.E(c1622t);
        map.putAll(b(r2.j()));
        this.f17687b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [w0.S, y0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r2 = this;
            boolean r0 = r2.d()
            w0.S r1 = r2.a
            if (r0 == 0) goto L9
            goto L51
        L9:
            y0.a r0 = r1.l()
            if (r0 != 0) goto L10
            goto L53
        L10:
            y0.E r0 = r0.m()
            y0.a r1 = r0.f17693h
            if (r1 == 0) goto L23
            y0.E r0 = r1.m()
            boolean r0 = r0.d()
            if (r0 == 0) goto L23
            goto L51
        L23:
            y0.a r0 = r2.f17693h
            if (r0 == 0) goto L53
            y0.E r1 = r0.m()
            boolean r1 = r1.d()
            if (r1 == 0) goto L32
            goto L53
        L32:
            y0.a r1 = r0.l()
            if (r1 == 0) goto L41
            y0.E r1 = r1.m()
            if (r1 == 0) goto L41
            r1.h()
        L41:
            y0.a r0 = r0.l()
            if (r0 == 0) goto L50
            y0.E r0 = r0.m()
            if (r0 == 0) goto L50
            y0.a r1 = r0.f17693h
            goto L51
        L50:
            r1 = 0
        L51:
            r2.f17693h = r1
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.C2350E.h():void");
    }
}
