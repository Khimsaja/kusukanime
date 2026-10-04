package G3;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class s extends AbstractSet {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2836k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f2837l;

    public /* synthetic */ s(u uVar, int i7) {
        this.f2836k = i7;
        this.f2837l = uVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f2836k) {
            case 0:
                this.f2837l.clear();
                break;
            default:
                this.f2837l.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        t tVarA;
        Object obj2;
        Object value;
        switch (this.f2836k) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                u uVar = this.f2837l;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                t tVar = null;
                if (key != null) {
                    try {
                        tVarA = uVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    tVarA = null;
                }
                if (tVarA != null && ((obj2 = tVarA.f2845r) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    tVar = tVarA;
                }
                return tVar != null;
            default:
                return this.f2837l.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f2836k) {
            case 0:
                return new r(this.f2837l, 0);
            default:
                return new r(this.f2837l, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        t tVarA;
        Object obj2;
        Object value;
        switch (this.f2836k) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    u uVar = this.f2837l;
                    Object key = entry.getKey();
                    t tVar = null;
                    if (key != null) {
                        try {
                            tVarA = uVar.a(key, false);
                        } catch (ClassCastException unused) {
                        }
                    } else {
                        tVarA = null;
                    }
                    if (tVarA != null && ((obj2 = tVarA.f2845r) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                        tVar = tVarA;
                    }
                    if (tVar != null) {
                        uVar.c(tVar, true);
                        break;
                    }
                }
                break;
            default:
                u uVar2 = this.f2837l;
                t tVarA2 = null;
                if (obj != null) {
                    try {
                        tVarA2 = uVar2.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (tVarA2 != null) {
                    uVar2.c(tVarA2, true);
                }
                if (tVarA2 != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f2836k) {
        }
        return this.f2837l.f2851n;
    }
}
