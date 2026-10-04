package i2;

import e2.C0818a;
import f1.AbstractC0871d;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import y1.C;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1069a extends z1.c {

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f11995t = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: r, reason: collision with root package name */
    public final CharsetDecoder f11996r = StandardCharsets.UTF_8.newDecoder();

    /* renamed from: s, reason: collision with root package name */
    public final CharsetDecoder f11997s = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // z1.c
    public final C l(C0818a c0818a, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f11997s;
        CharsetDecoder charsetDecoder2 = this.f11996r;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new C(new C1071c(null, null, bArr));
        }
        Matcher matcher = f11995t.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strR0 = AbstractC0871d.r0(strGroup);
                strR0.getClass();
                if (strR0.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strR0.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new C(new C1071c(str, str2, bArr));
    }
}
