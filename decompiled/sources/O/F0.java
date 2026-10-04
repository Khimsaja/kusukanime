package O;

/* loaded from: classes.dex */
public final class F0 extends Y.x {

    /* renamed from: c, reason: collision with root package name */
    public int f6996c;

    public F0(int i7) {
        this.f6996c = i7;
    }

    @Override // Y.x
    public final void a(Y.x xVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord", xVar);
        this.f6996c = ((F0) xVar).f6996c;
    }

    @Override // Y.x
    public final Y.x b() {
        return new F0(this.f6996c);
    }
}
