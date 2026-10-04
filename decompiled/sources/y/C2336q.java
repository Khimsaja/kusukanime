package y;

import java.util.Comparator;

/* renamed from: y.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2336q implements Comparator {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17634k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2.H f17635l;

    public /* synthetic */ C2336q(C2.H h7, int i7) {
        this.f17634k = i7;
        this.f17635l = h7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f17634k) {
            case 0:
                Object key = ((InterfaceC2344y) obj).getKey();
                C2.H h7 = this.f17635l;
                return z1.c.h(Integer.valueOf(h7.a(key)), Integer.valueOf(h7.a(((InterfaceC2344y) obj2).getKey())));
            default:
                Object key2 = ((InterfaceC2344y) obj2).getKey();
                C2.H h8 = this.f17635l;
                return z1.c.h(Integer.valueOf(h8.a(key2)), Integer.valueOf(h8.a(((InterfaceC2344y) obj).getKey())));
        }
    }
}
