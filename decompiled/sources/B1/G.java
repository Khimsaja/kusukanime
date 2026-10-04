package B1;

import X4.AbstractC0605b;
import X4.AbstractC0608e;
import b1.AbstractC0703b;
import java.io.IOException;
import java.io.OutputStream;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Locale;
import v.c0;

/* loaded from: classes.dex */
public final class G {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public int f293b;

    /* renamed from: c, reason: collision with root package name */
    public int f294c;

    /* renamed from: d, reason: collision with root package name */
    public Object f295d;

    /* renamed from: e, reason: collision with root package name */
    public Object f296e;

    public G(CharSequence charSequence, int i7, Locale locale) {
        this.a = 1;
        this.f295d = charSequence;
        if (charSequence.length() < 0) {
            throw new IllegalArgumentException("input start index is outside the CharSequence");
        }
        if (i7 < 0 || i7 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f296e = wordInstance;
        this.f293b = Math.max(0, -50);
        this.f294c = Math.min(charSequence.length(), i7 + 50);
        wordInstance.setText(new I0.j(charSequence, i7));
    }

    public static int d(int i7, int i8) {
        return f(i8) + k(i7);
    }

    public static int e(int i7, int i8) {
        return f(i8) + k(i7);
    }

    public static int f(int i7) {
        if (i7 >= 0) {
            return i(i7);
        }
        return 10;
    }

    public static int g(int i7, AbstractC0605b abstractC0605b) {
        return h(abstractC0605b) + k(i7);
    }

    public static int h(AbstractC0605b abstractC0605b) {
        int iC = abstractC0605b.c();
        return i(iC) + iC;
    }

    public static int i(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int j(long j7) {
        if (((-128) & j7) == 0) {
            return 1;
        }
        if (((-16384) & j7) == 0) {
            return 2;
        }
        if (((-2097152) & j7) == 0) {
            return 3;
        }
        if (((-268435456) & j7) == 0) {
            return 4;
        }
        if (((-34359738368L) & j7) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j7) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j7) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j7) == 0) {
            return 8;
        }
        return (j7 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int k(int i7) {
        return i(i7 << 3);
    }

    public static G s(OutputStream outputStream, int i7) {
        return new G(outputStream, new byte[i7]);
    }

    public void A(int i7, int i8) throws IOException {
        M(i7, 0);
        C(i8);
    }

    public void B(int i7, int i8) throws IOException {
        M(i7, 0);
        C(i8);
    }

    public void C(int i7) throws IOException {
        if (i7 >= 0) {
            K(i7);
        } else {
            L(i7);
        }
    }

    public void D(int i7, AbstractC0605b abstractC0605b) throws IOException {
        M(i7, 2);
        E(abstractC0605b);
    }

    public void E(AbstractC0605b abstractC0605b) throws IOException {
        K(abstractC0605b.c());
        abstractC0605b.f(this);
    }

    public void F(int i7) throws IOException {
        byte b4 = (byte) i7;
        if (this.f294c == this.f293b) {
            x();
        }
        int i8 = this.f294c;
        this.f294c = i8 + 1;
        ((byte[]) this.f295d)[i8] = b4;
    }

    public void G(AbstractC0608e abstractC0608e) throws IOException {
        int size = abstractC0608e.size();
        int i7 = this.f294c;
        int i8 = this.f293b;
        int i9 = i8 - i7;
        byte[] bArr = (byte[]) this.f295d;
        if (i9 >= size) {
            abstractC0608e.j(0, i7, size, bArr);
            this.f294c += size;
            return;
        }
        abstractC0608e.j(0, i7, i9, bArr);
        int i10 = size - i9;
        this.f294c = i8;
        x();
        if (i10 <= i8) {
            abstractC0608e.j(i9, 0, i10, bArr);
            this.f294c = i10;
            return;
        }
        if (i9 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i9);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i11 = i9 + i10;
        if (i11 <= abstractC0608e.size()) {
            if (i10 > 0) {
                abstractC0608e.x((OutputStream) this.f296e, i9, i10);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public void H(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i7 = this.f294c;
        int i8 = this.f293b;
        int i9 = i8 - i7;
        byte[] bArr2 = (byte[]) this.f295d;
        if (i9 >= length) {
            System.arraycopy(bArr, 0, bArr2, i7, length);
            this.f294c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i7, i9);
        int i10 = length - i9;
        this.f294c = i8;
        x();
        if (i10 > i8) {
            ((OutputStream) this.f296e).write(bArr, i9, i10);
        } else {
            System.arraycopy(bArr, i9, bArr2, 0, i10);
            this.f294c = i10;
        }
    }

    public void I(int i7) throws IOException {
        F(i7 & 255);
        F((i7 >> 8) & 255);
        F((i7 >> 16) & 255);
        F((i7 >> 24) & 255);
    }

    public void J(long j7) throws IOException {
        F(((int) j7) & 255);
        F(((int) (j7 >> 8)) & 255);
        F(((int) (j7 >> 16)) & 255);
        F(((int) (j7 >> 24)) & 255);
        F(((int) (j7 >> 32)) & 255);
        F(((int) (j7 >> 40)) & 255);
        F(((int) (j7 >> 48)) & 255);
        F(((int) (j7 >> 56)) & 255);
    }

    public void K(int i7) throws IOException {
        while ((i7 & (-128)) != 0) {
            F((i7 & 127) | 128);
            i7 >>>= 7;
        }
        F(i7);
    }

    public void L(long j7) throws IOException {
        while (((-128) & j7) != 0) {
            F((((int) j7) & 127) | 128);
            j7 >>>= 7;
        }
        F((int) j7);
    }

    public void M(int i7, int i8) throws IOException {
        K((i7 << 3) | i8);
    }

    public synchronized void a(long j7, Object obj) {
        if (this.f294c > 0) {
            if (j7 <= ((long[]) this.f295d)[((this.f293b + r0) - 1) % ((Object[]) this.f296e).length]) {
                c();
            }
        }
        l();
        int i7 = this.f293b;
        int i8 = this.f294c;
        Object[] objArr = (Object[]) this.f296e;
        int length = (i7 + i8) % objArr.length;
        ((long[]) this.f295d)[length] = j7;
        objArr[length] = obj;
        this.f294c = i8 + 1;
    }

    public void b(int i7) {
        int i8 = this.f293b;
        int i9 = this.f294c;
        if (i7 > i9 || i8 > i7) {
            throw new IllegalArgumentException(AbstractC0703b.l(c0.b("Invalid offset: ", i7, ". Valid range is [", i8, " , "), i9, ']').toString());
        }
    }

    public synchronized void c() {
        this.f293b = 0;
        this.f294c = 0;
        Arrays.fill((Object[]) this.f296e, (Object) null);
    }

    public void l() {
        int length = ((Object[]) this.f296e).length;
        if (this.f294c < length) {
            return;
        }
        int i7 = length * 2;
        long[] jArr = new long[i7];
        Object[] objArr = new Object[i7];
        int i8 = this.f293b;
        int i9 = length - i8;
        System.arraycopy((long[]) this.f295d, i8, jArr, 0, i9);
        System.arraycopy((Object[]) this.f296e, this.f293b, objArr, 0, i9);
        int i10 = this.f293b;
        if (i10 > 0) {
            System.arraycopy((long[]) this.f295d, 0, jArr, i9, i10);
            System.arraycopy((Object[]) this.f296e, 0, objArr, i9, this.f293b);
        }
        this.f295d = jArr;
        this.f296e = objArr;
        this.f293b = 0;
    }

    public void m() throws IOException {
        if (((OutputStream) this.f296e) != null) {
            x();
        }
    }

    public int n() {
        s sVar = (s) this.f296e;
        if (sVar == null) {
            return ((String) this.f295d).length();
        }
        return (sVar.f358b - sVar.c()) + (((String) this.f295d).length() - (this.f294c - this.f293b));
    }

    public boolean o(int i7) {
        return i7 <= this.f294c && this.f293b + 1 <= i7 && Character.isLetterOrDigit(Character.codePointBefore((CharSequence) this.f295d, i7));
    }

    public boolean p(int i7) {
        int i8 = this.f293b + 1;
        if (i7 > this.f294c || i8 > i7) {
            return false;
        }
        return P3.r.F(Character.codePointBefore((CharSequence) this.f295d, i7));
    }

    public boolean q(int i7) {
        return i7 < this.f294c && this.f293b <= i7 && Character.isLetterOrDigit(Character.codePointAt((CharSequence) this.f295d, i7));
    }

    public boolean r(int i7) {
        if (i7 >= this.f294c || this.f293b > i7) {
            return false;
        }
        return P3.r.F(Character.codePointAt((CharSequence) this.f295d, i7));
    }

    public Object t(long j7, boolean z7) {
        Object objW = null;
        long j8 = Long.MAX_VALUE;
        while (this.f294c > 0) {
            long j9 = j7 - ((long[]) this.f295d)[this.f293b];
            if (j9 < 0 && (z7 || (-j9) >= j8)) {
                break;
            }
            objW = w();
            j8 = j9;
        }
        return objW;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                s sVar = (s) this.f296e;
                if (sVar == null) {
                    return (String) this.f295d;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) this.f295d, 0, this.f293b);
                sb.append((char[]) sVar.f361e, 0, sVar.f359c);
                char[] cArr = (char[]) sVar.f361e;
                int i7 = sVar.f360d;
                sb.append(cArr, i7, sVar.f358b - i7);
                String str = (String) this.f295d;
                sb.append((CharSequence) str, this.f294c, str.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public synchronized Object u() {
        return this.f294c == 0 ? null : w();
    }

    public synchronized Object v(long j7) {
        return t(j7, true);
    }

    public Object w() {
        AbstractC0015b.h(this.f294c > 0);
        Object[] objArr = (Object[]) this.f296e;
        int i7 = this.f293b;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f293b = (i7 + 1) % objArr.length;
        this.f294c--;
        return obj;
    }

    public void x() throws IOException {
        OutputStream outputStream = (OutputStream) this.f296e;
        if (outputStream == null) {
            throw new D1.a("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
        outputStream.write((byte[]) this.f295d, 0, this.f294c);
        this.f294c = 0;
    }

    public void y(String str, int i7, int i8) {
        if (i7 > i8) {
            throw new IllegalArgumentException(A6.b.e(i7, i8, "start index must be less than or equal to end index: ", " > ").toString());
        }
        if (i7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.g(i7, "start must be non-negative, but was ").toString());
        }
        s sVar = (s) this.f296e;
        if (sVar == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i7, 64);
            int iMin2 = Math.min(((String) this.f295d).length() - i8, 64);
            String str2 = (String) this.f295d;
            int i9 = i7 - iMin;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type java.lang.String", str2);
            str2.getChars(i9, i7, cArr, 0);
            String str3 = (String) this.f295d;
            int i10 = iMax - iMin2;
            int i11 = iMin2 + i8;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type java.lang.String", str3);
            str3.getChars(i8, i11, cArr, i10);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            s sVar2 = new s(3);
            sVar2.f358b = iMax;
            sVar2.f361e = cArr;
            sVar2.f359c = length;
            sVar2.f360d = i10;
            this.f296e = sVar2;
            this.f293b = i9;
            this.f294c = i11;
            return;
        }
        int i12 = this.f293b;
        int i13 = i7 - i12;
        int i14 = i8 - i12;
        if (i13 < 0 || i14 > sVar.f358b - sVar.c()) {
            this.f295d = toString();
            this.f296e = null;
            this.f293b = -1;
            this.f294c = -1;
            y(str, i7, i8);
            return;
        }
        int length2 = str.length() - (i14 - i13);
        if (length2 > sVar.c()) {
            int iC = length2 - sVar.c();
            int i15 = sVar.f358b;
            do {
                i15 *= 2;
            } while (i15 - sVar.f358b < iC);
            char[] cArr2 = new char[i15];
            P3.m.X((char[]) sVar.f361e, cArr2, 0, 0, sVar.f359c);
            int i16 = sVar.f358b;
            int i17 = sVar.f360d;
            int i18 = i16 - i17;
            int i19 = i15 - i18;
            P3.m.X((char[]) sVar.f361e, cArr2, i19, i17, i18 + i17);
            sVar.f361e = cArr2;
            sVar.f358b = i15;
            sVar.f360d = i19;
        }
        int i20 = sVar.f359c;
        if (i13 < i20 && i14 <= i20) {
            int i21 = i20 - i14;
            char[] cArr3 = (char[]) sVar.f361e;
            P3.m.X(cArr3, cArr3, sVar.f360d - i21, i14, i20);
            sVar.f359c = i13;
            sVar.f360d -= i21;
        } else if (i13 >= i20 || i14 < i20) {
            int iC2 = sVar.c() + i13;
            int iC3 = sVar.c() + i14;
            int i22 = sVar.f360d;
            char[] cArr4 = (char[]) sVar.f361e;
            P3.m.X(cArr4, cArr4, sVar.f359c, i22, iC2);
            sVar.f359c += iC2 - i22;
            sVar.f360d = iC3;
        } else {
            sVar.f360d = sVar.c() + i14;
            sVar.f359c = i13;
        }
        str.getChars(0, str.length(), (char[]) sVar.f361e, sVar.f359c);
        sVar.f359c = str.length() + sVar.f359c;
    }

    public synchronized int z() {
        return this.f294c;
    }

    public G(int i7, byte b4) {
        this.a = i7;
        switch (i7) {
            case 2:
                break;
            default:
                this.f295d = new long[10];
                this.f296e = new Object[10];
                break;
        }
    }

    public G(OutputStream outputStream, byte[] bArr) {
        this.a = 5;
        this.f296e = outputStream;
        this.f295d = bArr;
        this.f294c = 0;
        this.f293b = bArr.length;
    }

    public G(int i7, int i8, float[] fArr, float[] fArr2) {
        this.a = 3;
        this.f293b = i7;
        AbstractC0015b.c(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f295d = fArr;
        this.f296e = fArr2;
        this.f294c = i8;
    }

    public G(G g4) {
        this.a = 4;
        float[] fArr = (float[]) g4.f295d;
        this.f293b = fArr.length / 3;
        this.f295d = AbstractC0015b.k(fArr);
        this.f296e = AbstractC0015b.k((float[]) g4.f296e);
        int i7 = g4.f294c;
        if (i7 == 1) {
            this.f294c = 5;
        } else if (i7 != 2) {
            this.f294c = 4;
        } else {
            this.f294c = 6;
        }
    }

    public G(int i7) {
        this.a = 6;
        this.f295d = new p2.q[i7];
        this.f294c = 0;
    }
}
