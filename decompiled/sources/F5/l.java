package F5;

import P3.AbstractC0569j;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class l extends AbstractC0569j {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2536k;

    /* renamed from: l, reason: collision with root package name */
    public final d f2537l;

    public l(d dVar, int i7) {
        this.f2536k = i7;
        switch (i7) {
            case 1:
                kotlin.jvm.internal.l.f("map", dVar);
                this.f2537l = dVar;
                break;
            default:
                kotlin.jvm.internal.l.f("map", dVar);
                this.f2537l = dVar;
                break;
        }
    }

    @Override // P3.AbstractC0560a
    public final int a() {
        switch (this.f2536k) {
        }
        return this.f2537l.c();
    }

    @Override // P3.AbstractC0560a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f2536k) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.l.f("element", entry);
                d dVar = this.f2537l;
                kotlin.jvm.internal.l.f("map", dVar);
                Object obj2 = dVar.get(entry.getKey());
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && dVar.containsKey(entry.getKey());
            default:
                return this.f2537l.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f2536k) {
            case 0:
                p pVar = this.f2537l.f2514k;
                kotlin.jvm.internal.l.f("node", pVar);
                q[] qVarArr = new q[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    qVarArr[i7] = new r(0);
                }
                return new m(pVar, qVarArr);
            default:
                p pVar2 = this.f2537l.f2514k;
                kotlin.jvm.internal.l.f("node", pVar2);
                q[] qVarArr2 = new q[8];
                for (int i8 = 0; i8 < 8; i8++) {
                    qVarArr2[i8] = new r(1);
                }
                return new m(pVar2, qVarArr2);
        }
    }
}
