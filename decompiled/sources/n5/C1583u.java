package n5;

import r4.AbstractC1886o;

/* renamed from: n5.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1583u implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public static final C1583u f13414l = new C1583u(0);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13415k;

    public /* synthetic */ C1583u(int i7) {
        this.f13415k = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f13415k) {
            case 0:
                AbstractC1586x abstractC1586x = (AbstractC1586x) obj;
                kotlin.jvm.internal.l.f("it", abstractC1586x);
                return abstractC1586x.toString();
            default:
                if (((W4.c) obj) != null) {
                    return Boolean.valueOf(!r2.equals(AbstractC1886o.f15017y));
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
        }
    }
}
