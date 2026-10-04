package H1;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: H1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0235p implements i3.h {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3555k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f3556l;

    public /* synthetic */ C0235p(int i7, Object obj) {
        this.f3555k = i7;
        this.f3556l = obj;
    }

    @Override // i3.h
    public final Object get() {
        switch (this.f3555k) {
            case 0:
                return (C0230k) this.f3556l;
            case 1:
                return Boolean.valueOf(((L) this.f3556l).f3298N);
            case 2:
                return Boolean.valueOf(((AtomicBoolean) this.f3556l).get());
            default:
                try {
                    return (O1.A) ((Class) this.f3556l).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e7) {
                    throw new IllegalStateException(e7);
                }
        }
    }
}
