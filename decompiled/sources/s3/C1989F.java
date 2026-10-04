package s3;

import O.Z;
import com.kusukanime.data.StreamItem;
import java.util.Iterator;
import java.util.List;

/* renamed from: s3.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1989F extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f15560k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f15561l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f15562m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1989F(List list, Z z7, String str, S3.c cVar) {
        super(2, cVar);
        this.f15560k = list;
        this.f15561l = z7;
        this.f15562m = str;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1989F(this.f15560k, this.f15561l, this.f15562m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C1989F c1989f = (C1989F) create((H5.A) obj, (S3.c) obj2);
        O3.C c2 = O3.C.a;
        c1989f.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        T3.a aVar = T3.a.f9048k;
        P3.r.Y(obj);
        Z z7 = this.f15561l;
        if (((StreamItem) z7.getValue()) == null) {
            List list = this.f15560k;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (kotlin.jvm.internal.l.a(((StreamItem) next).getResolution(), this.f15562m)) {
                        break;
                    }
                }
                StreamItem streamItem = (StreamItem) next;
                if (streamItem == null) {
                    streamItem = (StreamItem) P3.q.r0(list);
                }
                z7.setValue(streamItem);
            }
        }
        return O3.C.a;
    }
}
