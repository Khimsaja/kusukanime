package X;

import O3.C;
import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f9663l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f9664m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f9665n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f9666o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f9667p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object[] f9668q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, m mVar, j jVar, String str, Object obj, Object[] objArr) {
        super(0);
        this.f9663l = bVar;
        this.f9664m = mVar;
        this.f9665n = jVar;
        this.f9666o = str;
        this.f9667p = obj;
        this.f9668q = objArr;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() throws Exception {
        boolean z7;
        b bVar = this.f9663l;
        j jVar = bVar.f9670l;
        j jVar2 = this.f9665n;
        boolean z8 = true;
        if (jVar != jVar2) {
            bVar.f9670l = jVar2;
            z7 = true;
        } else {
            z7 = false;
        }
        String str = bVar.f9671m;
        String str2 = this.f9666o;
        if (kotlin.jvm.internal.l.a(str, str2)) {
            z8 = z7;
        } else {
            bVar.f9671m = str2;
        }
        bVar.f9669k = this.f9664m;
        bVar.f9672n = this.f9667p;
        bVar.f9673o = this.f9668q;
        i iVar = bVar.f9674p;
        if (iVar != null && z8) {
            ((B2.l) iVar).T();
            bVar.f9674p = null;
            bVar.c();
        }
        return C.a;
    }
}
