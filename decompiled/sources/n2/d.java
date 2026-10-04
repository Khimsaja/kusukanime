package n2;

import B1.AbstractC0015b;
import B1.B;
import B1.K;
import B1.r;
import H1.C0221b;
import V1.G;
import V1.H;
import V1.k;
import V1.n;
import V1.o;
import V1.p;
import X4.y;
import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import s2.InterfaceC1980h;
import y1.E;

/* loaded from: classes.dex */
public final class d implements n {

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f13283f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: g0, reason: collision with root package name */
    public static final byte[] f13284g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final byte[] f13285h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final byte[] f13286i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final UUID f13287j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final Map f13288k0;

    /* renamed from: A, reason: collision with root package name */
    public long f13289A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f13290B;

    /* renamed from: C, reason: collision with root package name */
    public long f13291C;

    /* renamed from: D, reason: collision with root package name */
    public long f13292D;

    /* renamed from: E, reason: collision with root package name */
    public long f13293E;

    /* renamed from: F, reason: collision with root package name */
    public r f13294F;

    /* renamed from: G, reason: collision with root package name */
    public r f13295G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f13296H;
    public boolean I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public long f13297K;

    /* renamed from: L, reason: collision with root package name */
    public long f13298L;

    /* renamed from: M, reason: collision with root package name */
    public int f13299M;

    /* renamed from: N, reason: collision with root package name */
    public int f13300N;

    /* renamed from: O, reason: collision with root package name */
    public int[] f13301O;

    /* renamed from: P, reason: collision with root package name */
    public int f13302P;

    /* renamed from: Q, reason: collision with root package name */
    public int f13303Q;

    /* renamed from: R, reason: collision with root package name */
    public int f13304R;

    /* renamed from: S, reason: collision with root package name */
    public int f13305S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f13306T;

    /* renamed from: U, reason: collision with root package name */
    public long f13307U;

    /* renamed from: V, reason: collision with root package name */
    public int f13308V;

    /* renamed from: W, reason: collision with root package name */
    public int f13309W;

    /* renamed from: X, reason: collision with root package name */
    public int f13310X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f13311Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f13312Z;
    public final C1562b a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f13313a0;

    /* renamed from: b, reason: collision with root package name */
    public final e f13314b;

    /* renamed from: b0, reason: collision with root package name */
    public int f13315b0;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f13316c;

    /* renamed from: c0, reason: collision with root package name */
    public byte f13317c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13318d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f13319d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13320e;

    /* renamed from: e0, reason: collision with root package name */
    public p f13321e0;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1980h f13322f;

    /* renamed from: g, reason: collision with root package name */
    public final B f13323g;

    /* renamed from: h, reason: collision with root package name */
    public final B f13324h;

    /* renamed from: i, reason: collision with root package name */
    public final B f13325i;

    /* renamed from: j, reason: collision with root package name */
    public final B f13326j;

    /* renamed from: k, reason: collision with root package name */
    public final B f13327k;

    /* renamed from: l, reason: collision with root package name */
    public final B f13328l;

    /* renamed from: m, reason: collision with root package name */
    public final B f13329m;

    /* renamed from: n, reason: collision with root package name */
    public final B f13330n;

    /* renamed from: o, reason: collision with root package name */
    public final B f13331o;

    /* renamed from: p, reason: collision with root package name */
    public final B f13332p;

    /* renamed from: q, reason: collision with root package name */
    public ByteBuffer f13333q;

    /* renamed from: r, reason: collision with root package name */
    public long f13334r;

    /* renamed from: s, reason: collision with root package name */
    public long f13335s;

    /* renamed from: t, reason: collision with root package name */
    public long f13336t;

    /* renamed from: u, reason: collision with root package name */
    public long f13337u;

    /* renamed from: v, reason: collision with root package name */
    public long f13338v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13339w;

    /* renamed from: x, reason: collision with root package name */
    public c f13340x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f13341y;

    /* renamed from: z, reason: collision with root package name */
    public int f13342z;

