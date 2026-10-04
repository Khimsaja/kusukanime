package K3;

import e4.k;
import io.github.jan.supabase.auth.UrlUtilsKt;
import io.github.jan.supabase.collections.AtomicMutableMap;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4698k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Map f4699l;

    public /* synthetic */ c(Map map, int i7) {
        this.f4698k = i7;
        this.f4699l = map;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f4698k) {
            case 0:
                return AtomicMutableMap.putAll$lambda$0(this.f4699l, (D5.c) obj);
            default:
                return UrlUtilsKt.parseFragmentAndImportSession$lambda$2(this.f4699l, (String) obj);
        }
    }
}
