package y3;

import O.C0509o0;
import O.C0510p;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e4.InterfaceC0821a;
import f1.AbstractC0870c;
import i1.T;
import i1.U;
import i1.V;
import u3.C2076a;
import v3.C2151a;

/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2412a {
    public static final W.a a;

    /* renamed from: b, reason: collision with root package name */
    public static final W.a f18244b;

    /* renamed from: c, reason: collision with root package name */
    public static final W.a f18245c;

    /* renamed from: d, reason: collision with root package name */
    public static final W.a f18246d;

    static {
        new W.a(false, 6283415, new C2151a(15));
        a = new W.a(false, -158414052, new C2151a(16));
        f18244b = new W.a(false, 2116675266, new C2076a(19));
        f18245c = new W.a(false, 1887229083, new C2151a(17));
        f18246d = new W.a(false, -2111583711, new C2076a(20));
    }

    public static final void a(InterfaceC0821a interfaceC0821a, W.a aVar, C0510p c0510p, int i7) {
        kotlin.jvm.internal.l.f("onDismiss", interfaceC0821a);
        c0510p.T(-1539144946);
        int i8 = (c0510p.h(interfaceC0821a) ? 4 : 2) | i7;
        if ((i8 & 19) == 18 && c0510p.y()) {
            c0510p.M();
        } else {
            android.support.v4.media.session.b.a(interfaceC0821a, new X0.q(true, true, 1, false, false), W.f.b(-1376088987, new A3.h(10, (View) c0510p.k(AndroidCompositionLocals_androidKt.f10673f), aVar), c0510p), c0510p, (i8 & 14) | 432);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new A3.h(interfaceC0821a, aVar, i7, 11);
        }
    }

    public static final void b(Window window) {
        window.addFlags(1024);
        window.getDecorView().setSystemUiVisibility(5894);
        X4.y yVar = new X4.y(window.getDecorView());
        int i7 = Build.VERSION.SDK_INT;
        AbstractC0870c v5 = i7 >= 35 ? new V(window, yVar, 1) : i7 >= 30 ? new T(window, yVar, 1) : i7 >= 26 ? new U(window, yVar, 0) : new T(window, yVar, 0);
        v5.W();
        v5.f0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final X0.r c(View view) {
        if (view == 0) {
            return null;
        }
        X0.r rVar = view instanceof X0.r ? (X0.r) view : null;
        if (rVar != null) {
            return rVar;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                X0.r rVarC = c(viewGroup.getChildAt(i7));
                if (rVarC != null) {
                    return rVarC;
                }
            }
        }
        return null;
    }
}
