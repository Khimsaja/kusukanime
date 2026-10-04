package w3;

import H5.A;
import K5.Y;
import O3.C;
import com.kusukanime.data.UserRepo;
import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class v extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f17063k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y f17064l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f17065m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, InterfaceC0821a interfaceC0821a, S3.c cVar) {
        super(2, cVar);
        this.f17064l = yVar;
        this.f17065m = interfaceC0821a;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new v(this.f17064l, this.f17065m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f17063k;
        y yVar = this.f17064l;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                UserRepo userRepo = yVar.f17090r;
                this.f17063k = 1;
                if (userRepo.clearHistory(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P3.r.Y(obj);
            }
            Y y7 = yVar.f17078f;
            P3.y yVar2 = P3.y.f7779k;
            y7.getClass();
            y7.i(null, yVar2);
        } catch (Exception unused) {
        }
        this.f17065m.invoke();
        return C.a;
    }
}
