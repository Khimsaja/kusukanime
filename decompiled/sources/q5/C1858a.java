package q5;

import java.util.ArrayList;
import n5.Q;

/* renamed from: q5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1858a extends ArrayList implements g {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Q) {
            return super.contains((Q) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Q) {
            return super.indexOf((Q) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Q) {
            return super.lastIndexOf((Q) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Q) {
            return super.remove((Q) obj);
        }
        return false;
    }
}
