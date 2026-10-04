package S;

import e4.k;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.m;

/* loaded from: classes.dex */
public final class a extends m implements k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8679l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Collection f8680m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, Collection collection) {
        super(1);
        this.f8679l = i7;
        this.f8680m = collection;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f8679l) {
            case 0:
                return Boolean.valueOf(this.f8680m.contains(obj));
            case 1:
                return Boolean.valueOf(this.f8680m.contains(obj));
            default:
                return Boolean.valueOf(((List) obj).retainAll(this.f8680m));
        }
    }
}
