package O;

/* loaded from: classes.dex */
public final class E0 extends Y.x {

    /* renamed from: c, reason: collision with root package name */
    public float f6993c;

    public E0(float f5) {
        this.f6993c = f5;
    }

    @Override // Y.x
    public final void a(Y.x xVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord", xVar);
        this.f6993c = ((E0) xVar).f6993c;
    }

    @Override // Y.x
    public final Y.x b() {
        return new E0(this.f6993c);
    }
}
