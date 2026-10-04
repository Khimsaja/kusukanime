package X0;

import O3.C;
import android.os.Handler;
import android.os.Looper;
import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9715l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f9716m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(v vVar, int i7) {
        super(1);
        this.f9715l = i7;
        this.f9716m = vVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f9715l) {
            case 0:
                w0.r rVarI = ((w0.r) obj).i();
                kotlin.jvm.internal.l.c(rVarI);
                this.f9716m.n(rVarI);
                break;
            case 1:
                T0.j jVar = new T0.j(((T0.j) obj).a);
                v vVar = this.f9716m;
                vVar.m4setPopupContentSizefhxjrPA(jVar);
                vVar.o();
                break;
            default:
                InterfaceC0821a interfaceC0821a = (InterfaceC0821a) obj;
                v vVar2 = this.f9716m;
                Handler handler = vVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC0821a.invoke();
                } else {
                    Handler handler2 = vVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new t(interfaceC0821a, 0));
                    }
                }
                break;
        }
        return C.a;
    }
}
