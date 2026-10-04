package O;

/* loaded from: classes.dex */
public final class H0 extends Y.x {

    /* renamed from: c, reason: collision with root package name */
    public Object f6998c;

    public H0(Object obj) {
        this.f6998c = obj;
    }

    @Override // Y.x
    public final void a(Y.x xVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>", xVar);
        this.f6998c = ((H0) xVar).f6998c;
    }

    @Override // Y.x
    public final Y.x b() {
        return new H0(this.f6998c);
    }
}
