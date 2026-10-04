package o4;

import java.lang.reflect.Method;
import java.util.Comparator;
import l4.InterfaceC1436o;
import u4.AbstractC2108n;
import z5.C2508m;

/* renamed from: o4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1680g implements Comparator {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13706k;

    public /* synthetic */ C1680g(int i7) {
        this.f13706k = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f13706k) {
            case 0:
                return z1.c.h(((Method) obj).getName(), ((Method) obj2).getName());
            case 1:
                return z1.c.h(((C1669a0) ((InterfaceC1436o) obj)).getName(), ((C1669a0) ((InterfaceC1436o) obj2)).getName());
            default:
                C2508m c2508m = AbstractC1654H.f13637k;
                Integer numB = AbstractC2108n.b((H4.o) obj, (H4.o) obj2);
                if (numB != null) {
                    return numB.intValue();
                }
                return 0;
        }
    }
}
