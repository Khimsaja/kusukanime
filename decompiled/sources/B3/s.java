package B3;

import O.Z;
import com.kusukanime.data.OtaCheck;
import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f524k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e4.k f525l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f526m;

    public /* synthetic */ s(e4.k kVar, Z z7, int i7) {
        this.f524k = i7;
        this.f525l = kVar;
        this.f526m = z7;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f524k) {
            case 0:
                OtaCheck otaCheck = (OtaCheck) this.f526m.getValue();
                kotlin.jvm.internal.l.c(otaCheck);
                this.f525l.invoke(otaCheck);
                break;
            default:
                OtaCheck otaCheck2 = (OtaCheck) this.f526m.getValue();
                kotlin.jvm.internal.l.c(otaCheck2);
                this.f525l.invoke(otaCheck2);
                break;
        }
        return O3.C.a;
    }
}
