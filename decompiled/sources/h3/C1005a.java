package h3;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import f1.AbstractC0870c;
import g0.f;
import kotlin.jvm.internal.l;

/* renamed from: h3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1005a implements Drawable.Callback {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1006b f11846k;

    public C1005a(C1006b c1006b) {
        this.f11846k = c1006b;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        l.f("d", drawable);
        C1006b c1006b = this.f11846k;
        c1006b.f11848p.setValue(Integer.valueOf(((Number) c1006b.f11848p.getValue()).intValue() + 1));
        Object obj = AbstractC1008d.a;
        Drawable drawable2 = c1006b.f11847o;
        c1006b.f11849q.setValue(new f((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : AbstractC0870c.F(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [O3.i, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        l.f("d", drawable);
        l.f("what", runnable);
        ((Handler) AbstractC1008d.a.getValue()).postAtTime(runnable, j7);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [O3.i, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        l.f("d", drawable);
        l.f("what", runnable);
        ((Handler) AbstractC1008d.a.getValue()).removeCallbacks(runnable);
    }
}
