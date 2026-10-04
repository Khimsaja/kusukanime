package i1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* renamed from: i1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC1060m implements View.OnApplyWindowInsetsListener {
    public S a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f11980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1053f f11981c;

    public ViewOnApplyWindowInsetsListenerC1060m(View view, InterfaceC1053f interfaceC1053f) {
        this.f11980b = view;
        this.f11981c = interfaceC1053f;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        S sB = S.b(view, windowInsets);
        int i7 = Build.VERSION.SDK_INT;
        InterfaceC1053f interfaceC1053f = this.f11981c;
        if (i7 < 30) {
            AbstractC1061n.a(windowInsets, this.f11980b);
            if (sB.equals(this.a)) {
                return ((v.P) interfaceC1053f).a(view, sB).a();
            }
        }
        this.a = sB;
        S sA = ((v.P) interfaceC1053f).a(view, sB);
        if (i7 >= 30) {
            return sA.a();
        }
        Field field = AbstractC1067u.a;
        AbstractC1059l.a(view);
        return sA.a();
    }
}
