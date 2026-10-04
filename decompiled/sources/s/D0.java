package s;

import e5.AbstractC0832b;
import o.C1622t;
import y0.AbstractC2359f;

/* loaded from: classes.dex */
public final class D0 {
    public InterfaceC1946w0 a;

    /* renamed from: b, reason: collision with root package name */
    public q.e0 f15098b;

    /* renamed from: c, reason: collision with root package name */
    public X f15099c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC1903a0 f15100d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15101e;

    /* renamed from: f, reason: collision with root package name */
    public r0.e f15102f;

    /* renamed from: g, reason: collision with root package name */
    public int f15103g = 1;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1911e0 f15104h = androidx.compose.foundation.gestures.a.a;

    /* renamed from: i, reason: collision with root package name */
    public final A0 f15105i = new A0(this);

    /* renamed from: j, reason: collision with root package name */
    public final C1622t f15106j = new C1622t(8, this);

    public D0(InterfaceC1946w0 interfaceC1946w0, q.e0 e0Var, X x7, EnumC1903a0 enumC1903a0, boolean z7, r0.e eVar) {
        this.a = interfaceC1946w0;
        this.f15098b = e0Var;
        this.f15099c = x7;
        this.f15100d = enumC1903a0;
        this.f15101e = z7;
        this.f15102f = eVar;
    }

    public static final long a(D0 d02, InterfaceC1911e0 interfaceC1911e0, long j7, int i7) {
        r0.h hVar = d02.f15102f.a;
        r0.h hVar2 = null;
        r0.h hVar3 = (hVar == null || !hVar.f10414w) ? null : (r0.h) AbstractC2359f.k(hVar);
        long jL0 = hVar3 != null ? hVar3.l0(i7, j7) : 0L;
        long jG = g0.c.g(j7, jL0);
        long jD = d02.d(d02.g(interfaceC1911e0.a(d02.f(d02.d(g0.c.a(jG, 0.0f, d02.f15100d == EnumC1903a0.f15260l ? 1 : 2))))));
        long jG2 = g0.c.g(jG, jD);
        r0.h hVar4 = d02.f15102f.a;
        if (hVar4 != null && hVar4.f10414w) {
            hVar2 = (r0.h) AbstractC2359f.k(hVar4);
        }
        r0.h hVar5 = hVar2;
        return g0.c.h(g0.c.h(jL0, jD), hVar5 != null ? hVar5.M(i7, jD, jG2) : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r11, U3.c r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof s.C1948x0
            if (r0 == 0) goto L13
            r0 = r13
            s.x0 r0 = (s.C1948x0) r0
            int r1 = r0.f15404n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15404n = r1
            goto L18
        L13:
            s.x0 r0 = new s.x0
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f15402l
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f15404n
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.jvm.internal.w r11 = r0.f15401k
            P3.r.Y(r13)
            r5 = r10
            goto L52
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            P3.r.Y(r13)
            kotlin.jvm.internal.w r6 = new kotlin.jvm.internal.w
            r6.<init>()
            r6.f12719k = r11
            q.X r13 = q.X.f14513k
            s.z0 r4 = new s.z0
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r9)
            r0.f15401k = r6
            r0.f15404n = r3
            java.lang.Object r11 = r10.e(r13, r4, r0)
            if (r11 != r1) goto L51
            return r1
        L51:
            r11 = r6
        L52:
            long r11 = r11.f12719k
            T0.o r13 = new T0.o
            r13.<init>(r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: s.D0.b(long, U3.c):java.lang.Object");
    }

    public final float c(float f5) {
        return this.f15101e ? f5 * (-1) : f5;
    }

    public final long d(long j7) {
        return this.f15101e ? g0.c.i(-1.0f, j7) : j7;
    }

    public final Object e(q.X x7, e4.n nVar, U3.c cVar) {
        Object objE = this.a.e(x7, new C0(this, nVar, null), cVar);
        return objE == T3.a.f9048k ? objE : O3.C.a;
    }

    public final float f(long j7) {
        return this.f15100d == EnumC1903a0.f15260l ? g0.c.d(j7) : g0.c.e(j7);
    }

    public final long g(float f5) {
        if (f5 == 0.0f) {
            return 0L;
        }
        return this.f15100d == EnumC1903a0.f15260l ? AbstractC0832b.e(f5, 0.0f) : AbstractC0832b.e(0.0f, f5);
    }
}
