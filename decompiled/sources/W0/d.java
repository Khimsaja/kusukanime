package W0;

import P3.z;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import w0.InterfaceC2173H;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import w0.InterfaceC2197o;
import y0.C2349D;

/* loaded from: classes.dex */
public final class d implements InterfaceC2173H {
    public final /* synthetic */ q a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2349D f9524b;

    public d(q qVar, C2349D c2349d) {
        this.a = qVar;
        this.f9524b = c2349d;
    }

    @Override // w0.InterfaceC2173H
    public final int a(InterfaceC2197o interfaceC2197o, List list, int i7) {
        q qVar = this.a;
        ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
        kotlin.jvm.internal.l.c(layoutParams);
        qVar.measure(i.e(qVar, 0, i7, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return qVar.getMeasuredHeight();
    }

    @Override // w0.InterfaceC2173H
    public final InterfaceC2174I b(InterfaceC2175J interfaceC2175J, List list, long j7) {
        q qVar = this.a;
        int childCount = qVar.getChildCount();
        z zVar = z.f7780k;
        if (childCount == 0) {
            return interfaceC2175J.T(T0.a.j(j7), T0.a.i(j7), zVar, a.f9515n);
        }
        if (T0.a.j(j7) != 0) {
            qVar.getChildAt(0).setMinimumWidth(T0.a.j(j7));
        }
        if (T0.a.i(j7) != 0) {
            qVar.getChildAt(0).setMinimumHeight(T0.a.i(j7));
        }
        int iJ = T0.a.j(j7);
        int iH = T0.a.h(j7);
        ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
        kotlin.jvm.internal.l.c(layoutParams);
        int iE = i.e(qVar, iJ, iH, layoutParams.width);
        int i7 = T0.a.i(j7);
        int iG = T0.a.g(j7);
        ViewGroup.LayoutParams layoutParams2 = qVar.getLayoutParams();
        kotlin.jvm.internal.l.c(layoutParams2);
        qVar.measure(iE, i.e(qVar, i7, iG, layoutParams2.height));
        return interfaceC2175J.T(qVar.getMeasuredWidth(), qVar.getMeasuredHeight(), zVar, new b(qVar, this.f9524b, 1));
    }

    @Override // w0.InterfaceC2173H
    public final int c(InterfaceC2197o interfaceC2197o, List list, int i7) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        q qVar = this.a;
        ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
        kotlin.jvm.internal.l.c(layoutParams);
        qVar.measure(iMakeMeasureSpec, i.e(qVar, 0, i7, layoutParams.height));
        return qVar.getMeasuredWidth();
    }

    @Override // w0.InterfaceC2173H
    public final int d(InterfaceC2197o interfaceC2197o, List list, int i7) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        q qVar = this.a;
        ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
        kotlin.jvm.internal.l.c(layoutParams);
        qVar.measure(iMakeMeasureSpec, i.e(qVar, 0, i7, layoutParams.height));
        return qVar.getMeasuredWidth();
    }

    @Override // w0.InterfaceC2173H
    public final int e(InterfaceC2197o interfaceC2197o, List list, int i7) {
        q qVar = this.a;
        ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
        kotlin.jvm.internal.l.c(layoutParams);
        qVar.measure(i.e(qVar, 0, i7, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return qVar.getMeasuredHeight();
    }
}
