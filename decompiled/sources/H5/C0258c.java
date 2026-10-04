package H5;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: H5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258c extends i0 {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3834r = AtomicReferenceFieldUpdater.newUpdater(C0258c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* renamed from: o, reason: collision with root package name */
    public final C0270k f3835o;

    /* renamed from: p, reason: collision with root package name */
    public N f3836p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0262e f3837q;

    public C0258c(C0262e c0262e, C0270k c0270k) {
        this.f3837q = c0262e;
        this.f3835o = c0270k;
    }

    @Override // H5.i0
    public final boolean j() {
        return false;
    }

    @Override // H5.i0
    public final void k(Throwable th) throws J {
        C0270k c0270k = this.f3835o;
        if (th != null) {
            c0270k.getClass();
            F2.G gC = c0270k.C(new C0278t(th, false), null);
            if (gC != null) {
                c0270k.i(gC);
                C0260d c0260d = (C0260d) f3834r.get(this);
                if (c0260d != null) {
                    c0260d.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0262e.f3842b;
        C0262e c0262e = this.f3837q;
        if (atomicIntegerFieldUpdater.decrementAndGet(c0262e) == 0) {
            G[] gArr = c0262e.a;
            ArrayList arrayList = new ArrayList(gArr.length);
            for (G g4 : gArr) {
                arrayList.add(g4.j());
            }
            c0270k.resumeWith(arrayList);
        }
    }
}
