package H0;

import B1.C0017d;
import android.graphics.RectF;
import android.text.Layout;
import b1.AbstractC0703b;
import e5.AbstractC0832b;
import h0.AbstractC0968M;
import h0.C0987j;
import java.text.BreakIterator;
import java.util.ArrayList;
import l4.AbstractC1420H;
import v.c0;

/* loaded from: classes.dex */
public final class F {
    public final E a;

    /* renamed from: b, reason: collision with root package name */
    public final n f3083b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3084c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3085d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3086e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3087f;

    public F(E e7, n nVar, long j7) {
        this.a = e7;
        this.f3083b = nVar;
        this.f3084c = j7;
        ArrayList arrayList = nVar.f3134h;
        float fD = 0.0f;
        this.f3085d = arrayList.isEmpty() ? 0.0f : ((p) arrayList.get(0)).a.f3098d.d(0);
        if (!arrayList.isEmpty()) {
            p pVar = (p) P3.q.A0(arrayList);
            fD = pVar.a.f3098d.d(r4.f3925f - 1) + pVar.f3141f;
        }
        this.f3086e = fD;
        this.f3087f = nVar.f3133g;
    }

    public final S0.h a(int i7) {
        n nVar = this.f3083b;
        nVar.i(i7);
        int length = ((C0214f) nVar.a.f318l).a.length();
        ArrayList arrayList = nVar.f3134h;
        p pVar = (p) arrayList.get(i7 == length ? P3.r.y(arrayList) : android.support.v4.media.session.b.o(i7, arrayList));
        return pVar.a.f3098d.f3924e.isRtlCharAt(pVar.b(i7)) ? S0.h.f8713l : S0.h.f8712k;
    }

