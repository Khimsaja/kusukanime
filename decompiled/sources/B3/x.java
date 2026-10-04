package B3;

import O.Z;
import android.content.Context;
import com.kusukanime.data.VideoCache;

/* loaded from: classes.dex */
public final class x extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Context f541k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f542l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, Z z7, S3.c cVar) {
        super(2, cVar);
        this.f541k = context;
        this.f542l = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new x(this.f541k, this.f542l, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        x xVar = (x) create((H5.A) obj, (S3.c) obj2);
        O3.C c2 = O3.C.a;
        xVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        this.f542l.setValue(Long.valueOf(VideoCache.INSTANCE.watchCacheBytes(this.f541k)));
        return O3.C.a;
    }
}
