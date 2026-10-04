package u3;

import com.kusukanime.data.HistoryRow;
import e4.InterfaceC0821a;

/* renamed from: u3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2080e implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16264k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ HistoryRow f16265l;

    public /* synthetic */ C2080e(HistoryRow historyRow, int i7) {
        this.f16264k = i7;
        this.f16265l = historyRow;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f16264k) {
            case 0:
                HistoryRow historyRow = this.f16265l;
                return Float.valueOf(e3.c.j(historyRow.getPosition_ms() / historyRow.getDuration_ms(), 0.0f, 1.0f));
            default:
                HistoryRow historyRow2 = this.f16265l;
                return Float.valueOf(e3.c.j(historyRow2.getPosition_ms() / historyRow2.getDuration_ms(), 0.0f, 1.0f));
        }
    }
}
