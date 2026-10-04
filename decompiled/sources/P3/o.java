package P3;

import Z5.C0656z;
import e4.InterfaceC0821a;
import f4.InterfaceC0881a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o implements Iterable, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7769k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f7770l;

    public /* synthetic */ o(int i7, Object obj) {
        this.f7769k = i7;
        this.f7770l = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f7769k) {
            case 0:
                return kotlin.jvm.internal.l.i((Object[]) this.f7770l);
            case 1:
                return new C((Iterator) ((InterfaceC0821a) this.f7770l).invoke());
            case 2:
                return new O3.t((C0656z) this.f7770l);
            default:
                return ((y5.h) this.f7770l).iterator();
        }
    }
}
