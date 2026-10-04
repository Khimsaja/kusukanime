package io.ktor.client.utils;

import H5.AbstractC0281w;
import H5.M;
import O5.d;
import O5.e;
import io.ktor.utils.io.InternalAPI;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LH5/M;", "", "threadCount", "", "dispatcherName", "LH5/w;", "clientDispatcher", "(LH5/M;ILjava/lang/String;)LH5/w;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoroutineDispatcherUtilsKt {
    @InternalAPI
    public static final AbstractC0281w clientDispatcher(M m7, int i7, String str) {
        l.f("<this>", m7);
        l.f("dispatcherName", str);
        e eVar = M.a;
        return d.f7623l.Z(i7);
    }

    public static /* synthetic */ AbstractC0281w clientDispatcher$default(M m7, int i7, String str, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str = "ktor-client-dispatcher";
        }
        return clientDispatcher(m7, i7, str);
    }
}
