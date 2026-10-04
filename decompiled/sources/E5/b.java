package E5;

import e4.k;
import io.github.jan.supabase.collections.AtomicMutableList;
import io.ktor.util.GzipHeaderFlags;
import java.util.Collection;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1951k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Collection f1952l;

    public /* synthetic */ b(int i7, Collection collection) {
        this.f1951k = i7;
        this.f1952l = collection;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f1951k) {
            case 0:
                return Boolean.valueOf(!this.f1952l.contains(obj));
            case 1:
                return Boolean.valueOf(this.f1952l.contains(obj));
            case 2:
                return Boolean.valueOf(this.f1952l.contains(obj));
            case 3:
                return AtomicMutableList.retainAll$lambda$0(this.f1952l, (D5.b) obj);
            case GzipHeaderFlags.EXTRA /* 4 */:
                return AtomicMutableList.addAll$lambda$0(this.f1952l, (D5.b) obj);
            default:
                return AtomicMutableList.removeAll$lambda$0(this.f1952l, (D5.b) obj);
        }
    }
}
