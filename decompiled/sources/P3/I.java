package P3;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import z5.C2506k;

/* loaded from: classes.dex */
public final class I extends AbstractC0564e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7754k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f7755l;

    public /* synthetic */ I(int i7, Object obj) {
        this.f7754k = i7;
        this.f7755l = obj;
    }

    @Override // P3.AbstractC0560a
    public final int a() {
        switch (this.f7754k) {
            case 0:
                return ((List) this.f7755l).size();
            default:
                return ((C2506k) this.f7755l).a.groupCount() + 1;
        }
    }

    @Override // P3.AbstractC0560a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f7754k) {
            case 1:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i7) {
        switch (this.f7754k) {
            case 0:
                return ((List) this.f7755l).get(q.j0(i7, this));
            default:
                String strGroup = ((C2506k) this.f7755l).a.group(i7);
                return strGroup == null ? "" : strGroup;
        }
    }

    @Override // P3.AbstractC0564e, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f7754k) {
            case 1:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // P3.AbstractC0564e, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f7754k) {
            case 0:
                return new G(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // P3.AbstractC0564e, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f7754k) {
            case 1:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // P3.AbstractC0564e, java.util.List
    public ListIterator listIterator() {
        switch (this.f7754k) {
            case 0:
                return new G(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // P3.AbstractC0564e, java.util.List
    public ListIterator listIterator(int i7) {
        switch (this.f7754k) {
            case 0:
                return new G(this, i7);
            default:
                return super.listIterator(i7);
        }
    }
}
