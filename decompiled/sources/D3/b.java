package D3;

import O.C0486d;
import O.C0510p;
import O3.C;
import com.kusukanime.data.UserRepo;
import e4.InterfaceC0821a;
import s3.AbstractC1994a;
import v3.AbstractC2152b;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1427k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1428l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1429m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1430n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1431o;

    public /* synthetic */ b(int i7, Integer num, Integer num2, e4.k kVar, int i8) {
        this.f1427k = 3;
        this.f1430n = i7;
        this.f1428l = num;
        this.f1429m = num2;
        this.f1431o = kVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1427k) {
            case 0:
                ((Integer) obj2).getClass();
                int iV = C0486d.V(this.f1430n | 1);
                InterfaceC0821a interfaceC0821a = (InterfaceC0821a) this.f1429m;
                a0.q qVar = (a0.q) this.f1431o;
                f.d((String) this.f1428l, interfaceC0821a, qVar, (C0510p) obj, iV);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iV2 = C0486d.V(this.f1430n | 1);
                AbstractC1994a.i((String) this.f1428l, (InterfaceC0821a) this.f1429m, (e4.k) this.f1431o, (C0510p) obj, iV2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iV3 = C0486d.V(this.f1430n | 1);
                AbstractC1994a.b((String) this.f1428l, (InterfaceC0821a) this.f1429m, (UserRepo) this.f1431o, (C0510p) obj, iV3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iV4 = C0486d.V(1);
                Integer num = (Integer) this.f1428l;
                Integer num2 = (Integer) this.f1429m;
                e4.k kVar = (e4.k) this.f1431o;
                AbstractC1994a.m(this.f1430n, num, num2, kVar, (C0510p) obj, iV4);
                break;
            default:
                ((Integer) obj2).intValue();
                int iV5 = C0486d.V(this.f1430n | 1);
                AbstractC2152b.f((String) this.f1428l, (String) this.f1431o, (InterfaceC0821a) this.f1429m, (C0510p) obj, iV5);
                break;
        }
        return C.a;
    }

    public /* synthetic */ b(String str, InterfaceC0821a interfaceC0821a, Object obj, int i7, int i8) {
        this.f1427k = i8;
        this.f1428l = str;
        this.f1429m = interfaceC0821a;
        this.f1431o = obj;
        this.f1430n = i7;
    }

    public /* synthetic */ b(String str, String str2, InterfaceC0821a interfaceC0821a, int i7) {
        this.f1427k = 4;
        this.f1428l = str;
        this.f1431o = str2;
        this.f1429m = interfaceC0821a;
        this.f1430n = i7;
    }
}
