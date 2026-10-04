package P3;

import f6.AbstractC0915m;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p implements y5.h {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7771b;

    public /* synthetic */ p(int i7, Object obj) {
        this.a = i7;
        this.f7771b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [U3.i, e4.n] */
    @Override // y5.h
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return kotlin.jvm.internal.l.i((Object[]) this.f7771b);
            case 1:
                return ((Iterable) this.f7771b).iterator();
            case 2:
                return AbstractC0915m.C((U3.i) this.f7771b);
            default:
                return (Iterator) this.f7771b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(e4.n nVar) {
        this.a = 2;
        this.f7771b = (U3.i) nVar;
    }
}
