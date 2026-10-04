package io.ktor.client.plugins.observer;

import S3.c;
import S3.h;
import S3.i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0080@¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"LS3/h;", "getResponseObserverContext", "(LS3/c;)Ljava/lang/Object;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ResponseObserverContextJvmKt {
    public static final Object getResponseObserverContext(c<? super h> cVar) {
        if (cVar.getContext().get(Q5.a.f8027k) == null) {
            return i.f8767k;
        }
        throw new ClassCastException();
    }
}
