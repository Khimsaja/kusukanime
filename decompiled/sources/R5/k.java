package R5;

import M5.q;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class k extends q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f8678e;

    public k(long j7, k kVar, int i7) {
        super(j7, kVar, i7);
        this.f8678e = new AtomicReferenceArray(j.f8677f);
    }

    @Override // M5.q
    public final int g() {
        return j.f8677f;
    }

    @Override // M5.q
    public final void h(int i7, S3.h hVar) {
        this.f8678e.set(i7, j.f8676e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f6600c + ", hashCode=" + hashCode() + ']';
    }
}
