package G2;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2736l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Bundle f2737m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i7, Bundle bundle) {
        super(1);
        this.f2736l = i7;
        this.f2737m = bundle;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f2736l) {
            case 0:
                kotlin.jvm.internal.l.f("argName", (String) obj);
                return Boolean.valueOf(!this.f2737m.containsKey(r2));
            default:
                kotlin.jvm.internal.l.f("key", (String) obj);
                return Boolean.valueOf(!this.f2737m.containsKey(r2));
        }
    }
}
