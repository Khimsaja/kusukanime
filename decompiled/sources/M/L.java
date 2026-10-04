package M;

import H0.C0217i;
import O.C0510p;
import h0.AbstractC0968M;
import h0.AbstractC0971P;
import h0.AbstractC0993p;
import h0.C0972Q;
import h0.C0975U;
import h0.C0998u;
import io.ktor.client.utils.CIOKt;
import j0.AbstractC1299e;
import p.s0;

/* loaded from: classes.dex */
public final class L extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H0.I f6222l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H0.I f6223m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f6224n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s0 f6225o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ W.a f6226p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f6227q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s0 f6228r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(H0.I i7, H0.I i8, float f5, s0 s0Var, W.a aVar, boolean z7, s0 s0Var2) {
        super(2);
        this.f6222l = i7;
        this.f6223m = i8;
        this.f6224n = f5;
        this.f6225o = s0Var;
        this.f6226p = aVar;
        this.f6227q = z7;
        this.f6228r = s0Var2;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        H0.v vVar;
        H0.u uVar;
        C0510p c0510p = (C0510p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            H0.I i7 = this.f6222l;
            H0.I i8 = this.f6223m;
            S0.m mVar = H0.C.f3072d;
            H0.B b4 = i7.a;
            S0.m mVar2 = b4.a;
            H0.B b7 = i8.a;
            S0.m mVar3 = b7.a;
            boolean z7 = mVar2 instanceof S0.b;
            S0.m bVar = S0.l.a;
            float f5 = this.f6224n;
            if (!z7 && !(mVar3 instanceof S0.b)) {
                long jO = AbstractC0968M.o(f5, mVar2.b(), mVar3.b());
                if (jO != 16) {
                    bVar = new S0.c(jO);
                }
            } else if (z7 && (mVar3 instanceof S0.b)) {
                AbstractC0993p abstractC0993p = (AbstractC0993p) H0.C.b(((S0.b) mVar2).a, ((S0.b) mVar3).a, f5);
                float fG = P3.F.G(((S0.b) mVar2).f8706b, ((S0.b) mVar3).f8706b, f5);
                if (abstractC0993p != null) {
                    if (abstractC0993p instanceof C0975U) {
                        long jB = android.support.v4.media.session.b.B(fG, ((C0975U) abstractC0993p).a);
                        if (jB != 16) {
                            bVar = new S0.c(jB);
                        }
                    } else {
                        if (!(abstractC0993p instanceof AbstractC0971P)) {
                            throw new D6.r();
                        }
                        bVar = new S0.b((AbstractC0971P) abstractC0993p, fG);
                    }
                }
            } else {
                bVar = (S0.m) H0.C.b(mVar2, mVar3, f5);
            }
            S0.m mVar4 = bVar;
            M0.j jVar = (M0.j) H0.C.b(b4.f3059f, b7.f3059f, f5);
            long jC = H0.C.c(f5, b4.f3055b, b7.f3055b);
            M0.u uVar2 = b4.f3056c;
            if (uVar2 == null) {
                uVar2 = M0.u.f6415o;
            }
            M0.u uVar3 = b7.f3056c;
            if (uVar3 == null) {
                uVar3 = M0.u.f6415o;
            }
            M0.u uVar4 = new M0.u(e3.c.k(P3.F.H(f5, uVar2.f6419k, uVar3.f6419k), 1, CIOKt.DEFAULT_HTTP_POOL_SIZE));
            M0.q qVar = (M0.q) H0.C.b(b4.f3057d, b7.f3057d, f5);
            M0.r rVar = (M0.r) H0.C.b(b4.f3058e, b7.f3058e, f5);
            String str = (String) H0.C.b(b4.f3060g, b7.f3060g, f5);
            long jC2 = H0.C.c(f5, b4.f3061h, b7.f3061h);
            S0.a aVar = b4.f3062i;
            float f7 = aVar != null ? aVar.a : 0.0f;
            S0.a aVar2 = b7.f3062i;
            float fG2 = P3.F.G(f7, aVar2 != null ? aVar2.a : 0.0f, f5);
            S0.n nVar = S0.n.f8718c;
            S0.n nVar2 = b4.f3063j;
            if (nVar2 == null) {
                nVar2 = nVar;
            }
            S0.n nVar3 = b7.f3063j;
            if (nVar3 != null) {
                nVar = nVar3;
            }
            S0.n nVar4 = new S0.n(P3.F.G(nVar2.a, nVar.a, f5), P3.F.G(nVar2.f8719b, nVar.f8719b, f5));
            O0.b bVar2 = (O0.b) H0.C.b(b4.f3064k, b7.f3064k, f5);
            long jO2 = AbstractC0968M.o(f5, b4.f3065l, b7.f3065l);
            S0.j jVar2 = (S0.j) H0.C.b(b4.f3066m, b7.f3066m, f5);
            C0972Q c0972q = b4.f3067n;
            if (c0972q == null) {
                c0972q = new C0972Q();
            }
            C0972Q c0972q2 = b7.f3067n;
            if (c0972q2 == null) {
                c0972q2 = new C0972Q();
            }
            long jO3 = AbstractC0968M.o(f5, c0972q.a, c0972q2.a);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (c0972q.f11802b >> 32));
            long j7 = c0972q2.f11802b;
            C0972Q c0972q3 = new C0972Q(P3.F.G(c0972q.f11803c, c0972q2.f11803c, f5), jO3, (Float.floatToRawIntBits(P3.F.G(fIntBitsToFloat, Float.intBitsToFloat((int) (j7 >> 32)), f5)) << 32) | (Float.floatToRawIntBits(P3.F.G(Float.intBitsToFloat((int) (r9 & 4294967295L)), Float.intBitsToFloat((int) (j7 & 4294967295L)), f5)) & 4294967295L));
            H0.v vVar2 = b4.f3068o;
            if (vVar2 == null && b7.f3068o == null) {
                vVar = null;
            } else {
                if (vVar2 == null) {
                    vVar2 = H0.v.a;
                }
                vVar = vVar2;
            }
            H0.B b8 = new H0.B(mVar4, jC, uVar4, qVar, rVar, jVar, str, jC2, new S0.a(fG2), nVar4, bVar2, jO2, jVar2, c0972q3, vVar, (AbstractC1299e) H0.C.b(b4.f3069p, b7.f3069p, f5));
            int i9 = H0.t.f3153b;
            H0.s sVar = i7.f3094b;
            S0.i iVar = new S0.i(sVar.a);
            H0.s sVar2 = i8.f3094b;
            int i10 = ((S0.i) H0.C.b(iVar, new S0.i(sVar2.a), f5)).a;
            int i11 = ((S0.k) H0.C.b(new S0.k(sVar.f3145b), new S0.k(sVar2.f3145b), f5)).a;
            long jC3 = H0.C.c(f5, sVar.f3146c, sVar2.f3146c);
            S0.o oVar = sVar.f3147d;
            if (oVar == null) {
                oVar = S0.o.f8720c;
            }
            S0.o oVar2 = sVar2.f3147d;
            if (oVar2 == null) {
                oVar2 = S0.o.f8720c;
            }
            S0.o oVar3 = new S0.o(H0.C.c(f5, oVar.a, oVar2.a), H0.C.c(f5, oVar.f8721b, oVar2.f8721b));
            H0.u uVar5 = sVar.f3148e;
            H0.u uVar6 = sVar2.f3148e;
            if (uVar5 == null && uVar6 == null) {
                uVar = null;
            } else {
                H0.u uVar7 = H0.u.f3154b;
                if (uVar5 == null) {
                    uVar5 = uVar7;
                }
                if (uVar6 == null) {
                    uVar6 = uVar7;
                }
                boolean z8 = uVar5.a;
                boolean z9 = uVar6.a;
                if (z8 != z9) {
                    ((C0217i) H0.C.b(new C0217i(), new C0217i(), f5)).getClass();
                    uVar5 = new H0.u(((Boolean) H0.C.b(Boolean.valueOf(z8), Boolean.valueOf(z9), f5)).booleanValue());
                }
                uVar = uVar5;
            }
            H0.I i12 = new H0.I(b8, new H0.s(i10, i11, jC3, oVar3, uVar, (S0.g) H0.C.b(sVar.f3149f, sVar2.f3149f, f5), ((S0.e) H0.C.b(new S0.e(sVar.f3150g), new S0.e(sVar2.f3150g), f5)).a, ((S0.d) H0.C.b(new S0.d(sVar.f3151h), new S0.d(sVar2.f3151h), f5)).a, (S0.p) H0.C.b(sVar.f3152i, sVar2.f3152i, f5)));
            if (this.f6227q) {
                i12 = H0.I.a(i12, ((C0998u) this.f6228r.f14105t.getValue()).a, 0L, null, null, 0L, 0L, null, 16777214);
            }
            W.b(((C0998u) this.f6225o.f14105t.getValue()).a, i12, this.f6226p, c0510p, 0);
        }
        return O3.C.a;
    }
}
