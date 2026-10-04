package f6;

import f.AbstractC0841b;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import z5.C2496a;

/* renamed from: f6.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0892F {
    public static C0891E a(C0925w c0925w, byte[] bArr, int i7, int i8) {
        kotlin.jvm.internal.l.f("<this>", bArr);
        long length = bArr.length;
        long j7 = i7;
        long j8 = i8;
        byte[] bArr2 = g6.b.a;
        if ((j7 | j8) < 0 || j7 > length || length - j7 < j8) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return new C0891E(c0925w, bArr, i8, i7);
    }

    public static C0891E b(String str, C0925w c0925w) {
        kotlin.jvm.internal.l.f("<this>", str);
        Charset charset = C2496a.f19036b;
        if (c0925w != null) {
            Pattern pattern = C0925w.f11614e;
            Charset charsetA = c0925w.a(null);
            if (charsetA == null) {
                c0925w = AbstractC0841b.m(c0925w + "; charset=utf-8");
            } else {
                charset = charsetA;
            }
        }
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.l.e("this as java.lang.String).getBytes(charset)", bytes);
        return a(c0925w, bytes, 0, bytes.length);
    }

    public static /* synthetic */ C0891E c(C0892F c0892f, byte[] bArr, C0925w c0925w, int i7, int i8) {
        if ((i8 & 1) != 0) {
            c0925w = null;
        }
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        int length = bArr.length;
        c0892f.getClass();
        return a(c0925w, bArr, i7, length);
    }
}
