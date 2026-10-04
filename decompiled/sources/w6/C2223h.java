package w6;

import b1.AbstractC0703b;
import java.io.Closeable;
import java.util.Arrays;

/* renamed from: w6.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2223h implements Closeable {

    /* renamed from: k, reason: collision with root package name */
    public C2224i f17148k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17149l;

    /* renamed from: m, reason: collision with root package name */
    public D f17150m;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f17152o;

    /* renamed from: n, reason: collision with root package name */
    public long f17151n = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f17153p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f17154q = -1;

    public final void b(long j7) {
        C2224i c2224i = this.f17148k;
        if (c2224i == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!this.f17149l) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long j8 = c2224i.f17156l;
        if (j7 <= j8) {
            if (j7 < 0) {
                throw new IllegalArgumentException(AbstractC0703b.h("newSize < 0: ", j7).toString());
            }
            long j9 = j8 - j7;
            while (true) {
                if (j9 <= 0) {
                    break;
                }
                D d4 = c2224i.f17155k;
                kotlin.jvm.internal.l.c(d4);
                D d6 = d4.f17121g;
                kotlin.jvm.internal.l.c(d6);
                int i7 = d6.f17117c;
                long j10 = i7 - d6.f17116b;
                if (j10 > j9) {
                    d6.f17117c = i7 - ((int) j9);
                    break;
                } else {
                    c2224i.f17155k = d6.a();
                    E.a(d6);
                    j9 -= j10;
                }
            }
            this.f17150m = null;
            this.f17151n = j7;
            this.f17152o = null;
            this.f17153p = -1;
            this.f17154q = -1;
        } else if (j7 > j8) {
            long j11 = j7 - j8;
            int i8 = 1;
            boolean z7 = true;
            for (long j12 = 0; j11 > j12; j12 = 0) {
                D dD0 = c2224i.d0(i8);
                int iMin = (int) Math.min(j11, 8192 - dD0.f17117c);
                int i9 = dD0.f17117c + iMin;
                dD0.f17117c = i9;
                j11 -= iMin;
                if (z7) {
                    this.f17150m = dD0;
                    this.f17151n = j8;
                    this.f17152o = dD0.a;
                    this.f17153p = i9 - iMin;
                    this.f17154q = i9;
                    z7 = false;
                }
                i8 = 1;
            }
        }
        c2224i.f17156l = j7;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17148k == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f17148k = null;
        this.f17150m = null;
        this.f17151n = -1L;
        this.f17152o = null;
        this.f17153p = -1;
        this.f17154q = -1;
    }

    public final int e(long j7) {
        C2224i c2224i = this.f17148k;
        if (c2224i == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j7 >= -1) {
            long j8 = c2224i.f17156l;
            if (j7 <= j8) {
                if (j7 == -1 || j7 == j8) {
                    this.f17150m = null;
                    this.f17151n = j7;
                    this.f17152o = null;
                    this.f17153p = -1;
                    this.f17154q = -1;
                    return -1;
                }
                D d4 = c2224i.f17155k;
                D d6 = this.f17150m;
                long j9 = 0;
                if (d6 != null) {
                    long j10 = this.f17151n - (this.f17153p - d6.f17116b);
                    if (j10 > j7) {
                        d6 = d4;
                        d4 = d6;
                        j8 = j10;
                    } else {
                        j9 = j10;
                    }
                } else {
                    d6 = d4;
                }
                if (j8 - j7 > j7 - j9) {
                    while (true) {
                        kotlin.jvm.internal.l.c(d6);
                        long j11 = (d6.f17117c - d6.f17116b) + j9;
                        if (j7 < j11) {
                            break;
                        }
                        d6 = d6.f17120f;
                        j9 = j11;
                    }
                } else {
                    while (j8 > j7) {
                        kotlin.jvm.internal.l.c(d4);
                        d4 = d4.f17121g;
                        kotlin.jvm.internal.l.c(d4);
                        j8 -= d4.f17117c - d4.f17116b;
                    }
                    d6 = d4;
                    j9 = j8;
                }
                if (this.f17149l) {
                    kotlin.jvm.internal.l.c(d6);
                    if (d6.f17118d) {
                        byte[] bArr = d6.a;
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        kotlin.jvm.internal.l.e("copyOf(...)", bArrCopyOf);
                        D d7 = new D(bArrCopyOf, d6.f17116b, d6.f17117c, false, true);
                        if (c2224i.f17155k == d6) {
                            c2224i.f17155k = d7;
                        }
                        d6.b(d7);
                        D d8 = d7.f17121g;
                        kotlin.jvm.internal.l.c(d8);
                        d8.a();
                        d6 = d7;
                    }
                }
                this.f17150m = d6;
                this.f17151n = j7;
                kotlin.jvm.internal.l.c(d6);
                this.f17152o = d6.a;
                int i7 = d6.f17116b + ((int) (j7 - j9));
                this.f17153p = i7;
                int i8 = d6.f17117c;
                this.f17154q = i8;
                return i8 - i7;
            }
        }
        StringBuilder sbK = A6.b.k("offset=", j7, " > size=");
        sbK.append(c2224i.f17156l);
        throw new ArrayIndexOutOfBoundsException(sbK.toString());
    }
}
