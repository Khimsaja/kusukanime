package R4;

import X4.AbstractC0605b;
import X4.AbstractC0613j;
import X4.AbstractC0614k;
import X4.AbstractC0618o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: R4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0582m extends AbstractC0614k {

    /* renamed from: n, reason: collision with root package name */
    public int f8566n;

    /* renamed from: o, reason: collision with root package name */
    public int f8567o;

    /* renamed from: p, reason: collision with root package name */
    public List f8568p;

    /* renamed from: q, reason: collision with root package name */
    public List f8569q;

    /* renamed from: r, reason: collision with root package name */
    public List f8570r;

    /* renamed from: s, reason: collision with root package name */
    public List f8571s;

    public static C0582m h() {
        C0582m c0582m = new C0582m();
        c0582m.f8567o = 6;
        List list = Collections.EMPTY_LIST;
        c0582m.f8568p = list;
        c0582m.f8569q = list;
        c0582m.f8570r = list;
        c0582m.f8571s = list;
        return c0582m;
    }

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        C0583n c0583nG = g();
        if (c0583nG.a()) {
            return c0583nG;
        }
        throw new D6.r();
    }

    public final Object clone() {
        C0582m c0582mH = h();
        c0582mH.i(g());
        return c0582mH;
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
            R4.a r1 = R4.C0583n.f8573v     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            R4.n r1 = new R4.n     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> Lf
            R4.n r4 = (R4.C0583n) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: R4.C0582m.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        i((C0583n) abstractC0618o);
        return this;
    }

    public final C0583n g() {
        C0583n c0583n = new C0583n(this);
        int i7 = this.f8566n;
        int i8 = (i7 & 1) != 1 ? 0 : 1;
        c0583n.f8576n = this.f8567o;
        if ((i7 & 2) == 2) {
            this.f8568p = Collections.unmodifiableList(this.f8568p);
            this.f8566n &= -3;
        }
        c0583n.f8577o = this.f8568p;
        if ((this.f8566n & 4) == 4) {
            this.f8569q = Collections.unmodifiableList(this.f8569q);
            this.f8566n &= -5;
        }
        c0583n.f8578p = this.f8569q;
        if ((this.f8566n & 8) == 8) {
            this.f8570r = Collections.unmodifiableList(this.f8570r);
            this.f8566n &= -9;
        }
        c0583n.f8579q = this.f8570r;
        if ((this.f8566n & 16) == 16) {
            this.f8571s = Collections.unmodifiableList(this.f8571s);
            this.f8566n &= -17;
        }
        c0583n.f8580r = this.f8571s;
        c0583n.f8575m = i8;
        return c0583n;
    }

    public final void i(C0583n c0583n) {
        if (c0583n == C0583n.f8572u) {
            return;
        }
        if ((c0583n.f8575m & 1) == 1) {
            int i7 = c0583n.f8576n;
            this.f8566n = 1 | this.f8566n;
            this.f8567o = i7;
        }
        if (!c0583n.f8577o.isEmpty()) {
            if (this.f8568p.isEmpty()) {
                this.f8568p = c0583n.f8577o;
                this.f8566n &= -3;
            } else {
                if ((this.f8566n & 2) != 2) {
                    this.f8568p = new ArrayList(this.f8568p);
                    this.f8566n |= 2;
                }
                this.f8568p.addAll(c0583n.f8577o);
            }
        }
        if (!c0583n.f8578p.isEmpty()) {
            if (this.f8569q.isEmpty()) {
                this.f8569q = c0583n.f8578p;
                this.f8566n &= -5;
            } else {
                if ((this.f8566n & 4) != 4) {
                    this.f8569q = new ArrayList(this.f8569q);
                    this.f8566n |= 4;
                }
                this.f8569q.addAll(c0583n.f8578p);
            }
        }
        if (!c0583n.f8579q.isEmpty()) {
            if (this.f8570r.isEmpty()) {
                this.f8570r = c0583n.f8579q;
                this.f8566n &= -9;
            } else {
                if ((this.f8566n & 8) != 8) {
                    this.f8570r = new ArrayList(this.f8570r);
                    this.f8566n |= 8;
                }
                this.f8570r.addAll(c0583n.f8579q);
            }
        }
        if (!c0583n.f8580r.isEmpty()) {
            if (this.f8571s.isEmpty()) {
                this.f8571s = c0583n.f8580r;
                this.f8566n &= -17;
            } else {
                if ((this.f8566n & 16) != 16) {
                    this.f8571s = new ArrayList(this.f8571s);
                    this.f8566n |= 16;
                }
                this.f8571s.addAll(c0583n.f8580r);
            }
        }
        f(c0583n);
        this.f9896k = this.f9896k.h(c0583n.f8574l);
    }
}
