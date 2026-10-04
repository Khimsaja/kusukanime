package v3;

import H5.A;
import K5.Y;
import O3.C;
import android.content.Context;
import com.kusukanime.data.ApiClient;
import com.kusukanime.data.ApiEnvelope;
import com.kusukanime.data.KusuApi;
import com.kusukanime.data.ScheduleDay;
import com.kusukanime.data.ScheduleItem;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final class t extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f16591k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f16592l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f16593m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(S3.c cVar, Context context, z zVar) {
        super(2, cVar);
        this.f16592l = context;
        this.f16593m = zVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new t(cVar, this.f16592l, this.f16593m);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        List listP0;
        List<ScheduleItem> items;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f16591k;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                KusuApi kusuApi = ApiClient.INSTANCE.get(this.f16592l);
                this.f16591k = 1;
                obj = kusuApi.schedule(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P3.r.Y(obj);
            }
            List list = (List) ((ApiEnvelope) obj).getData();
            String str = new SimpleDateFormat("EEEE", new Locale("id", "ID")).format(new Date());
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC2517v.M(((ScheduleDay) next).getDay(), str, true)) {
                    break;
                }
            }
            ScheduleDay scheduleDay = (ScheduleDay) next;
            if (scheduleDay == null) {
                scheduleDay = (ScheduleDay) P3.q.t0(list);
            }
            Y y7 = this.f16593m.f16631s;
            if (scheduleDay == null || (items = scheduleDay.getItems()) == null) {
                listP0 = null;
            } else {
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : items) {
                    if (hashSet.add(((ScheduleItem) obj2).getSlug())) {
                        arrayList.add(obj2);
                    }
                }
                listP0 = P3.q.P0(arrayList, 10);
            }
            if (listP0 == null) {
                listP0 = P3.y.f7779k;
            }
            y7.getClass();
            y7.i(null, listP0);
        } catch (Exception unused) {
        }
        return C.a;
    }
}
