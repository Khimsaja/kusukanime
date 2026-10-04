package O;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: O.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0506n extends r {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7097b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7098c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f7099d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f7100e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final C0493g0 f7101f = C0486d.K(W.d.f9511n, T.f7047n);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0510p f7102g;

    public C0506n(C0510p c0510p, int i7, boolean z7, boolean z8, T t7) {
        this.f7102g = c0510p;
        this.a = i7;
        this.f7097b = z7;
        this.f7098c = z8;
    }

    @Override // O.r
    public final void a(C0519u c0519u, W.a aVar) {
        this.f7102g.f7129b.a(c0519u, aVar);
    }

    @Override // O.r
    public final void b() {
        C0510p c0510p = this.f7102g;
        c0510p.f7153z--;
    }

    @Override // O.r
    public final boolean c() {
        return this.f7102g.f7129b.c();
    }

    @Override // O.r
    public final boolean d() {
        return this.f7097b;
    }

    @Override // O.r
    public final boolean e() {
        return this.f7098c;
    }

    @Override // O.r
    public final InterfaceC0501k0 f() {
        return (InterfaceC0501k0) this.f7101f.getValue();
    }

    @Override // O.r
    public final int g() {
        return this.a;
    }

    @Override // O.r
    public final S3.h h() {
        return this.f7102g.f7129b.h();
    }

    @Override // O.r
    public final void i(C0519u c0519u) {
        C0510p c0510p = this.f7102g;
        c0510p.f7129b.i(c0510p.f7134g);
        c0510p.f7129b.i(c0519u);
    }

    @Override // O.r
    public final void j(Set set) {
        HashSet hashSet = this.f7099d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f7099d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // O.r
    public final void k(C0510p c0510p) {
        this.f7100e.add(c0510p);
    }

    @Override // O.r
    public final void l(C0519u c0519u) {
        this.f7102g.f7129b.l(c0519u);
    }

    @Override // O.r
    public final void m() {
        this.f7102g.f7153z++;
    }

    @Override // O.r
    public final void n(C0510p c0510p) {
        HashSet hashSet = this.f7099d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl", c0510p);
                set.remove(c0510p.f7130c);
            }
        }
        LinkedHashSet linkedHashSet = this.f7100e;
        kotlin.jvm.internal.B.a(linkedHashSet);
        linkedHashSet.remove(c0510p);
    }

    @Override // O.r
    public final void o(C0519u c0519u) {
        this.f7102g.f7129b.o(c0519u);
    }

    public final void p() {
        LinkedHashSet<C0510p> linkedHashSet = this.f7100e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f7099d;
        if (hashSet != null) {
            for (C0510p c0510p : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(c0510p.f7130c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
