package y;

import java.util.Comparator;

/* renamed from: y.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2335p implements Comparator {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17632k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2341v f17633l;

    public /* synthetic */ C2335p(InterfaceC2341v interfaceC2341v, int i7) {
        this.f17632k = i7;
        this.f17633l = interfaceC2341v;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f17632k) {
            case 0:
                Object key = ((InterfaceC2344y) obj).getKey();
                InterfaceC2341v interfaceC2341v = this.f17633l;
                return z1.c.h(Integer.valueOf(interfaceC2341v.a(key)), Integer.valueOf(interfaceC2341v.a(((InterfaceC2344y) obj2).getKey())));
            default:
                Object key2 = ((InterfaceC2344y) obj2).getKey();
                InterfaceC2341v interfaceC2341v2 = this.f17633l;
                return z1.c.h(Integer.valueOf(interfaceC2341v2.a(key2)), Integer.valueOf(interfaceC2341v2.a(((InterfaceC2344y) obj).getKey())));
        }
    }
}
