package P3;

import f4.InterfaceC0883c;
import java.util.AbstractList;
import java.util.List;

/* renamed from: P3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0566g extends AbstractList implements List, InterfaceC0883c {
    public abstract int a();

    public abstract Object h(int i7);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i7) {
        return h(i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
