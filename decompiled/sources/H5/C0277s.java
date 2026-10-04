package H5;

import java.util.concurrent.CancellationException;

/* renamed from: H5.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277s {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0268i f3879b;

    /* renamed from: c, reason: collision with root package name */
    public final e4.o f3880c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3881d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f3882e;

    public C0277s(Object obj, InterfaceC0268i interfaceC0268i, e4.o oVar, Object obj2, Throwable th) {
        this.a = obj;
        this.f3879b = interfaceC0268i;
        this.f3880c = oVar;
        this.f3881d = obj2;
        this.f3882e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0277s a(C0277s c0277s, InterfaceC0268i interfaceC0268i, CancellationException cancellationException, int i7) {
        Object obj = c0277s.a;
        if ((i7 & 2) != 0) {
            interfaceC0268i = c0277s.f3879b;
        }
        InterfaceC0268i interfaceC0268i2 = interfaceC0268i;
        e4.o oVar = c0277s.f3880c;
        Object obj2 = c0277s.f3881d;
        CancellationException cancellationException2 = cancellationException;
        if ((i7 & 16) != 0) {
            cancellationException2 = c0277s.f3882e;
        }
        c0277s.getClass();
        return new C0277s(obj, interfaceC0268i2, oVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0277s)) {
            return false;
        }
        C0277s c0277s = (C0277s) obj;
        return kotlin.jvm.internal.l.a(this.a, c0277s.a) && kotlin.jvm.internal.l.a(this.f3879b, c0277s.f3879b) && kotlin.jvm.internal.l.a(this.f3880c, c0277s.f3880c) && kotlin.jvm.internal.l.a(this.f3881d, c0277s.f3881d) && kotlin.jvm.internal.l.a(this.f3882e, c0277s.f3882e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC0268i interfaceC0268i = this.f3879b;
        int iHashCode2 = (iHashCode + (interfaceC0268i == null ? 0 : interfaceC0268i.hashCode())) * 31;
        e4.o oVar = this.f3880c;
        int iHashCode3 = (iHashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        Object obj2 = this.f3881d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f3882e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.f3879b + ", onCancellation=" + this.f3880c + ", idempotentResume=" + this.f3881d + ", cancelCause=" + this.f3882e + ')';
    }

    public /* synthetic */ C0277s(Object obj, InterfaceC0268i interfaceC0268i, e4.o oVar, CancellationException cancellationException, int i7) {
        this(obj, (i7 & 2) != 0 ? null : interfaceC0268i, (i7 & 4) != 0 ? null : oVar, (Object) null, (i7 & 16) != 0 ? null : cancellationException);
    }
}
