package t3;

import H5.A;
import K5.Y;
import O3.C;
import P3.q;
import P3.r;
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
public final class o extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f16018k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f16019l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f16020m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f16021n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, Context context, String str, S3.c cVar) {
        super(2, cVar);
        this.f16019l = pVar;
        this.f16020m = context;
        this.f16021n = str;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new o(this.f16019l, this.f16020m, this.f16021n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f16018k;
        p pVar = this.f16019l;
        try {
            if (i7 == 0) {
                r.Y(obj);
                Y y7 = pVar.f16028h;
                Boolean bool = Boolean.TRUE;
                y7.getClass();
                y7.i(null, bool);
                KusuApi kusuApi = ApiClient.INSTANCE.get(this.f16020m);
                String str = this.f16021n;
                int i8 = pVar.f16031k;
                this.f16018k = 1;
                obj = kusuApi.genreDetail(str, i8, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
            ApiEnvelope apiEnvelope = (ApiEnvelope) obj;
            if (((List) apiEnvelope.getData()).isEmpty()) {
                pVar.f16032l = true;
            } else {
                Y y8 = pVar.f16024d;
                Y y9 = pVar.f16024d;
                ArrayList arrayListG0 = q.G0((Collection) y8.getValue(), (Iterable) apiEnvelope.getData());
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
                    pVar.f16032l = true;
                } else {
                    y9.getClass();
                    y9.i(null, arrayList);
                    int i9 = pVar.f16031k;
                    pVar.f16031k = i9 + 1;
                    new Integer(i9);
                }
            }
        } catch (Exception unused) {
        }
        Y y10 = pVar.f16028h;
        Boolean bool2 = Boolean.FALSE;
        y10.getClass();
        y10.i(null, bool2);
        return C.a;
    }
}
