package O;

import f4.InterfaceC0881a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Q0 implements Iterable, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final B0 f7042k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7043l;

    /* renamed from: m, reason: collision with root package name */
    public final C0486d f7044m;

    public Q0(B0 b02, int i7, L l7, C0486d c0486d) {
        this.f7042k = b02;
        this.f7043l = i7;
        this.f7044m = c0486d;
        l7.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new K(this.f7042k, this.f7043l, null, this.f7044m);
    }
}
