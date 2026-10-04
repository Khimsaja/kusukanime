package io.ktor.utils.io;

import S5.n;
import io.ktor.http.ContentType;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.C2496a;

@Metadata(d1 = {"\u00000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\b\u0002\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\u0006\u0010\r\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, d2 = {"", "content", "", "offset", "length", "Lio/ktor/utils/io/ByteReadChannel;", "ByteReadChannel", "([BII)Lio/ktor/utils/io/ByteReadChannel;", "", ContentType.Text.TYPE, "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", HttpAuthHeader.Parameters.Charset, "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lio/ktor/utils/io/ByteReadChannel;", "LS5/n;", "source", "(LS5/n;)Lio/ktor/utils/io/ByteReadChannel;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ByteChannelCtorKt {
    public static final ByteReadChannel ByteReadChannel(byte[] bArr, int i7, int i8) {
        l.f("content", bArr);
        S5.a aVar = new S5.a();
        aVar.write(bArr, i7, i8 + i7);
        return ByteReadChannel(aVar);
    }

    public static /* synthetic */ ByteReadChannel ByteReadChannel$default(byte[] bArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = bArr.length;
        }
        return ByteReadChannel(bArr, i7, i8);
    }

    public static /* synthetic */ ByteReadChannel ByteReadChannel$default(String str, Charset charset, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            charset = C2496a.f19036b;
        }
        return ByteReadChannel(str, charset);
    }

    public static final ByteReadChannel ByteReadChannel(String str, Charset charset) {
        l.f(ContentType.Text.TYPE, str);
        l.f(HttpAuthHeader.Parameters.Charset, charset);
        return ByteReadChannel$default(StringsKt.toByteArray(str, charset), 0, 0, 6, null);
    }

    public static final ByteReadChannel ByteReadChannel(n nVar) {
        l.f("source", nVar);
        return new SourceByteReadChannel(nVar);
    }
}
