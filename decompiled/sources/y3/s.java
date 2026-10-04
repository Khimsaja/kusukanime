package y3;

import H5.D;
import O.Z;
import e4.InterfaceC0821a;
import z5.C2508m;

/* loaded from: classes.dex */
public final class s extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f18351k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f18352l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f18353m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f18354n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z f18355o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Z z7, InterfaceC0821a interfaceC0821a, Z z8, Z z9, S3.c cVar) {
        super(2, cVar);
        this.f18352l = z7;
        this.f18353m = interfaceC0821a;
        this.f18354n = z8;
        this.f18355o = z9;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new s(this.f18352l, this.f18353m, this.f18354n, this.f18355o, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f18351k;
        if (i7 == 0) {
            P3.r.Y(obj);
            this.f18351k = 1;
            if (D.k(12000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        Z z7 = this.f18352l;
        boolean zBooleanValue = ((Boolean) z7.getValue()).booleanValue();
        O3.C c2 = O3.C.a;
        if (!zBooleanValue) {
            C2508m c2508m = C.a;
            if (((String) this.f18354n.getValue()) == null) {
                Boolean bool = Boolean.TRUE;
                z7.setValue(bool);
                this.f18355o.setValue(bool);
                InterfaceC0821a interfaceC0821a = this.f18353m;
                if (interfaceC0821a != null) {
                    interfaceC0821a.invoke();
                }
            }
        }
        return c2;
    }
}
