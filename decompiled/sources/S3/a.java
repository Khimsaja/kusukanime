package S3;

import P3.F;
import e4.n;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class a implements f {
    private final g key;

    public a(g gVar) {
        l.f("key", gVar);
        this.key = gVar;
    }

    @Override // S3.h
    public /* bridge */ <R> R fold(R r2, n nVar) {
        return (R) F.s(this, r2, nVar);
    }

    @Override // S3.h
    public /* bridge */ <E extends f> E get(g gVar) {
        return (E) F.u(this, gVar);
    }

    @Override // S3.f
    public g getKey() {
        return this.key;
    }

    @Override // S3.h
    public /* bridge */ h minusKey(g gVar) {
        return F.K(this, gVar);
    }

    @Override // S3.h
    public /* bridge */ h plus(h hVar) {
        return F.M(this, hVar);
    }
}
