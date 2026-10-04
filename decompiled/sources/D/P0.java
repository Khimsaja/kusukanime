package D;

import android.view.View;

/* loaded from: classes.dex */
public final class P0 implements N0.q {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f1093b;

    public /* synthetic */ P0(int i7, int i8) {
        this.a = i7;
        this.f1093b = i8;
    }

    @Override // N0.q
    public int a(int i7) {
        if (i7 >= 0 && i7 <= this.f1093b) {
            AbstractC0047d0.u(i7, this.a, i7);
        }
        return i7;
    }

    @Override // N0.q
    public int b(int i7) {
        if (i7 >= 0 && i7 <= this.a) {
            AbstractC0047d0.t(i7, this.f1093b, i7);
        }
        return i7;
    }

    public int c() {
        int i7 = this.f1093b;
        if (i7 == 2) {
            return 10;
        }
        if (i7 == 5) {
            return 11;
        }
        if (i7 == 29) {
            return 12;
        }
        if (i7 == 42) {
            return 16;
        }
        if (i7 != 22) {
            return i7 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public void d(K2.W w7) {
        View view = w7.a;
        this.a = view.getLeft();
        this.f1093b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
