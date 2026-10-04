package u3;

import O3.C;
import com.kusukanime.data.HistoryRow;
import e4.InterfaceC0821a;
import e4.k;

/* renamed from: u3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2079d implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16261k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f16262l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ HistoryRow f16263m;

    public /* synthetic */ C2079d(k kVar, HistoryRow historyRow, int i7) {
        this.f16261k = i7;
        this.f16262l = kVar;
        this.f16263m = historyRow;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f16261k) {
            case 0:
                this.f16262l.invoke(this.f16263m.getEpisode_slug());
                break;
            default:
                this.f16262l.invoke(this.f16263m.getEpisode_slug());
                break;
        }
        return C.a;
    }
}
