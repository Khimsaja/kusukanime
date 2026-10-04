package M;

import H5.C0263e0;
import H5.InterfaceC0265f0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: M.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0467z extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public R5.a f6368k;

    /* renamed from: l, reason: collision with root package name */
    public Object f6369l;

    /* renamed from: m, reason: collision with root package name */
    public A f6370m;

    /* renamed from: n, reason: collision with root package name */
    public int f6371n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f6372o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q.X f6373p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ A f6374q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ U3.j f6375r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0467z(q.X x7, A a, e4.k kVar, S3.c cVar) {
        super(2, cVar);
        this.f6373p = x7;
        this.f6374q = a;
        this.f6375r = (U3.j) kVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [U3.j, e4.k] */
    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C0467z c0467z = new C0467z(this.f6373p, this.f6374q, this.f6375r, cVar);
        c0467z.f6372o = obj;
        return c0467z;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0467z) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [e4.k] */
    /* JADX WARN: Type inference failed for: r5v6, types: [R5.a] */
    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        A a;
        ?? r42;
        C0466y c0466y;
        R5.c cVar;
        R5.a aVar;
        A a7;
        Throwable th;
        C0466y c0466y2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        T3.a aVar2 = T3.a.f9048k;
        ?? r12 = this.f6371n;
        try {
            try {
                if (r12 == 0) {
                    P3.r.Y(obj);
                    S3.f fVar = ((H5.A) this.f6372o).getCoroutineContext().get(C0263e0.f3843k);
                    kotlin.jvm.internal.l.c(fVar);
                    C0466y c0466y3 = new C0466y(this.f6373p, (InterfaceC0265f0) fVar);
                    while (true) {
                        a = this.f6374q;
                        AtomicReference atomicReference3 = a.a;
                        C0466y c0466y4 = (C0466y) atomicReference3.get();
                        if (c0466y4 != null && c0466y3.a.compareTo(c0466y4.a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(c0466y4, c0466y3)) {
                            if (atomicReference3.get() != c0466y4) {
                                break;
                            }
                        }
                        if (c0466y4 != null) {
                            c0466y4.f6367b.e(null);
                        }
                        this.f6372o = c0466y3;
                        R5.c cVar2 = a.f6207b;
                        this.f6368k = cVar2;
                        U3.j jVar = this.f6375r;
                        this.f6369l = jVar;
                        this.f6370m = a;
                        this.f6371n = 1;
                        if (cVar2.c(this) != aVar2) {
                            r42 = jVar;
                            c0466y = c0466y3;
                            cVar = cVar2;
                        }
                    }
                    return aVar2;
                }
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a7 = (A) this.f6369l;
                    aVar = this.f6368k;
                    c0466y2 = (C0466y) this.f6372o;
                    try {
                        P3.r.Y(obj);
                        atomicReference2 = a7.a;
                        while (!atomicReference2.compareAndSet(c0466y2, null) && atomicReference2.get() == c0466y2) {
                        }
                        ((R5.c) aVar).e(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = a7.a;
                        while (!atomicReference.compareAndSet(c0466y2, null)) {
                        }
                        throw th;
                    }
                }
                A a8 = this.f6370m;
                e4.k kVar = (e4.k) this.f6369l;
                ?? r52 = this.f6368k;
                c0466y = (C0466y) this.f6372o;
                P3.r.Y(obj);
                a = a8;
                r42 = kVar;
                cVar = r52;
                this.f6372o = c0466y;
                this.f6368k = aVar;
                this.f6369l = a;
                this.f6370m = null;
                this.f6371n = 2;
                Object objInvoke = r42.invoke(this);
                if (objInvoke != aVar2) {
                    a7 = a;
                    obj = objInvoke;
                    c0466y2 = c0466y;
                    atomicReference2 = a7.a;
                    while (!atomicReference2.compareAndSet(c0466y2, null)) {
                    }
                    ((R5.c) aVar).e(null);
                    return obj;
                }
                return aVar2;
            } catch (Throwable th3) {
                a7 = a;
                th = th3;
                c0466y2 = c0466y;
                atomicReference = a7.a;
                while (!atomicReference.compareAndSet(c0466y2, null) && atomicReference.get() == c0466y2) {
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
