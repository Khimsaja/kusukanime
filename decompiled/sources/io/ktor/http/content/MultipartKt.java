package io.ktor.http.content;

import K5.C0332k;
import K5.InterfaceC0329h;
import K5.InterfaceC0330i;
import O3.C;
import U3.j;
import e4.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a8\u0010\n\u001a\u00020\u0007*\u00020\u00002\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001a\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f*\u00020\u0000H\u0087@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/http/content/MultiPartData;", "LK5/h;", "Lio/ktor/http/content/PartData;", "asFlow", "(Lio/ktor/http/content/MultiPartData;)LK5/h;", "Lkotlin/Function2;", "LS3/c;", "LO3/C;", "", "partHandler", "forEachPart", "(Lio/ktor/http/content/MultiPartData;Le4/n;LS3/c;)Ljava/lang/Object;", "", "readAllParts", "(Lio/ktor/http/content/MultiPartData;LS3/c;)Ljava/lang/Object;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultipartKt {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LK5/i;", "Lio/ktor/http/content/PartData;", "LO3/C;", "<anonymous>", "(LK5/i;)V"}, k = 3, mv = {2, 1, 0})
    @U3.e(c = "io.ktor.http.content.MultipartKt$asFlow$1", f = "Multipart.kt", l = {144, 145}, m = "invokeSuspend")
    /* renamed from: io.ktor.http.content.MultipartKt$asFlow$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        final /* synthetic */ MultiPartData $this_asFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MultiPartData multiPartData, S3.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$this_asFlow = multiPartData;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_asFlow, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // e4.n
        public final Object invoke(InterfaceC0330i interfaceC0330i, S3.c<? super C> cVar) {
            return ((AnonymousClass1) create(interfaceC0330i, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004b -> B:7:0x0013). Please report as a decompilation issue!!! */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                T3.a r0 = T3.a.f9048k
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r1 = r5.L$0
                K5.i r1 = (K5.InterfaceC0330i) r1
                P3.r.Y(r6)
            L13:
                r6 = r1
                goto L2c
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                java.lang.Object r1 = r5.L$0
                K5.i r1 = (K5.InterfaceC0330i) r1
                P3.r.Y(r6)
                goto L3c
            L25:
                P3.r.Y(r6)
                java.lang.Object r6 = r5.L$0
                K5.i r6 = (K5.InterfaceC0330i) r6
            L2c:
                io.ktor.http.content.MultiPartData r1 = r5.$this_asFlow
                r5.L$0 = r6
                r5.label = r3
                java.lang.Object r1 = r1.readPart(r5)
                if (r1 != r0) goto L39
                goto L4d
            L39:
                r4 = r1
                r1 = r6
                r6 = r4
            L3c:
                io.ktor.http.content.PartData r6 = (io.ktor.http.content.PartData) r6
                if (r6 != 0) goto L43
                O3.C r6 = O3.C.a
                return r6
            L43:
                r5.L$0 = r1
                r5.label = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L13
            L4d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.content.MultipartKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @U3.e(c = "io.ktor.http.content.MultipartKt", f = "Multipart.kt", l = {168, 173}, m = "readAllParts")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.http.content.MultipartKt$readAllParts$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12311 extends U3.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12311(S3.c<? super C12311> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultipartKt.readAllParts(null, this);
        }
    }

    public static final InterfaceC0329h asFlow(MultiPartData multiPartData) {
        l.f("<this>", multiPartData);
        return new C0332k(new AnonymousClass1(multiPartData, null));
    }

    public static final Object forEachPart(MultiPartData multiPartData, n nVar, S3.c<? super C> cVar) {
        Object objCollect = asFlow(multiPartData).collect(new MultipartKt$sam$kotlinx_coroutines_flow_FlowCollector$0(nVar), cVar);
        return objCollect == T3.a.f9048k ? objCollect : C.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (r7 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006c -> B:27:0x006f). Please report as a decompilation issue!!! */
    @O3.InterfaceC0554c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readAllParts(io.ktor.http.content.MultiPartData r6, S3.c<? super java.util.List<? extends io.ktor.http.content.PartData>> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof io.ktor.http.content.MultipartKt.C12311
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.http.content.MultipartKt$readAllParts$1 r0 = (io.ktor.http.content.MultipartKt.C12311) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.http.content.MultipartKt$readAllParts$1 r0 = new io.ktor.http.content.MultipartKt$readAllParts$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.L$1
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r2 = r0.L$0
            io.ktor.http.content.MultiPartData r2 = (io.ktor.http.content.MultiPartData) r2
            P3.r.Y(r7)
            goto L6f
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r6 = r0.L$0
            io.ktor.http.content.MultiPartData r6 = (io.ktor.http.content.MultiPartData) r6
            P3.r.Y(r7)
            goto L50
        L42:
            P3.r.Y(r7)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r6.readPart(r0)
            if (r7 != r1) goto L50
            goto L6e
        L50:
            io.ktor.http.content.PartData r7 = (io.ktor.http.content.PartData) r7
            if (r7 != 0) goto L57
            P3.y r6 = P3.y.f7779k
            return r6
        L57:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r7)
            r5 = r2
            r2 = r6
            r6 = r5
        L62:
            r0.L$0 = r2
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r2.readPart(r0)
            if (r7 != r1) goto L6f
        L6e:
            return r1
        L6f:
            io.ktor.http.content.PartData r7 = (io.ktor.http.content.PartData) r7
            if (r7 != 0) goto L74
            return r6
        L74:
            r6.add(r7)
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.content.MultipartKt.readAllParts(io.ktor.http.content.MultiPartData, S3.c):java.lang.Object");
    }
}
