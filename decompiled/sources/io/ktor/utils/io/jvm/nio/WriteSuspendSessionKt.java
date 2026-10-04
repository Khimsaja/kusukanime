package io.ktor.utils.io.jvm.nio;

import O3.C;
import S5.a;
import S5.j;
import S5.p;
import U3.c;
import U3.e;
import b1.AbstractC0703b;
import e4.k;
import io.ktor.utils.io.ByteWriteChannel;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a8\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0087@¢\u0006\u0004\b\u0007\u0010\b\u001a*\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0086H¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "Lkotlin/Function2;", "Lio/ktor/utils/io/jvm/nio/WriteSuspendSession;", "LS3/c;", "LO3/C;", "", "block", "writeSuspendSession", "(Lio/ktor/utils/io/ByteWriteChannel;Le4/n;LS3/c;)Ljava/lang/Object;", "Lkotlin/Function1;", "Ljava/nio/ByteBuffer;", "", "writeWhile", "(Lio/ktor/utils/io/ByteWriteChannel;Le4/k;LS3/c;)Ljava/lang/Object;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WriteSuspendSessionKt {

    @e(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt", f = "WriteSuspendSession.kt", l = {43, 45, 45}, m = "writeSuspendSession")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeSuspendSession$1, reason: invalid class name */
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
            return WriteSuspendSessionKt.writeSuspendSession(null, null, this);
        }
    }

    @e(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt", f = "WriteSuspendSession.kt", l = {59}, m = "writeWhile")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    /* renamed from: io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeWhile$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12831 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C12831(S3.c<? super C12831> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WriteSuspendSessionKt.writeWhile(null, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r7 == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [e4.n] */
    @O3.InterfaceC0554c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object writeSuspendSession(io.ktor.utils.io.ByteWriteChannel r7, e4.n r8, S3.c<? super O3.C> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeSuspendSession$1 r0 = (io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeSuspendSession$1 r0 = new io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeSuspendSession$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L39
            if (r2 == r3) goto L31
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            java.lang.Object r7 = r0.L$0
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            P3.r.Y(r9)
            goto L77
        L39:
            P3.r.Y(r9)
            goto L69
        L3d:
            java.lang.Object r7 = r0.L$0
            io.ktor.utils.io.ByteWriteChannel r7 = (io.ktor.utils.io.ByteWriteChannel) r7
            P3.r.Y(r9)     // Catch: java.lang.Throwable -> L45
            goto L5d
        L45:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
            goto L6c
        L4a:
            P3.r.Y(r9)
            io.ktor.utils.io.jvm.nio.WriteSuspendSession r9 = new io.ktor.utils.io.jvm.nio.WriteSuspendSession     // Catch: java.lang.Throwable -> L45
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L45
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L45
            r0.label = r5     // Catch: java.lang.Throwable -> L45
            java.lang.Object r8 = r8.invoke(r9, r0)     // Catch: java.lang.Throwable -> L45
            if (r8 != r1) goto L5d
            goto L76
        L5d:
            r8 = 0
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r7 = r7.flush(r0)
            if (r7 != r1) goto L69
            goto L76
        L69:
            O3.C r7 = O3.C.a
            return r7
        L6c:
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r8.flush(r0)
            if (r8 != r1) goto L77
        L76:
            return r1
        L77:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt.writeSuspendSession(io.ktor.utils.io.ByteWriteChannel, e4.n, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object writeWhile(io.ktor.utils.io.ByteWriteChannel r9, e4.k r10, S3.c<? super O3.C> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt.writeWhile(io.ktor.utils.io.ByteWriteChannel, e4.k, S3.c):java.lang.Object");
    }

    private static final Object writeWhile$$forInline(ByteWriteChannel byteWriteChannel, k kVar, S3.c<? super C> cVar) {
        boolean z7 = false;
        while (!z7) {
            a aVarA = byteWriteChannel.getWriteBuffer().a();
            j jVarM = aVarA.m(1);
            int i7 = jVarM.f8802c;
            byte[] bArr = jVarM.a;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i7, bArr.length - i7);
            l.c(byteBufferWrap);
            boolean z8 = !((Boolean) kVar.invoke(byteBufferWrap)).booleanValue();
            int iPosition = byteBufferWrap.position() - i7;
            if (iPosition == 1) {
                jVarM.f8802c += iPosition;
                aVarA.f8784m += iPosition;
            } else {
                if (iPosition < 0 || iPosition > jVarM.a()) {
                    StringBuilder sbP = AbstractC0703b.p(iPosition, "Invalid number of bytes written: ", ". Should be in 0..");
                    sbP.append(jVarM.a());
                    throw new IllegalStateException(sbP.toString().toString());
                }
                if (iPosition != 0) {
                    jVarM.f8802c += iPosition;
                    aVarA.f8784m += iPosition;
                } else if (p.f(jVarM)) {
                    aVarA.i();
                }
            }
            byteWriteChannel.flush(cVar);
            z7 = z8;
        }
        return C.a;
    }
}
