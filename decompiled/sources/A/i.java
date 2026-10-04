package A;

import H5.A;
import H5.D;
import O3.C;
import P3.r;
import e4.InterfaceC0821a;
import e4.n;
import y0.Y;

/* loaded from: classes.dex */
public final class i extends U3.j implements n {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f22k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f23l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y f24m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f25n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f26o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(k kVar, Y y7, InterfaceC0821a interfaceC0821a, j jVar, S3.c cVar) {
        super(2, cVar);
        this.f23l = kVar;
        this.f24m = y7;
        this.f25n = (kotlin.jvm.internal.m) interfaceC0821a;
        this.f26o = jVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [e4.a, kotlin.jvm.internal.m] */
    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        ?? r32 = this.f25n;
        j jVar = this.f26o;
        i iVar = new i(this.f23l, this.f24m, r32, jVar, cVar);
        iVar.f22k = obj;
        return iVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [e4.a, kotlin.jvm.internal.m] */
    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        r.Y(obj);
        A a = (A) this.f22k;
        Y y7 = this.f24m;
        ?? r2 = this.f25n;
        k kVar = this.f23l;
        D.x(a, null, new g(kVar, y7, r2, null), 3);
        return D.x(a, null, new h(kVar, this.f26o, null), 3);
    }
}
