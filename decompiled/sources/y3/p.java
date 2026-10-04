package y3;

import B1.K;
import H1.G;
import H1.I;
import H1.b0;
import H1.d0;
import H1.j0;
import O1.AbstractC0527a;
import O1.C0541o;
import O1.C0542p;
import O1.c0;
import P3.F;
import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import com.kusukanime.data.VideoCache;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import u4.C2114u;
import y1.C2401x;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class p extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Map f18333k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f18334l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f18335m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f18336n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Map map, String str, Context context, ExoPlayer exoPlayer, S3.c cVar) {
        super(2, cVar);
        this.f18333k = map;
        this.f18334l = str;
        this.f18335m = context;
        this.f18336n = exoPlayer;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new p(this.f18333k, this.f18334l, this.f18335m, this.f18336n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        p pVar = (p) create((H5.A) obj, (S3.c) obj2);
        O3.C c2 = O3.C.a;
        pVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        E1.m mVar = new E1.m();
        mVar.f1903m = 10000;
        mVar.f1904n = 15000;
        mVar.f1905o = true;
        mVar.f1902l = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36";
        Map map = this.f18333k;
        boolean zIsEmpty = map.isEmpty();
        String str = this.f18334l;
        if (zIsEmpty) {
            mVar.a(F.J(new O3.l("Referer", AbstractC2510o.W(str, "google", false) ? "https://drive.google.com/" : "https://anisail.com/")));
        } else {
            mVar.a(map);
        }
        VideoCache videoCache = VideoCache.INSTANCE;
        Context context = this.f18335m;
        F1.d dVarBuildDataSourceFactory = videoCache.buildDataSourceFactory(context, mVar);
        C0542p c0542p = new C0542p(new F.w(context), new V1.l());
        c0542p.f7473b = dVarBuildDataSourceFactory;
        C0541o c0541o = c0542p.a;
        if (dVarBuildDataSourceFactory != ((E1.g) c0541o.f7471e)) {
            c0541o.f7471e = dVarBuildDataSourceFactory;
            ((HashMap) c0541o.f7469c).clear();
            ((HashMap) c0541o.f7470d).clear();
        }
        AbstractC0527a abstractC0527aD = c0542p.d(C2401x.a(str));
        G g4 = (G) this.f18336n;
        g4.u1();
        List listSingletonList = Collections.singletonList(abstractC0527aD);
        g4.u1();
        g4.u1();
        g4.W0(g4.f3264q0);
        g4.S0();
        g4.f3233R++;
        ArrayList arrayList = g4.f3275z;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = size - 1; i7 >= 0; i7--) {
                arrayList.remove(i7);
            }
            c0 c0Var = g4.f3237V;
            int[] iArr = c0Var.f7420b;
            int[] iArr2 = new int[iArr.length - size];
            int i8 = 0;
            for (int i9 = 0; i9 < iArr.length; i9++) {
                int i10 = iArr[i9];
                if (i10 < 0 || i10 >= size) {
                    int i11 = i9 - i8;
                    if (i10 >= 0) {
                        i10 -= size;
                    }
                    iArr2[i11] = i10;
                } else {
                    i8++;
                }
            }
            g4.f3237V = new c0(iArr2, new Random(c0Var.a.nextLong()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < listSingletonList.size(); i12++) {
            b0 b0Var = new b0((AbstractC0527a) listSingletonList.get(i12), g4.f3218A);
            arrayList2.add(b0Var);
            arrayList.add(i12, new H1.F(b0Var.f3408b, b0Var.a));
        }
        g4.f3237V = g4.f3237V.a(arrayList2.size());
        j0 j0Var = new j0(arrayList, g4.f3237V);
        boolean zP = j0Var.p();
        int i13 = j0Var.f3511d;
        if (!zP && -1 >= i13) {
            throw new C2114u();
        }
        int iA = j0Var.a(g4.f3232Q);
        d0 d0VarE1 = g4.e1(g4.f3264q0, j0Var, g4.f1(j0Var, iA, -9223372036854775807L));
        int i14 = d0VarE1.f3429e;
        if (iA != -1 && i14 != 1) {
            i14 = (j0Var.p() || iA >= i13) ? 4 : 2;
        }
        d0 d0VarD1 = G.d1(d0VarE1, i14);
        g4.f3271v.f3328r.a(17, new I(arrayList2, g4.f3237V, iA, K.F(-9223372036854775807L))).b();
        g4.s1(d0VarD1, 0, (g4.f3264q0.f3426b.a.equals(d0VarD1.f3426b.a) || g4.f3264q0.a.p()) ? false : true, 4, g4.T0(d0VarD1), -1, false);
        g4.h1();
        g4.u1();
        g4.r1(1, true);
        return O3.C.a;
    }
}
