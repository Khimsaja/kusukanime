package z0;

import a0.p;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1;
import d0.InterfaceC0781b;
import io.ktor.util.GzipHeaderFlags;
import m.C1480a;
import m.C1485f;
import y0.AbstractC2359f;

/* renamed from: z0.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnDragListenerC2465q0 implements View.OnDragListener, InterfaceC0781b {
    public final d0.e a = new d0.e();

    /* renamed from: b, reason: collision with root package name */
    public final C1485f f18830b = new C1485f();

    /* renamed from: c, reason: collision with root package name */
    public final DragAndDropModifierOnDragListener$modifier$1 f18831c = new y0.S() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // y0.S
        public final p h() {
            return this.a.a;
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        @Override // y0.S
        public final /* bridge */ /* synthetic */ void m(p pVar) {
        }
    };

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        X4.y yVar = new X4.y(6, dragEvent);
        int action = dragEvent.getAction();
        d0.e eVar = this.a;
        y0.n0 n0Var = y0.n0.f17881k;
        switch (action) {
            case 1:
                kotlin.jvm.internal.t tVar = new kotlin.jvm.internal.t();
                d0.d dVar = new d0.d(yVar, eVar, tVar);
                if (dVar.invoke(eVar) == n0Var) {
                    AbstractC2359f.z(eVar, dVar);
                }
                boolean z7 = tVar.f12716k;
                C1485f c1485f = this.f18830b;
                c1485f.getClass();
                C1480a c1480a = new C1480a(c1485f);
                while (c1480a.hasNext()) {
                    ((d0.e) c1480a.next()).K0(yVar);
                }
                return z7;
            case 2:
                eVar.J0(yVar);
                return false;
            case 3:
                return eVar.G0(yVar);
            case GzipHeaderFlags.EXTRA /* 4 */:
                M0.B b4 = new M0.B(1, yVar);
                if (b4.invoke(eVar) == n0Var) {
                    AbstractC2359f.z(eVar, b4);
                    return false;
                }
                return false;
            case 5:
                eVar.H0(yVar);
                return false;
            case 6:
                eVar.I0(yVar);
                return false;
            default:
                return false;
        }
    }
}
