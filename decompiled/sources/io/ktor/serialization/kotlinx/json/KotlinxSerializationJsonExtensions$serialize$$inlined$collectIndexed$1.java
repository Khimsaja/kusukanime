package io.ktor.serialization.kotlinx.json;

import K5.InterfaceC0330i;
import U3.c;
import U3.e;
import io.ktor.utils.io.ByteWriteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"io/ktor/serialization/kotlinx/json/KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1", "LK5/i;", "value", "LO3/C;", "emit", "(Ljava/lang/Object;LS3/c;)Ljava/lang/Object;", "", "index", "I", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1 implements InterfaceC0330i {
    final /* synthetic */ ByteWriteChannel $channel$inlined;
    final /* synthetic */ Charset $charset$inlined;
    final /* synthetic */ JsonArraySymbols $jsonArraySymbols$inlined;
    final /* synthetic */ KSerializer $serializer$inlined;
    private int index;
    final /* synthetic */ KotlinxSerializationJsonExtensions this$0;

    @e(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1", f = "KotlinxSerializationJsonExtensions.kt", l = {120, 123, 124}, m = "emit")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.this.emit(null, this);
        }
    }

    public KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1(ByteWriteChannel byteWriteChannel, JsonArraySymbols jsonArraySymbols, KotlinxSerializationJsonExtensions kotlinxSerializationJsonExtensions, KSerializer kSerializer, Charset charset) {
        this.$channel$inlined = byteWriteChannel;
        this.$jsonArraySymbols$inlined = jsonArraySymbols;
        this.this$0 = kotlinxSerializationJsonExtensions;
        this.$serializer$inlined = kSerializer;
        this.$charset$inlined = charset;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (r11.flush(r5) != r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // K5.InterfaceC0330i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(T r11, S3.c<? super O3.C> r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r12
            io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1$1 r0 = (io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.AnonymousClass1) r0
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
            io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1$1 r0 = new io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1$1
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r5.result
            T3.a r0 = T3.a.f9048k
            int r1 = r5.label
            r8 = 3
            r9 = 2
            r2 = 1
            if (r1 == 0) goto L41
            if (r1 == r2) goto L3b
            if (r1 == r9) goto L37
            if (r1 != r8) goto L2f
            P3.r.Y(r12)
            goto L97
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            P3.r.Y(r12)
            goto L8c
        L3b:
            java.lang.Object r11 = r5.L$0
            P3.r.Y(r12)
            goto L66
        L41:
            P3.r.Y(r12)
            int r12 = r10.index
            int r1 = r12 + 1
            r10.index = r1
            if (r12 < 0) goto L9a
            if (r12 <= 0) goto L66
            io.ktor.utils.io.ByteWriteChannel r1 = r10.$channel$inlined
            io.ktor.serialization.kotlinx.json.JsonArraySymbols r12 = r10.$jsonArraySymbols$inlined
            byte[] r12 = r12.getObjectSeparator()
            r5.L$0 = r11
            r5.label = r2
            r3 = 0
            r4 = 0
            r6 = 6
            r7 = 0
            r2 = r12
            java.lang.Object r12 = io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(r1, r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L66
            goto L96
        L66:
            io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions r12 = r10.this$0
            a6.d r12 = io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.access$getFormat$p(r12)
            kotlinx.serialization.KSerializer r1 = r10.$serializer$inlined
            kotlinx.serialization.KSerializer r1 = (kotlinx.serialization.KSerializer) r1
            java.lang.String r11 = r12.d(r1, r11)
            io.ktor.utils.io.ByteWriteChannel r1 = r10.$channel$inlined
            java.nio.charset.Charset r12 = r10.$charset$inlined
            byte[] r2 = io.ktor.utils.io.core.StringsKt.toByteArray(r11, r12)
            r11 = 0
            r5.L$0 = r11
            r5.label = r9
            r3 = 0
            r4 = 0
            r6 = 6
            r7 = 0
            java.lang.Object r11 = io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(r1, r2, r3, r4, r5, r6, r7)
            if (r11 != r0) goto L8c
            goto L96
        L8c:
            io.ktor.utils.io.ByteWriteChannel r11 = r10.$channel$inlined
            r5.label = r8
            java.lang.Object r11 = r11.flush(r5)
            if (r11 != r0) goto L97
        L96:
            return r0
        L97:
            O3.C r11 = O3.C.a
            return r11
        L9a:
            java.lang.ArithmeticException r11 = new java.lang.ArithmeticException
            java.lang.String r12 = "Index overflow has happened"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.emit(java.lang.Object, S3.c):java.lang.Object");
    }
}
