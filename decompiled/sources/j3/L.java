package j3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class L implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public static final L f12287k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ L[] f12288l;

    static {
        L l7 = new L("INSTANCE", 0);
        f12287k = l7;
        f12288l = new L[]{l7};
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) f12288l.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
