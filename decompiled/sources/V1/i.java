package V1;

import b1.AbstractC0703b;
import b6.C0734i;
import io.ktor.http.ContentType;

/* loaded from: classes.dex */
public abstract class i {
    public final /* synthetic */ int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f9380b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9381c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9382d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9383e;

    public i(InterfaceC0601f interfaceC0601f, InterfaceC0603h interfaceC0603h, long j7, long j8, long j9, long j10, long j11, int i7) {
        this.f9382d = interfaceC0603h;
        this.f9380b = i7;
        this.f9381c = new C0599d(interfaceC0601f, j7, j8, j9, j10, j11);
    }

    public static int A(k kVar, long j7, r rVar) {
        if (j7 == kVar.f9392n) {
            return 0;
        }
        rVar.a = j7;
        return 1;
    }

    public static /* synthetic */ void r(i iVar, String str, int i7, String str2, int i8) {
        if ((i8 & 2) != 0) {
            i7 = iVar.f9380b;
        }
        if ((i8 & 4) != 0) {
            str2 = "";
        }
        iVar.q(i7, str, str2);
        throw null;
    }

    public static boolean v(char c2) {
        return (c2 == ',' || c2 == ':' || c2 == ']' || c2 == '}') ? false : true;
    }

    public void B(long j7) {
        C0600e c0600e = (C0600e) this.f9383e;
        if (c0600e == null || c0600e.a != j7) {
            C0599d c0599d = (C0599d) this.f9381c;
            this.f9383e = new C0600e(j7, c0599d.a.d(j7), c0599d.f9366c, c0599d.f9367d, c0599d.f9368e, c0599d.f9369f);
        }
    }

    public abstract int C();

    public String D(int i7, int i8) {
        return t().subSequence(i7, i8).toString();
    }

    public boolean E() {
        int iC = C();
        CharSequence charSequenceT = t();
        if (iC >= charSequenceT.length() || iC == -1 || charSequenceT.charAt(iC) != ',') {
            return false;
        }
        this.f9380b++;
        return true;
    }

