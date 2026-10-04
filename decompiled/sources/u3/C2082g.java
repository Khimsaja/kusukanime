package u3;

import H5.A;
import K5.Y;
import O3.C;
import P3.r;
import P3.y;
import U3.j;
import com.kusukanime.data.UserRepo;
import e4.InterfaceC0821a;
import e4.n;

/* renamed from: u3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2082g extends j implements n {

    /* renamed from: k, reason: collision with root package name */
    public int f16268k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2084i f16269l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f16270m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2082g(C2084i c2084i, InterfaceC0821a interfaceC0821a, S3.c cVar) {
        super(2, cVar);
        this.f16269l = c2084i;
        this.f16270m = interfaceC0821a;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C2082g(this.f16269l, this.f16270m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2082g) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f16268k;
        C2084i c2084i = this.f16269l;
        try {
            if (i7 == 0) {
                r.Y(obj);
                UserRepo userRepo = c2084i.f16282j;
                this.f16268k = 1;
                if (userRepo.clearHistory(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
            Y y7 = c2084i.f16274b;
            y yVar = y.f7779k;
            y7.getClass();
            y7.i(null, yVar);
        } catch (Throwable unused) {
        }
        this.f16270m.invoke();
        return C.a;
    }
}
