package K5;

/* renamed from: K5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0328g implements InterfaceC0329h {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0329h f4815k;

    public C0328g(InterfaceC0329h interfaceC0329h) {
        this.f4815k = interfaceC0329h;
    }

    @Override // K5.InterfaceC0329h
    public final Object collect(InterfaceC0330i interfaceC0330i, S3.c cVar) {
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.f12720k = L5.c.f6161b;
        Object objCollect = this.f4815k.collect(new C0327f(this, xVar, interfaceC0330i, 0), cVar);
        return objCollect == T3.a.f9048k ? objCollect : O3.C.a;
    }
}
