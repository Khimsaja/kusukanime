package B3;

import O.Z;
import android.content.Context;
import com.kusukanime.data.CrashLog;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class y extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Context f543k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f544l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f545m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, Z z7, Z z8, S3.c cVar) {
        super(2, cVar);
        this.f543k = context;
        this.f544l = z7;
        this.f545m = z8;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new y(this.f543k, this.f544l, this.f545m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        y yVar = (y) create((H5.A) obj, (S3.c) obj2);
        O3.C c2 = O3.C.a;
        yVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        List<File> list = CrashLog.INSTANCE.list(this.f543k);
        this.f544l.setValue(list.isEmpty() ? "(belum ada crash tercatat)" : P3.q.y0(P3.q.P0(list, 3), "\n\n---\n\n", null, null, new A3.e(8), 30));
        this.f545m.setValue(Boolean.TRUE);
        return O3.C.a;
    }
}
