package F;

import C2.C0034g;
import D.C0053g0;
import H.S;
import H0.H;
import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import f6.AbstractC0915m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import z0.S0;

/* loaded from: classes.dex */
public final class C {
    public final View a;

    /* renamed from: b, reason: collision with root package name */
    public final w f1981b;

    /* renamed from: e, reason: collision with root package name */
    public C0053g0 f1984e;

    /* renamed from: f, reason: collision with root package name */
    public S f1985f;

    /* renamed from: g, reason: collision with root package name */
    public S0 f1986g;

    /* renamed from: l, reason: collision with root package name */
    public Rect f1991l;

    /* renamed from: m, reason: collision with root package name */
    public final z f1992m;

    /* renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.m f1982c = C0138a.f2004n;

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.m f1983d = C0138a.f2005o;

    /* renamed from: h, reason: collision with root package name */
    public N0.w f1987h = new N0.w("", H.f3091b, 4);

    /* renamed from: i, reason: collision with root package name */
    public N0.l f1988i = N0.l.f6879g;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f1989j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final Object f1990k = z1.c.B(O3.j.f7526l, new B.e(5, this));

    public C(View view, C0141d c0141d, w wVar) {
        this.a = view;
        this.f1981b = wVar;
        this.f1992m = new z(c0141d, wVar);
    }

    public final E a(EditorInfo editorInfo) {
        int i7;
        int i8;
        int i9 = 3;
        N0.w wVar = this.f1987h;
        String str = wVar.a.a;
        N0.l lVar = this.f1988i;
        int i10 = lVar.f6883e;
        boolean z7 = lVar.a;
        if (i10 == 1) {
            i7 = z7 ? 6 : 0;
        } else if (i10 == 0) {
            i7 = 1;
        } else if (i10 == 2) {
            i7 = 2;
        } else if (i10 == 6) {
            i7 = 5;
        } else if (i10 == 5) {
            i7 = 7;
        } else if (i10 == 3) {
            i7 = 3;
        } else if (i10 == 4) {
            i7 = 4;
        } else {
            if (i10 != 7) {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
        editorInfo.imeOptions = i7;
        D.a.a(editorInfo, lVar.f6884f);
        int i11 = lVar.f6882d;
        if (i11 == 1) {
            i8 = 1;
        } else if (i11 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i8 = 1;
        } else if (i11 == 3) {
            i8 = 2;
        } else if (i11 == 4) {
            i8 = 3;
        } else if (i11 == 5) {
            i8 = 17;
        } else if (i11 == 6) {
            i8 = 33;
        } else if (i11 == 7) {
            i8 = 129;
        } else if (i11 == 8) {
            i8 = 18;
        } else {
            if (i11 != 9) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            i8 = 8194;
        }
        editorInfo.inputType = i8;
        if (!z7 && (i8 & 1) == 1) {
            editorInfo.inputType = i8 | 131072;
            if (lVar.f6883e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i12 = editorInfo.inputType;
        if ((i12 & 1) == 1) {
            int i13 = lVar.f6880b;
            if (i13 == 1) {
                editorInfo.inputType = i12 | 4096;
            } else if (i13 == 2) {
                editorInfo.inputType = i12 | 8192;
            } else if (i13 == 3) {
                editorInfo.inputType = i12 | 16384;
            }
            if (lVar.f6881c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i14 = H.f3092c;
        long j7 = wVar.f6896b;
        editorInfo.initialSelStart = (int) (j7 >> 32);
        editorInfo.initialSelEnd = (int) (j7 & 4294967295L);
        AbstractC0915m.H(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!E.e.a || i11 == 7 || i11 == 8) {
            AbstractC0915m.I(editorInfo, false);
        } else {
            AbstractC0915m.I(editorInfo, true);
            r.a.a(editorInfo);
        }
        A a = B.a;
        if (p1.g.c()) {
            p1.g.a().f(editorInfo);
        }
        E e7 = new E(this.f1987h, new C0034g(i9, this), this.f1988i.f6881c, this.f1984e, this.f1985f, this.f1986g);
        this.f1989j.add(new WeakReference(e7));
        return e7;
    }
}
