package O;

/* loaded from: classes.dex */
public final class G0 extends Y.x {

    /* renamed from: c, reason: collision with root package name */
    public long f6997c;

    public G0(long j7) {
        this.f6997c = j7;
    }

    @Override // Y.x
    public final void a(Y.x xVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord", xVar);
        this.f6997c = ((G0) xVar).f6997c;
    }

    @Override // Y.x
    public final Y.x b() {
        return new G0(this.f6997c);
    }
}
