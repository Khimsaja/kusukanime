package B3;

import K5.Y;
import com.kusukanime.data.SessionGate;

/* loaded from: classes.dex */
public final class B extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public Y f422k;

    /* renamed from: l, reason: collision with root package name */
    public int f423l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C f424m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C c2, S3.c cVar) {
        super(2, cVar);
        this.f424m = c2;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new B(this.f424m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Y y7;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f423l;
        C c2 = this.f424m;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                Y y8 = c2.f431h;
                SessionGate sessionGate = SessionGate.INSTANCE;
                this.f422k = y8;
                this.f423l = 1;
                Object objEnsure = sessionGate.ensure(this);
                if (objEnsure == aVar) {
                    return aVar;
                }
                y7 = y8;
                obj = objEnsure;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7 = this.f422k;
                P3.r.Y(obj);
            }
            y7.h(obj);
        } catch (Exception unused) {
            Y y9 = c2.f431h;
            Boolean bool = Boolean.FALSE;
            y9.getClass();
            y9.i(null, bool);
        }
        return O3.C.a;
    }
}
