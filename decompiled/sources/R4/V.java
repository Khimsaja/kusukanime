package R4;

import X4.AbstractC0605b;
import X4.AbstractC0613j;
import X4.AbstractC0614k;
import X4.AbstractC0618o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class V extends AbstractC0614k {

    /* renamed from: n, reason: collision with root package name */
    public int f8310n;

    /* renamed from: o, reason: collision with root package name */
    public int f8311o;

    /* renamed from: p, reason: collision with root package name */
    public int f8312p;

    /* renamed from: q, reason: collision with root package name */
    public List f8313q;

    /* renamed from: r, reason: collision with root package name */
    public U f8314r;

    /* renamed from: s, reason: collision with root package name */
    public int f8315s;

    /* renamed from: t, reason: collision with root package name */
    public U f8316t;

    /* renamed from: u, reason: collision with root package name */
    public int f8317u;

    /* renamed from: v, reason: collision with root package name */
    public List f8318v;

    /* renamed from: w, reason: collision with root package name */
    public List f8319w;

    /* renamed from: x, reason: collision with root package name */
    public List f8320x;

    public static V h() {
        V v5 = new V();
        v5.f8311o = 6;
        List list = Collections.EMPTY_LIST;
        v5.f8313q = list;
        U u5 = U.f8290D;
        v5.f8314r = u5;
        v5.f8316t = u5;
        v5.f8318v = list;
        v5.f8319w = list;
        v5.f8320x = list;
        return v5;
    }

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        W wG = g();
        if (wG.a()) {
            return wG;
        }
        throw new D6.r();
    }

    public final Object clone() {
        V vH = h();
        vH.i(g());
        return vH;
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
            R4.a r1 = R4.W.f8321A     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            R4.W r1 = new R4.W     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> Lf
            R4.W r4 = (R4.W) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: R4.V.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        i((W) abstractC0618o);
        return this;
    }

    public final W g() {
        W w7 = new W(this);
        int i7 = this.f8310n;
        int i8 = (i7 & 1) != 1 ? 0 : 1;
        w7.f8325n = this.f8311o;
        if ((i7 & 2) == 2) {
            i8 |= 2;
        }
        w7.f8326o = this.f8312p;
        if ((i7 & 4) == 4) {
            this.f8313q = Collections.unmodifiableList(this.f8313q);
            this.f8310n &= -5;
        }
        w7.f8327p = this.f8313q;
        if ((i7 & 8) == 8) {
            i8 |= 4;
        }
        w7.f8328q = this.f8314r;
        if ((i7 & 16) == 16) {
            i8 |= 8;
        }
        w7.f8329r = this.f8315s;
        if ((i7 & 32) == 32) {
            i8 |= 16;
        }
        w7.f8330s = this.f8316t;
        if ((i7 & 64) == 64) {
            i8 |= 32;
        }
        w7.f8331t = this.f8317u;
        if ((this.f8310n & 128) == 128) {
            this.f8318v = Collections.unmodifiableList(this.f8318v);
            this.f8310n &= -129;
        }
        w7.f8332u = this.f8318v;
        if ((this.f8310n & 256) == 256) {
            this.f8319w = Collections.unmodifiableList(this.f8319w);
            this.f8310n &= -257;
        }
        w7.f8333v = this.f8319w;
        if ((this.f8310n & 512) == 512) {
            this.f8320x = Collections.unmodifiableList(this.f8320x);
            this.f8310n &= -513;
        }
        w7.f8334w = this.f8320x;
        w7.f8324m = i8;
        return w7;
    }

    public final void i(W w7) {
        U u5;
        U u7;
        if (w7 == W.f8322z) {
            return;
        }
        int i7 = w7.f8324m;
        if ((i7 & 1) == 1) {
            int i8 = w7.f8325n;
            this.f8310n = 1 | this.f8310n;
            this.f8311o = i8;
        }
        if ((i7 & 2) == 2) {
            int i9 = w7.f8326o;
            this.f8310n = 2 | this.f8310n;
            this.f8312p = i9;
        }
        if (!w7.f8327p.isEmpty()) {
            if (this.f8313q.isEmpty()) {
                this.f8313q = w7.f8327p;
                this.f8310n &= -5;
            } else {
                if ((this.f8310n & 4) != 4) {
                    this.f8313q = new ArrayList(this.f8313q);
                    this.f8310n |= 4;
                }
                this.f8313q.addAll(w7.f8327p);
            }
        }
        if ((w7.f8324m & 4) == 4) {
            U u8 = w7.f8328q;
            if ((this.f8310n & 8) != 8 || (u7 = this.f8314r) == U.f8290D) {
                this.f8314r = u8;
            } else {
                T tR = U.r(u7);
                tR.i(u8);
                this.f8314r = tR.g();
            }
            this.f8310n |= 8;
        }
        int i10 = w7.f8324m;
        if ((i10 & 8) == 8) {
            int i11 = w7.f8329r;
            this.f8310n |= 16;
            this.f8315s = i11;
        }
        if ((i10 & 16) == 16) {
            U u9 = w7.f8330s;
            if ((this.f8310n & 32) != 32 || (u5 = this.f8316t) == U.f8290D) {
                this.f8316t = u9;
            } else {
                T tR2 = U.r(u5);
                tR2.i(u9);
                this.f8316t = tR2.g();
            }
            this.f8310n |= 32;
        }
        if ((w7.f8324m & 32) == 32) {
            int i12 = w7.f8331t;
            this.f8310n |= 64;
            this.f8317u = i12;
        }
        if (!w7.f8332u.isEmpty()) {
            if (this.f8318v.isEmpty()) {
                this.f8318v = w7.f8332u;
                this.f8310n &= -129;
            } else {
                if ((this.f8310n & 128) != 128) {
                    this.f8318v = new ArrayList(this.f8318v);
                    this.f8310n |= 128;
                }
                this.f8318v.addAll(w7.f8332u);
            }
        }
        if (!w7.f8333v.isEmpty()) {
            if (this.f8319w.isEmpty()) {
                this.f8319w = w7.f8333v;
                this.f8310n &= -257;
            } else {
                if ((this.f8310n & 256) != 256) {
                    this.f8319w = new ArrayList(this.f8319w);
                    this.f8310n |= 256;
                }
                this.f8319w.addAll(w7.f8333v);
            }
        }
        if (!w7.f8334w.isEmpty()) {
            if (this.f8320x.isEmpty()) {
                this.f8320x = w7.f8334w;
                this.f8310n &= -513;
            } else {
                if ((this.f8310n & 512) != 512) {
                    this.f8320x = new ArrayList(this.f8320x);
                    this.f8310n |= 512;
                }
                this.f8320x.addAll(w7.f8334w);
            }
        }
        f(w7);
        this.f9896k = this.f9896k.h(w7.f8323l);
    }
}
