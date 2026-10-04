package V2;

import java.io.Closeable;
import z5.C2508m;

/* loaded from: classes.dex */
public final class d implements Closeable {

    /* renamed from: k, reason: collision with root package name */
    public final c f9454k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9455l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f9456m;

    public d(g gVar, c cVar) {
        this.f9456m = gVar;
        this.f9454k = cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f9455l) {
            return;
        }
        this.f9455l = true;
        g gVar = this.f9456m;
        synchronized (gVar) {
            c cVar = this.f9454k;
            int i7 = cVar.f9452h - 1;
            cVar.f9452h = i7;
            if (i7 == 0 && cVar.f9450f) {
                C2508m c2508m = g.f9459A;
                gVar.H(cVar);
            }
        }
    }
}
