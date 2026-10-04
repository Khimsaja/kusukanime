package X;

import P3.E;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: m, reason: collision with root package name */
    public static final d f9676m = new d(2, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final d f9677n = new d(2, 1);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9678l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7, int i8) {
        super(i7);
        this.f9678l = i8;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9678l) {
            case 0:
                g gVar = (g) obj2;
                LinkedHashMap linkedHashMapT0 = E.t0(gVar.a);
                for (f fVar : gVar.f9685b.values()) {
                    if (fVar.f9682b) {
                        Map mapA = fVar.f9683c.a();
                        boolean zIsEmpty = mapA.isEmpty();
                        Object obj3 = fVar.a;
                        if (zIsEmpty) {
                            linkedHashMapT0.remove(obj3);
                        } else {
                            linkedHashMapT0.put(obj3, mapA);
                        }
                    }
                }
                if (linkedHashMapT0.isEmpty()) {
                    return null;
                }
                return linkedHashMapT0;
            default:
                return obj2;
        }
    }
}
