package K5;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class Z extends L5.d {
    public final AtomicReference a = new AtomicReference(null);

    @Override // L5.d
    public final boolean a(L5.b bVar) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(N.f4771b);
        return true;
    }

    @Override // L5.d
    public final S3.c[] b(L5.b bVar) {
        this.a.set(null);
        return L5.c.a;
    }
}
