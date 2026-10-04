package R4;

import X4.AbstractC0605b;
import X4.AbstractC0613j;
import X4.AbstractC0618o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: R4.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0592x extends AbstractC0613j implements X4.w {

    /* renamed from: l, reason: collision with root package name */
    public int f8636l;

    /* renamed from: m, reason: collision with root package name */
    public int f8637m;

    /* renamed from: n, reason: collision with root package name */
    public int f8638n;

    /* renamed from: o, reason: collision with root package name */
    public EnumC0593y f8639o;

    /* renamed from: p, reason: collision with root package name */
    public U f8640p;

    /* renamed from: q, reason: collision with root package name */
    public int f8641q;

    /* renamed from: r, reason: collision with root package name */
    public List f8642r;

    /* renamed from: s, reason: collision with root package name */
    public List f8643s;

    public static C0592x g() {
        C0592x c0592x = new C0592x();
        c0592x.f8639o = EnumC0593y.TRUE;
        c0592x.f8640p = U.f8290D;
        List list = Collections.EMPTY_LIST;
        c0592x.f8642r = list;
        c0592x.f8643s = list;
        return c0592x;
    }

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        C0594z c0594zF = f();
        if (c0594zF.a()) {
            return c0594zF;
        }
        throw new D6.r();
    }

    public final Object clone() {
        C0592x c0592xG = g();
        c0592xG.h(f());
        return c0592xG;
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
            R4.a r1 = R4.C0594z.f8650w     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            R4.z r1 = new R4.z     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r2.h(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> Lf
            R4.z r4 = (R4.C0594z) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: R4.C0592x.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        h((C0594z) abstractC0618o);
        return this;
    }

    public final C0594z f() {
        C0594z c0594z = new C0594z(this);
        int i7 = this.f8636l;
        int i8 = (i7 & 1) != 1 ? 0 : 1;
        c0594z.f8653m = this.f8637m;
        if ((i7 & 2) == 2) {
            i8 |= 2;
        }
        c0594z.f8654n = this.f8638n;
        if ((i7 & 4) == 4) {
            i8 |= 4;
        }
        c0594z.f8655o = this.f8639o;
        if ((i7 & 8) == 8) {
            i8 |= 8;
        }
        c0594z.f8656p = this.f8640p;
        if ((i7 & 16) == 16) {
            i8 |= 16;
        }
        c0594z.f8657q = this.f8641q;
        if ((i7 & 32) == 32) {
            this.f8642r = Collections.unmodifiableList(this.f8642r);
            this.f8636l &= -33;
        }
        c0594z.f8658r = this.f8642r;
        if ((this.f8636l & 64) == 64) {
            this.f8643s = Collections.unmodifiableList(this.f8643s);
            this.f8636l &= -65;
        }
        c0594z.f8659s = this.f8643s;
        c0594z.f8652l = i8;
        return c0594z;
    }

    public final void h(C0594z c0594z) {
        U u5;
        if (c0594z == C0594z.f8649v) {
            return;
        }
        int i7 = c0594z.f8652l;
        if ((i7 & 1) == 1) {
            int i8 = c0594z.f8653m;
            this.f8636l = 1 | this.f8636l;
            this.f8637m = i8;
        }
        if ((i7 & 2) == 2) {
            int i9 = c0594z.f8654n;
            this.f8636l = 2 | this.f8636l;
            this.f8638n = i9;
        }
        if ((i7 & 4) == 4) {
            EnumC0593y enumC0593y = c0594z.f8655o;
            enumC0593y.getClass();
            this.f8636l = 4 | this.f8636l;
            this.f8639o = enumC0593y;
        }
        if ((c0594z.f8652l & 8) == 8) {
            U u7 = c0594z.f8656p;
            if ((this.f8636l & 8) != 8 || (u5 = this.f8640p) == U.f8290D) {
                this.f8640p = u7;
            } else {
                T tR = U.r(u5);
                tR.i(u7);
                this.f8640p = tR.g();
            }
            this.f8636l |= 8;
        }
        if ((c0594z.f8652l & 16) == 16) {
            int i10 = c0594z.f8657q;
            this.f8636l = 16 | this.f8636l;
            this.f8641q = i10;
        }
        if (!c0594z.f8658r.isEmpty()) {
            if (this.f8642r.isEmpty()) {
                this.f8642r = c0594z.f8658r;
                this.f8636l &= -33;
            } else {
                if ((this.f8636l & 32) != 32) {
                    this.f8642r = new ArrayList(this.f8642r);
                    this.f8636l |= 32;
                }
                this.f8642r.addAll(c0594z.f8658r);
            }
        }
        if (!c0594z.f8659s.isEmpty()) {
            if (this.f8643s.isEmpty()) {
                this.f8643s = c0594z.f8659s;
                this.f8636l &= -65;
            } else {
                if ((this.f8636l & 64) != 64) {
                    this.f8643s = new ArrayList(this.f8643s);
                    this.f8636l |= 64;
                }
                this.f8643s.addAll(c0594z.f8659s);
            }
        }
        this.f9896k = this.f9896k.h(c0594z.f8651k);
    }
}
