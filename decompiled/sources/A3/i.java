package A3;

import O.Z;
import O3.C;
import com.kusukanime.data.StreamItem;
import io.ktor.util.GzipHeaderFlags;
import java.util.List;
import p.C1724K;
import s3.T;
import w.C2165f;
import x.C2233g;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f149k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f150l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e4.k f151m;

    public /* synthetic */ i(Z z7, e4.k kVar, int i7) {
        this.f149k = i7;
        this.f150l = z7;
        this.f151m = kVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f149k) {
            case 0:
                C2165f c2165f = (C2165f) obj;
                kotlin.jvm.internal.l.f("$this$LazyRow", c2165f);
                List list = (List) this.f150l.getValue();
                c2165f.x0(list.size(), null, new u(1, list), new W.a(true, -632812321, new w(list, this.f151m, 0)));
                break;
            case 1:
                C2165f c2165f2 = (C2165f) obj;
                kotlin.jvm.internal.l.f("$this$LazyColumn", c2165f2);
                List list2 = (List) this.f150l.getValue();
                c2165f2.x0(list2.size(), new C1724K(8, new io.ktor.network.sockets.b(26), list2), new u(3, list2), new W.a(true, -632812321, new w(list2, this.f151m, 1)));
                break;
            case 2:
                String str = (String) obj;
                kotlin.jvm.internal.l.f("it", str);
                this.f150l.setValue(Boolean.FALSE);
                this.f151m.invoke(str);
                break;
            case 3:
                C2233g c2233g = (C2233g) obj;
                kotlin.jvm.internal.l.f("$this$LazyVerticalGrid", c2233g);
                List list3 = (List) this.f150l.getValue();
                c2233g.w0(list3.size(), new C1724K(18, new T(3), list3), new u(8, list3), new W.a(true, 699646206, new w(list3, this.f151m, 3)));
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                C2165f c2165f3 = (C2165f) obj;
                kotlin.jvm.internal.l.f("$this$LazyColumn", c2165f3);
                List list4 = (List) this.f150l.getValue();
                c2165f3.x0(list4.size(), new C1724K(19, new T(4), list4), new u(9, list4), new W.a(true, -632812321, new w(list4, this.f151m, 4)));
                break;
            default:
                StreamItem streamItem = (StreamItem) obj;
                kotlin.jvm.internal.l.f("it", streamItem);
                this.f150l.setValue(Boolean.FALSE);
                this.f151m.invoke(streamItem);
                break;
        }
        return C.a;
    }

    public /* synthetic */ i(e4.k kVar, Z z7, int i7) {
        this.f149k = i7;
        this.f151m = kVar;
        this.f150l = z7;
    }
}
