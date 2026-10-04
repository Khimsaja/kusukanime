package io.ktor.http.cio;

import P3.m;
import P3.q;
import P3.r;
import U3.c;
import U3.e;
import io.ktor.http.ContentType;
import io.ktor.http.HttpMethod;
import io.ktor.http.cio.internals.AsciiCharTree;
import io.ktor.http.cio.internals.CharArrayBuilder;
import io.ktor.http.cio.internals.CharsKt;
import io.ktor.http.cio.internals.MutableRange;
import io.ktor.http.cio.internals.TokenizerKt;
import io.ktor.sse.ServerSentEventKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.LineEndingMode;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\b\u0010\u0004\u001a,\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0080@¢\u0006\u0004\b\b\u0010\r\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!\u001a\u001f\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\"\u0010#\u001a/\u0010)\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*\u001a\u001f\u0010+\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b+\u0010,\u001a\u001f\u0010-\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b-\u0010.\u001a\u001f\u0010/\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b/\u00100\u001a\u0017\u00101\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b1\u00102\u001a\u0017\u00104\u001a\u00020(2\u0006\u00103\u001a\u00020\u000eH\u0002¢\u0006\u0004\b4\u00105\"\u0014\u00106\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00107\"\u0014\u00108\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00107\"\u0014\u00109\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u00107\"\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020&0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<\" \u0010>\u001a\u00020=8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b>\u00107\u0012\u0004\bA\u0010B\u001a\u0004\b?\u0010@\"\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/http/cio/Request;", "parseRequest", "(Lio/ktor/utils/io/ByteReadChannel;LS3/c;)Ljava/lang/Object;", "Lio/ktor/http/cio/Response;", "parseResponse", "Lio/ktor/http/cio/HttpHeadersMap;", "parseHeaders", "Lio/ktor/http/cio/internals/CharArrayBuilder;", "builder", "Lio/ktor/http/cio/internals/MutableRange;", "range", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/http/cio/internals/CharArrayBuilder;Lio/ktor/http/cio/internals/MutableRange;LS3/c;)Ljava/lang/Object;", "", "host", "LO3/C;", "validateHostHeader", "(Ljava/lang/CharSequence;)V", ContentType.Text.TYPE, "Lio/ktor/http/HttpMethod;", "parseHttpMethod", "(Ljava/lang/CharSequence;Lio/ktor/http/cio/internals/MutableRange;)Lio/ktor/http/HttpMethod;", "parseHttpMethodFull", "parseUri", "(Ljava/lang/CharSequence;Lio/ktor/http/cio/internals/MutableRange;)Ljava/lang/CharSequence;", "parseVersion", "", "parseStatusCode", "(Ljava/lang/CharSequence;Lio/ktor/http/cio/internals/MutableRange;)I", "code", "", "statusOutOfRange", "(I)Z", "parseHeaderName", "(Lio/ktor/http/cio/internals/CharArrayBuilder;Lio/ktor/http/cio/internals/MutableRange;)I", "index", "start", "", "ch", "", "parseHeaderNameFailed", "(Lio/ktor/http/cio/internals/CharArrayBuilder;IIC)Ljava/lang/Void;", "parseHeaderValue", "(Lio/ktor/http/cio/internals/CharArrayBuilder;Lio/ktor/http/cio/internals/MutableRange;)V", "noColonFound", "(Ljava/lang/CharSequence;Lio/ktor/http/cio/internals/MutableRange;)Ljava/lang/Void;", "characterIsNotAllowed", "(Ljava/lang/CharSequence;C)Ljava/lang/Void;", "isDelimiter", "(C)Z", "result", "unsupportedHttpVersion", "(Ljava/lang/CharSequence;)Ljava/lang/Void;", "HTTP_LINE_LIMIT", "I", "HTTP_STATUS_CODE_MIN_RANGE", "HTTP_STATUS_CODE_MAX_RANGE", "", "hostForbiddenSymbols", "Ljava/util/Set;", "Lio/ktor/utils/io/LineEndingMode;", "httpLineEndings", "getHttpLineEndings", "()I", "getHttpLineEndings$annotations", "()V", "Lio/ktor/http/cio/internals/AsciiCharTree;", "", "versions", "Lio/ktor/http/cio/internals/AsciiCharTree;", "ktor-http-cio"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpParserKt {
    private static final int HTTP_LINE_LIMIT = 8192;
    private static final int HTTP_STATUS_CODE_MAX_RANGE = 999;
    private static final int HTTP_STATUS_CODE_MIN_RANGE = 100;
    private static final Set<Character> hostForbiddenSymbols = m.v0(new Character[]{'/', '?', '#', '@'});
    private static final int httpLineEndings;
    private static final AsciiCharTree<String> versions;

    @e(c = "io.ktor.http.cio.HttpParserKt", f = "HttpParser.kt", l = {106}, m = "parseHeaders")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.http.cio.HttpParserKt$parseHeaders$1, reason: invalid class name */
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
            return HttpParserKt.parseHeaders(null, this);
        }
    }

    @e(c = "io.ktor.http.cio.HttpParserKt", f = "HttpParser.kt", l = {122}, m = "parseHeaders")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.http.cio.HttpParserKt$parseHeaders$2, reason: invalid class name */
    public static final class AnonymousClass2 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(S3.c<? super AnonymousClass2> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpParserKt.parseHeaders(null, null, null, this);
        }
    }

    @e(c = "io.ktor.http.cio.HttpParserKt", f = "HttpParser.kt", l = {45, 60}, m = "parseRequest")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.http.cio.HttpParserKt$parseRequest$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12261 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C12261(S3.c<? super C12261> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpParserKt.parseRequest(null, this);
        }
    }

    @e(c = "io.ktor.http.cio.HttpParserKt", f = "HttpParser.kt", l = {81, 90}, m = "parseResponse")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.http.cio.HttpParserKt$parseResponse$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12271 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C12271(S3.c<? super C12271> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpParserKt.parseResponse(null, this);
        }
    }

    static {
        LineEndingMode.Companion companion = LineEndingMode.INSTANCE;
        httpLineEndings = LineEndingMode.m203plus1TerO4(companion.m208getCRLFf0jXZW8(), companion.m209getLFf0jXZW8());
        versions = AsciiCharTree.INSTANCE.build(r.I("HTTP/1.0", "HTTP/1.1"));
    }

    private static final Void characterIsNotAllowed(CharSequence charSequence, char c2) {
        throw new ParserException("Character with code " + (c2 & 255) + " is not allowed in header names, \n" + ((Object) charSequence));
    }

    public static final int getHttpLineEndings() {
        return httpLineEndings;
    }

    public static /* synthetic */ void getHttpLineEndings$annotations() {
    }

    private static final boolean isDelimiter(char c2) {
        return l.g(c2, 32) <= 0 || AbstractC2510o.X("\"(),/:;<=>?@[\\]{}", c2);
    }

    private static final Void noColonFound(CharSequence charSequence, MutableRange mutableRange) {
        throw new ParserException("No colon in HTTP header in " + charSequence.subSequence(mutableRange.getStart(), mutableRange.getEnd()).toString() + " in builder: \n" + ((Object) charSequence));
    }

    public static final int parseHeaderName(CharArrayBuilder charArrayBuilder, MutableRange mutableRange) {
        l.f(ContentType.Text.TYPE, charArrayBuilder);
        l.f("range", mutableRange);
        int end = mutableRange.getEnd();
        for (int start = mutableRange.getStart(); start < end; start++) {
            char cCharAt = charArrayBuilder.charAt(start);
            if (cCharAt == ':' && start != mutableRange.getStart()) {
                mutableRange.setStart(start + 1);
                return start;
            }
            if (isDelimiter(cCharAt)) {
                parseHeaderNameFailed(charArrayBuilder, start, mutableRange.getStart(), cCharAt);
                throw new D6.r();
            }
        }
        noColonFound(charArrayBuilder, mutableRange);
        throw new D6.r();
    }

    private static final Void parseHeaderNameFailed(CharArrayBuilder charArrayBuilder, int i7, int i8, char c2) {
        if (c2 == ':') {
            throw new ParserException("Empty header names are not allowed as per RFC7230.");
        }
        if (i7 == i8) {
            throw new ParserException("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.");
        }
        characterIsNotAllowed(charArrayBuilder, c2);
        throw new D6.r();
    }

    public static final void parseHeaderValue(CharArrayBuilder charArrayBuilder, MutableRange mutableRange) {
        l.f(ContentType.Text.TYPE, charArrayBuilder);
        l.f("range", mutableRange);
        int start = mutableRange.getStart();
        int end = mutableRange.getEnd();
        int iSkipSpacesAndHorizontalTabs = TokenizerKt.skipSpacesAndHorizontalTabs(charArrayBuilder, start, end);
        if (iSkipSpacesAndHorizontalTabs >= end) {
            mutableRange.setStart(end);
            return;
        }
        int i7 = iSkipSpacesAndHorizontalTabs;
        int i8 = i7;
        while (i7 < end) {
            char cCharAt = charArrayBuilder.charAt(i7);
            if (cCharAt != '\t') {
                if (cCharAt == '\n' || cCharAt == '\r') {
                    characterIsNotAllowed(charArrayBuilder, cCharAt);
                    throw new D6.r();
                }
                if (cCharAt != ' ') {
                    i8 = i7;
                }
            }
            i7++;
        }
        mutableRange.setStart(iSkipSpacesAndHorizontalTabs);
        mutableRange.setEnd(i8 + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object parseHeaders(io.ktor.utils.io.ByteReadChannel r7, S3.c<? super io.ktor.http.cio.HttpHeadersMap> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof io.ktor.http.cio.HttpParserKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r8
            io.ktor.http.cio.HttpParserKt$parseHeaders$1 r0 = (io.ktor.http.cio.HttpParserKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            io.ktor.http.cio.HttpParserKt$parseHeaders$1 r0 = new io.ktor.http.cio.HttpParserKt$parseHeaders$1
            r0.<init>(r8)
            goto L12
        L1a:
            java.lang.Object r8 = r4.result
            T3.a r0 = T3.a.f9048k
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            java.lang.Object r7 = r4.L$0
            io.ktor.http.cio.internals.CharArrayBuilder r7 = (io.ktor.http.cio.internals.CharArrayBuilder) r7
            P3.r.Y(r8)
            goto L4f
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            P3.r.Y(r8)
            r8 = r2
            io.ktor.http.cio.internals.CharArrayBuilder r2 = new io.ktor.http.cio.internals.CharArrayBuilder
            r1 = 0
            r2.<init>(r1, r8, r1)
            r4.L$0 = r2
            r4.label = r8
            r3 = 0
            r5 = 4
            r6 = 0
            r1 = r7
            java.lang.Object r8 = parseHeaders$default(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L4e
            return r0
        L4e:
            r7 = r2
        L4f:
            io.ktor.http.cio.HttpHeadersMap r8 = (io.ktor.http.cio.HttpHeadersMap) r8
            if (r8 != 0) goto L58
            io.ktor.http.cio.HttpHeadersMap r8 = new io.ktor.http.cio.HttpHeadersMap
            r8.<init>(r7)
        L58:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.HttpParserKt.parseHeaders(io.ktor.utils.io.ByteReadChannel, S3.c):java.lang.Object");
    }

    public static /* synthetic */ Object parseHeaders$default(ByteReadChannel byteReadChannel, CharArrayBuilder charArrayBuilder, MutableRange mutableRange, S3.c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            mutableRange = new MutableRange(0, 0);
        }
        return parseHeaders(byteReadChannel, charArrayBuilder, mutableRange, cVar);
    }

    private static final HttpMethod parseHttpMethod(CharSequence charSequence, MutableRange mutableRange) {
        TokenizerKt.skipSpaces(charSequence, mutableRange);
        HttpMethod httpMethod = (HttpMethod) q.M0(AsciiCharTree.search$default(CharsKt.getDefaultHttpMethods(), charSequence, mutableRange.getStart(), mutableRange.getEnd(), false, new b(1), 8, null));
        if (httpMethod == null) {
            return parseHttpMethodFull(charSequence, mutableRange);
        }
        mutableRange.setStart(httpMethod.getValue().length() + mutableRange.getStart());
        return httpMethod;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseHttpMethod$lambda$1(char c2, int i7) {
        return c2 == ' ';
    }

    private static final HttpMethod parseHttpMethodFull(CharSequence charSequence, MutableRange mutableRange) {
        return new HttpMethod(TokenizerKt.nextToken(charSequence, mutableRange).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x0037, B:30:0x008b, B:33:0x0094, B:35:0x00a5, B:37:0x00be, B:39:0x00c4, B:41:0x00ca, B:52:0x00f0, B:53:0x00f7, B:54:0x00f8, B:55:0x00ff, B:56:0x0100, B:57:0x0126, B:26:0x0075), top: B:61:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7 A[Catch: all -> 0x00ed, TRY_LEAVE, TryCatch #1 {all -> 0x00ed, blocks: (B:45:0x00e1, B:48:0x00e7), top: B:62:0x00e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [io.ktor.http.cio.HttpParserKt$parseRequest$1] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0088 -> B:30:0x008b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object parseRequest(io.ktor.utils.io.ByteReadChannel r14, S3.c<? super io.ktor.http.cio.Request> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.HttpParserKt.parseRequest(io.ktor.utils.io.ByteReadChannel, S3.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #1 {all -> 0x005b, blocks: (B:20:0x0057, B:29:0x0086, B:32:0x008f), top: B:50:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce A[Catch: all -> 0x00d5, TryCatch #0 {all -> 0x00d5, blocks: (B:36:0x00ca, B:38:0x00ce, B:42:0x00d9), top: B:48:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object parseResponse(io.ktor.utils.io.ByteReadChannel r14, S3.c<? super io.ktor.http.cio.Response> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.HttpParserKt.parseResponse(io.ktor.utils.io.ByteReadChannel, S3.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        r7.setStart(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int parseStatusCode(java.lang.CharSequence r6, io.ktor.http.cio.internals.MutableRange r7) {
        /*
            io.ktor.http.cio.internals.TokenizerKt.skipSpaces(r6, r7)
            int r0 = r7.getEnd()
            int r1 = r7.getStart()
            int r2 = r7.getEnd()
            r3 = 0
        L10:
            if (r1 >= r2) goto L77
            char r4 = r6.charAt(r1)
            r5 = 32
            if (r4 != r5) goto L3b
            boolean r6 = statusOutOfRange(r3)
            if (r6 != 0) goto L22
            r0 = r1
            goto L77
        L22:
            io.ktor.http.cio.ParserException r6 = new io.ktor.http.cio.ParserException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Status-code must be 3-digit. Status received: "
            r7.<init>(r0)
            r7.append(r3)
            r0 = 46
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L3b:
            r5 = 48
            if (r5 > r4) goto L4b
            r5 = 58
            if (r4 >= r5) goto L4b
            int r3 = r3 * 10
            int r4 = r4 + (-48)
            int r3 = r3 + r4
            int r1 = r1 + 1
            goto L10
        L4b:
            int r0 = r7.getStart()
            int r7 = io.ktor.http.cio.internals.TokenizerKt.findSpaceOrEnd(r6, r7)
            java.lang.CharSequence r6 = r6.subSequence(r0, r7)
            java.lang.String r6 = r6.toString()
            java.lang.NumberFormatException r7 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Illegal digit "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = " in status code "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L77:
            r7.setStart(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.HttpParserKt.parseStatusCode(java.lang.CharSequence, io.ktor.http.cio.internals.MutableRange):int");
    }

    private static final CharSequence parseUri(CharSequence charSequence, MutableRange mutableRange) {
        TokenizerKt.skipSpaces(charSequence, mutableRange);
        int start = mutableRange.getStart();
        int iFindSpaceOrEnd = TokenizerKt.findSpaceOrEnd(charSequence, mutableRange);
        int i7 = iFindSpaceOrEnd - start;
        if (i7 <= 0) {
            return "";
        }
        if (i7 == 1 && charSequence.charAt(start) == '/') {
            mutableRange.setStart(iFindSpaceOrEnd);
            return "/";
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(start, iFindSpaceOrEnd);
        mutableRange.setStart(iFindSpaceOrEnd);
        return charSequenceSubSequence;
    }

    private static final CharSequence parseVersion(CharSequence charSequence, MutableRange mutableRange) {
        TokenizerKt.skipSpaces(charSequence, mutableRange);
        if (mutableRange.getStart() >= mutableRange.getEnd()) {
            throw new IllegalStateException(("Failed to parse version: " + ((Object) charSequence)).toString());
        }
        String str = (String) q.M0(AsciiCharTree.search$default(versions, charSequence, mutableRange.getStart(), mutableRange.getEnd(), false, new b(2), 8, null));
        if (str == null) {
            unsupportedHttpVersion(TokenizerKt.nextToken(charSequence, mutableRange));
            throw new D6.r();
        }
        mutableRange.setStart(str.length() + mutableRange.getStart());
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseVersion$lambda$3(char c2, int i7) {
        return c2 == ' ';
    }

    private static final boolean statusOutOfRange(int i7) {
        return i7 < HTTP_STATUS_CODE_MIN_RANGE || i7 > HTTP_STATUS_CODE_MAX_RANGE;
    }

    private static final Void unsupportedHttpVersion(CharSequence charSequence) {
        throw new ParserException("Unsupported HTTP version: " + ((Object) charSequence));
    }

    private static final void validateHostHeader(CharSequence charSequence) {
        if (AbstractC2510o.Z(charSequence, ServerSentEventKt.COLON)) {
            throw new ParserException("Host header with ':' should contains port: " + ((Object) charSequence));
        }
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            char cCharAt = charSequence.charAt(i7);
            Set<Character> set = hostForbiddenSymbols;
            if (set.contains(Character.valueOf(cCharAt))) {
                throw new ParserException("Host cannot contain any of the following symbols: " + set);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072 A[Catch: all -> 0x0077, TryCatch #2 {all -> 0x0077, blocks: (B:23:0x006a, B:25:0x0072, B:29:0x007a, B:32:0x008e, B:33:0x00ae, B:34:0x00b5, B:35:0x00b6, B:37:0x00c2), top: B:47:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[Catch: all -> 0x0077, TryCatch #2 {all -> 0x0077, blocks: (B:23:0x006a, B:25:0x0072, B:29:0x007a, B:32:0x008e, B:33:0x00ae, B:34:0x00b5, B:35:0x00b6, B:37:0x00c2), top: B:47:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0066 -> B:47:0x006a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object parseHeaders(io.ktor.utils.io.ByteReadChannel r10, io.ktor.http.cio.internals.CharArrayBuilder r11, io.ktor.http.cio.internals.MutableRange r12, S3.c<? super io.ktor.http.cio.HttpHeadersMap> r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof io.ktor.http.cio.HttpParserKt.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.http.cio.HttpParserKt$parseHeaders$2 r0 = (io.ktor.http.cio.HttpParserKt.AnonymousClass2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.http.cio.HttpParserKt$parseHeaders$2 r0 = new io.ktor.http.cio.HttpParserKt$parseHeaders$2
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 8192(0x2000, float:1.14794E-41)
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 != r4) goto L43
            java.lang.Object r10 = r0.L$3
            io.ktor.http.cio.HttpHeadersMap r10 = (io.ktor.http.cio.HttpHeadersMap) r10
            java.lang.Object r11 = r0.L$2
            io.ktor.http.cio.internals.MutableRange r11 = (io.ktor.http.cio.internals.MutableRange) r11
            java.lang.Object r12 = r0.L$1
            io.ktor.http.cio.internals.CharArrayBuilder r12 = (io.ktor.http.cio.internals.CharArrayBuilder) r12
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r2 = (io.ktor.utils.io.ByteReadChannel) r2
            P3.r.Y(r13)     // Catch: java.lang.Throwable -> L40
            r9 = r0
            r0 = r10
            r10 = r2
            r2 = r9
            r9 = r12
            r12 = r11
            r11 = r9
            goto L6a
        L40:
            r11 = move-exception
            goto Lc8
        L43:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L4b:
            P3.r.Y(r13)
            io.ktor.http.cio.HttpHeadersMap r13 = new io.ktor.http.cio.HttpHeadersMap
            r13.<init>(r11)
        L53:
            int r2 = io.ktor.http.cio.HttpParserKt.httpLineEndings     // Catch: java.lang.Throwable -> Lc6
            r0.L$0 = r10     // Catch: java.lang.Throwable -> Lc6
            r0.L$1 = r11     // Catch: java.lang.Throwable -> Lc6
            r0.L$2 = r12     // Catch: java.lang.Throwable -> Lc6
            r0.L$3 = r13     // Catch: java.lang.Throwable -> Lc6
            r0.label = r4     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r2 = io.ktor.utils.io.ByteReadChannelOperationsKt.m195readUTF8LineToRRvyBJ8(r10, r11, r3, r2, r0)     // Catch: java.lang.Throwable -> Lc6
            if (r2 != r1) goto L66
            return r1
        L66:
            r9 = r0
            r0 = r13
            r13 = r2
            r2 = r9
        L6a:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> L77
            boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> L77
            if (r13 != 0) goto L7a
            r0.release()     // Catch: java.lang.Throwable -> L77
            r10 = 0
            return r10
        L77:
            r11 = move-exception
            r10 = r0
            goto Lc8
        L7a:
            int r13 = r11.length()     // Catch: java.lang.Throwable -> L77
            r12.setEnd(r13)     // Catch: java.lang.Throwable -> L77
            int r13 = r12.getEnd()     // Catch: java.lang.Throwable -> L77
            int r5 = r12.getStart()     // Catch: java.lang.Throwable -> L77
            int r13 = r13 - r5
            if (r13 == 0) goto Lb6
            if (r13 >= r3) goto Lae
            int r13 = r12.getStart()     // Catch: java.lang.Throwable -> L77
            int r5 = parseHeaderName(r11, r12)     // Catch: java.lang.Throwable -> L77
            int r6 = r12.getEnd()     // Catch: java.lang.Throwable -> L77
            parseHeaderValue(r11, r12)     // Catch: java.lang.Throwable -> L77
            int r7 = r12.getStart()     // Catch: java.lang.Throwable -> L77
            int r8 = r12.getEnd()     // Catch: java.lang.Throwable -> L77
            r12.setStart(r6)     // Catch: java.lang.Throwable -> L77
            r0.put(r13, r5, r7, r8)     // Catch: java.lang.Throwable -> L77
            r13 = r0
            r0 = r2
            goto L53
        Lae:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L77
            java.lang.String r11 = "Header line length limit exceeded"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L77
            throw r10     // Catch: java.lang.Throwable -> L77
        Lb6:
            io.ktor.http.HttpHeaders r10 = io.ktor.http.HttpHeaders.INSTANCE     // Catch: java.lang.Throwable -> L77
            java.lang.String r10 = r10.getHost()     // Catch: java.lang.Throwable -> L77
            java.lang.CharSequence r10 = r0.get(r10)     // Catch: java.lang.Throwable -> L77
            if (r10 == 0) goto Lc5
            validateHostHeader(r10)     // Catch: java.lang.Throwable -> L77
        Lc5:
            return r0
        Lc6:
            r11 = move-exception
            r10 = r13
        Lc8:
            r10.release()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.HttpParserKt.parseHeaders(io.ktor.utils.io.ByteReadChannel, io.ktor.http.cio.internals.CharArrayBuilder, io.ktor.http.cio.internals.MutableRange, S3.c):java.lang.Object");
    }
}
