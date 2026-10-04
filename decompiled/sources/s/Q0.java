package s;

import s0.C1953A;
import s0.EnumC1964i;

/* loaded from: classes.dex */
public final class Q0 extends U3.i implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15205k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15206l;

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        Q0 q02 = new Q0(2, cVar);
        q02.f15206l = obj;
        return q02;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((Q0) create((C1953A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15205k;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
            return obj;
        }
        P3.r.Y(obj);
        C1953A c1953a = (C1953A) this.f15206l;
        this.f15205k = 1;
        Object objE = c1.e(c1953a, EnumC1964i.f15462l, this);
        return objE == aVar ? aVar : objE;
    }
}
