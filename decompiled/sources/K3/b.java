package K3;

import S5.n;
import e4.k;
import io.github.jan.supabase.collections.AtomicMutableList;
import io.ktor.websocket.RawWebSocketCommonKt;
import java.util.Collection;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4695k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4696l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f4697m;

    public /* synthetic */ b(int i7, int i8, Object obj) {
        this.f4695k = i8;
        this.f4696l = i7;
        this.f4697m = obj;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f4695k) {
            case 0:
                return AtomicMutableList.addAll$lambda$1(this.f4696l, (Collection) this.f4697m, (D5.b) obj);
            case 1:
                return AtomicMutableList.add$lambda$0(this.f4696l, this.f4697m, (D5.b) obj);
            default:
                return RawWebSocketCommonKt.mask$lambda$2(this.f4696l, (n) this.f4697m, (byte[]) obj);
        }
    }
}
