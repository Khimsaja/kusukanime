package io.ktor.utils.io;

import O3.C;
import S3.c;
import e4.n;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a8\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a8\u0010\t\u001a\u00020\u0004*\u00020\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0086@¢\u0006\u0004\b\t\u0010\b*\n\u0010\n\"\u00020\u00022\u00020\u0002¨\u0006\u000b"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "Lkotlin/Function2;", "Lio/ktor/utils/io/LookAheadSuspendSession;", "LS3/c;", "LO3/C;", "", "block", "lookAhead", "(Lio/ktor/utils/io/ByteReadChannel;Le4/n;LS3/c;)Ljava/lang/Object;", "lookAheadSuspend", "LookAheadSession", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LookAheadSessionKt {
    public static final Object lookAhead(ByteReadChannel byteReadChannel, n nVar, c<? super C> cVar) {
        Object objInvoke = nVar.invoke(new LookAheadSuspendSession(byteReadChannel), cVar);
        return objInvoke == T3.a.f9048k ? objInvoke : C.a;
    }

    public static final Object lookAheadSuspend(ByteReadChannel byteReadChannel, n nVar, c<? super C> cVar) {
        Object objInvoke = nVar.invoke(new LookAheadSuspendSession(byteReadChannel), cVar);
        return objInvoke == T3.a.f9048k ? objInvoke : C.a;
    }
}
