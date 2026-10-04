package T1;

import B1.K;
import C2.C0028a;
import H1.C0227h;
import H1.G;
import O1.B;
import io.ktor.util.GzipHeaderFlags;
import y1.C2393o;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8989k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J1.j f8990l;

    public /* synthetic */ x(J1.j jVar, int i7, long j7) {
        this.f8989k = 0;
        this.f8990l = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J1.j jVar = this.f8990l;
        int i7 = this.f8989k;
        jVar.getClass();
        switch (i7) {
            case 0:
                int i8 = K.a;
                I1.f fVar = jVar.f4207b.f3212k.f3219B;
                fVar.M(fVar.I((B) fVar.f3955d.f279o), 1018, new I1.b(10));
                break;
            case 1:
                int i9 = K.a;
                I1.f fVar2 = jVar.f4207b.f3212k.f3219B;
                fVar2.M(fVar2.I((B) fVar2.f3955d.f279o), 1021, new I1.b(11));
                break;
            case 2:
                int i10 = K.a;
                G g4 = jVar.f4207b.f3212k;
                g4.getClass();
                I1.f fVar3 = g4.f3219B;
                fVar3.M(fVar3.L(), 1015, new I1.b(19));
                break;
            case 3:
                int i11 = K.a;
                G g7 = jVar.f4207b.f3212k;
                g7.getClass();
                I1.f fVar4 = g7.f3219B;
                fVar4.M(fVar4.L(), 1017, new I1.b(16));
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                int i12 = K.a;
                I1.f fVar5 = jVar.f4207b.f3212k.f3219B;
                fVar5.M(fVar5.L(), 1016, new I1.b(1));
                break;
            case 5:
                int i13 = K.a;
                I1.f fVar6 = jVar.f4207b.f3212k.f3219B;
                fVar6.M(fVar6.L(), 1030, new I1.e(3));
                break;
            default:
                int i14 = K.a;
                I1.f fVar7 = jVar.f4207b.f3212k.f3219B;
                fVar7.M(fVar7.L(), 1019, new C0028a(21));
                break;
        }
    }

    public /* synthetic */ x(J1.j jVar, long j7, int i7) {
        this.f8989k = 1;
        this.f8990l = jVar;
    }

    public /* synthetic */ x(J1.j jVar, Object obj, int i7) {
        this.f8989k = i7;
        this.f8990l = jVar;
    }

    public /* synthetic */ x(J1.j jVar, String str, long j7, long j8) {
        this.f8989k = 4;
        this.f8990l = jVar;
    }

    public /* synthetic */ x(J1.j jVar, C2393o c2393o, C0227h c0227h) {
        this.f8989k = 3;
        this.f8990l = jVar;
    }
}
