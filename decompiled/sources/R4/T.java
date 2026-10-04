package R4;

import X4.AbstractC0605b;
import X4.AbstractC0613j;
import X4.AbstractC0614k;
import X4.AbstractC0618o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class T extends AbstractC0614k {

    /* renamed from: A, reason: collision with root package name */
    public int f8275A;

    /* renamed from: B, reason: collision with root package name */
    public int f8276B;

    /* renamed from: n, reason: collision with root package name */
    public int f8277n;

    /* renamed from: o, reason: collision with root package name */
    public List f8278o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8279p;

    /* renamed from: q, reason: collision with root package name */
    public int f8280q;

    /* renamed from: r, reason: collision with root package name */
    public U f8281r;

    /* renamed from: s, reason: collision with root package name */
    public int f8282s;

    /* renamed from: t, reason: collision with root package name */
    public int f8283t;

    /* renamed from: u, reason: collision with root package name */
    public int f8284u;

    /* renamed from: v, reason: collision with root package name */
    public int f8285v;

    /* renamed from: w, reason: collision with root package name */
    public int f8286w;

    /* renamed from: x, reason: collision with root package name */
    public U f8287x;

    /* renamed from: y, reason: collision with root package name */
    public int f8288y;

    /* renamed from: z, reason: collision with root package name */
    public U f8289z;

    public static T h() {
        T t7 = new T();
        t7.f8278o = Collections.EMPTY_LIST;
        U u5 = U.f8290D;
        t7.f8281r = u5;
        t7.f8287x = u5;
        t7.f8289z = u5;
        return t7;
    }

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        U uG = g();
        if (uG.a()) {
            return uG;
        }
        throw new D6.r();
    }

    public final Object clone() {
        T tH = h();
        tH.i(g());
        return tH;
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
            R4.a r1 = R4.U.f8291E     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            R4.U r1 = new R4.U     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> Lf
            R4.U r4 = (R4.U) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: R4.T.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        i((U) abstractC0618o);
        return this;
    }

    public final U g() {
        U u5 = new U(this);
        int i7 = this.f8277n;
        if ((i7 & 1) == 1) {
            this.f8278o = Collections.unmodifiableList(this.f8278o);
            this.f8277n &= -2;
        }
        u5.f8297n = this.f8278o;
        int i8 = (i7 & 2) != 2 ? 0 : 1;
        u5.f8298o = this.f8279p;
        if ((i7 & 4) == 4) {
            i8 |= 2;
        }
        u5.f8299p = this.f8280q;
        if ((i7 & 8) == 8) {
            i8 |= 4;
        }
        u5.f8300q = this.f8281r;
        if ((i7 & 16) == 16) {
            i8 |= 8;
        }
        u5.f8301r = this.f8282s;
        if ((i7 & 32) == 32) {
            i8 |= 16;
        }
        u5.f8302s = this.f8283t;
        if ((i7 & 64) == 64) {
            i8 |= 32;
        }
        u5.f8303t = this.f8284u;
        if ((i7 & 128) == 128) {
            i8 |= 64;
        }
        u5.f8304u = this.f8285v;
        if ((i7 & 256) == 256) {
            i8 |= 128;
        }
        u5.f8305v = this.f8286w;
        if ((i7 & 512) == 512) {
            i8 |= 256;
        }
        u5.f8306w = this.f8287x;
        if ((i7 & 1024) == 1024) {
            i8 |= 512;
        }
        u5.f8307x = this.f8288y;
        if ((i7 & 2048) == 2048) {
            i8 |= 1024;
        }
        u5.f8308y = this.f8289z;
        if ((i7 & 4096) == 4096) {
            i8 |= 2048;
        }
        u5.f8309z = this.f8275A;
        if ((i7 & 8192) == 8192) {
            i8 |= 4096;
        }
        u5.f8292A = this.f8276B;
        u5.f8296m = i8;
        return u5;
    }

    public final T i(U u5) {
        U u7;
        U u8;
        U u9;
        U u10 = U.f8290D;
        if (u5 == u10) {
            return this;
        }
        if (!u5.f8297n.isEmpty()) {
            if (this.f8278o.isEmpty()) {
                this.f8278o = u5.f8297n;
                this.f8277n &= -2;
            } else {
                if ((this.f8277n & 1) != 1) {
                    this.f8278o = new ArrayList(this.f8278o);
                    this.f8277n |= 1;
                }
                this.f8278o.addAll(u5.f8297n);
            }
        }
        int i7 = u5.f8296m;
        if ((i7 & 1) == 1) {
            boolean z7 = u5.f8298o;
            this.f8277n |= 2;
            this.f8279p = z7;
        }
        if ((i7 & 2) == 2) {
            int i8 = u5.f8299p;
            this.f8277n |= 4;
            this.f8280q = i8;
        }
        if ((i7 & 4) == 4) {
            U u11 = u5.f8300q;
            if ((this.f8277n & 8) != 8 || (u9 = this.f8281r) == u10) {
                this.f8281r = u11;
            } else {
                T tR = U.r(u9);
                tR.i(u11);
                this.f8281r = tR.g();
            }
            this.f8277n |= 8;
        }
        if ((u5.f8296m & 8) == 8) {
            int i9 = u5.f8301r;
            this.f8277n |= 16;
            this.f8282s = i9;
        }
        if (u5.p()) {
            int i10 = u5.f8302s;
            this.f8277n |= 32;
            this.f8283t = i10;
        }
        int i11 = u5.f8296m;
        if ((i11 & 32) == 32) {
            int i12 = u5.f8303t;
            this.f8277n |= 64;
            this.f8284u = i12;
        }
        if ((i11 & 64) == 64) {
            int i13 = u5.f8304u;
            this.f8277n |= 128;
            this.f8285v = i13;
        }
        if ((i11 & 128) == 128) {
            int i14 = u5.f8305v;
            this.f8277n |= 256;
            this.f8286w = i14;
        }
        if ((i11 & 256) == 256) {
            U u12 = u5.f8306w;
            if ((this.f8277n & 512) != 512 || (u8 = this.f8287x) == u10) {
                this.f8287x = u12;
            } else {
                T tR2 = U.r(u8);
                tR2.i(u12);
                this.f8287x = tR2.g();
            }
            this.f8277n |= 512;
        }
        int i15 = u5.f8296m;
        if ((i15 & 512) == 512) {
            int i16 = u5.f8307x;
            this.f8277n |= 1024;
            this.f8288y = i16;
        }
        if ((i15 & 1024) == 1024) {
            U u13 = u5.f8308y;
            if ((this.f8277n & 2048) != 2048 || (u7 = this.f8289z) == u10) {
                this.f8289z = u13;
            } else {
                T tR3 = U.r(u7);
                tR3.i(u13);
                this.f8289z = tR3.g();
            }
            this.f8277n |= 2048;
        }
        int i17 = u5.f8296m;
        if ((i17 & 2048) == 2048) {
            int i18 = u5.f8309z;
            this.f8277n |= 4096;
            this.f8275A = i18;
        }
        if ((i17 & 4096) == 4096) {
            int i19 = u5.f8292A;
            this.f8277n |= 8192;
            this.f8276B = i19;
        }
        f(u5);
        this.f9896k = this.f9896k.h(u5.f8295l);
        return this;
    }
}
