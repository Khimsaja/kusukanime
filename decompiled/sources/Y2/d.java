package Y2;

import H5.A;
import O3.C;
import P3.r;
import X2.m;
import d3.C0797i;
import d3.C0801m;
import e4.n;
import kotlin.jvm.internal.x;

/* loaded from: classes.dex */
public final class d extends U3.j implements n {

    /* renamed from: k, reason: collision with root package name */
    public int f10088k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f10089l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x f10090m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x f10091n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0797i f10092o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f10093p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x f10094q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ S2.c f10095r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, x xVar, x xVar2, C0797i c0797i, Object obj, x xVar3, S2.c cVar, S3.c cVar2) {
        super(2, cVar2);
        this.f10089l = hVar;
        this.f10090m = xVar;
        this.f10091n = xVar2;
        this.f10092o = c0797i;
        this.f10093p = obj;
        this.f10094q = xVar3;
        this.f10095r = cVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new d(this.f10089l, this.f10090m, this.f10091n, this.f10092o, this.f10093p, this.f10094q, this.f10095r, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f10088k;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
            return obj;
        }
        r.Y(obj);
        m mVar = (m) this.f10090m.f12720k;
        S2.b bVar = (S2.b) this.f10091n.f12720k;
        C0801m c0801m = (C0801m) this.f10094q.f12720k;
        this.f10088k = 1;
        Object objA = h.a(this.f10089l, mVar, bVar, this.f10092o, this.f10093p, c0801m, this.f10095r, this);
        return objA == aVar ? aVar : objA;
    }
}
