package L;

import java.util.ArrayList;
import w0.InterfaceC2173H;
import w0.InterfaceC2175J;

/* loaded from: classes.dex */
public final class G implements InterfaceC2173H {

    /* renamed from: b, reason: collision with root package name */
    public static final G f5070b = new G(0);
    public final /* synthetic */ int a;

    public /* synthetic */ G(int i7) {
        this.a = i7;
    }

    public static final void f(ArrayList arrayList, kotlin.jvm.internal.v vVar, InterfaceC2175J interfaceC2175J, ArrayList arrayList2, ArrayList arrayList3, kotlin.jvm.internal.v vVar2, ArrayList arrayList4, kotlin.jvm.internal.v vVar3, kotlin.jvm.internal.v vVar4) {
        float f5 = AbstractC0379i.f5600d;
        if (!arrayList.isEmpty()) {
            vVar.f12718k = interfaceC2175J.O(f5) + vVar.f12718k;
        }
        arrayList.add(0, P3.q.S0(arrayList2));
        arrayList3.add(Integer.valueOf(vVar2.f12718k));
        arrayList4.add(Integer.valueOf(vVar.f12718k));
        vVar.f12718k += vVar2.f12718k;
        vVar3.f12718k = Math.max(vVar3.f12718k, vVar4.f12718k);
        arrayList2.clear();
        vVar4.f12718k = 0;
        vVar2.f12718k = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008c A[SYNTHETIC] */
    @Override // w0.InterfaceC2173H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final w0.InterfaceC2174I b(w0.InterfaceC2175J r25, java.util.List r26, long r27) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L.G.b(w0.J, java.util.List, long):w0.I");
    }
}
