package b6;

import b1.AbstractC0703b;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public class K extends V1.i {

    /* renamed from: f, reason: collision with root package name */
    public final String f11000f;

    public K(String str) {
        kotlin.jvm.internal.l.f("source", str);
        this.f11000f = str;
    }

    @Override // V1.i
    public int C() {
        char cCharAt;
        int i7 = this.f9380b;
        if (i7 == -1) {
            return i7;
        }
        while (true) {
            String str = this.f11000f;
            if (i7 >= str.length() || !((cCharAt = str.charAt(i7)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i7++;
        }
        this.f9380b = i7;
        return i7;
    }

    @Override // V1.i
    public boolean c() {
        int i7 = this.f9380b;
        if (i7 == -1) {
            return false;
        }
        while (true) {
            String str = this.f11000f;
            if (i7 >= str.length()) {
                this.f9380b = i7;
                return false;
            }
            char cCharAt = str.charAt(i7);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f9380b = i7;
                return V1.i.v(cCharAt);
            }
            i7++;
        }
    }

    @Override // V1.i
    public final String e() {
        h('\"');
        int i7 = this.f9380b;
        String str = this.f11000f;
        int iD0 = AbstractC2510o.d0(str, '\"', i7, 4);
        if (iD0 == -1) {
            l();
            int i8 = this.f9380b;
            V1.i.r(this, AbstractC0703b.j("Expected quotation mark '\"', but had '", (i8 == str.length() || i8 < 0) ? "EOF" : String.valueOf(str.charAt(i8)), "' instead"), i8, null, 4);
            throw null;
        }
        for (int i9 = i7; i9 < iD0; i9++) {
            if (str.charAt(i9) == '\\') {
                return k(str, this.f9380b, i9);
            }
        }
        this.f9380b = iD0 + 1;
        String strSubstring = str.substring(i7, iD0);
        kotlin.jvm.internal.l.e("substring(...)", strSubstring);
        return strSubstring;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r4.f9380b = r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        return 10;
     */
    @Override // V1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte f() {
        /*
            r4 = this;
            int r0 = r4.f9380b
        L2:
            r1 = -1
            r2 = 10
            java.lang.String r3 = r4.f11000f
            if (r0 == r1) goto L2d
            int r1 = r3.length()
            if (r0 >= r1) goto L2d
            int r1 = r0 + 1
            char r0 = r3.charAt(r0)
            r3 = 32
            if (r0 == r3) goto L2b
            if (r0 == r2) goto L2b
            r2 = 13
            if (r0 == r2) goto L2b
            r2 = 9
            if (r0 != r2) goto L24
            goto L2b
        L24:
            r4.f9380b = r1
            byte r0 = b6.v.h(r0)
            return r0
        L2b:
            r0 = r1
            goto L2
        L2d:
            int r0 = r3.length()
            r4.f9380b = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.K.f():byte");
    }

    @Override // V1.i
    public void h(char c2) {
        int i7 = this.f9380b;
        if (i7 == -1) {
            F(c2);
            throw null;
        }
        while (true) {
            String str = this.f11000f;
            if (i7 >= str.length()) {
                this.f9380b = -1;
                F(c2);
                throw null;
            }
            int i8 = i7 + 1;
            char cCharAt = str.charAt(i7);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f9380b = i8;
                if (cCharAt == c2) {
                    return;
                }
                F(c2);
                throw null;
            }
            i7 = i8;
        }
    }

    @Override // V1.i
    public final CharSequence t() {
        return this.f11000f;
    }

    @Override // V1.i
    public final String w(String str, boolean z7) {
        kotlin.jvm.internal.l.f("keyToMatch", str);
        int i7 = this.f9380b;
        try {
            if (f() != 6) {
                return null;
            }
            if (!kotlin.jvm.internal.l.a(y(z7), str)) {
                return null;
            }
            this.f9382d = null;
            if (f() != 5) {
                return null;
            }
            return y(z7);
        } finally {
            this.f9380b = i7;
            this.f9382d = null;
        }
    }

    @Override // V1.i
    public final int z(int i7) {
        if (i7 < this.f11000f.length()) {
            return i7;
        }
        return -1;
    }
}
