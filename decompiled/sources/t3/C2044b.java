package t3;

import A3.u;
import A3.w;
import O3.C;
import java.util.List;
import p.C1724K;
import s3.T;
import w.C2165f;

/* renamed from: t3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2044b implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15975k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f15976l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e4.k f15977m;

    public /* synthetic */ C2044b(List list, e4.k kVar, int i7) {
        this.f15975k = i7;
        this.f15976l = list;
        this.f15977m = kVar;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        C2165f c2165f = (C2165f) obj;
        switch (this.f15975k) {
            case 0:
                kotlin.jvm.internal.l.f("$this$LazyColumn", c2165f);
                T t7 = new T(1);
                List list = this.f15976l;
                c2165f.x0(list.size(), new C1724K(16, t7, list), new u(6, list), new W.a(true, -632812321, new w(list, this.f15977m, 2)));
                break;
            case 1:
                kotlin.jvm.internal.l.f("$this$LazyRow", c2165f);
                T t8 = new T(6);
                List list2 = this.f15976l;
                c2165f.x0(list2.size(), new C1724K(22, t8, list2), new u(11, list2), new W.a(true, -632812321, new w(list2, this.f15977m, 6)));
                break;
            case 2:
                kotlin.jvm.internal.l.f("$this$LazyRow", c2165f);
                T t9 = new T(8);
                List list3 = this.f15976l;
                c2165f.x0(list3.size(), new C1724K(23, t9, list3), new u(12, list3), new W.a(true, -632812321, new w(list3, this.f15977m, 7)));
                break;
            case 3:
                kotlin.jvm.internal.l.f("$this$LazyRow", c2165f);
                T t10 = new T(5);
                List list4 = this.f15976l;
                c2165f.x0(list4.size(), new C1724K(21, t10, list4), new u(10, list4), new W.a(true, -632812321, new w(list4, this.f15977m, 5)));
                break;
            default:
                kotlin.jvm.internal.l.f("$this$LazyRow", c2165f);
                T t11 = new T(9);
                List list5 = this.f15976l;
                c2165f.x0(list5.size(), new C1724K(25, t11, list5), new u(14, list5), new W.a(true, -632812321, new w(list5, this.f15977m, 9)));
                break;
        }
        return C.a;
    }
}
