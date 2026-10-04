package X;

import java.util.Map;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: m, reason: collision with root package name */
    public static final e f9679m = new e(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final e f9680n = new e(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9681l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i7, int i8) {
        super(i7);
        this.f9681l = i8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f9681l) {
            case 0:
                return new g((Map) obj);
            default:
                return obj;
        }
    }
}
