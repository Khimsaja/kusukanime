package F1;

import java.util.TreeSet;

/* loaded from: classes.dex */
public final class r {
    public final TreeSet a = new TreeSet(new q());

    /* renamed from: b, reason: collision with root package name */
    public long f2211b;

    public final void a(u uVar, long j7) {
        while (this.f2211b + j7 > 419430400 && !this.a.isEmpty()) {
            i iVar = (i) this.a.first();
            synchronized (uVar) {
                uVar.l(iVar);
            }
        }
    }

    public final void b(u uVar, v vVar) {
        this.a.add(vVar);
        this.f2211b += vVar.f2192m;
        a(uVar, 0L);
    }
}
