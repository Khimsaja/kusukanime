package io.ktor.client.plugins.sse;

import H5.A;
import H5.InterfaceC0275p;
import O3.C;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.client.statement.HttpStatement;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V", "io/ktor/client/plugins/sse/BuildersKt$processSession$2"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.client.plugins.sse.BuildersKt$processSession$2", f = "builders.kt", l = {1121, 1124, 1136, 1136}, m = "invokeSuspend")
/* renamed from: io.ktor.client.plugins.sse.BuildersKt$serverSentEventsSession-mY9Nd3A$$inlined$processSession-rp2poPw$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1 extends j implements n {
    final /* synthetic */ InterfaceC0275p $sessionDeferred;
    final /* synthetic */ HttpStatement $statement;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1(HttpStatement httpStatement, InterfaceC0275p interfaceC0275p, S3.c cVar) {
        super(2, cVar);
        this.$statement = httpStatement;
        this.$sessionDeferred = interfaceC0275p;
    }

    @Override // U3.a
    public final S3.c<C> create(Object obj, S3.c<?> cVar) {
        return new BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1(this.$statement, this.$sessionDeferred, cVar);
    }

    @Override // e4.n
    public final Object invoke(A a, S3.c<? super C> cVar) {
        return ((BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1) create(a, cVar)).invokeSuspend(C.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(1:65)|(1:(1:(1:(1:(2:8|9)(3:10|11|55))(3:17|18|62))(4:20|66|21|(3:44|45|(1:54)(1:62))(2:48|49)))(2:25|26))(4:28|29|30|(2:32|54)(1:33))|34|67|35|63|36|39|(2:42|(0)(0))|54|(2:(0)|(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|65|(1:(1:(1:(1:(2:8|9)(3:10|11|55))(3:17|18|62))(4:20|66|21|(3:44|45|(1:54)(1:62))(2:48|49)))(2:25|26))(4:28|29|30|(2:32|54)(1:33))|34|67|35|63|36|39|(2:42|(0)(0))|54|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ba, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bb, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c8, code lost:
    
        if (r6.cleanup(r14, r13) == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c A[Catch: all -> 0x0047, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0047, blocks: (B:21:0x0043, B:44:0x009c, B:48:0x00b2, B:49:0x00b9), top: B:66:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2 A[Catch: all -> 0x0047, TRY_ENTER, TryCatch #3 {all -> 0x0047, blocks: (B:21:0x0043, B:44:0x009c, B:48:0x00b2, B:49:0x00b9), top: B:66:0x0043 }] */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.BuildersKt$serverSentEventsSessionmY9Nd3A$$inlined$processSessionrp2poPw$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
