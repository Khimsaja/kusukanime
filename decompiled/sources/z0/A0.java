package z0;

import android.graphics.Outline;
import android.os.Build;
import e5.AbstractC0832b;
import f.AbstractC0847h;
import f1.AbstractC0870c;
import g0.AbstractC0932a;
import h0.AbstractC0966K;
import h0.AbstractC0968M;
import h0.C0963H;
import h0.C0964I;
import h0.C0965J;
import h0.C0987j;
import h0.InterfaceC0967L;

/* loaded from: classes.dex */
public final class A0 {
    public boolean a = true;

    /* renamed from: b, reason: collision with root package name */
    public final Outline f18549b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0966K f18550c;

    /* renamed from: d, reason: collision with root package name */
    public C0987j f18551d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0967L f18552e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18553f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18554g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0967L f18555h;

    /* renamed from: i, reason: collision with root package name */
    public g0.e f18556i;

    /* renamed from: j, reason: collision with root package name */
    public float f18557j;

    /* renamed from: k, reason: collision with root package name */
    public long f18558k;

    /* renamed from: l, reason: collision with root package name */
    public long f18559l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18560m;

    public A0() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f18549b = outline;
        this.f18558k = 0L;
        this.f18559l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(h0.InterfaceC0995r r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r0.d()
            h0.L r2 = r0.f18552e
            if (r2 == 0) goto Lf
            r1.s(r2)
            return
        Lf:
            float r2 = r0.f18557j
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto Lc1
            h0.L r3 = r0.f18555h
            g0.e r4 = r0.f18556i
            if (r3 == 0) goto L66
            long r5 = r0.f18558k
            long r7 = r0.f18559l
            if (r4 == 0) goto L66
            boolean r9 = f.AbstractC0847h.r(r4)
            if (r9 != 0) goto L29
            goto L66
        L29:
            float r9 = g0.c.d(r5)
            float r10 = r4.a
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 != 0) goto L66
            float r9 = g0.c.e(r5)
            float r10 = r4.f11662b
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 != 0) goto L66
            float r9 = g0.c.d(r5)
            float r10 = g0.f.d(r7)
            float r10 = r10 + r9
            float r9 = r4.f11663c
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L66
            float r5 = g0.c.e(r5)
            float r6 = g0.f.b(r7)
            float r6 = r6 + r5
            float r5 = r4.f11664d
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L66
            long r4 = r4.f11665e
            float r4 = g0.AbstractC0932a.b(r4)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L66
            goto Lbd
        L66:
            long r4 = r0.f18558k
            float r7 = g0.c.d(r4)
            long r4 = r0.f18558k
            float r8 = g0.c.e(r4)
            long r4 = r0.f18558k
            float r2 = g0.c.d(r4)
            long r4 = r0.f18559l
            float r4 = g0.f.d(r4)
            float r9 = r4 + r2
            long r4 = r0.f18558k
            float r2 = g0.c.e(r4)
            long r4 = r0.f18559l
            float r4 = g0.f.b(r4)
            float r10 = r4 + r2
            float r2 = r0.f18557j
            long r4 = f6.AbstractC0915m.a(r2, r2)
            float r2 = g0.AbstractC0932a.b(r4)
            float r4 = g0.AbstractC0932a.c(r4)
            long r11 = f6.AbstractC0915m.a(r2, r4)
            g0.e r6 = new g0.e
            r13 = r11
            r15 = r11
            r17 = r11
            r6.<init>(r7, r8, r9, r10, r11, r13, r15, r17)
            if (r3 != 0) goto Lb0
            h0.j r3 = h0.AbstractC0968M.h()
            goto Lb6
        Lb0:
            r2 = r3
            h0.j r2 = (h0.C0987j) r2
            r2.e()
        Lb6:
            h0.InterfaceC0967L.a(r3, r6)
            r0.f18556i = r6
            r0.f18555h = r3
        Lbd:
            r1.s(r3)
            return
        Lc1:
            long r2 = r0.f18558k
            float r2 = g0.c.d(r2)
            long r3 = r0.f18558k
            float r3 = g0.c.e(r3)
            long r4 = r0.f18558k
            float r4 = g0.c.d(r4)
            long r5 = r0.f18559l
            float r5 = g0.f.d(r5)
            float r4 = r4 + r5
            long r5 = r0.f18558k
            float r5 = g0.c.e(r5)
            long r6 = r0.f18559l
            float r6 = g0.f.b(r6)
            float r5 = r5 + r6
            r6 = 1
            r1.e(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.A0.a(h0.r):void");
    }

    public final Outline b() {
        d();
        if (this.f18560m && this.a) {
            return this.f18549b;
        }
        return null;
    }

    public final boolean c(AbstractC0966K abstractC0966K, float f5, boolean z7, float f7, long j7) {
        this.f18549b.setAlpha(f5);
        boolean zA = kotlin.jvm.internal.l.a(this.f18550c, abstractC0966K);
        boolean z8 = !zA;
        if (!zA) {
            this.f18550c = abstractC0966K;
            this.f18553f = true;
        }
        this.f18559l = j7;
        boolean z9 = abstractC0966K != null && (z7 || f7 > 0.0f);
        if (this.f18560m != z9) {
            this.f18560m = z9;
            this.f18553f = true;
        }
        return z8;
    }

    public final void d() {
        if (this.f18553f) {
            this.f18558k = 0L;
            this.f18557j = 0.0f;
            this.f18552e = null;
            this.f18553f = false;
            this.f18554g = false;
            AbstractC0966K abstractC0966K = this.f18550c;
            Outline outline = this.f18549b;
            if (abstractC0966K == null || !this.f18560m || g0.f.d(this.f18559l) <= 0.0f || g0.f.b(this.f18559l) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.a = true;
            if (abstractC0966K instanceof C0964I) {
                g0.d dVar = ((C0964I) abstractC0966K).a;
                float f5 = dVar.a;
                float f7 = dVar.f11659b;
                this.f18558k = AbstractC0832b.e(f5, f7);
                this.f18559l = AbstractC0870c.F(dVar.c(), dVar.b());
                outline.setRect(Math.round(f5), Math.round(f7), Math.round(dVar.f11660c), Math.round(dVar.f11661d));
                return;
            }
            if (!(abstractC0966K instanceof C0965J)) {
                if (abstractC0966K instanceof C0963H) {
                    e(((C0963H) abstractC0966K).a);
                    return;
                }
                return;
            }
            g0.e eVar = ((C0965J) abstractC0966K).a;
            float fB = AbstractC0932a.b(eVar.f11665e);
            float f8 = eVar.a;
            float f9 = eVar.f11662b;
            this.f18558k = AbstractC0832b.e(f8, f9);
            this.f18559l = AbstractC0870c.F(eVar.b(), eVar.a());
            if (AbstractC0847h.r(eVar)) {
                this.f18549b.setRoundRect(Math.round(f8), Math.round(f9), Math.round(eVar.f11663c), Math.round(eVar.f11664d), fB);
                this.f18557j = fB;
                return;
            }
            C0987j c0987jH = this.f18551d;
            if (c0987jH == null) {
                c0987jH = AbstractC0968M.h();
                this.f18551d = c0987jH;
            }
            c0987jH.e();
            InterfaceC0967L.a(c0987jH, eVar);
            e(c0987jH);
        }
    }

    public final void e(InterfaceC0967L interfaceC0967L) {
        int i7 = Build.VERSION.SDK_INT;
        Outline outline = this.f18549b;
        if (i7 <= 28 && !((C0987j) interfaceC0967L).a.isConvex()) {
            this.a = false;
            outline.setEmpty();
            this.f18554g = true;
        } else {
            if (!(interfaceC0967L instanceof C0987j)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((C0987j) interfaceC0967L).a);
            this.f18554g = !outline.canClip();
        }
        this.f18552e = interfaceC0967L;
    }
}
