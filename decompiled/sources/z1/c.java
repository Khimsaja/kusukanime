package z1;

import B1.AbstractC0015b;
import B1.C0020g;
import B1.RunnableC0016c;
import C2.C0034g;
import D4.S;
import D6.r;
import G2.AbstractC0170g;
import G2.C;
import G2.C0168e;
import G2.P;
import H.L;
import H.M;
import H0.H;
import H4.AbstractC0249c;
import H4.AbstractC0251e;
import H4.AbstractC0252f;
import H4.C0250d;
import M0.s;
import M0.t;
import M0.u;
import N0.w;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import O3.D;
import O3.p;
import O3.q;
import O3.z;
import P3.F;
import P3.y;
import X.n;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import b1.AbstractC0703b;
import b6.C0733h;
import b6.G;
import b6.v;
import e2.C0818a;
import e4.InterfaceC0821a;
import f6.AbstractC0915m;
import h0.C0975U;
import h0.C0998u;
import io.ktor.http.ContentType;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import n0.AbstractC1530A;
import n0.C1537d;
import n0.C1538e;
import r4.AbstractC1880i;
import u4.InterfaceC2094J;
import u4.InterfaceC2097c;
import u4.InterfaceC2112s;
import u4.K;
import x4.C2266L;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z4.C2490b;
import z4.C2491c;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public abstract class c implements J0.e {

    /* renamed from: k, reason: collision with root package name */
    public static AudioManager f18949k;

    /* renamed from: l, reason: collision with root package name */
    public static Context f18950l;

    /* renamed from: m, reason: collision with root package name */
    public static C1538e f18951m;

    /* renamed from: n, reason: collision with root package name */
    public static C1538e f18952n;

    /* renamed from: o, reason: collision with root package name */
    public static C1538e f18953o;

    /* renamed from: p, reason: collision with root package name */
    public static C1538e f18954p;

    /* renamed from: q, reason: collision with root package name */
    public static C1538e f18955q;

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0146, code lost:
    
        if (r6 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014d, code lost:
    
        return !r4.AbstractC1880i.z(r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A(u4.InterfaceC2099e r13, u4.InterfaceC2097c r14) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.c.A(u4.e, u4.c):boolean");
    }

    public static O3.i B(O3.j jVar, InterfaceC0821a interfaceC0821a) {
        int iOrdinal = jVar.ordinal();
        if (iOrdinal == 0) {
            return new q(interfaceC0821a);
        }
        z zVar = z.a;
        if (iOrdinal == 1) {
            p pVar = new p();
            pVar.f7533k = interfaceC0821a;
            pVar.f7534l = zVar;
            return pVar;
        }
        if (iOrdinal != 2) {
            throw new r();
        }
        D d4 = new D();
        d4.f7511k = interfaceC0821a;
        d4.f7512l = zVar;
        return d4;
    }

    public static q C(InterfaceC0821a interfaceC0821a) {
        l.f("initializer", interfaceC0821a);
        return new q(interfaceC0821a);
    }

    public static final Object F(Object[] objArr, L2.e eVar, InterfaceC0821a interfaceC0821a, C0510p c0510p, int i7, int i8) {
        Object[] objArr2;
        Object obj;
        Object objC;
        if ((i8 & 2) != 0) {
            eVar = n.a;
        }
        L2.e eVar2 = eVar;
        int i9 = c0510p.f7128P;
        AbstractC0915m.k(36);
        String string = Integer.toString(i9, 36);
        l.e("toString(this, checkRadix(radix))", string);
        l.d("null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>", eVar2);
        X.j jVar = (X.j) c0510p.k(X.l.a);
        Object objH = c0510p.H();
        Object obj2 = C0502l.a;
        if (objH == obj2) {
            Object objInvoke = (jVar == null || (objC = jVar.c(string)) == null) ? null : ((e4.k) eVar2.f6046m).invoke(objC);
            if (objInvoke == null) {
                objInvoke = interfaceC0821a.invoke();
            }
            objArr2 = objArr;
            Object bVar = new X.b(eVar2, jVar, string, objInvoke, objArr2);
            c0510p.b0(bVar);
            objH = bVar;
        } else {
            objArr2 = objArr;
        }
        X.b bVar2 = (X.b) objH;
        Object objInvoke2 = Arrays.equals(objArr2, bVar2.f9673o) ? bVar2.f9672n : null;
        if (objInvoke2 == null) {
            objInvoke2 = interfaceC0821a.invoke();
        }
        boolean zH = c0510p.h(bVar2) | c0510p.h(eVar2) | c0510p.h(jVar) | c0510p.f(string) | c0510p.h(objInvoke2) | c0510p.h(objArr2);
        Object objH2 = c0510p.H();
        if (zH || objH2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = objInvoke2;
            Object aVar = new X.a(bVar2, eVar2, jVar, string, obj, objArr3);
            c0510p.b0(aVar);
            objH2 = aVar;
        } else {
            obj = objInvoke2;
        }
        C0486d.g((InterfaceC0821a) objH2, c0510p);
        return obj;
    }

    public static final String G(W4.e eVar) {
        l.f("<this>", eVar);
        String strB = eVar.b();
        l.e("asString(...)", strB);
        if (!Y4.n.a.contains(strB)) {
            int i7 = 0;
            while (true) {
                if (i7 < strB.length()) {
                    char cCharAt = strB.charAt(i7);
                    if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                        break;
                    }
                    i7++;
                } else if (strB.length() != 0 && Character.isJavaIdentifierStart(strB.codePointAt(0))) {
                    String strB2 = eVar.b();
                    l.e("asString(...)", strB2);
                    return strB2;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        String strB3 = eVar.b();
        l.e("asString(...)", strB3);
        sb.append("`".concat(strB3));
        sb.append('`');
        return sb.toString();
    }

    public static final String H(String str, String str2, InterfaceC0821a interfaceC0821a, InterfaceC0821a interfaceC0821a2, e4.k kVar) {
        l.f("lowerRendered", str);
        l.f("upperRendered", str2);
        l.f("escape", kVar);
        String str3 = (String) interfaceC0821a.invoke();
        String strJ = J(str, A6.b.h(str3, "Mutable"), str2, str3, A6.b.h(str3, "(Mutable)"));
        if (strJ != null) {
            return strJ;
        }
        String strJ2 = J(str, str3.concat("MutableMap.MutableEntry"), str2, str3.concat("Map.Entry"), str3.concat("(Mutable)Map.(Mutable)Entry"));
        if (strJ2 != null) {
            return strJ2;
        }
        String str4 = (String) interfaceC0821a2.invoke();
        String strJ3 = J(str, str4 + ((String) kVar.invoke("Array<")), str2, str4 + ((String) kVar.invoke("Array<out ")), str4 + ((String) kVar.invoke("Array<(out) ")));
        if (strJ3 != null) {
            return strJ3;
        }
        return null;
    }

    public static final String I(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            W4.e eVar = (W4.e) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(G(eVar));
        }
        return sb.toString();
    }

    public static final String J(String str, String str2, String str3, String str4, String str5) {
        l.f("lowerRendered", str);
        l.f("lowerPrefix", str2);
        l.f("upperRendered", str3);
        l.f("upperPrefix", str4);
        l.f("foldedPrefix", str5);
        if (!AbstractC2517v.T(str, str2, false) || !AbstractC2517v.T(str3, str4, false)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        l.e("substring(...)", strSubstring);
        String strSubstring2 = str3.substring(str4.length());
        l.e("substring(...)", strSubstring2);
        String strConcat = str5.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (!N(strSubstring, strSubstring2)) {
            return null;
        }
        return strConcat + '!';
    }

    public static final K4.c K(A2.b bVar, N4.b bVar2) {
        l.f("<this>", bVar);
        l.f("annotationsOwner", bVar2);
        return new K4.c(bVar, bVar2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.serialization.KSerializer L(e6.AbstractC0838b r5, l4.InterfaceC1444w r6, boolean r7) {
        /*
            l4.d r0 = Z5.AbstractC0632e0.h(r6)
            boolean r1 = r6.b()
            java.util.List r6 = r6.a()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = P3.r.p(r6, r3)
            r2.<init>(r3)
            java.util.Iterator r6 = r6.iterator()
        L1b:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L4c
            java.lang.Object r3 = r6.next()
            l4.z r3 = (l4.C1447z) r3
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.l.f(r4, r3)
            l4.w r3 = r3.f12759b
            if (r3 == 0) goto L34
            r2.add(r3)
            goto L1b
        L34:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Star projections in type arguments are not allowed, but had "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L4c:
            boolean r6 = r2.isEmpty()
            r3 = 0
            if (r6 == 0) goto L72
            boolean r6 = Z5.AbstractC0632e0.g(r0)
            if (r6 == 0) goto L5c
            e6.AbstractC0838b.a(r5, r0)
        L5c:
            Z5.p0 r6 = V5.k.a
            if (r1 != 0) goto L6b
            Z5.p0 r6 = V5.k.a
            kotlinx.serialization.KSerializer r6 = r6.D0(r0)
            if (r6 == 0) goto L69
            goto L95
        L69:
            r6 = r3
            goto L95
        L6b:
            Z5.p0 r6 = V5.k.f9497b
            kotlinx.serialization.KSerializer r6 = r6.D0(r0)
            goto L95
        L72:
            r6 = r5
            e6.a r6 = (e6.C0837a) r6
            r6.getClass()
            Z5.p0 r6 = V5.k.a
            java.lang.String r6 = "clazz"
            kotlin.jvm.internal.l.f(r6, r0)
            if (r1 != 0) goto L88
            L2.e r6 = V5.k.f9498c
            java.lang.Object r6 = r6.h1(r0, r2)
            goto L8e
        L88:
            L2.e r6 = V5.k.f9499d
            java.lang.Object r6 = r6.h1(r0, r2)
        L8e:
            boolean r4 = r6 instanceof O3.n
            if (r4 == 0) goto L93
            r6 = r3
        L93:
            kotlinx.serialization.KSerializer r6 = (kotlinx.serialization.KSerializer) r6
        L95:
            if (r6 == 0) goto L98
            return r6
        L98:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto Lb6
            kotlinx.serialization.KSerializer r6 = q0.c.P(r0)
            if (r6 != 0) goto Ld5
            e6.AbstractC0838b.a(r5, r0)
            boolean r5 = Z5.AbstractC0632e0.g(r0)
            if (r5 == 0) goto Lb4
            V5.d r5 = new V5.d
            r5.<init>(r0)
        Lb2:
            r6 = r5
            goto Ld5
        Lb4:
            r6 = r3
            goto Ld5
        Lb6:
            java.util.ArrayList r5 = q0.c.Q(r5, r2, r7)
            if (r5 != 0) goto Lbd
            goto Ldf
        Lbd:
            B3.q r6 = new B3.q
            r7 = 6
            r6.<init>(r7, r2)
            kotlinx.serialization.KSerializer r6 = q0.c.J(r0, r5, r6)
            if (r6 != 0) goto Ld5
            boolean r5 = Z5.AbstractC0632e0.g(r0)
            if (r5 == 0) goto Lb4
            V5.d r5 = new V5.d
            r5.<init>(r0)
            goto Lb2
        Ld5:
            if (r6 == 0) goto Ldf
            if (r1 == 0) goto Lde
            kotlinx.serialization.KSerializer r5 = n6.m.K(r6)
            return r5
        Lde:
            return r6
        Ldf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.c.L(e6.b, l4.w, boolean):kotlinx.serialization.KSerializer");
    }

    public static final ExtractedText M(w wVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = wVar.a.a;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j7 = wVar.f6896b;
        extractedText.selectionStart = H.e(j7);
        extractedText.selectionEnd = H.d(j7);
        extractedText.flags = !AbstractC2510o.X(wVar.a.a, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final boolean N(String str, String str2) {
        l.f("lower", str);
        l.f("upper", str2);
        if (str.equals(AbstractC2517v.R(str2, "?", ""))) {
            return true;
        }
        if (AbstractC2517v.L(str2, "?", false) && l.a(str.concat("?"), str2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(str);
        sb.append(")?");
        return l.a(sb.toString(), str2);
    }

    public static T0.c a() {
        return new T0.c(1.0f, 1.0f);
    }

    public static M0.z b(u uVar) {
        return new M0.z(uVar, new t(new s[0]));
    }

    public static final E3.b c() {
        Context context = f18950l;
        l.c(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        l.c(sharedPreferences);
        return new E3.b(false, 0, sharedPreferences);
    }

    public static final void d(a0.q qVar, W.a aVar, C0510p c0510p, int i7) {
        c0510p.T(-2105228848);
        if ((((c0510p.f(qVar) ? 4 : 2) | i7) & 19) == 18 && c0510p.y()) {
            c0510p.M();
        } else {
            L l7 = L.a;
            int i8 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            a0.q qVarC = a0.a.c(c0510p, qVar);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C0486d.R(c0510p, C2363j.f17875f, l7);
            C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0M);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p.f7127O || !l.a(c0510p.H(), Integer.valueOf(i8))) {
                AbstractC0703b.u(i8, c0510p, i8, c2361h);
            }
            C0486d.R(c0510p, C2363j.f17873d, qVarC);
            AbstractC0703b.v(6, aVar, c0510p, true);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new M(i7, 0, qVar, aVar);
        }
    }

    public static final String e(byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = i7;
        if (i14 < 0 || i8 > bArr.length || i14 > i8) {
            throw new IndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i14 + " endIndex=" + i8);
        }
        char[] cArr = new char[i8 - i14];
        int i15 = 0;
        while (i14 < i8) {
            byte b4 = bArr[i14];
            if (b4 >= 0) {
                i9 = i15 + 1;
                cArr[i15] = (char) b4;
                i14++;
                while (i14 < i8) {
                    byte b7 = bArr[i14];
                    if (b7 < 0) {
                        break;
                    }
                    i14++;
                    cArr[i9] = (char) b7;
                    i9++;
                }
            } else {
                if ((b4 >> 5) == -2) {
                    int i16 = i14 + 1;
                    if (i8 <= i16) {
                        i9 = i15 + 1;
                        cArr[i15] = (char) 65533;
                    } else {
                        byte b8 = bArr[i16];
                        if ((b8 & 192) == 128) {
                            int i17 = (b4 << 6) ^ (b8 ^ 3968);
                            if (i17 < 128) {
                                i9 = i15 + 1;
                                cArr[i15] = (char) 65533;
                            } else {
                                i9 = i15 + 1;
                                cArr[i15] = (char) i17;
                            }
                        } else {
                            i9 = i15 + 1;
                            cArr[i15] = (char) 65533;
                        }
                    }
                } else if ((b4 >> 4) == -2) {
                    int i18 = i14 + 2;
                    if (i8 <= i18) {
                        i9 = i15 + 1;
                        cArr[i15] = (char) 65533;
                        int i19 = i14 + 1;
                        i10 = (i8 <= i19 || (bArr[i19] & 192) != 128) ? 1 : 2;
                    } else {
                        byte b9 = bArr[i14 + 1];
                        if ((b9 & 192) == 128) {
                            byte b10 = bArr[i18];
                            if ((b10 & 192) == 128) {
                                int i20 = (b4 << 12) ^ ((b10 ^ (-123008)) ^ (b9 << 6));
                                if (i20 < 2048) {
                                    i9 = i15 + 1;
                                    cArr[i15] = (char) 65533;
                                } else if (55296 > i20 || i20 >= 57344) {
                                    i9 = i15 + 1;
                                    cArr[i15] = (char) i20;
                                } else {
                                    i9 = i15 + 1;
                                    cArr[i15] = (char) 65533;
                                }
                                i10 = 3;
                            } else {
                                i9 = i15 + 1;
                                cArr[i15] = (char) 65533;
                            }
                        } else {
                            i9 = i15 + 1;
                            cArr[i15] = (char) 65533;
                        }
                    }
                } else {
                    if ((b4 >> 3) == -2) {
                        int i21 = i14 + 3;
                        if (i8 <= i21) {
                            i11 = i15 + 1;
                            cArr[i15] = 65533;
                            int i22 = i14 + 1;
                            if (i8 > i22 && (bArr[i22] & 192) == 128) {
                                int i23 = i14 + 2;
                                i13 = (i8 <= i23 || (bArr[i23] & 192) != 128) ? 2 : 3;
                            }
                            i13 = 1;
                        } else {
                            byte b11 = bArr[i14 + 1];
                            if ((b11 & 192) == 128) {
                                byte b12 = bArr[i14 + 2];
                                if ((b12 & 192) == 128) {
                                    byte b13 = bArr[i21];
                                    if ((b13 & 192) == 128) {
                                        int i24 = (b4 << 18) ^ (((b13 ^ 3678080) ^ (b12 << 6)) ^ (b11 << 12));
                                        if (i24 > 1114111) {
                                            i11 = i15 + 1;
                                            cArr[i15] = 65533;
                                        } else if ((55296 > i24 || i24 >= 57344) && i24 >= 65536) {
                                            if (i24 != 65533) {
                                                cArr[i15] = (char) ((i24 >>> 10) + 55232);
                                                i12 = i15 + 2;
                                                cArr[i15 + 1] = (char) ((i24 & 1023) + 56320);
                                            } else {
                                                cArr[i15] = 65533;
                                                i12 = i15 + 1;
                                            }
                                            i11 = i12;
                                        } else {
                                            i11 = i15 + 1;
                                            cArr[i15] = 65533;
                                        }
                                        i13 = 4;
                                    } else {
                                        i11 = i15 + 1;
                                        cArr[i15] = 65533;
                                    }
                                } else {
                                    i11 = i15 + 1;
                                    cArr[i15] = 65533;
                                }
                            } else {
                                i11 = i15 + 1;
                                cArr[i15] = 65533;
                                i13 = 1;
                            }
                        }
                        i14 += i13;
                    } else {
                        i11 = i15 + 1;
                        cArr[i15] = 65533;
                        i14++;
                    }
                    i15 = i11;
                }
                i14 += i10;
            }
            i15 = i9;
        }
        return AbstractC2517v.H(cArr, 0, i15);
    }

    public static int h(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static void i(C c2, String str, List list, W.a aVar, int i7) {
        int i8 = i7 & 2;
        y yVar = y.f7779k;
        if (i8 != 0) {
            list = yVar;
        }
        P p7 = c2.f2625f;
        p7.getClass();
        H2.j jVar = new H2.j((H2.i) p7.b(AbstractC0170g.d(H2.i.class)), str, aVar);
        for (C0168e c0168e : list) {
            jVar.f2765c.put(c0168e.a, c0168e.f2696b);
        }
        c2.f2627h.add(jVar.a());
    }

    public static final void j(int i7, int i8) {
        if (i7 <= i8) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i7 + ") is greater than size (" + i8 + ").");
    }

    public static final Object m(a6.d dVar, KSerializer kSerializer, S5.n nVar) {
        l.f("<this>", dVar);
        l.f("deserializer", kSerializer);
        l.f("source", nVar);
        G gE = v.e(dVar, new L2.e(nVar), C0733h.f11021c.b(16384));
        try {
            Object objF = new b6.H(dVar, b6.M.f11002m, gE, kSerializer.getDescriptor(), null).f(kSerializer);
            gE.p();
            return objF;
        } finally {
            gE.H();
        }
    }

    public static boolean p(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i7 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i7 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final C2491c q(C2490b c2490b, W4.b bVar, T4.f fVar) {
        l.f("<this>", c2490b);
        l.f("classId", bVar);
        l.f("metadataVersion", fVar);
        C0034g c0034gA = c2490b.a(bVar, fVar);
        if (c0034gA != null) {
            return (C2491c) c0034gA.f741l;
        }
        return null;
    }

    public static final String r(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static synchronized AudioManager s(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                f18949k = null;
            }
            AudioManager audioManager = f18949k;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                C0020g c0020g = new C0020g();
                AbstractC0015b.o().execute(new RunnableC0016c(22, applicationContext, c0020g));
                c0020g.c();
                AudioManager audioManager2 = f18949k;
                audioManager2.getClass();
                return audioManager2;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService(ContentType.Audio.TYPE);
            f18949k = audioManager3;
            audioManager3.getClass();
            return audioManager3;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static C0.a t(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new C0.a(C0.g.a(view));
        }
        return null;
    }

    public static final C1538e u() {
        C1538e c1538e = f18951m;
        if (c1538e != null) {
            return c1538e;
        }
        C1537d c1537d = new C1537d("Filled.Bookmark", false);
        int i7 = AbstractC1530A.a;
        C0975U c0975u = new C0975U(C0998u.f11829b);
        S s7 = new S(7, false);
        s7.u(17.0f, 3.0f);
        s7.q(7.0f);
        s7.o(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        s7.s(5.0f, 21.0f);
        s7.t(7.0f, -3.0f);
        s7.t(7.0f, 3.0f);
        s7.z(5.0f);
        s7.o(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        s7.m();
        C1537d.a(c1537d, s7.f1530k, c0975u);
        C1538e c1538eB = c1537d.b();
        f18951m = c1538eB;
        return c1538eB;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    public static final String v(InterfaceC2112s interfaceC2112s) {
        W4.e eVar;
        InterfaceC2097c interfaceC2097cX = AbstractC1880i.z(interfaceC2112s) ? x(interfaceC2112s) : null;
        if (interfaceC2097cX != null) {
            InterfaceC2097c interfaceC2097cK = d5.e.k(interfaceC2097cX);
            if (interfaceC2097cK instanceof K) {
                AbstractC1880i.z(interfaceC2097cK);
                InterfaceC2097c interfaceC2097cB = d5.e.b(d5.e.k(interfaceC2097cK), C0250d.f3723n);
                if (interfaceC2097cB != null && (eVar = (W4.e) AbstractC0252f.a.get(d5.e.g(interfaceC2097cB))) != null) {
                    return eVar.b();
                }
            } else if (interfaceC2097cK instanceof C2266L) {
                int i7 = AbstractC0249c.f3720l;
                LinkedHashMap linkedHashMap = H4.G.f3708i;
                String strK = F.k((C2266L) interfaceC2097cK);
                W4.e eVar2 = strK == null ? null : (W4.e) linkedHashMap.get(strK);
                if (eVar2 != null) {
                    return eVar2.b();
                }
            }
        }
        return null;
    }

    public static final Object w(F0.i iVar, F0.t tVar) {
        Object obj = iVar.f2096k.get(tVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public static final InterfaceC2097c x(InterfaceC2097c interfaceC2097c) {
        l.f("<this>", interfaceC2097c);
        if (!H4.G.f3709j.contains(interfaceC2097c.getName()) && !AbstractC0252f.f3732d.contains(d5.e.k(interfaceC2097c).getName())) {
            return null;
        }
        if ((interfaceC2097c instanceof K) || (interfaceC2097c instanceof InterfaceC2094J)) {
            return d5.e.b(interfaceC2097c, C0250d.f3725p);
        }
        if (interfaceC2097c instanceof C2266L) {
            return d5.e.b(interfaceC2097c, C0250d.f3726q);
        }
        return null;
    }

    public static final InterfaceC2097c y(InterfaceC2097c interfaceC2097c) {
        l.f("<this>", interfaceC2097c);
        InterfaceC2097c interfaceC2097cX = x(interfaceC2097c);
        if (interfaceC2097cX != null) {
            return interfaceC2097cX;
        }
        int i7 = AbstractC0251e.f3729l;
        W4.e name = interfaceC2097c.getName();
        l.e("getName(...)", name);
        if (AbstractC0251e.b(name)) {
            return d5.e.b(interfaceC2097c, C0250d.f3727r);
        }
        return null;
    }

    public static final C1538e z() {
        C1538e c1538e = f18954p;
        if (c1538e != null) {
            return c1538e;
        }
        C1537d c1537d = new C1537d("Filled.Person", false);
        int i7 = AbstractC1530A.a;
        C0975U c0975u = new C0975U(C0998u.f11829b);
        S s7 = new S(7, false);
        s7.u(12.0f, 12.0f);
        s7.o(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        s7.w(-1.79f, -4.0f, -4.0f, -4.0f);
        s7.w(-4.0f, 1.79f, -4.0f, 4.0f);
        s7.w(1.79f, 4.0f, 4.0f, 4.0f);
        s7.m();
        s7.u(12.0f, 14.0f);
        s7.o(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        s7.A(2.0f);
        s7.r(16.0f);
        s7.A(-2.0f);
        s7.o(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        s7.m();
        C1537d.a(c1537d, s7.f1530k, c0975u);
        C1538e c1538eB = c1537d.b();
        f18954p = c1538eB;
        return c1538eB;
    }

    public abstract int D(int i7);

    public abstract int E(int i7);

    @Override // J0.e
    public int f(int i7) {
        return E(i7);
    }

    @Override // J0.e
    public int g(int i7) {
        return D(i7);
    }

    public y1.C k(C0818a c0818a) {
        ByteBuffer byteBuffer = c0818a.f2609o;
        byteBuffer.getClass();
        AbstractC0015b.c(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return l(c0818a, byteBuffer);
    }

    public abstract y1.C l(C0818a c0818a, ByteBuffer byteBuffer);

    @Override // J0.e
    public int n(int i7) {
        int iD = D(i7);
        if (iD == -1 || D(iD) == -1) {
            return -1;
        }
        return iD;
    }

    @Override // J0.e
    public int o(int i7) {
        int iE = E(i7);
        if (iE == -1 || E(iE) == -1) {
            return -1;
        }
        return iE;
    }
}
