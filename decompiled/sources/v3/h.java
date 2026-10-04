package v3;

import O3.C;
import com.kusukanime.data.ScheduleItem;
import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class h implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16561k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e4.k f16562l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScheduleItem f16563m;

    public /* synthetic */ h(e4.k kVar, ScheduleItem scheduleItem, int i7) {
        this.f16561k = i7;
        this.f16562l = kVar;
        this.f16563m = scheduleItem;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f16561k) {
            case 0:
                this.f16562l.invoke(this.f16563m.getSlug());
                break;
            default:
                this.f16562l.invoke(this.f16563m.getSlug());
                break;
        }
        return C.a;
    }
}
