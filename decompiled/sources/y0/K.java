package y0;

import r0.C1861b;

/* loaded from: classes.dex */
public final class K {
    public final C2349D a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17745b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17747d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17748e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17749f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17750g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17751h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17752i;

    /* renamed from: j, reason: collision with root package name */
    public int f17753j;

    /* renamed from: k, reason: collision with root package name */
    public int f17754k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17755l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17756m;

    /* renamed from: n, reason: collision with root package name */
    public int f17757n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17758o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17759p;

    /* renamed from: q, reason: collision with root package name */
    public int f17760q;

    /* renamed from: s, reason: collision with root package name */
    public I f17762s;

    /* renamed from: c, reason: collision with root package name */
    public int f17746c = 5;

    /* renamed from: r, reason: collision with root package name */
    public final J f17761r = new J(this);

    /* renamed from: t, reason: collision with root package name */
    public long f17763t = q0.c.b(0, 0, 15);

    /* renamed from: u, reason: collision with root package name */
    public final C1861b f17764u = new C1861b(8, this);

    public K(C2349D c2349d) {
        this.a = c2349d;
    }

    public final Y a() {
        return (Y) this.a.f17660G.f7174d;
    }

    public final void b(int i7) {
        int i8 = this.f17757n;
        this.f17757n = i7;
        if ((i8 == 0) != (i7 == 0)) {
            C2349D c2349dS = this.a.s();
            K k7 = c2349dS != null ? c2349dS.f17661H : null;
            if (k7 != null) {
                if (i7 == 0) {
                    k7.b(k7.f17757n - 1);
                } else {
                    k7.b(k7.f17757n + 1);
                }
            }
        }
    }

    public final void c(int i7) {
        int i8 = this.f17760q;
        this.f17760q = i7;
        if ((i8 == 0) != (i7 == 0)) {
            C2349D c2349dS = this.a.s();
            K k7 = c2349dS != null ? c2349dS.f17661H : null;
            if (k7 != null) {
                if (i7 == 0) {
                    k7.c(k7.f17760q - 1);
                } else {
                    k7.c(k7.f17760q + 1);
                }
            }
        }
    }

    public final void d(boolean z7) {
        if (this.f17756m != z7) {
            this.f17756m = z7;
            if (z7 && !this.f17755l) {
                b(this.f17757n + 1);
            } else {
                if (z7 || this.f17755l) {
                    return;
                }
                b(this.f17757n - 1);
            }
        }
    }

    public final void e(boolean z7) {
        if (this.f17755l != z7) {
            this.f17755l = z7;
            if (z7 && !this.f17756m) {
                b(this.f17757n + 1);
            } else {
                if (z7 || this.f17756m) {
                    return;
                }
                b(this.f17757n - 1);
            }
        }
    }

    public final void f(boolean z7) {
        if (this.f17759p != z7) {
            this.f17759p = z7;
            if (z7 && !this.f17758o) {
                c(this.f17760q + 1);
            } else {
                if (z7 || this.f17758o) {
                    return;
                }
                c(this.f17760q - 1);
            }
        }
    }

    public final void g(boolean z7) {
        if (this.f17758o != z7) {
            this.f17758o = z7;
            if (z7 && !this.f17759p) {
                c(this.f17760q + 1);
            } else {
                if (z7 || this.f17759p) {
                    return;
                }
                c(this.f17760q - 1);
            }
        }
    }

    public final void h() {
        J j7 = this.f17761r;
        Object obj = j7.f17720A;
        C2349D c2349d = this.a;
        K k7 = j7.f17733P;
        if ((obj != null || k7.a().h() != null) && j7.f17744z) {
            j7.f17744z = false;
            j7.f17720A = k7.a().h();
            C2349D c2349dS = c2349d.s();
            if (c2349dS != null) {
                C2349D.T(c2349dS, false, 7);
            }
        }
        I i7 = this.f17762s;
        if (i7 != null) {
            Object obj2 = i7.f17706F;
            K k8 = i7.f17708H;
            if (obj2 == null) {
                O oN0 = k8.a().N0();
                kotlin.jvm.internal.l.c(oN0);
                if (oN0.f17777v.h() == null) {
                    return;
                }
            }
            if (i7.f17705E) {
                i7.f17705E = false;
                O oN02 = k8.a().N0();
                kotlin.jvm.internal.l.c(oN02);
                i7.f17706F = oN02.f17777v.h();
                if (AbstractC2359f.r(c2349d)) {
                    C2349D c2349dS2 = c2349d.s();
                    if (c2349dS2 != null) {
                        C2349D.T(c2349dS2, false, 7);
                        return;
                    }
                    return;
                }
                C2349D c2349dS3 = c2349d.s();
                if (c2349dS3 != null) {
                    C2349D.R(c2349dS3, false, 7);
                }
            }
        }
    }
}
