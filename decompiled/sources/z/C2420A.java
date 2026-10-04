package z;

import O.C0485c0;
import O.C0487d0;
import O1.C0541o;
import s.InterfaceC1911e0;
import y.C2301A;
import y0.C2349D;

/* renamed from: z.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2420A extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f18393k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2425d f18394l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f18395m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2420A(C2425d c2425d, int i7, S3.c cVar) {
        super(2, cVar);
        this.f18394l = c2425d;
        this.f18395m = i7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C2420A(this.f18394l, this.f18395m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2420A) create((InterfaceC1911e0) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f18393k;
        C2425d c2425d = this.f18394l;
        O3.C c2 = O3.C.a;
        if (i7 == 0) {
            P3.r.Y(obj);
            this.f18393k = 1;
            Object objH = c2425d.f18424v.h(this);
            if (objH != aVar) {
                objH = c2;
            }
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        double d4 = 0.0f;
        if (-0.5d > d4 || d4 > 0.5d) {
            throw new IllegalArgumentException("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5".toString());
        }
        int i8 = c2425d.i(this.f18395m);
        C0541o c0541o = c2425d.f18405c;
        ((C0487d0) c0541o.f7469c).g(i8);
        ((C2301A) c0541o.f7472f).a(i8);
        ((C0485c0) c0541o.f7470d).g(0.0f);
        c0541o.f7471e = null;
        C2349D c2349d = (C2349D) c2425d.f18425w.getValue();
        if (c2349d != null) {
            c2349d.k();
        }
        return c2;
    }
}
