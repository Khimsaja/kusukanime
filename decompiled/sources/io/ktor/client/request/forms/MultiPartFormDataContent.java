package io.ktor.client.request.forms;

import P3.q;
import P3.r;
import S5.n;
import S5.p;
import U3.c;
import U3.e;
import b1.AbstractC0703b;
import io.ktor.client.request.forms.PreparedPart;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaders;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.PartData;
import io.ktor.sse.ServerSentEventKt;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R(\u0010#\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lio/ktor/client/request/forms/MultiPartFormDataContent;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "", "Lio/ktor/http/content/PartData;", "parts", "", "boundary", "Lio/ktor/http/ContentType;", "contentType", "<init>", "(Ljava/util/List;Ljava/lang/String;Lio/ktor/http/ContentType;)V", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "LO3/C;", "writeTo", "(Lio/ktor/utils/io/ByteWriteChannel;LS3/c;)Ljava/lang/Object;", "Ljava/lang/String;", "getBoundary", "()Ljava/lang/String;", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "", "BOUNDARY_BYTES", "[B", "LAST_BOUNDARY_BYTES", "", "BODY_OVERHEAD_SIZE", "I", "PART_OVERHEAD_SIZE", "Lio/ktor/client/request/forms/PreparedPart;", "rawParts", "Ljava/util/List;", "", "value", "contentLength", "Ljava/lang/Long;", "getContentLength", "()Ljava/lang/Long;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultiPartFormDataContent extends OutgoingContent.WriteChannelContent {
    private final int BODY_OVERHEAD_SIZE;
    private final byte[] BOUNDARY_BYTES;
    private final byte[] LAST_BOUNDARY_BYTES;
    private final int PART_OVERHEAD_SIZE;
    private final String boundary;
    private Long contentLength;
    private final ContentType contentType;
    private final List<PreparedPart> rawParts;

    @e(c = "io.ktor.client.request.forms.MultiPartFormDataContent", f = "FormDataContent.kt", l = {124, 125, 126, 131, 135, 139, 142, 146, 146, 146}, m = "writeTo")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.request.forms.MultiPartFormDataContent$writeTo$1, reason: invalid class name */
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
            return MultiPartFormDataContent.this.writeTo(null, this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MultiPartFormDataContent(List list, String str, ContentType contentType, int i7, f fVar) {
        str = (i7 & 2) != 0 ? FormDataContentKt.generateBoundary() : str;
        this(list, str, (i7 & 4) != 0 ? ContentType.MultiPart.INSTANCE.getFormData().withParameter("boundary", str) : contentType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n rawParts$lambda$3$lambda$2(byte[] bArr) {
        S5.a aVar = new S5.a();
        BytePacketBuilderKt.writeFully$default(aVar, bArr, 0, 0, 6, null);
        return aVar;
    }

    public final String getBoundary() {
        return this.boundary;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Long getContentLength() {
        return this.contentLength;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public ContentType getContentType() {
        return this.contentType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01df, code lost:
    
        if (r4.flushAndClose(r2) != r3) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f6, code lost:
    
        if (r7.flushAndClose(r2) != r3) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014c, code lost:
    
        if (io.ktor.client.request.forms.FormDataContentKt.copyTo((S5.n) r4, r7, r2) == r3) goto L119;
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0059: MOVE (r7 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:90), block:B:24:0x0059 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01bf A[Catch: all -> 0x01bb, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x01bb, blocks: (B:47:0x00c2, B:49:0x00c8, B:101:0x01bf), top: B:140:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8 A[Catch: all -> 0x01bb, TRY_LEAVE, TryCatch #10 {all -> 0x01bb, blocks: (B:47:0x00c2, B:49:0x00c8, B:101:0x01bf), top: B:140:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012f A[Catch: all -> 0x0091, TRY_LEAVE, TryCatch #0 {all -> 0x0091, blocks: (B:63:0x012b, B:65:0x012f, B:69:0x0150, B:78:0x0160, B:80:0x0164, B:91:0x01a5, B:92:0x01aa, B:34:0x008c, B:39:0x00a0, B:42:0x00b0), top: B:122:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0160 A[Catch: all -> 0x0091, TRY_ENTER, TryCatch #0 {all -> 0x0091, blocks: (B:63:0x012b, B:65:0x012f, B:69:0x0150, B:78:0x0160, B:80:0x0164, B:91:0x01a5, B:92:0x01aa, B:34:0x008c, B:39:0x00a0, B:42:0x00b0), top: B:122:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x019e -> B:22:0x0055). Please report as a decompilation issue!!! */
    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object writeTo(io.ktor.utils.io.ByteWriteChannel r24, S3.c<? super O3.C> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.request.forms.MultiPartFormDataContent.writeTo(io.ktor.utils.io.ByteWriteChannel, S3.c):java.lang.Object");
    }

    public MultiPartFormDataContent(List<? extends PartData> list, String str, ContentType contentType) {
        PreparedPart channelPart;
        l.f("parts", list);
        l.f("boundary", str);
        l.f("contentType", contentType);
        this.boundary = str;
        this.contentType = contentType;
        Long l7 = null;
        byte[] byteArray$default = StringsKt.toByteArray$default(AbstractC0703b.j("--", str, ServerSentEventKt.END_OF_LINE), null, 1, null);
        this.BOUNDARY_BYTES = byteArray$default;
        byte[] byteArray$default2 = StringsKt.toByteArray$default(AbstractC0703b.j("--", str, "--\r\n"), null, 1, null);
        this.LAST_BOUNDARY_BYTES = byteArray$default2;
        this.BODY_OVERHEAD_SIZE = byteArray$default2.length;
        this.PART_OVERHEAD_SIZE = (FormDataContentKt.RN_BYTES.length * 2) + byteArray$default.length;
        ArrayList arrayList = new ArrayList(r.p(list, 10));
        for (PartData partData : list) {
            S5.l lVarBytePacketBuilder = BytePacketBuilderKt.BytePacketBuilder();
            for (Map.Entry<String, List<String>> entry : partData.getHeaders().entries()) {
                StringsKt.writeText$default(lVarBytePacketBuilder, entry.getKey() + ": " + q.y0(entry.getValue(), "; ", null, null, null, 62), 0, 0, (Charset) null, 14, (Object) null);
                BytePacketBuilderKt.writeFully$default(lVarBytePacketBuilder, FormDataContentKt.RN_BYTES, 0, 0, 6, null);
            }
            Headers headers = partData.getHeaders();
            HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
            String str2 = headers.get(httpHeaders.getContentLength());
            Long lValueOf = str2 != null ? Long.valueOf(Long.parseLong(str2)) : null;
            if (partData instanceof PartData.FileItem) {
                channelPart = new PreparedPart.ChannelPart(p.h(BytePacketBuilderKt.build(lVarBytePacketBuilder)), ((PartData.FileItem) partData).getProvider(), lValueOf != null ? Long.valueOf(lValueOf.longValue() + this.PART_OVERHEAD_SIZE + r6.length) : null);
            } else if (partData instanceof PartData.BinaryItem) {
                channelPart = new PreparedPart.InputPart(p.h(BytePacketBuilderKt.build(lVarBytePacketBuilder)), ((PartData.BinaryItem) partData).getProvider(), lValueOf != null ? Long.valueOf(lValueOf.longValue() + this.PART_OVERHEAD_SIZE + r6.length) : null);
            } else if (partData instanceof PartData.FormItem) {
                S5.a aVar = new S5.a();
                StringsKt.writeText$default(aVar, ((PartData.FormItem) partData).getValue(), 0, 0, (Charset) null, 14, (Object) null);
                byte[] bArrJ = p.j(aVar, -1);
                a aVar2 = new a(bArrJ);
                if (lValueOf == null) {
                    StringsKt.writeText$default(lVarBytePacketBuilder, httpHeaders.getContentLength() + ": " + bArrJ.length, 0, 0, (Charset) null, 14, (Object) null);
                    BytePacketBuilderKt.writeFully$default(lVarBytePacketBuilder, FormDataContentKt.RN_BYTES, 0, 0, 6, null);
                }
                channelPart = new PreparedPart.InputPart(p.h(BytePacketBuilderKt.build(lVarBytePacketBuilder)), aVar2, Long.valueOf(bArrJ.length + this.PART_OVERHEAD_SIZE + r4.length));
            } else if (partData instanceof PartData.BinaryChannelItem) {
                channelPart = new PreparedPart.ChannelPart(p.h(BytePacketBuilderKt.build(lVarBytePacketBuilder)), ((PartData.BinaryChannelItem) partData).getProvider(), lValueOf != null ? Long.valueOf(lValueOf.longValue() + this.PART_OVERHEAD_SIZE + r6.length) : null);
            } else {
                throw new D6.r();
            }
            arrayList.add(channelPart);
        }
        this.rawParts = arrayList;
        Long lValueOf2 = 0L;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                l7 = lValueOf2;
                break;
            }
            Long size = ((PreparedPart) it.next()).getSize();
            if (size == null) {
                break;
            } else {
                lValueOf2 = lValueOf2 != null ? Long.valueOf(size.longValue() + lValueOf2.longValue()) : null;
            }
        }
        this.contentLength = l7 != null ? Long.valueOf(l7.longValue() + this.BODY_OVERHEAD_SIZE) : l7;
    }
}
