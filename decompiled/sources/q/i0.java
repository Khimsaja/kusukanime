package q;

import android.view.View;
import android.widget.Magnifier;

/* loaded from: classes.dex */
public final class i0 implements g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final i0 f14561b = new i0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f14562c = new i0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ i0(int i7) {
        this.a = i7;
    }

    @Override // q.g0
    public final boolean a() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // q.g0
    public final f0 b(View view, T0.b bVar) {
        switch (this.a) {
            case 0:
                return new h0(new Magnifier(view));
            default:
                return new j0(new Magnifier(view));
        }
    }
}