    public final g0.d b(int i7) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        n nVar = this.f3083b;
        nVar.h(i7);
        ArrayList arrayList = nVar.f3134h;
        p pVar = (p) arrayList.get(android.support.v4.media.session.b.o(i7, arrayList));
        C0209a c0209a = pVar.a;
        int iB = pVar.b(i7);
        CharSequence charSequence = c0209a.f3099e;
        if (iB < 0 || iB >= charSequence.length()) {
            StringBuilder sbP = AbstractC0703b.p(iB, "offset(", ") is out of bounds [0,");
            sbP.append(charSequence.length());
            sbP.append(')');
            throw new IllegalArgumentException(sbP.toString().toString());
        }
        I0.y yVar = c0209a.f3098d;
        Layout layout = yVar.f3924e;
        int lineForOffset = layout.getLineForOffset(iB);
        float fG = yVar.g(lineForOffset);
        float fE = yVar.e(lineForOffset);
        boolean z7 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iB);
        if (!z7 || zIsRtlCharAt) {
            if (z7 && zIsRtlCharAt) {
                fH = yVar.i(iB, false);
                fH2 = yVar.i(iB + 1, true);
            } else if (zIsRtlCharAt) {
                fH = yVar.h(iB, false);
                fH2 = yVar.h(iB + 1, true);
            } else {
                fI = yVar.i(iB, false);
                fI2 = yVar.i(iB + 1, true);
            }
            float f5 = fH;
            fI = fH2;
            fI2 = f5;
        } else {
            fI = yVar.h(iB, false);
            fI2 = yVar.h(iB + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        float f7 = rectF.left;
        float f8 = rectF.top;
        float f9 = rectF.right;
        float f10 = rectF.bottom;
        long jE = AbstractC0832b.e(0.0f, pVar.f3141f);
        return new g0.d(g0.c.d(jE) + f7, g0.c.e(jE) + f8, g0.c.d(jE) + f9, g0.c.e(jE) + f10);
    }

    public final g0.d c(int i7) {
        n nVar = this.f3083b;
        nVar.i(i7);
        int length = ((C0214f) nVar.a.f318l).a.length();
        ArrayList arrayList = nVar.f3134h;
        p pVar = (p) arrayList.get(i7 == length ? P3.r.y(arrayList) : android.support.v4.media.session.b.o(i7, arrayList));
        C0209a c0209a = pVar.a;
        int iB = pVar.b(i7);
        CharSequence charSequence = c0209a.f3099e;
        if (iB < 0 || iB > charSequence.length()) {
            StringBuilder sbP = AbstractC0703b.p(iB, "offset(", ") is out of bounds [0,");
            sbP.append(charSequence.length());
            sbP.append(']');
            throw new IllegalArgumentException(sbP.toString().toString());
        }
        I0.y yVar = c0209a.f3098d;
        float fH = yVar.h(iB, false);
        int lineForOffset = yVar.f3924e.getLineForOffset(iB);
        float fG = yVar.g(lineForOffset);
        float fE = yVar.e(lineForOffset);
        long jE = AbstractC0832b.e(0.0f, pVar.f3141f);
        return new g0.d(g0.c.d(jE) + fH, g0.c.e(jE) + fG, g0.c.d(jE) + fH, g0.c.e(jE) + fE);
    }

    public final int d(int i7, boolean z7) {
        int iF;
        n nVar = this.f3083b;
        nVar.j(i7);
        ArrayList arrayList = nVar.f3134h;
        p pVar = (p) arrayList.get(android.support.v4.media.session.b.p(i7, arrayList));
        C0209a c0209a = pVar.a;
        int i8 = i7 - pVar.f3139d;
        I0.y yVar = c0209a.f3098d;
        if (z7) {
            Layout layout = yVar.f3924e;
            if (layout.getEllipsisStart(i8) == 0) {
                C0017d c0017dC = yVar.c();
                Layout layout2 = (Layout) c0017dC.f318l;
                iF = c0017dC.A(layout2.getLineEnd(i8), layout2.getLineStart(i8));
            } else {
                iF = layout.getEllipsisStart(i8) + layout.getLineStart(i8);
            }
        } else {
            iF = yVar.f(i8);
        }
        return iF + pVar.f3137b;
    }

    public final int e(int i7) {
        n nVar = this.f3083b;
        int length = ((C0214f) nVar.a.f318l).a.length();
        ArrayList arrayList = nVar.f3134h;
        p pVar = (p) arrayList.get(i7 >= length ? P3.r.y(arrayList) : i7 < 0 ? 0 : android.support.v4.media.session.b.o(i7, arrayList));
        return pVar.a.f3098d.f3924e.getLineForOffset(pVar.b(i7)) + pVar.f3139d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f5 = (F) obj;
        return kotlin.jvm.internal.l.a(this.a, f5.a) && this.f3083b.equals(f5.f3083b) && T0.j.a(this.f3084c, f5.f3084c) && this.f3085d == f5.f3085d && this.f3086e == f5.f3086e && kotlin.jvm.internal.l.a(this.f3087f, f5.f3087f);
    }

    public final float f(int i7) {
        n nVar = this.f3083b;
        nVar.j(i7);
        ArrayList arrayList = nVar.f3134h;
        p pVar = (p) arrayList.get(android.support.v4.media.session.b.p(i7, arrayList));
        C0209a c0209a = pVar.a;
        int i8 = i7 - pVar.f3139d;
        I0.y yVar = c0209a.f3098d;
        return yVar.f3924e.getLineLeft(i8) + (i8 == yVar.f3925f + (-1) ? yVar.f3928i : 0.0f);
    }

    public final float g(int i7) {
        n nVar = this.f3083b;
        nVar.j(i7);
        ArrayList arrayList = nVar.f3134h;
        p pVar = (p) arrayList.get(android.support.v4.media.session.b.p(i7, arrayList));
        C0209a c0209a = pVar.a;
        int i8 = i7 - pVar.f3139d;
        I0.y yVar = c0209a.f3098d;
        return yVar.f3924e.getLineRight(i8) + (i8 == yVar.f3925f + (-1) ? yVar.f3929j : 0.0f);
    }

    public final int h(int i7) {
        n nVar = this.f3083b;
        nVar.j(i7);
        ArrayList arrayList = nVar.f3134h;
        p pVar = (p) arrayList.get(android.support.v4.media.session.b.p(i7, arrayList));
        C0209a c0209a = pVar.a;
        return c0209a.f3098d.f3924e.getLineStart(i7 - pVar.f3139d) + pVar.f3137b;
    }

    public final int hashCode() {
        return this.f3087f.hashCode() + AbstractC0703b.b(this.f3086e, AbstractC0703b.b(this.f3085d, AbstractC0703b.c((this.f3083b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.f3084c), 31), 31);
    }

    public final S0.h i(int i7) {
        n nVar = this.f3083b;
        nVar.i(i7);
        int length = ((C0214f) nVar.a.f318l).a.length();
        ArrayList arrayList = nVar.f3134h;
        p pVar = (p) arrayList.get(i7 == length ? P3.r.y(arrayList) : android.support.v4.media.session.b.o(i7, arrayList));
        C0209a c0209a = pVar.a;
        int iB = pVar.b(i7);
        I0.y yVar = c0209a.f3098d;
        return yVar.f3924e.getParagraphDirection(yVar.f3924e.getLineForOffset(iB)) == 1 ? S0.h.f8712k : S0.h.f8713l;
    }

    public final C0987j j(int i7, int i8) {
        n nVar = this.f3083b;
        C0214f c0214f = (C0214f) nVar.a.f318l;
        if (i7 < 0 || i7 > i8 || i8 > c0214f.a.length()) {
            StringBuilder sbB = c0.b("Start(", i7, ") or End(", i8, ") is out of range [0..");
            sbB.append(c0214f.a.length());
            sbB.append("), or start > end!");
            throw new IllegalArgumentException(sbB.toString().toString());
        }
        if (i7 == i8) {
            return AbstractC0968M.h();
        }
        C0987j c0987jH = AbstractC0968M.h();
        android.support.v4.media.session.b.r(nVar.f3134h, AbstractC1420H.c(i7, i8), new E.c(c0987jH, i7, i8, 3));
        return c0987jH;
    }

    public final long k(int i7) {
        int iPreceding;
        int iFollowing;
        int iFollowing2;
        n nVar = this.f3083b;
        nVar.i(i7);
        int length = ((C0214f) nVar.a.f318l).a.length();
        ArrayList arrayList = nVar.f3134h;
        p pVar = (p) arrayList.get(i7 == length ? P3.r.y(arrayList) : android.support.v4.media.session.b.o(i7, arrayList));
        C0209a c0209a = pVar.a;
        int iB = pVar.b(i7);
        B1.G gJ = c0209a.f3098d.j();
        gJ.b(iB);
        BreakIterator breakIterator = (BreakIterator) gJ.f296e;
        if (gJ.r(breakIterator.preceding(iB))) {
            gJ.b(iB);
            iPreceding = iB;
            while (iPreceding != -1 && (!gJ.r(iPreceding) || gJ.p(iPreceding))) {
                gJ.b(iPreceding);
                iPreceding = breakIterator.preceding(iPreceding);
            }
        } else {
            gJ.b(iB);
            iPreceding = gJ.q(iB) ? (!breakIterator.isBoundary(iB) || gJ.o(iB)) ? breakIterator.preceding(iB) : iB : gJ.o(iB) ? breakIterator.preceding(iB) : -1;
        }
        if (iPreceding == -1) {
            iPreceding = iB;
        }
        gJ.b(iB);
        if (gJ.p(breakIterator.following(iB))) {
            gJ.b(iB);
            iFollowing = iB;
            while (iFollowing != -1 && (gJ.r(iFollowing) || !gJ.p(iFollowing))) {
                gJ.b(iFollowing);
                iFollowing = breakIterator.following(iFollowing);
            }
        } else {
            gJ.b(iB);
            if (gJ.o(iB)) {
                if (!breakIterator.isBoundary(iB) || gJ.q(iB)) {
                    iFollowing2 = breakIterator.following(iB);
                    iFollowing = iFollowing2;
                } else {
                    iFollowing = iB;
                }
            } else if (gJ.q(iB)) {
                iFollowing2 = breakIterator.following(iB);
                iFollowing = iFollowing2;
            } else {
                iFollowing = -1;
            }
        }
        if (iFollowing != -1) {
            iB = iFollowing;
        }
        return pVar.a(AbstractC1420H.c(iPreceding, iB), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.f3083b + ", size=" + ((Object) T0.j.b(this.f3084c)) + ", firstBaseline=" + this.f3085d + ", lastBaseline=" + this.f3086e + ", placeholderRects=" + this.f3087f + ')';
    }
}
