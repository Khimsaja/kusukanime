package u4;

/* renamed from: u4.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2089E implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16289k;

    /* renamed from: l, reason: collision with root package name */
    public final W4.c f16290l;

    public /* synthetic */ C2089E(W4.c cVar, int i7) {
        this.f16289k = i7;
        this.f16290l = cVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f16289k) {
            case 0:
                W4.c cVar = (W4.c) obj;
                kotlin.jvm.internal.l.f("it", cVar);
                return Boolean.valueOf(!cVar.a.c() && cVar.b().equals(this.f16290l));
            default:
                v4.h hVar = (v4.h) obj;
                kotlin.jvm.internal.l.f("it", hVar);
                return hVar.l(this.f16290l);
        }
    }
}
