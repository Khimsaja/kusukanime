package io.ktor.client.engine;

import H5.InterfaceC0265f0;
import O3.C;
import e4.k;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes.dex */
public final class UtilsKt$attachToUserJob$cleanupHandler$1 implements k {
    final /* synthetic */ InterfaceC0265f0 $callJob;

    public UtilsKt$attachToUserJob$cleanupHandler$1(InterfaceC0265f0 interfaceC0265f0) {
        this.$callJob = interfaceC0265f0;
    }

    @Override // e4.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C.a;
    }

    public final void invoke(Throwable th) {
        if (th == null) {
            return;
        }
        this.$callJob.e(new CancellationException(th.getMessage()));
    }
}
