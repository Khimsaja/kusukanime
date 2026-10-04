package io.ktor.websocket;

import O3.C;
import O3.InterfaceC0554c;
import U3.c;
import U3.e;
import io.ktor.websocket.CloseReason;
import io.ktor.websocket.Frame;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a1\u0010\u0004\u001a\u00028\u0000\"\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0000*\u00020\u00022\u0010\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0000*\u00020\u00022\u0010\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\fH\u0086@¢\u0006\u0004\b\n\u0010\r\u001a\u001e\u0010\u0010\u001a\u00020\t*\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001e\u0010\u0010\u001a\u00020\t*\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0087@¢\u0006\u0004\b\u0010\u0010\u0014\u001a\u001c\u0010\u0015\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lio/ktor/websocket/WebSocketExtension;", "T", "Lio/ktor/websocket/WebSocketSession;", "Lio/ktor/websocket/WebSocketExtensionFactory;", "extension", "(Lio/ktor/websocket/WebSocketSession;Lio/ktor/websocket/WebSocketExtensionFactory;)Lio/ktor/websocket/WebSocketExtension;", "extensionOrNull", "", "content", "LO3/C;", "send", "(Lio/ktor/websocket/WebSocketSession;Ljava/lang/String;LS3/c;)Ljava/lang/Object;", "", "(Lio/ktor/websocket/WebSocketSession;[BLS3/c;)Ljava/lang/Object;", "Lio/ktor/websocket/CloseReason;", "reason", "close", "(Lio/ktor/websocket/WebSocketSession;Lio/ktor/websocket/CloseReason;LS3/c;)Ljava/lang/Object;", "", "cause", "(Lio/ktor/websocket/WebSocketSession;Ljava/lang/Throwable;LS3/c;)Ljava/lang/Object;", "closeExceptionally", "ktor-websockets"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WebSocketSessionKt {

    @e(c = "io.ktor.websocket.WebSocketSessionKt", f = "WebSocketSession.kt", l = {150, 151}, m = "close")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.websocket.WebSocketSessionKt$close$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketSessionKt.close((WebSocketSession) null, (CloseReason) null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r5.flush(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object close(io.ktor.websocket.WebSocketSession r5, io.ktor.websocket.CloseReason r6, S3.c<? super O3.C> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof io.ktor.websocket.WebSocketSessionKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.websocket.WebSocketSessionKt$close$1 r0 = (io.ktor.websocket.WebSocketSessionKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.WebSocketSessionKt$close$1 r0 = new io.ktor.websocket.WebSocketSessionKt$close$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            P3.r.Y(r7)     // Catch: java.lang.Throwable -> L59
            goto L59
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r5 = r0.L$0
            io.ktor.websocket.WebSocketSession r5 = (io.ktor.websocket.WebSocketSession) r5
            P3.r.Y(r7)     // Catch: java.lang.Throwable -> L59
            goto L4d
        L3a:
            P3.r.Y(r7)
            io.ktor.websocket.Frame$Close r7 = new io.ktor.websocket.Frame$Close     // Catch: java.lang.Throwable -> L59
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L59
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L59
            r0.label = r4     // Catch: java.lang.Throwable -> L59
            java.lang.Object r6 = r5.send(r7, r0)     // Catch: java.lang.Throwable -> L59
            if (r6 != r1) goto L4d
            goto L58
        L4d:
            r6 = 0
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L59
            r0.label = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r5 = r5.flush(r0)     // Catch: java.lang.Throwable -> L59
            if (r5 != r1) goto L59
        L58:
            return r1
        L59:
            O3.C r5 = O3.C.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.WebSocketSessionKt.close(io.ktor.websocket.WebSocketSession, io.ktor.websocket.CloseReason, S3.c):java.lang.Object");
    }

    public static /* synthetic */ Object close$default(WebSocketSession webSocketSession, CloseReason closeReason, S3.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            closeReason = new CloseReason(CloseReason.Codes.NORMAL, "");
        }
        return close(webSocketSession, closeReason, (S3.c<? super C>) cVar);
    }

    public static final Object closeExceptionally(WebSocketSession webSocketSession, Throwable th, S3.c<? super C> cVar) throws Throwable {
        Object objClose = close(webSocketSession, th instanceof CancellationException ? new CloseReason(CloseReason.Codes.NORMAL, "") : new CloseReason(CloseReason.Codes.INTERNAL_ERROR, th.toString()), cVar);
        return objClose == T3.a.f9048k ? objClose : C.a;
    }

    public static final <T extends WebSocketExtension<?>> T extension(WebSocketSession webSocketSession, WebSocketExtensionFactory<?, T> webSocketExtensionFactory) {
        l.f("<this>", webSocketSession);
        l.f("extension", webSocketExtensionFactory);
        T t7 = (T) extensionOrNull(webSocketSession, webSocketExtensionFactory);
        if (t7 != null) {
            return t7;
        }
        throw new IllegalStateException(("Extension " + webSocketExtensionFactory + " not found.").toString());
    }

    public static final <T extends WebSocketExtension<?>> T extensionOrNull(WebSocketSession webSocketSession, WebSocketExtensionFactory<?, T> webSocketExtensionFactory) {
        Object next;
        l.f("<this>", webSocketSession);
        l.f("extension", webSocketExtensionFactory);
        Iterator<T> it = webSocketSession.getExtensions().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((WebSocketExtension) next).getFactory().getKey() == webSocketExtensionFactory.getKey()) {
                break;
            }
        }
        if (next instanceof WebSocketExtension) {
            return (T) next;
        }
        return null;
    }

    public static final Object send(WebSocketSession webSocketSession, String str, S3.c<? super C> cVar) {
        Object objSend = webSocketSession.send(new Frame.Text(str), cVar);
        return objSend == T3.a.f9048k ? objSend : C.a;
    }

    public static final Object send(WebSocketSession webSocketSession, byte[] bArr, S3.c<? super C> cVar) {
        Object objSend = webSocketSession.send(new Frame.Binary(true, bArr), cVar);
        return objSend == T3.a.f9048k ? objSend : C.a;
    }

    @InterfaceC0554c
    public static final Object close(WebSocketSession webSocketSession, Throwable th, S3.c<? super C> cVar) throws Throwable {
        C c2 = C.a;
        if (th == null) {
            Object objClose$default = close$default(webSocketSession, null, cVar, 1, null);
            return objClose$default == T3.a.f9048k ? objClose$default : c2;
        }
        Object objCloseExceptionally = closeExceptionally(webSocketSession, th, cVar);
        return objCloseExceptionally == T3.a.f9048k ? objCloseExceptionally : c2;
    }
}
