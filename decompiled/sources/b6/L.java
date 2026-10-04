package b6;

/* loaded from: classes.dex */
public abstract class L {
    public static final String[] a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f11001b;

    static {
        String[] strArr = new String[93];
        for (int i7 = 0; i7 < 32; i7++) {
            strArr[i7] = "\\u" + b(i7 >> 12) + b(i7 >> 8) + b(i7 >> 4) + b(i7);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        a = strArr;
        byte[] bArr = new byte[93];
        for (int i8 = 0; i8 < 32; i8++) {
            bArr[i8] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f11001b = bArr;
    }

    public static final void a(String str, StringBuilder sb) {
        kotlin.jvm.internal.l.f("value", str);
        sb.append('\"');
        int length = str.length();
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt = str.charAt(i8);
            String[] strArr = a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb.append((CharSequence) str, i7, i8);
                sb.append(strArr[cCharAt]);
                i7 = i8 + 1;
            }
        }
        if (i7 != 0) {
            sb.append((CharSequence) str, i7, str.length());
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }

    public static final char b(int i7) {
        int i8 = i7 & 15;
        return (char) (i8 < 10 ? i8 + 48 : i8 + 87);
    }
}
