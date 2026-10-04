package s3;

import O.Z;
import com.kusukanime.data.HistoryRow;
import com.kusukanime.data.SbClient;
import com.kusukanime.data.UserRepo;
import java.util.Iterator;

/* renamed from: s3.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1985B extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15536k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserRepo f15537l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f15538m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f15539n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1985B(UserRepo userRepo, String str, Z z7, S3.c cVar) {
        super(2, cVar);
        this.f15537l = userRepo;
        this.f15538m = str;
        this.f15539n = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1985B(this.f15537l, this.f15538m, this.f15539n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1985B) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f15536k;
        if (i7 == 0) {
            P3.r.Y(obj);
            if (SbClient.INSTANCE.ready()) {
                UserRepo userRepo = this.f15537l;
                this.f15536k = 1;
                obj = userRepo.history(50, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return O3.C.a;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        P3.r.Y(obj);
        String str = this.f15538m;
        Iterator it = ((Iterable) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.l.a(((HistoryRow) next).getEpisode_slug(), str)) {
                break;
            }
        }
        HistoryRow historyRow = (HistoryRow) next;
        if (historyRow != null) {
            Z z7 = this.f15539n;
            long position_ms = historyRow.getPosition_ms();
            long duration_ms = historyRow.getDuration_ms();
            if (position_ms > 15000 && (duration_ms <= 0 || position_ms < duration_ms - 60000)) {
                z7.setValue(Long.valueOf(position_ms));
            }
        }
        return O3.C.a;
    }
}
