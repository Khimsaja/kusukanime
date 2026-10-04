package F2;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class T extends FrameLayout implements L {

    /* renamed from: k, reason: collision with root package name */
    public final C0147c f2303k;

    /* renamed from: l, reason: collision with root package name */
    public final Q f2304l;

    /* renamed from: m, reason: collision with root package name */
    public List f2305m;

    /* renamed from: n, reason: collision with root package name */
    public C0148d f2306n;

    /* renamed from: o, reason: collision with root package name */
    public float f2307o;

    /* renamed from: p, reason: collision with root package name */
    public float f2308p;

    public T(Context context) {
        super(context, null);
        this.f2305m = Collections.EMPTY_LIST;
        this.f2306n = C0148d.f2316g;
        this.f2307o = 0.0533f;
        this.f2308p = 0.08f;
        C0147c c0147c = new C0147c(context);
        this.f2303k = c0147c;
        Q q6 = new Q(context, null);
        this.f2304l = q6;
        q6.setBackgroundColor(0);
        addView(c0147c);
        addView(q6);
    }

    @Override // F2.L
    public final void a(List list, C0148d c0148d, float f5, float f7) {
        this.f2306n = c0148d;
        this.f2307o = f5;
        this.f2308p = f7;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            A1.b bVar = (A1.b) list.get(i7);
            if (bVar.f73d != null) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        if (!this.f2305m.isEmpty() || !arrayList2.isEmpty()) {
            this.f2305m = arrayList2;
            c();
        }
        this.f2303k.a(arrayList, c0148d, f5, f7);
        invalidate();
    }

    public final String b(float f5, int i7) {
        float fR = P3.F.R(i7, f5, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fR == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fR / getContext().getResources().getDisplayMetrics().density)};
        int i8 = B1.K.a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x053f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.T.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        if (!z7 || this.f2305m.isEmpty()) {
            return;
        }
        c();
    }
}
