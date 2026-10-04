package io.ktor.network.selector;

import S3.h;
import S3.i;
import e4.k;
import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aS\u0010\r\u001a\u00028\u0001\"\f\b\u0000\u0010\u0007*\u00060\u0005j\u0002`\u0006\"\u0004\b\u0001\u0010\b*\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"LS3/h;", "dispatcher", "Lio/ktor/network/selector/SelectorManager;", "SelectorManager", "(LS3/h;)Lio/ktor/network/selector/SelectorManager;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "C", "R", "Lkotlin/Function1;", "Ljava/nio/channels/spi/SelectorProvider;", "create", "setup", "buildOrClose", "(Lio/ktor/network/selector/SelectorManager;Le4/k;Le4/k;)Ljava/lang/Object;", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectorManagerKt {
    public static final SelectorManager SelectorManager(h hVar) {
        l.f("dispatcher", hVar);
        return new ActorSelectorManager(hVar);
    }

    public static /* synthetic */ SelectorManager SelectorManager$default(h hVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            hVar = i.f8767k;
        }
        return SelectorManager(hVar);
    }

    public static final <C extends Closeable, R> R buildOrClose(SelectorManager selectorManager, k kVar, k kVar2) throws IOException {
        l.f("<this>", selectorManager);
        l.f("create", kVar);
        l.f("setup", kVar2);
        Closeable closeable = (Closeable) kVar.invoke(selectorManager.getProvider());
        try {
            return (R) kVar2.invoke(closeable);
        } catch (Throwable th) {
            closeable.close();
            throw th;
        }
    }
}
