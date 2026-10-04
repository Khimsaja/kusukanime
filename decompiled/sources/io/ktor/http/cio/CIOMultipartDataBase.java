package io.ktor.http.cio;

import H5.A;
import J5.u;
import O3.C;
import S3.h;
import U3.c;
import U3.e;
import io.ktor.http.cio.MultipartEvent;
import io.ktor.http.content.MultiPartData;
import io.ktor.http.content.PartData;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.InternalAPI;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@InternalAPI
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0096@¢\u0006\u0004\b\u0019\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lio/ktor/http/cio/CIOMultipartDataBase;", "Lio/ktor/http/content/MultiPartData;", "LH5/A;", "LS3/h;", "coroutineContext", "Lio/ktor/utils/io/ByteReadChannel;", "channel", "", "contentType", "", "contentLength", "formFieldLimit", "<init>", "(LS3/h;Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/CharSequence;Ljava/lang/Long;J)V", "Lio/ktor/http/content/PartData;", "readPartSuspend", "(LS3/c;)Ljava/lang/Object;", "Lio/ktor/http/cio/MultipartEvent;", "event", "eventToData", "(Lio/ktor/http/cio/MultipartEvent;LS3/c;)Ljava/lang/Object;", "Lio/ktor/http/cio/MultipartEvent$MultipartPart;", "part", "partToData", "(Lio/ktor/http/cio/MultipartEvent$MultipartPart;LS3/c;)Ljava/lang/Object;", "readPart", "LS3/h;", "getCoroutineContext", "()LS3/h;", "previousPart", "Lio/ktor/http/content/PartData;", "LJ5/u;", "events", "LJ5/u;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CIOMultipartDataBase implements MultiPartData, A {
    private final h coroutineContext;
    private final u events;
    private PartData previousPart;

    @e(c = "io.ktor.http.cio.CIOMultipartDataBase", f = "CIOMultipartDataBase.kt", l = {62}, m = "eventToData")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.http.cio.CIOMultipartDataBase$eventToData$1, reason: invalid class name */
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
            return CIOMultipartDataBase.this.eventToData(null, this);
        }
    }

    @e(c = "io.ktor.http.cio.CIOMultipartDataBase", f = "CIOMultipartDataBase.kt", l = {75, 82}, m = "partToData")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.http.cio.CIOMultipartDataBase$partToData$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12201 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12201(S3.c<? super C12201> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CIOMultipartDataBase.this.partToData(null, this);
        }
    }

    @e(c = "io.ktor.http.cio.CIOMultipartDataBase", f = "CIOMultipartDataBase.kt", l = {39, 45}, m = "readPart")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.http.cio.CIOMultipartDataBase$readPart$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12211 extends c {
        int label;
        /* synthetic */ Object result;

        public C12211(S3.c<? super C12211> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CIOMultipartDataBase.this.readPart(this);
        }
    }

    @e(c = "io.ktor.http.cio.CIOMultipartDataBase", f = "CIOMultipartDataBase.kt", l = {51, 52}, m = "readPartSuspend")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.http.cio.CIOMultipartDataBase$readPartSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12221 extends c {
        int label;
        /* synthetic */ Object result;

        public C12221(S3.c<? super C12221> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CIOMultipartDataBase.this.readPartSuspend(this);
        }
    }

    public CIOMultipartDataBase(h hVar, ByteReadChannel byteReadChannel, CharSequence charSequence, Long l7, long j7) {
        l.f("coroutineContext", hVar);
        l.f("channel", byteReadChannel);
        l.f("contentType", charSequence);
        this.coroutineContext = hVar;
        this.events = MultipartKt.parseMultipart(this, byteReadChannel, charSequence, l7, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object eventToData(io.ktor.http.cio.MultipartEvent r5, S3.c<? super io.ktor.http.content.PartData> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.http.cio.CIOMultipartDataBase.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.http.cio.CIOMultipartDataBase$eventToData$1 r0 = (io.ktor.http.cio.CIOMultipartDataBase.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.http.cio.CIOMultipartDataBase$eventToData$1 r0 = new io.ktor.http.cio.CIOMultipartDataBase$eventToData$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            io.ktor.http.cio.MultipartEvent r5 = (io.ktor.http.cio.MultipartEvent) r5
            P3.r.Y(r6)     // Catch: java.lang.Throwable -> L2b
            goto L4a
        L2b:
            r6 = move-exception
            goto L52
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            P3.r.Y(r6)
            boolean r6 = r5 instanceof io.ktor.http.cio.MultipartEvent.MultipartPart     // Catch: java.lang.Throwable -> L2b
            if (r6 == 0) goto L4d
            r6 = r5
            io.ktor.http.cio.MultipartEvent$MultipartPart r6 = (io.ktor.http.cio.MultipartEvent.MultipartPart) r6     // Catch: java.lang.Throwable -> L2b
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L2b
            r0.label = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = r4.partToData(r6, r0)     // Catch: java.lang.Throwable -> L2b
            if (r6 != r1) goto L4a
            return r1
        L4a:
            io.ktor.http.content.PartData r6 = (io.ktor.http.content.PartData) r6     // Catch: java.lang.Throwable -> L2b
            return r6
        L4d:
            r5.release()     // Catch: java.lang.Throwable -> L2b
            r5 = 0
            return r5
        L52:
            r5.release()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.CIOMultipartDataBase.eventToData(io.ktor.http.cio.MultipartEvent, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object partToData(final io.ktor.http.cio.MultipartEvent.MultipartPart r8, S3.c<? super io.ktor.http.content.PartData> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof io.ktor.http.cio.CIOMultipartDataBase.C12201
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.http.cio.CIOMultipartDataBase$partToData$1 r0 = (io.ktor.http.cio.CIOMultipartDataBase.C12201) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.http.cio.CIOMultipartDataBase$partToData$1 r0 = new io.ktor.http.cio.CIOMultipartDataBase$partToData$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.L$1
            io.ktor.http.cio.HttpHeadersMap r8 = (io.ktor.http.cio.HttpHeadersMap) r8
            java.lang.Object r0 = r0.L$0
            io.ktor.http.cio.MultipartEvent$MultipartPart r0 = (io.ktor.http.cio.MultipartEvent.MultipartPart) r0
            P3.r.Y(r9)
            goto L8c
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.L$0
            io.ktor.http.cio.MultipartEvent$MultipartPart r8 = (io.ktor.http.cio.MultipartEvent.MultipartPart) r8
            P3.r.Y(r9)
            goto L55
        L43:
            P3.r.Y(r9)
            H5.G r9 = r8.getHeaders()
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r9 = r9.T(r0)
            if (r9 != r1) goto L55
            goto L87
        L55:
            io.ktor.http.cio.HttpHeadersMap r9 = (io.ktor.http.cio.HttpHeadersMap) r9
            java.lang.String r2 = "Content-Disposition"
            java.lang.CharSequence r2 = r9.get(r2)
            if (r2 == 0) goto L6a
            io.ktor.http.ContentDisposition$Companion r4 = io.ktor.http.ContentDisposition.INSTANCE
            java.lang.String r2 = r2.toString()
            io.ktor.http.ContentDisposition r2 = r4.parse(r2)
            goto L6b
        L6a:
            r2 = r5
        L6b:
            if (r2 == 0) goto L74
            java.lang.String r4 = "filename"
            java.lang.String r2 = r2.parameter(r4)
            goto L75
        L74:
            r2 = r5
        L75:
            io.ktor.utils.io.ByteReadChannel r4 = r8.getBody()
            if (r2 != 0) goto Lad
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r0 = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(r4, r0)
            if (r0 != r1) goto L88
        L87:
            return r1
        L88:
            r6 = r0
            r0 = r8
            r8 = r9
            r9 = r6
        L8c:
            S5.n r9 = (S5.n) r9
            io.ktor.http.content.PartData$FormItem r1 = new io.ktor.http.content.PartData$FormItem     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = io.ktor.utils.io.DeprecationKt.readText(r9)     // Catch: java.lang.Throwable -> La6
            io.ktor.http.cio.a r3 = new io.ktor.http.cio.a     // Catch: java.lang.Throwable -> La6
            r4 = 0
            r3.<init>()     // Catch: java.lang.Throwable -> La6
            io.ktor.http.cio.CIOHeaders r0 = new io.ktor.http.cio.CIOHeaders     // Catch: java.lang.Throwable -> La6
            r0.<init>(r8)     // Catch: java.lang.Throwable -> La6
            r1.<init>(r2, r3, r0)     // Catch: java.lang.Throwable -> La6
            q0.c.q(r9, r5)
            return r1
        La6:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> La8
        La8:
            r0 = move-exception
            q0.c.q(r9, r8)
            throw r0
        Lad:
            io.ktor.http.content.PartData$FileItem r0 = new io.ktor.http.content.PartData$FileItem
            io.ktor.http.cio.a r1 = new io.ktor.http.cio.a
            r2 = 1
            r1.<init>()
            io.ktor.http.cio.a r2 = new io.ktor.http.cio.a
            r3 = 2
            r2.<init>()
            io.ktor.http.cio.CIOHeaders r8 = new io.ktor.http.cio.CIOHeaders
            r8.<init>(r9)
            r0.<init>(r1, r2, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.CIOMultipartDataBase.partToData(io.ktor.http.cio.MultipartEvent$MultipartPart, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C partToData$lambda$4$lambda$3(MultipartEvent.MultipartPart multipartPart) {
        multipartPart.release();
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C partToData$lambda$6(MultipartEvent.MultipartPart multipartPart) {
        multipartPart.release();
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r6 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044 A[Catch: p -> 0x0054, PHI: r6
      0x0044: PHI (r6v3 java.lang.Object) = (r6v7 java.lang.Object), (r6v1 java.lang.Object) binds: [B:20:0x0041, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {p -> 0x0054, blocks: (B:12:0x0026, B:25:0x004f, B:19:0x0039, B:22:0x0044, B:16:0x0032), top: B:30:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x004c -> B:25:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readPartSuspend(S3.c<? super io.ktor.http.content.PartData> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.http.cio.CIOMultipartDataBase.C12221
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.http.cio.CIOMultipartDataBase$readPartSuspend$1 r0 = (io.ktor.http.cio.CIOMultipartDataBase.C12221) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.http.cio.CIOMultipartDataBase$readPartSuspend$1 r0 = new io.ktor.http.cio.CIOMultipartDataBase$readPartSuspend$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            P3.r.Y(r6)     // Catch: J5.p -> L54
            goto L4f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            P3.r.Y(r6)     // Catch: J5.p -> L54
            goto L44
        L36:
            P3.r.Y(r6)
        L39:
            J5.u r6 = r5.events     // Catch: J5.p -> L54
            r0.label = r4     // Catch: J5.p -> L54
            java.lang.Object r6 = r6.receive(r0)     // Catch: J5.p -> L54
            if (r6 != r1) goto L44
            goto L4e
        L44:
            io.ktor.http.cio.MultipartEvent r6 = (io.ktor.http.cio.MultipartEvent) r6     // Catch: J5.p -> L54
            r0.label = r3     // Catch: J5.p -> L54
            java.lang.Object r6 = r5.eventToData(r6, r0)     // Catch: J5.p -> L54
            if (r6 != r1) goto L4f
        L4e:
            return r1
        L4f:
            io.ktor.http.content.PartData r6 = (io.ktor.http.content.PartData) r6     // Catch: J5.p -> L54
            if (r6 == 0) goto L39
            return r6
        L54:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.CIOMultipartDataBase.readPartSuspend(S3.c):java.lang.Object");
    }

    @Override // H5.A
    public h getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        if (r6 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0064 -> B:31:0x0067). Please report as a decompilation issue!!! */
    @Override // io.ktor.http.content.MultiPartData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object readPart(S3.c<? super io.ktor.http.content.PartData> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.http.cio.CIOMultipartDataBase.C12211
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.http.cio.CIOMultipartDataBase$readPart$1 r0 = (io.ktor.http.cio.CIOMultipartDataBase.C12211) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.http.cio.CIOMultipartDataBase$readPart$1 r0 = new io.ktor.http.cio.CIOMultipartDataBase$readPart$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            P3.r.Y(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            P3.r.Y(r6)
            goto L67
        L36:
            P3.r.Y(r6)
            io.ktor.http.content.PartData r6 = r5.previousPart
            if (r6 == 0) goto L46
            e4.a r6 = r6.getDispose()
            if (r6 == 0) goto L46
            r6.invoke()
        L46:
            J5.u r6 = r5.events
            java.lang.Object r6 = r6.a()
            java.lang.Object r6 = J5.m.a(r6)
            io.ktor.http.cio.MultipartEvent r6 = (io.ktor.http.cio.MultipartEvent) r6
            if (r6 != 0) goto L5e
            r0.label = r3
            java.lang.Object r6 = r5.readPartSuspend(r0)
            if (r6 != r1) goto L5d
            goto L66
        L5d:
            return r6
        L5e:
            r0.label = r4
            java.lang.Object r6 = r5.eventToData(r6, r0)
            if (r6 != r1) goto L67
        L66:
            return r1
        L67:
            io.ktor.http.content.PartData r6 = (io.ktor.http.content.PartData) r6
            if (r6 == 0) goto L46
            r5.previousPart = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.CIOMultipartDataBase.readPart(S3.c):java.lang.Object");
    }

    public /* synthetic */ CIOMultipartDataBase(h hVar, ByteReadChannel byteReadChannel, CharSequence charSequence, Long l7, long j7, int i7, f fVar) {
        this(hVar, byteReadChannel, charSequence, l7, (i7 & 16) != 0 ? 65536L : j7);
    }
}
