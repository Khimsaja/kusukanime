package G3;

import io.ktor.sse.ServerSentEventKt;
import java.io.IOException;
import java.util.Arrays;
import w6.C2224i;

/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: s, reason: collision with root package name */
    public static final String[] f2821s = new String[128];

    /* renamed from: q, reason: collision with root package name */
    public final C2224i f2822q;

    /* renamed from: r, reason: collision with root package name */
    public String f2823r;

    static {
        for (int i7 = 0; i7 <= 31; i7++) {
            f2821s[i7] = String.format("\\u%04x", Integer.valueOf(i7));
        }
        String[] strArr = f2821s;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public o(C2224i c2224i) {
        int[] iArr = new int[32];
        this.f2825l = iArr;
        this.f2826m = new String[32];
        this.f2827n = new int[32];
        this.f2829p = -1;
        this.f2822q = c2224i;
        this.f2824k = 1;
        iArr[0] = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void L(w6.C2224i r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = G3.o.f2821s
            r1 = 34
            r7.g0(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.l0(r8, r4, r3)
        L2e:
            r7.k0(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.l0(r8, r4, r2)
        L3b:
            r7.g0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.o.L(w6.i, java.lang.String):void");
    }

    public final void H(int i7, int i8, char c2) {
        int iM = m();
        if (iM != i8 && iM != i7) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f2823r != null) {
            throw new IllegalStateException("Dangling name: " + this.f2823r);
        }
        int i9 = this.f2824k;
        int i10 = ~this.f2829p;
        if (i9 == i10) {
            this.f2829p = i10;
            return;
        }
        int i11 = i9 - 1;
        this.f2824k = i11;
        this.f2826m[i11] = null;
        int[] iArr = this.f2827n;
        int i12 = i9 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f2822q.g0(c2);
    }

    public final void J(int i7, int i8, char c2) {
        int i9;
        int i10 = this.f2824k;
        int i11 = this.f2829p;
        if (i10 == i11 && ((i9 = this.f2825l[i10 - 1]) == i7 || i9 == i8)) {
            this.f2829p = ~i11;
            return;
        }
        x();
        int i12 = this.f2824k;
        int[] iArr = this.f2825l;
        if (i12 == iArr.length) {
            if (i12 == 256) {
                throw new D6.r("Nesting too deep at " + g() + ": circular reference?");
            }
            this.f2825l = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f2826m;
            this.f2826m = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f2827n;
            this.f2827n = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f2825l;
        int i13 = this.f2824k;
        this.f2824k = i13 + 1;
        iArr3[i13] = i7;
        this.f2827n[i13] = 0;
        this.f2822q.g0(c2);
    }

    public final void O() {
        if (this.f2823r != null) {
            int iM = m();
            C2224i c2224i = this.f2822q;
            if (iM == 5) {
                c2224i.g0(44);
            } else if (iM != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f2825l[this.f2824k - 1] = 4;
            L(c2224i, this.f2823r);
            this.f2823r = null;
        }
    }

    @Override // G3.p
    public final o b() {
        if (this.f2828o) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + g());
        }
        O();
        J(1, 2, '[');
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i7 = this.f2824k;
        if (i7 > 1 || (i7 == 1 && this.f2825l[i7 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f2824k = 0;
    }

    @Override // G3.p
    public final o e() {
        if (this.f2828o) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + g());
        }
        O();
        J(3, 5, '{');
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f2824k == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // G3.p
    public final o i(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f2824k == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int iM = m();
        if ((iM != 3 && iM != 5) || this.f2823r != null || this.f2828o) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f2823r = str;
        this.f2826m[this.f2824k - 1] = str;
        return this;
    }

    @Override // G3.p
    public final o j() {
        if (this.f2828o) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + g());
        }
        if (this.f2823r != null) {
            this.f2823r = null;
            return this;
        }
        x();
        this.f2822q.k0("null");
        int[] iArr = this.f2827n;
        int i7 = this.f2824k - 1;
        iArr[i7] = iArr[i7] + 1;
        return this;
    }

    @Override // G3.p
    public final o s(long j7) {
        if (this.f2828o) {
            this.f2828o = false;
            i(Long.toString(j7));
            return this;
        }
        O();
        x();
        this.f2822q.k0(Long.toString(j7));
        int[] iArr = this.f2827n;
        int i7 = this.f2824k - 1;
        iArr[i7] = iArr[i7] + 1;
        return this;
    }

    @Override // G3.p
    public final o v(String str) {
        if (str == null) {
            j();
            return this;
        }
        if (this.f2828o) {
            this.f2828o = false;
            i(str);
            return this;
        }
        O();
        x();
        L(this.f2822q, str);
        int[] iArr = this.f2827n;
        int i7 = this.f2824k - 1;
        iArr[i7] = iArr[i7] + 1;
        return this;
    }

    public final void x() {
        int iM = m();
        int i7 = 2;
        if (iM != 1) {
            C2224i c2224i = this.f2822q;
            if (iM == 2) {
                c2224i.g0(44);
            } else if (iM == 4) {
                c2224i.k0(ServerSentEventKt.COLON);
                i7 = 5;
            } else {
                if (iM == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                if (iM != 6) {
                    if (iM != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                i7 = 7;
            }
        }
        this.f2825l[this.f2824k - 1] = i7;
    }
}