    static {
        int i7 = K.a;
        f13284g0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f13285h0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f13286i0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f13287j0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        A6.b.o(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        A6.b.o(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f13288k0 = Collections.unmodifiableMap(map);
    }

    public d(InterfaceC1980h interfaceC1980h, int i7) {
        C1562b c1562b = new C1562b();
        this.f13335s = -1L;
        this.f13336t = -9223372036854775807L;
        this.f13337u = -9223372036854775807L;
        this.f13338v = -9223372036854775807L;
        this.f13291C = -1L;
        this.f13292D = -1L;
        this.f13293E = -9223372036854775807L;
        this.a = c1562b;
        c1562b.f13229d = new y(21, this);
        this.f13322f = interfaceC1980h;
        this.f13318d = (i7 & 1) == 0;
        this.f13320e = (i7 & 2) == 0;
        this.f13314b = new e();
        this.f13316c = new SparseArray();
        this.f13325i = new B(4);
        this.f13326j = new B(ByteBuffer.allocate(4).putInt(-1).array());
        this.f13327k = new B(4);
        this.f13323g = new B(C1.r.a);
        this.f13324h = new B(4);
        this.f13328l = new B();
        this.f13329m = new B();
        this.f13330n = new B(8);
        this.f13331o = new B();
        this.f13332p = new B();
        this.f13301O = new int[1];
    }

    public static byte[] j(long j7, long j8, String str) {
        AbstractC0015b.c(j7 != -9223372036854775807L);
        int i7 = (int) (j7 / 3600000000L);
        long j9 = j7 - (i7 * 3600000000L);
        int i8 = (int) (j9 / 60000000);
        long j10 = j9 - (i8 * 60000000);
        int i9 = (int) (j10 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf((int) ((j10 - (i9 * 1000000)) / j8)));
        int i10 = K.a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // V1.n
    public final boolean b(o oVar) throws EOFException, InterruptedIOException {
        F5.o oVar2 = new F5.o(9, (byte) 0);
        k kVar = (k) oVar;
        long j7 = kVar.f9391m;
        long j8 = 1024;
        if (j7 != -1 && j7 <= 1024) {
            j8 = j7;
        }
        int i7 = (int) j8;
        B b4 = (B) oVar2.f2542m;
        kVar.h(b4.a, 0, 4, false);
        long jV = b4.v();
        oVar2.f2541l = 4;
        while (true) {
            if (jV != 440786851) {
                int i8 = oVar2.f2541l + 1;
                oVar2.f2541l = i8;
                if (i8 == i7) {
                    break;
                }
                kVar.h(b4.a, 0, 1, false);
                jV = ((jV << 8) & (-256)) | (b4.a[0] & 255);
            } else {
                long jS = oVar2.s(kVar);
                long j9 = oVar2.f2541l;
                if (jS != Long.MIN_VALUE && (j7 == -1 || j9 + jS < j7)) {
                    while (true) {
                        long j10 = oVar2.f2541l;
                        long j11 = j9 + jS;
                        if (j10 < j11) {
                            if (oVar2.s(kVar) == Long.MIN_VALUE) {
                                break;
                            }
                            long jS2 = oVar2.s(kVar);
                            if (jS2 < 0 || jS2 > 2147483647L) {
                                break;
                            }
                            if (jS2 != 0) {
                                int i9 = (int) jS2;
                                kVar.b(i9, false);
                                oVar2.f2541l += i9;
                            }
                        } else if (j10 == j11) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void c(int i7) {
        if (this.f13294F == null || this.f13295G == null) {
            throw E.a(null, "Element " + i7 + " must be in a Cues");
        }
    }

    @Override // V1.n
    public final void d(p pVar) {
        if (this.f13320e) {
            pVar = new C0221b(pVar, this.f13322f);
        }
        this.f13321e0 = pVar;
    }

    @Override // V1.n
    public final void e(long j7, long j8) {
        this.f13293E = -9223372036854775807L;
        this.J = 0;
        C1562b c1562b = this.a;
        c1562b.f13230e = 0;
        c1562b.f13227b.clear();
        e eVar = c1562b.f13228c;
        eVar.f13344b = 0;
        eVar.f13345c = 0;
        e eVar2 = this.f13314b;
        eVar2.f13344b = 0;
        eVar2.f13345c = 0;
        l();
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f13316c;
            if (i7 >= sparseArray.size()) {
                return;
            }
            H h7 = ((c) sparseArray.valueAt(i7)).f13252V;
            if (h7 != null) {
                h7.f9322b = false;
                h7.f9323c = 0;
            }
            i7++;
        }
    }

    public final void g(int i7) {
        if (this.f13340x != null) {
            return;
        }
        throw E.a(null, "Element " + i7 + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(n2.c r24, long r25, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.d.h(n2.c, long, int, int, int):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04e8 A[PHI: r41
      0x04e8: PHI (r41v39 java.lang.String) = 
      (r41v4 java.lang.String)
      (r41v5 java.lang.String)
      (r41v6 java.lang.String)
      (r41v7 java.lang.String)
      (r41v8 java.lang.String)
      (r41v9 java.lang.String)
      (r41v10 java.lang.String)
      (r41v11 java.lang.String)
      (r41v12 java.lang.String)
      (r41v13 java.lang.String)
      (r41v14 java.lang.String)
      (r41v15 java.lang.String)
      (r41v16 java.lang.String)
      (r41v17 java.lang.String)
      (r41v18 java.lang.String)
      (r41v19 java.lang.String)
      (r41v20 java.lang.String)
      (r41v21 java.lang.String)
      (r41v22 java.lang.String)
      (r41v23 java.lang.String)
      (r41v24 java.lang.String)
      (r41v25 java.lang.String)
      (r41v26 java.lang.String)
      (r41v27 java.lang.String)
      (r41v28 java.lang.String)
      (r41v29 java.lang.String)
      (r41v30 java.lang.String)
      (r41v31 java.lang.String)
      (r41v32 java.lang.String)
      (r41v33 java.lang.String)
      (r41v34 java.lang.String)
      (r41v35 java.lang.String)
      (r41v40 java.lang.String)
     binds: [B:376:0x06d0, B:372:0x06c5, B:368:0x06b9, B:364:0x06ae, B:360:0x06a3, B:356:0x0698, B:352:0x068d, B:348:0x0680, B:344:0x0670, B:340:0x0660, B:336:0x0650, B:332:0x0640, B:328:0x0630, B:324:0x0620, B:320:0x0610, B:316:0x0600, B:312:0x05f0, B:308:0x05e0, B:304:0x05d0, B:300:0x05c0, B:296:0x05b0, B:292:0x05a0, B:288:0x0590, B:284:0x0580, B:280:0x0570, B:276:0x0560, B:272:0x0550, B:268:0x0540, B:264:0x0530, B:260:0x0520, B:256:0x0510, B:252:0x0500, B:245:0x04e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0b2f  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0b46  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0b48  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0b59  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0b68  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x0d44  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x0d58  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x0d5b  */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v17, types: [V1.k] */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v46 */
    @Override // V1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(V1.o r52, V1.r r53) throws y1.E {
        /*
            Method dump skipped, instructions count: 5364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.d.i(V1.o, V1.r):int");
    }

    public final void k(k kVar, int i7) {
        B b4 = this.f13325i;
        if (b4.f289c >= i7) {
            return;
        }
        byte[] bArr = b4.a;
        if (bArr.length < i7) {
            b4.b(Math.max(bArr.length * 2, i7));
        }
        byte[] bArr2 = b4.a;
        int i8 = b4.f289c;
        kVar.a(bArr2, i8, i7 - i8, false);
        b4.E(i7);
    }

    public final void l() {
        this.f13308V = 0;
        this.f13309W = 0;
        this.f13310X = 0;
        this.f13311Y = false;
        this.f13312Z = false;
        this.f13313a0 = false;
        this.f13315b0 = 0;
        this.f13317c0 = (byte) 0;
        this.f13319d0 = false;
        this.f13328l.C(0);
    }

    public final long m(long j7) throws E {
        long j8 = this.f13336t;
        if (j8 == -9223372036854775807L) {
            throw E.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        int i7 = K.a;
        return K.L(j7, j8, 1000L, RoundingMode.DOWN);
    }

    public final int n(k kVar, c cVar, int i7, boolean z7) throws E {
        int iD;
        int iD2;
        int i8;
        if ("S_TEXT/UTF8".equals(cVar.f13259c)) {
            o(kVar, f13283f0, i7);
            int i9 = this.f13309W;
            l();
            return i9;
        }
        if ("S_TEXT/ASS".equals(cVar.f13259c)) {
            o(kVar, f13285h0, i7);
            int i10 = this.f13309W;
            l();
            return i10;
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f13259c)) {
            o(kVar, f13286i0, i7);
            int i11 = this.f13309W;
            l();
            return i11;
        }
        G g4 = cVar.f13256Z;
        boolean z8 = this.f13311Y;
        B b4 = this.f13328l;
        if (!z8) {
            boolean z9 = cVar.f13265i;
            B b7 = this.f13325i;
            if (z9) {
                this.f13304R &= -1073741825;
                if (!this.f13312Z) {
                    kVar.a(b7.a, 0, 1, false);
                    this.f13308V++;
                    byte b8 = b7.a[0];
                    if ((b8 & 128) == 128) {
                        throw E.a(null, "Extension bit is set in signal byte");
                    }
                    this.f13317c0 = b8;
                    this.f13312Z = true;
                }
                byte b9 = this.f13317c0;
                if ((b9 & 1) == 1) {
                    boolean z10 = (b9 & 2) == 2;
                    this.f13304R |= 1073741824;
                    if (!this.f13319d0) {
                        B b10 = this.f13330n;
                        kVar.a(b10.a, 0, 8, false);
                        this.f13308V += 8;
                        this.f13319d0 = true;
                        b7.a[0] = (byte) ((z10 ? 128 : 0) | 8);
                        b7.F(0);
                        g4.c(b7, 1, 1);
                        this.f13309W++;
                        b10.F(0);
                        g4.c(b10, 8, 1);
                        this.f13309W += 8;
                    }
                    if (z10) {
                        if (!this.f13313a0) {
                            kVar.a(b7.a, 0, 1, false);
                            this.f13308V++;
                            b7.F(0);
                            this.f13315b0 = b7.t();
                            this.f13313a0 = true;
                        }
                        int i12 = this.f13315b0 * 4;
                        b7.C(i12);
                        kVar.a(b7.a, 0, i12, false);
                        this.f13308V += i12;
                        short s7 = (short) ((this.f13315b0 / 2) + 1);
                        int i13 = (s7 * 6) + 2;
                        ByteBuffer byteBuffer = this.f13333q;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.f13333q = ByteBuffer.allocate(i13);
                        }
                        this.f13333q.position(0);
                        this.f13333q.putShort(s7);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i8 = this.f13315b0;
                            if (i14 >= i8) {
                                break;
                            }
                            int iX = b7.x();
                            if (i14 % 2 == 0) {
                                this.f13333q.putShort((short) (iX - i15));
                            } else {
                                this.f13333q.putInt(iX - i15);
                            }
                            i14++;
                            i15 = iX;
                        }
                        int i16 = (i7 - this.f13308V) - i15;
                        if (i8 % 2 == 1) {
                            this.f13333q.putInt(i16);
                        } else {
                            this.f13333q.putShort((short) i16);
                            this.f13333q.putInt(0);
                        }
                        byte[] bArrArray = this.f13333q.array();
                        B b11 = this.f13331o;
                        b11.D(bArrArray, i13);
                        g4.c(b11, i13, 1);
                        this.f13309W += i13;
                    }
                }
            } else {
                byte[] bArr = cVar.f13266j;
                if (bArr != null) {
                    b4.D(bArr, bArr.length);
                }
            }
            if ("A_OPUS".equals(cVar.f13259c) ? z7 : cVar.f13263g > 0) {
                this.f13304R |= 268435456;
                this.f13332p.C(0);
                int i17 = (b4.f289c + i7) - this.f13308V;
                b7.C(4);
                byte[] bArr2 = b7.a;
                bArr2[0] = (byte) ((i17 >> 24) & 255);
                bArr2[1] = (byte) ((i17 >> 16) & 255);
                bArr2[2] = (byte) ((i17 >> 8) & 255);
                bArr2[3] = (byte) (i17 & 255);
                g4.c(b7, 4, 2);
                this.f13309W += 4;
            }
            this.f13311Y = true;
        }
        int i18 = i7 + b4.f289c;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f13259c) && !"V_MPEGH/ISO/HEVC".equals(cVar.f13259c)) {
            if (cVar.f13252V != null) {
                AbstractC0015b.h(b4.f289c == 0);
                cVar.f13252V.c(kVar);
            }
            while (true) {
                int i19 = this.f13308V;
                if (i19 >= i18) {
                    break;
                }
                int i20 = i18 - i19;
                int iA = b4.a();
                if (iA > 0) {
                    iD2 = Math.min(i20, iA);
                    g4.c(b4, iD2, 0);
                } else {
                    iD2 = g4.d(kVar, i20, false);
                }
                this.f13308V += iD2;
                this.f13309W += iD2;
            }
        } else {
            B b12 = this.f13324h;
            byte[] bArr3 = b12.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i21 = cVar.f13257a0;
            int i22 = 4 - i21;
            while (this.f13308V < i18) {
                int i23 = this.f13310X;
                if (i23 == 0) {
                    int iMin = Math.min(i21, b4.a());
                    kVar.a(bArr3, i22 + iMin, i21 - iMin, false);
                    if (iMin > 0) {
                        b4.e(bArr3, i22, iMin);
                    }
                    this.f13308V += i21;
                    b12.F(0);
                    this.f13310X = b12.x();
                    B b13 = this.f13323g;
                    b13.F(0);
                    g4.c(b13, 4, 0);
                    this.f13309W += 4;
                } else {
                    int iA2 = b4.a();
                    if (iA2 > 0) {
                        iD = Math.min(i23, iA2);
                        g4.c(b4, iD, 0);
                    } else {
                        iD = g4.d(kVar, i23, false);
                    }
                    this.f13308V += iD;
                    this.f13309W += iD;
                    this.f13310X -= iD;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f13259c)) {
            B b14 = this.f13326j;
            b14.F(0);
            g4.c(b14, 4, 0);
            this.f13309W += 4;
        }
        int i24 = this.f13309W;
        l();
        return i24;
    }

    public final void o(k kVar, byte[] bArr, int i7) {
        int length = bArr.length + i7;
        B b4 = this.f13329m;
        byte[] bArr2 = b4.a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i7);
            b4.D(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        kVar.a(b4.a, bArr.length, i7, false);
        b4.F(0);
        b4.E(length);
    }

    @Override // V1.n
    public final void a() {
    }
}
