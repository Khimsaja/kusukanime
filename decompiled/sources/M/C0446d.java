package M;

import p.AbstractC1745d;

/* renamed from: M.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0446d extends U3.j implements e4.p {

    /* renamed from: k, reason: collision with root package name */
    public int f6283k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ C0458p f6284l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ B f6285m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f6286n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0460s f6287o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f6288p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0446d(C0460s c0460s, float f5, S3.c cVar) {
        super(4, cVar);
        this.f6287o = c0460s;
        this.f6288p = f5;
    }

    @Override // e4.p
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C0446d c0446d = new C0446d(this.f6287o, this.f6288p, (S3.c) obj4);
        c0446d.f6284l = (C0458p) obj;
        c0446d.f6285m = (B) obj2;
        c0446d.f6286n = obj3;
        return c0446d.invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f6283k;
        if (i7 == 0) {
            P3.r.Y(obj);
            C0458p c0458p = this.f6284l;
            float fD = this.f6285m.d(this.f6286n);
            if (!Float.isNaN(fD)) {
                kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                C0460s c0460s = this.f6287o;
                float f5 = Float.isNaN(c0460s.f6340j.f()) ? 0.0f : c0460s.f6340j.f();
                uVar.f12717k = f5;
                H.M m7 = new H.M(10, c0458p, uVar);
                this.f6284l = null;
                this.f6285m = null;
                this.f6283k = 1;
                if (AbstractC1745d.c(f5, fD, this.f6288p, c0460s.f6333c, m7, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        return O3.C.a;
    }
}
