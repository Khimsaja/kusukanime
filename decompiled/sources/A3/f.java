package A3;

import H5.u0;
import K5.Y;
import O3.C;
import android.content.Context;
import com.kusukanime.data.SearchHistory;
import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f142k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B f143l;

    public /* synthetic */ f(B b4, int i7) {
        this.f142k = i7;
        this.f143l = b4;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f142k) {
            case 0:
                B b4 = this.f143l;
                Context context = b4.f130n;
                if (context != null) {
                    SearchHistory.INSTANCE.clear(context);
                    P3.y yVar = P3.y.f7779k;
                    Y y7 = b4.f124h;
                    y7.getClass();
                    y7.i(null, yVar);
                }
                break;
            default:
                B b7 = this.f143l;
                u0 u0Var = b7.f131o;
                if (u0Var != null) {
                    u0Var.e(null);
                }
                Y y8 = b7.f118b;
                y8.getClass();
                y8.i(null, "");
                P3.y yVar2 = P3.y.f7779k;
                Y y9 = b7.f120d;
                y9.getClass();
                y9.i(null, yVar2);
                b7.f126j.h(null);
                break;
        }
        return C.a;
    }
}
