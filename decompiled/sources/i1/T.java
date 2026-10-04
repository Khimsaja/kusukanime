package i1;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import f1.AbstractC0870c;

/* loaded from: classes.dex */
public class T extends AbstractC0870c {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Window f11965b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11966c;

    public T(Window window, X4.y yVar, int i7) {
        this.a = i7;
        switch (i7) {
            case 1:
                this.f11966c = window.getInsetsController();
                this.f11965b = window;
                break;
            default:
                this.f11965b = window;
                this.f11966c = yVar;
                break;
        }
    }

    @Override // f1.AbstractC0870c
    public final void W() {
        switch (this.a) {
            case 0:
                for (int i7 = 1; i7 <= 256; i7 <<= 1) {
                    if ((7 & i7) != 0) {
                        if (i7 == 1) {
                            j0(4);
                        } else if (i7 == 2) {
                            j0(2);
                        } else if (i7 == 8) {
                            ((C1055h) ((X4.y) this.f11966c).f9916l).a();
                        }
                    }
                }
                break;
            default:
                ((WindowInsetsController) this.f11966c).hide(7);
                break;
        }
    }

    @Override // f1.AbstractC0870c
    public void d0(boolean z7) {
        switch (this.a) {
            case 1:
                Window window = this.f11965b;
                if (!z7) {
                    if (window != null) {
                        k0(16);
                    }
                    ((WindowInsetsController) this.f11966c).setSystemBarsAppearance(0, 16);
                    break;
                } else {
                    if (window != null) {
                        j0(16);
                    }
                    ((WindowInsetsController) this.f11966c).setSystemBarsAppearance(16, 16);
                    break;
                }
        }
    }

    @Override // f1.AbstractC0870c
    public final void e0(boolean z7) {
        switch (this.a) {
            case 0:
                if (!z7) {
                    k0(8192);
                    break;
                } else {
                    Window window = this.f11965b;
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                    j0(8192);
                    break;
                }
            default:
                Window window2 = this.f11965b;
                if (!z7) {
                    if (window2 != null) {
                        k0(8192);
                    }
                    ((WindowInsetsController) this.f11966c).setSystemBarsAppearance(0, 8);
                    break;
                } else {
                    if (window2 != null) {
                        j0(8192);
                    }
                    ((WindowInsetsController) this.f11966c).setSystemBarsAppearance(8, 8);
                    break;
                }
        }
    }

    @Override // f1.AbstractC0870c
    public void f0() {
        switch (this.a) {
            case 0:
                this.f11965b.getDecorView().setTag(356039078, 2);
                k0(2048);
                j0(4096);
                break;
            default:
                Window window = this.f11965b;
                if (window == null) {
                    ((WindowInsetsController) this.f11966c).setSystemBarsBehavior(2);
                    break;
                } else {
                    window.getDecorView().setTag(356039078, 2);
                    k0(2048);
                    j0(4096);
                    break;
                }
        }
    }

    @Override // f1.AbstractC0870c
    public final void g0() {
        switch (this.a) {
            case 0:
                for (int i7 = 1; i7 <= 256; i7 <<= 1) {
                    if ((7 & i7) != 0) {
                        if (i7 == 1) {
                            k0(4);
                            this.f11965b.clearFlags(1024);
                        } else if (i7 == 2) {
                            k0(2);
                        } else if (i7 == 8) {
                            ((C1055h) ((X4.y) this.f11966c).f9916l).b();
                        }
                    }
                }
                break;
            default:
                ((WindowInsetsController) this.f11966c).show(7);
                break;
        }
    }

    public final void j0(int i7) {
        switch (this.a) {
            case 0:
                View decorView = this.f11965b.getDecorView();
                decorView.setSystemUiVisibility(i7 | decorView.getSystemUiVisibility());
                break;
            default:
                View decorView2 = this.f11965b.getDecorView();
                decorView2.setSystemUiVisibility(i7 | decorView2.getSystemUiVisibility());
                break;
        }
    }

    public final void k0(int i7) {
        switch (this.a) {
            case 0:
                View decorView = this.f11965b.getDecorView();
                decorView.setSystemUiVisibility((~i7) & decorView.getSystemUiVisibility());
                break;
            default:
                View decorView2 = this.f11965b.getDecorView();
                decorView2.setSystemUiVisibility((~i7) & decorView2.getSystemUiVisibility());
                break;
        }
    }
}
