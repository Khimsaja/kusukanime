package io.ktor.serialization;

import U3.c;
import U3.e;
import io.ktor.http.HeaderValue;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaderValueParserKt;
import io.ktor.http.HttpHeaders;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import java.nio.charset.Charset;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.C2496a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00060\u0001j\u0002`\u0002*\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\u0006\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a6\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\r\u001a\u00060\u0001j\u0002`\u0002H\u0087@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/http/Headers;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "defaultCharset", "suitableCharset", "(Lio/ktor/http/Headers;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "suitableCharsetOrNull", "", "Lio/ktor/serialization/ContentConverter;", "Lio/ktor/utils/io/ByteReadChannel;", "body", "Lio/ktor/util/reflect/TypeInfo;", "typeInfo", HttpAuthHeader.Parameters.Charset, "", "deserialize", "(Ljava/util/List;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/util/reflect/TypeInfo;Ljava/nio/charset/Charset;LS3/c;)Ljava/lang/Object;", "ktor-serialization"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentConverterKt {

    @e(c = "io.ktor.serialization.ContentConverterKt", f = "ContentConverter.kt", l = {113}, m = "deserialize")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.serialization.ContentConverterKt$deserialize$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContentConverterKt.deserialize(null, null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @io.ktor.utils.io.InternalAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object deserialize(java.util.List<? extends io.ktor.serialization.ContentConverter> r5, final io.ktor.utils.io.ByteReadChannel r6, final io.ktor.util.reflect.TypeInfo r7, final java.nio.charset.Charset r8, S3.c<java.lang.Object> r9) {
        /*
            boolean r0 = r9 instanceof io.ktor.serialization.ContentConverterKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.serialization.ContentConverterKt$deserialize$1 r0 = (io.ktor.serialization.ContentConverterKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.serialization.ContentConverterKt$deserialize$1 r0 = new io.ktor.serialization.ContentConverterKt$deserialize$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r5 = r0.L$1
            r7 = r5
            io.ktor.util.reflect.TypeInfo r7 = (io.ktor.util.reflect.TypeInfo) r7
            java.lang.Object r5 = r0.L$0
            r6 = r5
            io.ktor.utils.io.ByteReadChannel r6 = (io.ktor.utils.io.ByteReadChannel) r6
            P3.r.Y(r9)
            goto L59
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            P3.r.Y(r9)
            K5.k r9 = new K5.k
            r9.<init>(r5)
            io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1 r5 = new io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1
            r5.<init>()
            io.ktor.serialization.ContentConverterKt$deserialize$result$2 r8 = new io.ktor.serialization.ContentConverterKt$deserialize$result$2
            r8.<init>(r6, r3)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r9 = K5.N.j(r5, r8, r0)
            if (r9 != r1) goto L59
            return r1
        L59:
            if (r9 != 0) goto L86
            boolean r5 = r6.isClosedForRead()
            if (r5 != 0) goto L62
            return r6
        L62:
            l4.w r5 = r7.getKotlinType()
            if (r5 == 0) goto L71
            boolean r5 = r5.b()
            if (r5 != r4) goto L71
            io.ktor.http.content.NullBody r5 = io.ktor.http.content.NullBody.INSTANCE
            return r5
        L71:
            io.ktor.serialization.ContentConvertException r5 = new io.ktor.serialization.ContentConvertException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "No suitable converter found for "
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = 2
            r5.<init>(r6, r3, r7, r3)
            throw r5
        L86:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.ContentConverterKt.deserialize(java.util.List, io.ktor.utils.io.ByteReadChannel, io.ktor.util.reflect.TypeInfo, java.nio.charset.Charset, S3.c):java.lang.Object");
    }

    public static final Charset suitableCharset(Headers headers, Charset charset) {
        l.f("<this>", headers);
        l.f("defaultCharset", charset);
        Charset charsetSuitableCharsetOrNull = suitableCharsetOrNull(headers, charset);
        return charsetSuitableCharsetOrNull == null ? charset : charsetSuitableCharsetOrNull;
    }

    public static /* synthetic */ Charset suitableCharset$default(Headers headers, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = C2496a.f19036b;
        }
        return suitableCharset(headers, charset);
    }

    public static final Charset suitableCharsetOrNull(Headers headers, Charset charset) {
        l.f("<this>", headers);
        l.f("defaultCharset", charset);
        Iterator<HeaderValue> it = HttpHeaderValueParserKt.parseAndSortHeader(headers.get(HttpHeaders.INSTANCE.getAcceptCharset())).iterator();
        while (it.hasNext()) {
            String value = it.next().getValue();
            if (l.a(value, "*")) {
                return charset;
            }
            C2496a c2496a = C2496a.a;
            if (CharsetJVMKt.isSupported(c2496a, value)) {
                return CharsetJVMKt.forName(c2496a, value);
            }
        }
        return null;
    }

    public static /* synthetic */ Charset suitableCharsetOrNull$default(Headers headers, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = C2496a.f19036b;
        }
        return suitableCharsetOrNull(headers, charset);
    }
}
