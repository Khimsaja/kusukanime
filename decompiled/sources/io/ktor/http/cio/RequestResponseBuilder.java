package io.ktor.http.cio;

import S5.l;
import S5.n;
import com.kusukanime.BuildConfig;
import io.ktor.http.ContentDisposition;
import io.ktor.http.HttpMethod;
import io.ktor.utils.io.core.BytePacketBuilderExtensions_jvmKt;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import io.ktor.utils.io.core.StringsKt;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u0003J\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010\u0003R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lio/ktor/http/cio/RequestResponseBuilder;", "", "<init>", "()V", "", "version", "", "status", "statusText", "LO3/C;", "responseLine", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;)V", "Lio/ktor/http/HttpMethod;", "method", "uri", "requestLine", "(Lio/ktor/http/HttpMethod;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "line", "(Ljava/lang/CharSequence;)V", "", "content", "offset", "length", "bytes", "([BII)V", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)V", ContentDisposition.Parameters.Name, "value", "headerLine", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "emptyLine", "LS5/n;", "build", "()LS5/n;", BuildConfig.BUILD_TYPE, "LS5/l;", "packet", "LS5/l;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RequestResponseBuilder {
    private final l packet = BytePacketBuilderKt.BytePacketBuilder();

    public static /* synthetic */ void bytes$default(RequestResponseBuilder requestResponseBuilder, byte[] bArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = bArr.length;
        }
        requestResponseBuilder.bytes(bArr, i7, i8);
    }

    public final n build() {
        return BytePacketBuilderKt.build(this.packet);
    }

    public final void bytes(byte[] content, int offset, int length) {
        kotlin.jvm.internal.l.f("content", content);
        BytePacketBuilderKt.writeFully(this.packet, content, offset, length);
    }

    public final void emptyLine() {
        this.packet.D((byte) 13);
        this.packet.D((byte) 10);
    }

    public final void headerLine(CharSequence name, CharSequence value) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, name);
        kotlin.jvm.internal.l.f("value", value);
        BytePacketBuilderKt.append$default(this.packet, name, 0, 0, 6, null);
        BytePacketBuilderKt.append$default(this.packet, ": ", 0, 0, 6, null);
        BytePacketBuilderKt.append$default(this.packet, value, 0, 0, 6, null);
        this.packet.D((byte) 13);
        this.packet.D((byte) 10);
    }

    public final void line(CharSequence line) {
        kotlin.jvm.internal.l.f("line", line);
        BytePacketBuilderKt.append$default(this.packet, line, 0, 0, 6, null);
        this.packet.D((byte) 13);
        this.packet.D((byte) 10);
    }

    public final void release() {
        this.packet.close();
    }

    public final void requestLine(HttpMethod method, CharSequence uri, CharSequence version) {
        kotlin.jvm.internal.l.f("method", method);
        kotlin.jvm.internal.l.f("uri", uri);
        kotlin.jvm.internal.l.f("version", version);
        StringsKt.writeText$default(this.packet, method.getValue(), 0, 0, (Charset) null, 14, (Object) null);
        this.packet.D((byte) 32);
        StringsKt.writeText$default(this.packet, uri, 0, 0, (Charset) null, 14, (Object) null);
        this.packet.D((byte) 32);
        StringsKt.writeText$default(this.packet, version, 0, 0, (Charset) null, 14, (Object) null);
        this.packet.D((byte) 13);
        this.packet.D((byte) 10);
    }

    public final void responseLine(CharSequence version, int status, CharSequence statusText) {
        kotlin.jvm.internal.l.f("version", version);
        kotlin.jvm.internal.l.f("statusText", statusText);
        StringsKt.writeText$default(this.packet, version, 0, 0, (Charset) null, 14, (Object) null);
        this.packet.D((byte) 32);
        StringsKt.writeText$default(this.packet, String.valueOf(status), 0, 0, (Charset) null, 14, (Object) null);
        this.packet.D((byte) 32);
        StringsKt.writeText$default(this.packet, statusText, 0, 0, (Charset) null, 14, (Object) null);
        this.packet.D((byte) 13);
        this.packet.D((byte) 10);
    }

    public final void bytes(ByteBuffer content) {
        kotlin.jvm.internal.l.f("content", content);
        BytePacketBuilderExtensions_jvmKt.writeFully(this.packet, content);
    }
}
