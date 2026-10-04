package p;

import D.C0056i;
import java.util.concurrent.CancellationException;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1739a extends U3.j implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public C1761m f13939k;

    /* renamed from: l, reason: collision with root package name */
    public kotlin.jvm.internal.t f13940l;

    /* renamed from: m, reason: collision with root package name */
    public int f13941m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1743c f13942n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f13943o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n0 f13944p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f13945q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1739a(C1743c c1743c, Object obj, n0 n0Var, long j7, S3.c cVar) {
        super(1, cVar);
        this.f13942n = c1743c;
        this.f13943o = obj;
        this.f13944p = n0Var;
        this.f13945q = j7;
    }

    @Override // U3.a
    public final S3.c create(S3.c cVar) {
        return new C1739a(this.f13942n, this.f13943o, this.f13944p, this.f13945q, cVar);
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        return ((C1739a) create((S3.c) obj)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1761m c1761m;
        kotlin.jvm.internal.t tVar;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f13941m;
        int i8 = 1;
        C1743c c1743c = this.f13942n;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                c1743c.f13958c.f14049m = (AbstractC1766r) c1743c.a.a.invoke(this.f13943o);
                n0 n0Var = this.f13944p;
                c1743c.f13960e.setValue(n0Var.f14076c);
                c1743c.f13959d.setValue(Boolean.TRUE);
                C1761m c1761m2 = c1743c.f13958c;
                C1761m c1761m3 = new C1761m(c1761m2.f14047k, c1761m2.f14048l.getValue(), AbstractC1745d.k(c1761m2.f14049m), c1761m2.f14050n, Long.MIN_VALUE, c1761m2.f14052p);
                kotlin.jvm.internal.t tVar2 = new kotlin.jvm.internal.t();
                long j7 = this.f13945q;
                C0056i c0056i = new C0056i(c1743c, c1761m3, tVar2, 15);
                this.f13939k = c1761m3;
                this.f13940l = tVar2;
                this.f13941m = 1;
                if (AbstractC1745d.d(c1761m3, n0Var, j7, c0056i, this) == aVar) {
                    return aVar;
                }
                c1761m = c1761m3;
                tVar = tVar2;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tVar = this.f13940l;
                c1761m = this.f13939k;
                P3.r.Y(obj);
            }
            if (!tVar.f12716k) {
                i8 = 2;
            }
            C1743c.b(c1743c);
            return new C1757j(c1761m, i8);
        } catch (CancellationException e7) {
            C1743c.b(c1743c);
            throw e7;
        }
    }
}
