package J1;

import B1.K;
import C2.C0028a;
import H1.C0227h;
import io.ktor.util.GzipHeaderFlags;
import y1.C2393o;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4203k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f4204l;

    public /* synthetic */ h(j jVar, int i7, long j7, long j8) {
        this.f4203k = 6;
        this.f4204l = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.f4204l;
        int i7 = this.f4203k;
        jVar.getClass();
        switch (i7) {
            case 0:
                int i8 = K.a;
                H1.G g4 = jVar.f4207b.f3212k;
                g4.getClass();
                I1.f fVar = g4.f3219B;
                fVar.M(fVar.L(), 1007, new I1.b(6));
                break;
            case 1:
                int i9 = K.a;
                I1.f fVar2 = jVar.f4207b.f3212k.f3219B;
                fVar2.M(fVar2.L(), 1008, new C0028a(19));
                break;
            case 2:
                int i10 = K.a;
                I1.f fVar3 = jVar.f4207b.f3212k.f3219B;
                fVar3.M(fVar3.L(), 1012, new I1.e(0));
                break;
            case 3:
                int i11 = K.a;
                I1.f fVar4 = jVar.f4207b.f3212k.f3219B;
                fVar4.M(fVar4.L(), 1014, new I1.b(20));
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                int i12 = K.a;
                H1.G g7 = jVar.f4207b.f3212k;
                g7.getClass();
                I1.f fVar5 = g7.f3219B;
                fVar5.M(fVar5.L(), 1009, new I1.b(18));
                break;
            case 5:
                int i13 = K.a;
                I1.f fVar6 = jVar.f4207b.f3212k.f3219B;
                fVar6.M(fVar6.L(), 1010, new I1.b(9));
                break;
            case 6:
                int i14 = K.a;
                I1.f fVar7 = jVar.f4207b.f3212k.f3219B;
                fVar7.M(fVar7.L(), 1011, new I1.b(23));
                break;
            case 7:
                int i15 = K.a;
                I1.f fVar8 = jVar.f4207b.f3212k.f3219B;
                fVar8.M(fVar8.L(), 1032, new I1.b(24));
                break;
            case 8:
                int i16 = K.a;
                I1.f fVar9 = jVar.f4207b.f3212k.f3219B;
                fVar9.M(fVar9.L(), 1031, new I1.b(26));
                break;
            default:
                int i17 = K.a;
                I1.f fVar10 = jVar.f4207b.f3212k.f3219B;
                fVar10.M(fVar10.L(), 1029, new I1.b(0));
                break;
        }
    }

    public /* synthetic */ h(j jVar, long j7) {
        this.f4203k = 5;
        this.f4204l = jVar;
    }

    public /* synthetic */ h(j jVar, Object obj, int i7) {
        this.f4203k = i7;
        this.f4204l = jVar;
    }

    public /* synthetic */ h(j jVar, String str, long j7, long j8) {
        this.f4203k = 1;
        this.f4204l = jVar;
    }

    public /* synthetic */ h(j jVar, C2393o c2393o, C0227h c0227h) {
        this.f4203k = 4;
        this.f4204l = jVar;
    }
}
