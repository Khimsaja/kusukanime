package io.ktor.client.plugins;

import e4.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B/\u0012&\u0010\b\u001a\"\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nR7\u0010\b\u001a\"\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/client/plugins/ExceptionHandlerWrapper;", "Lio/ktor/client/plugins/HandlerWrapper;", "Lkotlin/Function2;", "", "LS3/c;", "LO3/C;", "", "Lio/ktor/client/plugins/CallExceptionHandler;", "handler", "<init>", "(Le4/n;)V", "Le4/n;", "getHandler", "()Le4/n;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExceptionHandlerWrapper implements HandlerWrapper {
    private final n handler;

    public ExceptionHandlerWrapper(n nVar) {
        l.f("handler", nVar);
        this.handler = nVar;
    }

    public final n getHandler() {
        return this.handler;
    }
}
