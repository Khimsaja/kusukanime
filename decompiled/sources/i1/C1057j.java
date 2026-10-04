package i1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: i1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1057j extends C1055h {

    /* renamed from: b, reason: collision with root package name */
    public View f11976b;

    /* JADX WARN: Type inference failed for: r4v0, types: [i1.i] */
    @Override // i1.C1055h
    public final void a() {
        View view = this.f11976b;
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.a();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ?? r42 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: i1.i
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i7) {
                atomicBoolean.set((i7 & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(r42);
        if (!atomicBoolean.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(r42);
        windowInsetsController.hide(WindowInsets.Type.ime());
    }

    @Override // i1.C1055h
    public final void b() {
        View view = this.f11976b;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.b();
    }
}
