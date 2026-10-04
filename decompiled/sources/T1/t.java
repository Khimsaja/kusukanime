package T1;

import android.hardware.display.DisplayManager;

/* loaded from: classes.dex */
public final class t implements DisplayManager.DisplayListener {
    public final DisplayManager a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f8959b;

    public t(v vVar, DisplayManager displayManager) {
        this.f8959b = vVar;
        this.a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i7) {
        if (i7 == 0) {
            v.a(this.f8959b, this.a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i7) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i7) {
    }
}