    public void F(char c2) {
        int i7 = this.f9380b;
        if (i7 > 0 && c2 == '\"') {
            try {
                this.f9380b = i7 - 1;
                String strL = l();
                this.f9380b = i7;
                if (kotlin.jvm.internal.l.a(strL, "null")) {
                    q(this.f9380b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f9380b = i7;
                throw th;
            }
        }
        String strU = b6.v.u(b6.v.h(c2));
        int i8 = this.f9380b;
        int i9 = i8 - 1;
        r(this, "Expected " + strU + ", but had '" + ((i8 == t().length() || i9 < 0) ? "EOF" : String.valueOf(t().charAt(i9))) + "' instead", i9, null, 4);
        throw null;
    }

    public int a(CharSequence charSequence, int i7) {
        int i8 = i7 + 4;
        if (i8 < charSequence.length()) {
            ((StringBuilder) this.f9383e).append((char) (s(charSequence, i7 + 3) + (s(charSequence, i7) << 12) + (s(charSequence, i7 + 1) << 8) + (s(charSequence, i7 + 2) << 4)));
            return i8;
        }
        this.f9380b = i7;
        o();
        if (this.f9380b + 4 < charSequence.length()) {
            return a(charSequence, this.f9380b);
        }
        r(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void b(int i7, int i8) {
        ((StringBuilder) this.f9383e).append(t(), i7, i8);
    }

    public abstract boolean c();

    public void d(int i7, String str) {
        if (t().length() - i7 < str.length()) {
            r(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (str.charAt(i8) != (t().charAt(i7 + i8) | ' ')) {
                r(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f9380b = str.length() + i7;
    }

    public abstract String e();

    public abstract byte f();

    public byte g(byte b4) {
        byte bF = f();
        if (bF == b4) {
            return bF;
        }
        String strU = b6.v.u(b4);
        int i7 = this.f9380b;
        int i8 = i7 - 1;
        r(this, "Expected " + strU + ", but had '" + ((i7 == t().length() || i8 < 0) ? "EOF" : String.valueOf(t().charAt(i8))) + "' instead", i8, null, 4);
        throw null;
    }

    public abstract void h(char c2);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b4, code lost:
    
        r(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ba, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c0, code lost:
    
        throw new D6.r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c1, code lost:
    
        if (r13 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c3, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c8, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01cb, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01cc, code lost:
    
        r(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01d2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d3, code lost:
    
        r(r22, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0111, code lost:
    
        r12 = r6;
        r(r22, "Unexpected symbol '" + r8 + "' in numeric literal", 0, r12, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012a, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012b, code lost:
    
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0133, code lost:
    
        if (r11 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0135, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0137, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0138, code lost:
    
        if (r1 == r11) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013a, code lost:
    
        if (r13 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013e, code lost:
    
        if (r1 == (r11 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0146, code lost:
    
        if (r19 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0148, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0154, code lost:
    
        if (t().charAt(r11) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0156, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0159, code lost:
    
        r(r22, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0161, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0162, code lost:
    
        r(r22, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0168, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0169, code lost:
    
        r22.f9380b = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x016b, code lost:
    
        if (r21 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016d, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0170, code lost:
    
        if (r20 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0172, code lost:
    
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x017c, code lost:
    
        if (r20 != true) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x017e, code lost:
    
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0183, code lost:
    
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0188, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x018e, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0196, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0198, code lost:
    
        r14 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x019a, code lost:
    
        r(r22, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long i() {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.i.i():long");
    }

    public String j() {
        String str = (String) this.f9382d;
        if (str == null) {
            return e();
        }
        kotlin.jvm.internal.l.c(str);
        this.f9382d = null;
        return str;
    }

    public String k(CharSequence charSequence, int i7, int i8) {
        kotlin.jvm.internal.l.f("source", charSequence);
        char cCharAt = charSequence.charAt(i8);
        boolean z7 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                b(i7, i8);
                int iZ = z(i8 + 1);
                if (iZ == -1) {
                    r(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int iA = iZ + 1;
                char cCharAt2 = t().charAt(iZ);
                if (cCharAt2 == 'u') {
                    iA = a(t(), iA);
                } else {
                    char c2 = cCharAt2 < 'u' ? C0734i.a[cCharAt2] : (char) 0;
                    if (c2 == 0) {
                        r(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                        throw null;
                    }
                    ((StringBuilder) this.f9383e).append(c2);
                }
                i7 = z(iA);
                if (i7 == -1) {
                    r(this, "Unexpected EOF", i7, null, 4);
                    throw null;
                }
            } else {
                i8++;
                if (i8 >= charSequence.length()) {
                    b(i7, i8);
                    i7 = z(i8);
                    if (i7 == -1) {
                        r(this, "Unexpected EOF", i7, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                    cCharAt = charSequence.charAt(i8);
                }
            }
            i8 = i7;
            z7 = true;
            cCharAt = charSequence.charAt(i8);
        }
        String strD = !z7 ? D(i7, i8) : n(i7, i8);
        this.f9380b = i8 + 1;
        return strD;
    }

    public String l() {
        String str = (String) this.f9382d;
        if (str != null) {
            kotlin.jvm.internal.l.c(str);
            this.f9382d = null;
            return str;
        }
        int iC = C();
        if (iC >= t().length() || iC == -1) {
            r(this, "EOF", iC, null, 4);
            throw null;
        }
        byte bH = b6.v.h(t().charAt(iC));
        if (bH == 1) {
            return j();
        }
        if (bH != 0) {
            r(this, "Expected beginning of the string, but got " + t().charAt(iC), 0, null, 6);
            throw null;
        }
        boolean z7 = false;
        while (b6.v.h(t().charAt(iC)) == 0) {
            iC++;
            if (iC >= t().length()) {
                b(this.f9380b, iC);
                int iZ = z(iC);
                if (iZ == -1) {
                    this.f9380b = iC;
                    return n(0, 0);
                }
                iC = iZ;
                z7 = true;
            }
        }
        String strD = !z7 ? D(this.f9380b, iC) : n(this.f9380b, iC);
        this.f9380b = iC;
        return strD;
    }

    public String m() {
        String strL = l();
        if (!kotlin.jvm.internal.l.a(strL, "null") || t().charAt(this.f9380b - 1) == '\"') {
            return strL;
        }
        r(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public String n(int i7, int i8) {
        b(i7, i8);
        StringBuilder sb = (StringBuilder) this.f9383e;
        String string = sb.toString();
        kotlin.jvm.internal.l.e("toString(...)", string);
        sb.setLength(0);
        return string;
    }

    public void p() {
        if (f() == 10) {
            return;
        }
        r(this, "Expected EOF after parsing, but had " + t().charAt(this.f9380b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public void q(int i7, String str, String str2) {
        kotlin.jvm.internal.l.f(ContentType.Message.TYPE, str);
        kotlin.jvm.internal.l.f("hint", str2);
        throw b6.v.c(i7, t(), str + " at path: " + ((C2.H) this.f9381c).j() + (str2.length() == 0 ? "" : "\n".concat(str2)));
    }

    public int s(CharSequence charSequence, int i7) {
        char cCharAt = charSequence.charAt(i7);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        r(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public abstract CharSequence t();

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append((Object) t());
                sb.append("', currentPosition=");
                return AbstractC0703b.l(sb, this.f9380b, ')');
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
    
        return A(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int u(V1.k r28, V1.r r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
        L6:
            java.lang.Object r3 = r0.f9383e
            V1.e r3 = (V1.C0600e) r3
            B1.AbstractC0015b.i(r3)
            long r4 = r3.f9374f
            long r6 = r3.f9375g
            long r8 = r3.f9376h
            long r6 = r6 - r4
            int r10 = r0.f9380b
            long r10 = (long) r10
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r7 = 0
            java.lang.Object r10 = r0.f9382d
            V1.h r10 = (V1.InterfaceC0603h) r10
            if (r6 > 0) goto L2a
            r0.f9383e = r7
            r10.l()
            int r1 = A(r1, r4, r2)
            return r1
        L2a:
            long r4 = r1.f9392n
            long r4 = r8 - r4
            r11 = 0
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 < 0) goto Lc6
            r13 = 262144(0x40000, double:1.295163E-318)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 > 0) goto Lc6
            int r4 = (int) r4
            r1.f(r4)
            r4 = 0
            r1.f9394p = r4
            long r4 = r3.f9370b
            V1.g r4 = r10.i(r1, r4)
            r5 = -3
            int r6 = r4.a
            if (r6 == r5) goto Lbc
            r5 = -2
            long r8 = r4.f9378b
            r15 = r11
            long r11 = r4.f9379c
            if (r6 == r5) goto L9b
            r4 = -1
            if (r6 == r4) goto L7c
            if (r6 != 0) goto L74
            long r3 = r1.f9392n
            long r3 = r11 - r3
            int r5 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r5 < 0) goto L6a
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 > 0) goto L6a
            int r3 = (int) r3
            r1.f(r3)
        L6a:
            r0.f9383e = r7
            r10.l()
            int r1 = A(r1, r11, r2)
            return r1
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid case"
            r1.<init>(r2)
            throw r1
        L7c:
            r3.f9373e = r8
            r3.f9375g = r11
            long r4 = r3.f9372d
            long r6 = r3.f9374f
            long r13 = r3.f9371c
            r17 = r4
            long r4 = r3.f9370b
            r15 = r4
            r21 = r6
            r19 = r8
            r23 = r11
            r25 = r13
            long r4 = V1.C0600e.a(r15, r17, r19, r21, r23, r25)
            r3.f9376h = r4
            goto L6
        L9b:
            r4 = r8
            r6 = r11
            r3.f9372d = r4
            r3.f9374f = r6
            long r8 = r3.f9373e
            long r10 = r3.f9375g
            long r12 = r3.f9371c
            long r14 = r3.f9370b
            r17 = r4
            r21 = r6
            r19 = r8
            r23 = r10
            r25 = r12
            r15 = r14
            long r4 = V1.C0600e.a(r15, r17, r19, r21, r23, r25)
            r3.f9376h = r4
            goto L6
        Lbc:
            r0.f9383e = r7
            r10.l()
            int r1 = A(r1, r8, r2)
            return r1
        Lc6:
            int r1 = A(r1, r8, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.i.u(V1.k, V1.r):int");
    }

    public abstract String w(String str, boolean z7);

    public byte x() {
        CharSequence charSequenceT = t();
        int i7 = this.f9380b;
        while (true) {
            int iZ = z(i7);
            if (iZ == -1) {
                this.f9380b = iZ;
                return (byte) 10;
            }
            char cCharAt = charSequenceT.charAt(iZ);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f9380b = iZ;
                return b6.v.h(cCharAt);
            }
            i7 = iZ + 1;
        }
    }

    public String y(boolean z7) {
        String strJ;
        byte bX = x();
        if (z7) {
            if (bX != 1 && bX != 0) {
                return null;
            }
            strJ = l();
        } else {
            if (bX != 1) {
                return null;
            }
            strJ = j();
        }
        this.f9382d = strJ;
        return strJ;
    }

    public abstract int z(int i7);

    public i() {
        C2.H h7 = new C2.H(5, (byte) 0);
        h7.f667m = new Object[8];
        int[] iArr = new int[8];
        for (int i7 = 0; i7 < 8; i7++) {
            iArr[i7] = -1;
        }
        h7.f668n = iArr;
        h7.f666l = -1;
        this.f9381c = h7;
        this.f9383e = new StringBuilder();
    }

    public void o() {
    }
}
