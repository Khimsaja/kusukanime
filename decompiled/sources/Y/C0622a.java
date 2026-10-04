package Y;

import O3.C;

/* renamed from: Y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0622a extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9959l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f9960m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0622a(int i7, Object obj) {
        super(1);
        this.f9959l = i7;
        this.f9960m = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f9959l) {
            case 0:
                ?? r02 = this.f9960m;
                int size = r02.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((e4.k) r02.get(i7)).invoke(obj);
                }
                return C.a;
            default:
                return Boolean.valueOf(kotlin.jvm.internal.l.a(obj, this.f9960m));
        }
    }
}
