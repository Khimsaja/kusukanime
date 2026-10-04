package p;

import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import f1.AbstractC0870c;
import io.ktor.util.GzipHeaderFlags;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f14074l;

    /* renamed from: m, reason: collision with root package name */
    public static final m0 f14060m = new m0(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final m0 f14061n = new m0(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final m0 f14062o = new m0(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final m0 f14063p = new m0(1, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final m0 f14064q = new m0(1, 4);

    /* renamed from: r, reason: collision with root package name */
    public static final m0 f14065r = new m0(1, 5);

    /* renamed from: s, reason: collision with root package name */
    public static final m0 f14066s = new m0(1, 6);

    /* renamed from: t, reason: collision with root package name */
    public static final m0 f14067t = new m0(1, 7);

    /* renamed from: u, reason: collision with root package name */
    public static final m0 f14068u = new m0(1, 8);

    /* renamed from: v, reason: collision with root package name */
    public static final m0 f14069v = new m0(1, 9);

    /* renamed from: w, reason: collision with root package name */
    public static final m0 f14070w = new m0(1, 10);

    /* renamed from: x, reason: collision with root package name */
    public static final m0 f14071x = new m0(1, 11);

    /* renamed from: y, reason: collision with root package name */
    public static final m0 f14072y = new m0(1, 12);

    /* renamed from: z, reason: collision with root package name */
    public static final m0 f14073z = new m0(1, 13);

    /* renamed from: A, reason: collision with root package name */
    public static final m0 f14053A = new m0(1, 14);

    /* renamed from: B, reason: collision with root package name */
    public static final m0 f14054B = new m0(1, 15);

    /* renamed from: C, reason: collision with root package name */
    public static final m0 f14055C = new m0(1, 16);

    /* renamed from: D, reason: collision with root package name */
    public static final m0 f14056D = new m0(1, 17);

    /* renamed from: E, reason: collision with root package name */
    public static final m0 f14057E = new m0(1, 18);

    /* renamed from: F, reason: collision with root package name */
    public static final m0 f14058F = new m0(1, 19);

    /* renamed from: G, reason: collision with root package name */
    public static final m0 f14059G = new m0(1, 20);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i7, int i8) {
        super(i7);
        this.f14074l = i8;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [O3.i, java.lang.Object] */
    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f14074l) {
            case 0:
                return O3.C.a;
            case 1:
                ((InterfaceC0821a) obj).invoke();
                return O3.C.a;
            case 2:
                C1746d0 c1746d0 = (C1746d0) obj;
                long j7 = c1746d0.f13986p;
                ((Y.u) z0.a.getValue()).d(c1746d0, f14062o, c1746d0.f13987q);
                long j8 = c1746d0.f13986p;
                if (j7 != j8) {
                    C1731S c1731s = c1746d0.f13994x;
                    if (c1731s != null) {
                        c1731s.f13906g = j8;
                        if (c1731s.f13901b == null) {
                            c1731s.f13907h = P3.F.X((1.0d - c1731s.f13904e.a(0)) * c1746d0.f13986p);
                        }
                    } else if (j8 != 0) {
                        c1746d0.T0();
                    }
                }
                return O3.C.a;
            case 3:
                long j9 = ((T0.f) obj).a;
                return new C1763o(Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)));
            case GzipHeaderFlags.EXTRA /* 4 */:
                C1763o c1763o = (C1763o) obj;
                return new T0.f((Float.floatToRawIntBits(c1763o.a) << 32) | (Float.floatToRawIntBits(c1763o.f14083b) & 4294967295L));
            case 5:
                return new C1762n(((T0.e) obj).f8839k);
            case 6:
                return new T0.e(((C1762n) obj).a);
            case 7:
                return new C1762n(((Number) obj).floatValue());
            case 8:
                return Float.valueOf(((C1762n) obj).a);
            case 9:
                long j10 = ((T0.h) obj).a;
                return new C1763o((int) (j10 >> 32), (int) (j10 & 4294967295L));
            case 10:
                C1763o c1763o2 = (C1763o) obj;
                return new T0.h(P3.F.b(Math.round(c1763o2.a), Math.round(c1763o2.f14083b)));
            case 11:
                long j11 = ((T0.j) obj).a;
                return new C1763o((int) (j11 >> 32), (int) (j11 & 4294967295L));
            case 12:
                C1763o c1763o3 = (C1763o) obj;
                int iRound = Math.round(c1763o3.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(c1763o3.f14083b);
                return new T0.j(AbstractC1420H.a(iRound, iRound2 >= 0 ? iRound2 : 0));
            case 13:
                return new C1762n(((Number) obj).intValue());
            case 14:
                return Integer.valueOf((int) ((C1762n) obj).a);
            case 15:
                long j12 = ((g0.c) obj).a;
                return new C1763o(g0.c.d(j12), g0.c.e(j12));
            case 16:
                C1763o c1763o4 = (C1763o) obj;
                return new g0.c(AbstractC0832b.e(c1763o4.a, c1763o4.f14083b));
            case 17:
                g0.d dVar = (g0.d) obj;
                return new C1765q(dVar.a, dVar.f11659b, dVar.f11660c, dVar.f11661d);
            case 18:
                C1765q c1765q = (C1765q) obj;
                return new g0.d(c1765q.a, c1765q.f14092b, c1765q.f14093c, c1765q.f14094d);
            case 19:
                long j13 = ((g0.f) obj).a;
                return new C1763o(g0.f.d(j13), g0.f.b(j13));
            default:
                C1763o c1763o5 = (C1763o) obj;
                return new g0.f(AbstractC0870c.F(c1763o5.a, c1763o5.f14083b));
        }
    }
}
