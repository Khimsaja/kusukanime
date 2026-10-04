package f6;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import f1.AbstractC0868a;
import g0.AbstractC0932a;
import io.ktor.sse.ServerSentEventKt;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l4.EnumC1435n;
import l4.InterfaceC1428g;
import l4.InterfaceC1436o;
import l4.InterfaceC1443v;
import o4.AbstractC1694t;
import o4.C1669a0;
import o4.F0;
import o4.q0;
import o4.z0;
import o5.InterfaceC1702b;
import p4.InterfaceC1801g;
import s.Z;
import s0.C1955C;
import u4.InterfaceC2097c;
import u4.InterfaceC2099e;
import u4.Q;
import v4.InterfaceC2154b;
import w6.C2224i;
import y.InterfaceC2339t;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* renamed from: f6.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0915m {
    public static final boolean A(InterfaceC1702b interfaceC1702b, q5.e eVar) {
        kotlin.jvm.internal.l.f("c", interfaceC1702b);
        kotlin.jvm.internal.l.f("<this>", eVar);
        return interfaceC1702b.Q0(eVar);
    }

    public static boolean B(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static y5.i C(e4.n nVar) {
        y5.i iVar = new y5.i();
        iVar.f18388n = P3.r.q(iVar, iVar, nVar);
        return iVar;
    }

    public static z0 D(InterfaceC2097c interfaceC2097c, InterfaceC0821a interfaceC0821a) {
        if (interfaceC0821a != null) {
            return new z0(interfaceC2097c, interfaceC0821a);
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
    }

    public static final q5.e E(InterfaceC1702b interfaceC1702b, q5.d dVar) {
        kotlin.jvm.internal.l.f("c", interfaceC1702b);
        kotlin.jvm.internal.l.f("<this>", dVar);
        return interfaceC1702b.O0(dVar);
    }

    public static final int F(InterfaceC1702b interfaceC1702b, q5.h hVar) {
        kotlin.jvm.internal.l.f("c", interfaceC1702b);
        kotlin.jvm.internal.l.f("<this>", hVar);
        return interfaceC1702b.t(hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long G(int r14, java.lang.String r15) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.AbstractC0915m.G(int, java.lang.String):long");
    }

    public static void H(EditorInfo editorInfo, CharSequence charSequence) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            AbstractC0868a.f(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i7 >= 30) {
            AbstractC0868a.f(editorInfo, charSequence);
            return;
        }
        int i8 = editorInfo.initialSelStart;
        int i9 = editorInfo.initialSelEnd;
        int i10 = i8 > i9 ? i9 : i8;
        if (i8 <= i9) {
            i8 = i9;
        }
        int length = charSequence.length();
        if (i10 < 0 || i8 > length) {
            J(editorInfo, null, 0, 0);
            return;
        }
        int i11 = editorInfo.inputType & 4095;
        if (i11 == 129 || i11 == 225 || i11 == 18) {
            J(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            J(editorInfo, charSequence, i10, i8);
            return;
        }
        int i12 = i8 - i10;
        int i13 = i12 > 1024 ? 0 : i12;
        int i14 = 2048 - i13;
        int iMin = Math.min(charSequence.length() - i8, i14 - Math.min(i10, (int) (i14 * 0.8d)));
        int iMin2 = Math.min(i10, i14 - iMin);
        int i15 = i10 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i15))) {
            i15++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i8 + iMin) - 1))) {
            iMin--;
        }
        int i16 = iMin2 + i13;
        J(editorInfo, i13 != i12 ? TextUtils.concat(charSequence.subSequence(i15, i15 + iMin2), charSequence.subSequence(i8, iMin + i8)) : charSequence.subSequence(i15, i16 + iMin + i15), iMin2, i16);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void I(android.view.inputmethod.EditorInfo r4, boolean r5) {
        /*
            int r0 = f1.AbstractC0869b.a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 >= r1) goto L36
            r1 = 34
            if (r0 < r1) goto L39
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "CODENAME"
            kotlin.jvm.internal.l.e(r1, r0)
            java.lang.String r1 = "REL"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1c
            goto L39
        L1c:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r2 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.l.e(r2, r0)
            java.lang.String r3 = "VanillaIceCream"
            java.lang.String r1 = r3.toUpperCase(r1)
            kotlin.jvm.internal.l.e(r2, r1)
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto L39
        L36:
            k1.AbstractC1385a.a(r4, r5)
        L39:
            android.os.Bundle r0 = r4.extras
            if (r0 != 0) goto L44
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r4.extras = r0
        L44:
            android.os.Bundle r4 = r4.extras
            java.lang.String r0 = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED"
            r4.putBoolean(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.AbstractC0915m.I(android.view.inputmethod.EditorInfo, boolean):void");
    }

    public static void J(EditorInfo editorInfo, CharSequence charSequence, int i7, int i8) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i7);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i8);
    }

    public static final String K(String str) {
        kotlin.jvm.internal.l.f("<this>", str);
        int i7 = 0;
        int i8 = -1;
        if (!AbstractC2510o.W(str, ServerSentEventKt.COLON, false)) {
            try {
                String ascii = IDN.toASCII(str);
                kotlin.jvm.internal.l.e("toASCII(host)", ascii);
                Locale locale = Locale.US;
                kotlin.jvm.internal.l.e("US", locale);
                String lowerCase = ascii.toLowerCase(locale);
                kotlin.jvm.internal.l.e("this as java.lang.String).toLowerCase(locale)", lowerCase);
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i9 = 0; i9 < length; i9++) {
                    char cCharAt = lowerCase.charAt(i9);
                    if (kotlin.jvm.internal.l.g(cCharAt, 31) <= 0 || kotlin.jvm.internal.l.g(cCharAt, 127) >= 0 || AbstractC2510o.d0(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressN = (AbstractC2517v.T(str, "[", false) && AbstractC2517v.L(str, "]", false)) ? n(str, 1, str.length() - 1) : n(str, 0, str.length());
        if (inetAddressN == null) {
            return null;
        }
        byte[] address = inetAddressN.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressN.getHostAddress();
            }
            throw new AssertionError(A6.b.d('\'', "Invalid IPv6 address: '", str));
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < address.length) {
            int i12 = i10;
            while (i12 < 16 && address[i12] == 0 && address[i12 + 1] == 0) {
                i12 += 2;
            }
            int i13 = i12 - i10;
            if (i13 > i11 && i13 >= 4) {
                i8 = i10;
                i11 = i13;
            }
            i10 = i12 + 2;
        }
        C2224i c2224i = new C2224i();
        while (i7 < address.length) {
            if (i7 == i8) {
                c2224i.g0(58);
                i7 += i11;
                if (i7 == 16) {
                    c2224i.g0(58);
                }
            } else {
                if (i7 > 0) {
                    c2224i.g0(58);
                }
                byte b4 = address[i7];
                byte[] bArr = g6.b.a;
                c2224i.i0(((b4 & 255) << 8) | (address[i7 + 1] & 255));
                i7 += 2;
            }
        }
        return c2224i.a0();
    }

    public static final q5.h L(InterfaceC1702b interfaceC1702b, q5.d dVar) {
        kotlin.jvm.internal.l.f("c", interfaceC1702b);
        kotlin.jvm.internal.l.f("<this>", dVar);
        return interfaceC1702b.H0(dVar);
    }

    public static final q5.h M(InterfaceC1702b interfaceC1702b, q5.e eVar) {
        kotlin.jvm.internal.l.f("c", interfaceC1702b);
        kotlin.jvm.internal.l.f("<this>", eVar);
        return interfaceC1702b.y(eVar);
    }

    public static final long a(float f5, float f7) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
        int i7 = AbstractC0932a.f11654b;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(a0.q r36, x.v r37, x.C2229c r38, v.Z r39, s.C1928n r40, boolean r41, v.InterfaceC2128g r42, v.InterfaceC2126e r43, e4.k r44, O.C0510p r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.AbstractC0915m.b(a0.q, x.v, x.c, v.Z, s.n, boolean, v.g, v.e, e4.k, O.p, int, int):void");
    }

    public static final q5.g c(InterfaceC1702b interfaceC1702b, q5.e eVar) {
        kotlin.jvm.internal.l.f("c", interfaceC1702b);
        kotlin.jvm.internal.l.f("<this>", eVar);
        return interfaceC1702b.q(eVar);
    }

    public static final q5.e d(InterfaceC1702b interfaceC1702b, q5.d dVar) {
        kotlin.jvm.internal.l.f("c", interfaceC1702b);
        kotlin.jvm.internal.l.f("<this>", dVar);
        return interfaceC1702b.v(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0056 -> B:21:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(s0.C1953A r7, U3.a r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof s.Y
            if (r0 == 0) goto L13
            r0 = r8
            s.Y r0 = (s.Y) r0
            int r1 = r0.f15236m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15236m = r1
            goto L18
        L13:
            s.Y r0 = new s.Y
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15235l
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f15236m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            s0.A r7 = r0.f15234k
            P3.r.Y(r8)
            goto L59
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            P3.r.Y(r8)
            s0.C r8 = r7.f15428o
            s0.h r8 = r8.f15432B
            java.lang.Object r8 = r8.a
            int r2 = r8.size()
            r5 = r4
        L40:
            if (r5 >= r2) goto L75
            java.lang.Object r6 = r8.get(r5)
            s0.r r6 = (s0.r) r6
            boolean r6 = r6.f15471d
            if (r6 == 0) goto L72
        L4c:
            s0.i r8 = s0.EnumC1964i.f15463m
            r0.f15234k = r7
            r0.f15236m = r3
            java.lang.Object r8 = r7.b(r8, r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            s0.h r8 = (s0.C1963h) r8
            java.lang.Object r8 = r8.a
            int r2 = r8.size()
            r5 = r4
        L62:
            if (r5 >= r2) goto L75
            java.lang.Object r6 = r8.get(r5)
            s0.r r6 = (s0.r) r6
            boolean r6 = r6.f15471d
            if (r6 == 0) goto L6f
            goto L4c
        L6f:
            int r5 = r5 + 1
            goto L62
        L72:
            int r5 = r5 + 1
            goto L40
        L75:
            O3.C r7 = O3.C.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.AbstractC0915m.e(s0.A, U3.a):java.lang.Object");
    }

    public static final Object f(C1955C c1955c, e4.n nVar, S3.c cVar) {
        Object objG0 = c1955c.G0(new Z(cVar.getContext(), nVar, null), cVar);
        return objG0 == T3.a.f9048k ? objG0 : O3.C.a;
    }

    public static String g(String str, int i7, int i8) {
        if (i7 < 0) {
            return e3.c.B("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return e3.c.B("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IllegalArgumentException(AbstractC0703b.g(i8, "negative size: "));
    }

    public static void h(int i7, int i8) {
        String strB;
        if (i7 < 0 || i7 >= i8) {
            if (i7 < 0) {
                strB = e3.c.B("%s (%s) must not be negative", "index", Integer.valueOf(i7));
            } else {
                if (i8 < 0) {
                    throw new IllegalArgumentException(AbstractC0703b.g(i8, "negative size: "));
                }
                strB = e3.c.B("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i8));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static void i(int i7, int i8) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(g("index", i7, i8));
        }
    }

    public static void j(int i7, int i8, int i9) {
        if (i7 < 0 || i8 < i7 || i8 > i9) {
            throw new IndexOutOfBoundsException((i7 < 0 || i7 > i9) ? g("start index", i7, i9) : (i8 < 0 || i8 > i9) ? g("end index", i8, i9) : e3.c.B("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7)));
        }
    }

    public static void k(int i7) {
        if (2 > i7 || i7 >= 37) {
            StringBuilder sbP = AbstractC0703b.p(i7, "radix ", " was not in valid range ");
            sbP.append(new k4.g(2, 36, 1));
            throw new IllegalArgumentException(sbP.toString());
        }
    }

    public static final n5.H l(InterfaceC2099e interfaceC2099e, InterfaceC2099e interfaceC2099e2) {
        kotlin.jvm.internal.l.f("from", interfaceC2099e);
        kotlin.jvm.internal.l.f("to", interfaceC2099e2);
        interfaceC2099e.n().size();
        interfaceC2099e2.n().size();
        List listN = interfaceC2099e.n();
        kotlin.jvm.internal.l.e("getDeclaredTypeParameters(...)", listN);
        ArrayList arrayList = new ArrayList(P3.r.p(listN, 10));
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            arrayList.add(((Q) it.next()).v());
        }
        List listN2 = interfaceC2099e2.n();
        kotlin.jvm.internal.l.e("getDeclaredTypeParameters(...)", listN2);
        ArrayList arrayList2 = new ArrayList(P3.r.p(listN2, 10));
        Iterator it2 = listN2.iterator();
        while (it2.hasNext()) {
            n5.B bG = ((Q) it2.next()).g();
            kotlin.jvm.internal.l.e("getDefaultType(...)", bG);
            arrayList2.add(AbstractC0905c.e(bG));
        }
        return new n5.H(1, P3.E.r0(P3.q.Z0(arrayList, arrayList2)));
    }

    public static int m(String str, int i7, int i8, boolean z7) {
        while (i7 < i8) {
            char cCharAt = str.charAt(i7);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z7)) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cb, code lost:
    
        if (r7 == 16) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cd, code lost:
    
        if (r8 != (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d1, code lost:
    
        r0 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r0, r0);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e1, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.InetAddress n(java.lang.String r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.AbstractC0915m.n(java.lang.String, int, int):java.net.InetAddress");
    }

    public static final boolean o(char c2, char c4, boolean z7) {
        if (c2 == c4) {
            return true;
        }
        if (!z7) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c4);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static InterfaceC2154b p(v4.h hVar, W4.c cVar) {
        Object next;
        kotlin.jvm.internal.l.f("fqName", cVar);
        Iterator it = hVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.l.a(((InterfaceC2154b) next).a(), cVar)) {
                break;
            }
        }
        return (InterfaceC2154b) next;
    }

    public static final int q(int i7, Object obj, InterfaceC2339t interfaceC2339t) {
        int iA;
        return (obj == null || interfaceC2339t.b() == 0 || (i7 < interfaceC2339t.b() && obj.equals(interfaceC2339t.c(i7))) || (iA = interfaceC2339t.a(obj)) == -1) ? i7 : iA;
    }

    public static final int r(InterfaceC1801g interfaceC1801g) {
        kotlin.jvm.internal.l.f("<this>", interfaceC1801g);
        return interfaceC1801g.a().size();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [O3.i, java.lang.Object] */
    public static final Field s(InterfaceC1443v interfaceC1443v) {
        kotlin.jvm.internal.l.f("<this>", interfaceC1443v);
        q0 q0VarC = F0.c(interfaceC1443v);
        if (q0VarC != null) {
            return (Field) q0VarC.f13741v.getValue();
        }
        return null;
    }

    public static final Method t(InterfaceC1428g interfaceC1428g) {
        InterfaceC1801g interfaceC1801gF;
        kotlin.jvm.internal.l.f("<this>", interfaceC1428g);
        AbstractC1694t abstractC1694tA = F0.a(interfaceC1428g);
        Member memberB = (abstractC1694tA == null || (interfaceC1801gF = abstractC1694tA.f()) == null) ? null : interfaceC1801gF.b();
        if (memberB instanceof Method) {
            return (Method) memberB;
        }
        return null;
    }

    public static long u(double d4) {
        if (!y(d4)) {
            throw new IllegalArgumentException("not a normal value");
        }
        int exponent = Math.getExponent(d4);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d4) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static final q5.d v(InterfaceC1702b interfaceC1702b, n5.Q q6) {
        kotlin.jvm.internal.l.f("c", interfaceC1702b);
        kotlin.jvm.internal.l.f("<this>", q6);
        return interfaceC1702b.V(q6);
    }

    public static final ArrayList w(InterfaceC1428g interfaceC1428g) {
        kotlin.jvm.internal.l.f("<this>", interfaceC1428g);
        List parameters = interfaceC1428g.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((C1669a0) ((InterfaceC1436o) obj)).f13676m == EnumC1435n.f12756n) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static boolean x(v4.h hVar, W4.c cVar) {
        kotlin.jvm.internal.l.f("fqName", cVar);
        return hVar.l(cVar) != null;
    }

    public static boolean y(double d4) {
        return Math.getExponent(d4) <= 1023;
    }

    public static final boolean z(InterfaceC1702b interfaceC1702b, q5.e eVar) {
        kotlin.jvm.internal.l.f("c", interfaceC1702b);
        return interfaceC1702b.R0(eVar);
    }
}
