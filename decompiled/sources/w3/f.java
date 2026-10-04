package w3;

import H5.A;
import O.Z;
import O3.C;
import com.kusukanime.data.ProfileRow;

/* loaded from: classes.dex */
public final class f extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Z f16965k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e4.k f16966l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Z z7, e4.k kVar, S3.c cVar) {
        super(2, cVar);
        this.f16965k = z7;
        this.f16966l = kVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new f(this.f16965k, this.f16966l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        f fVar = (f) create((A) obj, (S3.c) obj2);
        C c2 = C.a;
        fVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        ProfileRow profileRow = (ProfileRow) this.f16965k.getValue();
        if (profileRow != null) {
            this.f16966l.invoke(profileRow);
        }
        return C.a;
    }
}
