package s3;

import O.Z;
import com.kusukanime.data.StreamItem;

/* renamed from: s3.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1990G extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15563k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f15564l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f15565m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f15566n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1990G(Z z7, Z z8, Z z9, S3.c cVar) {
        super(2, cVar);
        this.f15564l = z7;
        this.f15565m = z8;
        this.f15566n = z9;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1990G(this.f15564l, this.f15565m, this.f15566n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1990G) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15563k;
        Z z7 = this.f15566n;
        if (i7 == 0) {
            P3.r.Y(obj);
            StreamItem streamItem = (StreamItem) this.f15564l.getValue();
            if ((streamItem != null ? streamItem.getUrl() : null) != null) {
                this.f15565m.setValue(Boolean.FALSE);
            }
            if (((Boolean) z7.getValue()).booleanValue()) {
                this.f15563k = 1;
                if (H5.D.k(5000L, this) == aVar) {
                    return aVar;
                }
            }
            return O3.C.a;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        P3.r.Y(obj);
        z7.setValue(Boolean.FALSE);
        return O3.C.a;
    }
}
