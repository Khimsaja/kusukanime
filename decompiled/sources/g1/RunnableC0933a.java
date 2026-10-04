package g1;

import java.util.ArrayList;
import java.util.List;

/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0933a implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11669k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final int f11670l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f11671m;

    public RunnableC0933a(R1.i iVar, int i7) {
        this.f11671m = iVar;
        this.f11670l = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11669k) {
            case 0:
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f11671m;
                int size = arrayList.size();
                int i7 = 0;
                if (this.f11670l == 1) {
                    while (i7 < size) {
                        P0.g gVar = (P0.g) arrayList.get(i7);
                        gVar.a.setValue(Boolean.TRUE);
                        gVar.f7714b.f741l = new P0.k(true);
                        i7++;
                    }
                    break;
                } else {
                    while (i7 < size) {
                        ((P0.g) arrayList.get(i7)).f7714b.f741l = P0.j.a;
                        i7++;
                    }
                    break;
                }
        }
    }

    public RunnableC0933a(List list, int i7, Throwable th) {
        e3.c.g("initCallbacks cannot be null", list);
        this.f11671m = new ArrayList(list);
        this.f11670l = i7;
    }
}
