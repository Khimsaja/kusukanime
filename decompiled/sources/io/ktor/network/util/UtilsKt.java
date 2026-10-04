package io.ktor.network.util;

import H5.A;
import e4.InterfaceC0821a;
import e4.k;
import io.ktor.http.ContentDisposition;
import io.ktor.http.c;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001aS\u0010\r\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f*\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"LH5/A;", "", ContentDisposition.Parameters.Name, "", "timeoutMs", "Lkotlin/Function0;", "clock", "Lkotlin/Function1;", "LS3/c;", "LO3/C;", "", "onTimeout", "Lio/ktor/network/util/Timeout;", "createTimeout", "(LH5/A;Ljava/lang/String;JLe4/a;Le4/k;)Lio/ktor/network/util/Timeout;", "T", "block", "withTimeout", "(Lio/ktor/network/util/Timeout;Le4/a;)Ljava/lang/Object;", "INFINITE_TIMEOUT_MS", "J", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UtilsKt {
    public static final long INFINITE_TIMEOUT_MS = Long.MAX_VALUE;

    public static final Timeout createTimeout(A a, String str, long j7, InterfaceC0821a interfaceC0821a, k kVar) {
        l.f("<this>", a);
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("clock", interfaceC0821a);
        l.f("onTimeout", kVar);
        return new Timeout(str, j7, interfaceC0821a, a, kVar);
    }

    public static /* synthetic */ Timeout createTimeout$default(A a, String str, long j7, InterfaceC0821a interfaceC0821a, k kVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = "";
        }
        if ((i7 & 4) != 0) {
            interfaceC0821a = new c(12);
        }
        return createTimeout(a, str, j7, interfaceC0821a, kVar);
    }

    public static final <T> T withTimeout(Timeout timeout, InterfaceC0821a interfaceC0821a) {
        l.f("block", interfaceC0821a);
        if (timeout == null) {
            return (T) interfaceC0821a.invoke();
        }
        timeout.start();
        try {
            return (T) interfaceC0821a.invoke();
        } finally {
            timeout.stop();
        }
    }
}
