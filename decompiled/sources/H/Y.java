package H;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import e4.InterfaceC0821a;
import l4.AbstractC1420H;
import q.i0;

/* loaded from: classes.dex */
public final class Y extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2942l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T0.b f2943m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ O.Z f2944n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(T0.b bVar, O.Z z7, int i7) {
        super(1);
        this.f2942l = i7;
        this.f2943m = bVar;
        this.f2944n = z7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f2942l) {
            case 0:
                long j7 = ((T0.g) obj).a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
                T0.b bVar = this.f2943m;
                this.f2944n.setValue(new T0.j(AbstractC1420H.a(bVar.O(fIntBitsToFloat), bVar.O(Float.intBitsToFloat((int) (j7 & 4294967295L))))));
                return O3.C.a;
            default:
                a0.n nVar = a0.n.a;
                X x7 = new X((InterfaceC0821a) obj, 0);
                Y y7 = new Y(this.f2943m, this.f2944n, 0);
                if (q.W.a()) {
                    return q.W.a() ? new MagnifierElement(x7, y7, Build.VERSION.SDK_INT == 28 ? i0.f14561b : i0.f14562c) : nVar;
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }
}
