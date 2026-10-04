package O1;

import B1.AbstractC0015b;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import y1.C2401x;

/* renamed from: O1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0527a {
    public final ArrayList a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f7404b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final K1.e f7405c = new K1.e(new CopyOnWriteArrayList(), 0, null);

    /* renamed from: d, reason: collision with root package name */
    public final K1.e f7406d = new K1.e(new CopyOnWriteArrayList(), 0, null);

    /* renamed from: e, reason: collision with root package name */
    public Looper f7407e;

    /* renamed from: f, reason: collision with root package name */
    public y1.P f7408f;

    /* renamed from: g, reason: collision with root package name */
    public I1.l f7409g;

    public abstract InterfaceC0551z a(B b4, R1.f fVar, long j7);

    public final void b(C c2) {
        HashSet hashSet = this.f7404b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(c2);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        c();
    }

    public final void d(C c2) {
        this.f7407e.getClass();
        HashSet hashSet = this.f7404b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(c2);
        if (zIsEmpty) {
            e();
        }
    }

    public y1.P f() {
        return null;
    }

    public abstract C2401x g();

    public boolean h() {
        return true;
    }

    public abstract void i();

    public final void j(C c2, E1.D d4, I1.l lVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f7407e;
        AbstractC0015b.c(looper == null || looper == looperMyLooper);
        this.f7409g = lVar;
        y1.P p7 = this.f7408f;
        this.a.add(c2);
        if (this.f7407e == null) {
            this.f7407e = looperMyLooper;
            this.f7404b.add(c2);
            k(d4);
        } else if (p7 != null) {
            d(c2);
            c2.a(this, p7);
        }
    }

    public abstract void k(E1.D d4);

    public final void l(y1.P p7) {
        this.f7408f = p7;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((C) it.next()).a(this, p7);
        }
    }

    public abstract void m(InterfaceC0551z interfaceC0551z);

    public final void n(C c2) {
        ArrayList arrayList = this.a;
        arrayList.remove(c2);
        if (!arrayList.isEmpty()) {
            b(c2);
            return;
        }
        this.f7407e = null;
        this.f7408f = null;
        this.f7409g = null;
        this.f7404b.clear();
        o();
    }

    public abstract void o();

    public final void p(K1.f fVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7406d.f4460c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            K1.d dVar = (K1.d) it.next();
            if (dVar.a == fVar) {
                copyOnWriteArrayList.remove(dVar);
            }
        }
    }

    public final void q(H h7) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7405c.f4460c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            G g4 = (G) it.next();
            if (g4.f7269b == h7) {
                copyOnWriteArrayList.remove(g4);
            }
        }
    }

    public abstract void r(C2401x c2401x);

    public void c() {
    }

    public void e() {
    }
}
