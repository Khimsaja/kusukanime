package io.ktor.util.logging;

import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import io.ktor.http.ContentType;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import z6.b;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001d\u0010\u0005\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\n\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\f\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"Lz6/b;", "Lio/ktor/util/logging/Logger;", "", "exception", "LO3/C;", "error", "(Lz6/b;Ljava/lang/Throwable;)V", "Lkotlin/Function0;", "", ContentType.Message.TYPE, "trace", "(Lz6/b;Le4/a;)V", "debug", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LoggerKt {
    public static final void debug(b bVar, InterfaceC0821a interfaceC0821a) {
        l.f("<this>", bVar);
        l.f(ContentType.Message.TYPE, interfaceC0821a);
        if (LoggerJvmKt.isDebugEnabled(bVar)) {
            bVar.i((String) interfaceC0821a.invoke());
        }
    }

    public static final void error(b bVar, Throwable th) {
        l.f("<this>", bVar);
        l.f("exception", th);
        String message = th.getMessage();
        if (message == null) {
            StringBuilder sb = new StringBuilder("Exception of type ");
            message = AbstractC0703b.o(y.a, th.getClass(), sb);
        }
        bVar.c(message, th);
    }

    public static final void trace(b bVar, InterfaceC0821a interfaceC0821a) {
        l.f("<this>", bVar);
        l.f(ContentType.Message.TYPE, interfaceC0821a);
        if (LoggerJvmKt.isTraceEnabled(bVar)) {
            bVar.e((String) interfaceC0821a.invoke());
        }
    }
}
