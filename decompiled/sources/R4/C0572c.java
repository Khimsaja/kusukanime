package R4;

import X4.AbstractC0605b;
import X4.AbstractC0613j;
import X4.AbstractC0618o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: R4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0572c extends AbstractC0613j implements X4.w {

    /* renamed from: l, reason: collision with root package name */
    public int f8383l;

    /* renamed from: m, reason: collision with root package name */
    public EnumC0573d f8384m;

    /* renamed from: n, reason: collision with root package name */
    public long f8385n;

    /* renamed from: o, reason: collision with root package name */
    public float f8386o;

    /* renamed from: p, reason: collision with root package name */
    public double f8387p;

    /* renamed from: q, reason: collision with root package name */
    public int f8388q;

    /* renamed from: r, reason: collision with root package name */
    public int f8389r;

    /* renamed from: s, reason: collision with root package name */
    public int f8390s;

    /* renamed from: t, reason: collision with root package name */
    public C0577h f8391t;

    /* renamed from: u, reason: collision with root package name */
    public List f8392u;

    /* renamed from: v, reason: collision with root package name */
    public int f8393v;

    /* renamed from: w, reason: collision with root package name */
    public int f8394w;

    public static C0572c g() {
        C0572c c0572c = new C0572c();
        c0572c.f8384m = EnumC0573d.BYTE;
        c0572c.f8391t = C0577h.f8482q;
        c0572c.f8392u = Collections.EMPTY_LIST;
        return c0572c;
    }

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        C0574e c0574eF = f();
        if (c0574eF.a()) {
            return c0574eF;
        }
        throw new D6.r();
    }

    public final Object clone() {
        C0572c c0572cG = g();
        c0572cG.h(f());
        return c0572cG;
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
            R4.a r1 = R4.C0574e.f8431A     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            R4.e r1 = new R4.e     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r2.h(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> Lf
            R4.e r4 = (R4.C0574e) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.h(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.C0572c.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        h((C0574e) abstractC0618o);
        return this;
    }

    public final C0574e f() {
        C0574e c0574e = new C0574e(this);
        int i7 = this.f8383l;
        int i8 = (i7 & 1) != 1 ? 0 : 1;
        c0574e.f8435m = this.f8384m;
        if ((i7 & 2) == 2) {
            i8 |= 2;
        }
        c0574e.f8436n = this.f8385n;
        if ((i7 & 4) == 4) {
            i8 |= 4;
        }
        c0574e.f8437o = this.f8386o;
        if ((i7 & 8) == 8) {
            i8 |= 8;
        }
        c0574e.f8438p = this.f8387p;
        if ((i7 & 16) == 16) {
            i8 |= 16;
        }
        c0574e.f8439q = this.f8388q;
        if ((i7 & 32) == 32) {
            i8 |= 32;
        }
        c0574e.f8440r = this.f8389r;
        if ((i7 & 64) == 64) {
            i8 |= 64;
        }
        c0574e.f8441s = this.f8390s;
        if ((i7 & 128) == 128) {
            i8 |= 128;
        }
        c0574e.f8442t = this.f8391t;
        if ((i7 & 256) == 256) {
            this.f8392u = Collections.unmodifiableList(this.f8392u);
            this.f8383l &= -257;
        }
        c0574e.f8443u = this.f8392u;
        if ((i7 & 512) == 512) {
            i8 |= 256;
        }
        c0574e.f8444v = this.f8393v;
        if ((i7 & 1024) == 1024) {
            i8 |= 512;
        }
        c0574e.f8445w = this.f8394w;
        c0574e.f8434l = i8;
        return c0574e;
    }

    public final void h(C0574e c0574e) {
        C0577h c0577h;
        if (c0574e == C0574e.f8432z) {
            return;
        }
        if ((c0574e.f8434l & 1) == 1) {
            EnumC0573d enumC0573d = c0574e.f8435m;
            enumC0573d.getClass();
            this.f8383l = 1 | this.f8383l;
            this.f8384m = enumC0573d;
        }
        int i7 = c0574e.f8434l;
        if ((i7 & 2) == 2) {
            long j7 = c0574e.f8436n;
            this.f8383l |= 2;
            this.f8385n = j7;
        }
        if ((i7 & 4) == 4) {
            float f5 = c0574e.f8437o;
            this.f8383l = 4 | this.f8383l;
            this.f8386o = f5;
        }
        if ((i7 & 8) == 8) {
            double d4 = c0574e.f8438p;
            this.f8383l |= 8;
            this.f8387p = d4;
        }
        if ((i7 & 16) == 16) {
            int i8 = c0574e.f8439q;
            this.f8383l = 16 | this.f8383l;
            this.f8388q = i8;
        }
        if ((i7 & 32) == 32) {
            int i9 = c0574e.f8440r;
            this.f8383l = 32 | this.f8383l;
            this.f8389r = i9;
        }
        if ((i7 & 64) == 64) {
            int i10 = c0574e.f8441s;
            this.f8383l = 64 | this.f8383l;
            this.f8390s = i10;
        }
        if ((i7 & 128) == 128) {
            C0577h c0577h2 = c0574e.f8442t;
            if ((this.f8383l & 128) != 128 || (c0577h = this.f8391t) == C0577h.f8482q) {
                this.f8391t = c0577h2;
            } else {
                C0576g c0576g = new C0576g(0);
                c0576g.f8468n = Collections.EMPTY_LIST;
                c0576g.i(c0577h);
                c0576g.i(c0577h2);
                this.f8391t = c0576g.f();
            }
            this.f8383l |= 128;
        }
        if (!c0574e.f8443u.isEmpty()) {
            if (this.f8392u.isEmpty()) {
                this.f8392u = c0574e.f8443u;
                this.f8383l &= -257;
            } else {
                if ((this.f8383l & 256) != 256) {
                    this.f8392u = new ArrayList(this.f8392u);
                    this.f8383l |= 256;
                }
                this.f8392u.addAll(c0574e.f8443u);
            }
        }
        int i11 = c0574e.f8434l;
        if ((i11 & 256) == 256) {
            int i12 = c0574e.f8444v;
            this.f8383l |= 512;
            this.f8393v = i12;
        }
        if ((i11 & 512) == 512) {
            int i13 = c0574e.f8445w;
            this.f8383l |= 1024;
            this.f8394w = i13;
        }
        this.f9896k = this.f9896k.h(c0574e.f8433k);
    }
}
