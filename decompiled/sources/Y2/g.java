package Y2;

import H5.A;
import O3.C;
import b3.C0710b;
import d3.C0797i;
import d3.C0801m;
import e4.n;

/* loaded from: classes.dex */
public final class g extends U3.j implements n {

    /* renamed from: k, reason: collision with root package name */
    public int f10111k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f10112l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0797i f10113m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f10114n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0801m f10115o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ S2.c f10116p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0710b f10117q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f10118r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, C0797i c0797i, Object obj, C0801m c0801m, S2.c cVar, C0710b c0710b, j jVar, S3.c cVar2) {
        super(2, cVar2);
        this.f10112l = hVar;
        this.f10113m = c0797i;
        this.f10114n = obj;
        this.f10115o = c0801m;
        this.f10116p = cVar;
        this.f10117q = c0710b;
        this.f10118r = jVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new g(this.f10112l, this.f10113m, this.f10114n, this.f10115o, this.f10116p, this.f10117q, this.f10118r, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
