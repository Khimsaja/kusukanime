package f6;

import e4.InterfaceC0821a;
import java.util.List;

/* renamed from: f6.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0918p extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11591l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f11592m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0918p(int i7, List list) {
        super(0);
        this.f11591l = i7;
        this.f11592m = list;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f11591l) {
            case 0:
                return this.f11592m;
            default:
                Object obj = this.f11592m.get(2);
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Int", obj);
                return (Integer) obj;
        }
    }
}
