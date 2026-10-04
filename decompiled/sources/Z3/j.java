package Z3;

import io.ktor.http.auth.HttpAuthHeader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;
import z5.C2496a;

/* loaded from: classes.dex */
public abstract class j extends android.support.v4.media.session.b {
    public static String O(File file) throws IOException {
        Charset charset = C2496a.f19036b;
        l.f(HttpAuthHeader.Parameters.Charset, charset);
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int i7 = inputStreamReader.read(cArr); i7 >= 0; i7 = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, i7);
            }
            String string = stringWriter.toString();
            l.e("toString(...)", string);
            inputStreamReader.close();
            return string;
        } finally {
        }
    }

    public static File P(File file, String str) {
        l.f("relative", str);
        File file2 = new File(str);
        String path = file2.getPath();
        l.e("getPath(...)", path);
        if (android.support.v4.media.session.b.A(path) > 0) {
            return file2;
        }
        String string = file.toString();
        l.e("toString(...)", string);
        if (string.length() != 0) {
            char c2 = File.separatorChar;
            if (!AbstractC2510o.a0(string, c2)) {
                return new File(string + c2 + file2);
            }
        }
        return new File(string + file2);
    }

    public static final void Q(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        l.f(HttpAuthHeader.Parameters.Charset, charset);
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            l.e("getBytes(...)", bytes);
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        l.c(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        l.e("allocate(...)", byteBufferAllocate);
        int i7 = 0;
        int i8 = 0;
        while (i7 < str.length()) {
            int iMin = Math.min(8192 - i8, str.length() - i7);
            int i9 = i7 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            l.e("array(...)", cArrArray);
            str.getChars(i7, i9, cArrArray, i8);
            charBufferAllocate.limit(iMin + i8);
            i8 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i9 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i8 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i7 = i9;
        }
    }
}
