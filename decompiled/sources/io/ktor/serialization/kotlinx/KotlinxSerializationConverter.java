package io.ktor.serialization.kotlinx;

import U3.c;
import U3.e;
import V5.g;
import a6.d;
import io.ktor.http.ContentType;
import io.ktor.http.ContentTypesKt;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.TextContent;
import io.ktor.serialization.ContentConverter;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lio/ktor/serialization/kotlinx/KotlinxSerializationConverter;", "Lio/ktor/serialization/ContentConverter;", "LV5/g;", "format", "<init>", "(LV5/g;)V", "Lkotlinx/serialization/KSerializer;", "serializer", "", "value", "Lio/ktor/http/ContentType;", "contentType", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", HttpAuthHeader.Parameters.Charset, "Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "serializeContent", "(Lkotlinx/serialization/KSerializer;LV5/g;Ljava/lang/Object;Lio/ktor/http/ContentType;Ljava/nio/charset/Charset;)Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", "Lio/ktor/http/content/OutgoingContent;", "serialize", "(Lio/ktor/http/ContentType;Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Object;LS3/c;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "content", "deserialize", "(Ljava/nio/charset/Charset;Lio/ktor/util/reflect/TypeInfo;Lio/ktor/utils/io/ByteReadChannel;LS3/c;)Ljava/lang/Object;", "LV5/g;", "", "Lio/ktor/serialization/kotlinx/KotlinxSerializationExtension;", "extensions", "Ljava/util/List;", "ktor-serialization-kotlinx"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KotlinxSerializationConverter implements ContentConverter {
    private final List<KotlinxSerializationExtension> extensions;
    private final g format;

    @e(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter", f = "KotlinxSerializationConverter.kt", l = {63, 67}, m = "deserialize")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinxSerializationConverter.this.deserialize(null, null, null, this);
        }
    }

    @e(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter", f = "KotlinxSerializationConverter.kt", l = {48}, m = "serialize")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12381 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C12381(S3.c<? super C12381> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinxSerializationConverter.this.serialize(null, null, null, null, this);
        }
    }

    public KotlinxSerializationConverter(g gVar) {
        l.f("format", gVar);
        this.format = gVar;
        this.extensions = ExtensionsKt.extensions(gVar);
        if (gVar instanceof V5.l) {
            return;
        }
        throw new IllegalArgumentException(("Only binary and string formats are supported, " + gVar + " is not supported.").toString());
    }

    private final OutgoingContent.ByteArrayContent serializeContent(KSerializer serializer, g format, Object value, ContentType contentType, Charset charset) {
        if (!(format instanceof V5.l)) {
            throw new IllegalStateException(("Unsupported format " + format).toString());
        }
        l.d("null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>", serializer);
        return new TextContent(((d) ((V5.l) format)).d(serializer, value), ContentTypesKt.withCharsetIfNeeded(contentType, charset), null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7 A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:30:0x00a1, B:32:0x00a7, B:36:0x00b9, B:37:0x00d5), top: B:40:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9 A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:30:0x00a1, B:32:0x00a7, B:36:0x00b9, B:37:0x00d5), top: B:40:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // io.ktor.serialization.ContentConverter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deserialize(final java.nio.charset.Charset r9, final io.ktor.util.reflect.TypeInfo r10, final io.ktor.utils.io.ByteReadChannel r11, S3.c<java.lang.Object> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.kotlinx.KotlinxSerializationConverter.deserialize(java.nio.charset.Charset, io.ktor.util.reflect.TypeInfo, io.ktor.utils.io.ByteReadChannel, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.serialization.ContentConverter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object serialize(io.ktor.http.ContentType r11, java.nio.charset.Charset r12, final io.ktor.util.reflect.TypeInfo r13, final java.lang.Object r14, S3.c<? super io.ktor.http.content.OutgoingContent> r15) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r15 instanceof io.ktor.serialization.kotlinx.KotlinxSerializationConverter.C12381
            if (r0 == 0) goto L13
            r0 = r15
            io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$1 r0 = (io.ktor.serialization.kotlinx.KotlinxSerializationConverter.C12381) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$1 r0 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r14 = r0.L$3
            java.lang.Object r11 = r0.L$2
            r13 = r11
            io.ktor.util.reflect.TypeInfo r13 = (io.ktor.util.reflect.TypeInfo) r13
            java.lang.Object r11 = r0.L$1
            r12 = r11
            java.nio.charset.Charset r12 = (java.nio.charset.Charset) r12
            java.lang.Object r11 = r0.L$0
            io.ktor.http.ContentType r11 = (io.ktor.http.ContentType) r11
            P3.r.Y(r15)
            r6 = r11
            r7 = r12
            r5 = r14
            goto L6e
        L3a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L42:
            P3.r.Y(r15)
            java.util.List<io.ktor.serialization.kotlinx.KotlinxSerializationExtension> r15 = r10.extensions
            K5.k r5 = new K5.k
            r5.<init>(r15)
            io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1 r4 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$$inlined$map$1
            r6 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r4.<init>()
            io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$fromExtension$2 r11 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$fromExtension$2
            r12 = 0
            r11.<init>(r12)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.L$3 = r9
            r0.label = r3
            java.lang.Object r15 = K5.N.j(r4, r11, r0)
            if (r15 != r1) goto L6c
            return r1
        L6c:
            r13 = r8
            r5 = r9
        L6e:
            io.ktor.http.content.OutgoingContent r15 = (io.ktor.http.content.OutgoingContent) r15
            if (r15 == 0) goto L73
            return r15
        L73:
            V5.g r11 = r10.format     // Catch: V5.j -> L7f
            a6.d r11 = (a6.d) r11     // Catch: V5.j -> L7f
            e6.a r11 = r11.f10460b     // Catch: V5.j -> L7f
            kotlinx.serialization.KSerializer r11 = io.ktor.serialization.kotlinx.SerializerLookupKt.serializerForTypeInfo(r11, r13)     // Catch: V5.j -> L7f
        L7d:
            r3 = r11
            goto L8a
        L7f:
            V5.g r11 = r10.format
            a6.d r11 = (a6.d) r11
            e6.a r11 = r11.f10460b
            kotlinx.serialization.KSerializer r11 = io.ktor.serialization.kotlinx.SerializerLookupKt.guessSerializer(r5, r11)
            goto L7d
        L8a:
            V5.g r4 = r10.format
            r2 = r10
            io.ktor.http.content.OutgoingContent$ByteArrayContent r11 = r2.serializeContent(r3, r4, r5, r6, r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.kotlinx.KotlinxSerializationConverter.serialize(io.ktor.http.ContentType, java.nio.charset.Charset, io.ktor.util.reflect.TypeInfo, java.lang.Object, S3.c):java.lang.Object");
    }
}
