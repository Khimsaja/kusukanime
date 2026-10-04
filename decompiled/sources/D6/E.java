package D6;

import java.lang.reflect.Array;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class E extends c0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0 f1654e;

    public /* synthetic */ E(c0 c0Var, int i7) {
        this.f1653d = i7;
        this.f1654e = c0Var;
    }

    @Override // D6.c0
    public final void a(S s7, Object obj) {
        switch (this.f1653d) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.f1654e.a(s7, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i7 = 0; i7 < length; i7++) {
                        this.f1654e.a(s7, Array.get(obj, i7));
                    }
                    break;
                }
                break;
        }
    }
}
