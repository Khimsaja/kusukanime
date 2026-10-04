package C1;

import B1.AbstractC0015b;
import java.util.ArrayList;
import java.util.Arrays;
import y1.B;

/* loaded from: classes.dex */
public final class a implements B {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f567b;

    /* renamed from: c, reason: collision with root package name */
    public final int f568c;

    /* renamed from: d, reason: collision with root package name */
    public final int f569d;

    public a(String str, byte[] bArr, int i7, int i8) {
        boolean z7;
        byte b4;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                AbstractC0015b.c(i8 == 23 && bArr.length == 4);
                break;
            case "auxiliary.tracks.interleaved":
                if (i8 != 75 || bArr.length != 1 || ((b4 = bArr[0]) != 0 && b4 != 1)) {
                    z7 = false;
                }
                AbstractC0015b.c(z7);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                AbstractC0015b.c(i8 == 78 && bArr.length == 8);
                break;
            case "auxiliary.tracks.map":
                AbstractC0015b.c(i8 == 0);
                break;
        }
        this.a = str;
        this.f567b = bArr;
        this.f568c = i7;
        this.f569d = i8;
    }

    public final ArrayList d() {
        AbstractC0015b.g("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f567b;
        byte b4 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < b4; i7++) {
            arrayList.add(Integer.valueOf(bArr[i7 + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a.equals(aVar.a) && Arrays.equals(this.f567b, aVar.f567b) && this.f568c == aVar.f568c && this.f569d == aVar.f569d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f567b) + A6.b.b(this.a, 527, 31)) * 31) + this.f568c) * 31) + this.f569d;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.a.toString():java.lang.String");
    }
}
