package H2;

import G2.C0174k;
import H.F;
import K5.InterfaceC0329h;
import O.C0485c0;
import O.Z;
import O3.C;
import java.util.List;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class s extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f3643k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f3644l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f3645m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0485c0 f3646n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z f3647o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z f3648p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(i iVar, C0485c0 c0485c0, Z z7, Z z8, S3.c cVar) {
        super(2, cVar);
        this.f3645m = iVar;
        this.f3646n = c0485c0;
        this.f3647o = z7;
        this.f3648p = z8;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        s sVar = new s(this.f3645m, this.f3646n, this.f3647o, this.f3648p, cVar);
        sVar.f3644l = obj;
        return sVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((InterfaceC0329h) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0174k c0174k;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f3643k;
        i iVar = this.f3645m;
        Z z7 = this.f3648p;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                InterfaceC0329h interfaceC0329h = (InterfaceC0329h) this.f3644l;
                C0485c0 c0485c0 = this.f3646n;
                c0485c0.g(0.0f);
                Z z8 = this.f3647o;
                C0174k c0174k2 = (C0174k) P3.q.B0((List) z8.getValue());
                kotlin.jvm.internal.l.c(c0174k2);
                iVar.g(c0174k2);
                iVar.g((C0174k) ((List) z8.getValue()).get(((List) z8.getValue()).size() - 2));
                F f5 = new F(1, z7, c0485c0);
                this.f3644l = c0174k2;
                this.f3643k = 1;
                if (interfaceC0329h.collect(f5, this) == aVar) {
                    return aVar;
                }
                c0174k = c0174k2;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0174k = (C0174k) this.f3644l;
                P3.r.Y(obj);
            }
            z7.setValue(Boolean.FALSE);
            iVar.e(c0174k, false);
        } catch (CancellationException unused) {
            z7.setValue(Boolean.FALSE);
        }
        return C.a;
    }
}
