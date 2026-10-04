package p1;

import android.os.Build;
import f.AbstractC0847h;
import f1.AbstractC0870c;
import g1.RunnableC0933a;
import java.util.ArrayList;

/* renamed from: p1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1781d extends AbstractC0847h {
    public final /* synthetic */ e a;

    public C1781d(e eVar) {
        this.a = eVar;
    }

    @Override // f.AbstractC0847h
    public final void t(Throwable th) {
        this.a.a.e(th);
    }

    @Override // f.AbstractC0847h
    public final void u(A2.b bVar) {
        e eVar = this.a;
        eVar.f14167c = bVar;
        A2.b bVar2 = eVar.f14167c;
        g gVar = eVar.a;
        eVar.f14166b = new B2.l(bVar2, gVar.f14175g, gVar.f14177i, Build.VERSION.SDK_INT >= 34 ? k.a() : AbstractC0870c.T());
        g gVar2 = eVar.a;
        gVar2.getClass();
        ArrayList arrayList = new ArrayList();
        gVar2.a.writeLock().lock();
        try {
            gVar2.f14171c = 1;
            arrayList.addAll(gVar2.f14170b);
            gVar2.f14170b.clear();
            gVar2.a.writeLock().unlock();
            gVar2.f14172d.post(new RunnableC0933a(arrayList, gVar2.f14171c, null));
        } catch (Throwable th) {
            gVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
