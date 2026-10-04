package B;

import O3.C;
import d.C0771e;
import e4.InterfaceC0821a;
import e4.k;
import kotlin.jvm.internal.m;

/* loaded from: classes.dex */
public final class d extends m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f267l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f268m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f269n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(boolean z7, int i7, Object obj) {
        super(0);
        this.f267l = i7;
        this.f269n = obj;
        this.f268m = z7;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [e4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r0v7, types: [e4.a, kotlin.jvm.internal.j] */
    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f267l) {
            case 0:
                ((k) this.f269n).invoke(Boolean.valueOf(!this.f268m));
                break;
            case 1:
                C0771e c0771e = (C0771e) this.f269n;
                c0771e.a = this.f268m;
                ?? r02 = c0771e.f11094c;
                if (r02 != 0) {
                    r02.invoke();
                }
                break;
            default:
                if (this.f268m) {
                    ((m) this.f269n).invoke();
                }
                break;
        }
        return C.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(boolean z7, InterfaceC0821a interfaceC0821a) {
        super(0);
        this.f267l = 2;
        this.f268m = z7;
        this.f269n = (m) interfaceC0821a;
    }
}
