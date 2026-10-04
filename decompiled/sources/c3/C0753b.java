package c3;

import D4.S;
import O3.j;
import android.graphics.Bitmap;
import f6.C0895I;
import f6.C0920r;
import g3.AbstractC0946e;
import kotlin.jvm.internal.l;
import w6.A;
import w6.C;
import z5.AbstractC2510o;

/* renamed from: c3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0753b {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11146b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11147c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11148d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11149e;

    /* renamed from: f, reason: collision with root package name */
    public final C0920r f11150f;

    public C0753b(C c2) throws NumberFormatException {
        j jVar = j.f7526l;
        this.a = z1.c.B(jVar, new C0752a(this, 0));
        this.f11146b = z1.c.B(jVar, new C0752a(this, 1));
        this.f11147c = Long.parseLong(c2.s(Long.MAX_VALUE));
        this.f11148d = Long.parseLong(c2.s(Long.MAX_VALUE));
        this.f11149e = Integer.parseInt(c2.s(Long.MAX_VALUE)) > 0;
        int i7 = Integer.parseInt(c2.s(Long.MAX_VALUE));
        S s7 = new S(5, false);
        for (int i8 = 0; i8 < i7; i8++) {
            String strS = c2.s(Long.MAX_VALUE);
            Bitmap.Config config = AbstractC0946e.a;
            int iD0 = AbstractC2510o.d0(strS, ':', 0, 6);
            if (iD0 == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strS).toString());
            }
            String strSubstring = strS.substring(0, iD0);
            l.e("substring(...)", strSubstring);
            String string = AbstractC2510o.J0(strSubstring).toString();
            String strSubstring2 = strS.substring(iD0 + 1);
            l.e("substring(...)", strSubstring2);
            s7.k(string, strSubstring2);
        }
        this.f11150f = s7.l();
    }

    public final void a(A a) {
        a.S(this.f11147c);
        a.A(10);
        a.S(this.f11148d);
        a.A(10);
        a.S(this.f11149e ? 1L : 0L);
        a.A(10);
        C0920r c0920r = this.f11150f;
        a.S(c0920r.size());
        a.A(10);
        int size = c0920r.size();
        for (int i7 = 0; i7 < size; i7++) {
            a.R(c0920r.h(i7));
            a.R(": ");
            a.R(c0920r.m(i7));
            a.A(10);
        }
    }

    public C0753b(C0895I c0895i) {
        j jVar = j.f7526l;
        this.a = z1.c.B(jVar, new C0752a(this, 0));
        this.f11146b = z1.c.B(jVar, new C0752a(this, 1));
        this.f11147c = c0895i.f11505u;
        this.f11148d = c0895i.f11506v;
        this.f11149e = c0895i.f11499o != null;
        this.f11150f = c0895i.f11500p;
    }
}
