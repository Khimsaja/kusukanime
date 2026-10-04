package Y;

/* loaded from: classes.dex */
public final class q extends x {

    /* renamed from: c, reason: collision with root package name */
    public S.b f10012c;

    /* renamed from: d, reason: collision with root package name */
    public int f10013d;

    /* renamed from: e, reason: collision with root package name */
    public int f10014e;

    public q(S.b bVar) {
        this.f10012c = bVar;
    }

    @Override // Y.x
    public final void a(x xVar) {
        synchronized (s.a) {
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>", xVar);
            this.f10012c = ((q) xVar).f10012c;
            this.f10013d = ((q) xVar).f10013d;
            this.f10014e = ((q) xVar).f10014e;
        }
    }

    @Override // Y.x
    public final x b() {
        return new q(this.f10012c);
    }
}
