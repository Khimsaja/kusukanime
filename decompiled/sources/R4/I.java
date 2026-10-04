package R4;

import X4.AbstractC0605b;
import X4.AbstractC0613j;
import X4.AbstractC0614k;
import X4.AbstractC0618o;
import io.ktor.utils.io.ByteChannelKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class I extends AbstractC0614k {

    /* renamed from: A, reason: collision with root package name */
    public int f8178A;

    /* renamed from: B, reason: collision with root package name */
    public int f8179B;

    /* renamed from: C, reason: collision with root package name */
    public List f8180C;

    /* renamed from: D, reason: collision with root package name */
    public List f8181D;

    /* renamed from: E, reason: collision with root package name */
    public List f8182E;

    /* renamed from: F, reason: collision with root package name */
    public List f8183F;

    /* renamed from: G, reason: collision with root package name */
    public List f8184G;

    /* renamed from: H, reason: collision with root package name */
    public List f8185H;
    public List I;
    public List J;

    /* renamed from: n, reason: collision with root package name */
    public int f8186n;

    /* renamed from: o, reason: collision with root package name */
    public int f8187o;

    /* renamed from: p, reason: collision with root package name */
    public int f8188p;

    /* renamed from: q, reason: collision with root package name */
    public int f8189q;

    /* renamed from: r, reason: collision with root package name */
    public U f8190r;

    /* renamed from: s, reason: collision with root package name */
    public int f8191s;

    /* renamed from: t, reason: collision with root package name */
    public List f8192t;

    /* renamed from: u, reason: collision with root package name */
    public U f8193u;

    /* renamed from: v, reason: collision with root package name */
    public int f8194v;

    /* renamed from: w, reason: collision with root package name */
    public List f8195w;

    /* renamed from: x, reason: collision with root package name */
    public List f8196x;

    /* renamed from: y, reason: collision with root package name */
    public List f8197y;

    /* renamed from: z, reason: collision with root package name */
    public c0 f8198z;

    public static I h() {
        I i7 = new I();
        i7.f8187o = 518;
        i7.f8188p = 2054;
        U u5 = U.f8290D;
        i7.f8190r = u5;
        List list = Collections.EMPTY_LIST;
        i7.f8192t = list;
        i7.f8193u = u5;
        i7.f8195w = list;
        i7.f8196x = list;
        i7.f8197y = list;
        i7.f8198z = c0.f8395x;
        i7.f8180C = list;
        i7.f8181D = list;
        i7.f8182E = list;
        i7.f8183F = list;
        i7.f8184G = list;
        i7.f8185H = list;
        i7.I = list;
        i7.J = list;
        return i7;
    }

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        J jG = g();
        if (jG.a()) {
            return jG;
        }
        throw new D6.r();
    }

    public final Object clone() {
        I iH = h();
        iH.i(g());
        return iH;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // X4.AbstractC0613j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X4.AbstractC0613j d(X4.C0609f r3, X4.C0611h r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            R4.a r1 = R4.J.f8200N     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            R4.J r1 = new R4.J     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> Lf
            R4.J r4 = (R4.J) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.i(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.I.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        i((J) abstractC0618o);
        return this;
    }

    public final J g() {
        J j7 = new J(this);
        int i7 = this.f8186n;
        int i8 = (i7 & 1) != 1 ? 0 : 1;
        j7.f8213n = this.f8187o;
        if ((i7 & 2) == 2) {
            i8 |= 2;
        }
        j7.f8214o = this.f8188p;
        if ((i7 & 4) == 4) {
            i8 |= 4;
        }
        j7.f8215p = this.f8189q;
        if ((i7 & 8) == 8) {
            i8 |= 8;
        }
        j7.f8216q = this.f8190r;
        if ((i7 & 16) == 16) {
            i8 |= 16;
        }
        j7.f8217r = this.f8191s;
        if ((i7 & 32) == 32) {
            this.f8192t = Collections.unmodifiableList(this.f8192t);
            this.f8186n &= -33;
        }
        j7.f8218s = this.f8192t;
        if ((i7 & 64) == 64) {
            i8 |= 32;
        }
        j7.f8219t = this.f8193u;
        if ((i7 & 128) == 128) {
            i8 |= 64;
        }
        j7.f8220u = this.f8194v;
        if ((this.f8186n & 256) == 256) {
            this.f8195w = Collections.unmodifiableList(this.f8195w);
            this.f8186n &= -257;
        }
        j7.f8221v = this.f8195w;
        if ((this.f8186n & 512) == 512) {
            this.f8196x = Collections.unmodifiableList(this.f8196x);
            this.f8186n &= -513;
        }
        j7.f8222w = this.f8196x;
        if ((this.f8186n & 1024) == 1024) {
            this.f8197y = Collections.unmodifiableList(this.f8197y);
            this.f8186n &= -1025;
        }
        j7.f8224y = this.f8197y;
        if ((i7 & 2048) == 2048) {
            i8 |= 128;
        }
        j7.f8225z = this.f8198z;
        if ((i7 & 4096) == 4096) {
            i8 |= 256;
        }
        j7.f8201A = this.f8178A;
        if ((i7 & 8192) == 8192) {
            i8 |= 512;
        }
        j7.f8202B = this.f8179B;
        if ((this.f8186n & 16384) == 16384) {
            this.f8180C = Collections.unmodifiableList(this.f8180C);
            this.f8186n &= -16385;
        }
        j7.f8203C = this.f8180C;
        if ((this.f8186n & 32768) == 32768) {
            this.f8181D = Collections.unmodifiableList(this.f8181D);
            this.f8186n &= -32769;
        }
        j7.f8204D = this.f8181D;
        if ((this.f8186n & 65536) == 65536) {
            this.f8182E = Collections.unmodifiableList(this.f8182E);
            this.f8186n &= -65537;
        }
        j7.f8205E = this.f8182E;
        if ((this.f8186n & 131072) == 131072) {
            this.f8183F = Collections.unmodifiableList(this.f8183F);
            this.f8186n &= -131073;
        }
        j7.f8206F = this.f8183F;
        if ((this.f8186n & 262144) == 262144) {
            this.f8184G = Collections.unmodifiableList(this.f8184G);
            this.f8186n &= -262145;
        }
        j7.f8207G = this.f8184G;
        if ((this.f8186n & 524288) == 524288) {
            this.f8185H = Collections.unmodifiableList(this.f8185H);
            this.f8186n &= -524289;
        }
        j7.f8208H = this.f8185H;
        if ((this.f8186n & ByteChannelKt.CHANNEL_MAX_SIZE) == 1048576) {
            this.I = Collections.unmodifiableList(this.I);
            this.f8186n &= -1048577;
        }
        j7.I = this.I;
        if ((this.f8186n & 2097152) == 2097152) {
            this.J = Collections.unmodifiableList(this.J);
            this.f8186n &= -2097153;
        }
        j7.J = this.J;
        j7.f8212m = i8;
        return j7;
    }

    public final void i(J j7) {
        c0 c0Var;
        U u5;
        U u7;
        if (j7 == J.f8199M) {
            return;
        }
        int i7 = j7.f8212m;
        if ((i7 & 1) == 1) {
            int i8 = j7.f8213n;
            this.f8186n = 1 | this.f8186n;
            this.f8187o = i8;
        }
        if ((i7 & 2) == 2) {
            int i9 = j7.f8214o;
            this.f8186n = 2 | this.f8186n;
            this.f8188p = i9;
        }
        if ((i7 & 4) == 4) {
            int i10 = j7.f8215p;
            this.f8186n = 4 | this.f8186n;
            this.f8189q = i10;
        }
        if ((i7 & 8) == 8) {
            U u8 = j7.f8216q;
            if ((this.f8186n & 8) != 8 || (u7 = this.f8190r) == U.f8290D) {
                this.f8190r = u8;
            } else {
                T tR = U.r(u7);
                tR.i(u8);
                this.f8190r = tR.g();
            }
            this.f8186n |= 8;
        }
        if ((j7.f8212m & 16) == 16) {
            int i11 = j7.f8217r;
            this.f8186n = 16 | this.f8186n;
            this.f8191s = i11;
        }
        if (!j7.f8218s.isEmpty()) {
            if (this.f8192t.isEmpty()) {
                this.f8192t = j7.f8218s;
                this.f8186n &= -33;
            } else {
                if ((this.f8186n & 32) != 32) {
                    this.f8192t = new ArrayList(this.f8192t);
                    this.f8186n |= 32;
                }
                this.f8192t.addAll(j7.f8218s);
            }
        }
        if ((j7.f8212m & 32) == 32) {
            U u9 = j7.f8219t;
            if ((this.f8186n & 64) != 64 || (u5 = this.f8193u) == U.f8290D) {
                this.f8193u = u9;
            } else {
                T tR2 = U.r(u5);
                tR2.i(u9);
                this.f8193u = tR2.g();
            }
            this.f8186n |= 64;
        }
        if ((j7.f8212m & 64) == 64) {
            int i12 = j7.f8220u;
            this.f8186n |= 128;
            this.f8194v = i12;
        }
        if (!j7.f8221v.isEmpty()) {
            if (this.f8195w.isEmpty()) {
                this.f8195w = j7.f8221v;
                this.f8186n &= -257;
            } else {
                if ((this.f8186n & 256) != 256) {
                    this.f8195w = new ArrayList(this.f8195w);
                    this.f8186n |= 256;
                }
                this.f8195w.addAll(j7.f8221v);
            }
        }
        if (!j7.f8222w.isEmpty()) {
            if (this.f8196x.isEmpty()) {
                this.f8196x = j7.f8222w;
                this.f8186n &= -513;
            } else {
                if ((this.f8186n & 512) != 512) {
                    this.f8196x = new ArrayList(this.f8196x);
                    this.f8186n |= 512;
                }
                this.f8196x.addAll(j7.f8222w);
            }
        }
        if (!j7.f8224y.isEmpty()) {
            if (this.f8197y.isEmpty()) {
                this.f8197y = j7.f8224y;
                this.f8186n &= -1025;
            } else {
                if ((this.f8186n & 1024) != 1024) {
                    this.f8197y = new ArrayList(this.f8197y);
                    this.f8186n |= 1024;
                }
                this.f8197y.addAll(j7.f8224y);
            }
        }
        if ((j7.f8212m & 128) == 128) {
            c0 c0Var2 = j7.f8225z;
            if ((this.f8186n & 2048) != 2048 || (c0Var = this.f8198z) == c0.f8395x) {
                this.f8198z = c0Var2;
            } else {
                b0 b0VarH = b0.h();
                b0VarH.i(c0Var);
                b0VarH.i(c0Var2);
                this.f8198z = b0VarH.g();
            }
            this.f8186n |= 2048;
        }
        int i13 = j7.f8212m;
        if ((i13 & 256) == 256) {
            int i14 = j7.f8201A;
            this.f8186n |= 4096;
            this.f8178A = i14;
        }
        if ((i13 & 512) == 512) {
            int i15 = j7.f8202B;
            this.f8186n |= 8192;
            this.f8179B = i15;
        }
        if (!j7.f8203C.isEmpty()) {
            if (this.f8180C.isEmpty()) {
                this.f8180C = j7.f8203C;
                this.f8186n &= -16385;
            } else {
                if ((this.f8186n & 16384) != 16384) {
                    this.f8180C = new ArrayList(this.f8180C);
                    this.f8186n |= 16384;
                }
                this.f8180C.addAll(j7.f8203C);
            }
        }
        if (!j7.f8204D.isEmpty()) {
            if (this.f8181D.isEmpty()) {
                this.f8181D = j7.f8204D;
                this.f8186n &= -32769;
            } else {
                if ((this.f8186n & 32768) != 32768) {
                    this.f8181D = new ArrayList(this.f8181D);
                    this.f8186n |= 32768;
                }
                this.f8181D.addAll(j7.f8204D);
            }
        }
        if (!j7.f8205E.isEmpty()) {
            if (this.f8182E.isEmpty()) {
                this.f8182E = j7.f8205E;
                this.f8186n &= -65537;
            } else {
                if ((this.f8186n & 65536) != 65536) {
                    this.f8182E = new ArrayList(this.f8182E);
                    this.f8186n |= 65536;
                }
                this.f8182E.addAll(j7.f8205E);
            }
        }
        if (!j7.f8206F.isEmpty()) {
            if (this.f8183F.isEmpty()) {
                this.f8183F = j7.f8206F;
                this.f8186n &= -131073;
            } else {
                if ((this.f8186n & 131072) != 131072) {
                    this.f8183F = new ArrayList(this.f8183F);
                    this.f8186n |= 131072;
                }
                this.f8183F.addAll(j7.f8206F);
            }
        }
        if (!j7.f8207G.isEmpty()) {
            if (this.f8184G.isEmpty()) {
                this.f8184G = j7.f8207G;
                this.f8186n &= -262145;
            } else {
                if ((this.f8186n & 262144) != 262144) {
                    this.f8184G = new ArrayList(this.f8184G);
                    this.f8186n |= 262144;
                }
                this.f8184G.addAll(j7.f8207G);
            }
        }
        if (!j7.f8208H.isEmpty()) {
            if (this.f8185H.isEmpty()) {
                this.f8185H = j7.f8208H;
                this.f8186n &= -524289;
            } else {
                if ((this.f8186n & 524288) != 524288) {
                    this.f8185H = new ArrayList(this.f8185H);
                    this.f8186n |= 524288;
                }
                this.f8185H.addAll(j7.f8208H);
            }
        }
        if (!j7.I.isEmpty()) {
            if (this.I.isEmpty()) {
                this.I = j7.I;
                this.f8186n &= -1048577;
            } else {
                if ((this.f8186n & ByteChannelKt.CHANNEL_MAX_SIZE) != 1048576) {
                    this.I = new ArrayList(this.I);
                    this.f8186n |= ByteChannelKt.CHANNEL_MAX_SIZE;
                }
                this.I.addAll(j7.I);
            }
        }
        if (!j7.J.isEmpty()) {
            if (this.J.isEmpty()) {
                this.J = j7.J;
                this.f8186n &= -2097153;
            } else {
                if ((this.f8186n & 2097152) != 2097152) {
                    this.J = new ArrayList(this.J);
                    this.f8186n |= 2097152;
                }
                this.J.addAll(j7.J);
            }
        }
        f(j7);
        this.f9896k = this.f9896k.h(j7.f8211l);
    }
}
