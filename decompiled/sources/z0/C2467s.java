package z0;

import android.os.SystemClock;
import android.view.MotionEvent;
import e4.InterfaceC0821a;

/* renamed from: z0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2467s extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f18833l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2471u f18834m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2467s(C2471u c2471u, int i7) {
        super(0);
        this.f18833l = i7;
        this.f18834m = c2471u;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        int actionMasked;
        switch (this.f18833l) {
            case 0:
                C2471u c2471u = this.f18834m;
                MotionEvent motionEvent = c2471u.f18910x0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    c2471u.f18912y0 = SystemClock.uptimeMillis();
                    c2471u.post(c2471u.f18847B0);
                }
                return O3.C.a;
            default:
                return this.f18834m.get_viewTreeOwners();
        }
    }
}
