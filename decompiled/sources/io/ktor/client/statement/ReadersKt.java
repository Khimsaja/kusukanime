package io.ktor.client.statement;

import O3.C;
import T3.a;
import U3.c;
import U3.e;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0087@¢\u0006\u0004\b\u0004\u0010\u0007\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u0000H\u0086@¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lio/ktor/client/statement/HttpResponse;", "", "count", "", "readBytes", "(Lio/ktor/client/statement/HttpResponse;ILS3/c;)Ljava/lang/Object;", "readRawBytes", "(Lio/ktor/client/statement/HttpResponse;LS3/c;)Ljava/lang/Object;", "LO3/C;", "discardRemaining", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReadersKt {

    @e(c = "io.ktor.client.statement.ReadersKt", f = "Readers.kt", l = {17}, m = "readBytes")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.statement.ReadersKt$readBytes$1, reason: invalid class name */
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
            return ReadersKt.readBytes(null, 0, this);
        }
    }

    @e(c = "io.ktor.client.statement.ReadersKt", f = "Readers.kt", l = {53}, m = "readBytes")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.statement.ReadersKt$readBytes$3, reason: invalid class name */
    public static final class AnonymousClass3 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(S3.c<? super AnonymousClass3> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReadersKt.readBytes(null, this);
        }
    }

    @e(c = "io.ktor.client.statement.ReadersKt", f = "Readers.kt", l = {35}, m = "readRawBytes")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.statement.ReadersKt$readRawBytes$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12161 extends c {
        int label;
        /* synthetic */ Object result;

        public C12161(S3.c<? super C12161> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReadersKt.readRawBytes(null, this);
        }
    }

    public static final Object discardRemaining(HttpResponse httpResponse, S3.c<? super C> cVar) {
        Object objDiscard$default = ByteReadChannelOperationsKt.discard$default(httpResponse.getRawContent(), 0L, cVar, 1, null);
        return objDiscard$default == a.f9048k ? objDiscard$default : C.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readBytes(io.ktor.client.statement.HttpResponse r8, int r9, S3.c<? super byte[]> r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof io.ktor.client.statement.ReadersKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r10
            io.ktor.client.statement.ReadersKt$readBytes$1 r0 = (io.ktor.client.statement.ReadersKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            io.ktor.client.statement.ReadersKt$readBytes$1 r0 = new io.ktor.client.statement.ReadersKt$readBytes$1
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r5.result
            T3.a r0 = T3.a.f9048k
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            java.lang.Object r8 = r5.L$0
            byte[] r8 = (byte[]) r8
            P3.r.Y(r10)
            return r8
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            P3.r.Y(r10)
            byte[] r9 = new byte[r9]
            io.ktor.utils.io.ByteReadChannel r1 = r8.getRawContent()
            r5.L$0 = r9
            r5.label = r2
            r3 = 0
            r4 = 0
            r6 = 6
            r7 = 0
            r2 = r9
            java.lang.Object r8 = io.ktor.utils.io.ByteReadChannelOperationsKt.readFully$default(r1, r2, r3, r4, r5, r6, r7)
            if (r8 != r0) goto L4e
            return r0
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.ReadersKt.readBytes(io.ktor.client.statement.HttpResponse, int, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readRawBytes(io.ktor.client.statement.HttpResponse r4, S3.c<? super byte[]> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.client.statement.ReadersKt.C12161
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.client.statement.ReadersKt$readRawBytes$1 r0 = (io.ktor.client.statement.ReadersKt.C12161) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.ReadersKt$readRawBytes$1 r0 = new io.ktor.client.statement.ReadersKt$readRawBytes$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            P3.r.Y(r5)
            io.ktor.utils.io.ByteReadChannel r4 = r4.getRawContent()
            r0.label = r3
            java.lang.Object r5 = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(r4, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            S5.n r5 = (S5.n) r5
            byte[] r4 = S5.p.h(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.ReadersKt.readRawBytes(io.ktor.client.statement.HttpResponse, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @O3.InterfaceC0554c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readBytes(io.ktor.client.statement.HttpResponse r4, S3.c<? super byte[]> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.client.statement.ReadersKt.AnonymousClass3
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.client.statement.ReadersKt$readBytes$3 r0 = (io.ktor.client.statement.ReadersKt.AnonymousClass3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.ReadersKt$readBytes$3 r0 = new io.ktor.client.statement.ReadersKt$readBytes$3
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            P3.r.Y(r5)
            io.ktor.utils.io.ByteReadChannel r4 = r4.getRawContent()
            r0.label = r3
            java.lang.Object r5 = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(r4, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            S5.n r5 = (S5.n) r5
            byte[] r4 = S5.p.h(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.ReadersKt.readBytes(io.ktor.client.statement.HttpResponse, S3.c):java.lang.Object");
    }
}
