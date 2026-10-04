package H0;

import B1.C0017d;
import e4.InterfaceC0821a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3135l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0017d f3136m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(C0017d c0017d, int i7) {
        super(0);
        this.f3135l = i7;
        this.f3136m = c0017d;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        Object obj;
        Object obj2;
        switch (this.f3135l) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f3136m.f320n;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj3 = arrayList.get(0);
                    float fB = ((q) obj3).a.f7700s.b();
                    int iY = P3.r.y(arrayList);
                    int i7 = 1;
                    if (1 <= iY) {
                        while (true) {
                            Object obj4 = arrayList.get(i7);
                            float fB2 = ((q) obj4).a.f7700s.b();
                            if (Float.compare(fB, fB2) < 0) {
                                obj3 = obj4;
                                fB = fB2;
                            }
                            if (i7 != iY) {
                                i7++;
                            }
                        }
                    }
                    obj = obj3;
                }
                q qVar = (q) obj;
                return Float.valueOf(qVar != null ? qVar.a.f7700s.b() : 0.0f);
            default:
                ArrayList arrayList2 = (ArrayList) this.f3136m.f320n;
                if (arrayList2.isEmpty()) {
                    obj2 = null;
                } else {
                    Object obj5 = arrayList2.get(0);
                    float fA = ((q) obj5).a.a();
                    int iY2 = P3.r.y(arrayList2);
                    int i8 = 1;
                    if (1 <= iY2) {
                        while (true) {
                            Object obj6 = arrayList2.get(i8);
                            float fA2 = ((q) obj6).a.a();
                            if (Float.compare(fA, fA2) < 0) {
                                obj5 = obj6;
                                fA = fA2;
                            }
                            if (i8 != iY2) {
                                i8++;
                            }
                        }
                    }
                    obj2 = obj5;
                }
                q qVar2 = (q) obj2;
                return Float.valueOf(qVar2 != null ? qVar2.a.a() : 0.0f);
        }
    }
}
