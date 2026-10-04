package P3;

import f4.InterfaceC0886f;
import java.util.AbstractSet;
import java.util.Set;

/* renamed from: P3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0568i extends AbstractSet implements Set, InterfaceC0886f {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
