package H0;

import android.graphics.Canvas;
import android.text.TextUtils;
import f1.AbstractC0870c;
import h0.AbstractC0982e;
import h0.AbstractC0993p;
import h0.C0972Q;
import h0.InterfaceC0995r;
import j0.AbstractC1299e;

/* renamed from: H0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209a {
    public final P0.c a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3096b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3097c;

    /* renamed from: d, reason: collision with root package name */
    public final I0.y f3098d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f3099e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3100f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2  */
    /* JADX WARN: Type inference failed for: r1v34, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0209a(P0.c r17, int r18, boolean r19, long r20) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.C0209a.<init>(P0.c, int, boolean, long):void");
    }

    public final I0.y a(int i7, int i8, TextUtils.TruncateAt truncateAt, int i9, int i10, int i11, int i12, int i13) {
        u uVar;
        float fD = d();
        P0.c cVar = this.a;
        P0.a aVar = P0.b.a;
        w wVar = cVar.f7693l.f3095c;
        return new I0.y(this.f3099e, fD, cVar.f7698q, i7, truncateAt, cVar.f7703v, (wVar == null || (uVar = wVar.f3155b) == null) ? false : uVar.a, i9, i11, i12, i13, i10, i8, cVar.f7700s);
    }

    public final float b() {
        return this.f3098d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(g0.d r12, int r13, C2.C0028a r14) {
        /*
            r11 = this;
            android.graphics.RectF r4 = h0.AbstractC0968M.v(r12)
            r12 = 1
            r8 = 0
            if (r13 != 0) goto L9
            goto Ld
        L9:
            if (r13 != r12) goto Ld
            r13 = r12
            goto Le
        Ld:
            r13 = r8
        Le:
            D.S r6 = new D.S
            r0 = 2
            r6.<init>(r0, r14)
            int r14 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            r1 = r0
            I0.y r0 = r11.f3098d
            if (r14 < r1) goto L28
            r0.getClass()
            I0.b r14 = I0.b.a
            int[] r13 = r14.a(r0, r4, r13, r6)
            goto Lbf
        L28:
            B1.d r2 = r0.c()
            android.text.Layout r1 = r0.f3924e
            if (r13 != r12) goto L41
            F.w r13 = new F.w
            java.lang.CharSequence r14 = r1.getText()
            B1.G r3 = r0.j()
            r5 = 21
            r13.<init>(r5, r14, r3)
        L3f:
            r5 = r13
            goto L58
        L41:
            java.lang.CharSequence r13 = r1.getText()
            r3 = 29
            if (r14 < r3) goto L52
            J0.c r14 = new J0.c
            android.text.TextPaint r3 = r0.a
            r14.<init>(r13, r3)
        L50:
            r13 = r14
            goto L3f
        L52:
            J0.d r14 = new J0.d
            r14.<init>(r13)
            goto L50
        L58:
            float r13 = r4.top
            int r13 = (int) r13
            int r13 = r1.getLineForVertical(r13)
            float r14 = r4.top
            float r3 = r0.e(r13)
            int r14 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r14 <= 0) goto L70
            int r13 = r13 + 1
            int r14 = r0.f3925f
            if (r13 < r14) goto L70
            goto Laf
        L70:
            r3 = r13
            float r13 = r4.bottom
            int r13 = (int) r13
            int r13 = r1.getLineForVertical(r13)
            if (r13 != 0) goto L85
            float r14 = r4.bottom
            float r7 = r0.g(r8)
            int r14 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r14 >= 0) goto L85
            goto Laf
        L85:
            r7 = 1
            int r14 = I0.t.d(r0, r1, r2, r3, r4, r5, r6, r7)
        L8a:
            r9 = r3
            r10 = -1
            if (r14 != r10) goto L98
            if (r9 >= r13) goto L98
            int r3 = r9 + 1
            r7 = 1
            int r14 = I0.t.d(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L8a
        L98:
            if (r14 != r10) goto L9b
            goto Laf
        L9b:
            r7 = 0
            r3 = r13
            int r13 = I0.t.d(r0, r1, r2, r3, r4, r5, r6, r7)
        La1:
            if (r13 != r10) goto Lad
            if (r9 >= r3) goto Lad
            int r3 = r3 + (-1)
            r7 = 0
            int r13 = I0.t.d(r0, r1, r2, r3, r4, r5, r6, r7)
            goto La1
        Lad:
            if (r13 != r10) goto Lb1
        Laf:
            r13 = 0
            goto Lbf
        Lb1:
            int r14 = r14 + r12
            int r14 = r5.f(r14)
            int r13 = r13 - r12
            int r13 = r5.g(r13)
            int[] r13 = new int[]{r14, r13}
        Lbf:
            if (r13 != 0) goto Lc4
            long r12 = H0.H.f3091b
            return r12
        Lc4:
            r14 = r13[r8]
            r12 = r13[r12]
            long r12 = l4.AbstractC1420H.c(r14, r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.C0209a.c(g0.d, int, C2.a):long");
    }

    public final float d() {
        return T0.a.h(this.f3097c);
    }

    public final void e(InterfaceC0995r interfaceC0995r) {
        Canvas canvasA = AbstractC0982e.a(interfaceC0995r);
        I0.y yVar = this.f3098d;
        if (yVar.f3922c) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, d(), b());
        }
        if (canvasA.getClipBounds(yVar.f3934o)) {
            int i7 = yVar.f3926g;
            if (i7 != 0) {
                canvasA.translate(0.0f, i7);
            }
            I0.x xVar = I0.z.a;
            xVar.a = canvasA;
            yVar.f3924e.draw(xVar);
            if (i7 != 0) {
                canvasA.translate(0.0f, (-1) * i7);
            }
        }
        if (yVar.f3922c) {
            canvasA.restore();
        }
    }

    public final void f(InterfaceC0995r interfaceC0995r, long j7, C0972Q c0972q, S0.j jVar, AbstractC1299e abstractC1299e) {
        P0.e eVar = this.a.f7698q;
        int i7 = eVar.f7708c;
        eVar.d(j7);
        eVar.f(c0972q);
        eVar.g(jVar);
        eVar.e(abstractC1299e);
        eVar.b(3);
        e(interfaceC0995r);
        eVar.b(i7);
    }

    public final void g(InterfaceC0995r interfaceC0995r, AbstractC0993p abstractC0993p, float f5, C0972Q c0972q, S0.j jVar, AbstractC1299e abstractC1299e) {
        P0.e eVar = this.a.f7698q;
        int i7 = eVar.f7708c;
        eVar.c(abstractC0993p, AbstractC0870c.F(d(), b()), f5);
        eVar.f(c0972q);
        eVar.g(jVar);
        eVar.e(abstractC1299e);
        eVar.b(3);
        e(interfaceC0995r);
        eVar.b(i7);
    }
}
