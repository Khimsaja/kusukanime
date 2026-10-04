package I2;

import android.content.pm.PackageInfo;
import b1.AbstractC0703b;
import io.ktor.sse.ServerSentEventKt;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public abstract class e {
    public static final A.e a = new A.e(12);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f4020b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f4021c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f4022d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f4023e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f4024f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f4025g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f4026h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f4027i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f4028j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(b[] bVarArr, byte[] bArr) throws IOException {
        int i7 = 0;
        int length = 0;
        for (b bVar : bVarArr) {
            length += ((((bVar.f4016g * 2) + 7) & (-8)) / 8) + (bVar.f4014e * 2) + d(bVar.a, bVar.f4011b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f4015f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f4024f)) {
            int length2 = bVarArr.length;
            while (i7 < length2) {
                b bVar2 = bVarArr[i7];
                q(byteArrayOutputStream, bVar2, d(bVar2.a, bVar2.f4011b, bArr));
                p(byteArrayOutputStream, bVar2);
                i7++;
            }
        } else {
            for (b bVar3 : bVarArr) {
                q(byteArrayOutputStream, bVar3, d(bVar3.a, bVar3.f4011b, bArr));
            }
            int length3 = bVarArr.length;
            while (i7 < length3) {
                p(byteArrayOutputStream, bVarArr[i7]);
                i7++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z7 = true;
        for (File file2 : fileArrListFiles) {
            z7 = c(file2) && z7;
        }
        return z7;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f4026h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f4025g;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ServerSentEventKt.COLON : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(ServerSentEventKt.COLON, "!");
            }
            if (ServerSentEventKt.COLON.equals(obj)) {
                return str2.replace("!", ServerSentEventKt.COLON);
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(ServerSentEventKt.COLON)) {
                if ("!".equals(obj)) {
                    return str2.replace(ServerSentEventKt.COLON, "!");
                }
                if (ServerSentEventKt.COLON.equals(obj)) {
                    return str2.replace("!", ServerSentEventKt.COLON);
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return AbstractC0703b.m(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ServerSentEventKt.COLON : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i7) throws IOException {
        byte[] bArr = new byte[i7];
        int i8 = 0;
        while (i8 < i7) {
            int i9 = inputStream.read(bArr, i8, i7 - i8);
            if (i9 < 0) {
                throw new IllegalStateException(AbstractC0703b.g(i7, "Not enough bytes to read: "));
            }
            i8 += i9;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i7) {
        int[] iArr = new int[i7];
        int iM = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i8] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i7, int i8) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i8];
            byte[] bArr2 = new byte[2048];
            int i9 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i9 < i7) {
                int i10 = fileInputStream.read(bArr2);
                if (i10 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i7 + " bytes");
                }
                inflater.setInput(bArr2, 0, i10);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i8 - iInflate);
                    i9 += i10;
                } catch (DataFormatException e7) {
                    throw new IllegalStateException(e7.getMessage());
                }
            }
            if (i9 == i7) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i7 + " actual=" + i9);
        } finally {
            inflater.end();
        }
    }

    public static b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) throws IOException {
        byte[] bArr3 = f4027i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f4028j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                b[] bVarArrK = k(byteArrayInputStream, bArr2, iM, bVarArr);
                byteArrayInputStream.close();
                return bVarArrK;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f4022d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            b[] bVarArrJ = j(byteArrayInputStream2, iM2, bVarArr);
            byteArrayInputStream2.close();
            return bVarArrJ;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static b[] j(ByteArrayInputStream byteArrayInputStream, int i7, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i7 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i7];
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i8] = (int) m(byteArrayInputStream, 2);
            strArr[i8] = new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8);
        }
        for (int i9 = 0; i9 < i7; i9++) {
            b bVar = bVarArr[i9];
            if (!bVar.f4011b.equals(strArr[i9])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i10 = iArr[i9];
            bVar.f4014e = i10;
            bVar.f4017h = g(byteArrayInputStream, i10);
        }
        return bVarArr;
    }

    public static b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i7, b[] bVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i7 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i8 = 0; i8 < i7; i8++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            b bVar = null;
            if (bVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(ServerSentEventKt.COLON);
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i9 = 0;
                while (true) {
                    if (i9 >= bVarArr.length) {
                        break;
                    }
                    if (bVarArr[i9].f4011b.equals(strSubstring)) {
                        bVar = bVarArr[i9];
                        break;
                    }
                    i9++;
                }
            }
            if (bVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            bVar.f4013d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f4026h)) {
                bVar.f4014e = iM;
                bVar.f4017h = iArrG;
            }
        }
        return bVarArr;
    }

    public static b[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f4023e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            b[] bVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return bVarArrN;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i7) throws IOException {
        byte[] bArrF = f(inputStream, i7);
        long j7 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j7 += (bArrF[i8] & 255) << (i8 * 8);
        }
        return j7;
    }

    public static b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i7) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            bVarArr[i8] = new b(str, new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        for (int i9 = 0; i9 < i7; i9++) {
            b bVar = bVarArr[i9];
            int iAvailable = byteArrayInputStream.available() - bVar.f4015f;
            int iM3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = bVar.f4018i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                for (int iM4 = (int) m(byteArrayInputStream, 2); iM4 > 0; iM4--) {
                    m(byteArrayInputStream, 2);
                    int iM5 = (int) m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int iM6 = (int) m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                m(byteArrayInputStream, 2);
                            }
                            iM5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            bVar.f4017h = g(byteArrayInputStream, bVar.f4014e);
            int i10 = bVar.f4016g;
            BitSet bitSetValueOf = BitSet.valueOf(f(byteArrayInputStream, (((i10 * 2) + 7) & (-8)) / 8));
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = bitSetValueOf.get(i11) ? 2 : 0;
                if (bitSetValueOf.get(i11 + i10)) {
                    i12 |= 4;
                }
                if (i12 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i11));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i11), Integer.valueOf(i12 | num.intValue()));
                }
            }
        }
        return bVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) throws IOException {
        long j7;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f4022d;
        int i7 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f4023e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(bVarArr, bArr3);
                u(byteArrayOutputStream, bVarArr.length, 1);
                u(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                u(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = f4025g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, bVarArr.length, 1);
                for (b bVar : bVarArr) {
                    int size = bVar.f4018i.size() * 4;
                    String strD = d(bVar.a, bVar.f4011b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, strD.getBytes(charset).length);
                    v(byteArrayOutputStream, bVar.f4017h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, bVar.f4012c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = bVar.f4018i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i8 : bVar.f4017h) {
                        v(byteArrayOutputStream, i8);
                    }
                }
                return true;
            }
            byte[] bArr5 = f4024f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(bVarArr, bArr5);
                u(byteArrayOutputStream, bVarArr.length, 1);
                u(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                u(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f4026h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, bVarArr.length);
            for (b bVar2 : bVarArr) {
                String strD2 = d(bVar2.a, bVar2.f4011b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, strD2.getBytes(charset2).length);
                TreeMap treeMap = bVar2.f4018i;
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, bVar2.f4017h.length);
                u(byteArrayOutputStream, bVar2.f4012c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i9 : bVar2.f4017h) {
                    v(byteArrayOutputStream, i9);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, bVarArr.length);
            int i10 = 2;
            int i11 = 2;
            for (b bVar3 : bVarArr) {
                u(byteArrayOutputStream2, bVar3.f4012c, 4);
                u(byteArrayOutputStream2, bVar3.f4013d, 4);
                u(byteArrayOutputStream2, bVar3.f4016g, 4);
                String strD3 = d(bVar3.a, bVar3.f4011b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i11 = i11 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i11 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray.length);
            }
            k kVar = new k(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(kVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            int i13 = 0;
            while (i12 < bVarArr.length) {
                try {
                    b bVar4 = bVarArr[i12];
                    v(byteArrayOutputStream3, i12);
                    v(byteArrayOutputStream3, bVar4.f4014e);
                    i13 = i13 + 4 + (bVar4.f4014e * i10);
                    int[] iArr = bVar4.f4017h;
                    int length3 = iArr.length;
                    int i14 = i7;
                    int i15 = i10;
                    int i16 = i14;
                    while (i16 < length3) {
                        int i17 = iArr[i16];
                        v(byteArrayOutputStream3, i17 - i14);
                        i16++;
                        i14 = i17;
                    }
                    i12++;
                    i10 = i15;
                    i7 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray2.length);
            }
            k kVar2 = new k(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(kVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i18 = 0;
            int i19 = 0;
            while (i18 < bVarArr.length) {
                try {
                    b bVar5 = bVarArr[i18];
                    Iterator it3 = bVar5.f4018i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream4, iIntValue, bVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream4, bVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            v(byteArrayOutputStream3, i18);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i20 = i19 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream3, length4, 4);
                            v(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i19 = i20 + length4;
                            i18++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i19 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i19 + ", does not match actual size " + byteArray5.length);
            }
            k kVar3 = new k(4, true, byteArray5);
            byteArrayOutputStream3.close();
            arrayList2.add(kVar3);
            long j8 = 4;
            long size2 = j8 + j8 + 4 + (arrayList2.size() * 16);
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i21 = 0;
            while (i21 < arrayList2.size()) {
                k kVar4 = (k) arrayList2.get(i21);
                int i22 = kVar4.a;
                if (i22 == 1) {
                    j7 = 0;
                } else if (i22 == 2) {
                    j7 = 1;
                } else if (i22 == 3) {
                    j7 = 2;
                } else if (i22 == 4) {
                    j7 = 3;
                } else {
                    if (i22 != 5) {
                        throw null;
                    }
                    j7 = 4;
                }
                u(byteArrayOutputStream, j7, 4);
                u(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = kVar4.f4038b;
                if (kVar4.f4039c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    u(byteArrayOutputStream, bArrA3.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i21++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i23));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, b bVar) throws IOException {
        s(byteArrayOutputStream, bVar);
        int[] iArr = bVar.f4017h;
        int length = iArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int i9 = iArr[i7];
            v(byteArrayOutputStream, i9 - i8);
            i7++;
            i8 = i9;
        }
        int i10 = bVar.f4016g;
        byte[] bArr = new byte[(((i10 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f4018i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i11 = iIntValue / 8;
                bArr[i11] = (byte) (bArr[i11] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i12 = iIntValue + i10;
                int i13 = i12 / 8;
                bArr[i13] = (byte) ((1 << (i12 % 8)) | bArr[i13]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, bVar.f4014e);
        u(byteArrayOutputStream, bVar.f4015f, 4);
        u(byteArrayOutputStream, bVar.f4012c, 4);
        u(byteArrayOutputStream, bVar.f4016g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i7, b bVar) throws IOException {
        int iBitCount = Integer.bitCount(i7 & (-2));
        int i8 = bVar.f4016g;
        byte[] bArr = new byte[(((iBitCount * i8) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f4018i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i9 = 0;
            for (int i10 = 1; i10 <= 4; i10 <<= 1) {
                if (i10 != 1 && (i10 & i7) != 0) {
                    if ((i10 & iIntValue2) == i10) {
                        int i11 = (i9 * i8) + iIntValue;
                        int i12 = i11 / 8;
                        bArr[i12] = (byte) ((1 << (i11 % 8)) | bArr[i12]);
                    }
                    i9++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, b bVar) throws IOException {
        int i7 = 0;
        for (Map.Entry entry : bVar.f4018i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, iIntValue - i7);
                v(byteArrayOutputStream, 0);
                i7 = iIntValue;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(3:294|44|45)|254|(3:266|53|(4:55|287|56|76)(2:66|67))|82|(3:298|92|(3:282|94|(4:96|97|98|(1:122))(2:107|108))(3:(1:115)|120|(0)))|123|(2:128|(5:293|130|269|131|(2:133|134)(3:142|143|152))(2:153|154))|155|(1:157)(3:158|263|(13:296|160|267|161|259|162|289|163|273|(3:274|165|(9:167|(2:168|(1:170)(1:299))|172|173|174|175|176|177|178))|193|196|197)(2:240|241))|(1:236)|237) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013b, code lost:
    
        r20.b(7, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x01d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0158  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t(android.content.Context r18, java.util.concurrent.Executor r19, I2.d r20, boolean r21) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.e.t(android.content.Context, java.util.concurrent.Executor, I2.d, boolean):void");
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j7, int i7) throws IOException {
        byte[] bArr = new byte[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            bArr[i8] = (byte) ((j7 >> (i8 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i7) throws IOException {
        u(byteArrayOutputStream, i7, 2);
    }
}
