package G3;

import io.ktor.util.GzipHeaderFlags;
import java.io.EOFException;
import java.io.IOException;
import p.I0;
import w6.C2224i;
import w6.InterfaceC2226k;
import z5.C2496a;

/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: u, reason: collision with root package name */
    public static final w6.l f2810u;

    /* renamed from: v, reason: collision with root package name */
    public static final w6.l f2811v;

    /* renamed from: w, reason: collision with root package name */
    public static final w6.l f2812w;

    /* renamed from: x, reason: collision with root package name */
    public static final w6.l f2813x;

    /* renamed from: y, reason: collision with root package name */
    public static final w6.l f2814y;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC2226k f2815o;

    /* renamed from: p, reason: collision with root package name */
    public final C2224i f2816p;

    /* renamed from: q, reason: collision with root package name */
    public int f2817q;

    /* renamed from: r, reason: collision with root package name */
    public long f2818r;

    /* renamed from: s, reason: collision with root package name */
    public int f2819s;

    /* renamed from: t, reason: collision with root package name */
    public String f2820t;

    static {
        w6.l lVar = w6.l.f17157n;
        f2810u = I0.s("'\\");
        f2811v = I0.s("\"\\");
        f2812w = I0.s("{}[]:, \n\t\r\f/\\;#=");
        f2813x = I0.s("\n\r");
        f2814y = I0.s("*/");
    }

    public n(InterfaceC2226k interfaceC2226k) {
        this.f2807l = new int[32];
        this.f2808m = new String[32];
        this.f2809n = new int[32];
        this.f2817q = 0;
        this.f2815o = interfaceC2226k;
        this.f2816p = interfaceC2226k.a();
        L(6);
    }

    @Override // G3.m
    public final String H() {
        String strZ;
        int iY = this.f2817q;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 10) {
            strZ = f0();
        } else if (iY == 9) {
            strZ = e0(f2811v);
        } else if (iY == 8) {
            strZ = e0(f2810u);
        } else if (iY == 11) {
            strZ = this.f2820t;
            this.f2820t = null;
        } else if (iY == 16) {
            strZ = Long.toString(this.f2818r);
        } else {
            if (iY != 17) {
                throw new D6.r("Expected a string but was " + A6.b.t(J()) + " at path " + j());
            }
            long j7 = this.f2819s;
            C2224i c2224i = this.f2816p;
            c2224i.getClass();
            strZ = c2224i.Z(j7, C2496a.f19036b);
        }
        this.f2817q = 0;
        int[] iArr = this.f2809n;
        int i7 = this.f2806k - 1;
        iArr[i7] = iArr[i7] + 1;
        return strZ;
    }

    @Override // G3.m
    public final int J() {
        int iY = this.f2817q;
        if (iY == 0) {
            iY = Y();
        }
        switch (iY) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case GzipHeaderFlags.EXTRA /* 4 */:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override // G3.m
    public final int O(F.w wVar) throws EOFException, D1.a {
        int iY = this.f2817q;
        if (iY == 0) {
            iY = Y();
        }
        if (iY < 12 || iY > 15) {
            return -1;
        }
        if (iY == 15) {
            return Z(wVar, this.f2820t);
        }
        int iU = this.f2815o.U((w6.x) wVar.f2038m);
        if (iU != -1) {
            this.f2817q = 0;
            this.f2808m[this.f2806k - 1] = ((String[]) wVar.f2037l)[iU];
            return iU;
        }
        String str = this.f2808m[this.f2806k - 1];
        String strC0 = c0();
        int iZ = Z(wVar, strC0);
        if (iZ == -1) {
            this.f2817q = 15;
            this.f2820t = strC0;
            this.f2808m[this.f2806k - 1] = str;
        }
        return iZ;
    }

    @Override // G3.m
    public final void P() throws EOFException, D1.a {
        int iY = this.f2817q;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 14) {
            long jV = this.f2815o.V(f2812w);
            C2224i c2224i = this.f2816p;
            if (jV == -1) {
                jV = c2224i.f17156l;
            }
            c2224i.n(jV);
        } else if (iY == 13) {
            h0(f2811v);
        } else if (iY == 12) {
            h0(f2810u);
        } else if (iY != 15) {
            throw new D6.r("Expected a name but was " + A6.b.t(J()) + " at path " + j());
        }
        this.f2817q = 0;
        this.f2808m[this.f2806k - 1] = "null";
    }

    @Override // G3.m
    public final void T() throws EOFException, D1.a {
        int i7 = 0;
        do {
            int iY = this.f2817q;
            if (iY == 0) {
                iY = Y();
            }
            if (iY == 3) {
                L(1);
            } else if (iY == 1) {
                L(3);
            } else {
                if (iY == 4) {
                    i7--;
                    if (i7 < 0) {
                        throw new D6.r("Expected a value but was " + A6.b.t(J()) + " at path " + j());
                    }
                    this.f2806k--;
                } else if (iY == 2) {
                    i7--;
                    if (i7 < 0) {
                        throw new D6.r("Expected a value but was " + A6.b.t(J()) + " at path " + j());
                    }
                    this.f2806k--;
                } else {
                    C2224i c2224i = this.f2816p;
                    if (iY == 14 || iY == 10) {
                        long jV = this.f2815o.V(f2812w);
                        if (jV == -1) {
                            jV = c2224i.f17156l;
                        }
                        c2224i.n(jV);
                    } else if (iY == 9 || iY == 13) {
                        h0(f2811v);
                    } else if (iY == 8 || iY == 12) {
                        h0(f2810u);
                    } else if (iY == 17) {
                        c2224i.n(this.f2819s);
                    } else if (iY == 18) {
                        throw new D6.r("Expected a value but was " + A6.b.t(J()) + " at path " + j());
                    }
                }
                this.f2817q = 0;
            }
            i7++;
            this.f2817q = 0;
        } while (i7 != 0);
        int[] iArr = this.f2809n;
        int i8 = this.f2806k - 1;
        iArr[i8] = iArr[i8] + 1;
        this.f2808m[i8] = "null";
    }

    public final void X() throws D1.a {
        W("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x01b5, code lost:
    
        if (b0(r8) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01b8, code lost:
    
        if (r2 != 2) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01ba, code lost:
    
        if (r6 == 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01c0, code lost:
    
        if (r18 != Long.MIN_VALUE) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01c2, code lost:
    
        if (r7 == 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01c5, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01c9, code lost:
    
        if (r18 != r16) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01cb, code lost:
    
        if (r7 != 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01cd, code lost:
    
        if (r7 == 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01cf, code lost:
    
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d2, code lost:
    
        r9 = -r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01d5, code lost:
    
        r23.f2818r = r9;
        r12.n(r4);
        r11 = 16;
        r23.f2817q = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01e0, code lost:
    
        if (r2 == r3) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01e3, code lost:
    
        if (r2 == 4) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01e6, code lost:
    
        if (r2 != 7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01e8, code lost:
    
        r23.f2819s = r4;
        r11 = 17;
        r23.f2817q = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0146, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int Y() {
        /*
            Method dump skipped, instructions count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.n.Y():int");
    }

    public final int Z(F.w wVar, String str) {
        int length = ((String[]) wVar.f2037l).length;
        for (int i7 = 0; i7 < length; i7++) {
            if (str.equals(((String[]) wVar.f2037l)[i7])) {
                this.f2817q = 0;
                this.f2808m[this.f2806k - 1] = str;
                return i7;
            }
        }
        return -1;
    }

    public final int a0(F.w wVar, String str) {
        int length = ((String[]) wVar.f2037l).length;
        for (int i7 = 0; i7 < length; i7++) {
            if (str.equals(((String[]) wVar.f2037l)[i7])) {
                this.f2817q = 0;
                int[] iArr = this.f2809n;
                int i8 = this.f2806k - 1;
                iArr[i8] = iArr[i8] + 1;
                return i7;
            }
        }
        return -1;
    }

    @Override // G3.m
    public final void b() {
        int iY = this.f2817q;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 3) {
            L(1);
            this.f2809n[this.f2806k - 1] = 0;
            this.f2817q = 0;
        } else {
            throw new D6.r("Expected BEGIN_ARRAY but was " + A6.b.t(J()) + " at path " + j());
        }
    }

    public final boolean b0(int i7) throws D1.a {
        if (i7 == 9 || i7 == 10 || i7 == 12 || i7 == 13 || i7 == 32) {
            return false;
        }
        if (i7 != 35) {
            if (i7 == 44) {
                return false;
            }
            if (i7 != 47 && i7 != 61) {
                if (i7 == 123 || i7 == 125 || i7 == 58) {
                    return false;
                }
                if (i7 != 59) {
                    switch (i7) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        X();
        return false;
    }

    public final String c0() throws EOFException, D1.a {
        String strE0;
        int iY = this.f2817q;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 14) {
            strE0 = f0();
        } else if (iY == 13) {
            strE0 = e0(f2811v);
        } else if (iY == 12) {
            strE0 = e0(f2810u);
        } else {
            if (iY != 15) {
                throw new D6.r("Expected a name but was " + A6.b.t(J()) + " at path " + j());
            }
            strE0 = this.f2820t;
            this.f2820t = null;
        }
        this.f2817q = 0;
        this.f2808m[this.f2806k - 1] = strE0;
        return strE0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f2817q = 0;
        this.f2807l[0] = 8;
        this.f2806k = 1;
        this.f2816p.b();
        this.f2815o.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        r1.n(r3);
        r2 = G3.n.f2813x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r6 != 47) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r5.c(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        X();
        r10 = r1.v(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r10 == 42) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r10 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        r1.readByte();
        r1.readByte();
        r5 = r5.V(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r5 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r5 = r1.f17156l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        r1.n(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        r1.readByte();
        r1.readByte();
        r5 = r5.K(G3.n.f2814y);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if (r5 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        if (r3 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        r5 = r5 + r2.f17158k.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        r5 = r1.f17156l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        r1.n(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        if (r3 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        W("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
    
        if (r6 != 35) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
    
        X();
        r5 = r5.V(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
    
        if (r5 == (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
    
        r5 = r1.f17156l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009f, code lost:
    
        r1.n(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d0(boolean r13) throws java.io.EOFException, D1.a {
        /*
            r12 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            int r2 = r1 + 1
            long r3 = (long) r2
            w6.k r5 = r12.f2815o
            boolean r3 = r5.c(r3)
            if (r3 == 0) goto La8
            long r3 = (long) r1
            w6.i r1 = r12.f2816p
            byte r6 = r1.v(r3)
            r7 = 10
            if (r6 == r7) goto La5
            r7 = 32
            if (r6 == r7) goto La5
            r7 = 13
            if (r6 == r7) goto La5
            r7 = 9
            if (r6 != r7) goto L26
            goto La5
        L26:
            r1.n(r3)
            w6.l r2 = G3.n.f2813x
            r3 = -1
            r7 = 1
            r9 = 47
            if (r6 != r9) goto L8c
            r10 = 2
            boolean r10 = r5.c(r10)
            if (r10 != 0) goto L3d
            goto La4
        L3d:
            r12.X()
            byte r10 = r1.v(r7)
            r11 = 42
            if (r10 == r11) goto L61
            if (r10 == r9) goto L4b
            goto La4
        L4b:
            r1.readByte()
            r1.readByte()
            long r5 = r5.V(r2)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L5b
            long r5 = r5 + r7
            goto L5d
        L5b:
            long r5 = r1.f17156l
        L5d:
            r1.n(r5)
            goto L1
        L61:
            r1.readByte()
            r1.readByte()
            w6.l r2 = G3.n.f2814y
            long r5 = r5.K(r2)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L73
            r3 = 1
            goto L74
        L73:
            r3 = r0
        L74:
            if (r3 == 0) goto L7c
            byte[] r2 = r2.f17158k
            int r2 = r2.length
            long r7 = (long) r2
            long r5 = r5 + r7
            goto L7e
        L7c:
            long r5 = r1.f17156l
        L7e:
            r1.n(r5)
            if (r3 == 0) goto L85
            goto L1
        L85:
            java.lang.String r13 = "Unterminated comment"
            r12.W(r13)
            r13 = 0
            throw r13
        L8c:
            r9 = 35
            if (r6 != r9) goto La4
            r12.X()
            long r5 = r5.V(r2)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L9d
            long r5 = r5 + r7
            goto L9f
        L9d:
            long r5 = r1.f17156l
        L9f:
            r1.n(r5)
            goto L1
        La4:
            return r6
        La5:
            r1 = r2
            goto L2
        La8:
            if (r13 != 0) goto Lac
            r13 = -1
            return r13
        Lac:
            java.io.EOFException r13 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.n.d0(boolean):int");
    }

    @Override // G3.m
    public final void e() {
        int iY = this.f2817q;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 1) {
            L(3);
            this.f2817q = 0;
        } else {
            throw new D6.r("Expected BEGIN_OBJECT but was " + A6.b.t(J()) + " at path " + j());
        }
    }

    public final String e0(w6.l lVar) throws EOFException, D1.a {
        StringBuilder sb = null;
        while (true) {
            long jV = this.f2815o.V(lVar);
            if (jV == -1) {
                W("Unterminated string");
                throw null;
            }
            C2224i c2224i = this.f2816p;
            if (c2224i.v(jV) != 92) {
                if (sb == null) {
                    String strZ = c2224i.Z(jV, C2496a.f19036b);
                    c2224i.readByte();
                    return strZ;
                }
                sb.append(c2224i.Z(jV, C2496a.f19036b));
                c2224i.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(c2224i.Z(jV, C2496a.f19036b));
            c2224i.readByte();
            sb.append(g0());
        }
    }

    public final String f0() {
        long jV = this.f2815o.V(f2812w);
        C2224i c2224i = this.f2816p;
        if (jV == -1) {
            return c2224i.a0();
        }
        c2224i.getClass();
        return c2224i.Z(jV, C2496a.f19036b);
    }

    @Override // G3.m
    public final void g() {
        int iY = this.f2817q;
        if (iY == 0) {
            iY = Y();
        }
        if (iY != 4) {
            throw new D6.r("Expected END_ARRAY but was " + A6.b.t(J()) + " at path " + j());
        }
        int i7 = this.f2806k;
        this.f2806k = i7 - 1;
        int[] iArr = this.f2809n;
        int i8 = i7 - 2;
        iArr[i8] = iArr[i8] + 1;
        this.f2817q = 0;
    }

    public final char g0() throws EOFException, D1.a {
        int i7;
        InterfaceC2226k interfaceC2226k = this.f2815o;
        if (!interfaceC2226k.c(1L)) {
            W("Unterminated escape sequence");
            throw null;
        }
        C2224i c2224i = this.f2816p;
        byte b4 = c2224i.readByte();
        if (b4 == 10 || b4 == 34 || b4 == 39 || b4 == 47 || b4 == 92) {
            return (char) b4;
        }
        if (b4 == 98) {
            return '\b';
        }
        if (b4 == 102) {
            return '\f';
        }
        if (b4 == 110) {
            return '\n';
        }
        if (b4 == 114) {
            return '\r';
        }
        if (b4 == 116) {
            return '\t';
        }
        if (b4 != 117) {
            W("Invalid escape sequence: \\" + ((char) b4));
            throw null;
        }
        if (!interfaceC2226k.c(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + j());
        }
        char c2 = 0;
        for (int i8 = 0; i8 < 4; i8++) {
            byte bV = c2224i.v(i8);
            char c4 = (char) (c2 << 4);
            if (bV >= 48 && bV <= 57) {
                i7 = bV - 48;
            } else if (bV >= 97 && bV <= 102) {
                i7 = bV - 87;
            } else {
                if (bV < 65 || bV > 70) {
                    W("\\u".concat(c2224i.Z(4L, C2496a.f19036b)));
                    throw null;
                }
                i7 = bV - 55;
            }
            c2 = (char) (i7 + c4);
        }
        c2224i.n(4L);
        return c2;
    }

    public final void h0(w6.l lVar) throws EOFException, D1.a {
        while (true) {
            long jV = this.f2815o.V(lVar);
            if (jV == -1) {
                W("Unterminated string");
                throw null;
            }
            C2224i c2224i = this.f2816p;
            if (c2224i.v(jV) != 92) {
                c2224i.n(jV + 1);
                return;
            } else {
                c2224i.n(jV + 1);
                g0();
            }
        }
    }

    @Override // G3.m
    public final void i() {
        int iY = this.f2817q;
        if (iY == 0) {
            iY = Y();
        }
        if (iY != 2) {
            throw new D6.r("Expected END_OBJECT but was " + A6.b.t(J()) + " at path " + j());
        }
        int i7 = this.f2806k;
        int i8 = i7 - 1;
        this.f2806k = i8;
        this.f2808m[i8] = null;
        int[] iArr = this.f2809n;
        int i9 = i7 - 2;
        iArr[i9] = iArr[i9] + 1;
        this.f2817q = 0;
    }

    @Override // G3.m
    public final boolean m() {
        int iY = this.f2817q;
        if (iY == 0) {
            iY = Y();
        }
        return (iY == 2 || iY == 4 || iY == 18) ? false : true;
    }

    @Override // G3.m
    public final double s() throws NumberFormatException, D1.a {
        int iY = this.f2817q;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 16) {
            this.f2817q = 0;
            int[] iArr = this.f2809n;
            int i7 = this.f2806k - 1;
            iArr[i7] = iArr[i7] + 1;
            return this.f2818r;
        }
        if (iY == 17) {
            long j7 = this.f2819s;
            C2224i c2224i = this.f2816p;
            c2224i.getClass();
            this.f2820t = c2224i.Z(j7, C2496a.f19036b);
        } else if (iY == 9) {
            this.f2820t = e0(f2811v);
        } else if (iY == 8) {
            this.f2820t = e0(f2810u);
        } else if (iY == 10) {
            this.f2820t = f0();
        } else if (iY != 11) {
            throw new D6.r("Expected a double but was " + A6.b.t(J()) + " at path " + j());
        }
        this.f2817q = 11;
        try {
            double d4 = Double.parseDouble(this.f2820t);
            if (Double.isNaN(d4) || Double.isInfinite(d4)) {
                throw new D1.a("JSON forbids NaN and infinities: " + d4 + " at path " + j());
            }
            this.f2820t = null;
            this.f2817q = 0;
            int[] iArr2 = this.f2809n;
            int i8 = this.f2806k - 1;
            iArr2[i8] = iArr2[i8] + 1;
            return d4;
        } catch (NumberFormatException unused) {
            throw new D6.r("Expected a double but was " + this.f2820t + " at path " + j());
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f2815o + ")";
    }

    @Override // G3.m
    public final int v() throws NumberFormatException {
        int iY = this.f2817q;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 16) {
            long j7 = this.f2818r;
            int i7 = (int) j7;
            if (j7 == i7) {
                this.f2817q = 0;
                int[] iArr = this.f2809n;
                int i8 = this.f2806k - 1;
                iArr[i8] = iArr[i8] + 1;
                return i7;
            }
            throw new D6.r("Expected an int but was " + this.f2818r + " at path " + j());
        }
        if (iY == 17) {
            long j8 = this.f2819s;
            C2224i c2224i = this.f2816p;
            c2224i.getClass();
            this.f2820t = c2224i.Z(j8, C2496a.f19036b);
        } else if (iY == 9 || iY == 8) {
            String strE0 = iY == 9 ? e0(f2811v) : e0(f2810u);
            this.f2820t = strE0;
            try {
                int i9 = Integer.parseInt(strE0);
                this.f2817q = 0;
                int[] iArr2 = this.f2809n;
                int i10 = this.f2806k - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return i9;
            } catch (NumberFormatException unused) {
            }
        } else if (iY != 11) {
            throw new D6.r("Expected an int but was " + A6.b.t(J()) + " at path " + j());
        }
        this.f2817q = 11;
        try {
            double d4 = Double.parseDouble(this.f2820t);
            int i11 = (int) d4;
            if (i11 != d4) {
                throw new D6.r("Expected an int but was " + this.f2820t + " at path " + j());
            }
            this.f2820t = null;
            this.f2817q = 0;
            int[] iArr3 = this.f2809n;
            int i12 = this.f2806k - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return i11;
        } catch (NumberFormatException unused2) {
            throw new D6.r("Expected an int but was " + this.f2820t + " at path " + j());
        }
    }

    @Override // G3.m
    public final void x() {
        int iY = this.f2817q;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 7) {
            this.f2817q = 0;
            int[] iArr = this.f2809n;
            int i7 = this.f2806k - 1;
            iArr[i7] = iArr[i7] + 1;
            return;
        }
        throw new D6.r("Expected null but was " + A6.b.t(J()) + " at path " + j());
    }
}
