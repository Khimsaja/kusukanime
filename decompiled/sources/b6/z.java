package b6;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class z implements y5.h {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11048b;

    public /* synthetic */ z(int i7, Object obj) {
        this.a = i7;
        this.f11048b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Iterator] */
    private final Iterator c() {
        return this.f11048b;
    }

    @Override // y5.h
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return c();
            default:
                return new w5.g(1, this.f11048b);
        }
    }
}
