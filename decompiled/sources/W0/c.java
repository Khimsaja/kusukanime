package W0;

import O3.C;
import android.view.MotionEvent;
import io.ktor.util.GzipHeaderFlags;
import y0.e0;
import z0.C2471u;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9522l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f9523m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(q qVar, int i7) {
        super(1);
        this.f9522l = i7;
        this.f9523m = qVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.f9522l) {
            case 0:
                e0 e0Var = (e0) obj;
                C2471u c2471u = e0Var instanceof C2471u ? (C2471u) e0Var : null;
                q qVar = this.f9523m;
                if (c2471u != null) {
                    A.m mVar = new A.m(18, c2471u, qVar);
                    Q.d dVar = c2471u.A0;
                    if (!dVar.h(mVar)) {
                        dVar.b(mVar);
                    }
                }
                qVar.removeAllViewsInLayout();
                return C.a;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                q qVar2 = this.f9523m;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case GzipHeaderFlags.EXTRA /* 4 */:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = qVar2.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = qVar2.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
