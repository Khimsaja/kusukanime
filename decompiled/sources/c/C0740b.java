package c;

import android.window.BackEvent;
import b1.AbstractC0703b;

/* renamed from: c.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0740b {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11049b;

    /* renamed from: c, reason: collision with root package name */
    public final float f11050c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11051d;

    public C0740b(BackEvent backEvent) {
        float fH = AbstractC0739a.h(backEvent);
        float fI = AbstractC0739a.i(backEvent);
        float fE = AbstractC0739a.e(backEvent);
        int iG = AbstractC0739a.g(backEvent);
        this.a = fH;
        this.f11049b = fI;
        this.f11050c = fE;
        this.f11051d = iG;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.a);
        sb.append(", touchY=");
        sb.append(this.f11049b);
        sb.append(", progress=");
        sb.append(this.f11050c);
        sb.append(", swipeEdge=");
        return AbstractC0703b.l(sb, this.f11051d, '}');
    }
}
