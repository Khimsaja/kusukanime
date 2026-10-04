package io.ktor.http.cio.internals;

import D6.r;
import U3.c;
import U3.e;
import io.ktor.client.request.a;
import io.ktor.http.HttpMethod;
import io.ktor.http.cio.b;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000V\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a'\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u0001H\u0082\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\f*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\f*\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u001c\u0010\u0014\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001c\u0010\u001e\"\u0014\u0010 \u001a\u00020\u001f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010!\" \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\"\u001a\u0010,\u001a\u00020+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"", "", "start", "end", "hashCodeLowerCase", "(Ljava/lang/CharSequence;II)I", "other", "", "equalsLowerCase", "(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Z", "toLowerCase", "(I)I", "", "parseHexLong", "(Ljava/lang/CharSequence;)J", "parseDecLong", "parseDecLongWithCheck", "Lio/ktor/utils/io/ByteWriteChannel;", "value", "LO3/C;", "writeIntHex", "(Lio/ktor/utils/io/ByteWriteChannel;ILS3/c;)Ljava/lang/Object;", "s", "idx", "", "hexNumberFormatException", "(Ljava/lang/CharSequence;I)Ljava/lang/Void;", "cs", "numberFormatException", "(Ljava/lang/CharSequence;I)V", "(Ljava/lang/CharSequence;)V", "", "HTAB", "C", "Lio/ktor/http/cio/internals/AsciiCharTree;", "Lio/ktor/http/HttpMethod;", "DefaultHttpMethods", "Lio/ktor/http/cio/internals/AsciiCharTree;", "getDefaultHttpMethods", "()Lio/ktor/http/cio/internals/AsciiCharTree;", "", "HexTable", "[J", "", "HexLetterTable", "[B", "getHexLetterTable", "()[B", "ktor-http-cio"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CharsKt {
    private static final AsciiCharTree<HttpMethod> DefaultHttpMethods = AsciiCharTree.INSTANCE.build(HttpMethod.INSTANCE.getDefaultMethods(), new a(25), new b(4));
    public static final char HTAB = '\t';
    private static final byte[] HexLetterTable;
    private static final long[] HexTable;

    @e(c = "io.ktor.http.cio.internals.CharsKt", f = "Chars.kt", l = {110, 118}, m = "writeIntHex")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.http.cio.internals.CharsKt$writeIntHex$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CharsKt.writeIntHex(null, 0, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055 A[PHI: r7
      0x0055: PHI (r7v2 long) = (r7v1 long), (r7v0 long) binds: [B:18:0x0063, B:13:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        /*
            io.ktor.http.cio.internals.AsciiCharTree$Companion r0 = io.ktor.http.cio.internals.AsciiCharTree.INSTANCE
            io.ktor.http.HttpMethod$Companion r1 = io.ktor.http.HttpMethod.INSTANCE
            java.util.List r1 = r1.getDefaultMethods()
            io.ktor.client.request.a r2 = new io.ktor.client.request.a
            r3 = 25
            r2.<init>(r3)
            io.ktor.http.cio.b r3 = new io.ktor.http.cio.b
            r4 = 4
            r3.<init>(r4)
            io.ktor.http.cio.internals.AsciiCharTree r0 = r0.build(r1, r2, r3)
            io.ktor.http.cio.internals.CharsKt.DefaultHttpMethods = r0
            k4.g r0 = new k4.g
            r1 = 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            r0.<init>(r2, r1, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r4 = 10
            int r5 = P3.r.p(r0, r4)
            r1.<init>(r5)
            k4.f r0 = r0.iterator()
        L33:
            boolean r5 = r0.f12677m
            if (r5 == 0) goto L70
            int r5 = r0.a()
            r6 = 48
            if (r6 > r5) goto L48
            r6 = 58
            if (r5 >= r6) goto L48
            long r5 = (long) r5
            r7 = 48
            long r5 = r5 - r7
            goto L68
        L48:
            long r5 = (long) r5
            r7 = 97
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L59
            r9 = 102(0x66, double:5.04E-322)
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 > 0) goto L59
        L55:
            long r5 = r5 - r7
            long r7 = (long) r4
            long r5 = r5 + r7
            goto L68
        L59:
            r7 = 65
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L66
            r9 = 70
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 > 0) goto L66
            goto L55
        L66:
            r5 = -1
        L68:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r1.add(r5)
            goto L33
        L70:
            long[] r0 = P3.q.T0(r1)
            io.ktor.http.cio.internals.CharsKt.HexTable = r0
            k4.g r0 = new k4.g
            r1 = 15
            r0.<init>(r2, r1, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = P3.r.p(r0, r4)
            r1.<init>(r3)
            k4.f r0 = r0.iterator()
        L8a:
            boolean r3 = r0.f12677m
            if (r3 == 0) goto La6
            int r3 = r0.a()
            if (r3 >= r4) goto L98
            int r3 = r3 + 48
        L96:
            byte r3 = (byte) r3
            goto L9e
        L98:
            int r3 = r3 + 97
            char r3 = (char) r3
            int r3 = r3 - r4
            char r3 = (char) r3
            goto L96
        L9e:
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r1.add(r3)
            goto L8a
        La6:
            int r0 = r1.size()
            byte[] r0 = new byte[r0]
            java.util.Iterator r1 = r1.iterator()
        Lb0:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lc6
            java.lang.Object r3 = r1.next()
            java.lang.Number r3 = (java.lang.Number) r3
            byte r3 = r3.byteValue()
            int r4 = r2 + 1
            r0[r2] = r3
            r2 = r4
            goto Lb0
        Lc6:
            io.ktor.http.cio.internals.CharsKt.HexLetterTable = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.internals.CharsKt.<clinit>():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int DefaultHttpMethods$lambda$0(HttpMethod httpMethod) {
        l.f("it", httpMethod);
        return httpMethod.getValue().length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final char DefaultHttpMethods$lambda$1(HttpMethod httpMethod, int i7) {
        l.f("m", httpMethod);
        return httpMethod.getValue().charAt(i7);
    }

    public static final boolean equalsLowerCase(CharSequence charSequence, int i7, int i8, CharSequence charSequence2) {
        l.f("<this>", charSequence);
        l.f("other", charSequence2);
        if (i8 - i7 != charSequence2.length()) {
            return false;
        }
        for (int i9 = i7; i9 < i8; i9++) {
            int iCharAt = charSequence.charAt(i9);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt += 32;
            }
            int iCharAt2 = charSequence2.charAt(i9 - i7);
            if (65 <= iCharAt2 && iCharAt2 < 91) {
                iCharAt2 += 32;
            }
            if (iCharAt != iCharAt2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean equalsLowerCase$default(CharSequence charSequence, int i7, int i8, CharSequence charSequence2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = charSequence.length();
        }
        return equalsLowerCase(charSequence, i7, i8, charSequence2);
    }

    public static final AsciiCharTree<HttpMethod> getDefaultHttpMethods() {
        return DefaultHttpMethods;
    }

    public static final byte[] getHexLetterTable() {
        return HexLetterTable;
    }

    public static final int hashCodeLowerCase(CharSequence charSequence, int i7, int i8) {
        l.f("<this>", charSequence);
        int i9 = 0;
        while (i7 < i8) {
            int iCharAt = charSequence.charAt(i7);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt += 32;
            }
            i9 = (i9 * 31) + iCharAt;
            i7++;
        }
        return i9;
    }

    public static /* synthetic */ int hashCodeLowerCase$default(CharSequence charSequence, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = charSequence.length();
        }
        return hashCodeLowerCase(charSequence, i7, i8);
    }

    private static final Void hexNumberFormatException(CharSequence charSequence, int i7) {
        throw new NumberFormatException("Invalid HEX number: " + ((Object) charSequence) + ", wrong digit: " + charSequence.charAt(i7));
    }

    private static final void numberFormatException(CharSequence charSequence, int i7) {
        throw new NumberFormatException("Invalid number: " + ((Object) charSequence) + ", wrong digit: " + charSequence.charAt(i7) + " at position " + i7);
    }

    public static final long parseDecLong(CharSequence charSequence) {
        l.f("<this>", charSequence);
        int length = charSequence.length();
        if (length > 19) {
            numberFormatException(charSequence);
        }
        if (length == 19) {
            return parseDecLongWithCheck(charSequence);
        }
        long j7 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            long jCharAt = charSequence.charAt(i7) - 48;
            if (jCharAt < 0 || jCharAt > 9) {
                numberFormatException(charSequence, i7);
            }
            j7 = (j7 << 3) + (j7 << 1) + jCharAt;
        }
        return j7;
    }

    private static final long parseDecLongWithCheck(CharSequence charSequence) {
        int length = charSequence.length();
        long j7 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            long jCharAt = charSequence.charAt(i7) - 48;
            if (jCharAt < 0 || jCharAt > 9) {
                numberFormatException(charSequence, i7);
            }
            j7 = (j7 << 3) + (j7 << 1) + jCharAt;
            if (j7 < 0) {
                numberFormatException(charSequence);
            }
        }
        return j7;
    }

    public static final long parseHexLong(CharSequence charSequence) {
        l.f("<this>", charSequence);
        long[] jArr = HexTable;
        int length = charSequence.length();
        long j7 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int iCharAt = charSequence.charAt(i7) & 65535;
            long j8 = iCharAt < 255 ? jArr[iCharAt] : -1L;
            if (j8 == -1) {
                hexNumberFormatException(charSequence, i7);
                throw new r();
            }
            j7 = (j7 << 4) | j8;
        }
        return j7;
    }

    private static final int toLowerCase(int i7) {
        return (65 > i7 || i7 >= 91) ? i7 : i7 + 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object writeIntHex(io.ktor.utils.io.ByteWriteChannel r7, int r8, S3.c<? super O3.C> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.ktor.http.cio.internals.CharsKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.http.cio.internals.CharsKt$writeIntHex$1 r0 = (io.ktor.http.cio.internals.CharsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.http.cio.internals.CharsKt$writeIntHex$1 r0 = new io.ktor.http.cio.internals.CharsKt$writeIntHex$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 8
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L31
            if (r2 != r4) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            int r7 = r0.I$1
            int r8 = r0.I$0
            java.lang.Object r2 = r0.L$1
            byte[] r2 = (byte[]) r2
            java.lang.Object r5 = r0.L$0
            io.ktor.utils.io.ByteWriteChannel r5 = (io.ktor.utils.io.ByteWriteChannel) r5
            P3.r.Y(r9)
            r6 = r7
            r7 = r5
            goto L6a
        L43:
            P3.r.Y(r9)
            if (r8 <= 0) goto L8a
            byte[] r2 = io.ktor.http.cio.internals.CharsKt.HexLetterTable
            r9 = 0
        L4b:
            int r6 = r9 + 1
            if (r9 >= r3) goto L6a
            int r9 = r8 >>> 28
            int r8 = r8 << 4
            if (r9 == 0) goto L68
            r9 = r2[r9]
            r0.L$0 = r7
            r0.L$1 = r2
            r0.I$0 = r8
            r0.I$1 = r6
            r0.label = r5
            java.lang.Object r9 = io.ktor.utils.io.ByteWriteChannelOperationsKt.writeByte(r7, r9, r0)
            if (r9 != r1) goto L6a
            goto L84
        L68:
            r9 = r6
            goto L4b
        L6a:
            int r9 = r6 + 1
            if (r6 >= r3) goto L87
            int r5 = r8 >>> 28
            int r8 = r8 << 4
            r5 = r2[r5]
            r0.L$0 = r7
            r0.L$1 = r2
            r0.I$0 = r8
            r0.I$1 = r9
            r0.label = r4
            java.lang.Object r5 = io.ktor.utils.io.ByteWriteChannelOperationsKt.writeByte(r7, r5, r0)
            if (r5 != r1) goto L85
        L84:
            return r1
        L85:
            r6 = r9
            goto L6a
        L87:
            O3.C r7 = O3.C.a
            return r7
        L8a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Does only work for positive numbers"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.internals.CharsKt.writeIntHex(io.ktor.utils.io.ByteWriteChannel, int, S3.c):java.lang.Object");
    }

    private static final void numberFormatException(CharSequence charSequence) {
        throw new NumberFormatException("Invalid number " + ((Object) charSequence) + ": too large for Long type");
    }
}
