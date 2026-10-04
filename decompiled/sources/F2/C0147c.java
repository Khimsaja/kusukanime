package F2;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: F2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0147c extends View implements L {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2311k;

    /* renamed from: l, reason: collision with root package name */
    public List f2312l;

    /* renamed from: m, reason: collision with root package name */
    public float f2313m;

    /* renamed from: n, reason: collision with root package name */
    public C0148d f2314n;

    /* renamed from: o, reason: collision with root package name */
    public float f2315o;

    public C0147c(Context context) {
        super(context, null);
        this.f2311k = new ArrayList();
        this.f2312l = Collections.EMPTY_LIST;
        this.f2313m = 0.0533f;
        this.f2314n = C0148d.f2316g;
        this.f2315o = 0.08f;
    }

    @Override // F2.L
    public final void a(List list, C0148d c0148d, float f5, float f7) {
        this.f2312l = list;
        this.f2314n = c0148d;
        this.f2313m = f5;
        this.f2315o = f7;
        while (true) {
            ArrayList arrayList = this.f2311k;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new K(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x046c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r37) {
        /*
            Method dump skipped, instructions count: 1179
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.C0147c.dispatchDraw(android.graphics.Canvas):void");
    }
}
