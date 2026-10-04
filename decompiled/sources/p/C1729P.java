package p;

import H5.C0263e0;
import H5.InterfaceC0265f0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: p.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1729P extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public R5.a f13893k;

    /* renamed from: l, reason: collision with root package name */
    public Object f13894l;

    /* renamed from: m, reason: collision with root package name */
    public C1730Q f13895m;

    /* renamed from: n, reason: collision with root package name */
    public int f13896n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f13897o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1730Q f13898p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ U3.j f13899q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1729P(C1730Q c1730q, e4.k kVar, S3.c cVar) {
        super(2, cVar);
        this.f13898p = c1730q;
        this.f13899q = (U3.j) kVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [U3.j, e4.k] */
    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C1729P c1729p = new C1729P(this.f13898p, this.f13899q, cVar);
        c1729p.f13897o = obj;
        return c1729p;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1729P) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [e4.k] */
    /* JADX WARN: Type inference failed for: r5v5, types: [R5.a] */
    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1730Q c1730q;
        ?? r2;
        C1728O c1728o;
        R5.c cVar;
        R5.a aVar;
        C1730Q c1730q2;
        Throwable th;
        C1728O c1728o2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        T3.a aVar2 = T3.a.f9048k;
        ?? r12 = this.f13896n;
        try {
            try {
                if (r12 == 0) {
                    P3.r.Y(obj);
                    S3.f fVar = ((H5.A) this.f13897o).getCoroutineContext().get(C0263e0.f3843k);
                    kotlin.jvm.internal.l.c(fVar);
                    C1728O c1728o3 = new C1728O((InterfaceC0265f0) fVar);
                    while (true) {
                        c1730q = this.f13898p;
                        AtomicReference atomicReference3 = c1730q.a;
                        C1728O c1728o4 = (C1728O) atomicReference3.get();
                        if (c1728o4 != null && 1 - 1 < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(c1728o4, c1728o3)) {
                            if (atomicReference3.get() != c1728o4) {
                                break;
                            }
                        }
                        if (c1728o4 != null) {
                            c1728o4.a.e(new L5.o("Mutation interrupted", 3));
                        }
                        this.f13897o = c1728o3;
                        R5.c cVar2 = c1730q.f13900b;
                        this.f13893k = cVar2;
                        U3.j jVar = this.f13899q;
                        this.f13894l = jVar;
                        this.f13895m = c1730q;
                        this.f13896n = 1;
                        if (cVar2.c(this) != aVar2) {
                            r2 = jVar;
                            c1728o = c1728o3;
                            cVar = cVar2;
                        }
                    }
                    return aVar2;
                }
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1730q2 = (C1730Q) this.f13894l;
                    aVar = this.f13893k;
                    c1728o2 = (C1728O) this.f13897o;
                    try {
                        P3.r.Y(obj);
                        atomicReference2 = c1730q2.a;
                        while (!atomicReference2.compareAndSet(c1728o2, null) && atomicReference2.get() == c1728o2) {
                        }
                        ((R5.c) aVar).e(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = c1730q2.a;
                        while (!atomicReference.compareAndSet(c1728o2, null)) {
                        }
                        throw th;
                    }
                }
                C1730Q c1730q3 = this.f13895m;
                e4.k kVar = (e4.k) this.f13894l;
                ?? r52 = this.f13893k;
                c1728o = (C1728O) this.f13897o;
                P3.r.Y(obj);
                c1730q = c1730q3;
                r2 = kVar;
                cVar = r52;
                this.f13897o = c1728o;
                this.f13893k = aVar;
                this.f13894l = c1730q;
                this.f13895m = null;
                this.f13896n = 2;
                Object objInvoke = r2.invoke(this);
                if (objInvoke != aVar2) {
                    c1730q2 = c1730q;
                    obj = objInvoke;
                    c1728o2 = c1728o;
                    atomicReference2 = c1730q2.a;
                    while (!atomicReference2.compareAndSet(c1728o2, null)) {
                    }
                    ((R5.c) aVar).e(null);
                    return obj;
                }
                return aVar2;
            } catch (Throwable th3) {
                c1730q2 = c1730q;
                th = th3;
                c1728o2 = c1728o;
                atomicReference = c1730q2.a;
                while (!atomicReference.compareAndSet(c1728o2, null) && atomicReference.get() == c1728o2) {
                }
                throw th;
            }
            aVar = cVar;
        } catch (Throwable th4) {
            ((R5.c) r12).e(null);
            throw th4;
        }
    }
}
