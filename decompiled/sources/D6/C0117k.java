package D6;

import java.util.concurrent.CompletableFuture;

/* renamed from: D6.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117k extends CompletableFuture {
    public final D a;

    public C0117k(D d4) {
        this.a = d4;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        if (z7) {
            this.a.cancel();
        }
        return super.cancel(z7);
    }
}
