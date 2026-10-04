package b6;

import io.ktor.http.auth.HttpAuthHeader;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

/* renamed from: b6.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0735j {
    public final InputStream a;

    /* renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f11023b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f11024c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11025d;

    /* renamed from: e, reason: collision with root package name */
    public char f11026e;

    public C0735j(InputStream inputStream, Charset charset) {
        byte[] bArr;
        kotlin.jvm.internal.l.f(HttpAuthHeader.Parameters.Charset, charset);
        this.a = inputStream;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        kotlin.jvm.internal.l.e("onUnmappableCharacter(...)", charsetDecoderOnUnmappableCharacter);
        this.f11023b = charsetDecoderOnUnmappableCharacter;
        C0730e c0730e = C0730e.f11018l;
        synchronized (c0730e) {
            P3.l lVar = (P3.l) c0730e.f8011k;
            byte[] bArr2 = (byte[]) (lVar.isEmpty() ? null : lVar.removeLast());
            bArr = bArr2 != null ? bArr2 : null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr == null ? new byte[8196] : bArr);
        kotlin.jvm.internal.l.e("wrap(...)", byteBufferWrap);
        this.f11024c = byteBufferWrap;
        byteBufferWrap.flip();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e5, code lost:
    
        r2 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(char[] r11, int r12, int r13) throws java.nio.charset.CharacterCodingException {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.C0735j.a(char[], int, int):int");
    }
}
