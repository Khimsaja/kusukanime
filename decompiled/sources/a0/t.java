package a0;

import H5.A;
import H5.D;
import H5.InterfaceC0265f0;
import O3.C;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class t extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f10416k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f10417l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f10418m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f10419n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ U3.j f10420o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(e4.k kVar, AtomicReference atomicReference, e4.n nVar, S3.c cVar) {
        super(2, cVar);
        this.f10418m = (kotlin.jvm.internal.m) kVar;
        this.f10419n = atomicReference;
        this.f10420o = (U3.j) nVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [U3.j, e4.n] */
    /* JADX WARN: Type inference failed for: r3v0, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        t tVar = new t(this.f10418m, this.f10419n, this.f10420o, cVar);
        tVar.f10417l = obj;
        return tVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r9v11, types: [U3.j, e4.n] */
    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        s sVar;
        s sVar2;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f10416k;
        AtomicReference atomicReference = this.f10419n;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                A a = (A) this.f10417l;
                sVar = new s(D.q(a.getCoroutineContext()), this.f10418m.invoke(a));
                s sVar3 = (s) atomicReference.getAndSet(sVar);
                if (sVar3 != null) {
                    InterfaceC0265f0 interfaceC0265f0 = sVar3.a;
                    this.f10417l = sVar;
                    this.f10416k = 1;
                    interfaceC0265f0.e(null);
                    Object objM = interfaceC0265f0.m(this);
                    if (objM != aVar) {
                        objM = C.a;
                    }
                    if (objM != aVar) {
                    }
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar2 = (s) this.f10417l;
                    try {
                        P3.r.Y(obj);
                        while (!atomicReference.compareAndSet(sVar2, null) && atomicReference.get() == sVar2) {
                        }
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        while (!atomicReference.compareAndSet(sVar2, null) && atomicReference.get() == sVar2) {
                        }
                        throw th;
                    }
                }
                sVar = (s) this.f10417l;
                P3.r.Y(obj);
            }
            ?? r9 = this.f10420o;
            Object obj2 = sVar.f10415b;
            this.f10417l = sVar;
            this.f10416k = 2;
            obj = r9.invoke(obj2, this);
            if (obj != aVar) {
                sVar2 = sVar;
                while (!atomicReference.compareAndSet(sVar2, null)) {
                }
                return obj;
            }
            return aVar;
        } catch (Throwable th2) {
            th = th2;
            sVar2 = sVar;
            while (!atomicReference.compareAndSet(sVar2, null)) {
            }
            throw th;
        }
    }
}
