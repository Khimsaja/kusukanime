package c;

import B1.RunnableC0016c;
import O3.C;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.M;
import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11068l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f11069m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i7) {
        super(0);
        this.f11068l = i7;
        this.f11069m = nVar;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f11068l) {
            case 0:
                n nVar = this.f11069m;
                return new M(nVar.getApplication(), nVar, nVar.getIntent() != null ? nVar.getIntent().getExtras() : null);
            case 1:
                this.f11069m.reportFullyDrawn();
                return C.a;
            case 2:
                n nVar2 = this.f11069m;
                return new p(nVar2.f11077p, new m(nVar2, 1));
            default:
                n nVar3 = this.f11069m;
                x xVar = new x(new B1.w(17, nVar3));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (kotlin.jvm.internal.l.a(Looper.myLooper(), Looper.getMainLooper())) {
                        nVar3.getClass();
                        nVar3.f10421k.a(new g(xVar, nVar3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0016c(20, nVar3, xVar));
                    }
                }
                return xVar;
        }
    }
}
