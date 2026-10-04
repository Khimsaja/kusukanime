package V4;

import io.ktor.util.GzipHeaderFlags;

/* loaded from: classes.dex */
public abstract class a {
    static {
        String property;
        try {
            property = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            property = null;
        }
        "true".equals(property);
    }

    public static byte[] a(String[] strArr) {
        if (strArr == null) {
            Object[] objArr = new Object[3];
            objArr[0] = "data";
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
            switch (7) {
                case 1:
                case 3:
                case 6:
                case 8:
                case 10:
                case 12:
                case 14:
                    break;
                case 2:
                    objArr[2] = "encode8to7";
                    break;
                case GzipHeaderFlags.EXTRA /* 4 */:
                    objArr[2] = "addModuloByte";
                    break;
                case 5:
                    objArr[2] = "splitBytesToStringArray";
                    break;
                case 7:
                    objArr[2] = "decodeBytes";
                    break;
                case 9:
                    objArr[2] = "dropMarker";
                    break;
                case 11:
                    objArr[2] = "combineStringArrayIntoBytes";
                    break;
                case 13:
                    objArr[2] = "decode7to8";
                    break;
                default:
                    objArr[2] = "encodeBytes";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char cCharAt = strArr[0].charAt(0);
            if (cCharAt == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                strArr2[0] = strArr2[0].substring(1);
                int length = 0;
                for (String str : strArr2) {
                    length += str.length();
                }
                byte[] bArr = new byte[length];
                int i7 = 0;
                for (String str2 : strArr2) {
                    int length2 = str2.length();
                    int i8 = 0;
                    while (i8 < length2) {
                        bArr[i7] = (byte) str2.charAt(i8);
                        i8++;
                        i7++;
                    }
                }
                return bArr;
            }
            if (cCharAt == 65535) {
                strArr = (String[]) strArr.clone();
                strArr[0] = strArr[0].substring(1);
            }
        }
        int length3 = 0;
        for (String str3 : strArr) {
            length3 += str3.length();
        }
        byte[] bArr2 = new byte[length3];
        int i9 = 0;
        for (String str4 : strArr) {
            int length4 = str4.length();
            int i10 = 0;
            while (i10 < length4) {
                bArr2[i9] = (byte) str4.charAt(i10);
                i10++;
                i9++;
            }
        }
        for (int i11 = 0; i11 < length3; i11++) {
            bArr2[i11] = (byte) ((bArr2[i11] + 127) & 127);
        }
        int i12 = (length3 * 7) / 8;
        byte[] bArr3 = new byte[i12];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = i13 + 1;
            int i17 = i14 + 1;
            bArr3[i15] = (byte) (((bArr2[i13] & 255) >>> i14) + ((bArr2[i16] & ((1 << i17) - 1)) << (7 - i14)));
            if (i14 == 6) {
                i13 += 2;
                i14 = 0;
            } else {
                i13 = i16;
                i14 = i17;
            }
        }
        return bArr3;
    }
}
