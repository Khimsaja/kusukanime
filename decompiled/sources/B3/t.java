package B3;

import O.C0486d;
import O.C0510p;
import e4.InterfaceC0821a;
import io.ktor.util.StringValuesBuilder;
import io.ktor.util.StringValuesKt;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f527k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f528l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f529m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ O3.e f530n;

    public /* synthetic */ t(String str, boolean z7, InterfaceC0821a interfaceC0821a, int i7) {
        this.f529m = str;
        this.f528l = z7;
        this.f530n = interfaceC0821a;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f527k) {
            case 0:
                ((Integer) obj2).getClass();
                int iV = C0486d.V(1);
                boolean z7 = this.f528l;
                InterfaceC0821a interfaceC0821a = (InterfaceC0821a) this.f530n;
                AbstractC0025a.a((String) this.f529m, z7, interfaceC0821a, (C0510p) obj, iV);
                return O3.C.a;
            default:
                StringValuesBuilder stringValuesBuilder = (StringValuesBuilder) this.f529m;
                e4.n nVar = (e4.n) this.f530n;
                return StringValuesKt.appendFiltered$lambda$10(this.f528l, stringValuesBuilder, nVar, (String) obj, (List) obj2);
        }
    }

    public /* synthetic */ t(boolean z7, StringValuesBuilder stringValuesBuilder, e4.n nVar) {
        this.f528l = z7;
        this.f529m = stringValuesBuilder;
        this.f530n = nVar;
    }
}
