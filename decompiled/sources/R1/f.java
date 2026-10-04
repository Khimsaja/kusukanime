package R1;

import B1.K;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public int f8039c;

    /* renamed from: d, reason: collision with root package name */
    public int f8040d;
    public final boolean a = true;

    /* renamed from: b, reason: collision with root package name */
    public final int f8038b = 65536;

    /* renamed from: e, reason: collision with root package name */
    public int f8041e = 0;

    /* renamed from: f, reason: collision with root package name */
    public a[] f8042f = new a[100];

    public final synchronized void a(int i7) {
        boolean z7 = i7 < this.f8039c;
        this.f8039c = i7;
        if (z7) {
            b();
        }
    }

    public final synchronized void b() {
        int iMax = Math.max(0, K.e(this.f8039c, this.f8038b) - this.f8040d);
        int i7 = this.f8041e;
        if (iMax >= i7) {
            return;
        }
        Arrays.fill(this.f8042f, iMax, i7, (Object) null);
        this.f8041e = iMax;
    }
}
