package io.ktor.client.engine;

import P3.F;
import S3.f;
import S3.g;
import S3.h;
import e4.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lio/ktor/client/engine/KtorCallContextElement;", "LS3/f;", "LS3/h;", "callContext", "<init>", "(LS3/h;)V", "LS3/h;", "getCallContext", "()LS3/h;", "LS3/g;", "getKey", "()LS3/g;", "key", "Companion", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KtorCallContextElement implements f {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final h callContext;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/client/engine/KtorCallContextElement$Companion;", "LS3/g;", "Lio/ktor/client/engine/KtorCallContextElement;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements g {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public KtorCallContextElement(h hVar) {
        l.f("callContext", hVar);
        this.callContext = hVar;
    }

    @Override // S3.h
    public <R> R fold(R r2, n nVar) {
        return (R) F.s(this, r2, nVar);
    }

    @Override // S3.h
    public <E extends f> E get(g gVar) {
        return (E) F.u(this, gVar);
    }

    public final h getCallContext() {
        return this.callContext;
    }

    @Override // S3.f
    public g getKey() {
        return INSTANCE;
    }

    @Override // S3.h
    public h minusKey(g gVar) {
        return F.K(this, gVar);
    }

    @Override // S3.h
    public h plus(h hVar) {
        return F.M(this, hVar);
    }
}
