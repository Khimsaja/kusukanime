package v3;

import H5.A;
import K5.Y;
import O3.C;
import android.content.Context;
import com.kusukanime.data.AnimeItem;
import com.kusukanime.data.ApiClient;
import com.kusukanime.data.ApiEnvelope;
import com.kusukanime.data.KusuApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class s extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f16588k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f16589l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f16590m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(S3.c cVar, Context context, z zVar) {
        super(2, cVar);
        this.f16589l = zVar;
        this.f16590m = context;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new s(cVar, this.f16590m, this.f16589l);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f16588k;
        z zVar = this.f16589l;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                Y y7 = zVar.f16616d;
                Boolean bool = Boolean.TRUE;
                y7.getClass();
                y7.i(null, bool);
                zVar.f16618f.h(null);
                KusuApi kusuApi = ApiClient.INSTANCE.get(this.f16590m);
                int i8 = zVar.f16620h;
                this.f16588k = 1;
                obj = kusuApi.listAnime(i8, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P3.r.Y(obj);
            }
            ApiEnvelope apiEnvelope = (ApiEnvelope) obj;
            if (((List) apiEnvelope.getData()).isEmpty()) {
                zVar.f16621i = true;
            } else {
                Y y8 = zVar.f16614b;
                Y y9 = zVar.f16614b;
                ArrayList arrayListG0 = P3.q.G0((Collection) y8.getValue(), (Iterable) apiEnvelope.getData());
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListG0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (hashSet.add(((AnimeItem) next).getSlug())) {
                        arrayList.add(next);
                    }
                }
                if (arrayList.size() == ((List) y9.getValue()).size()) {
                    zVar.f16621i = true;
                } else {
                    y9.getClass();
                    y9.i(null, arrayList);
                    int i9 = zVar.f16620h;
                    zVar.f16620h = i9 + 1;
                    new Integer(i9);
                }
            }
        } catch (Exception e7) {
            zVar.f16618f.h("Gagal muat: " + e7.getMessage());
        }
        Y y10 = zVar.f16616d;
        Boolean bool2 = Boolean.FALSE;
        y10.getClass();
        y10.i(null, bool2);
        return C.a;
    }
}
