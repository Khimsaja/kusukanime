package S2;

import H5.A;
import O3.C;
import P3.r;
import android.graphics.Bitmap;
import d3.C0797i;
import e4.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k extends U3.j implements n {

    /* renamed from: k, reason: collision with root package name */
    public int f8750k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0797i f8751l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f8752m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e3.h f8753n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c f8754o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Bitmap f8755p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C0797i c0797i, m mVar, e3.h hVar, c cVar, Bitmap bitmap, S3.c cVar2) {
        super(2, cVar2);
        this.f8751l = c0797i;
        this.f8752m = mVar;
        this.f8753n = hVar;
        this.f8754o = cVar;
        this.f8755p = bitmap;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new k(this.f8751l, this.f8752m, this.f8753n, this.f8754o, this.f8755p, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f8750k;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
            return obj;
        }
        r.Y(obj);
        ArrayList arrayList = this.f8752m.f8763h;
        boolean z7 = this.f8755p != null;
        C0797i c0797i = this.f8751l;
        Y2.j jVar = new Y2.j(c0797i, arrayList, 0, c0797i, this.f8753n, this.f8754o, z7);
        this.f8750k = 1;
        Object objB = jVar.b(c0797i, this);
        return objB == aVar ? aVar : objB;
    }
}
