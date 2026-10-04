package io.ktor.client.plugins.sse;

import H5.A;
import K5.InterfaceC0329h;
import S3.h;
import e4.n;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R(\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\n0\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lio/ktor/client/plugins/sse/SSESessionWithDeserialization;", "LH5/A;", "LK5/h;", "Lio/ktor/sse/TypedServerSentEvent;", "", "getIncoming", "()LK5/h;", "incoming", "Lkotlin/Function2;", "Lio/ktor/util/reflect/TypeInfo;", "", "getDeserializer", "()Le4/n;", "deserializer", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SSESessionWithDeserialization extends A {
    @Override // H5.A
    /* synthetic */ h getCoroutineContext();

    n getDeserializer();

    InterfaceC0329h getIncoming();
}
