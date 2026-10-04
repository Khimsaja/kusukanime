package T1;

import B1.K;
import C2.C0028a;
import H1.G;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ J1.j f8991k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f8992l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f8993m;

    public /* synthetic */ y(J1.j jVar, Object obj, long j7) {
        this.f8991k = jVar;
        this.f8992l = obj;
        this.f8993m = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J1.j jVar = this.f8991k;
        jVar.getClass();
        int i7 = K.a;
        G g4 = jVar.f4207b.f3212k;
        I1.f fVar = g4.f3219B;
        I1.a aVarL = fVar.L();
        long j7 = this.f8993m;
        Object obj = this.f8992l;
        fVar.M(aVarL, 26, new C2.G(aVarL, obj, j7));
        if (g4.f3241Z == obj) {
            g4.f3272w.e(26, new C0028a(14));
        }
    }
}
