package L5;

import A3.C0006a;
import H5.D;
import K5.InterfaceC0330i;
import O3.C;
import z5.AbstractC2511p;

/* loaded from: classes.dex */
public final class t extends U3.c implements InterfaceC0330i {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0330i f6195k;

    /* renamed from: l, reason: collision with root package name */
    public final S3.h f6196l;

    /* renamed from: m, reason: collision with root package name */
    public final int f6197m;

    /* renamed from: n, reason: collision with root package name */
    public S3.h f6198n;

    /* renamed from: o, reason: collision with root package name */
    public S3.c f6199o;

    public t(InterfaceC0330i interfaceC0330i, S3.h hVar) {
        super(r.f6193k, S3.i.f8767k);
        this.f6195k = interfaceC0330i;
        this.f6196l = hVar;
        this.f6197m = ((Number) hVar.fold(0, new C0006a(17))).intValue();
    }

    public final Object b(S3.c cVar, Object obj) {
        S3.h context = cVar.getContext();
        D.m(context);
        S3.h hVar = this.f6198n;
        if (hVar != context) {
            if (hVar instanceof p) {
                throw new IllegalStateException(AbstractC2511p.E("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((p) hVar).f6192l + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new D3.c(2, this))).intValue() != this.f6197m) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f6196l + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f6198n = context;
        }
        this.f6199o = cVar;
        u uVar = v.a;
        InterfaceC0330i interfaceC0330i = this.f6195k;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>", interfaceC0330i);
        uVar.getClass();
        Object objEmit = interfaceC0330i.emit(obj, this);
        if (!kotlin.jvm.internal.l.a(objEmit, T3.a.f9048k)) {
            this.f6199o = null;
        }
        return objEmit;
    }

    @Override // K5.InterfaceC0330i
    public final Object emit(Object obj, S3.c cVar) {
        try {
            Object objB = b(cVar, obj);
            return objB == T3.a.f9048k ? objB : C.a;
        } catch (Throwable th) {
            this.f6198n = new p(cVar.getContext(), th);
            throw th;
        }
    }

    @Override // U3.a, U3.d
    public final U3.d getCallerFrame() {
        S3.c cVar = this.f6199o;
        if (cVar instanceof U3.d) {
            return (U3.d) cVar;
        }
        return null;
    }

    @Override // U3.c, S3.c
    public final S3.h getContext() {
        S3.h hVar = this.f6198n;
        return hVar == null ? S3.i.f8767k : hVar;
    }

    @Override // U3.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = O3.o.a(obj);
        if (thA != null) {
            this.f6198n = new p(getContext(), thA);
        }
        S3.c cVar = this.f6199o;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return T3.a.f9048k;
    }
}
