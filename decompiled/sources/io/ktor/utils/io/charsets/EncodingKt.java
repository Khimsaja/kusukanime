package io.ktor.utils.io.charsets;

import S5.a;
import S5.n;
import io.ktor.utils.io.core.internal.CharArraySequence;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u001a1\u0010\b\u001a\u00020\u0007*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\b\u001a\u00020\r*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\u000e\u001a'\u0010\u0013\u001a\u00020\u0012*\u00060\u000fj\u0002`\u00102\u0006\u0010\u0003\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014\u001a7\u0010\u0015\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a7\u0010\u0018\u001a\u00020\r*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ljava/nio/charset/CharsetEncoder;", "Lio/ktor/utils/io/charsets/CharsetEncoder;", "", "input", "", "fromIndex", "toIndex", "LS5/n;", "encode", "(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;II)LS5/n;", "", "LS5/l;", "dst", "LO3/C;", "(Ljava/nio/charset/CharsetEncoder;[CIILS5/l;)V", "Ljava/nio/charset/CharsetDecoder;", "Lio/ktor/utils/io/charsets/CharsetDecoder;", "max", "", "decode", "(Ljava/nio/charset/CharsetDecoder;LS5/n;I)Ljava/lang/String;", "encodeArrayImpl", "(Ljava/nio/charset/CharsetEncoder;[CIILS5/l;)I", "destination", "encodeToImpl", "(Ljava/nio/charset/CharsetEncoder;LS5/l;Ljava/lang/CharSequence;II)V", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EncodingKt {
    public static final String decode(CharsetDecoder charsetDecoder, n nVar, int i7) {
        l.f("<this>", charsetDecoder);
        l.f("input", nVar);
        StringBuilder sb = new StringBuilder((int) Math.min(i7, nVar.a().f8784m));
        CharsetJVMKt.decode(charsetDecoder, nVar, sb, i7);
        return sb.toString();
    }

    public static /* synthetic */ String decode$default(CharsetDecoder charsetDecoder, n nVar, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        return decode(charsetDecoder, nVar, i7);
    }

    public static final void encode(CharsetEncoder charsetEncoder, char[] cArr, int i7, int i8, S5.l lVar) {
        l.f("<this>", charsetEncoder);
        l.f("input", cArr);
        l.f("dst", lVar);
        encodeArrayImpl(charsetEncoder, cArr, i7, i8, lVar);
    }

    public static /* synthetic */ n encode$default(CharsetEncoder charsetEncoder, CharSequence charSequence, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = charSequence.length();
        }
        return encode(charsetEncoder, charSequence, i7, i8);
    }

    public static final int encodeArrayImpl(CharsetEncoder charsetEncoder, char[] cArr, int i7, int i8, S5.l lVar) {
        l.f("<this>", charsetEncoder);
        l.f("input", cArr);
        l.f("dst", lVar);
        int i9 = i8 - i7;
        return CharsetJVMKt.encodeImpl(charsetEncoder, new CharArraySequence(cArr, i7, i9), 0, i9, lVar);
    }

    public static final void encodeToImpl(CharsetEncoder charsetEncoder, S5.l lVar, CharSequence charSequence, int i7, int i8) {
        l.f("<this>", charsetEncoder);
        l.f("destination", lVar);
        l.f("input", charSequence);
        if (i7 >= i8) {
            return;
        }
        do {
            int iEncodeImpl = CharsetJVMKt.encodeImpl(charsetEncoder, charSequence, i7, i8, lVar);
            if (iEncodeImpl < 0) {
                throw new IllegalStateException("Check failed.");
            }
            i7 += iEncodeImpl;
        } while (i7 < i8);
    }

    public static final n encode(CharsetEncoder charsetEncoder, CharSequence charSequence, int i7, int i8) {
        l.f("<this>", charsetEncoder);
        l.f("input", charSequence);
        a aVar = new a();
        encodeToImpl(charsetEncoder, aVar, charSequence, i7, i8);
        return aVar;
    }
}
