package D;

import O.C0502l;
import O.C0510p;
import e4.InterfaceC0821a;
import s.EnumC1903a0;

/* renamed from: D.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0079x extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ N0.q f1324A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ T0.b f1325B;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0053g0 f1326l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H0.I f1327m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1328n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1329o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ J0 f1330p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ N0.w f1331q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I1.e f1332r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a0.q f1333s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a0.q f1334t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a0.q f1335u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a0.q f1336v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ A.c f1337w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ H.S f1338x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f1339y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f1340z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0079x(C0053g0 c0053g0, H0.I i7, int i8, int i9, J0 j02, N0.w wVar, I1.e eVar, a0.q qVar, a0.q qVar2, a0.q qVar3, a0.q qVar4, A.c cVar, H.S s7, boolean z7, e4.k kVar, N0.q qVar5, T0.b bVar) {
        super(2);
        this.f1326l = c0053g0;
        this.f1327m = i7;
        this.f1328n = i8;
        this.f1329o = i9;
        this.f1330p = j02;
        this.f1331q = wVar;
        this.f1332r = eVar;
        this.f1333s = qVar;
        this.f1334t = qVar2;
        this.f1335u = qVar3;
        this.f1336v = qVar4;
        this.f1337w = cVar;
        this.f1338x = s7;
        this.f1339y = z7;
        this.f1340z = (kotlin.jvm.internal.m) kVar;
        this.f1324A = qVar5;
        this.f1325B = bVar;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        a0.q q02;
        C0510p c0510p = (C0510p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            a0.n nVar = a0.n.a;
            C0053g0 c0053g0 = this.f1326l;
            a0.q qVarG = androidx.compose.foundation.layout.c.g(nVar, ((T0.e) c0053g0.f1148g.getValue()).f8839k, 0.0f, 2);
            int i7 = this.f1328n;
            int i8 = this.f1329o;
            H0.I i9 = this.f1327m;
            a0.q qVarA = a0.a.a(qVarG, new X(i7, i8, i9));
            boolean zH = c0510p.h(c0053g0);
            Object objH = c0510p.H();
            if (zH || objH == C0502l.a) {
                objH = new B.e(2, c0053g0);
                c0510p.b0(objH);
            }
            InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH;
            J0 j02 = this.f1330p;
            EnumC1903a0 enumC1903a0 = (EnumC1903a0) j02.f1060e.getValue();
            N0.w wVar = this.f1331q;
            int i10 = H0.H.f3092c;
            long j7 = wVar.f6896b;
            int iE = (int) (j7 >> 32);
            long j8 = j02.f1059d;
            if (iE == ((int) (j8 >> 32)) && (iE = (int) (j7 & 4294967295L)) == ((int) (j8 & 4294967295L))) {
                iE = H0.H.e(j7);
            }
            j02.f1059d = j7;
            N0.C cL = AbstractC0047d0.l(this.f1332r, wVar.a);
            int iOrdinal = enumC1903a0.ordinal();
            if (iOrdinal == 0) {
                q02 = new Q0(j02, iE, cL, interfaceC0821a);
            } else {
                if (iOrdinal != 1) {
                    throw new D6.r();
                }
                q02 = new Z(j02, iE, cL, interfaceC0821a);
            }
            z1.c.d(androidx.compose.foundation.relocation.a.a(a0.a.a(q0.c.p(qVarA).k(q02).k(this.f1333s).k(this.f1334t), new M0(1, i9)).k(this.f1335u).k(this.f1336v), this.f1337w), W.f.b(-363167407, new C0078w(this.f1338x, c0053g0, this.f1339y, this.f1340z, wVar, this.f1324A, this.f1325B, this.f1329o), c0510p), c0510p, 48);
        }
        return O3.C.a;
    }
}
