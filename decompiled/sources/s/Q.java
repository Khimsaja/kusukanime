package s;

/* loaded from: classes.dex */
public final class Q extends U3.j implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15204k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(int i7, S3.c cVar, int i8) {
        super(i7, cVar);
        this.f15204k = i8;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        switch (this.f15204k) {
            case 0:
                long j7 = ((g0.c) obj2).a;
                Q q6 = new Q(3, (S3.c) obj3, 0);
                O3.C c2 = O3.C.a;
                q6.invokeSuspend(c2);
                return c2;
            case 1:
                ((Number) obj2).floatValue();
                Q q7 = new Q(3, (S3.c) obj3, 1);
                O3.C c4 = O3.C.a;
                q7.invokeSuspend(c4);
                return c4;
            default:
                long j8 = ((g0.c) obj2).a;
                Q q8 = new Q(3, (S3.c) obj3, 2);
                O3.C c6 = O3.C.a;
                q8.invokeSuspend(c6);
                return c6;
        }
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        O3.C c2 = O3.C.a;
        switch (this.f15204k) {
            case 0:
                T3.a aVar = T3.a.f9048k;
                P3.r.Y(obj);
                break;
            case 1:
                T3.a aVar2 = T3.a.f9048k;
                P3.r.Y(obj);
                break;
            default:
                T3.a aVar3 = T3.a.f9048k;
                P3.r.Y(obj);
                break;
        }
        return c2;
    }
}
