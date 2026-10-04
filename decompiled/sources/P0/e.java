package P0;

import H1.e0;
import O.E;
import android.graphics.Paint;
import android.text.TextPaint;
import h0.AbstractC0968M;
import h0.AbstractC0993p;
import h0.C0972Q;
import j0.AbstractC1299e;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class e extends TextPaint {
    public e0 a;

    /* renamed from: b, reason: collision with root package name */
    public S0.j f7707b;

    /* renamed from: c, reason: collision with root package name */
    public int f7708c;

    /* renamed from: d, reason: collision with root package name */
    public C0972Q f7709d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC0993p f7710e;

    /* renamed from: f, reason: collision with root package name */
    public E f7711f;

    /* renamed from: g, reason: collision with root package name */
    public g0.f f7712g;

    /* renamed from: h, reason: collision with root package name */
    public AbstractC1299e f7713h;

    public final e0 a() {
        e0 e0Var = this.a;
        if (e0Var != null) {
            return e0Var;
        }
        e0 e0Var2 = new e0(this);
        this.a = e0Var2;
        return e0Var2;
    }

    public final void b(int i7) {
        if (i7 == this.f7708c) {
            return;
        }
        a().e(i7);
        this.f7708c = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(h0.AbstractC0993p r6, long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.f7711f = r0
            r5.f7710e = r0
            r5.f7712g = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof h0.C0975U
            if (r1 == 0) goto L1d
            h0.U r6 = (h0.C0975U) r6
            long r6 = r6.a
            long r6 = android.support.v4.media.session.b.B(r9, r6)
            r5.d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof h0.AbstractC0971P
            if (r1 == 0) goto L6e
            h0.p r1 = r5.f7710e
            boolean r1 = kotlin.jvm.internal.l.a(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            g0.f r1 = r5.f7712g
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.a
            boolean r1 = g0.f.a(r3, r7)
        L36:
            if (r1 != 0) goto L59
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            r2 = 1
        L42:
            if (r2 == 0) goto L59
            r5.f7710e = r6
            g0.f r1 = new g0.f
            r1.<init>(r7)
            r5.f7712g = r1
            P0.d r1 = new P0.d
            r2 = 0
            r1.<init>(r2, r7, r6)
            O.E r6 = O.C0486d.D(r1)
            r5.f7711f = r6
        L59:
            H1.e0 r6 = r5.a()
            O.E r7 = r5.f7711f
            if (r7 == 0) goto L68
            java.lang.Object r7 = r7.getValue()
            r0 = r7
            android.graphics.Shader r0 = (android.graphics.Shader) r0
        L68:
            r6.i(r0)
            P0.j.b(r5, r9)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.e.c(h0.p, long, float):void");
    }

    public final void d(long j7) {
        if (j7 != 16) {
            setColor(AbstractC0968M.w(j7));
            this.f7711f = null;
            this.f7710e = null;
            this.f7712g = null;
            setShader(null);
        }
    }

    public final void e(AbstractC1299e abstractC1299e) {
        if (abstractC1299e == null || l.a(this.f7713h, abstractC1299e)) {
            return;
        }
        this.f7713h = abstractC1299e;
        if (abstractC1299e.equals(j0.g.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (abstractC1299e instanceof j0.h) {
            a().m(1);
            j0.h hVar = (j0.h) abstractC1299e;
            a().l(hVar.a);
            ((Paint) a().f3452b).setStrokeMiter(hVar.f12208b);
            a().k(hVar.f12210d);
            a().j(hVar.f12209c);
            ((Paint) a().f3452b).setPathEffect(null);
        }
    }

    public final void f(C0972Q c0972q) {
        if (c0972q == null || l.a(this.f7709d, c0972q)) {
            return;
        }
        this.f7709d = c0972q;
        if (c0972q.equals(C0972Q.f11801d)) {
            clearShadowLayer();
            return;
        }
        C0972Q c0972q2 = this.f7709d;
        float f5 = c0972q2.f11803c;
        if (f5 == 0.0f) {
            f5 = Float.MIN_VALUE;
        }
        setShadowLayer(f5, g0.c.d(c0972q2.f11802b), g0.c.e(this.f7709d.f11802b), AbstractC0968M.w(this.f7709d.a));
    }

    public final void g(S0.j jVar) {
        if (jVar == null || l.a(this.f7707b, jVar)) {
            return;
        }
        this.f7707b = jVar;
        int i7 = jVar.a;
        setUnderlineText((i7 | 1) == i7);
        S0.j jVar2 = this.f7707b;
        jVar2.getClass();
        int i8 = jVar2.a;
        setStrikeThruText((i8 | 2) == i8);
    }
}
