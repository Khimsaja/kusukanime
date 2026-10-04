package j3;

import java.util.List;
import java.util.ListIterator;

/* renamed from: j3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1325k extends C1317c implements ListIterator {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1326l f12357o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1325k(C1326l c1326l) {
        super(c1326l);
        this.f12357o = c1326l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C1326l c1326l = this.f12357o;
        boolean zIsEmpty = c1326l.isEmpty();
        b().add(obj);
        c1326l.f12364p.f12299o++;
        if (zIsEmpty) {
            c1326l.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f12323l;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1325k(C1326l c1326l, int i7) {
        super(c1326l, ((List) c1326l.f12360l).listIterator(i7));
        this.f12357o = c1326l;
    }
}
