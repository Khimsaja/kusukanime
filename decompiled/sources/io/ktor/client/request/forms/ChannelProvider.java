package io.ktor.client.request.forms;

import e4.InterfaceC0821a;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/client/request/forms/ChannelProvider;", "", "", ContentDisposition.Parameters.Size, "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "block", "<init>", "(Ljava/lang/Long;Le4/a;)V", "Ljava/lang/Long;", "getSize", "()Ljava/lang/Long;", "Le4/a;", "getBlock", "()Le4/a;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChannelProvider {
    private final InterfaceC0821a block;
    private final Long size;

    public ChannelProvider(Long l7, InterfaceC0821a interfaceC0821a) {
        l.f("block", interfaceC0821a);
        this.size = l7;
        this.block = interfaceC0821a;
    }

    public final InterfaceC0821a getBlock() {
        return this.block;
    }

    public final Long getSize() {
        return this.size;
    }

    public /* synthetic */ ChannelProvider(Long l7, InterfaceC0821a interfaceC0821a, int i7, f fVar) {
        this((i7 & 1) != 0 ? null : l7, interfaceC0821a);
    }
}
