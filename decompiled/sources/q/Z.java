package q;

import H5.C0263e0;
import H5.InterfaceC0265f0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import s.C1930o;
import s.C1934q;

/* loaded from: classes.dex */
public final class Z extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public R5.a f14517k;

    /* renamed from: l, reason: collision with root package name */
    public Object f14518l;

    /* renamed from: m, reason: collision with root package name */
    public C1934q f14519m;

    /* renamed from: n, reason: collision with root package name */
    public a0 f14520n;

    /* renamed from: o, reason: collision with root package name */
    public int f14521o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f14522p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ X f14523q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f14524r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1930o f14525s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1934q f14526t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(X x7, a0 a0Var, C1930o c1930o, C1934q c1934q, S3.c cVar) {
        super(2, cVar);
        this.f14523q = x7;
        this.f14524r = a0Var;
        this.f14525s = c1930o;
        this.f14526t = c1934q;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        Z z7 = new Z(this.f14523q, this.f14524r, this.f14525s, this.f14526t, cVar);
        z7.f14522p = obj;
        return z7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((Z) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a0 a0Var;
        C1934q c1934q;
        Y y7;
        R5.a aVar;
        e4.n nVar;
        a0 a0Var2;
        Throwable th;
        Y y8;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        T3.a aVar2 = T3.a.f9048k;
        ?? r12 = this.f14521o;
        try {
            try {
                if (r12 == 0) {
                    P3.r.Y(obj);
                    S3.f fVar = ((H5.A) this.f14522p).getCoroutineContext().get(C0263e0.f3843k);
                    kotlin.jvm.internal.l.c(fVar);
                    Y y9 = new Y(this.f14523q, (InterfaceC0265f0) fVar);
                    while (true) {
                        a0Var = this.f14524r;
                        AtomicReference atomicReference3 = a0Var.a;
                        Y y10 = (Y) atomicReference3.get();
                        if (y10 != null && y9.a.compareTo(y10.a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(y10, y9)) {
                            if (atomicReference3.get() != y10) {
                                break;
                            }
                        }
                        if (y10 != null) {
                            y10.f14516b.e(new L5.o("Mutation interrupted", 4));
                        }
                        this.f14522p = y9;
                        R5.c cVar = a0Var.f14530b;
                        this.f14517k = cVar;
                        C1930o c1930o = this.f14525s;
                        this.f14518l = c1930o;
                        C1934q c1934q2 = this.f14526t;
                        this.f14519m = c1934q2;
                        this.f14520n = a0Var;
                        this.f14521o = 1;
                        if (cVar.c(this) != aVar2) {
                            c1934q = c1934q2;
                            y7 = y9;
                            aVar = cVar;
                            nVar = c1930o;
                        }
                    }
                    return aVar2;
                }
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0Var2 = (a0) this.f14518l;
                    aVar = this.f14517k;
                    y8 = (Y) this.f14522p;
                    try {
                        P3.r.Y(obj);
                        atomicReference2 = a0Var2.a;
                        while (!atomicReference2.compareAndSet(y8, null) && atomicReference2.get() == y8) {
                        }
                        ((R5.c) aVar).e(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = a0Var2.a;
                        while (!atomicReference.compareAndSet(y8, null)) {
                        }
                        throw th;
                    }
                }
                a0 a0Var3 = this.f14520n;
                c1934q = this.f14519m;
                nVar = (e4.n) this.f14518l;
                R5.a aVar3 = this.f14517k;
                y7 = (Y) this.f14522p;
                P3.r.Y(obj);
                a0Var = a0Var3;
                aVar = aVar3;
                this.f14522p = y7;
                this.f14517k = aVar;
                this.f14518l = a0Var;
                this.f14519m = null;
                this.f14520n = null;
                this.f14521o = 2;
                Object objInvoke = nVar.invoke(c1934q, this);
                if (objInvoke != aVar2) {
                    a0Var2 = a0Var;
                    obj = objInvoke;
                    y8 = y7;
                    atomicReference2 = a0Var2.a;
                    while (!atomicReference2.compareAndSet(y8, null)) {
                    }
                    ((R5.c) aVar).e(null);
                    return obj;
                }
                return aVar2;
            } catch (Throwable th3) {
                a0Var2 = a0Var;
                th = th3;
                y8 = y7;
                atomicReference = a0Var2.a;
                while (!atomicReference.compareAndSet(y8, null) && atomicReference.get() == y8) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            ((R5.c) r12).e(null);
            throw th4;
        }
    }
}
