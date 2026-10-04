package io.ktor.serialization.kotlinx.json;

import O3.C;
import P3.r;
import S5.a;
import U3.c;
import U3.e;
import U3.j;
import X4.y;
import a6.d;
import b6.v;
import e4.n;
import io.ktor.http.ContentType;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.http.content.ChannelWriterContent;
import io.ktor.http.content.OutgoingContent;
import io.ktor.serialization.ContentConverter;
import io.ktor.serialization.kotlinx.SerializerLookupKt;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.core.ByteReadPacketKt;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/ktor/serialization/kotlinx/json/ExperimentalJsonConverter;", "Lio/ktor/serialization/ContentConverter;", "La6/d;", "format", "<init>", "(La6/d;)V", "Lio/ktor/http/ContentType;", "contentType", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", HttpAuthHeader.Parameters.Charset, "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "", "value", "Lio/ktor/http/content/OutgoingContent;", "serialize", "(Lio/ktor/http/ContentType;Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Object;LS3/c;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "content", "deserialize", "(Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Lio/ktor/utils/io/ByteReadChannel;LS3/c;)Ljava/lang/Object;", "La6/d;", "ktor-serialization-kotlinx-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExperimentalJsonConverter implements ContentConverter {
    private final d format;

    @e(c = "io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter", f = "ExperimentalJsonConverter.kt", l = {51}, m = "deserialize")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter$deserialize$1, reason: invalid class name */
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
            return ExperimentalJsonConverter.this.deserialize(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "LO3/C;", "<anonymous>", "(Lio/ktor/utils/io/ByteWriteChannel;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter$serialize$2", f = "ExperimentalJsonConverter.kt", l = {}, m = "invokeSuspend")
    /* renamed from: io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter$serialize$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements n {
        final /* synthetic */ a $buffer;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a aVar, S3.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$buffer = aVar;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$buffer, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // e4.n
        public final Object invoke(ByteWriteChannel byteWriteChannel, S3.c<? super C> cVar) {
            return ((AnonymousClass2) create(byteWriteChannel, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            T3.a aVar = T3.a.f9048k;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
            ((ByteWriteChannel) this.L$0).getWriteBuffer().M(this.$buffer);
            return C.a;
        }
    }

    public ExperimentalJsonConverter(d dVar) {
        l.f("format", dVar);
        this.format = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.serialization.ContentConverter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deserialize(java.nio.charset.Charset r4, io.ktor.util.reflect.TypeInfo r5, io.ktor.utils.io.ByteReadChannel r6, S3.c<java.lang.Object> r7) throws java.lang.Throwable {
        /*
            r3 = this;
            boolean r4 = r7 instanceof io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter.AnonymousClass1
            if (r4 == 0) goto L13
            r4 = r7
            io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter$deserialize$1 r4 = (io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter.AnonymousClass1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.label = r0
            goto L18
        L13:
            io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter$deserialize$1 r4 = new io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter$deserialize$1
            r4.<init>(r7)
        L18:
            java.lang.Object r7 = r4.result
            T3.a r0 = T3.a.f9048k
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.lang.Object r4 = r4.L$0
            kotlinx.serialization.KSerializer r4 = (kotlinx.serialization.KSerializer) r4
            P3.r.Y(r7)
            goto L4a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            P3.r.Y(r7)
            a6.d r7 = r3.format
            e6.a r7 = r7.f10460b
            kotlinx.serialization.KSerializer r5 = io.ktor.serialization.kotlinx.SerializerLookupKt.serializerForTypeInfo(r7, r5)
            r4.L$0 = r5
            r4.label = r2
            java.lang.Object r7 = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(r6, r4)
            if (r7 != r0) goto L49
            return r0
        L49:
            r4 = r5
        L4a:
            S5.n r7 = (S5.n) r7
            a6.d r5 = r3.format     // Catch: java.lang.Throwable -> L55
            kotlinx.serialization.KSerializer r4 = (kotlinx.serialization.KSerializer) r4     // Catch: java.lang.Throwable -> L55
            java.lang.Object r4 = z1.c.m(r5, r4, r7)     // Catch: java.lang.Throwable -> L55
            return r4
        L55:
            r4 = move-exception
            io.ktor.serialization.JsonConvertException r5 = new io.ktor.serialization.JsonConvertException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Illegal input: "
            r6.<init>(r7)
            java.lang.String r7 = r4.getMessage()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter.deserialize(java.nio.charset.Charset, io.ktor.util.reflect.TypeInfo, io.ktor.utils.io.ByteReadChannel, S3.c):java.lang.Object");
    }

    @Override // io.ktor.serialization.ContentConverter
    public Object serialize(ContentType contentType, Charset charset, TypeInfo typeInfo, Object obj, S3.c<? super OutgoingContent> cVar) {
        KSerializer kSerializerGuessSerializer;
        try {
            kSerializerGuessSerializer = SerializerLookupKt.serializerForTypeInfo(this.format.f10460b, typeInfo);
        } catch (V5.j unused) {
            kSerializerGuessSerializer = SerializerLookupKt.guessSerializer(obj, this.format.f10460b);
        }
        a aVar = new a();
        d dVar = this.format;
        l.d("null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>", kSerializerGuessSerializer);
        l.f("<this>", dVar);
        v.k(dVar, new y(7, aVar), kSerializerGuessSerializer, obj);
        return new ChannelWriterContent(new AnonymousClass2(aVar, null), contentType, null, new Long(ByteReadPacketKt.getRemaining(aVar)), 4, null);
    }
}
