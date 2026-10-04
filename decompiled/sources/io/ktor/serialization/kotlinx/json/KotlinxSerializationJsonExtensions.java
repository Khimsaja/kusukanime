package io.ktor.serialization.kotlinx.json;

import K5.InterfaceC0329h;
import O3.C;
import P3.r;
import T3.a;
import U3.c;
import U3.e;
import U3.j;
import a6.d;
import e4.n;
import io.ktor.http.ContentType;
import io.ktor.http.ContentTypesKt;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.http.content.ChannelWriterContent;
import io.ktor.http.content.OutgoingContent;
import io.ktor.serialization.kotlinx.KotlinxSerializationExtension;
import io.ktor.serialization.kotlinx.SerializerLookupKt;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteWriteChannel;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import kotlinx.serialization.KSerializer;
import z5.C2496a;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0010\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096@¢\u0006\u0004\b\u0010\u0010\u0019J.\u0010\u001c\u001a\u0004\u0018\u00010\u00162\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR$\u0010!\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lio/ktor/serialization/kotlinx/json/KotlinxSerializationJsonExtensions;", "Lio/ktor/serialization/kotlinx/KotlinxSerializationExtension;", "La6/d;", "format", "<init>", "(La6/d;)V", "T", "LK5/h;", "Lkotlinx/serialization/KSerializer;", "serializer", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", HttpAuthHeader.Parameters.Charset, "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "LO3/C;", "serialize", "(LK5/h;Lkotlinx/serialization/KSerializer;Ljava/nio/charset/Charset;Lio/ktor/utils/io/ByteWriteChannel;LS3/c;)Ljava/lang/Object;", "Lio/ktor/http/ContentType;", "contentType", "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "", "value", "Lio/ktor/http/content/OutgoingContent;", "(Lio/ktor/http/ContentType;Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Object;LS3/c;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "content", "deserialize", "(Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Lio/ktor/utils/io/ByteReadChannel;LS3/c;)Ljava/lang/Object;", "La6/d;", "", "Lio/ktor/serialization/kotlinx/json/JsonArraySymbols;", "jsonArraySymbolsMap", "Ljava/util/Map;", "ktor-serialization-kotlinx-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KotlinxSerializationJsonExtensions implements KotlinxSerializationExtension {
    private final d format;
    private final Map<Charset, JsonArraySymbols> jsonArraySymbolsMap;

    @e(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions", f = "KotlinxSerializationJsonExtensions.kt", l = {66}, m = "deserialize")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$deserialize$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinxSerializationJsonExtensions.this.deserialize(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "LO3/C;", "<anonymous>", "(Lio/ktor/utils/io/ByteWriteChannel;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$2", f = "KotlinxSerializationJsonExtensions.kt", l = {51}, m = "invokeSuspend")
    /* renamed from: io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements n {
        final /* synthetic */ Charset $charset;
        final /* synthetic */ KSerializer $serializer;
        final /* synthetic */ Object $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Object obj, KSerializer kSerializer, Charset charset, S3.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$value = obj;
            this.$serializer = kSerializer;
            this.$charset = charset;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = KotlinxSerializationJsonExtensions.this.new AnonymousClass2(this.$value, this.$serializer, this.$charset, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // e4.n
        public final Object invoke(ByteWriteChannel byteWriteChannel, S3.c<? super C> cVar) {
            return ((AnonymousClass2) create(byteWriteChannel, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar = a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                ByteWriteChannel byteWriteChannel = (ByteWriteChannel) this.L$0;
                KotlinxSerializationJsonExtensions kotlinxSerializationJsonExtensions = KotlinxSerializationJsonExtensions.this;
                Object obj2 = this.$value;
                l.d("null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<*>", obj2);
                KSerializer kSerializer = this.$serializer;
                l.d("null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>", kSerializer);
                Charset charset = this.$charset;
                this.label = 1;
                if (kotlinxSerializationJsonExtensions.serialize((InterfaceC0329h) obj2, kSerializer, charset, byteWriteChannel, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
            return C.a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions", f = "KotlinxSerializationJsonExtensions.kt", l = {80, 120, 89}, m = "serialize")
    /* renamed from: io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$3, reason: invalid class name */
    public static final class AnonymousClass3<T> extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(S3.c<? super AnonymousClass3> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinxSerializationJsonExtensions.this.serialize((InterfaceC0329h) null, (KSerializer) null, (Charset) null, (ByteWriteChannel) null, this);
        }
    }

    public KotlinxSerializationJsonExtensions(d dVar) {
        l.f("format", dVar);
        this.format = dVar;
        this.jsonArraySymbolsMap = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.serialization.kotlinx.KotlinxSerializationExtension
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deserialize(java.nio.charset.Charset r5, io.ktor.util.reflect.TypeInfo r6, io.ktor.utils.io.ByteReadChannel r7, S3.c<java.lang.Object> r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$deserialize$1 r0 = (io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$deserialize$1 r0 = new io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$deserialize$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            P3.r.Y(r8)     // Catch: java.lang.Throwable -> L27
            return r8
        L27:
            r5 = move-exception
            goto L5b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            P3.r.Y(r8)
            java.nio.charset.Charset r8 = z5.C2496a.f19036b
            boolean r5 = kotlin.jvm.internal.l.a(r5, r8)
            if (r5 == 0) goto L73
            l4.d r5 = r6.getType()
            kotlin.jvm.internal.z r8 = kotlin.jvm.internal.y.a
            java.lang.Class<y5.h> r2 = y5.h.class
            l4.d r8 = r8.b(r2)
            boolean r5 = kotlin.jvm.internal.l.a(r5, r8)
            if (r5 != 0) goto L4f
            goto L73
        L4f:
            a6.d r5 = r4.format     // Catch: java.lang.Throwable -> L27
            r0.label = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = io.ktor.serialization.kotlinx.json.JsonExtensionsJvmKt.deserializeSequence(r5, r7, r6, r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L5a
            return r1
        L5a:
            return r5
        L5b:
            io.ktor.serialization.JsonConvertException r6 = new io.ktor.serialization.JsonConvertException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Illegal input: "
            r7.<init>(r8)
            java.lang.String r8 = r5.getMessage()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7, r5)
            throw r6
        L73:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.deserialize(java.nio.charset.Charset, io.ktor.util.reflect.TypeInfo, io.ktor.utils.io.ByteReadChannel, S3.c):java.lang.Object");
    }

    @Override // io.ktor.serialization.kotlinx.KotlinxSerializationExtension
    public Object serialize(ContentType contentType, Charset charset, TypeInfo typeInfo, Object obj, S3.c<? super OutgoingContent> cVar) {
        if (!l.a(charset, C2496a.f19036b) || !l.a(typeInfo.getType(), y.a.b(InterfaceC0329h.class))) {
            return null;
        }
        return new ChannelWriterContent(new AnonymousClass2(obj, SerializerLookupKt.serializerForTypeInfo(this.format.f10460b, KotlinxSerializationJsonExtensionsKt.argumentTypeInfo(typeInfo)), charset, null), ContentTypesKt.withCharsetIfNeeded(contentType, charset), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d9, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(r3, r4, 0, 0, r8, 6, null) != r11) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object serialize(K5.InterfaceC0329h r17, kotlinx.serialization.KSerializer r18, java.nio.charset.Charset r19, io.ktor.utils.io.ByteWriteChannel r20, S3.c<? super O3.C> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.serialize(K5.h, kotlinx.serialization.KSerializer, java.nio.charset.Charset, io.ktor.utils.io.ByteWriteChannel, S3.c):java.lang.Object");
    }
}
