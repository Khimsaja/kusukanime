package O1;

import B1.AbstractC0015b;
import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: O1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0537k extends AbstractC0527a {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f7458h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public Handler f7459i;

    /* renamed from: j, reason: collision with root package name */
    public E1.D f7460j;

    @Override // O1.AbstractC0527a
    public final void c() {
        for (C0536j c0536j : this.f7458h.values()) {
            c0536j.a.b(c0536j.f7456b);
        }
    }

    @Override // O1.AbstractC0527a
    public final void e() {
        for (C0536j c0536j : this.f7458h.values()) {
            c0536j.a.d(c0536j.f7456b);
        }
    }

    @Override // O1.AbstractC0527a
    public void i() {
        Iterator it = this.f7458h.values().iterator();
        while (it.hasNext()) {
            ((C0536j) it.next()).a.i();
        }
    }

    @Override // O1.AbstractC0527a
    public void o() {
        HashMap map = this.f7458h;
        for (C0536j c0536j : map.values()) {
            c0536j.a.n(c0536j.f7456b);
            C0535i c0535i = c0536j.f7457c;
            AbstractC0527a abstractC0527a = c0536j.a;
            abstractC0527a.q(c0535i);
            abstractC0527a.p(c0535i);
        }
        map.clear();
    }

    public abstract B s(Object obj, B b4);

    public abstract void v(Object obj, AbstractC0527a abstractC0527a, y1.P p7);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [O1.C, O1.h] */
    public final void w(final Object obj, AbstractC0527a abstractC0527a) {
        HashMap map = this.f7458h;
        AbstractC0015b.c(!map.containsKey(obj));
        ?? r12 = new C() { // from class: O1.h
            @Override // O1.C
            public final void a(AbstractC0527a abstractC0527a2, y1.P p7) {
                this.a.v(obj, abstractC0527a2, p7);
            }
        };
        C0535i c0535i = new C0535i(this, obj);
        map.put(obj, new C0536j(abstractC0527a, r12, c0535i));
        Handler handler = this.f7459i;
        handler.getClass();
        abstractC0527a.getClass();
        K1.e eVar = abstractC0527a.f7405c;
        eVar.getClass();
        G g4 = new G();
        g4.a = handler;
        g4.f7269b = c0535i;
        eVar.f4460c.add(g4);
        this.f7459i.getClass();
        K1.e eVar2 = abstractC0527a.f7406d;
        eVar2.getClass();
        K1.d dVar = new K1.d();
        dVar.a = c0535i;
        eVar2.f4460c.add(dVar);
        E1.D d4 = this.f7460j;
        I1.l lVar = this.f7409g;
        AbstractC0015b.i(lVar);
        abstractC0527a.j(r12, d4, lVar);
        if (this.f7404b.isEmpty()) {
            abstractC0527a.b(r12);
        }
    }

    public long t(long j7, Object obj) {
        return j7;
    }

    public int u(int i7, Object obj) {
        return i7;
    }
}
