package s;

import f6.AbstractC0915m;
import java.util.concurrent.CancellationException;
import p.C1724K;
import s0.C1955C;

/* renamed from: s.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1900H extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15130k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15131l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P f15132m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1955C f15133n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ D.F0 f15134o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1724K f15135p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1901I f15136q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1901I f15137r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ H.M f15138s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1900H(P p7, C1955C c1955c, D.F0 f02, C1724K c1724k, C1901I c1901i, C1901I c1901i2, H.M m7, S3.c cVar) {
        super(2, cVar);
        this.f15132m = p7;
        this.f15133n = c1955c;
        this.f15134o = f02;
        this.f15135p = c1724k;
        this.f15136q = c1901i;
        this.f15137r = c1901i2;
        this.f15138s = m7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C1901I c1901i = this.f15137r;
        H.M m7 = this.f15138s;
        C1900H c1900h = new C1900H(this.f15132m, this.f15133n, this.f15134o, this.f15135p, this.f15136q, c1901i, m7, cVar);
        c1900h.f15131l = obj;
        return c1900h;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1900H) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [H5.A] */
    /* JADX WARN: Type inference failed for: r1v3, types: [H5.A, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [H5.A] */
    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        ?? r12 = this.f15130k;
        O3.C c2 = O3.C.a;
        P p7 = this.f15132m;
        try {
            if (r12 == 0) {
                P3.r.Y(obj);
                r12 = (H5.A) this.f15131l;
                EnumC1903a0 enumC1903a0 = p7.f15199z;
                C1955C c1955c = this.f15133n;
                D.F0 f02 = this.f15134o;
                C1724K c1724k = this.f15135p;
                C1901I c1901i = this.f15136q;
                C1901I c1901i2 = this.f15137r;
                H.M m7 = this.f15138s;
                this.f15131l = r12;
                this.f15130k = 1;
                float f5 = AbstractC1899G.a;
                Object objF = AbstractC0915m.f(c1955c, new C1895C(c1901i2, new kotlin.jvm.internal.w(), enumC1903a0, f02, m7, c1901i, c1724k, null), this);
                if (objF != aVar) {
                    objF = c2;
                }
                if (objF == aVar) {
                    return aVar;
                }
            } else {
                if (r12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r12 = (H5.A) this.f15131l;
                P3.r.Y(obj);
            }
        } catch (CancellationException e7) {
            J5.e eVar = p7.f15195D;
            if (eVar != null) {
                eVar.mo2trySendJP2dKIU(C1937s.a);
            }
            if (!H5.D.u(r12)) {
                throw e7;
            }
        }
        return c2;
    }
}
