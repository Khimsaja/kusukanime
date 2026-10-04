package w3;

import O.Z;
import O3.C;
import e4.InterfaceC0821a;
import io.ktor.util.GzipHeaderFlags;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17025k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f17026l;

    public /* synthetic */ m(int i7, Z z7) {
        this.f17025k = i7;
        this.f17026l = z7;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f17025k) {
            case 0:
                this.f17026l.setValue(Boolean.FALSE);
                break;
            case 1:
                this.f17026l.setValue(Boolean.FALSE);
                break;
            case 2:
                this.f17026l.setValue(Boolean.FALSE);
                break;
            case 3:
                this.f17026l.setValue(Boolean.FALSE);
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                this.f17026l.setValue(Boolean.FALSE);
                break;
            case 5:
                this.f17026l.setValue(Boolean.TRUE);
                break;
            case 6:
                this.f17026l.setValue(Boolean.TRUE);
                break;
            case 7:
                this.f17026l.setValue(Boolean.FALSE);
                break;
            case 8:
                break;
            case 9:
                this.f17026l.setValue(Boolean.FALSE);
                break;
            default:
                this.f17026l.setValue(Boolean.TRUE);
                break;
        }
        return C.a;
    }
}
