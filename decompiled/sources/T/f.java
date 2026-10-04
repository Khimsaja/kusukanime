package T;

import F5.q;
import P3.AbstractC0569j;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends AbstractC0569j {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8826k;

    /* renamed from: l, reason: collision with root package name */
    public final b f8827l;

    public /* synthetic */ f(b bVar, int i7) {
        this.f8826k = i7;
        this.f8827l = bVar;
    }

    @Override // P3.AbstractC0560a
    public final int a() {
        switch (this.f8826k) {
        }
        return this.f8827l.c();
    }

    @Override // P3.AbstractC0560a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Map.Entry entry;
        switch (this.f8826k) {
            case 0:
                if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
                    return false;
                }
                Object key = entry.getKey();
                b bVar = this.f8827l;
                Object obj2 = bVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && bVar.containsKey(entry.getKey());
            default:
                return this.f8827l.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f8826k) {
            case 0:
                h hVar = this.f8827l.f8818k;
                q[] qVarArr = new q[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    qVarArr[i7] = new i(0);
                }
                return new g(hVar, qVarArr);
            default:
                h hVar2 = this.f8827l.f8818k;
                q[] qVarArr2 = new q[8];
                for (int i8 = 0; i8 < 8; i8++) {
                    qVarArr2[i8] = new i(1);
                }
                return new g(hVar2, qVarArr2);
        }
    }
}
