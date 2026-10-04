package y;

import java.util.Map;

/* renamed from: y.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2313M extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f17593l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ X.j f17594m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2313M(X.j jVar, int i7) {
        super(1);
        this.f17593l = i7;
        this.f17594m = jVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f17593l) {
            case 0:
                X.j jVar = this.f17594m;
                return Boolean.valueOf(jVar != null ? jVar.b(obj) : true);
            default:
                return new C2315O(this.f17594m, (Map) obj);
        }
    }
}
