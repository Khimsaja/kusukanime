package C2;

import B1.InterfaceC0021h;
import H1.C0226g;
import V1.AbstractC0597b;
import V1.InterfaceC0601f;
import io.ktor.util.GzipHeaderFlags;
import j3.X;
import java.util.List;
import s2.C1973a;
import y1.C2393o;
import y1.Q;
import y1.V;

/* loaded from: classes.dex */
public final /* synthetic */ class G implements C1.v, B1.n, M1.y, Q1.n, InterfaceC0601f, InterfaceC0021h, v6.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f663k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f664l;

    public /* synthetic */ G(int i7, Object obj) {
        this.f663k = i7;
        this.f664l = obj;
    }

    @Override // C1.v
    public void a(long j7, B1.B b4) {
        AbstractC0597b.d(j7, b4, (V1.G[]) ((B2.l) this.f664l).f417m);
    }

    @Override // Q1.n
    public X b(int i7, Q q6, int[] iArr) {
        j3.D dR = j3.G.r();
        int i8 = 0;
        while (i8 < q6.a) {
            int i9 = i7;
            Q q7 = q6;
            dR.a(new Q1.g(i9, q7, i8, (Q1.j) this.f664l, iArr[i8]));
            i8++;
            i7 = i9;
            q6 = q7;
        }
        return dR.f();
    }

    @Override // B1.InterfaceC0021h
    public void c(Object obj) {
        ((j3.D) this.f664l).a((C1973a) obj);
    }

    @Override // V1.InterfaceC0601f
    public long d(long j7) {
        return B1.K.i((j7 * r0.f9409e) / 1000000, 0L, ((V1.t) this.f664l).f9414j - 1);
    }

    @Override // M1.y
    public int e(Object obj) {
        M1.p pVar = (M1.p) obj;
        pVar.getClass();
        C2393o c2393o = (C2393o) this.f664l;
        String str = c2393o.f18112n;
        String str2 = pVar.f6462b;
        return ((str2.equals(str) || str2.equals(M1.z.b(c2393o))) && pVar.c(c2393o, false) && pVar.d(c2393o)) ? 1 : 0;
    }

    public void f() {
        kotlin.jvm.internal.m mVar = (kotlin.jvm.internal.m) this.f664l;
        synchronized (Y.o.f10002b) {
            Y.o.f10007g = P3.q.D0((List) Y.o.f10007g, mVar);
        }
    }

    @Override // B1.n
    public void invoke(Object obj) {
        switch (this.f663k) {
            case 1:
                ((y1.J) obj).v((y1.A) this.f664l);
                break;
            case 2:
                ((y1.J) obj).h((V) this.f664l);
                break;
            case 3:
                ((y1.J) obj).f((A1.c) this.f664l);
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                ((y1.J) obj).v(((H1.D) this.f664l).f3212k.f3240Y);
                break;
            case 5:
                ((y1.J) obj).t((y1.C) this.f664l);
                break;
            case 6:
                ((y1.J) obj).n((List) this.f664l);
                break;
            case 7:
            default:
                ((I1.k) obj).getClass();
                break;
            case 8:
                ((I1.k) obj).f3990o = (y1.F) this.f664l;
                break;
            case 9:
                I1.k kVar = (I1.k) obj;
                int i7 = kVar.f4000y;
                C0226g c0226g = (C0226g) this.f664l;
                kVar.f4000y = i7 + c0226g.f3477g;
                kVar.f4001z += c0226g.f3475e;
                break;
        }
    }

    public /* synthetic */ G(I1.a aVar, Object obj, int i7) {
        this.f663k = i7;
        this.f664l = obj;
    }

    public /* synthetic */ G(I1.a aVar, Object obj, long j7) {
        this.f663k = 10;
        this.f664l = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ G(e4.n nVar) {
        this.f663k = 15;
        this.f664l = (kotlin.jvm.internal.m) nVar;
    }
}
