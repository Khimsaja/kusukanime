package H2;

import G2.C0174k;
import O.G;
import java.util.Map;
import o.C1613k;

/* loaded from: classes.dex */
public final class k implements G {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3618c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3619d;

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.f3617b = obj;
        this.f3618c = obj2;
        this.f3619d = obj3;
    }

    @Override // O.G
    public final void dispose() {
        switch (this.a) {
            case 0:
                p pVar = (p) this.f3617b;
                C0174k c0174k = (C0174k) this.f3618c;
                pVar.b().b(c0174k);
                ((Y.r) this.f3619d).remove(c0174k);
                break;
            case 1:
                X.g gVar = (X.g) this.f3618c;
                Map map = gVar.a;
                X.f fVar = (X.f) this.f3617b;
                if (fVar.f9682b) {
                    Map mapA = fVar.f9683c.a();
                    boolean zIsEmpty = mapA.isEmpty();
                    Object obj = fVar.a;
                    if (zIsEmpty) {
                        map.remove(obj);
                    } else {
                        map.put(obj, mapA);
                    }
                }
                gVar.f9685b.remove(this.f3619d);
                break;
            default:
                Y.r rVar = (Y.r) this.f3619d;
                Object obj2 = this.f3617b;
                rVar.remove(obj2);
                ((C1613k) this.f3618c).f13510d.g(obj2);
                break;
        }
    }

    public k(Y.r rVar, Object obj, C1613k c1613k) {
        this.a = 2;
        this.f3619d = rVar;
        this.f3617b = obj;
        this.f3618c = c1613k;
    }
}
