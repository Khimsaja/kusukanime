package o3;

import D.r;
import D.z0;
import O.H;
import O.Z;
import X4.y;
import android.app.Activity;
import android.view.Window;
import f1.AbstractC0870c;

/* renamed from: o3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1638e implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13606k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Activity f13607l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f13608m;

    public /* synthetic */ C1638e(Activity activity, Z z7, int i7) {
        this.f13606k = i7;
        this.f13607l = activity;
        this.f13608m = z7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        H h7 = (H) obj;
        switch (this.f13606k) {
            case 0:
                kotlin.jvm.internal.l.f("$this$DisposableEffect", h7);
                Activity activity = this.f13607l;
                Window window = activity != null ? activity.getWindow() : null;
                y yVar = window != null ? new y(window, window.getDecorView()) : null;
                if (((Boolean) this.f13608m.getValue()).booleanValue()) {
                    if (yVar != null) {
                        ((AbstractC0870c) yVar.f9916l).W();
                    }
                    if (yVar != null) {
                        ((AbstractC0870c) yVar.f9916l).f0();
                    }
                } else if (yVar != null) {
                    ((AbstractC0870c) yVar.f9916l).g0();
                }
                return new r(7, yVar);
            default:
                kotlin.jvm.internal.l.f("$this$DisposableEffect", h7);
                Activity activity2 = this.f13607l;
                Integer numValueOf = activity2 != null ? Integer.valueOf(activity2.getRequestedOrientation()) : null;
                if (((Boolean) this.f13608m.getValue()).booleanValue() && activity2 != null) {
                    activity2.setRequestedOrientation(6);
                } else if (activity2 != null) {
                    activity2.setRequestedOrientation(numValueOf != null ? numValueOf.intValue() : -1);
                }
                return new z0(7, activity2, numValueOf);
        }
    }
}
