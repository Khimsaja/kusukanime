package F;

import C2.C0028a;
import H1.L;
import java.util.function.IntConsumer;
import z1.C2483a;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2027k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2028l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2029m;

    public /* synthetic */ h(int i7, int i8, Object obj) {
        this.f2027k = i8;
        this.f2029m = obj;
        this.f2028l = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2027k) {
            case 0:
                ((IntConsumer) this.f2029m).accept(this.f2028l);
                break;
            case 1:
                L l7 = (L) this.f2029m;
                int i7 = l7.f3321k[this.f2028l].a.f3457l;
                I1.f fVar = l7.f3293G;
                fVar.M(fVar.L(), 1033, new C0028a(24));
                break;
            default:
                ((C2483a) this.f2029m).f18944b.onAudioFocusChange(this.f2028l);
                break;
        }
    }

    public /* synthetic */ h(L l7, int i7, boolean z7) {
        this.f2027k = 1;
        this.f2029m = l7;
        this.f2028l = i7;
    }
}
