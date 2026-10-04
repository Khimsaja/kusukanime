package O5;

import H5.AbstractC0281w;

/* loaded from: classes.dex */
public final class l extends AbstractC0281w {

    /* renamed from: l, reason: collision with root package name */
    public static final l f7635l = new l();

    @Override // H5.AbstractC0281w
    public final void W(S3.h hVar, Runnable runnable) {
        e.f7625m.f7626l.e(runnable, true, false);
    }

    @Override // H5.AbstractC0281w
    public final void X(S3.h hVar, Runnable runnable) {
        e.f7625m.f7626l.e(runnable, true, true);
    }

    @Override // H5.AbstractC0281w
    public final AbstractC0281w Z(int i7) {
        M5.a.a(i7);
        return i7 >= k.f7632d ? this : super.Z(i7);
    }

    @Override // H5.AbstractC0281w
    public final String toString() {
        return "Dispatchers.IO";
    }
}
