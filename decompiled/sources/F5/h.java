package F5;

import P3.AbstractC0568i;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class h extends AbstractC0568i {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2530k;

    /* renamed from: l, reason: collision with root package name */
    public final f f2531l;

    public h(int i7, f fVar) {
        this.f2530k = i7;
        switch (i7) {
            case 1:
                kotlin.jvm.internal.l.f("builder", fVar);
                this.f2531l = fVar;
                break;
            default:
                kotlin.jvm.internal.l.f("builder", fVar);
                this.f2531l = fVar;
                break;
        }
    }

    @Override // P3.AbstractC0568i
    public final int a() {
        switch (this.f2530k) {
        }
        return this.f2531l.c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f2530k) {
            case 0:
                kotlin.jvm.internal.l.f("element", (Map.Entry) obj);
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f2530k) {
            case 0:
                this.f2531l.clear();
                break;
            default:
                this.f2531l.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f2530k) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.l.f("element", entry);
                f fVar = this.f2531l;
                kotlin.jvm.internal.l.f("map", fVar);
                Object obj2 = fVar.get(entry.getKey());
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && fVar.containsKey(entry.getKey());
            default:
                return this.f2531l.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f2530k) {
            case 0:
                return new i(this.f2531l);
            default:
                f fVar = this.f2531l;
                kotlin.jvm.internal.l.f("builder", fVar);
                q[] qVarArr = new q[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    qVarArr[i7] = new r(1);
                }
                return new j(fVar, qVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f2530k) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.l.f("element", entry);
                return this.f2531l.remove(entry.getKey(), entry.getValue());
            default:
                f fVar = this.f2531l;
                if (!fVar.containsKey(obj)) {
                    return false;
                }
                fVar.remove(obj);
                return true;
        }
    }
}
