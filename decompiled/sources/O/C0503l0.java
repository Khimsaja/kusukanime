package O;

/* renamed from: O.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0503l0 implements Z, H5.A {

    /* renamed from: k, reason: collision with root package name */
    public final S3.h f7094k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f7095l;

    public C0503l0(Z z7, S3.h hVar) {
        this.f7094k = hVar;
        this.f7095l = z7;
    }

    @Override // H5.A
    public final S3.h getCoroutineContext() {
        return this.f7094k;
    }

    @Override // O.R0
    public final Object getValue() {
        return this.f7095l.getValue();
    }

    @Override // O.Z
    public final void setValue(Object obj) {
        this.f7095l.setValue(obj);
    }
}
