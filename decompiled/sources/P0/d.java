package P0;

import O3.C;
import e4.InterfaceC0821a;
import h0.AbstractC0971P;
import h0.AbstractC0993p;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import y0.K;
import y0.O;

/* loaded from: classes.dex */
public final class d extends m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7704l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f7705m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f7706n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7, long j7, Object obj) {
        super(0);
        this.f7704l = i7;
        this.f7706n = obj;
        this.f7705m = j7;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f7704l) {
            case 0:
                return ((AbstractC0971P) ((AbstractC0993p) this.f7706n)).b(this.f7705m);
            default:
                O oN0 = ((K) this.f7706n).a().N0();
                l.c(oN0);
                oN0.b(this.f7705m);
                return C.a;
        }
    }
}
